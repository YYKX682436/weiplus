package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public abstract class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.s1 f129073a = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.s1(null);

    public static final java.lang.String a(java.lang.String libName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(libName, "libName");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("FLAVOR_RED", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274657t.a("FEATURE_ID"))) {
            java.lang.String str = (java.lang.String) com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.q1.f129055b.get(libName);
            if (!(str == null || str.length() == 0)) {
                return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationInfo().nativeLibraryDir + '/' + str;
            }
        } else {
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Ui("ilinkres_ae0cf48a", libName);
            if (Ui != null) {
                return Ui.m117639xfb83cc9b();
            }
        }
        return null;
    }
}
