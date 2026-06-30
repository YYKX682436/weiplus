package y94;

/* loaded from: classes4.dex */
public final class y extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f541937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y94.a0 f541938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f541939f;

    public y(float f17, y94.a0 a0Var, float f18) {
        this.f541937d = f17;
        this.f541938e = a0Var;
        this.f541939f = f18;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$startAlphaAnimation$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        if (this.f541939f == 0.0f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getNickNameTxt", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            android.widget.TextView G = this.f541938e.G();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getNickNameTxt", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            if (G != null) {
                G.setVisibility(4);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$startAlphaAnimation$2");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$startAlphaAnimation$2");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        if (this.f541937d == 0.0f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getNickNameTxt", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            android.widget.TextView G = this.f541938e.G();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getNickNameTxt", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            if (G != null) {
                G.setVisibility(0);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$startAlphaAnimation$2");
    }
}
