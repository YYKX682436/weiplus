package com.tencent.mm.plugin.appbrand.extendplugin;

/* loaded from: classes7.dex */
public abstract class g extends com.tencent.mm.plugin.appbrand.jsapi.f {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.page.v5 V0;
        java.lang.String str;
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandPluginAsyncJsApi", "component is null");
            return;
        }
        int D = D(jSONObject);
        if (D == -1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandPluginAsyncJsApi", "no viewId in data");
            str = android.text.TextUtils.isEmpty("fail:no viewId in data") ? "fail:internal error" : "fail:no viewId in data";
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str, jSONObject2));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime = lVar instanceof com.tencent.mm.plugin.appbrand.page.v5 ? lVar.getJsRuntime() : (!(lVar instanceof com.tencent.mm.plugin.appbrand.e9) || (V0 = ((com.tencent.mm.plugin.appbrand.e9) lVar).V0()) == null) ? null : V0.getJsRuntime();
        if (E(lVar, jSONObject, i17)) {
            return;
        }
        sf.g gVar = jsRuntime != null ? (sf.g) jsRuntime.h0(sf.g.class) : null;
        if (gVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandPluginAsyncJsApi", "invalid js runtime");
            str = android.text.TextUtils.isEmpty("fail:invalid runtime") ? "fail:internal error" : "fail:invalid runtime";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, u(str, jSONObject3));
            return;
        }
        gg.c webViewPluginClientProxy = gVar.getWebViewPluginClientProxy();
        if (webViewPluginClientProxy != null) {
            ((gg.a) webViewPluginClientProxy).e(C(), D, new com.tencent.mm.plugin.appbrand.extendplugin.b(i17, jSONObject, lVar, this));
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandPluginAsyncJsApi", "webview has no plugin client");
        str = android.text.TextUtils.isEmpty("fail:webview has no plugin client") ? "fail:internal error" : "fail:webview has no plugin client";
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        try {
            jSONObject4.put("errno", 4);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        lVar.a(i17, u(str, jSONObject4));
    }

    public abstract java.lang.String C();

    public int D(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return -1;
        }
        return jSONObject.optInt("viewId", -1);
    }

    public boolean E(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        return false;
    }
}
