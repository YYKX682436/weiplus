package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes.dex */
public final class b0 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.c0 f82580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f82581b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f82582c;

    public b0(com.tencent.mm.plugin.appbrand.jsapi.pay.c0 c0Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var2, int i17) {
        this.f82580a = c0Var;
        this.f82581b = c0Var2;
        this.f82582c = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        rk0.c.c("MicroMsg.JsApiOpenHKOfflinePay", "on result, requestCode: %d, resultCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.appbrand.jsapi.pay.c0 c0Var = this.f82580a;
        if (c0Var.f82589g != i17) {
            return true;
        }
        int i19 = this.f82582c;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var2 = this.f82581b;
        if (i18 == -1001) {
            rk0.c.c("MicroMsg.JsApiOpenHKOfflinePay", "check pay jspi fail：user wallet region is not hk", new java.lang.Object[0]);
            c0Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:require user interaction" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 7);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var2.a(i19, c0Var.u(str2, jSONObject));
            return true;
        }
        if (i18 != -1) {
            rk0.c.c("MicroMsg.JsApiOpenHKOfflinePay", "check pay jspi fail", new java.lang.Object[0]);
            c0Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            c0Var2.a(i19, c0Var.u(str2, jSONObject2));
            return true;
        }
        rk0.c.c("MicroMsg.JsApiOpenHKOfflinePay", "goto hkoffline pay finish", new java.lang.Object[0]);
        c0Var.getClass();
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        c0Var2.a(i19, c0Var.u(str2, jSONObject3));
        return true;
    }
}
