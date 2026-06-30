package l84;

/* loaded from: classes3.dex */
public class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2137xbc912638.C17783x8f813f3 f398651d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2137xbc912638.C17783x8f813f3 c17783x8f813f3) {
        this.f398651d = c17783x8f813f3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar$1");
        java.lang.Float f17 = (java.lang.Float) valueAnimator.getAnimatedValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2137xbc912638.C17783x8f813f3 c17783x8f813f3 = this.f398651d;
        android.view.ViewGroup.LayoutParams layoutParams = c17783x8f813f3.getLayoutParams();
        layoutParams.width = (int) f17.floatValue();
        c17783x8f813f3.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerToolBar$1");
    }
}
