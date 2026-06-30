package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class x4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f35004x366c91de = 1273;

    /* renamed from: NAME */
    public static final java.lang.String f35005x24728b = "choosePhoneNumberAreaCode";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChoosePhoneNumberAreaCode", "choosePhoneNumberAreaCode data:%s", jSONObject);
        if (jSONObject == null) {
            if (e9Var != null) {
                str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                str2 = str != null ? str : "";
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 101);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                e9Var.a(i17, u(str2, jSONObject2));
                return;
            }
            return;
        }
        android.content.Context mo50352x76847179 = e9Var != null ? e9Var.mo50352x76847179() : null;
        if (mo50352x76847179 != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(mo50352x76847179, "com.tencent.mm.ui.tools.CountryCodeUI");
            intent.putExtra("country_name", "");
            intent.putExtra("couttry_code", "");
            nf.e.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w4(mo50352x76847179, intent, e9Var, i17, this));
            return;
        }
        if (e9Var != null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var.a(i17, u(str2, jSONObject3));
        }
    }
}
