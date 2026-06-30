package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class hc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.mc f86689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.mc f86690e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ni1.g f86691f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f86692g;

    public hc(com.tencent.mm.plugin.appbrand.page.mc mcVar, com.tencent.mm.plugin.appbrand.page.mc mcVar2, ni1.g gVar, int i17) {
        this.f86689d = mcVar;
        this.f86690e = mcVar2;
        this.f86691f = gVar;
        this.f86692g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.page.mc mcVar = this.f86689d;
        if (!mcVar.f86885a.isRunning()) {
            com.tencent.mars.xlog.Log.e(mcVar.f86887c, "runOnUiThread in ui-thread PageView destroyed");
            return;
        }
        com.tencent.mm.plugin.appbrand.page.p8 p8Var = this.f86690e.f86886b;
        p8Var.setBackgroundTextStyle(this.f86691f.name().toLowerCase());
        p8Var.setPullDownBackgroundColor(this.f86692g);
    }
}
