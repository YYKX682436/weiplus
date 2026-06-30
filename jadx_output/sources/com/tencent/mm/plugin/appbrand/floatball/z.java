package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.u f78179d;

    public z(com.tencent.mm.plugin.appbrand.floatball.u uVar) {
        this.f78179d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallLogic", "run resume, runtime:%s", this.f78179d.f78147a.f74803n);
        if (this.f78179d.f78150d != null) {
            this.f78179d.f78150d.x();
        }
        if (this.f78179d.f78151e != null) {
            this.f78179d.f78151e.x();
        }
        if (this.f78179d.f78152f != null) {
            this.f78179d.f78152f.x();
        }
        if (this.f78179d.f78154h != null) {
            this.f78179d.f78154h.x();
        }
        if (this.f78179d.f78153g != null) {
            this.f78179d.f78153g.x();
        }
        if (this.f78179d.f78155i != null) {
            this.f78179d.f78155i.x();
        }
        com.tencent.mm.plugin.appbrand.floatball.i c17 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.w0.c(this.f78179d.f78147a);
        if (c17 != null) {
            c17.x();
        }
        if (this.f78179d.f78156j != null) {
            com.tencent.mm.plugin.appbrand.floatball.l0 l0Var = this.f78179d.f78156j;
            l0Var.getClass();
            com.tencent.mm.plugin.appbrand.floatball.l0.f78114b.g("onEnterPage", new com.tencent.mm.plugin.appbrand.floatball.i0(l0Var), 5000L);
        }
    }
}
