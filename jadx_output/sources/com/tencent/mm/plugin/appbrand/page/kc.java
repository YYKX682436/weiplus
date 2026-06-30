package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class kc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.mc f86837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.mc f86838e;

    public kc(com.tencent.mm.plugin.appbrand.page.mc mcVar, com.tencent.mm.plugin.appbrand.page.mc mcVar2) {
        this.f86837d = mcVar;
        this.f86838e = mcVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.page.mc mcVar = this.f86837d;
        if (!mcVar.f86885a.isRunning()) {
            com.tencent.mars.xlog.Log.e(mcVar.f86887c, "runOnUiThread in ui-thread PageView destroyed");
            return;
        }
        com.tencent.mm.plugin.appbrand.page.mc mcVar2 = this.f86838e;
        com.tencent.mars.xlog.Log.i(mcVar2.f86887c, "AppBrandPullDown OnUiThread startPullDownRefresh appId:" + mcVar2.f86885a.getAppId() + " url:" + mcVar2.f86885a.X1());
        try {
            if (mcVar2.f86885a.a2().getWebScrollY() != 0) {
                mcVar2.f86885a.a2().o0();
            }
            mcVar2.f86886b.g(true);
            mcVar2.f86886b.f();
        } catch (java.lang.NullPointerException e17) {
            com.tencent.mars.xlog.Log.e(mcVar2.f86887c, "AppBrandPullDown OnUiThread startPullDownRefresh appId:" + mcVar2.f86885a.getAppId() + " url:" + mcVar2.f86885a.X1() + " e:" + e17);
            throw e17;
        }
    }
}
