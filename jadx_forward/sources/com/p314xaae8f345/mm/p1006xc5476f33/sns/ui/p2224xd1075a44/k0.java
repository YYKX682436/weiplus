package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44;

/* loaded from: classes4.dex */
public class k0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18403xee2674b6 f252713d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18403xee2674b6 c18403xee2674b6) {
        this.f252713d = c18403xee2674b6;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$2");
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18403xee2674b6 c18403xee2674b6 = this.f252713d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18403xee2674b6.a(c18403xee2674b6).setScaleX(floatValue);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18403xee2674b6.a(c18403xee2674b6).setScaleY(floatValue);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.widget.SnsAdLandingPageFloatView$2");
    }
}
