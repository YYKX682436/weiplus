package q74;

/* loaded from: classes4.dex */
public final class g0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q74.s0 f441991d;

    public g0(q74.s0 s0Var) {
        this.f441991d = s0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doPAGInterruptAnim$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        q74.s0 s0Var = this.f441991d;
        android.widget.FrameLayout e17 = q74.s0.e(s0Var);
        if (e17 != null) {
            e17.setAlpha(0.0f);
        }
        android.widget.FrameLayout e18 = q74.s0.e(s0Var);
        if (e18 != null) {
            e18.setVisibility(8);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SlideFullCardBreakFrameUICtrl", "doPAGInterruptAnim onAnimationCancel");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doPAGInterruptAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doPAGInterruptAnim$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        q74.s0 s0Var = this.f441991d;
        android.widget.FrameLayout e17 = q74.s0.e(s0Var);
        if (e17 != null) {
            e17.setAlpha(0.0f);
        }
        android.widget.FrameLayout e18 = q74.s0.e(s0Var);
        if (e18 != null) {
            e18.setVisibility(8);
        }
        q74.t c17 = q74.s0.c(s0Var);
        if (c17 != null) {
            c17.y(1.0f);
        }
        q74.t c18 = q74.s0.c(s0Var);
        if (c18 != null) {
            c18.o(false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardBreakFrameUICtrl", "doPAGInterruptAnim onAnimationEnd");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doPAGInterruptAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doPAGInterruptAnim$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doPAGInterruptAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doPAGInterruptAnim$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.widget.FrameLayout e17 = q74.s0.e(this.f441991d);
        if (e17 != null) {
            e17.setAlpha(1.0f);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SlideFullCardBreakFrameUICtrl", "doPAGInterruptAnim onAnimationStart");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardBreakFrameUICtrl$doPAGInterruptAnim$1");
    }
}
