package t74;

/* loaded from: classes4.dex */
public final class u extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f497781d;

    public u(t74.w1 w1Var) {
        this.f497781d = w1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doInitAnim$a4$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        t74.w1 w1Var = this.f497781d;
        android.widget.FrameLayout T = t74.w1.T(w1Var);
        if (T != null) {
            T.setVisibility(4);
        }
        if (t74.w1.Z(w1Var)) {
            t74.i2 R = t74.w1.R(w1Var);
            if (R != null) {
                R.e(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 W = t74.w1.W(w1Var);
            if (W != null) {
                W.M(0, false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 W2 = t74.w1.W(w1Var);
            if (W2 != null) {
                W2.setTag(com.p314xaae8f345.mm.R.id.f568517n33, 1);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doInitAnim$a4$1$1");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doInitAnim$a4$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        t74.w1 w1Var = this.f497781d;
        android.widget.FrameLayout T = t74.w1.T(w1Var);
        if (T != null) {
            T.setVisibility(0);
        }
        t74.w1.i0(w1Var, 0);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21487xa86ce1ce O = t74.w1.O(w1Var);
        if (O != null) {
            O.m78922x7d600aec(t74.w1.N(w1Var));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doInitAnim$a4$1$1");
    }
}
