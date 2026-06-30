package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public final class p0 extends com.tencent.mm.plugin.appbrand.utils.a1 implements im5.a {

    /* renamed from: d, reason: collision with root package name */
    public ze.n f88129d;

    /* renamed from: e, reason: collision with root package name */
    public final android.app.Application f88130e;

    public p0(ze.n nVar, com.tencent.mm.plugin.appbrand.report.o0 o0Var) {
        this.f88129d = nVar;
        nVar.keep(this);
        android.app.Application application = (android.app.Application) nVar.f74795d.getApplicationContext();
        this.f88130e = application;
        application.registerComponentCallbacks(this);
    }

    @Override // im5.a
    public void dead() {
        this.f88130e.unregisterComponentCallbacks(this);
        this.f88129d = null;
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        ze.n nVar = this.f88129d;
        if (nVar == null) {
            return;
        }
        if (i17 == 5 || i17 == 10 || i17 == 15) {
            if (nVar.u0() != null) {
                boolean k17 = this.f88129d.u0().k();
                if (i17 == 5) {
                    if (k17) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(386L, 15L, 1L, false);
                    } else {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(386L, 14L, 1L, false);
                    }
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(386L, 9L, 1L, false);
                } else if (i17 == 10) {
                    if (k17) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(386L, 13L, 1L, false);
                    } else {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(386L, 12L, 1L, false);
                    }
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(386L, 8L, 1L, false);
                } else if (i17 == 15) {
                    if (k17) {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(386L, 11L, 1L, false);
                    } else {
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(386L, 10L, 1L, false);
                    }
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(386L, 7L, 1L, false);
                }
            }
            ze.n nVar2 = this.f88129d;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandOnMemoryWarningReceiveEvent", "memory warning receive event dispatch, appId:%s, initialized:%b, level:%d", nVar2.f74803n, java.lang.Boolean.valueOf(nVar2.J0()), java.lang.Integer.valueOf(i17));
            if (nVar2.J0()) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put(ya.b.LEVEL, java.lang.Integer.valueOf(i17));
                com.tencent.mm.plugin.appbrand.jsapi.u0 u0Var = new com.tencent.mm.plugin.appbrand.jsapi.u0();
                u0Var.u(nVar2.C0());
                u0Var.t(hashMap);
                u0Var.m();
            }
        }
    }
}
