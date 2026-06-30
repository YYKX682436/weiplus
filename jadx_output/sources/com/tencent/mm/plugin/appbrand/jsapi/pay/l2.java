package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes.dex */
public final class l2 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f82627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.m2 f82629c;

    public l2(com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.pay.m2 m2Var) {
        this.f82627a = d0Var;
        this.f82628b = i17;
        this.f82629c = m2Var;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        if (i17 != 34) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestWCPayRealnameVerify", "result code not equal");
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.pay.m2 m2Var = this.f82629c;
        int i19 = this.f82628b;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f82627a;
        if (i18 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestWCPayRealnameVerify", "result ok");
            m2Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            d0Var.a(i19, m2Var.u(str2, jSONObject));
        } else if (i18 != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestWCPayRealnameVerify", "result cancel");
            m2Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 1);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            d0Var.a(i19, m2Var.u(str2, jSONObject2));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestWCPayRealnameVerify", "result fail");
            m2Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            d0Var.a(i19, m2Var.u(str2, jSONObject3));
        }
        return true;
    }
}
