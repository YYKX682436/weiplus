package t74;

/* loaded from: classes4.dex */
public final class k extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f497705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f497706e;

    public k(t74.w1 w1Var, int i17) {
        this.f497705d = w1Var;
        this.f497706e = i17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardAnim$o1$1$1$onAnimationEnd$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        t74.w1 w1Var = this.f497705d;
        t74.w1.j0(w1Var, false);
        t74.w1.f0(w1Var);
        if (this.f497706e == 1) {
            t74.w1.z(w1Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$doFlipCardAnim$o1$1$1$onAnimationEnd$1");
    }
}
