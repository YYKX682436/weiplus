package ce;

/* loaded from: classes7.dex */
public class n implements ni1.e, xi1.n, ni1.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f122214a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f122215b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f122216c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f122217d = false;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        this.f122214a = v5Var;
        this.f122215b = str;
    }

    @Override // ni1.e
    public boolean a() {
        return false;
    }

    @Override // ni1.c
    public void b() {
        this.f122216c = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f122214a;
        if (v5Var.C1() == null || !v5Var.C1().c()) {
            d(null);
        } else {
            v5Var.C1().d(new ce.m(this));
        }
        d(null);
    }

    @Override // ni1.c
    public void c() {
        this.f122216c = false;
    }

    @Override // ni1.e
    public void d(xi1.n nVar) {
        boolean z17 = this.f122217d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f122214a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.WAGamePageViewOrientationExtensionImpl[AppBrandSplashAd]", "resetPageOrientation but destroyed, appId:%s", v5Var.mo48798x74292566());
            return;
        }
        if (v5Var.mo50261xee5260a9() == null || v5Var.mo50261xee5260a9().mo51612x60543150() == null) {
            if (nVar != null) {
                nVar.e(null, false);
            }
        } else {
            if (v5Var.t3().W0()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("Luggage.WAGamePageViewOrientationExtensionImpl[AppBrandSplashAd]", "resetPageOrientation, game is showing launch ad, ignore changing orientation", new java.lang.Object[0]);
                if (nVar != null) {
                    nVar.e(null, false);
                    return;
                }
                return;
            }
            xi1.o d17 = xi1.o.d(this.f122215b);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("Luggage.WAGamePageViewOrientationExtensionImpl[AppBrandSplashAd]", "resetPageOrientation, appId[%s], orientation[%s]", v5Var.mo48798x74292566(), d17);
            if (d17 != null) {
                v5Var.mo50261xee5260a9().mo51612x60543150().b(d17, new ce.l(this, nVar));
            }
        }
    }

    @Override // xi1.n
    public void e(xi1.o oVar, boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = oVar == null ? "null" : oVar.name();
        objArr[1] = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WAGamePageViewOrientationExtensionImpl[AppBrandSplashAd]", "onOrientationChanged requested[%s], success[%b]", objArr);
    }

    @Override // ni1.e
    public void f(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WAGamePageViewOrientationExtensionImpl[AppBrandSplashAd]", "setRequestedOrientation[%s] appId[%s]", str, this.f122214a.mo48798x74292566());
        if (str == null || str.isEmpty()) {
            return;
        }
        this.f122215b = str;
    }

    @Override // ni1.e
    /* renamed from: getRequestedOrientation */
    public java.lang.String mo14689x776c71f8() {
        return this.f122215b;
    }

    @Override // ni1.c
    /* renamed from: onConfigurationChanged */
    public void mo14690x50e1c15d(android.content.res.Configuration configuration) {
    }

    @Override // ni1.c
    /* renamed from: onDestroy */
    public void mo14691xac79a11b() {
        this.f122216c = false;
        this.f122217d = true;
    }
}
