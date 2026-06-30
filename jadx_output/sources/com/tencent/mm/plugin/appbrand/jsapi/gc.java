package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class gc extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 118;
    private static final java.lang.String NAME = "refreshSession";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.JsApiRefreshSession$RefreshSessionTask jsApiRefreshSession$RefreshSessionTask = new com.tencent.mm.plugin.appbrand.jsapi.JsApiRefreshSession$RefreshSessionTask();
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        if (z0Var != null) {
            jsApiRefreshSession$RefreshSessionTask.f78607p = z0Var.f305852r.f75399d;
        }
        java.lang.String appId = lVar.getAppId();
        jsApiRefreshSession$RefreshSessionTask.f78600f = this;
        jsApiRefreshSession$RefreshSessionTask.f78601g = lVar;
        jsApiRefreshSession$RefreshSessionTask.f78602h = i17;
        jsApiRefreshSession$RefreshSessionTask.f78603i = appId;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject d17 = com.tencent.mm.plugin.appbrand.l.d(appId);
        if (d17 != null) {
            jsApiRefreshSession$RefreshSessionTask.f78608q = d17.f87790f;
        }
        jsApiRefreshSession$RefreshSessionTask.d();
    }
}
