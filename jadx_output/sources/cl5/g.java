package cl5;

/* loaded from: classes5.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cl5.n f42984d;

    public g(cl5.n nVar) {
        this.f42984d = nVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        cl5.n nVar = this.f42984d;
        android.view.View view = nVar.f42997b;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                java.lang.Object animatedValue = animator.getAnimatedValue();
                kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams2.y = ((java.lang.Integer) animatedValue).intValue();
                android.view.ViewManager viewManager = nVar.f42996a;
                if (viewManager != null) {
                    viewManager.updateViewLayout(view, layoutParams2);
                }
            }
        }
    }
}
