package c54;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f38682a;

    /* renamed from: b, reason: collision with root package name */
    public final f54.v f38683b;

    /* renamed from: c, reason: collision with root package name */
    public final long f38684c;

    /* renamed from: d, reason: collision with root package name */
    public final ab4.n0 f38685d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f38686e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f38687f;

    /* renamed from: g, reason: collision with root package name */
    public final c54.f f38688g;

    public g(android.content.Context mContext, f54.v mCompInfo, long j17, ab4.n0 mLandingPageData, boolean z17) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        kotlin.jvm.internal.o.g(mCompInfo, "mCompInfo");
        kotlin.jvm.internal.o.g(mLandingPageData, "mLandingPageData");
        this.f38682a = mContext;
        this.f38683b = mCompInfo;
        this.f38684c = j17;
        this.f38685d = mLandingPageData;
        this.f38686e = z17;
        this.f38687f = "";
        this.f38688g = new c54.f(this);
    }

    public static final void a(c54.g gVar, android.view.View view, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setBulletCommentItemViewEnable", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
        gVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBulletCommentItemViewEnable", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
        if (view != null) {
            view.setClickable(z17);
            gVar.d(view, !z17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBulletCommentItemViewEnable", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setBulletCommentItemViewEnable", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
    }

    public final java.util.List b(f54.r rVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCardBulletCommentList", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
        rVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBulletCommentsType", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
        int i17 = rVar.f259746k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBulletCommentsType", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
        f54.v vVar = this.f38683b;
        if (i17 == 1) {
            vVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPositiveBulletCommentList", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
            java.util.List list = vVar.M;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPositiveBulletCommentList", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardBulletCommentList", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
            return list;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBulletCommentsType", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
        int i18 = rVar.f259746k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBulletCommentsType", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo$CardInfo");
        if (i18 != 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardBulletCommentList", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
            return null;
        }
        vVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNegativeBulletCommentList", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        java.util.List list2 = vVar.N;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNegativeBulletCommentList", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHalfEggCardContainerInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCardBulletCommentList", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
        return list2;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(c54.k r25, f54.r r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c54.g.c(c54.k, f54.r, boolean):void");
    }

    public final void d(android.view.View view, boolean z17) {
        android.graphics.drawable.Drawable drawable;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showBulletCommentViewDisableMask", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
        if (z17) {
            try {
                drawable = view.getContext().getDrawable(com.tencent.mm.R.drawable.cqh);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("SnsAd.HalfEggCard.BulletCommentBuilder", "showBulletCommentViewDisableMask ex=" + e17);
            }
        } else {
            drawable = null;
        }
        view.setForeground(drawable);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBulletCommentViewDisableMask", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
    }
}
