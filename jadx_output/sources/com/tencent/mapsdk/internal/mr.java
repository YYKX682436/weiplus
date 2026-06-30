package com.tencent.mapsdk.internal;

/* loaded from: classes12.dex */
public final class mr implements com.tencent.mapsdk.internal.mu {
    private static byte a(java.io.InputStream inputStream) {
        return (byte) inputStream.read();
    }

    private static boolean b(java.io.InputStream inputStream) {
        return ((byte) inputStream.read()) != 0;
    }

    private static int c(java.io.InputStream inputStream) {
        return (int) a(2, inputStream);
    }

    private static char d(java.io.InputStream inputStream) {
        long j17 = 0;
        for (int i17 = 0; i17 < 2; i17++) {
            j17 |= (((byte) inputStream.read()) & 255) << (i17 * 8);
        }
        return (char) j17;
    }

    private static int e(java.io.InputStream inputStream) {
        return (int) a(4, inputStream);
    }

    private static long f(java.io.InputStream inputStream) {
        return a(8, inputStream);
    }

    private static java.lang.String g(java.io.InputStream inputStream) {
        int a17 = (int) a(2, inputStream);
        byte[] bArr = new byte[a17];
        int i17 = 0;
        while (i17 < a17) {
            i17 += inputStream.read(bArr, i17, a17 - i17);
        }
        return new java.lang.String(bArr);
    }

    private static byte[] a(java.io.InputStream inputStream, int i17) {
        byte[] bArr = new byte[i17];
        int i18 = 0;
        while (i18 < i17) {
            i18 += inputStream.read(bArr, i18, i17 - i18);
        }
        return bArr;
    }

    private static long a(int i17, java.io.InputStream inputStream) {
        long j17 = 0;
        for (int i18 = i17 - 1; i18 >= 0; i18--) {
            j17 |= (((byte) inputStream.read()) & 255) << (i18 * 8);
        }
        return j17;
    }
}
