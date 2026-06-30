package p44;

/* loaded from: classes4.dex */
public final class a extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.C17716xcf524a4c f433302e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2094xb73a0fae.p2096x4d037474.C17716xcf524a4c c17716xcf524a4c) {
        this.f433302e = c17716xcf524a4c;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView$mUIHandler$1$handleMessage$6$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagePickCardTipView", "onHideAnimEnd, gone tipView");
        this.f433302e.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.AdLandingPagePickCardTipView$mUIHandler$1$handleMessage$6$1$1");
    }
}
