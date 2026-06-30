package u84;

/* loaded from: classes4.dex */
public final class q0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u84.m1 f507189d;

    public q0(u84.m1 m1Var) {
        this.f507189d = m1Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$4");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$4");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$4");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        u84.m1 m1Var = this.f507189d;
        android.view.ViewGroup B = u84.m1.B(m1Var);
        if (B != null) {
            B.setAlpha(0.0f);
        }
        android.view.ViewGroup B2 = u84.m1.B(m1Var);
        if (B2 != null) {
            B2.setVisibility(4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMAlphaInObjectAnimator$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        android.animation.ObjectAnimator objectAnimator = m1Var.E;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMAlphaInObjectAnimator$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
        if (objectAnimator != null) {
            objectAnimator.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$4");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$4");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$4");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$4");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        u84.m1 m1Var = this.f507189d;
        android.view.ViewGroup B = u84.m1.B(m1Var);
        if (B != null) {
            B.setVisibility(0);
        }
        android.view.ViewGroup B2 = u84.m1.B(m1Var);
        if (B2 != null) {
            B2.setAlpha(1.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$4");
    }
}
