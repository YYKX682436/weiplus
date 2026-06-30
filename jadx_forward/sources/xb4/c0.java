package xb4;

/* loaded from: classes4.dex */
public class c0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.d0 f534452d;

    public c0(xb4.d0 d0Var) {
        this.f534452d = d0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$4");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAdBackAnimation", "onAnimation end");
        xb4.d0.b(this.f534452d).E0.setScaleX(1.0f);
        xb4.d0.b(this.f534452d).E0.setScaleY(1.0f);
        xb4.d0.b(this.f534452d).E0.setAlpha(1.0f);
        xb4.d0.b(this.f534452d).F0.setAlpha(1.0f);
        xb4.x xVar = this.f534452d.f534530a;
        if (xVar != null) {
            xVar.mo71145xbb3aa236();
        }
        xb4.d0.b(this.f534452d).f250836w0 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$4");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$4");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAdBackAnimation", "onAnimation start");
        xb4.d0 d0Var = this.f534452d;
        xb4.d0.b(d0Var).F0.setAlpha(0.0f);
        xb4.x xVar = d0Var.f534530a;
        if (xVar != null) {
            xVar.mo71146xd7e2f2fd();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdBackAnimation$4");
    }
}
