package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f;

/* loaded from: classes7.dex */
public final class p implements xi1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f169164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f169165b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi1.n f169166c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.q f169167d;

    public p(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, android.view.View view, xi1.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.q qVar) {
        this.f169164a = atomicBoolean;
        this.f169165b = view;
        this.f169166c = nVar;
        this.f169167d = qVar;
    }

    @Override // xi1.n
    public final void e(xi1.o oVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.ActivityWindowOrientationHandlerProxyImpl", "requestDeviceOrientation, callback from AppBrandDeviceOrientationHandler, orientation:" + oVar + ", success:" + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.o oVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.o(oVar, z17, this.f169166c, this.f169167d);
        if (!z17 || this.f169164a.get()) {
            oVar2.a("syncReturn");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.m mVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.m(oVar2);
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        android.view.View view = this.f169165b;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r(f0Var, 2, view, mVar));
        view.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.n(oVar2), 100L);
    }
}
