package t74;

/* loaded from: classes4.dex */
public final class l implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f497714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f497715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f497716f;

    public l(android.view.View view, float f17, t74.w1 w1Var) {
        this.f497714d = view;
        this.f497715e = f17;
        this.f497716f = w1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardAnim$o1$1$1$onAnimationEnd$o2$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        if (f17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardAnim$o1$1$1$onAnimationEnd$o2$1$1");
        } else {
            this.f497714d.setTranslationX((f17.floatValue() / 90) * this.f497715e * t74.w1.M(this.f497716f));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardAnim$o1$1$1$onAnimationEnd$o2$1$1");
        }
    }
}
