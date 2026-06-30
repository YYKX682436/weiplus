package xb4;

/* loaded from: classes4.dex */
public class c1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.d1 f534453d;

    public c1(xb4.d1 d1Var) {
        this.f534453d = d1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation$3");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SlideFullCardItemAdClickAnimation", "onAnimation end");
        xb4.d1.b(this.f534453d).F0.setScaleX(1.0f);
        xb4.d1.b(this.f534453d).F0.setScaleY(1.0f);
        xb4.d1.b(this.f534453d).F0.setAlpha(1.0f);
        xb4.x xVar = this.f534453d.f534534b;
        if (xVar != null) {
            xVar.mo71145xbb3aa236();
        }
        xb4.d1.b(this.f534453d).f250836w0 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation$3");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation$3");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SlideFullCardItemAdClickAnimation", "onAnimation start");
        xb4.x xVar = this.f534453d.f534534b;
        if (xVar != null) {
            xVar.mo71146xd7e2f2fd();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.SlideFullCardItemAdClickAnimation$3");
    }
}
