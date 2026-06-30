package tk4;

/* loaded from: classes5.dex */
public final class r implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager.LayoutParams f501539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tk4.c0 f501540e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f501541f;

    public r(android.view.WindowManager.LayoutParams layoutParams, tk4.c0 c0Var, android.view.View view) {
        this.f501539d = layoutParams;
        this.f501540e = c0Var;
        this.f501541f = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        android.view.WindowManager.LayoutParams layoutParams = this.f501539d;
        layoutParams.y = intValue;
        android.view.ViewManager viewManager = this.f501540e.f501496a;
        if (viewManager != null) {
            viewManager.updateViewLayout(this.f501541f, layoutParams);
        }
    }
}
