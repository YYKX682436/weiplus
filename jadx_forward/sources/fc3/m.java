package fc3;

/* loaded from: classes9.dex */
public final class m implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f342593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f342594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fc3.s f342595f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f342596g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.PointF f342597h;

    public m(float f17, android.widget.TextView textView, fc3.s sVar, float f18, android.graphics.PointF pointF) {
        this.f342593d = f17;
        this.f342594e = textView;
        this.f342595f = sVar;
        this.f342596g = f18;
        this.f342597h = pointF;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        float f17 = this.f342593d;
        double abs = java.lang.Math.abs(f17);
        android.widget.TextView textView = this.f342594e;
        fc3.s sVar = this.f342595f;
        if (abs >= 0.5d) {
            float f18 = sVar.f342614f;
            java.lang.Object animatedValue = it.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            textView.setTextSize(1, f18 + (((java.lang.Float) animatedValue).floatValue() * f17));
            if (sVar.f342620l) {
                android.content.Context context = sVar.f342609a;
                float f19 = sVar.f342614f;
                java.lang.Object animatedValue2 = it.getAnimatedValue();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                textView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i65.a.a(context, f19 + (f17 * ((java.lang.Float) animatedValue2).floatValue())), -2));
            }
        }
        float f27 = this.f342596g;
        if (java.lang.Math.abs(f27) >= 0.01d) {
            float f28 = sVar.f342615g;
            java.lang.Object animatedValue3 = it.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
            textView.setAlpha(f28 + (f27 * ((java.lang.Float) animatedValue3).floatValue()));
        }
        android.graphics.PointF pointF = this.f342597h;
        if (java.lang.Math.abs(pointF.x) >= 0.5d) {
            float width = sVar.f342613e.x - (textView.getWidth() / 2);
            float f29 = pointF.x;
            java.lang.Object animatedValue4 = it.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
            textView.setX(width + (f29 * ((java.lang.Float) animatedValue4).floatValue()));
        }
        if (java.lang.Math.abs(pointF.y) >= 0.5d) {
            float height = sVar.f342613e.y - (textView.getHeight() / 2);
            float f37 = pointF.y;
            java.lang.Object animatedValue5 = it.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
            textView.setY(height + (f37 * ((java.lang.Float) animatedValue5).floatValue()));
        }
    }
}
