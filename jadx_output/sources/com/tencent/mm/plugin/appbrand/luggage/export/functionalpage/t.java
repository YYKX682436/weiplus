package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

/* loaded from: classes7.dex */
public class t extends com.tencent.mm.plugin.appbrand.o6 {

    /* renamed from: r3, reason: collision with root package name */
    public static final /* synthetic */ int f85668r3 = 0;

    /* renamed from: p3, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.d f85669p3;

    /* renamed from: q3, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.s f85670q3;

    public t(com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC) {
        super(appBrandRuntimeContainerWC);
    }

    @Override // com.tencent.mm.plugin.appbrand.o6
    public xa1.b Q2() {
        return xa1.b.f452772a;
    }

    @Override // com.tencent.mm.plugin.appbrand.o6, com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public com.tencent.mm.plugin.appbrand.ui.vc X() {
        return new com.tencent.mm.plugin.appbrand.ui.la(this.f74795d);
    }

    @Override // com.tencent.mm.plugin.appbrand.o6, ze.n, com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public ph1.h Y() {
        return new ph1.f();
    }

    @Override // com.tencent.mm.plugin.appbrand.o6, com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public com.tencent.mm.plugin.appbrand.page.i3 Z() {
        return new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k(this);
    }

    @Override // com.tencent.mm.plugin.appbrand.o6, com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public com.tencent.mm.plugin.appbrand.e9 b0() {
        return new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.f();
    }

    @Override // com.tencent.mm.plugin.appbrand.o6, ze.n, com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void b1() {
        cf.i.b("clearDuplicatedInstanceOnAppCreate", new com.tencent.mm.plugin.appbrand.g7(this));
        d3();
        com.tencent.mm.plugin.appbrand.report.quality.e.i(this);
        lm0.a aVar = com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.i.f85590d;
        x1(ui1.x.class, aVar);
        x1(eb1.c.class, aVar);
        w1(new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.q(this));
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader b17 = com.tencent.mm.plugin.appbrand.appcache.e8.b();
        if (b17 == null) {
            b17 = com.tencent.mm.plugin.appbrand.appcache.AssetReader.f75370n;
        }
        if (S2(false) != null) {
            throw new java.lang.IllegalStateException("Duplicated call!!");
        }
        b17.getClass();
        x1(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class, b17);
        p3(b17);
        new com.tencent.luggage.sdk.processes.main.LuggageRegisterTask(this).d();
        r0().setRequestedOrientation(1);
        jh1.a.a(this.f74803n);
        java.util.Map map = com.tencent.mm.plugin.appbrand.media.record.h.f85809a;
        java.lang.String str = this.f74803n;
        com.tencent.mm.plugin.appbrand.jsapi.h5_interact.a aVar2 = new com.tencent.mm.plugin.appbrand.jsapi.h5_interact.a();
        com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.B(str, aVar2);
        this.N.a(new com.tencent.mm.plugin.appbrand.jsapi.h5_interact.b(aVar2));
        com.tencent.mm.plugin.appbrand.backgroundfetch.r0.x(this);
    }

    @Override // com.tencent.mm.plugin.appbrand.o6, ze.n, com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void m1() {
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.d dVar = this.f85669p3;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = u0();
        java.lang.String invokeData = !android.text.TextUtils.isEmpty(u07.S) ? u07.S : u07.D.f77332q;
        boolean z17 = !android.text.TextUtils.isEmpty(u0().S);
        dVar.getClass();
        kotlin.jvm.internal.o.g(invokeData, "invokeData");
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.t tVar = dVar.f85577a;
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.w m0Var = tVar.u0().f47272l1 != null ? new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.m0(tVar) : z17 ? new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.l0(tVar) : new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.b0(tVar);
        dVar.f85578b = m0Var;
        m0Var.a(invokeData);
    }

    @Override // com.tencent.mm.plugin.appbrand.o6, ze.n, com.tencent.mm.plugin.appbrand.AppBrandRuntime
    public void n1(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig, java.lang.Object obj) {
        super.n1(appBrandInitConfig, obj);
        com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.s sVar = this.f85670q3;
        if (sVar != null) {
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.n nVar = (com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.jsapi.n) sVar;
            nVar.getClass();
            com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult miniProgramNavigationBackResult = obj instanceof com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult ? (com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult) obj : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.FunctionalJsApiNavigateToMiniProgram", "onReceiveReturnData navigateToAppId:" + appBrandInitConfig.f77278d + " result:" + miniProgramNavigationBackResult);
            java.util.HashMap hashMap = new java.util.HashMap();
            if ((miniProgramNavigationBackResult != null ? miniProgramNavigationBackResult.f74875e : null) != null) {
                hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, miniProgramNavigationBackResult.f74875e);
            }
            if ((miniProgramNavigationBackResult != null ? miniProgramNavigationBackResult.f74876f : null) != null) {
                hashMap.put("privateExtraData", miniProgramNavigationBackResult.f74876f);
            }
            nVar.f85619a.a(nVar.f85620b, nVar.f85621c.p("ok", hashMap));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.o6
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public final com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n N2() {
        return (com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n) super.N2();
    }
}
