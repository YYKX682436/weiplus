package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public class o extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.o0 f87517d;

    public o(com.tencent.mm.plugin.appbrand.pip.o0 o0Var) {
        this.f87517d = o0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        pd1.o oVar;
        com.tencent.mars.xlog.Log.i(this.f87517d.f87518a, "onDestroy");
        com.tencent.mm.plugin.appbrand.pip.c cVar = this.f87517d.f87533p;
        if (cVar != null && (oVar = cVar.f87436h) != null) {
            oVar.release();
        }
        this.f87517d.f87521d.setPipPageLifeCycleListener(null);
        com.tencent.mm.plugin.appbrand.x0.e(this.f87517d.f87520c.f74803n, this);
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void e(com.tencent.mm.plugin.appbrand.w0 w0Var) {
        com.tencent.mars.xlog.Log.i(this.f87517d.f87518a, "onPause, type: " + w0Var);
        this.f87517d.D = true;
        com.tencent.mm.plugin.appbrand.pip.o0 o0Var = this.f87517d;
        if (o0Var.f87536s) {
            com.tencent.mars.xlog.Log.i(o0Var.f87518a, "pipVideo has stopped, skip");
            return;
        }
        if (o0Var.f87533p == null) {
            return;
        }
        if (o0Var.f87530m != null) {
            o0Var.a("onPause");
        }
        pd1.o oVar = this.f87517d.f87533p.f87436h;
        if (oVar != null) {
            if (oVar.b()) {
                com.tencent.mars.xlog.Log.i(this.f87517d.f87518a, "background play enabled, skip");
                return;
            }
            com.tencent.mm.plugin.appbrand.jsapi.media.w1 g17 = oVar.g();
            com.tencent.mars.xlog.Log.i(this.f87517d.f87518a, "onPause, autoPauseStrategy: %s", g17);
            if (!g17.a(this.f87517d.f87520c.C0(), w0Var)) {
                com.tencent.mars.xlog.Log.i(this.f87517d.f87518a, "onPause, not need pause video play");
            } else {
                com.tencent.mars.xlog.Log.i(this.f87517d.f87518a, "onPause, pause");
                oVar.pause();
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void g() {
        com.tencent.mars.xlog.Log.i(this.f87517d.f87518a, "onResume");
        this.f87517d.D = false;
        com.tencent.mm.plugin.appbrand.pip.o0 o0Var = this.f87517d;
        if (o0Var.f87536s) {
            com.tencent.mars.xlog.Log.i(o0Var.f87518a, "pipVideo has stopped, skip");
            return;
        }
        if (o0Var.f87533p == null) {
            return;
        }
        if (o0Var.f87530m != null) {
            o0Var.f87543z.requestFocus();
        }
        pd1.o oVar = this.f87517d.f87533p.f87436h;
        if (oVar != null) {
            if (oVar.b()) {
                com.tencent.mars.xlog.Log.i(this.f87517d.f87518a, "background play enabled, skip");
            } else {
                com.tencent.mars.xlog.Log.i(this.f87517d.f87518a, "onResume, start");
                oVar.start();
            }
        }
    }
}
