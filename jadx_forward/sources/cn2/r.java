package cn2;

/* loaded from: classes2.dex */
public final class r implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f125142d;

    public r(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f125142d = c22789xd23e9a9b;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
        java.lang.Object animatedValue = anim.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this.f125142d.setTranslationX(((java.lang.Float) animatedValue).floatValue());
    }
}
