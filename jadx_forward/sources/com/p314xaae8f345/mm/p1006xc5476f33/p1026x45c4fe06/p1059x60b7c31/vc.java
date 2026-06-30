package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class vc extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34922x366c91de = 731;

    /* renamed from: NAME */
    public static final java.lang.String f34923x24728b = "saveWaid";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            fe0.r4 r4Var = (fe0.r4) i95.n0.c(fe0.r4.class);
            jSONObject.toString();
            ((ee0.z4) r4Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseWaidFromJsApi", "com.tencent.mm.feature.sns.WaidHelperService");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseWaidFromJsApi", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseWaidFromJsApi", "com.tencent.mm.plugin.sns.waid.WaidHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseWaidFromJsApi", "com.tencent.mm.feature.sns.WaidHelperService");
            hashMap.put("result", java.lang.String.valueOf(0));
            lVar.a(i17, p("ok", hashMap));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSaveWaid", "appBrand JsApiSaveWaid, data=" + jSONObject + ", waidNum=0");
        } catch (java.lang.Exception e17) {
            hashMap.put("result", "0");
            lVar.a(i17, p("fail", hashMap));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSaveWaid", "appBrand JsApiSaveWaid, exp=" + e17.toString());
        }
    }
}
