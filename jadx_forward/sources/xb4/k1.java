package xb4;

/* loaded from: classes4.dex */
public class k1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.n1 f534490d;

    public k1(xb4.n1 n1Var) {
        this.f534490d = n1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation$2");
        if (!xb4.n1.b(this.f534490d).f250836w0) {
            xb4.n1.b(this.f534490d).f250836w0 = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation$2");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereCardAdClickAnimation", "holder is busy");
        xb4.n1 n1Var = this.f534490d;
        n1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation");
        android.animation.AnimatorSet animatorSet = n1Var.f534502d;
        if (animatorSet != null) {
            animatorSet.end();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SphereCardAdClickAnimation$2");
    }
}
