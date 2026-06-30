package e94;

/* loaded from: classes4.dex */
public class k implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17819x3076c6d5 f331914d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17819x3076c6d5 c17819x3076c6d5) {
        this.f331914d = c17819x3076c6d5;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$4");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17819x3076c6d5 c17819x3076c6d5 = this.f331914d;
        c17819x3076c6d5.invalidate();
        float abs = 180.0f - java.lang.Math.abs(floatValue);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17819x3076c6d5.f245434J;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        int i18 = c17819x3076c6d5.H;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
        if (abs - (i18 * 30) >= 0.0f) {
            ca4.z0.I0(new long[]{0, 40});
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$508", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            c17819x3076c6d5.H++;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$508", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("vabriate, idx=");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            int i19 = c17819x3076c6d5.H;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView");
            sb6.append(i19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GLTwistRoateCardsView", sb6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.GLTwistRoateCardsView$4");
    }
}
