package gl5;

/* loaded from: classes3.dex */
public final class i0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f354545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f354546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f354547f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f354548g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f354549h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f354550i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f354551m;

    public i0(gl5.d1 d1Var, int i17, int i18, int i19, int i27, int i28, int i29, float f17, float f18) {
        this.f354545d = d1Var;
        this.f354546e = i17;
        this.f354547f = i18;
        this.f354548g = i19;
        this.f354549h = i27;
        this.f354550i = i28;
        this.f354551m = i29;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f354545d.d().setOutlineProvider(new gl5.h0(this.f354546e, it.getAnimatedFraction(), this.f354547f, this.f354548g, this.f354549h, this.f354550i, this.f354551m, 0.5f, 0.0f, this.f354545d));
    }
}
