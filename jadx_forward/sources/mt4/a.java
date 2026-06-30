package mt4;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f412833a = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, com.p314xaae8f345.p3206x37e841.C27806x41b77320.f60796x98e30028, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};

    public static byte[] a(java.lang.String str) {
        char c17;
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        byte[] bArr = f412833a;
        byte[] bArr2 = new byte[((length * 3) / 4) + 2];
        byte[] bArr3 = new byte[4];
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (i17 >= length) {
                break;
            }
            int i27 = i17 + 0;
            byte b17 = (byte) (bytes[i27] & Byte.MAX_VALUE);
            byte b18 = bArr[b17];
            if (b18 < -5) {
                throw new mt4.b("Bad Base64 input character at " + i17 + ": " + ((int) bytes[i27]) + "(decimal)");
            }
            if (b18 < -1) {
                c17 = 4;
            } else if (b17 == 61) {
                int i28 = length - i17;
                byte b19 = (byte) (bytes[(length - 1) + 0] & Byte.MAX_VALUE);
                if (i18 == 0 || i18 == 1) {
                    throw new mt4.b("invalid padding byte '=' at byte offset " + i17);
                }
                if ((i18 == 3 && i28 > 2) || (i18 == 4 && i28 > 1)) {
                    throw new mt4.b("padding byte '=' falsely signals end of encoded value at offset " + i17);
                }
                if (b19 != 61 && b19 != 10) {
                    throw new mt4.b("encoded value has invalid trailing byte");
                }
            } else {
                int i29 = i18 + 1;
                bArr3[i18] = b17;
                c17 = 4;
                if (i29 == 4) {
                    i19 += b(bArr3, 0, bArr2, i19, bArr);
                    i18 = 0;
                } else {
                    i18 = i29;
                }
            }
            i17++;
        }
        if (i18 != 0) {
            if (i18 == 1) {
                throw new mt4.b("single trailing character at offset " + (length - 1));
            }
            bArr3[i18] = 61;
            i19 += b(bArr3, 0, bArr2, i19, bArr);
        }
        byte[] bArr4 = new byte[i19];
        java.lang.System.arraycopy(bArr2, 0, bArr4, 0, i19);
        return bArr4;
    }

    public static int b(byte[] bArr, int i17, byte[] bArr2, int i18, byte[] bArr3) {
        byte b17 = bArr[i17 + 2];
        if (b17 == 61) {
            bArr2[i18] = (byte) ((((bArr3[bArr[i17 + 1]] << 24) >>> 12) | ((bArr3[bArr[i17]] << 24) >>> 6)) >>> 16);
            return 1;
        }
        byte b18 = bArr[i17 + 3];
        if (b18 == 61) {
            int i19 = ((bArr3[bArr[i17 + 1]] << 24) >>> 12) | ((bArr3[bArr[i17]] << 24) >>> 6) | ((bArr3[b17] << 24) >>> 18);
            bArr2[i18] = (byte) (i19 >>> 16);
            bArr2[i18 + 1] = (byte) (i19 >>> 8);
            return 2;
        }
        int i27 = ((bArr3[bArr[i17 + 1]] << 24) >>> 12) | ((bArr3[bArr[i17]] << 24) >>> 6) | ((bArr3[b17] << 24) >>> 18) | ((bArr3[b18] << 24) >>> 24);
        bArr2[i18] = (byte) (i27 >> 16);
        bArr2[i18 + 1] = (byte) (i27 >> 8);
        bArr2[i18 + 2] = (byte) i27;
        return 3;
    }
}
