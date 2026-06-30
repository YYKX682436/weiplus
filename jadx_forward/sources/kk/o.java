package kk;

/* loaded from: classes12.dex */
public abstract class o {
    public static void a(kk.n nVar, kk.n nVar2, int i17) {
        for (int i18 = 0; i18 < i17; i18++) {
            nVar.f390001a[nVar.f390002b + i18] = (byte) ((nVar2.f390001a[(i18 >> 3) + nVar2.f390002b] >> (i18 & 7)) & 1);
        }
    }

    public static void b(kk.n nVar, kk.n nVar2, int i17, int i18) {
        i(nVar2, nVar, i18);
        for (int i19 = 0; i19 < i17 - i18; i19++) {
            byte[] bArr = nVar.f390001a;
            int i27 = nVar.f390002b;
            bArr[i27 + i19] = bArr[i27 + i19 + i18];
        }
        for (int i28 = 0; i28 < i18; i28++) {
            nVar.f390001a[((nVar.f390002b + i28) + i17) - i18] = nVar2.f390001a[nVar2.f390002b + i28];
        }
    }

    public static void c(kk.n nVar, kk.n nVar2, kk.n[] nVarArr, int i17, kk.n nVar3, kk.n nVar4, kk.n nVar5, kk.n nVar6, kk.n nVar7, kk.n nVar8) {
        byte[] bArr = {58, 50, 42, 34, 26, 18, 10, 2, 60, 52, 44, 36, 28, 20, 12, 4, 62, 54, 46, 38, 30, 22, 14, 6, 64, 56, 48, 40, 32, 24, com.p314xaae8f345.p3206x37e841.C27806x41b77320.f60796x98e30028, 8, 57, 49, 41, 33, 25, 17, 9, 1, 59, 51, 43, 35, 27, 19, 11, 3, 61, 53, 45, 37, 29, 21, 13, 5, 63, 55, 47, 39, 31, 23, 15, 7};
        byte[] bArr2 = {40, 8, 48, com.p314xaae8f345.p3206x37e841.C27806x41b77320.f60796x98e30028, 56, 24, 64, 32, 39, 7, 47, 15, 55, 23, 63, 31, 38, 6, 46, 14, 54, 22, 62, 30, 37, 5, 45, 13, 53, 21, 61, 29, 36, 4, 44, 12, 52, 20, 60, 28, 35, 3, 43, 11, 51, 19, 59, 27, 34, 2, 42, 10, 50, 18, 58, 26, 33, 1, 41, 9, 49, 17, 57, 25};
        a(nVar3, nVar2, 64);
        e(nVar3, nVar3, bArr, 64, nVar8);
        if (i17 == 0) {
            for (int i18 = 0; i18 < 16; i18++) {
                i(nVar5, nVar7, 32);
                d(nVar7, nVarArr[i18], nVar4, nVar8);
                g(nVar7, nVar6, 32);
                i(nVar6, nVar5, 32);
            }
        } else {
            for (int i19 = 15; i19 >= 0; i19--) {
                i(nVar5, nVar6, 32);
                d(nVar6, nVarArr[i19], nVar4, nVar8);
                g(nVar6, nVar7, 32);
                i(nVar7, nVar5, 32);
            }
        }
        e(nVar3, nVar3, bArr2, 64, nVar8);
        for (int i27 = 0; i27 < 8; i27++) {
            nVar.f390001a[nVar.f390002b + i27] = (byte) 0;
        }
        for (int i28 = 0; i28 < 64; i28++) {
            byte[] bArr3 = nVar.f390001a;
            int i29 = nVar.f390002b + (i28 >> 3);
            bArr3[i29] = (byte) (bArr3[i29] | (nVar3.f390001a[nVar3.f390002b + i28] << (i28 & 7)));
        }
    }

