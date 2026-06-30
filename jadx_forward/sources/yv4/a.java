package yv4;

/* loaded from: classes4.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yv4.k f547742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.RectF f547743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.RectF f547744f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f547745g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f547746h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f547747i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f547748m;

    public a(yv4.k kVar, android.graphics.RectF rectF, android.graphics.RectF rectF2, float f17, float f18, float f19, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var) {
        this.f547742d = kVar;
        this.f547743e = rectF;
        this.f547744f = rectF2;
        this.f547745g = f17;
        this.f547746h = f18;
        this.f547747i = f19;
        this.f547748m = e0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        yv4.k kVar = this.f547742d;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f U6 = kVar.U6();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float f18 = this.f547746h;
        float f19 = this.f547745g;
        float f27 = f19 + ((f18 - f19) * floatValue);
        float f28 = this.f547748m.f391648d;
        float f29 = this.f547747i;
        matrix.setScale(f27, f27);
        matrix.postTranslate(0.0f, f29 + ((f28 - f29) * floatValue));
        U6.mo45742x548ba9bf(matrix);
        android.graphics.RectF rect = this.f547744f;
        android.graphics.RectF rectF = this.f547743e;
        if (rectF != null) {
            float f37 = rectF.left;
            float f38 = f37 + ((rect.left - f37) * floatValue);
            float f39 = rectF.top;
            float f47 = f39 + ((rect.top - f39) * floatValue);
            float f48 = rectF.right;
            float f49 = f48 + ((rect.right - f48) * floatValue);
            float f57 = rectF.bottom;
            rect = new android.graphics.RectF(f38, f47, f49, f57 + ((rect.bottom - f57) * floatValue));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2400x373aa5.C19221xe73e25bf c19221xe73e25bf = (com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2400x373aa5.C19221xe73e25bf) ((jz5.n) kVar.f547764g).mo141623x754a37bb();
        c19221xe73e25bf.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        c19221xe73e25bf.f263222g = rect;
        c19221xe73e25bf.postInvalidate();
    }
}
