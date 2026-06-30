package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class x extends com.tencent.mm.plugin.appbrand.page.m2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.y f47560i;

    public x(com.tencent.luggage.sdk.jsapi.component.service.y yVar) {
        this.f47560i = yVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.o0, com.tencent.mm.plugin.appbrand.jsapi.n5
    public /* bridge */ /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.n5 t(java.util.Map map) {
        t(map);
        return this;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.o0
    /* renamed from: w */
    public com.tencent.mm.plugin.appbrand.jsapi.o0 t(java.util.Map map) {
        org.json.JSONObject jSONObject = new org.json.JSONObject(map);
        ze.n t37 = this.f47560i.t3();
        try {
            android.util.Pair e17 = com.tencent.mm.plugin.appbrand.report.model.j.e((com.tencent.luggage.sdk.jsapi.component.b) t37.x0().getCurrentPage().getCurrentPageView());
            int intValue = ((java.lang.Integer) e17.first).intValue();
            java.lang.String str = (java.lang.String) e17.second;
            jSONObject.put("targetAction", intValue);
            jSONObject.put("targetPagePath", str);
            jSONObject.put("usedState", t37.l2().f87792h);
            jSONObject.put("isEntrance", t37.x0().getReporter().g().c(t37.x0().getCurrentUrl()));
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPageVisitStatisticsHelper", "fillEventOnAppEnterBackground ex = %s", e18);
        }
        this.f82374f = jSONObject.toString();
        return this;
    }
}
