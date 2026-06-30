package gl5;

/* loaded from: classes3.dex */
public final class l0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f354568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f354569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f354570f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f354571g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f354572h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f354573i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f354574m;

    public l0(gl5.d1 d1Var, int i17, int i18, int i19, int i27, int i28, int i29, float f17, float f18) {
        this.f354568d = d1Var;
        this.f354569e = i17;
        this.f354570f = i18;
        this.f354571g = i19;
        this.f354572h = i27;
        this.f354573i = i28;
        this.f354574m = i29;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f354568d.d().setOutlineProvider(new gl5.k0(this.f354569e, it.getAnimatedFraction(), this.f354570f, this.f354571g, this.f354572h, this.f354573i, this.f354574m, 0.0f, 0.5f, this.f354568d));
    }
}
