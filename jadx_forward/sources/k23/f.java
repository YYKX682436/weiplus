package k23;

/* loaded from: classes12.dex */
public final class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.q f385094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f385095e;

    public f(k23.q qVar, android.animation.ValueAnimator valueAnimator) {
        this.f385094d = qVar;
        this.f385095e = valueAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        k23.q qVar = this.f385094d;
        for (android.view.View view : kz5.c0.i(qVar.m141837x5db1ca2().a(), qVar.m141837x5db1ca2().f(), qVar.m141837x5db1ca2().c())) {
            java.lang.Object animatedValue = this.f385095e.getAnimatedValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((java.lang.Float) animatedValue).floatValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(floatValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelView$enterValueAnimationV1$2$2$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/voice/FTSFloatingRecognizingPanelView$enterValueAnimationV1$2$2$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }
}
