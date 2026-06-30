package hu0;

/* loaded from: classes5.dex */
public final class z implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f366598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu0.a0 f366599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f366600f;

    public z(float f17, hu0.a0 a0Var, int i17) {
        this.f366598d = f17;
        this.f366599e = a0Var;
        this.f366600f = i17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float e17 = e06.p.e(f17 != null ? f17.floatValue() : this.f366598d, 0.0f, 1.0f);
        hu0.a0 a0Var = this.f366599e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(a0Var.f366548n);
        java.lang.Integer num = valueOf.intValue() > 0 ? valueOf : null;
        a0Var.O6(num != null ? num.intValue() : this.f366600f, e17);
    }
}
