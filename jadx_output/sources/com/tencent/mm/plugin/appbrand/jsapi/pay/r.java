package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes.dex */
public final class r implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.pay.s f82653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f82654b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f82655c;

    public r(com.tencent.mm.plugin.appbrand.jsapi.pay.s sVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f82653a = sVar;
        this.f82654b = c0Var;
        this.f82655c = i17;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        rk0.c.c("MicroMsg.JsApiGetEncryptHKPasswdWC", "on result, requestCode: %d, resultCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.appbrand.jsapi.pay.s sVar = this.f82653a;
        if (sVar.f82663g == i17) {
            int i19 = this.f82655c;
            com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f82654b;
            if (i18 == -1) {
                rk0.c.c("MicroMsg.JsApiGetEncryptHKPasswdWC", "get hk encrypt passwd succ", new java.lang.Object[0]);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                java.lang.String stringExtra = intent.getStringExtra("encryptPasswd");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    kotlin.jvm.internal.o.e(stringExtra, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put("encryptPasswd", stringExtra);
                }
                java.lang.String stringExtra2 = intent.getStringExtra("signature");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    kotlin.jvm.internal.o.e(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put("signature", stringExtra2);
                }
                sVar.getClass();
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                linkedHashMap.put("errno", 0);
                c0Var.a(i19, sVar.t("ok", linkedHashMap));
            } else {
                int intExtra = intent.getIntExtra("retcode", 0);
                rk0.c.c("MicroMsg.JsApiGetEncryptHKPasswdWC", "get hk encrypt passwd fail, retcode is " + intExtra, new java.lang.Object[0]);
                if (intExtra == 3) {
                    sVar.getClass();
                    str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
                    str2 = str != null ? str : "";
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("errno", 1);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                    }
                    c0Var.a(i19, sVar.u(str2, jSONObject));
                } else {
                    sVar.getClass();
                    str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                    str2 = str != null ? str : "";
                    java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("errno", 4);
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                    }
                    c0Var.a(i19, sVar.u(str2, jSONObject2));
                }
            }
        }
        return true;
    }
}
