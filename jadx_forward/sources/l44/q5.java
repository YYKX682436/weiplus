package l44;

/* loaded from: classes4.dex */
public class q5 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l44.s5 f397851d;

    public q5(l44.s5 s5Var) {
        this.f397851d = s5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper$2");
        super.onAnimationEnd(animator);
        l44.s5 s5Var = this.f397851d;
        s5Var.f397884f = false;
        if (l44.s5.a(s5Var) != null) {
            l44.s5.a(s5Var).a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper$2");
    }
}
