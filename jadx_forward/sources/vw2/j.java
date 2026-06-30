package vw2;

/* loaded from: classes2.dex */
public final class j implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f522386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f522387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f522388f;

    public j(android.view.View view, int i17, android.widget.TextView textView) {
        this.f522386d = view;
        this.f522387e = i17;
        this.f522388f = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.view.View view = this.f522386d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(floatValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/animation/btncarousel/ToolbarButtonCarouselAnimationHelper$getSingleButtonEduAnimator$disappearAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/animation/btncarousel/ToolbarButtonCarouselAnimationHelper$getSingleButtonEduAnimator$disappearAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        float f17 = 1.0f - floatValue;
        int i17 = this.f522387e;
        this.f522386d.setTranslationY((-i17) * f17);
        android.widget.TextView textView = this.f522388f;
        textView.setAlpha(f17);
        textView.setTranslationY(f17 * (-i17));
    }
}
