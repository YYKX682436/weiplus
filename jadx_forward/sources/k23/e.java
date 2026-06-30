package k23;

/* loaded from: classes12.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f385090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k23.q f385091e;

    public e(android.animation.ValueAnimator valueAnimator, k23.q qVar) {
        this.f385090d = valueAnimator;
        this.f385091e = qVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = this.f385090d.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        k23.q qVar = this.f385091e;
        android.view.View d17 = qVar.m141837x5db1ca2().d();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf((floatValue * 0.5f) + 0.5f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(d17, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelView$enterValueAnimationV1$2$1$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        d17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(d17, "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelView$enterValueAnimationV1$2$1$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        float f17 = (floatValue * 0.27999997f) + 0.72f;
        qVar.m141837x5db1ca2().d().setScaleX(f17);
        qVar.m141837x5db1ca2().d().setScaleY(f17);
    }
}
