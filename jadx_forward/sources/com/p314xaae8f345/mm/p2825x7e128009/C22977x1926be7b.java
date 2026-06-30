package com.p314xaae8f345.mm.p2825x7e128009;

/* renamed from: com.tencent.mm.xeffect.XEffectLog */
/* loaded from: classes10.dex */
public class C22977x1926be7b {

    /* renamed from: a, reason: collision with root package name */
    public static tq5.n f296336a = new tq5.m(null);

    public static long a() {
        try {
            return m83799x56b7cc14();
        } catch (java.lang.Throwable th6) {
            f296336a.e("XEffectLog", "get native log error %s", th6.getMessage());
            return 0L;
        }
    }

    public static void b(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        f296336a.w(str, str2, objArr);
    }

    /* renamed from: nGetXLogImpl */
    private static native long m83799x56b7cc14();
}
