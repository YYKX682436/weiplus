package k84;

/* loaded from: classes4.dex */
public final class c4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f386506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f386507e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f386508f;

    public c4(int i17, int i18, k84.d4 d4Var) {
        this.f386506d = i17;
        this.f386507e = i18;
        this.f386508f = d4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$triggerCheerContainerAnim$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        int c17 = e3.b.c(this.f386506d, this.f386507e, f17 != null ? f17.floatValue() : 0.0f);
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getGlobalGoldColor$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        k84.d4 d4Var = this.f386508f;
        int i17 = d4Var.L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getGlobalGoldColor$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, new android.graphics.drawable.ColorDrawable(e3.b.c(c17, i17, 0.2f)));
        stateListDrawable.addState(new int[0], new android.graphics.drawable.ColorDrawable(c17));
        android.widget.LinearLayout N = d4Var.N();
        if (N != null) {
            N.setBackground(stateListDrawable);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$triggerCheerContainerAnim$1");
    }
}
