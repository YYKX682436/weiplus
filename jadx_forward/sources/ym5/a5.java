package ym5;

/* loaded from: classes5.dex */
public final class a5 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2 f544730d;

    public a5(com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2 c22803x544dcce2) {
        this.f544730d = c22803x544dcce2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        float intValue = ((java.lang.Integer) animatedValue).intValue();
        com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2 c22803x544dcce2 = this.f544730d;
        c22803x544dcce2.f294992o = intValue;
        c22803x544dcce2.invalidate();
    }
}
