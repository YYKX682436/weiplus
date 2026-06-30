package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a;

/* loaded from: classes13.dex */
public class d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b f296922a;

    public d(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b c26107x3ada911b) {
        this.f296922a = c26107x3ada911b;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator, boolean z17) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b.MarkerTranslateStatusListener markerTranslateStatusListener;
        int i17;
        double[] dArr;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b.MarkerTranslateStatusListener markerTranslateStatusListener2;
        float f17;
        markerTranslateStatusListener = this.f296922a.f296955r;
        if (markerTranslateStatusListener != null) {
            i17 = this.f296922a.f296946i;
            dArr = this.f296922a.f296942e;
            if (i17 == dArr.length - 1) {
                markerTranslateStatusListener2 = this.f296922a.f296955r;
                f17 = this.f296922a.f296951n;
                markerTranslateStatusListener2.mo100107xc0881340(f17, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b.MarkerTranslateStatusListener.AnimationStatus.AnimationComplete);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator, boolean z17) {
    }
}
