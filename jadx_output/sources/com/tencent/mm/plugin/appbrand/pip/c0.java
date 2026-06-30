package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public class c0 implements com.tencent.mm.plugin.appbrand.jsapi.media.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.o0 f87438a;

    public c0(com.tencent.mm.plugin.appbrand.pip.o0 o0Var) {
        this.f87438a = o0Var;
    }

    public final boolean a() {
        if (this.f87438a.D) {
            com.tencent.mars.xlog.Log.i(this.f87438a.f87518a, "interceptAudioFocusChange, runtime paused");
            return true;
        }
        com.tencent.mm.plugin.appbrand.pip.o0 o0Var = this.f87438a;
        if (o0Var.f87533p == null) {
            java.lang.String str = o0Var.f87518a;
            return true;
        }
        if (o0Var.f87530m != null && (!o0Var.f87538u || !o0Var.f87539v)) {
            return false;
        }
        java.lang.String str2 = o0Var.f87518a;
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.r1
    public void onPause() {
        com.tencent.mm.plugin.appbrand.pip.o0 o0Var = this.f87438a;
        com.tencent.mars.xlog.Log.i(o0Var.f87518a, "onPause");
        if (a()) {
            return;
        }
        o0Var.f87533p.f87436h.pause();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.r1
    public void onResume() {
        com.tencent.mm.plugin.appbrand.pip.o0 o0Var = this.f87438a;
        com.tencent.mars.xlog.Log.i(o0Var.f87518a, "onResume");
        if (a()) {
            return;
        }
        o0Var.f87533p.f87436h.start();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.r1
    public void onStop() {
        com.tencent.mm.plugin.appbrand.pip.o0 o0Var = this.f87438a;
        com.tencent.mars.xlog.Log.i(o0Var.f87518a, "onStop");
        if (a()) {
            return;
        }
        o0Var.f87533p.f87436h.pause();
    }
}
