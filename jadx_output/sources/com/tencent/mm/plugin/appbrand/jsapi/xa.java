package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class xa extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 430;
    public static final java.lang.String NAME = "pageNotFoundCallback";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = (com.tencent.luggage.sdk.jsapi.component.service.y) lVar;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPageNotFoundCallback", "data is null, do nothing");
            yVar.a(i17, o("fail"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPageNotFoundCallback", "pageNotFoundCallback data:%s", jSONObject);
        boolean optBoolean = jSONObject.optBoolean("hasHandler", false);
        int optInt = jSONObject.optInt("webviewId", -1);
        com.tencent.luggage.sdk.jsapi.component.b V0 = yVar.V0();
        if (!optBoolean) {
            if (V0 != null && V0.getComponentId() == optInt) {
                V0.m(new com.tencent.mm.plugin.appbrand.jsapi.wa(this, V0));
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPageNotFoundCallback", "currentPageView is null, return");
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, u(str2, jSONObject2));
            return;
        }
        if (V0 != null) {
            V0.q3(true);
            if (V0.getComponentId() != optInt) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPageNotFoundCallback", "appBrandPageView.getCurrentPageId():%d, webviewId:%d, mismatch", java.lang.Integer.valueOf(V0.getComponentId()), java.lang.Integer.valueOf(optInt));
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPageNotFoundCallback", "appBrandPageView is null");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPageNotFoundCallback", "already handler, ignore");
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        yVar.a(i17, u(str2, jSONObject3));
    }
}
