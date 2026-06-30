package b04;

/* loaded from: classes2.dex */
public final class x implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f98474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f98475e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f98476f;

    public x(int i17, android.view.View view, android.widget.LinearLayout linearLayout) {
        this.f98474d = i17;
        this.f98475e = view;
        this.f98476f = linearLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        int i17 = (int) (this.f98474d * floatValue);
        android.view.View view = this.f98475e;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (i17 <= 0) {
            i17 = 0;
        }
        layoutParams.height = i17;
        this.f98476f.setAlpha(floatValue);
        view.requestLayout();
    }
}
