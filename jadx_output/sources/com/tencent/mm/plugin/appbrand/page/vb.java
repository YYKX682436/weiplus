package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class vb implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.dc f87181d;

    public vb(com.tencent.mm.plugin.appbrand.page.dc dcVar) {
        this.f87181d = dcVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mm.plugin.appbrand.page.dc dcVar = this.f87181d;
        if (android.text.TextUtils.isEmpty(dcVar.f86539a.X1())) {
            return;
        }
        if (dcVar.f86544f) {
            try {
                dcVar.f86539a.getPageArea().removeOnLayoutChangeListener(this);
            } catch (java.util.ConcurrentModificationException unused) {
                dcVar.f86539a.P0(new com.tencent.mm.plugin.appbrand.page.ub(this, this));
            }
        } else {
            com.tencent.mars.xlog.Log.i("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "pageArea onLayoutChange appId[%s], url[%s], frozen[%b]", dcVar.f86539a.getAppId(), dcVar.f86539a.X1(), java.lang.Boolean.valueOf(dcVar.f86545g));
            if (dcVar.f86545g) {
                dcVar.f86546h = true;
            } else {
                dcVar.e();
            }
        }
    }
}
