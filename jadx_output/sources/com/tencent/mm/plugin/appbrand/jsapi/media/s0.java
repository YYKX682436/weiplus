package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class s0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.t0 f82036a;

    public s0(com.tencent.mm.plugin.appbrand.jsapi.media.t0 t0Var) {
        this.f82036a = t0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.media.t0 t0Var = this.f82036a;
        android.app.Activity a17 = q75.a.a(t0Var.f82060a.getF147807d());
        com.tencent.mm.plugin.appbrand.jsapi.media.x xVar = com.tencent.mm.plugin.appbrand.jsapi.media.x.f82124a;
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.ChooseMediaWorkFlow", "step:startActivityForResult, context !is Activity");
            km5.u.b().a(new java.lang.IllegalStateException("fail:internal error invalid android context"));
        } else {
            int h17 = com.tencent.mm.plugin.appbrand.jsapi.media.o7.f81968g.h();
            int i17 = t0Var.f82061b;
            if (i17 == h17) {
                km5.u.a(com.tencent.mm.plugin.appbrand.jsapi.media.t0.b(t0Var));
            } else {
                if (i17 == com.tencent.mm.plugin.appbrand.jsapi.media.o7.f81967f.h()) {
                    km5.u.a(com.tencent.mm.plugin.appbrand.jsapi.media.t0.a(t0Var));
                } else {
                    km5.b c17 = km5.u.c();
                    com.tencent.mm.ui.tools.s6 s6Var = new com.tencent.mm.ui.tools.s6(a17);
                    s6Var.f210721e.C = new com.tencent.mm.plugin.appbrand.jsapi.media.m0(c17);
                    s6Var.a(null, new com.tencent.mm.plugin.appbrand.jsapi.media.n0(t0Var), new com.tencent.mm.plugin.appbrand.jsapi.media.q0(t0Var, c17), new com.tencent.mm.plugin.appbrand.jsapi.media.r0(c17));
                }
            }
        }
        return xVar;
    }
}
