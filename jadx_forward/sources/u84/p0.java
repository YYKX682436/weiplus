package u84;

/* loaded from: classes4.dex */
public final class p0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u84.m1 f507184d;

    public p0(u84.m1 m1Var) {
        this.f507184d = m1Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$3");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$3");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$3");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.view.ViewGroup A = u84.m1.A(this.f507184d);
        if (A != null) {
            A.setAlpha(1.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$3");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$3");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$3");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$3");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        u84.m1 m1Var = this.f507184d;
        android.view.ViewGroup A = u84.m1.A(m1Var);
        if (A != null) {
            A.setAlpha(0.0f);
        }
        android.view.ViewGroup A2 = u84.m1.A(m1Var);
        if (A2 != null) {
            A2.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$doAlphaAnim$3");
    }
}
