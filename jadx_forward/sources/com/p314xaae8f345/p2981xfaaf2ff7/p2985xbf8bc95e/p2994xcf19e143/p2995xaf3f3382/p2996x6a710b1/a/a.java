package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.a;

/* loaded from: classes13.dex */
public class a extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b f296914a;

    public a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b c26107x3ada911b) {
        this.f296914a = c26107x3ada911b;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator, boolean z17) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b.MarkerTranslateStatusListener markerTranslateStatusListener;
        int i17;
        double[] dArr;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b.MarkerTranslateStatusListener markerTranslateStatusListener2;
        com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26 c4406x873d1d26;
        int i18;
        markerTranslateStatusListener = this.f296914a.f296955r;
        if (markerTranslateStatusListener != null) {
            i17 = this.f296914a.f296946i;
            dArr = this.f296914a.f296942e;
            if (i17 == dArr.length - 1) {
                markerTranslateStatusListener2 = this.f296914a.f296955r;
                c4406x873d1d26 = this.f296914a.f296945h;
                i18 = this.f296914a.f296946i;
                markerTranslateStatusListener2.mo100106x54c9b90e(c4406x873d1d26, i18, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84.C26107x3ada911b.MarkerTranslateStatusListener.AnimationStatus.AnimationComplete);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator, boolean z17) {
    }
}
