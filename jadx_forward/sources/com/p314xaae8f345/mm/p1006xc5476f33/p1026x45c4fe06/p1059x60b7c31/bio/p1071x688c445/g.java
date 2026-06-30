package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445;

/* loaded from: classes.dex */
public class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f33923x366c91de = 344;

    /* renamed from: NAME */
    public static final java.lang.String f33924x24728b = "checkIsSoterEnrolledInDevice";

    /* renamed from: h, reason: collision with root package name */
    public static android.content.Context f161433h;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.C12019x4c28200f f161434g = null;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        int i18;
        f161433h = lVar.mo50352x76847179();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLuggageCheckBioEnrollment", "hy: subapp start do check is enrolled");
        java.lang.String optString = jSONObject.optString("checkAuthMode");
        if ("fingerPrint".equals(optString)) {
            i18 = 1;
        } else if ("facial".equals(optString)) {
            i18 = 8;
        } else if ("speech".equals(optString)) {
            i18 = 2;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandSoterTranslateUtil", "hy: invalid item");
            i18 = 0;
        }
        this.f161434g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.C12019x4c28200f(lVar, i17, i18, this);
        this.f161434g.d();
    }
}
