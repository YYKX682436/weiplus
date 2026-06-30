package cl5;

/* loaded from: classes5.dex */
public final class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager.LayoutParams f124511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl5.n f124512e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f124513f;

    public d(android.view.WindowManager.LayoutParams layoutParams, cl5.n nVar, android.view.View view) {
        this.f124511d = layoutParams;
        this.f124512e = nVar;
        this.f124513f = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        android.view.WindowManager.LayoutParams layoutParams = this.f124511d;
        layoutParams.y = intValue;
        android.view.ViewManager viewManager = this.f124512e.f124529a;
        if (viewManager != null) {
            viewManager.updateViewLayout(this.f124513f, layoutParams);
        }
    }
}
