package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes5.dex */
public final class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandCheckWxaShortLinkUI f89723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f89724e;

    public g1(com.tencent.mm.plugin.appbrand.ui.AppBrandCheckWxaShortLinkUI appBrandCheckWxaShortLinkUI, java.lang.ref.WeakReference weakReference) {
        this.f89723d = appBrandCheckWxaShortLinkUI;
        this.f89724e = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCheckWxaShortLinkUI", "check short link timeout");
        com.tencent.mm.plugin.appbrand.ui.AppBrandCheckWxaShortLinkUI appBrandCheckWxaShortLinkUI = this.f89723d;
        appBrandCheckWxaShortLinkUI.f89332f.set(true);
        db5.t7.makeText(appBrandCheckWxaShortLinkUI, appBrandCheckWxaShortLinkUI.getContext().getString(com.tencent.mm.R.string.f490662a51), 1).show();
        com.tencent.mm.plugin.appbrand.ui.AppBrandCheckWxaShortLinkUI appBrandCheckWxaShortLinkUI2 = (com.tencent.mm.plugin.appbrand.ui.AppBrandCheckWxaShortLinkUI) this.f89724e.get();
        if (appBrandCheckWxaShortLinkUI2 != null) {
            appBrandCheckWxaShortLinkUI2.finish();
        }
    }
}
