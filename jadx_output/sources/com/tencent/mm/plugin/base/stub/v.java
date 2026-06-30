package com.tencent.mm.plugin.base.stub;

/* loaded from: classes7.dex */
public class v implements r.a {
    public v(com.tencent.mm.plugin.base.stub.w wVar) {
    }

    @Override // r.a
    public java.lang.Object apply(java.lang.Object obj) {
        k91.v5 v5Var = (k91.v5) obj;
        if (v5Var == null) {
            return null;
        }
        try {
            if (v5Var.u0().b()) {
                ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).c8(com.tencent.mm.plugin.appbrand.service.x6.f88830u);
            } else if (v5Var.u0().c()) {
                ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Yf(com.tencent.mm.plugin.appbrand.service.x6.f88830u);
            } else {
                ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Rh(com.tencent.mm.plugin.appbrand.service.x6.f88830u);
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WXBizLogic", e17, "prefetchWxaAttrs-preloadEnv", new java.lang.Object[0]);
            return null;
        }
    }
}
