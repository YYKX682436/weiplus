package tl2;

/* loaded from: classes3.dex */
public final class v implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u4.m1 f501818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ArgbEvaluator f501819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f501820f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f501821g;

    public v(u4.m1 m1Var, android.animation.ArgbEvaluator argbEvaluator, java.lang.Integer num, java.lang.Integer num2) {
        this.f501818d = m1Var;
        this.f501819e = argbEvaluator;
        this.f501820f = num;
        this.f501821g = num2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        u4.m1 m1Var = this.f501818d;
        android.view.KeyEvent.Callback callback = m1Var != null ? m1Var.f506048b : null;
        android.widget.TextView textView = callback instanceof android.widget.TextView ? (android.widget.TextView) callback : null;
        if (textView != null) {
            java.lang.Object animatedValue = it.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            java.lang.Object evaluate = this.f501819e.evaluate(((java.lang.Float) animatedValue).floatValue(), this.f501820f, this.f501821g);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(evaluate, "null cannot be cast to non-null type kotlin.Int");
            textView.setTextColor(((java.lang.Integer) evaluate).intValue());
        }
    }
}
