package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class kf implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f f214032d;

    public kf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f c15326x96ed1d6f) {
        this.f214032d = c15326x96ed1d6f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue("scale");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15326x96ed1d6f c15326x96ed1d6f = this.f214032d;
        c15326x96ed1d6f.getMileStoneCardContainer().setScaleX(floatValue * c15326x96ed1d6f.getWholeScare());
        java.lang.Object animatedValue2 = animator.getAnimatedValue("alpha");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        float floatValue2 = ((java.lang.Float) animatedValue2).floatValue();
        android.view.View mileStoneCancelContainer = c15326x96ed1d6f.getMileStoneCancelContainer();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(floatValue2));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mileStoneCancelContainer, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderMileStoneView$createCardAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        mileStoneCancelContainer.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(mileStoneCancelContainer, "com/tencent/mm/plugin/finder/view/FinderMileStoneView$createCardAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View mileStoneSaveContainer = c15326x96ed1d6f.getMileStoneSaveContainer();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(floatValue2));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(mileStoneSaveContainer, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderMileStoneView$createCardAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        mileStoneSaveContainer.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(mileStoneSaveContainer, "com/tencent/mm/plugin/finder/view/FinderMileStoneView$createCardAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
