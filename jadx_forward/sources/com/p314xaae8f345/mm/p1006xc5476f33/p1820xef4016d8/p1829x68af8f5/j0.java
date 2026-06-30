package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes15.dex */
public class j0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.ViewOnTouchListenerC16345x245cec57 f227418d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.ViewOnTouchListenerC16345x245cec57 viewOnTouchListenerC16345x245cec57) {
        this.f227418d = viewOnTouchListenerC16345x245cec57;
        viewOnTouchListenerC16345x245cec57.y();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.ViewOnTouchListenerC16345x245cec57 viewOnTouchListenerC16345x245cec57 = this.f227418d;
        viewOnTouchListenerC16345x245cec57.B(intValue);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.g gVar = viewOnTouchListenerC16345x245cec57.H;
        if (gVar != null) {
            gVar.a(viewOnTouchListenerC16345x245cec57.f227331x, intValue);
        }
    }
}
