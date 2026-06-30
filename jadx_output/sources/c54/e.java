package c54;

/* loaded from: classes4.dex */
public final class e implements com.tencent.mm.plugin.sns.model.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c54.g f38678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f38679b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f38680c;

    public e(c54.g gVar, kotlin.jvm.internal.h0 h0Var, android.view.View view) {
        this.f38678a = gVar;
        this.f38679b = h0Var;
        this.f38680c = view;
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1$onClick$1");
        org.json.JSONObject jSONObject = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.HalfEggCard.BulletCommentBuilder", "onBulletCommentCallback, retJson==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1$onClick$1");
            return;
        }
        c54.g gVar = this.f38678a;
        kotlin.jvm.internal.h0 h0Var = this.f38679b;
        android.view.View view = this.f38680c;
        boolean optBoolean = jSONObject.optBoolean("isSuccess", false);
        long optLong = jSONObject.optLong("finderFeedId");
        java.lang.String optString = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.BulletCommentBuilder", "onBulletCommentCallback, feedId=" + optLong + ", comment=" + optString + ", isSucc=" + optBoolean);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMFinderFeedId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
        long j17 = gVar.f38684c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMFinderFeedId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
        if (optLong != j17 || !((java.lang.String) h0Var.f310123d).equals(optString)) {
            com.tencent.mars.xlog.Log.e("SnsAd.HalfEggCard.BulletCommentBuilder", "onBulletCommentCallback, not match");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1$onClick$1");
            return;
        }
        if (optBoolean) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1970, 12);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMLandingPageData$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
            ab4.n0 n0Var = gVar.f38685d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMLandingPageData$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
            java.lang.String i17 = n0Var.i();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMCurrentCardId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
            java.lang.String str = gVar.f38687f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMCurrentCardId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.j0.i(i17, str, (java.lang.String) h0Var.f310123d, true);
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(new c54.d(gVar, view));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1$onClick$1");
    }

    @Override // com.tencent.mm.plugin.sns.model.t
    public void b(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1$onClick$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1$onClick$1");
    }
}
