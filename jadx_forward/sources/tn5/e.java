package tn5;

/* loaded from: classes15.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn5.f f502400d;

    public e(tn5.f fVar) {
        this.f502400d = fVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = this.f502400d.f502401a;
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        c22851x22587864.s(((java.lang.Integer) animatedValue).intValue(), false);
    }
}
