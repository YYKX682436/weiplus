package t74;

/* loaded from: classes4.dex */
public final class v implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f497784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f497785e;

    public v(t74.w1 w1Var, float f17) {
        this.f497784d = w1Var;
        this.f497785e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doInitAnim$a5$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        if (f17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doInitAnim$a5$1$1");
            return;
        }
        float floatValue = f17.floatValue();
        float f18 = floatValue / 90;
        t74.w1 w1Var = this.f497784d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2125x6e5e7cfd.C17762xf413b514 G = t74.w1.G(w1Var);
        float f19 = this.f497785e;
        if (G != null) {
            G.setTranslationX(f18 * f19 * t74.w1.M(w1Var));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 I = t74.w1.I(w1Var);
        if (I != null) {
            I.setTranslationX(f18 * f19 * 2 * t74.w1.M(w1Var));
        }
        android.view.View E = t74.w1.E(w1Var);
        if (E != null) {
            E.setRotationY(floatValue);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2122x317b13.p2125x6e5e7cfd.C17762xf413b514 G2 = t74.w1.G(w1Var);
        if (G2 != null) {
            G2.setRotationY(floatValue);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 I2 = t74.w1.I(w1Var);
        if (I2 != null) {
            I2.setRotationY(floatValue);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doInitAnim$a5$1$1");
    }
}
