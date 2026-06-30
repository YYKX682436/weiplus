package jq4;

/* loaded from: classes3.dex */
public final class i0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager.LayoutParams f382688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jq4.z0 f382689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f382690f;

    public i0(android.view.WindowManager.LayoutParams layoutParams, jq4.z0 z0Var, android.view.View view) {
        this.f382688d = layoutParams;
        this.f382689e = z0Var;
        this.f382690f = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        android.view.WindowManager.LayoutParams layoutParams = this.f382688d;
        layoutParams.y = intValue;
        android.view.ViewManager viewManager = this.f382689e.f382768d;
        if (viewManager != null) {
            viewManager.updateViewLayout(this.f382690f, layoutParams);
        }
    }
}
