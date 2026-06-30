package dm1;

/* loaded from: classes5.dex */
public final class j implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f323172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dm1.m f323173e;

    public j(android.view.View view, dm1.m mVar) {
        this.f323172d = view;
        this.f323173e = mVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        android.view.View view = this.f323172d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            java.lang.Object animatedValue = animator.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams2.y = ((java.lang.Integer) animatedValue).intValue();
            android.view.ViewManager viewManager = this.f323173e.f323180b;
            if (viewManager != null) {
                viewManager.updateViewLayout(view, layoutParams2);
            }
        }
    }
}
