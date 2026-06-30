package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class mt implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mu {

    /* renamed from: g, reason: collision with root package name */
    private static final java.lang.String f131982g = "UTF-16LE";

    /* renamed from: h, reason: collision with root package name */
    private java.io.ByteArrayOutputStream f131983h = new java.io.ByteArrayOutputStream();

    private void a(byte b17) {
        this.f131983h.write(b17);
    }

    private static byte[] b(long j17) {
        return new byte[]{(byte) j17, (byte) (j17 >> 8), (byte) (j17 >> 16), (byte) (j17 >> 24), (byte) (j17 >> 32), (byte) (j17 >> 40), (byte) (j17 >> 48), (byte) (j17 >> 56)};
    }

    private void c(byte[] bArr) {
        this.f131983h.write(bArr, 0, bArr.length);
    }

    private static byte[] d(int i17) {
        return new byte[]{(byte) i17, (byte) (i17 >> 8), (byte) (i17 >> 16), (byte) (i17 >> 24)};
    }

    private static long e(byte[] bArr) {
        return (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24) | ((bArr[4] & 255) << 32) | ((bArr[5] & 255) << 40) | ((bArr[6] & 255) << 48) | ((bArr[7] & 255) << 56);
    }

    private static float f(byte[] bArr) {
        return java.lang.Float.intBitsToFloat(a(bArr));
    }

    private static double g(byte[] bArr) {
        return java.lang.Double.longBitsToDouble((bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24) | ((bArr[4] & 255) << 32) | ((bArr[5] & 255) << 40) | ((bArr[6] & 255) << 48) | ((bArr[7] & 255) << 56));
    }

    private void a(boolean z17) {
        a(z17 ? (byte) 1 : (byte) 0);
    }

    private static byte[] b(java.lang.String str) {
        if (str != null) {
            try {
                return str.getBytes(f131982g);
            } catch (java.lang.Exception unused) {
            }
        }
        return new byte[0];
    }

    private void c(int i17) {
        a(i17, 4);
    }

    private static boolean d(byte[] bArr) {
        return bArr[0] > 0;
    }

    private void a(int i17) {
        a(i17, 2);
    }

    public static java.lang.String b(byte[] bArr) {
        try {
            return new java.lang.String(bArr, f131982g).trim();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private void a(char c17) {
        for (int i17 = 0; i17 < 2; i17++) {
            a((byte) ((c17 >> (i17 * 8)) & 255));
        }
    }

    private static byte[] b(int i17) {
        byte[] bArr = new byte[4];
        long j17 = i17;
        for (int i18 = 3; i18 >= 0; i18--) {
            bArr[(4 - i18) - 1] = (byte) ((j17 >> (i18 * 8)) & 255);
        }
        return bArr;
    }

    private static void a(long j17, byte[] bArr) {
        for (int i17 = 3; i17 >= 0; i17--) {
            bArr[(4 - i17) - 1] = (byte) ((j17 >> (i17 * 8)) & 255);
        }
    }

    private void a(long j17) {
        a(j17, 8);
    }

    private void a(java.lang.String str) {
        if (str == null) {
            return;
        }
        byte[] bytes = str.getBytes();
        a(bytes.length, 2);
        this.f131983h.write(bytes, 0, bytes.length);
    }

    private byte[] a() {
        byte[] bArr = null;
        try {
            this.f131983h.close();
            byte[] byteArray = this.f131983h.toByteArray();
            try {
                this.f131983h = null;
                return byteArray;
            } catch (java.io.IOException unused) {
                bArr = byteArray;
                return bArr;
            }
        } catch (java.io.IOException unused2) {
        }
    }

    private void a(long j17, int i17) {
        for (int i18 = i17 - 1; i18 >= 0; i18--) {
            a((byte) ((j17 >> (i18 * 8)) & 255));
        }
    }

    public static int a(byte[] bArr) {
        return ((bArr[3] << 24) & (-16777216)) | (bArr[0] & 255) | ((bArr[1] << 8) & 65280) | ((bArr[2] << com.p314xaae8f345.p3206x37e841.C27806x41b77320.f60796x98e30028) & 16711680);
    }

    private static byte[] a(float f17) {
        int floatToIntBits = java.lang.Float.floatToIntBits(f17);
        return new byte[]{(byte) floatToIntBits, (byte) (floatToIntBits >> 8), (byte) (floatToIntBits >> 16), (byte) (floatToIntBits >> 24)};
    }

    private static byte[] a(double d17) {
        return new byte[]{(byte) java.lang.Double.doubleToLongBits(d17), (byte) (r4 >> 8), (byte) (r4 >> 16), (byte) (r4 >> 24), (byte) (r4 >> 32), (byte) (r4 >> 40), (byte) (r4 >> 48), (byte) (r4 >> 56)};
    }

    public static java.lang.String a(byte[] bArr, java.lang.String str) {
        try {
            return new java.lang.String(bArr, str).trim();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
