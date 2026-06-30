package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class d5 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 f289164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f289165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf5.n f289166f;

    public d5(float f17, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 o5Var, android.view.ViewGroup.LayoutParams layoutParams, yf5.n nVar) {
        this.f289164d = o5Var;
        this.f289165e = layoutParams;
        this.f289166f = nVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        android.view.ViewGroup.LayoutParams layoutParams = this.f289165e;
        layoutParams.height = (int) (0.0f + ((this.f289164d.f289464n - 0.0f) * floatValue));
        yf5.n nVar = this.f289166f;
        android.view.View view = nVar.f543464r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(floatValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/conversation/FolderHelper$getExpandAnimators$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        nVar.f543463q.setLayoutParams(layoutParams);
        nVar.f543462p = layoutParams.height;
        nVar.f543463q.requestLayout();
    }
}
