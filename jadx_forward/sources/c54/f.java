package c54;

/* loaded from: classes4.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c54.g f120214d;

    public f(c54.g gVar) {
        this.f120214d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/landingpage/component/comp/halfeggcard/HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.lang.Object tag = view != null ? view.getTag() : null;
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        if (str == null) {
            str = "";
        }
        h0Var.f391656d = str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCommentClick, comment=");
        sb6.append((java.lang.String) h0Var.f391656d);
        sb6.append(", feedId=");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMFinderFeedId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
        c54.g gVar = this.f120214d;
        long j17 = gVar.f120217c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMFinderFeedId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
        sb6.append(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.HalfEggCard.BulletCommentBuilder", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1970, 11);
        java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var.f391656d;
        if (charSequence == null || charSequence.length() == 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/halfeggcard/HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1");
            return;
        }
        c54.g.a(gVar, view, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e m69779x9cf0d20b = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMFinderFeedId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMFinderFeedId$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder");
        m69779x9cf0d20b.m69970xdcf6763d(gVar.f120217c, (java.lang.String) h0Var.f391656d, new c54.e(gVar, h0Var, view));
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/halfeggcard/HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardBulletCommentBuilder$mOnBulletCommentClickListener$1");
    }
}
