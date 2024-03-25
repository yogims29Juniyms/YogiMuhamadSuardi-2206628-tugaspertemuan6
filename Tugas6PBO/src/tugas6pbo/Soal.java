/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6pbo;

class PersegiPanjang {
    int panjang;
    int lebar;

    public PersegiPanjang() {
        panjang = 1;
        lebar = 1;
    }

    public PersegiPanjang(int panjangbaru, int lebarbaru) {
        panjang = panjangbaru;
        lebar = lebarbaru;
    }

    public int getLuas() {
        return panjang * lebar;
    }

    public int getKeliling() {
        return 2 * (panjang + lebar);
    }

    public void setPanjang(int panjangbaru) {
        panjang = panjangbaru;
    }

    public void setLebar(int lebarbaru) {
        lebar = lebarbaru;
    }
}

/**
 *
 * @author admin
 */
public class Soal {
    public static void main(String[] args) {
        PersegiPanjang persegipanjang1 = new PersegiPanjang();

        System.out.println("Persegi Panjang 1");
        System.out.println("Luas     : " + persegipanjang1.getLuas());
        System.out.println("Keliling : " + persegipanjang1.getKeliling());

        PersegiPanjang persegipanjang2 = new PersegiPanjang();

        persegipanjang2.setPanjang(30);
        persegipanjang2.setLebar(40);

        System.out.println("Persegi Panjang 2");
        System.out.println("Luas     : " + persegipanjang2.getLuas());
        System.out.println("Keliling : " + persegipanjang2.getKeliling());

        PersegiPanjang persegipanjang3 = new PersegiPanjang();

        persegipanjang3.setPanjang(25);
        persegipanjang3.setLebar(35);

        System.out.println("Persegi Panjang 3");
        System.out.println("Luas     : " + persegipanjang3.getLuas());
        System.out.println("Keliling : " + persegipanjang3.getKeliling());
    }
}