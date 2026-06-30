package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public class i0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1366;
    public static final java.lang.String NAME = "shareCurrentFinderLive";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, final int i17) {
        final com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (e9Var == null) {
            com.tencent.mars.xlog.Log.w("JsApiShareCurrentLive", "invoke, env is null");
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("JsApiShareCurrentLive", "invoke, data is null");
            e9Var.a(i17, o("fail:data is null"));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareCurrentLive$ShareCurrentLiveRequest jsApiShareCurrentLive$ShareCurrentLiveRequest = new com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareCurrentLive$ShareCurrentLiveRequest();
        jsApiShareCurrentLive$ShareCurrentLiveRequest.f81169d = jSONObject.toString();
        com.tencent.mm.plugin.appbrand.ipc.u uVar = new com.tencent.mm.plugin.appbrand.ipc.u() { // from class: com.tencent.mm.plugin.appbrand.jsapi.finder.i0$$a
            @Override // com.tencent.mm.plugin.appbrand.ipc.u
            public final void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
                java.lang.String str;
                java.lang.String str2;
                com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareCurrentLive$ShareCurrentLiveResult jsApiShareCurrentLive$ShareCurrentLiveResult = (com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareCurrentLive$ShareCurrentLiveResult) appBrandProxyUIProcessTask$ProcessResult;
                com.tencent.mm.plugin.appbrand.jsapi.finder.i0 i0Var = com.tencent.mm.plugin.appbrand.jsapi.finder.i0.this;
                i0Var.getClass();
                com.tencent.mm.plugin.appbrand.e9 e9Var2 = e9Var;
                int i18 = i17;
                if (jsApiShareCurrentLive$ShareCurrentLiveResult == null) {
                    com.tencent.mars.xlog.Log.i("JsApiShareCurrentLive", "onReceiveResult, result is null");
                    str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                    str2 = str != null ? str : "";
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("errno", 0);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                    }
                    e9Var2.a(i18, i0Var.u(str2, jSONObject2));
                    return;
                }
                com.tencent.mars.xlog.Log.i("JsApiShareCurrentLive", "onReceiveResult result: " + jsApiShareCurrentLive$ShareCurrentLiveResult.f81170d);
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put(ya.b.METHOD, jsApiShareCurrentLive$ShareCurrentLiveResult.f81170d);
                } catch (java.lang.Exception unused) {
                }
                str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                str2 = str != null ? str : "";
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                try {
                    jSONObject3.put("errno", 0);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                e9Var2.a(i18, i0Var.u(str2, jSONObject3));
            }
        };
        android.content.Context f147807d = e9Var.getF147807d();
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(f147807d, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, jsApiShareCurrentLive$ShareCurrentLiveRequest, uVar, null);
    }
}
