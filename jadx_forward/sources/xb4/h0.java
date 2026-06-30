package xb4;

/* loaded from: classes4.dex */
public class h0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb4.i0 f534474d;

    public h0(xb4.i0 i0Var) {
        this.f534474d = i0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$4");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAdClickAnimation", "onAnimation end");
        xb4.i0.b(this.f534474d).E0.setScaleX(1.0f);
        xb4.i0.b(this.f534474d).E0.setScaleY(1.0f);
        xb4.i0.b(this.f534474d).E0.setAlpha(1.0f);
        xb4.i0.b(this.f534474d).F0.setAlpha(1.0f);
        if (xb4.i0.b(this.f534474d).Y0 && a84.y0.e(xb4.i0.b(this.f534474d).X0)) {
            android.view.View childAt = xb4.i0.b(this.f534474d).X0.getChildAt(0);
            if (childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) childAt).M(0, false);
            }
        }
        xb4.x xVar = this.f534474d.f534534b;
        if (xVar != null) {
            xVar.mo71145xbb3aa236();
        }
        xb4.i0.b(this.f534474d).f250836w0 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$4");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$4");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAdClickAnimation", "onAnimation start");
        xb4.x xVar = this.f534474d.f534534b;
        if (xVar != null) {
            xVar.mo71146xd7e2f2fd();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.timeline.CardAdClickAnimation$4");
    }
}
