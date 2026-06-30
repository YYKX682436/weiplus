package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f;

/* loaded from: classes7.dex */
public final class o implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f169155d = new java.util.concurrent.atomic.AtomicBoolean(true);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xi1.o f169156e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f169157f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xi1.n f169158g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.q f169159h;

    public o(xi1.o oVar, boolean z17, xi1.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.q qVar) {
        this.f169156e = oVar;
        this.f169157f = z17;
        this.f169158g = nVar;
        this.f169159h = qVar;
    }

    public void a(java.lang.String reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        if (this.f169155d.getAndSet(false)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestDeviceOrientation, will invoke outer listener reason:[");
            sb6.append(reason);
            sb6.append("], orientation:");
            xi1.o oVar = this.f169156e;
            sb6.append(oVar);
            sb6.append(" success:");
            boolean z17 = this.f169157f;
            sb6.append(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.ActivityWindowOrientationHandlerProxyImpl", sb6.toString());
            xi1.n nVar = this.f169158g;
            if (nVar != null) {
                nVar.e(oVar, z17);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0 r0Var = this.f169159h.f169170a;
            if (oVar != null) {
                oVar.name();
            }
            r0Var.getClass();
        }
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo146xb9724478(java.lang.Object obj) {
        a((java.lang.String) obj);
        return jz5.f0.f384359a;
    }
}
