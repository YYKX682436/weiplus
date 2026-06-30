package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2;

/* loaded from: classes7.dex */
public class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34332x366c91de = 1438;

    /* renamed from: NAME */
    private static final java.lang.String f34333x24728b = "openGameDetail";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (jSONObject == null) {
            java.lang.String str2 = android.text.TextUtils.isEmpty("invalid_data") ? "fail:jsapi invalid request data" : "invalid_data";
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
        java.lang.String optString = jSONObject.optString("appId");
        java.lang.String optString2 = jSONObject.optString("promotionId");
        java.lang.String mo48798x74292566 = e9Var.mo48798x74292566();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = e9Var.V0();
        if (V0 != null) {
            str = V0.Y1();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenGameDetail", "getCurrentPageView is null");
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenGameDetail", "JsApiOpenGameDetail appId:%s, promotionId:%s, url:%s", optString, optString2, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.C12139x16510f58.OpenGameDetailRequest openGameDetailRequest = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.C12139x16510f58.OpenGameDetailRequest();
        openGameDetailRequest.f162777d = mo48798x74292566;
        openGameDetailRequest.f162778e = str;
        openGameDetailRequest.f162779f = optString;
        openGameDetailRequest.f162780g = optString2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1091x304bf2.a(this, e9Var, i17);
        android.content.Context mo50352x76847179 = e9Var.mo50352x76847179();
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(mo50352x76847179, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, openGameDetailRequest, aVar, null);
    }
}
