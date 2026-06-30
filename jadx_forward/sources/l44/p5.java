package l44;

/* loaded from: classes4.dex */
public class p5 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l44.s5 f397834d;

    public p5(l44.s5 s5Var) {
        this.f397834d = s5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper$1");
        super.onAnimationStart(animator);
        l44.s5 s5Var = this.f397834d;
        s5Var.f397884f = true;
        if (l44.s5.a(s5Var) != null) {
            l44.s5.a(s5Var).b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.helper.ShakeAdFlipCardAnimHelper$1");
    }
}
