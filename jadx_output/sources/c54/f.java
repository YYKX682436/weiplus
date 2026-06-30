package c54;

/* loaded from: classes4.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c54.g f38681d;

    public f(c54.g gVar) {
        this.f38681d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/landingpage/component/comp/halfeggcard/HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.lang.Object tag = view != null ? view.getTag() : null;
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        if (str == null) {
            str = "";
        }
        h0Var.f310123d = str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCommentClick, comment=");
        sb6.append((java.lang.String) h0Var.f310123d);
        sb6.append(", feedId=");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMFinderFeedId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
        c54.g gVar = this.f38681d;
        long j17 = gVar.f38684c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMFinderFeedId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.BulletCommentBuilder", sb6.toString());
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1970, 11);
        java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var.f310123d;
        if (charSequence == null || charSequence.length() == 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/halfeggcard/HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1");
            return;
        }
        c54.g.a(gVar, view, false);
        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMFinderFeedId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMFinderFeedId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
        adLandingPagesProxy.postBulletComment(gVar.f38684c, (java.lang.String) h0Var.f310123d, new c54.e(gVar, h0Var, view));
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/halfeggcard/HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1");
    }
}
