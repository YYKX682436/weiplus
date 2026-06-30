package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class o8 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 865;
    public static final java.lang.String NAME = "private_onWebPageUrlExposed";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String optString = jSONObject != null ? jSONObject.optString("urlList") : null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            new com.tencent.mm.plugin.appbrand.jsapi.JsApiOnWebPageUrlExposed$WebPagePrefetchTask(this, lVar, i17, optString, jSONObject != null ? jSONObject.optInt("bizType") : 0).d();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOnWebPageUrlExposed", "fail:urlList is null");
        if (lVar != null) {
            lVar.a(i17, o("fail:urlList is null"));
        }
    }
}
