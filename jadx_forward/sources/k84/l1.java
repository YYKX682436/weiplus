package k84;

/* loaded from: classes4.dex */
public final class l1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f386635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f386636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f386637f;

    public l1(android.widget.ImageView imageView, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        this.f386635d = imageView;
        this.f386636e = i17;
        this.f386637f = f0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        android.widget.ImageView imageView = this.f386635d;
        if (floatValue > 0.5f) {
            imageView.setAlpha(1 - s74.q4.f486046a.d().getInterpolation((floatValue - 0.5f) / 0.5f));
        }
        s74.q4 q4Var = s74.q4.f486046a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInterpolatorForContinuous", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        android.view.animation.Interpolator interpolator = (android.view.animation.Interpolator) ((jz5.n) s74.q4.f486051f).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInterpolatorForContinuous", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils");
        float interpolation = interpolator.getInterpolation(floatValue);
        double d17 = this.f386636e;
        k84.l lVar = k84.q1.Y;
        double d18 = interpolation;
        imageView.setTranslationX((float) ((lVar.b() + d17) - ((lVar.a() + d17) * d18)));
        imageView.setTranslationY((float) (this.f386637f.f391649d - ((d18 * (lVar.a() + d17)) * lVar.c())));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1$2");
    }
}
