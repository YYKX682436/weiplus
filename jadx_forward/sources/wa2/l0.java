package wa2;

/* loaded from: classes3.dex */
public final class l0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wa2.n0 f525672d;

    public l0(wa2.n0 n0Var) {
        this.f525672d = n0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        wa2.n0 n0Var = this.f525672d;
        android.view.View m173376x12263380 = n0Var.m173376x12263380();
        float max = java.lang.Math.max(n0Var.m173376x12263380().getAlpha(), it.getAnimatedFraction());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(max));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m173376x12263380, arrayList.toArray(), "com/tencent/mm/plugin/finder/animation/GestureFrameLayout$onTouchCancel$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        m173376x12263380.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(m173376x12263380, "com/tencent/mm/plugin/finder/animation/GestureFrameLayout$onTouchCancel$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
