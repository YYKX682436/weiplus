package cl5;

/* loaded from: classes5.dex */
public final class i implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f124520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl5.n f124521e;

    public i(android.view.View view, cl5.n nVar) {
        this.f124520d = view;
        this.f124521e = nVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        android.view.View view = this.f124520d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            java.lang.Object animatedValue = animator.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams2.y = ((java.lang.Integer) animatedValue).intValue();
            android.view.ViewManager viewManager = this.f124521e.f124529a;
            if (viewManager != null) {
                viewManager.updateViewLayout(view, layoutParams2);
            }
        }
    }
}
