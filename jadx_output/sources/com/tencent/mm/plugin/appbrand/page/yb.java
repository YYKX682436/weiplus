package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class yb implements xi1.n {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f87291a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xi1.n f87292b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.dc f87293c;

    public yb(com.tencent.mm.plugin.appbrand.page.dc dcVar, xi1.n nVar) {
        this.f87293c = dcVar;
        this.f87292b = nVar;
    }

    @Override // xi1.n
    public void e(xi1.o oVar, boolean z17) {
        boolean andSet = this.f87291a.getAndSet(true);
        com.tencent.mm.plugin.appbrand.page.dc dcVar = this.f87293c;
        com.tencent.mars.xlog.Log.i("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "resetPageOrientation, onOrientationChanged, appId[%s] url[%s] orientation[%s] success[%b], hasFiredCallback[%b]", dcVar.g(), dcVar.i(), oVar, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(andSet));
        if (andSet) {
            return;
        }
        xi1.n nVar = this.f87292b;
        if (nVar != null) {
            nVar.e(oVar, z17);
        }
        dcVar.k(false);
    }
}
