package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class a implements zy2.c6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f245591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e f245592b;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e binderC17870x451d307e, long j17) {
        this.f245592b = binderC17870x451d307e;
        this.f245591a = j17;
    }

    @Override // zy2.c6
    public void a(zy2.dc dcVar) {
        java.lang.String jSONObject;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDone", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$10");
        if (dcVar != null) {
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("followType", 1);
                jSONObject2.put("followFlg", ((ya2.b2) dcVar).f69313xcad4ef95);
                jSONObject2.put("followNum", ((ya2.b2) dcVar).f69314x82c83a5b);
                jSONObject2.put("feedNum", ((ya2.b2) dcVar).f69310x3717790c);
                jSONObject2.put("errCode", ((ya2.b2) dcVar).G2 ? 0 : 1);
                jSONObject = jSONObject2.toString();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "getAdFinderContactMM, exp is " + th6.toString());
            }
            this.f245592b.m142013x77b46a52("onGetBtnAdFinderContact", java.lang.Long.valueOf(this.f245591a), jSONObject);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDone", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$10");
        }
        jSONObject = "";
        this.f245592b.m142013x77b46a52("onGetBtnAdFinderContact", java.lang.Long.valueOf(this.f245591a), jSONObject);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDone", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$10");
    }
}
