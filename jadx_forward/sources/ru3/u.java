package ru3;

/* loaded from: classes3.dex */
public final class u implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.GestureDetectorOnGestureListenerC17036x2d3a1200 f481306d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.GestureDetectorOnGestureListenerC17036x2d3a1200 gestureDetectorOnGestureListenerC17036x2d3a1200) {
        this.f481306d = gestureDetectorOnGestureListenerC17036x2d3a1200;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.GestureDetectorOnGestureListenerC17036x2d3a1200 gestureDetectorOnGestureListenerC17036x2d3a1200 = this.f481306d;
        gestureDetectorOnGestureListenerC17036x2d3a1200.f237457y = intValue;
        gestureDetectorOnGestureListenerC17036x2d3a1200.invalidate();
    }
}
