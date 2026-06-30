package kk;

/* loaded from: classes12.dex */
public abstract class m {
    public static int a(byte[] bArr, int i17, int i18, int i19) {
        int i27 = i17 ^ i19;
        int i28 = i19 >> 2;
        for (int i29 = 0; i29 < i28; i29++) {
            int i37 = (i29 << 2) + i18;
            int i38 = ((bArr[i37 + 0] & 255) | (((((bArr[i37 + 3] << 8) | (bArr[i37 + 2] & 255)) << 8) | (bArr[i37 + 1] & 255)) << 8)) * 1540483477;
            i27 = (i27 * 1540483477) ^ ((i38 ^ (i38 >>> 24)) * 1540483477);
        }
        int i39 = i19 - (i28 << 2);
        if (i39 != 0) {
            if (i39 >= 3) {
                i27 ^= bArr[(i18 + i19) - 3] << 16;
            }
            if (i39 >= 2) {
                i27 ^= bArr[(i18 + i19) - 2] << 8;
            }
            if (i39 >= 1) {
                i27 ^= bArr[(i18 + i19) - 1];
            }
            i27 *= 1540483477;
        }
        int i47 = ((i27 >>> 13) ^ i27) * 1540483477;
        return i47 ^ (i47 >>> 15);
    }

    public static int b(int i17, int i18) {
        if (i18 < 0 || i18 >= Integer.MAX_VALUE) {
            return 0;
        }
        byte[] bArr = new byte[4];
        for (int i19 = 0; i19 < 4; i19++) {
            bArr[i19] = (byte) ((i17 >> (i19 * 8)) & 255);
        }
        return (int) ((a(bArr, 0, 0, 4) & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2) % i18);
    }
}
