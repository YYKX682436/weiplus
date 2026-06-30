package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class n6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34541x366c91de = 1159;

    /* renamed from: NAME */
    public static final java.lang.String f34542x24728b = "getWeAppNewTipsInfo";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (e9Var == null || e9Var.getF229340d() == null || jSONObject == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWeAppNewTipsInfo", "data:%s", jSONObject.toString());
        java.lang.String optString = jSONObject.optString("pathKey");
        if (optString == null) {
            optString = "";
        }
        if (r26.i0.y(optString, "weapp_internal_", false)) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(optString), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k6.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m6(e9Var, i17, this));
            return;
        }
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        java.lang.String str2 = str != null ? str : "";
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 101);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        e9Var.a(i17, u(str2, jSONObject2));
    }
}
