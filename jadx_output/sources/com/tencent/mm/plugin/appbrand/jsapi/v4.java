package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class v4 implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f83507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f83508b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.x4 f83509c;

    public v4(com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.x4 x4Var) {
        this.f83507a = e9Var;
        this.f83508b = i17;
        this.f83509c = x4Var;
    }

    @Override // nf.j
    public final void onResult(int i17, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChoosePhoneNumberAreaCode", "resultCode: " + i17 + ", data:" + intent);
        com.tencent.mm.plugin.appbrand.jsapi.x4 x4Var = this.f83509c;
        int i18 = this.f83508b;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f83507a;
        if (i17 != 100) {
            x4Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 1);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i18, x4Var.u(str2, jSONObject));
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("country_name");
        java.lang.String stringExtra2 = intent.getStringExtra("couttry_code");
        if (stringExtra2 == null || stringExtra2.length() == 0) {
            if (stringExtra == null || stringExtra.length() == 0) {
                x4Var.getClass();
                str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
                str2 = str != null ? str : "";
                java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 1);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                }
                e9Var.a(i18, x4Var.u(str2, jSONObject2));
                return;
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        hashMap.put("areaCode", stringExtra2);
        hashMap.put("areaName", stringExtra != null ? stringExtra : "");
        x4Var.getClass();
        java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap.put("errno", 0);
        e9Var.a(i18, x4Var.t("ok", hashMap));
    }
}