    public static void d(kk.n nVar, kk.n nVar2, kk.n nVar3, kk.n nVar4) {
        byte[] bArr = {32, 1, 2, 3, 4, 5, 4, 5, 6, 7, 8, 9, 8, 9, 10, 11, 12, 13, 12, 13, 14, 15, com.p314xaae8f345.p3206x37e841.C27806x41b77320.f60796x98e30028, 17, com.p314xaae8f345.p3206x37e841.C27806x41b77320.f60796x98e30028, 17, 18, 19, 20, 21, 20, 21, 22, 23, 24, 25, 24, 25, 26, 27, 28, 29, 28, 29, 30, 31, 32, 1};
        byte[] bArr2 = {com.p314xaae8f345.p3206x37e841.C27806x41b77320.f60796x98e30028, 7, 20, 21, 29, 12, 28, 17, 1, 15, 23, 26, 5, 18, 31, 10, 2, 8, 24, 14, 32, 27, 3, 9, 19, 13, 30, 6, 22, 11, 4, 25};
        e(nVar3, nVar, bArr, 48, nVar4);
        g(nVar3, nVar2, 48);
        byte b17 = 0;
        byte[][][] bArr3 = {new byte[][]{new byte[]{14, 4, 13, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7}, new byte[]{0, 15, 7, 4, 14, 2, 13, 1, 10, 6, 12, 11, 9, 5, 3, 8}, new byte[]{4, 1, 14, 8, 13, 6, 2, 11, 15, 12, 9, 7, 3, 10, 5, 0}, new byte[]{15, 12, 8, 2, 4, 9, 1, 7, 5, 11, 3, 14, 10, 0, 6, 13}}, new byte[][]{new byte[]{15, 1, 8, 14, 6, 11, 3, 4, 9, 7, 2, 13, 12, 0, 5, 10}, new byte[]{3, 13, 4, 7, 15, 2, 8, 14, 12, 0, 1, 10, 6, 9, 11, 5}, new byte[]{0, 14, 7, 11, 10, 4, 13, 1, 5, 8, 12, 6, 9, 3, 2, 15}, new byte[]{13, 8, 10, 1, 3, 15, 4, 2, 11, 6, 7, 12, 0, 5, 14, 9}}, new byte[][]{new byte[]{10, 0, 9, 14, 6, 3, 15, 5, 1, 13, 12, 7, 11, 4, 2, 8}, new byte[]{13, 7, 0, 9, 3, 4, 6, 10, 2, 8, 5, 14, 12, 11, 15, 1}, new byte[]{13, 6, 4, 9, 8, 15, 3, 0, 11, 1, 2, 12, 5, 10, 14, 7}, new byte[]{1, 10, 13, 0, 6, 9, 8, 7, 4, 15, 14, 3, 11, 5, 2, 12}}, new byte[][]{new byte[]{7, 13, 14, 3, 0, 6, 9, 10, 1, 2, 8, 5, 11, 12, 4, 15}, new byte[]{13, 8, 11, 5, 6, 15, 0, 3, 4, 7, 2, 12, 1, 10, 14, 9}, new byte[]{10, 6, 9, 0, 12, 11, 7, 13, 15, 1, 3, 14, 5, 2, 8, 4}, new byte[]{3, 15, 0, 6, 10, 1, 13, 8, 9, 4, 5, 11, 12, 7, 2, 14}}, new byte[][]{new byte[]{2, 12, 4, 1, 7, 10, 11, 6, 8, 5, 3, 15, 13, 0, 14, 9}, new byte[]{14, 11, 2, 12, 4, 7, 13, 1, 5, 0, 15, 10, 3, 9, 8, 6}, new byte[]{4, 2, 1, 11, 10, 13, 7, 8, 15, 9, 12, 5, 6, 3, 0, 14}, new byte[]{11, 8, 12, 7, 1, 14, 2, 13, 6, 15, 0, 9, 10, 4, 5, 3}}, new byte[][]{new byte[]{12, 1, 10, 15, 9, 2, 6, 8, 0, 13, 3, 4, 14, 7, 5, 11}, new byte[]{10, 15, 4, 2, 7, 12, 9, 5, 6, 1, 13, 14, 0, 11, 3, 8}, new byte[]{9, 14, 15, 5, 2, 8, 12, 3, 7, 0, 4, 10, 1, 13, 11, 6}, new byte[]{4, 3, 2, 12, 9, 5, 15, 10, 11, 14, 1, 7, 6, 0, 8, 13}}, new byte[][]{new byte[]{4, 11, 2, 14, 15, 0, 8, 13, 3, 12, 9, 7, 5, 10, 6, 1}, new byte[]{13, 0, 11, 7, 4, 9, 1, 10, 14, 3, 5, 12, 2, 15, 8, 6}, new byte[]{1, 4, 11, 13, 12, 3, 7, 14, 10, 15, 6, 8, 0, 5, 9, 2}, new byte[]{6, 11, 13, 8, 1, 4, 10, 7, 9, 5, 0, 15, 14, 2, 3, 12}}, new byte[][]{new byte[]{13, 2, 8, 4, 6, 15, 11, 1, 10, 9, 3, 14, 5, 0, 12, 7}, new byte[]{1, 15, 13, 8, 10, 3, 7, 4, 12, 5, 6, 11, 0, 14, 9, 2}, new byte[]{7, 11, 4, 1, 9, 12, 14, 2, 0, 6, 10, 13, 15, 3, 5, 8}, new byte[]{2, 1, 14, 7, 4, 10, 8, 13, 15, 12, 9, 0, 3, 5, 6, 11}}};
        int i17 = nVar3.f390002b;
        int i18 = nVar.f390002b;
        for (byte b18 = 8; b17 < b18; b18 = 8) {
            byte[] bArr4 = nVar3.f390001a;
            int i19 = nVar3.f390002b;
            a(nVar, new kk.n(bArr3[b17][(byte) ((bArr4[i19 + 0] << 1) + bArr4[i19 + 5])][(byte) ((bArr4[i19 + 1] << 3) + (bArr4[i19 + 2] << 2) + (bArr4[i19 + 3] << 1) + bArr4[i19 + 4])]), 4);
            b17 = (byte) (b17 + 1);
            nVar3.f390002b += 6;
            nVar.f390002b += 4;
        }
        nVar3.f390002b = i17;
        nVar.f390002b = i18;
        e(nVar, nVar, bArr2, 32, nVar4);
    }

