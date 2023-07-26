import java.util.Scanner;
public class advancedCalculator {

    static int sum(int a ,int b){
        int result= a + b ;
        System.out.println("Toplam : "+result);
        return result;
    }

    static int minus(int  a,int b){

        int result= a - b;
        System.out.println("Fark : "+ result);
        return result;
    }

    static int times(int a,int b){

        int result= a * b ;
        System.out.println("Çarpım : "+result);
        return result;

    }
    static int divided(int a,int b){
        if (b==0){

            System.out.println("Girilen Değer Sıfırdan Farklı Olmalıdır");
            return 0;
        }
        int result= a / b ;
        System.out.println("Bölüm :"+result);
        return result;

    }

    static int expNum(int a,int b){

        int result=1;
        for(int i=1;i<=b;i++){

            result *= a;
        }
        System.out.println("Sonuç : "+result);
        return result;


    }
    static int modulo(int a,int b){

        int result= a % b ;
        System.out.println("Sonuç : "+result);
        return result;
    }

    static void rectangle(int a,int b){

        int cevre=2 * (a + b);
        int alan= a * b;
        System.out.println("Dikdörtgenin Alanı: "+alan);
        System.out.println("Dikdörtgenin Çevresi: "+cevre);


    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int select;
        String menu="1-Toplama İşlemi\n"
                +"2-Çıkarma İşlemi\n"
                +"3-Çarpma İşlemi\n"
                +"4-Bölme İşlemi\n"
                +"5-Üslü Sayı Hesaplama\n"
                +"6-Mod Alma\n"
                +"7-Dikdörtgen Alan ve Çevre Hesabı\n"
                +"0-Çıkış";

        while (true){
            System.out.println(menu);
            System.out.print("Bir İşlem Seçiniz : ");
            select= input.nextInt();

            if(select==0){
                break;
            }
            System.out.println("İlk Sayıyı Giriniz");
            int a= input.nextInt();
            System.out.println("İkinci Sayıyı Giriniz");
            int b= input.nextInt();

            switch (select){

                case 1:
                    sum(a,b);
                break;

                case 2:
                    minus(a,b);
                break;

                case 3:
                    times(a,b);
                break;

                case 4:
                    divided(a,b);
                break;

                case 5:
                    expNum(a,b);
                break;

                case 6:
                    modulo(a,b);
                break;

                case 7:
                    rectangle(a,b);
                break;

                default:
                    System.out.println("Geçersiz Sayı İşlem Girdiniz ! ");

            }

            }

}}