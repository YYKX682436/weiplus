package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class s8 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t8 f82925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f82926b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f82927c;

    public s8(com.tencent.mm.plugin.appbrand.jsapi.t8 t8Var, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17) {
        this.f82925a = t8Var;
        this.f82926b = d0Var;
        this.f82927c = i17;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.jsapi.t8 t8Var = this.f82925a;
        if (t8Var.f83465g != i17) {
            return false;
        }
        int i19 = this.f82927c;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f82926b;
        if (i18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenAddressEditor", "invoke, add cancel");
            t8Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 1);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            d0Var.a(i19, t8Var.u(str2, jSONObject));
            return true;
        }
        if (-1 != i18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiOpenAddressEditor", "invoke, resultCode: " + i18);
            t8Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            d0Var.a(i19, t8Var.u(str2, jSONObject2));
            return true;
        }
        if (intent != null) {
            java.util.Map a17 = com.tencent.mm.plugin.appbrand.jsapi.e.a(intent);
            if (a17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenAddressEditor", "invoke, add ok");
                t8Var.getClass();
                java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                if (!(a17 instanceof java.util.HashMap)) {
                    a17 = new java.util.HashMap(a17);
                }
                a17.put("errno", 0);
                d0Var.a(i19, t8Var.t("ok", a17));
                return true;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiOpenAddressEditor", "invoke, res is null");
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.JsApiOpenAddressEditor", "invoke, resultData is null");
        t8Var.getClass();
        str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
        str2 = str != null ? str : "";
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 4);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        d0Var.a(i19, t8Var.u(str2, jSONObject3));
        return true;
    }
}
