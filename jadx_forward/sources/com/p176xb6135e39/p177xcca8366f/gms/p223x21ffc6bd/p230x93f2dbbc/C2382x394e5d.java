package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzyv */
/* loaded from: classes13.dex */
final class C2382x394e5d {

    /* renamed from: zzbqv */
    private static final java.lang.Class<?> f7206x6f026c7 = m19367x394c02("libcore.io.Memory");

    /* renamed from: zzbqw */
    private static final boolean f7207x6f026c8;

    static {
        f7207x6f026c8 = m19367x394c02("org.robolectric.Robolectric") != null;
    }

    /* renamed from: zzfh */
    private static <T> java.lang.Class<T> m19367x394c02(java.lang.String str) {
        try {
            return (java.lang.Class<T>) java.lang.Class.forName(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* renamed from: zzsv */
    public static boolean m19368x394da3() {
        return (f7206x6f026c7 == null || f7207x6f026c8) ? false : true;
    }

    /* renamed from: zzsw */
    public static java.lang.Class<?> m19369x394da4() {
        return f7206x6f026c7;
    }
}
