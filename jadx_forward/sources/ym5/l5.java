package ym5;

/* loaded from: classes11.dex */
public final class l5 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22809x58ed379d f544966d;

    public l5(com.p314xaae8f345.mm.p2776x373aa5.C22809x58ed379d c22809x58ed379d) {
        this.f544966d = c22809x58ed379d;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        ym5.k5 onSmoothHeightChangeListener;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        com.p314xaae8f345.mm.p2776x373aa5.C22809x58ed379d v17 = this.f544966d;
        int i17 = intValue - v17.f295024g;
        v17.f295024g = intValue;
        if (i17 > 0 && (onSmoothHeightChangeListener = v17.getOnSmoothHeightChangeListener()) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
            ((af5.x0) onSmoothHeightChangeListener).f86188a.mo149xb9724478(v17, java.lang.Integer.valueOf(i17));
        }
        v17.requestLayout();
    }
}
