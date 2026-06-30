package ce;

/* loaded from: classes7.dex */
public class n implements ni1.e, xi1.n, ni1.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.v5 f40681a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f40682b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40683c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40684d = false;

    public n(com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str) {
        this.f40681a = v5Var;
        this.f40682b = str;
    }

    @Override // ni1.e
    public boolean a() {
        return false;
    }

    @Override // ni1.c
    public void b() {
        this.f40683c = true;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f40681a;
        if (v5Var.C1() == null || !v5Var.C1().c()) {
            d(null);
        } else {
            v5Var.C1().d(new ce.m(this));
        }
        d(null);
    }

    @Override // ni1.c
    public void c() {
        this.f40683c = false;
    }

    @Override // ni1.e
    public void d(xi1.n nVar) {
        boolean z17 = this.f40684d;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f40681a;
        if (z17) {
            com.tencent.mars.xlog.Log.w("Luggage.WAGamePageViewOrientationExtensionImpl[AppBrandSplashAd]", "resetPageOrientation but destroyed, appId:%s", v5Var.getAppId());
            return;
        }
        if (v5Var.getWindowAndroid() == null || v5Var.getWindowAndroid().getOrientationHandler() == null) {
            if (nVar != null) {
                nVar.e(null, false);
            }
        } else {
            if (v5Var.t3().W0()) {
                com.tencent.mm.sdk.platformtools.Log.c("Luggage.WAGamePageViewOrientationExtensionImpl[AppBrandSplashAd]", "resetPageOrientation, game is showing launch ad, ignore changing orientation", new java.lang.Object[0]);
                if (nVar != null) {
                    nVar.e(null, false);
                    return;
                }
                return;
            }
            xi1.o d17 = xi1.o.d(this.f40682b);
            com.tencent.mm.sdk.platformtools.Log.c("Luggage.WAGamePageViewOrientationExtensionImpl[AppBrandSplashAd]", "resetPageOrientation, appId[%s], orientation[%s]", v5Var.getAppId(), d17);
            if (d17 != null) {
                v5Var.getWindowAndroid().getOrientationHandler().b(d17, new ce.l(this, nVar));
            }
        }
    }

    @Override // xi1.n
    public void e(xi1.o oVar, boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = oVar == null ? "null" : oVar.name();
        objArr[1] = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("Luggage.WAGamePageViewOrientationExtensionImpl[AppBrandSplashAd]", "onOrientationChanged requested[%s], success[%b]", objArr);
    }

    @Override // ni1.e
    public void f(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Luggage.WAGamePageViewOrientationExtensionImpl[AppBrandSplashAd]", "setRequestedOrientation[%s] appId[%s]", str, this.f40681a.getAppId());
        if (str == null || str.isEmpty()) {
            return;
        }
        this.f40682b = str;
    }

    @Override // ni1.e
    public java.lang.String getRequestedOrientation() {
        return this.f40682b;
    }

    @Override // ni1.c
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // ni1.c
    public void onDestroy() {
        this.f40683c = false;
        this.f40684d = true;
    }
}
