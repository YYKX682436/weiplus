package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes14.dex */
public final class dd implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f84576a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.bd f84577b;

    public dd(com.tencent.mm.plugin.appbrand.launching.bd bdVar) {
        this.f84577b = bdVar;
    }

    @Override // l81.e1
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WeAppOpenActivityStartHelper", "onAppBrandProcessDied");
        h(false);
    }

    @Override // l81.e1
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WeAppOpenActivityStartHelper", "onAppBrandPreconditionError");
        h(false);
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WeAppOpenActivityStartHelper", "onTriggerHalfScreenShare, token: " + str);
    }

    @Override // l81.e1
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WeAppOpenActivityStartHelper", "onAppBrandUIEnter");
        h(true);
    }

    @Override // l81.e1
    public void f(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WeAppOpenActivityStartHelper", "onAppBrandUIExit, isFinish: " + z17);
    }

    @Override // l81.e1
    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WeAppOpenActivityStartHelper", "onStartAppBrandUI");
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.appbrand.launching.cd cdVar = new com.tencent.mm.plugin.appbrand.launching.cd(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(cdVar, 5000L, false);
    }

    public final void h(boolean z17) {
        if (this.f84576a.compareAndSet(false, true)) {
            dm1.o oVar = (dm1.o) this.f84577b;
            com.tencent.mars.xlog.Log.i("MicroMsg.WmpfVoipCallInProxyActivity", "enterWxaVoipCallingPage for appId:" + oVar.f241661a + ", instanceId:" + oVar.f241662b + ", success:" + z17);
            oVar.f241663c.finish();
            com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
            if (h6Var != null) {
                ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).hj(this);
            }
        }
    }
}
