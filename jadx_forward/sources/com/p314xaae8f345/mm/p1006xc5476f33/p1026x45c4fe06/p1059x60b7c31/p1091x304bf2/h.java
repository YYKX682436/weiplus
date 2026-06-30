package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2;

/* loaded from: classes7.dex */
public final class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34336x366c91de = 1593;

    /* renamed from: NAME */
    public static final java.lang.String f34337x24728b = "showPCHandoffCapsuleBanner";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        k91.z zVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowPCHandoffCapsuleBanner", "invoke");
        java.lang.String optString = jSONObject != null ? jSONObject.optString("configKey") : null;
        if (optString != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.CapsuleBannerConfig capsuleBannerConfig = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b().f158763y0;
            zVar = (capsuleBannerConfig == null || android.text.TextUtils.isEmpty(capsuleBannerConfig.f158768e)) ? null : capsuleBannerConfig.a(capsuleBannerConfig.f158768e, optString);
        } else {
            zVar = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.j.f162793a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.btd);
        mi1.z0 z0Var = mi1.z0.f408272e;
        jVar.a("MicroMsg.JsApiShowPCHandoffCapsuleBanner", e9Var, zVar, valueOf, com.p314xaae8f345.mm.R.C30867xcad56011.f572623nf0, 512, 29);
        if (e9Var != null) {
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, u(str, jSONObject2));
        }
    }
}
