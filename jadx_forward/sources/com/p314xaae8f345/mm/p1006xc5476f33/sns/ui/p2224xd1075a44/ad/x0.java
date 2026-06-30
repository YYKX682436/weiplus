package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad;

/* loaded from: classes4.dex */
public class x0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18430xfb7819bb f252604d;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18430xfb7819bb c18430xfb7819bb) {
        this.f252604d = c18430xfb7819bb;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ad.C18430xfb7819bb c18430xfb7819bb = this.f252604d;
        if (c18430xfb7819bb.m8307xb978e60e()) {
            int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
            c18430xfb7819bb.m8298x47a1e860(c18430xfb7819bb.f38461x48321316 - intValue);
            c18430xfb7819bb.f38461x48321316 = intValue;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.ad.AutoPlayViewPager$1");
    }
}
