package fm3;

/* loaded from: classes2.dex */
public final class v implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm3.w f345680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f345681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f345682f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f345683g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f345684h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f345685i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f345686m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f345687n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f345688o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f345689p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f345690q;

    public v(fm3.w wVar, float f17, float f18, float f19, float f27, float f28, float f29, float f37, float f38, android.widget.ImageView imageView, boolean z17) {
        this.f345680d = wVar;
        this.f345681e = f17;
        this.f345682f = f18;
        this.f345683g = f19;
        this.f345684h = f27;
        this.f345685i = f28;
        this.f345686m = f29;
        this.f345687n = f37;
        this.f345688o = f38;
        this.f345689p = imageView;
        this.f345690q = z17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        this.f345680d.getClass();
        float f17 = this.f345682f;
        float f18 = this.f345681e;
        float f19 = f18 + ((f17 - f18) * floatValue);
        float f27 = this.f345684h;
        float f28 = this.f345683g;
        float f29 = f28 + ((f27 - f28) * floatValue);
        float f37 = this.f345686m;
        float f38 = this.f345685i;
        float f39 = f38 + ((f37 - f38) * floatValue);
        float f47 = this.f345688o;
        float f48 = this.f345687n;
        float f49 = f48 + ((f47 - f48) * floatValue);
        float f57 = 1.0f - floatValue;
        android.widget.ImageView imageView = this.f345689p;
        imageView.setX(f19);
        imageView.setY(f29);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = (int) f39;
        layoutParams.height = (int) f49;
        imageView.setLayoutParams(layoutParams);
        if (this.f345690q) {
            imageView.setAlpha(f57);
        }
    }
}
