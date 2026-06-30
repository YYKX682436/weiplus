package ng2;

/* loaded from: classes5.dex */
public final class b implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng2.c f418485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f418486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f418487f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f418488g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f418489h;

    public b(ng2.c cVar, float f17, float f18, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2) {
        this.f418485d = cVar;
        this.f418486e = f17;
        this.f418487f = f18;
        this.f418488g = c0Var;
        this.f418489h = c0Var2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        boolean z17 = this.f418488g.f391645d;
        boolean z18 = this.f418489h.f391645d;
        android.widget.ImageView imageView = this.f418485d.f418491t;
        if (imageView != null) {
            if (z17) {
                imageView.setScaleX(1.0f - ((1.0f - this.f418486e) * floatValue));
            }
            if (z18) {
                imageView.setScaleY(1.0f - (floatValue * (1.0f - this.f418487f)));
            }
        }
    }
}
