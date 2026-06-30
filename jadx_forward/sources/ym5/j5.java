package ym5;

/* loaded from: classes3.dex */
public final class j5 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22808x9926c449 f544942d;

    public j5(com.p314xaae8f345.mm.p2776x373aa5.C22808x9926c449 c22808x9926c449) {
        this.f544942d = c22808x9926c449;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        com.p314xaae8f345.mm.p2776x373aa5.C22808x9926c449 c22808x9926c449 = this.f544942d;
        c22808x9926c449.f295017f = intValue;
        c22808x9926c449.requestLayout();
    }
}
