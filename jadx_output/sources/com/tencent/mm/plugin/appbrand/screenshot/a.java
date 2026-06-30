package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class a extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.screenshot.e f88463d;

    public a(com.tencent.mm.plugin.appbrand.screenshot.e eVar) {
        this.f88463d = eVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void e(com.tencent.mm.plugin.appbrand.w0 w0Var) {
        com.tencent.mm.plugin.appbrand.screenshot.e eVar = this.f88463d;
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.appbrand.screenshot.e.a(eVar), "onPause, stopWatching");
        com.tencent.mm.plugin.appbrand.screenshot.t1 t1Var = eVar.f88477d;
        com.tencent.mm.plugin.appbrand.screenshot.s1 s1Var = t1Var.f88564a;
        if (s1Var != null) {
            s1Var.stopWatching();
        }
        com.tencent.mm.plugin.appbrand.screenshot.s1 s1Var2 = t1Var.f88565b;
        if (s1Var2 != null) {
            s1Var2.stopWatching();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void g() {
        com.tencent.mm.plugin.appbrand.screenshot.e eVar = this.f88463d;
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.appbrand.screenshot.e.a(eVar), "onResume, startWatching");
        com.tencent.mm.plugin.appbrand.screenshot.t1 t1Var = eVar.f88477d;
        com.tencent.mm.plugin.appbrand.screenshot.s1 s1Var = t1Var.f88564a;
        if (s1Var != null) {
            s1Var.startWatching();
        }
        com.tencent.mm.plugin.appbrand.screenshot.s1 s1Var2 = t1Var.f88565b;
        if (s1Var2 != null) {
            s1Var2.startWatching();
        }
    }
}
