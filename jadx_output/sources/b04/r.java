package b04;

/* loaded from: classes2.dex */
public final class r implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f16930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f16931f;

    public r(int i17, android.view.View view, android.widget.LinearLayout linearLayout) {
        this.f16929d = i17;
        this.f16930e = view;
        this.f16931f = linearLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        int i17 = (int) (this.f16929d * floatValue);
        android.view.View view = this.f16930e;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (i17 <= 0) {
            i17 = 0;
        }
        layoutParams.height = i17;
        this.f16931f.setAlpha(floatValue);
        view.requestLayout();
    }
}
