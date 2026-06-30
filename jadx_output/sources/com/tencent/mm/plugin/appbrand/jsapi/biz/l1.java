package com.tencent.mm.plugin.appbrand.jsapi.biz;

/* loaded from: classes7.dex */
public final class l1 implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f79983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79984b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.biz.m1 f79985c;

    public l1(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.biz.m1 m1Var) {
        this.f79983a = lVar;
        this.f79984b = i17;
        this.f79985c = m1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiStartBindPhone$BindPhoneResult jsApiStartBindPhone$BindPhoneResult = (com.tencent.mm.plugin.appbrand.jsapi.biz.JsApiStartBindPhone$BindPhoneResult) appBrandProxyUIProcessTask$ProcessResult;
        int i17 = jsApiStartBindPhone$BindPhoneResult.f79949d;
        com.tencent.mm.plugin.appbrand.jsapi.biz.m1 m1Var = this.f79985c;
        int i18 = this.f79984b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f79983a;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartBindPhone", "startBindPhone return, already bound");
            m1Var.getClass();
            java.lang.String str = android.text.TextUtils.isEmpty("fail: already bound") ? "fail:internal error" : "fail: already bound";
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i18, m1Var.u(str, jSONObject));
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("bound", jsApiStartBindPhone$BindPhoneResult.f79950e);
        m1Var.getClass();
        java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        lVar.a(i18, m1Var.u(str3, jSONObject2));
    }
}
