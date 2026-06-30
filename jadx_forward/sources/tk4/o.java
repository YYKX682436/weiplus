package tk4;

/* loaded from: classes5.dex */
public final class o implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tk4.c0 f501535d;

    public o(tk4.c0 c0Var) {
        this.f501535d = c0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        tk4.c0 c0Var = this.f501535d;
        android.view.View view = c0Var.f501497b;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                java.lang.Object animatedValue = animator.getAnimatedValue();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams2.y = ((java.lang.Integer) animatedValue).intValue();
                android.view.ViewManager viewManager = c0Var.f501496a;
                if (viewManager != null) {
                    viewManager.updateViewLayout(view, layoutParams2);
                }
            }
        }
    }
}
