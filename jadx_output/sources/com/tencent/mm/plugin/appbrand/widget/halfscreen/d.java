package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public final class d implements vj5.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.halfscreen.f f91161d;

    public d(com.tencent.mm.plugin.appbrand.widget.halfscreen.f fVar) {
        this.f91161d = fVar;
    }

    @Override // vj5.k
    public void n6(int i17) {
        com.tencent.mm.plugin.appbrand.o6 o6Var;
        com.tencent.mm.plugin.appbrand.o6 o6Var2;
        com.tencent.mm.plugin.appbrand.o6 o6Var3;
        android.view.WindowInsets b17;
        com.tencent.mm.plugin.appbrand.widget.halfscreen.f fVar = this.f91161d;
        o6Var = fVar.f91167rt;
        android.app.Activity r07 = o6Var.r0();
        if (r07 == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onStatusBarHeightChange] newHeight=");
        sb6.append(i17);
        sb6.append("  rt.isResumed()=");
        o6Var2 = fVar.f91167rt;
        sb6.append(o6Var2.V);
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandHalfWindowLayoutManager", sb6.toString());
        o6Var3 = fVar.f91167rt;
        if (!o6Var3.V || (b17 = com.tencent.mm.ui.qk.b(r07)) == null) {
            return;
        }
        fVar.onApplyWindowInsets(b17);
    }
}
