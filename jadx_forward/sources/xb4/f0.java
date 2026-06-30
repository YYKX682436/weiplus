package xb4;

/* loaded from: classes4.dex */
public class f0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.i0 f534467d;

    public f0(xb4.i0 i0Var) {
        this.f534467d = i0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$2");
        if (!xb4.i0.b(this.f534467d).f250836w0) {
            xb4.i0.b(this.f534467d).f250836w0 = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$2");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAdClickAnimation", "holder is busy");
        xb4.i0 i0Var = this.f534467d;
        i0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation");
        i0Var.f534478d.end();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("endAnimation", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$2");
    }
}
