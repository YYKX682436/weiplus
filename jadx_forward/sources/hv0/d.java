package hv0;

/* loaded from: classes3.dex */
public final class d implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f366786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f366787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f366788f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f366789g;

    public d(java.lang.Integer num, android.view.View view, w9.c cVar, int i17, yz5.p pVar, float f17) {
        this.f366786d = num;
        this.f366787e = view;
        this.f366788f = pVar;
        this.f366789g = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        java.lang.Integer num = this.f366786d;
        if (num != null) {
            java.lang.Integer evaluate = w9.c.f525572a.evaluate(floatValue, 0, num);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(evaluate, "evaluate(...)");
            this.f366787e.setBackgroundColor(evaluate.intValue());
        }
        this.f366788f.mo149xb9724478(java.lang.Float.valueOf(this.f366789g * floatValue), java.lang.Float.valueOf(floatValue));
    }
}
