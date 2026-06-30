package wb4;

/* loaded from: classes4.dex */
public class t extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb4.u f525958d;

    public t(wb4.u uVar) {
        this.f525958d = uVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation$2");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SlideFullCardItemAdBackAnimation", "onAnimation end");
        wb4.u uVar = this.f525958d;
        wb4.u.b(uVar).f310323t.setScaleX(1.0f);
        wb4.u.b(uVar).f310323t.setScaleY(1.0f);
        wb4.u.b(uVar).f310323t.setAlpha(1.0f);
        xb4.x xVar = uVar.f525945a;
        if (xVar != null) {
            xVar.mo71145xbb3aa236();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation$2");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation$2");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SlideFullCardItemAdBackAnimation", "onAnimation start");
        xb4.x xVar = this.f525958d.f525945a;
        if (xVar != null) {
            xVar.mo71146xd7e2f2fd();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ui.animation.detail.SlideFullCardItemAdDetailBackAnimation$2");
    }
}
