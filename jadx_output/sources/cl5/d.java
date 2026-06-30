package cl5;

/* loaded from: classes5.dex */
public final class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager.LayoutParams f42978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl5.n f42979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f42980f;

    public d(android.view.WindowManager.LayoutParams layoutParams, cl5.n nVar, android.view.View view) {
        this.f42978d = layoutParams;
        this.f42979e = nVar;
        this.f42980f = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        android.view.WindowManager.LayoutParams layoutParams = this.f42978d;
        layoutParams.y = intValue;
        android.view.ViewManager viewManager = this.f42979e.f42996a;
        if (viewManager != null) {
            viewManager.updateViewLayout(this.f42980f, layoutParams);
        }
    }
}
