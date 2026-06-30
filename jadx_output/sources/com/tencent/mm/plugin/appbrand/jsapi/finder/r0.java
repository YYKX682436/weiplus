package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public class r0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1173;
    public static final java.lang.String NAME = "shareFinderProduct";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, final int i17) {
        final com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (e9Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Finder.JsApiShareFinderProduct", "invoke, env is null");
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Finder.JsApiShareFinderProduct", "invoke, data is null");
            e9Var.a(i17, o("fail:data is null"));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct$ShareFinderProductRequest jsApiShareFinderProduct$ShareFinderProductRequest = new com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct$ShareFinderProductRequest();
        jsApiShareFinderProduct$ShareFinderProductRequest.f81177d = jSONObject.toString();
        com.tencent.mm.plugin.appbrand.ipc.u uVar = new com.tencent.mm.plugin.appbrand.ipc.u() { // from class: com.tencent.mm.plugin.appbrand.jsapi.finder.r0$$a
            @Override // com.tencent.mm.plugin.appbrand.ipc.u
            public final void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
                java.lang.String str;
                java.lang.String str2;
                com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct$ShareFinderProductResult jsApiShareFinderProduct$ShareFinderProductResult = (com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct$ShareFinderProductResult) appBrandProxyUIProcessTask$ProcessResult;
                com.tencent.mm.plugin.appbrand.jsapi.finder.r0 r0Var = com.tencent.mm.plugin.appbrand.jsapi.finder.r0.this;
                r0Var.getClass();
                com.tencent.mm.plugin.appbrand.e9 e9Var2 = e9Var;
                int i18 = i17;
                if (jsApiShareFinderProduct$ShareFinderProductResult == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiShareFinderProduct", "onReceiveResult, result is null");
                    str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                    str2 = str != null ? str : "";
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("errno", 0);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                    }
                    e9Var2.a(i18, r0Var.u(str2, jSONObject2));
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiShareFinderProduct", "onReceiveResult result: " + jsApiShareFinderProduct$ShareFinderProductResult.f81178d);
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                try {
                    jSONObject3.put(ya.b.METHOD, jsApiShareFinderProduct$ShareFinderProductResult.f81178d);
                    java.lang.String str4 = jsApiShareFinderProduct$ShareFinderProductResult.f81178d;
                    if (str4 == null) {
                        str4 = "";
                    }
                    if (str4.equals("tapGiveGiftEntrance")) {
                        jSONObject3.put("ticket", ((j00.u1) ((c00.i3) i95.n0.c(c00.i3.class))).Bi());
                    }
                } catch (java.lang.Exception unused) {
                }
                str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
                str2 = str != null ? str : "";
                java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                try {
                    jSONObject3.put("errno", 0);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                e9Var2.a(i18, r0Var.u(str2, jSONObject3));
            }
        };
        android.content.Context f147807d = e9Var.getF147807d();
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(f147807d, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, jsApiShareFinderProduct$ShareFinderProductRequest, uVar, null);
    }
}
