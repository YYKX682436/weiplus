package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes.dex */
public final class r implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.s f164186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f164187b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f164188c;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17) {
        this.f164186a = sVar;
        this.f164187b = c0Var;
        this.f164188c = i17;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        rk0.c.c("MicroMsg.JsApiGetEncryptHKPasswdWC", "on result, requestCode: %d, resultCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.s sVar = this.f164186a;
        if (sVar.f164196g == i17) {
            int i19 = this.f164188c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f164187b;
            if (i18 == -1) {
                rk0.c.c("MicroMsg.JsApiGetEncryptHKPasswdWC", "get hk encrypt passwd succ", new java.lang.Object[0]);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                java.lang.String stringExtra = intent.getStringExtra("encryptPasswd");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(stringExtra, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put("encryptPasswd", stringExtra);
                }
                java.lang.String stringExtra2 = intent.getStringExtra("signature");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put("signature", stringExtra2);
                }
                sVar.getClass();
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                linkedHashMap.put("errno", 0);
                c0Var.a(i19, sVar.t("ok", linkedHashMap));
            } else {
                int intExtra = intent.getIntExtra("retcode", 0);
                rk0.c.c("MicroMsg.JsApiGetEncryptHKPasswdWC", "get hk encrypt passwd fail, retcode is " + intExtra, new java.lang.Object[0]);
                if (intExtra == 3) {
                    sVar.getClass();
                    str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
                    str2 = str != null ? str : "";
                    java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("errno", 1);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                    }
                    c0Var.a(i19, sVar.u(str2, jSONObject));
                } else {
                    sVar.getClass();
                    str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
                    str2 = str != null ? str : "";
                    java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("errno", 4);
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                    }
                    c0Var.a(i19, sVar.u(str2, jSONObject2));
                }
            }
        }
        return true;
    }
}
