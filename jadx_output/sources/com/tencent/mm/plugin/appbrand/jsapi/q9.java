package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class q9 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.r9 f82869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f82870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f82871c;

    public q9(com.tencent.mm.plugin.appbrand.jsapi.r9 r9Var, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17) {
        this.f82869a = r9Var;
        this.f82870b = d0Var;
        this.f82871c = i17;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.util.Map a17;
        java.util.Map a18;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenMyAddress", "[openSelectAddr]requestCode: %d, resultCode: %d data: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), intent);
        com.tencent.mm.plugin.appbrand.jsapi.r9 r9Var = this.f82869a;
        if (i17 != (r9Var.hashCode() & 65535)) {
            return false;
        }
        int i19 = this.f82871c;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f82870b;
        if (i18 == -1 && intent != null && (a18 = com.tencent.mm.plugin.appbrand.jsapi.e.a(intent)) != null) {
            r9Var.getClass();
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (!(a18 instanceof java.util.HashMap)) {
                a18 = new java.util.HashMap(a18);
            }
            a18.put("errno", 0);
            d0Var.a(i19, r9Var.t("ok", a18));
            return true;
        }
        if (i18 != 0) {
            r9Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            d0Var.a(i19, r9Var.u(str2, jSONObject));
            return true;
        }
        if (intent != null && (a17 = com.tencent.mm.plugin.appbrand.jsapi.e.a(intent)) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenMyAddress", "[openSelectAddr]cancel, with data");
            r9Var.getClass();
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (!(a17 instanceof java.util.HashMap)) {
                a17 = new java.util.HashMap(a17);
            }
            a17.put("errno", 1);
            d0Var.a(i19, r9Var.t("cancel", a17));
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenMyAddress", "[openSelectAddr]cancel, without data");
        r9Var.getClass();
        str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
        str2 = str != null ? str : "";
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 1);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        d0Var.a(i19, r9Var.u(str2, jSONObject2));
        return true;
    }
}
