package k84;

/* loaded from: classes3.dex */
public final class g3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f386576d;

    public g3(k84.d4 d4Var) {
        this.f386576d = d4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        k84.d4 d4Var = this.f386576d;
        android.widget.RelativeLayout I = d4Var.I();
        if (I != null) {
            I.setVisibility(0);
        }
        android.widget.RelativeLayout I2 = d4Var.I();
        if (I2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDp", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
            int a17 = i65.a.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (float) (((1 - floatValue) * 53.0d) / 2));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDp", "com.tencent.mm.plugin.sns.ad.utils.ContextExtKt");
            I2.setTranslationY(a17);
        }
        android.widget.RelativeLayout I3 = d4Var.I();
        if (I3 != null) {
            I3.setAlpha(floatValue);
        }
        android.widget.ImageView G = d4Var.G();
        if (G != null) {
            G.setAlpha(floatValue);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$startAnim$1$1");
    }
}
