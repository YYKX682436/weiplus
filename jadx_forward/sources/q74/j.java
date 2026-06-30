package q74;

/* loaded from: classes4.dex */
public final class j implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q74.t f441999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ObjectAnimator f442000e;

    public j(q74.t tVar, android.animation.ObjectAnimator objectAnimator) {
        this.f441999d = tVar;
        this.f442000e = objectAnimator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doOneStatusEnterOrExitAnim, doOneStatusEnterOrExitAnimFirst o3 cancel, mIndex is ");
        q74.t tVar = this.f441999d;
        sb6.append(q74.t.e(tVar));
        sb6.append(", mPreIndex is ");
        sb6.append(q74.t.f(tVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdSlideProductItemViewLogic", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationCancel", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doOneStatusEnterOrExitAnim, doOneStatusEnterOrExitAnimFirst o3 onAnimationEnd, mIndex is ");
        q74.t tVar = this.f441999d;
        sb6.append(q74.t.e(tVar));
        sb6.append(", mPreIndex is ");
        sb6.append(q74.t.f(tVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdSlideProductItemViewLogic", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 k17 = q74.t.k(tVar);
        if (k17 != null) {
            k17.setAlpha(0.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMOneStatusEnterOrExitAnimSetSecond$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        android.animation.AnimatorSet animatorSet = tVar.G;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMOneStatusEnterOrExitAnimSetSecond$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        if (animatorSet != null) {
            animatorSet.play(this.f442000e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMOneStatusEnterOrExitAnimSetSecond$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        android.animation.AnimatorSet animatorSet2 = tVar.G;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMOneStatusEnterOrExitAnimSetSecond$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic");
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationRepeat", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$1");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doOneStatusEnterOrExitAnim, doOneStatusEnterOrExitAnimFirst o3 onAnimationStart, mIndex is ");
        q74.t tVar = this.f441999d;
        sb6.append(q74.t.e(tVar));
        sb6.append(", mPreIndex is ");
        sb6.append(q74.t.f(tVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdSlideProductItemViewLogic", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2142x746ad0e3.C17790xf59c6992 k17 = q74.t.k(tVar);
        if (k17 != null) {
            k17.setAlpha(1.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationStart", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideProductItemViewLogic$doOneStatusEnterOrExitAnim$1");
    }
}
