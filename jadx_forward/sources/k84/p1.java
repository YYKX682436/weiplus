package k84;

/* loaded from: classes3.dex */
public final class p1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f386709d;

    public p1(k84.q1 q1Var) {
        this.f386709d = q1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerNumAnim$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        k84.q1 q1Var = this.f386709d;
        android.widget.TextView O = q1Var.O();
        if (O != null) {
            O.setScaleX(floatValue);
        }
        android.widget.TextView O2 = q1Var.O();
        if (O2 != null) {
            O2.setScaleY(floatValue);
        }
        android.widget.TextView O3 = q1Var.O();
        if (O3 != null) {
            O3.setAlpha(floatValue);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerNumAnim$1");
    }
}
