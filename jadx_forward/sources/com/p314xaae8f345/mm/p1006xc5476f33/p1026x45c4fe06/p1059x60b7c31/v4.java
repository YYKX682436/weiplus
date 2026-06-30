package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class v4 implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f165040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f165041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x4 f165042c;

    public v4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x4 x4Var) {
        this.f165040a = e9Var;
        this.f165041b = i17;
        this.f165042c = x4Var;
    }

    @Override // nf.j
    /* renamed from: onResult */
    public final void mo14598x57429edc(int i17, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChoosePhoneNumberAreaCode", "resultCode: " + i17 + ", data:" + intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.x4 x4Var = this.f165042c;
        int i18 = this.f165041b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f165040a;
        if (i17 != 100) {
            x4Var.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "cancel" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 1);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
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
                java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 1);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
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
        java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        hashMap.put("errno", 0);
        e9Var.a(i18, x4Var.t("ok", hashMap));
    }
}
