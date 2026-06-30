package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
final class zzyv {
    private static final java.lang.Class<?> zzbqv = zzfh("libcore.io.Memory");
    private static final boolean zzbqw;

    static {
        zzbqw = zzfh("org.robolectric.Robolectric") != null;
    }

    private static <T> java.lang.Class<T> zzfh(java.lang.String str) {
        try {
            return (java.lang.Class<T>) java.lang.Class.forName(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static boolean zzsv() {
        return (zzbqv == null || zzbqw) ? false : true;
    }

    public static java.lang.Class<?> zzsw() {
        return zzbqv;
    }
}
