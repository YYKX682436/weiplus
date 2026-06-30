package al5;

/* loaded from: classes3.dex */
public final class g4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.TouchMediaPreviewLayout f5915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f5916e;

    public g4(com.tencent.mm.ui.widget.TouchMediaPreviewLayout touchMediaPreviewLayout, float f17) {
        this.f5915d = touchMediaPreviewLayout;
        this.f5916e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        android.view.View backgroundView;
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue("percent");
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        backgroundView = this.f5915d.getBackgroundView();
        float min = java.lang.Math.min(this.f5916e, 1.0f - floatValue);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(min));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(backgroundView, arrayList.toArray(), "com/tencent/mm/ui/widget/TouchMediaPreviewLayout$removeTouchView$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        backgroundView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(backgroundView, "com/tencent/mm/ui/widget/TouchMediaPreviewLayout$removeTouchView$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
