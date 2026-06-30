package com.tencent.mm.plugin.appbrand.av_device_usage;

/* loaded from: classes7.dex */
public final class q0 implements fb1.g {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.av_device_usage.q0 f76733e;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fb1.g f76734d;

    static {
        com.tencent.mm.plugin.appbrand.av_device_usage.q0 q0Var = new com.tencent.mm.plugin.appbrand.av_device_usage.q0();
        f76733e = q0Var;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        boolean a17 = z65.c.a();
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        if (e0Var != null) {
            a17 = ((h62.d) e0Var).fj(e42.c0.clicfg_android_appbrand_enable_av_device_usage_service_2, a17);
        }
        if (a17) {
            nd.f.e(fb1.g.class, q0Var);
        }
    }

    public q0() {
        this.f76734d = com.tencent.mm.sdk.platformtools.x2.n() ? com.tencent.mm.plugin.appbrand.av_device_usage.q.f76731d : com.tencent.mm.plugin.appbrand.av_device_usage.f.f76700d;
    }

    @Override // fb1.g
    public void F3(fb1.d scene, boolean z17, java.lang.String token) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(token, "token");
        this.f76734d.F3(scene, z17, token);
    }

    @Override // fb1.g
    public boolean R() {
        return this.f76734d.R();
    }

    @Override // fb1.g
    public fb1.c ec(fb1.d scene, boolean z17, fb1.h hVar) {
        kotlin.jvm.internal.o.g(scene, "scene");
        return this.f76734d.ec(scene, z17, hVar);
    }
}
