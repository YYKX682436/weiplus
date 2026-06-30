package al5;

/* loaded from: classes3.dex */
public final class g4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d f87448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f87449e;

    public g4(com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d scaleGestureDetectorOnScaleGestureListenerC22653x4730490d, float f17) {
        this.f87448d = scaleGestureDetectorOnScaleGestureListenerC22653x4730490d;
        this.f87449e = f17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        android.view.View m81461x43ae89e9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue("percent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        m81461x43ae89e9 = this.f87448d.m81461x43ae89e9();
        float min = java.lang.Math.min(this.f87449e, 1.0f - floatValue);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(min));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m81461x43ae89e9, arrayList.toArray(), "com/tencent/mm/ui/widget/TouchMediaPreviewLayout$removeTouchView$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        m81461x43ae89e9.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(m81461x43ae89e9, "com/tencent/mm/ui/widget/TouchMediaPreviewLayout$removeTouchView$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
