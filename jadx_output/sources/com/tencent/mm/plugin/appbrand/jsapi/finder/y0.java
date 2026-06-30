package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public final class y0 implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81233b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.finder.z0 f81234c;

    public y0(com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.finder.z0 z0Var) {
        this.f81232a = e9Var;
        this.f81233b = i17;
        this.f81234c = z0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderShop$ShareFinderShopResult jsApiShareFinderShop$ShareFinderShopResult = (com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiShareFinderShop$ShareFinderShopResult) appBrandProxyUIProcessTask$ProcessResult;
        com.tencent.mm.plugin.appbrand.jsapi.finder.z0 z0Var = this.f81234c;
        int i17 = this.f81233b;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81232a;
        if (jsApiShareFinderShop$ShareFinderShopResult == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiShareFinderShop", "onReceiveResult, result is null");
            z0Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, z0Var.u(str2, jSONObject));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiShareFinderShop", "onReceiveResult result: " + jsApiShareFinderShop$ShareFinderShopResult.f81181d);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put(ya.b.METHOD, jsApiShareFinderShop$ShareFinderShopResult.f81181d);
        } catch (java.lang.Exception unused) {
        }
        z0Var.getClass();
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        e9Var.a(i17, z0Var.u(str2, jSONObject2));
    }
}
