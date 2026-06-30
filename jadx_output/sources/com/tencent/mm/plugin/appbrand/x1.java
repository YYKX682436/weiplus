package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class x1 extends com.tencent.mm.sdk.event.n {
    public x1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        if (((com.tencent.mm.autogen.events.ActivateEvent) iEvent).f53964g.f6412a) {
            com.tencent.mm.plugin.appbrand.appcache.q3 q3Var = com.tencent.mm.plugin.appbrand.appcache.l3.f75641a;
            q3Var.getClass();
            try {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1007, 2);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.PkgCleanupNewLogic", th6, "cleanup interrupted report", new java.lang.Object[0]);
            }
            q3Var.f75911d.set(true);
            com.tencent.mm.plugin.appbrand.ad adVar = q3Var.f75913f;
            if (adVar != null) {
                adVar.f74896a.set(true);
                q3Var.f75913f = null;
            }
        } else if (gm0.j1.a()) {
            com.tencent.mm.plugin.appbrand.w1.a();
        }
        return false;
    }
}
