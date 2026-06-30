package c54;

/* loaded from: classes4.dex */
public final class e implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c54.g f120211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f120212b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f120213c;

    public e(c54.g gVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.view.View view) {
        this.f120211a = gVar;
        this.f120212b = h0Var;
        this.f120213c = view;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1$onClick$1");
        org.json.JSONObject jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.HalfEggCard.BulletCommentBuilder", "onBulletCommentCallback, retJson==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1$onClick$1");
            return;
        }
        c54.g gVar = this.f120211a;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f120212b;
        android.view.View view = this.f120213c;
        boolean optBoolean = jSONObject.optBoolean("isSuccess", false);
        long optLong = jSONObject.optLong("finderFeedId");
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37641x4a9d0f2f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfEggCard.BulletCommentBuilder", "onBulletCommentCallback, feedId=" + optLong + ", comment=" + optString + ", isSucc=" + optBoolean);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMFinderFeedId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
        long j17 = gVar.f120217c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMFinderFeedId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
        if (optLong != j17 || !((java.lang.String) h0Var.f391656d).equals(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.HalfEggCard.BulletCommentBuilder", "onBulletCommentCallback, not match");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1$onClick$1");
            return;
        }
        if (optBoolean) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1970, 12);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMLandingPageData$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
            ab4.n0 n0Var = gVar.f120218d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMLandingPageData$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
            java.lang.String i17 = n0Var.i();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMCurrentCardId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
            java.lang.String str = gVar.f120220f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMCurrentCardId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.j0.i(i17, str, (java.lang.String) h0Var.f391656d, true);
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(new c54.d(gVar, view));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1$onClick$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1$onClick$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1$onClick$1");
    }
}
