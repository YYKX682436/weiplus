package t74;

/* loaded from: classes4.dex */
public final class x extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f497831d;

    public x(t74.w1 w1Var) {
        this.f497831d = w1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doInitAnim$introduceAnimSet$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMFlipIntroduceContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        t74.w1 w1Var = this.f497831d;
        android.widget.LinearLayout D0 = w1Var.D0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMFlipIntroduceContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        if (D0 != null) {
            D0.setAlpha(0.0f);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21487xa86ce1ce O = t74.w1.O(w1Var);
        if (O != null) {
            O.setAlpha(1.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doInitAnim$introduceAnimSet$1$1");
    }
}
