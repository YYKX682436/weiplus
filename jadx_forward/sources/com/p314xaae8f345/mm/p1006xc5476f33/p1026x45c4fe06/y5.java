package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class y5 extends jj.f {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y5 f173944a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y5();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f173945b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("AppBrandRuntimeInitUiThreadLagDetector");

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f173946c = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w5.f172480d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f173947d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v5.f172178d);

    /* renamed from: e, reason: collision with root package name */
    public static final x.d f173948e = new x.d(0);

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Runnable f173949f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x5.f173909d;

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 rt6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        if (((java.lang.Boolean) ((jz5.n) f173947d).mo141623x754a37bb()).booleanValue()) {
            x.d dVar = f173948e;
            dVar.remove(rt6);
            if (dVar.f532349f == 0) {
                gj.o oVar = gj.o.f353900n;
                if (oVar.f353907m) {
                    synchronized (oVar.f353902e) {
                        oVar.f353902e.remove(this);
                        if (oVar.f353902e.isEmpty()) {
                            oVar.f();
                        }
                    }
                }
            }
        }
    }
}
