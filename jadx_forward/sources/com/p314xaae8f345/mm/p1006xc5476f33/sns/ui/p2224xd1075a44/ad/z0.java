package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad;

/* loaded from: classes4.dex */
public class z0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18430xfb7819bb f252613d;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18430xfb7819bb c18430xfb7819bb) {
        this.f252613d = c18430xfb7819bb;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager$3");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18430xfb7819bb c18430xfb7819bb = this.f252613d;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18430xfb7819bb.m71295xbbd77af0(c18430xfb7819bb) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18433x25b436c4 m71295xbbd77af0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18430xfb7819bb.m71295xbbd77af0(c18430xfb7819bb);
            m71295xbbd77af0.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateProgress", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            m71295xbbd77af0.f252504z = floatValue;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateProgress", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18430xfb7819bb.m71295xbbd77af0(c18430xfb7819bb).invalidate();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager$3");
    }
}
