package kk;

/* loaded from: classes12.dex */
public abstract class u {
    public static int a(byte[] bArr, int i17) {
        return ((bArr[i17 + 3] & 255) << 0) | ((bArr[i17] & 255) << 24) | ((bArr[i17 + 1] & 255) << 16) | ((bArr[i17 + 2] & 255) << 8);
    }

    public static long b(byte[] bArr) {
        return ((255 & bArr[7]) << 0) | ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8);
    }

    public static int c(byte[] bArr) {
        return ((bArr[0] & 255) << 0) | ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8);
    }

    public static byte[] d(int i17) {
        byte[] bArr = new byte[4];
        for (int i18 = 0; i18 < 4; i18++) {
            bArr[i18] = (byte) ((i17 >> (i18 * 8)) & 255);
        }
        byte[] bArr2 = new byte[4];
        for (int i19 = 0; i19 < 4; i19++) {
            bArr2[i19] = bArr[3 - i19];
        }
        return bArr2;
    }
}
