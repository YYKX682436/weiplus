package e94;

/* loaded from: classes4.dex */
public class i implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17819x3076c6d5 f331912d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17819x3076c6d5 c17819x3076c6d5) {
        this.f331912d = c17819x3076c6d5;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$2");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17819x3076c6d5.f245434J;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17819x3076c6d5 c17819x3076c6d5 = this.f331912d;
        int i18 = c17819x3076c6d5.f245439u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$102", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        c17819x3076c6d5.f245438t = (int) (i18 * floatValue);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$102", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        c17819x3076c6d5.i();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        c17819x3076c6d5.invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$2");
    }
}
