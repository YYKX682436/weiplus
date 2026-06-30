package b04;

/* loaded from: classes3.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f98425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f98426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f98427f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b04.z f98428g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f98429h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f98430i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f98431m;

    public g(android.widget.ImageView imageView, float f17, android.widget.ImageView imageView2, b04.z zVar, android.widget.ImageView imageView3, android.view.View view, float f18) {
        this.f98425d = imageView;
        this.f98426e = f17;
        this.f98427f = imageView2;
        this.f98428g = zVar;
        this.f98429h = imageView3;
        this.f98430i = view;
        this.f98431m = f18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        float f17 = this.f98426e;
        android.widget.ImageView imageView = this.f98425d;
        imageView.setTranslationX((-f17) * (1.0f - floatValue));
        imageView.setScaleX(floatValue);
        imageView.setScaleY(floatValue);
        imageView.setAlpha(floatValue);
        b04.z zVar = this.f98428g;
        this.f98427f.setTranslationX(zVar.Y6(0) + (f17 * floatValue));
        this.f98429h.setTranslationX(zVar.Y6(1) + (f17 * floatValue));
        android.view.View view = this.f98430i;
        if (view == null) {
            return;
        }
        view.setTranslationX(this.f98431m + (f17 * floatValue));
    }
}
