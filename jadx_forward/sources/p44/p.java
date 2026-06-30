package p44;

/* loaded from: classes4.dex */
public final class p extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f433364e;

    public p(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f433364e = h0Var;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder$startUnPickedCardGoneToVisibleAnim$3$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        p44.c0 c0Var = (p44.c0) this.f433364e.f391656d;
        android.view.View j17 = c0Var != null ? c0Var.j() : null;
        if (j17 != null) {
            j17.setEnabled(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.PickCardAnimBuilder$startUnPickedCardGoneToVisibleAnim$3$1");
    }
}
