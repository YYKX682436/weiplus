package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class ec implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.mc f86576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.mc f86577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f86578f;

    public ec(com.tencent.mm.plugin.appbrand.page.mc mcVar, com.tencent.mm.plugin.appbrand.page.mc mcVar2, boolean z17) {
        this.f86576d = mcVar;
        this.f86577e = mcVar2;
        this.f86578f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.page.mc mcVar = this.f86576d;
        if (mcVar.f86885a.isRunning()) {
            this.f86577e.f86886b.setPullDownEnabled(this.f86578f);
        } else {
            com.tencent.mars.xlog.Log.e(mcVar.f86887c, "runOnUiThread in ui-thread PageView destroyed");
        }
    }
}
