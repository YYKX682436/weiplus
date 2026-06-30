package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public abstract class jb {
    public static void a(byte b17, byte b18, byte b19, byte b27, char[] cArr, int i17) {
        if (d(b18) || (((b17 << 28) + (b18 + 112)) >> 30) != 0 || d(b19) || d(b27)) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.c();
        }
        int i18 = ((b17 & 7) << 18) | ((b18 & 63) << 12) | ((b19 & 63) << 6) | (b27 & 63);
        cArr[i17] = (char) ((i18 >>> 10) + 55232);
        cArr[i17 + 1] = (char) ((i18 & 1023) + 56320);
    }

    public static void b(byte b17, byte b18, char[] cArr, int i17) {
        if (b17 < -62 || d(b18)) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.c();
        }
        cArr[i17] = (char) (((b17 & 31) << 6) | (b18 & 63));
    }

    public static void c(byte b17, byte b18, byte b19, char[] cArr, int i17) {
        if (d(b18) || ((b17 == -32 && b18 < -96) || ((b17 == -19 && b18 >= -96) || d(b19)))) {
            throw com.p176xb6135e39.p283xc50a8b8b.y6.c();
        }
        cArr[i17] = (char) (((b17 & 15) << 12) | ((b18 & 63) << 6) | (b19 & 63));
    }

    public static boolean d(byte b17) {
        return b17 > -65;
    }
}
