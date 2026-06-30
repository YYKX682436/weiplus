package tl2;

/* loaded from: classes3.dex */
public final class z implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u4.m1 f501824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f501825e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f501826f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f501827g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f501828h;

    public z(u4.m1 m1Var, float f17, float f18, float f19, float f27) {
        this.f501824d = m1Var;
        this.f501825e = f17;
        this.f501826f = f18;
        this.f501827g = f19;
        this.f501828h = f27;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        u4.m1 m1Var = this.f501824d;
        if (m1Var == null || (view = m1Var.f506048b) == null) {
            return;
        }
        float f17 = this.f501825e;
        view.setTranslationX(f17 - ((f17 - this.f501826f) * floatValue));
        float f18 = this.f501827g;
        view.setTranslationY(f18 - (floatValue * (f18 - this.f501828h)));
    }
}
