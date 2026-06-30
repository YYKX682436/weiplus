package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class c2 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.d2 f191271d;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.d2 d2Var) {
        this.f191271d = d2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.view.View view = this.f191271d.f191458e;
        float max = java.lang.Math.max(view.getAlpha(), it.getAnimatedFraction());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(max));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFeedListUI$GestureFrameLayout$onTouchCancel$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedListUI$GestureFrameLayout$onTouchCancel$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
