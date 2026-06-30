package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class yb implements xi1.n {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f168824a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xi1.n f168825b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dc f168826c;

    public yb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dc dcVar, xi1.n nVar) {
        this.f168826c = dcVar;
        this.f168825b = nVar;
    }

    @Override // xi1.n
    public void e(xi1.o oVar, boolean z17) {
        boolean andSet = this.f168824a.getAndSet(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dc dcVar = this.f168826c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.MPPageViewOrientationExtensionImpl[AppBrandSplashAd]", "resetPageOrientation, onOrientationChanged, appId[%s] url[%s] orientation[%s] success[%b], hasFiredCallback[%b]", dcVar.g(), dcVar.i(), oVar, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(andSet));
        if (andSet) {
            return;
        }
        xi1.n nVar = this.f168825b;
        if (nVar != null) {
            nVar.e(oVar, z17);
        }
        dcVar.k(false);
    }
}