    public static void e(kk.n nVar, kk.n nVar2, byte[] bArr, int i17, kk.n nVar3) {
        for (int i18 = 0; i18 < i17; i18++) {
            nVar3.f390001a[nVar3.f390002b + i18] = nVar2.f390001a[(nVar2.f390002b + bArr[i18]) - 1];
        }
        i(nVar, nVar3, i17);
    }

    public static char f(byte[] bArr, byte[] bArr2, long j17, int i17, byte[] bArr3, int i18) {
        kk.n nVar;
        int i19;
        int i27;
        kk.n nVar2 = new kk.n(bArr);
        kk.n nVar3 = new kk.n(bArr2);
        kk.n[] nVarArr = new kk.n[16];
        for (int i28 = 0; i28 < 16; i28++) {
            nVarArr[i28] = new kk.n(new byte[48]);
        }
        kk.n nVar4 = new kk.n(new byte[256]);
        byte[] bArr4 = new byte[24];
        kk.n nVar5 = new kk.n(new byte[64]);
        kk.n nVar6 = new kk.n();
        kk.n nVar7 = new kk.n();
        kk.n nVar8 = new kk.n();
        kk.n nVar9 = new kk.n();
        kk.n nVar10 = new kk.n(new byte[64]);
        kk.n nVar11 = new kk.n(new byte[48]);
        kk.n nVar12 = new kk.n(new byte[32]);
        kk.n nVar13 = new kk.n(new byte[9]);
        kk.n nVar14 = new kk.n(new byte[8]);
        if (bArr3 == null || bArr3.length <= 0) {
            return (char) 0;
        }
        long j18 = (j17 + 7) & (-8);
        long j19 = 0;
        if (j18 == 0) {
            return (char) 0;
        }
        nVar6.f390002b = 0;
        nVar6.f390001a = nVar5.f390001a;
        nVar7.f390002b = 28;
        nVar7.f390001a = nVar5.f390001a;
        nVar8.f390002b = 0;
        nVar8.f390001a = nVar10.f390001a;
        nVar9.f390002b = 32;
        nVar9.f390001a = nVar10.f390001a;
        int i29 = 0;
        while (i29 < 24) {
            bArr4[0 + i29] = (byte) 0;
            i29++;
            nVar10 = nVar10;
        }
        kk.n nVar15 = nVar10;
        int i37 = i17;
        if (i37 > 24) {
            i37 = 24;
        }
        for (int i38 = 0; i38 < i37; i38++) {
            bArr4[0 + i38] = bArr3[0 + i38];
        }
        byte[] bArr5 = {57, 49, 41, 33, 25, 17, 9, 1, 58, 50, 42, 34, 26, 18, 10, 2, 59, 51, 43, 35, 27, 19, 11, 3, 60, 52, 44, 36, 63, 55, 47, 39, 31, 23, 15, 7, 62, 54, 46, 38, 30, 22, 14, 6, 61, 53, 45, 37, 29, 21, 13, 5, 28, 20, 12, 4};
        byte[] bArr6 = {14, 17, 11, 24, 1, 5, 3, 28, 15, 6, 21, 10, 23, 19, 12, 4, 26, 8, com.p314xaae8f345.p3206x37e841.C27806x41b77320.f60796x98e30028, 7, 27, 20, 13, 2, 41, 52, 31, 37, 47, 55, 30, 40, 51, 45, 33, 48, 44, 49, 39, 56, 34, 53, 46, 42, 50, 36, 29, 32};
        byte[] bArr7 = {1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1};
        int i39 = 0;
        while (true) {
            nVar = nVar14;
            if (i39 >= 64) {
                break;
            }
            nVar5.f390001a[nVar5.f390002b + i39] = (byte) ((bArr4[(i39 >> 3) + 0] >> (i39 & 7)) & 1);
            i39++;
            nVar14 = nVar;
            nVar9 = nVar9;
            bArr4 = bArr4;
        }
        kk.n nVar16 = nVar9;
        e(nVar5, nVar5, bArr5, 56, nVar4);
        for (int i47 = 0; i47 < 16; i47++) {
            b(nVar6, nVar4, 28, bArr7[i47]);
            b(nVar7, nVar4, 28, bArr7[i47]);
            e(nVarArr[i47], nVar5, bArr6, 48, nVar4);
        }
        int i48 = nVar3.f390002b;
        int i49 = nVar2.f390002b;
        if (i18 == 0) {
            i27 = i48;
            i19 = i49;
            c(nVar2, nVar13, nVarArr, i18, nVar15, nVar11, nVar12, nVar8, nVar16, nVar4);
            i(nVar, nVar2, 8);
            nVar2.f390002b += 8;
            long j27 = j18 >> 3;
            while (j19 < j27) {
                h(nVar, nVar, nVar3);
                c(nVar2, nVar, nVarArr, i18, nVar15, nVar11, nVar12, nVar8, nVar16, nVar4);
                i(nVar, nVar2, 8);
                j19++;
                nVar2.f390002b += 8;
                nVar3.f390002b += 8;
            }
        } else {
            i19 = i49;
            i27 = i48;
            i(nVar13, nVar3, 8);
            nVar3.f390002b += 8;
            long j28 = j18 >> 3;
            long j29 = 1;
            while (j29 < j28) {
                kk.n nVar17 = nVar13;
                c(nVar, nVar3, nVarArr, i18, nVar15, nVar11, nVar12, nVar8, nVar16, nVar4);
                h(nVar2, nVar, nVar17);
                i(nVar17, nVar3, 8);
                j29++;
                nVar2.f390002b += 8;
                nVar3.f390002b += 8;
                nVar13 = nVar17;
            }
        }
        nVar3.f390002b = i27;
        nVar2.f390002b = i19;
        return (char) 1;
    }

    public static void g(kk.n nVar, kk.n nVar2, int i17) {
        for (int i18 = 0; i18 < i17; i18++) {
            byte[] bArr = nVar.f390001a;
            int i19 = nVar.f390002b + i18;
            bArr[i19] = (byte) (bArr[i19] ^ nVar2.f390001a[nVar2.f390002b + i18]);
        }
    }

    public static void h(kk.n nVar, kk.n nVar2, kk.n nVar3) {
        for (int i17 = 0; i17 < 8; i17++) {
            nVar.f390001a[nVar.f390002b + i17] = (byte) (nVar2.f390001a[nVar2.f390002b + i17] ^ nVar3.f390001a[nVar3.f390002b + i17]);
        }
    }

    public static void i(kk.n nVar, kk.n nVar2, int i17) {
        for (int i18 = 0; i18 < i17; i18++) {
            nVar.f390001a[nVar.f390002b + i18] = nVar2.f390001a[nVar2.f390002b + i18];
        }
    }
}
