package z35;

/* loaded from: classes2.dex */
public final class n implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f551558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f551559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f551560f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f551561g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f551562h;

    public n(int i17, int i18, int i19, int i27, android.view.View view) {
        this.f551558d = i17;
        this.f551559e = i18;
        this.f551560f = i19;
        this.f551561g = i27;
        this.f551562h = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        int i17 = (int) (this.f551558d + ((this.f551559e - r0) * floatValue));
        int i18 = (int) (this.f551560f + ((this.f551561g - r1) * floatValue));
        android.view.View view = this.f551562h;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i17;
        layoutParams.height = i18;
        view.setLayoutParams(layoutParams);
    }
}
