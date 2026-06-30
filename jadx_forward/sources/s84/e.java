package s84;

/* loaded from: classes4.dex */
public class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2145xb118bc57.C17795xc0e4d885 f486431d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2145xb118bc57.C17795xc0e4d885 c17795xc0e4d885) {
        this.f486431d = c17795xc0e4d885;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$3");
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2145xb118bc57.C17795xc0e4d885 c17795xc0e4d885 = this.f486431d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2145xb118bc57.C17795xc0e4d885.a(c17795xc0e4d885).setX(intValue);
        c17795xc0e4d885.invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdDragViewContainer$3");
    }
}
