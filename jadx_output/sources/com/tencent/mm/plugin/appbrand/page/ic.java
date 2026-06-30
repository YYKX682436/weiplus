package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class ic implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.mc f86770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.mc f86771e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86772f;

    public ic(com.tencent.mm.plugin.appbrand.page.mc mcVar, com.tencent.mm.plugin.appbrand.page.mc mcVar2, java.lang.String str) {
        this.f86770d = mcVar;
        this.f86771e = mcVar2;
        this.f86772f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.page.mc mcVar = this.f86770d;
        if (mcVar.f86885a.isRunning()) {
            this.f86771e.f86886b.setBackgroundTextStyle(this.f86772f);
        } else {
            com.tencent.mars.xlog.Log.e(mcVar.f86887c, "runOnUiThread in ui-thread PageView destroyed");
        }
    }
}
