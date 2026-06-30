package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class q implements com.tencent.mm.plugin.appbrand.utils.b3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f47516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f47517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.n f47518c;

    public q(com.tencent.luggage.sdk.jsapi.component.service.n nVar, long j17, boolean z17) {
        this.f47518c = nVar;
        this.f47516a = j17;
        this.f47517b = z17;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("Luggage.AppBrandMiniProgramServiceLogicImp", "Inject EnvBootstrapScript Script Failed");
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.b3
    public void onSuccess(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandMiniProgramServiceLogicImp", "Inject EnvBootstrapScript Script Success");
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = (com.tencent.luggage.sdk.jsapi.component.service.y) this.f47518c.F();
        if (yVar == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f47516a;
        boolean z17 = this.f47517b;
        cl.r3.c(3, currentTimeMillis, z17 ? 1 : 0, yVar.getAppId(), -1, 0, yVar.x().i());
    }
}
