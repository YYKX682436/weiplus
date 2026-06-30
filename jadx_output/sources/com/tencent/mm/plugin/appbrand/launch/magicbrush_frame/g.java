package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

/* loaded from: classes7.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC f84282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.m f84283e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC, com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f84282d = appBrandSysConfigWC;
        this.f84283e = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.g(this.f84282d, this.f84283e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.g gVar = (com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.appbrand.launching.u2 u2Var = com.tencent.mm.plugin.appbrand.launching.v2.f85246h;
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC = this.f84282d;
        java.lang.String appId = appBrandSysConfigWC.f305842e;
        kotlin.jvm.internal.o.f(appId, "appId");
        com.tencent.mm.plugin.appbrand.launching.u2.a(u2Var, appId, false, appBrandSysConfigWC, 0L, 8, null);
        com.tencent.mm.plugin.appbrand.appstorage.p pVar = com.tencent.mm.plugin.appbrand.appstorage.p.f76297a;
        java.lang.String appId2 = appBrandSysConfigWC.f305842e;
        kotlin.jvm.internal.o.f(appId2, "appId");
        appBrandSysConfigWC.f305853s = pVar.a(appId2);
        synchronized (com.tencent.mm.plugin.appbrand.appstorage.t.f76321a) {
            com.tencent.mm.plugin.appbrand.app.r9.wi().getClass();
            com.tencent.mm.plugin.appbrand.app.r9.mj();
        }
        appBrandSysConfigWC.f305854t = false;
        w81.a aVar2 = w81.a.f443806a;
        java.lang.String appId3 = appBrandSysConfigWC.f305842e;
        kotlin.jvm.internal.o.f(appId3, "appId");
        this.f84283e.getClass();
        appBrandSysConfigWC.f305855u = aVar2.a(appId3, com.tencent.mm.sdk.platformtools.x2.n() ? gm0.j1.b().h() : gm0.m.i());
        return jz5.f0.f302826a;
    }
}
