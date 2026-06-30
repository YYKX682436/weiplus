package av5;

/* loaded from: classes16.dex */
public abstract class c0 {
    public static int a(cv5.a aVar, int i17) {
        int i18 = 0;
        for (int i19 = i17; i19 >= 0; i19--) {
            i18 = (i18 >>> 8) | ((aVar.readByte() & 255) << 24);
        }
        return i18 >> ((3 - i17) * 8);
    }

    public static int b(cv5.a aVar, int i17, boolean z17) {
        int i18 = 0;
        if (z17) {
            while (i17 >= 0) {
                i18 = ((aVar.readByte() & 255) << 24) | (i18 >>> 8);
                i17--;
            }
            return i18;
        }
        for (int i19 = i17; i19 >= 0; i19--) {
            i18 = (i18 >>> 8) | ((aVar.readByte() & 255) << 24);
        }
        return i18 >>> ((3 - i17) * 8);
    }

    public static void c(cv5.b bVar, int i17, long j17) {
        int numberOfTrailingZeros = 64 - java.lang.Long.numberOfTrailingZeros(j17);
        if (numberOfTrailingZeros == 0) {
            numberOfTrailingZeros = 1;
        }
        int i18 = (numberOfTrailingZeros + 7) >> 3;
        long j18 = j17 >> (64 - (i18 * 8));
        bVar.e(i17 | ((i18 - 1) << 5));
        while (i18 > 0) {
            bVar.e((byte) j18);
            j18 >>= 8;
            i18--;
        }
    }

    public static void d(cv5.b bVar, int i17, long j17) {
        int numberOfLeadingZeros = ((65 - java.lang.Long.numberOfLeadingZeros((j17 >> 63) ^ j17)) + 7) >> 3;
        bVar.e(i17 | ((numberOfLeadingZeros - 1) << 5));
        while (numberOfLeadingZeros > 0) {
            bVar.e((byte) j17);
            j17 >>= 8;
            numberOfLeadingZeros--;
        }
    }

    public static void e(cv5.b bVar, int i17, long j17) {
        int numberOfLeadingZeros = 64 - java.lang.Long.numberOfLeadingZeros(j17);
        if (numberOfLeadingZeros == 0) {
            numberOfLeadingZeros = 1;
        }
        int i18 = (numberOfLeadingZeros + 7) >> 3;
        bVar.e(i17 | ((i18 - 1) << 5));
        while (i18 > 0) {
            bVar.e((byte) j17);
            j17 >>= 8;
            i18--;
        }
    }
}
