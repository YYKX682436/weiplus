package com.tencent.mm.plugin.appbrand.platform.window.activity;

/* loaded from: classes7.dex */
public final class o implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f87622d = new java.util.concurrent.atomic.AtomicBoolean(true);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xi1.o f87623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f87624f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xi1.n f87625g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.platform.window.activity.q f87626h;

    public o(xi1.o oVar, boolean z17, xi1.n nVar, com.tencent.mm.plugin.appbrand.platform.window.activity.q qVar) {
        this.f87623e = oVar;
        this.f87624f = z17;
        this.f87625g = nVar;
        this.f87626h = qVar;
    }

    public void a(java.lang.String reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        if (this.f87622d.getAndSet(false)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestDeviceOrientation, will invoke outer listener reason:[");
            sb6.append(reason);
            sb6.append("], orientation:");
            xi1.o oVar = this.f87623e;
            sb6.append(oVar);
            sb6.append(" success:");
            boolean z17 = this.f87624f;
            sb6.append(z17);
            com.tencent.mars.xlog.Log.i("Luggage.WXA.ActivityWindowOrientationHandlerProxyImpl", sb6.toString());
            xi1.n nVar = this.f87625g;
            if (nVar != null) {
                nVar.e(oVar, z17);
            }
            com.tencent.mm.plugin.appbrand.platform.window.activity.r0 r0Var = this.f87626h.f87637a;
            if (oVar != null) {
                oVar.name();
            }
            r0Var.getClass();
        }
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        a((java.lang.String) obj);
        return jz5.f0.f302826a;
    }
}
