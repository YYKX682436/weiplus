package cj5;

/* loaded from: classes2.dex */
public final class s0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public static final cj5.s0 f42232d = new cj5.s0();

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue("translationY");
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactBottomMenuUIC", "onAnimationUpdate %s", java.lang.Float.valueOf(((java.lang.Float) animatedValue).floatValue()));
    }
}
