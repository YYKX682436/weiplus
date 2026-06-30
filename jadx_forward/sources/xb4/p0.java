package xb4;

/* loaded from: classes4.dex */
public class p0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u74.d f534508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xb4.s0 f534509e;

    public p0(xb4.s0 s0Var, u74.d dVar) {
        this.f534509e = s0Var;
        this.f534508d = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$2");
        if (!this.f534508d.T.f506667d) {
            this.f534508d.T.f506667d = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$2");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FullCardAnim.click", "holder is busy");
        xb4.s0 s0Var = this.f534509e;
        s0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew");
        android.animation.AnimatorSet animatorSet = s0Var.f534517c;
        if (animatorSet != null) {
            animatorSet.end();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.FullCardAdClickAnimationNew$2");
    }
}
