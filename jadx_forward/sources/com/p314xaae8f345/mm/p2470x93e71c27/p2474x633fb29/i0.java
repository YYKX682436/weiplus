package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes15.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0 f270873a = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f270874b = new java.util.HashMap();

    public static void a(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0 i0Var, int i17, java.lang.String str, long j17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            j17 = 0;
        }
        i0Var.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        if (j17 == 0) {
            j17 = java.lang.System.currentTimeMillis();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.f0(str, i17, j17));
    }

    public static void c(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i0 i0Var, int i17, java.lang.String str, long j17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            j17 = 0;
        }
        i0Var.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        if (j17 == 0) {
            j17 = java.lang.System.currentTimeMillis();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.h0(str, i17, j17));
    }

    public final java.lang.String b(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        byte[] bytes = url.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getMessageDigest(...)");
        return g17;
    }
}
