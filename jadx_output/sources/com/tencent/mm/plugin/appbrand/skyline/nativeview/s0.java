package com.tencent.mm.plugin.appbrand.skyline.nativeview;

/* loaded from: classes7.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.skyline.nativeview.t0 f88943d;

    public s0(com.tencent.mm.plugin.appbrand.skyline.nativeview.t0 t0Var) {
        this.f88943d = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("component:");
        com.tencent.mm.plugin.appbrand.skyline.nativeview.t0 t0Var = this.f88943d;
        sf.f fVar = t0Var.f88948i;
        sb6.append(fVar != null ? fVar.m() : null);
        sb6.append(" onRenderStart id:");
        sb6.append(t0Var.f252497d);
        com.tencent.mars.xlog.Log.i("SkylineNativeViewPluginHandler", sb6.toString());
        sf.f fVar2 = t0Var.f88948i;
        java.lang.Object m17 = fVar2 != null ? fVar2.m() : null;
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = m17 instanceof com.tencent.mm.plugin.appbrand.page.n7 ? (com.tencent.mm.plugin.appbrand.page.n7) m17 : null;
        if (n7Var != null) {
            n7Var.k4();
        }
    }
}
