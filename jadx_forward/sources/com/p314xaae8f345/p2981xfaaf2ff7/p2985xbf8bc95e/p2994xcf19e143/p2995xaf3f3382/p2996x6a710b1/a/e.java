package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a;

/* loaded from: classes13.dex */
public class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b f296923a;

    public e(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b c26107x3ada911b) {
        this.f296923a = c26107x3ada911b;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float f17;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b.MarkerTranslateStatusListener markerTranslateStatusListener;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b.MarkerTranslateStatusListener markerTranslateStatusListener2;
        float f18;
        this.f296923a.f296951n = java.lang.Float.parseFloat(java.lang.String.valueOf(valueAnimator.getAnimatedValue()));
        if (this.f296923a.m100114x2817c635() == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a = (com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a) this.f296923a.m100114x2817c635();
        f17 = this.f296923a.f296951n;
        interfaceC4409x88f1805a.mo37261x742bae00(f17);
        markerTranslateStatusListener = this.f296923a.f296955r;
        if (markerTranslateStatusListener != null) {
            markerTranslateStatusListener2 = this.f296923a.f296955r;
            f18 = this.f296923a.f296951n;
            markerTranslateStatusListener2.mo100107xc0881340(f18, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b.MarkerTranslateStatusListener.AnimationStatus.AnimationInterpolating);
        }
    }
}
