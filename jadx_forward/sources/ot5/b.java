package ot5;

/* loaded from: classes5.dex */
public abstract class b {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr2.length > 16) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                messageDigest.update(bArr2);
                bArr2 = messageDigest.digest();
            } catch (java.security.NoSuchAlgorithmException unused) {
                bArr2 = null;
            }
        }
        if (bArr == null || bArr2 == null || bArr.length == 0) {
            return bArr;
        }
        int length = bArr.length % 4 == 0 ? (bArr.length >>> 2) + 1 : (bArr.length >>> 2) + 2;
        int[] iArr = new int[length];
        b(bArr, iArr);
        int i17 = length - 1;
        iArr[i17] = bArr.length;
        int length2 = bArr2.length % 4 == 0 ? bArr2.length >>> 2 : (bArr2.length >>> 2) + 1;
        int i18 = length2 >= 4 ? length2 : 4;
        int[] iArr2 = new int[i18];
        int i19 = 0;
        for (int i27 = 0; i27 < i18; i27++) {
            iArr2[i27] = 0;
        }
        b(bArr2, iArr2);
        int i28 = iArr[i17];
        int i29 = iArr[0];
        int i37 = (52 / (i17 + 1)) + 6;
        int i38 = 0;
        while (true) {
            int i39 = i37 - 1;
            if (i37 <= 0) {
                break;
            }
            i38 -= 1640531527;
            int i47 = (i38 >>> 2) & 3;
            int i48 = 0;
            while (i48 < i17) {
                int i49 = i48 + 1;
                int i57 = iArr[i49];
                i28 = ((((i28 >>> 5) ^ (i57 << 2)) + ((i57 >>> 3) ^ (i28 << 4))) ^ ((i57 ^ i38) + (i28 ^ iArr2[(i48 & 3) ^ i47]))) + iArr[i48];
                iArr[i48] = i28;
                i48 = i49;
            }
            int i58 = iArr[0];
            i28 = ((((i28 >>> 5) ^ (i58 << 2)) + ((i58 >>> 3) ^ (i28 << 4))) ^ ((i58 ^ i38) + (i28 ^ iArr2[i47 ^ (i48 & 3)]))) + iArr[i17];
            iArr[i17] = i28;
            i37 = i39;
        }
        int i59 = length << 2;
        byte[] bArr3 = new byte[i59];
        int i66 = i59 >> 2;
        if (i66 > length) {
            i66 = length;
        }
        int i67 = 0;
        while (i19 < i66) {
            int i68 = i67 + 1;
            int i69 = iArr[i19];
            bArr3[i67] = (byte) (i69 & 255);
            int i76 = i68 + 1;
            bArr3[i68] = (byte) ((i69 >>> 8) & 255);
            int i77 = i76 + 1;
            bArr3[i76] = (byte) ((i69 >>> 16) & 255);
            i67 = i77 + 1;
            bArr3[i77] = (byte) ((i69 >>> 24) & 255);
            i19++;
        }
        if (length > i66 && i67 < i59) {
            bArr3[i67] = (byte) (iArr[i19] & 255);
            int i78 = 8;
            for (int i79 = i67 + 1; i78 <= 24 && i79 < i59; i79++) {
                bArr3[i79] = (byte) ((iArr[i19] >>> i78) & 255);
                i78 += 8;
            }
        }
        return bArr3;
    }

    public static void b(byte[] bArr, int[] iArr) {
        int length = bArr.length >> 2;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            int i19 = i18 + 1;
            int i27 = bArr[i18] & 255;
            iArr[i17] = i27;
            int i28 = i19 + 1;
            int i29 = i27 | ((bArr[i19] & 255) << 8);
            iArr[i17] = i29;
            int i37 = i28 + 1;
            int i38 = i29 | ((bArr[i28] & 255) << 16);
            iArr[i17] = i38;
            iArr[i17] = i38 | ((bArr[i37] & 255) << 24);
            i17++;
            i18 = i37 + 1;
        }
        if (i18 < bArr.length) {
            int i39 = i18 + 1;
            iArr[i17] = bArr[i18] & 255;
            int i47 = 8;
            while (i39 < bArr.length) {
                iArr[i17] = iArr[i17] | ((bArr[i39] & 255) << i47);
                i39++;
                i47 += 8;
            }
        }
    }
}
