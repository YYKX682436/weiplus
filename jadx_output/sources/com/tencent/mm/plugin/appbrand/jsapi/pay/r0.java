package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public final class r0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f82656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.x0 f82658f;

    public r0(com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.pay.x0 x0Var) {
        this.f82656d = d0Var;
        this.f82657e = i17;
        this.f82658f = x0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayResponse jsApiReportCrossPlatformPayResponse = (com.tencent.mm.plugin.appbrand.jsapi.pay.JsApiReportCrossPlatformPayResponse) obj;
        java.lang.String str = jsApiReportCrossPlatformPayResponse != null ? jsApiReportCrossPlatformPayResponse.f82553d : null;
        com.tencent.mm.plugin.appbrand.jsapi.pay.x0 x0Var = this.f82658f;
        int i17 = this.f82657e;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f82656d;
        if (str != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiReportCrossPlatformPay", "callback sessionId: ".concat(str));
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, str);
            x0Var.getClass();
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 0);
            d0Var.a(i17, x0Var.t("ok", hashMap));
            com.tencent.mm.plugin.appbrand.jsapi.pay.q0 q0Var = new com.tencent.mm.plugin.appbrand.jsapi.pay.q0();
            q0Var.t(hashMap);
            d0Var.p(q0Var);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiReportCrossPlatformPay", "callback sessionId is null");
        x0Var.getClass();
        java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 4);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        d0Var.a(i17, x0Var.u(str3, jSONObject));
    }
}
