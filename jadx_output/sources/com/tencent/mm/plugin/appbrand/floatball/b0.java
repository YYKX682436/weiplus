package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.u f78070d;

    public b0(com.tencent.mm.plugin.appbrand.floatball.u uVar) {
        this.f78070d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallLogic", "run pause, runtime:%s", this.f78070d.f78147a.f74803n);
        if (this.f78070d.f78150d != null) {
            this.f78070d.f78150d.z();
        }
        if (this.f78070d.f78151e != null) {
            this.f78070d.f78151e.z();
        }
        if (this.f78070d.f78152f != null) {
            this.f78070d.f78152f.z();
        }
        if (this.f78070d.f78154h != null) {
            this.f78070d.f78154h.z();
        }
        if (this.f78070d.f78153g != null) {
            this.f78070d.f78153g.z();
        }
        if (this.f78070d.f78155i != null) {
            this.f78070d.f78155i.z();
        }
        com.tencent.mm.plugin.appbrand.floatball.i c17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0.c(this.f78070d.f78147a);
        if (c17 != null) {
            c17.z();
        }
        if (this.f78070d.f78156j != null) {
            com.tencent.mm.plugin.appbrand.floatball.l0 l0Var = this.f78070d.f78156j;
            l0Var.getClass();
            com.tencent.mm.plugin.appbrand.floatball.l0.f78114b.g("onExitPage", new com.tencent.mm.plugin.appbrand.floatball.k0(l0Var), 5000L);
        }
    }
}
