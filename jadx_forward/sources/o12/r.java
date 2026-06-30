package o12;

/* loaded from: classes10.dex */
public final class r implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f423705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f423706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f423707f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f423708g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f423709h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o12.u f423710i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f423711m;

    public r(android.widget.FrameLayout.LayoutParams layoutParams, int i17, int i18, int i19, int i27, o12.u uVar, android.view.View view) {
        this.f423705d = layoutParams;
        this.f423706e = i17;
        this.f423707f = i18;
        this.f423708g = i19;
        this.f423709h = i27;
        this.f423710i = uVar;
        this.f423711m = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        int i17 = (int) (this.f423706e + ((this.f423707f - r0) * floatValue));
        android.widget.FrameLayout.LayoutParams layoutParams = this.f423705d;
        layoutParams.leftMargin = i17;
        int i18 = (int) (this.f423708g + ((this.f423709h - r2) * floatValue));
        layoutParams.topMargin = i18;
        this.f423710i.f423719d.offsetTo(i17, i18);
        this.f423711m.requestLayout();
    }
}
