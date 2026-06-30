package b04;

/* loaded from: classes3.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f16892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f16893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f16894f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b04.z f16895g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f16896h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f16897i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f16898m;

    public g(android.widget.ImageView imageView, float f17, android.widget.ImageView imageView2, b04.z zVar, android.widget.ImageView imageView3, android.view.View view, float f18) {
        this.f16892d = imageView;
        this.f16893e = f17;
        this.f16894f = imageView2;
        this.f16895g = zVar;
        this.f16896h = imageView3;
        this.f16897i = view;
        this.f16898m = f18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float f17 = this.f16893e;
        android.widget.ImageView imageView = this.f16892d;
        imageView.setTranslationX((-f17) * (1.0f - floatValue));
        imageView.setScaleX(floatValue);
        imageView.setScaleY(floatValue);
        imageView.setAlpha(floatValue);
        b04.z zVar = this.f16895g;
        this.f16894f.setTranslationX(zVar.Y6(0) + (f17 * floatValue));
        this.f16896h.setTranslationX(zVar.Y6(1) + (f17 * floatValue));
        android.view.View view = this.f16897i;
        if (view == null) {
            return;
        }
        view.setTranslationX(this.f16898m + (f17 * floatValue));
    }
}
