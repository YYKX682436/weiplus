package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class o5 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "functionalPageStartGame";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 service = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        kotlin.jvm.internal.o.g(service, "service");
        java.lang.String optString = jSONObject != null ? jSONObject.optString("url", "index.html") : null;
        java.lang.String str = optString != null ? optString : "index.html";
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiFunctionalPageStartGame", "invoke: ".concat(str));
        com.tencent.mm.plugin.appbrand.page.w2 currentPage = service.t3().x0().getCurrentPage();
        if (currentPage == null || !(currentPage instanceof ce.h)) {
            service.a(i17, o("fail: current page is null or not GamePage"));
            return;
        }
        ce.h hVar = (ce.h) currentPage;
        hVar.setCurrentUrl(str);
        com.tencent.mm.plugin.appbrand.page.v5 currentPageView = hVar.getCurrentPageView();
        kotlin.jvm.internal.o.e(currentPageView, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.page.AppBrandPageViewWC");
        com.tencent.mm.plugin.appbrand.report.model.h w37 = ((com.tencent.mm.plugin.appbrand.page.n7) currentPageView).w3();
        kotlin.jvm.internal.o.e(w37, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.report.AppBrandPageViewStatisticsWC");
        com.tencent.mm.plugin.appbrand.report.t0 t0Var = (com.tencent.mm.plugin.appbrand.report.t0) w37;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        t0Var.f88405h = java.lang.System.currentTimeMillis() - t0Var.f87981a.f88421b.getStartTime();
        t0Var.f88407j = str;
        t0Var.f88406i = true;
        service.a(i17, o("ok"));
    }
}
