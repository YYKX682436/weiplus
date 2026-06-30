package wa2;

/* loaded from: classes3.dex */
public final class i implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wa2.n0 f525659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f525660e;

    public i(wa2.n0 n0Var, float f17) {
        this.f525659d = n0Var;
        this.f525660e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.view.View m173376x12263380 = this.f525659d.m173376x12263380();
        float min = java.lang.Math.min(this.f525660e, 1.0f - it.getAnimatedFraction());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(min));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m173376x12263380, arrayList.toArray(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$exitAnimation$1$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        m173376x12263380.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(m173376x12263380, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$exitAnimation$1$3", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
