package cw2;

/* loaded from: classes2.dex */
public final class x0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9 f305634d;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9 c15175x44dff2e9) {
        this.f305634d = c15175x44dff2e9;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9 c15175x44dff2e9 = this.f305634d;
        android.view.View m61209xcc04d8cb = c15175x44dff2e9.m61209xcc04d8cb();
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(floatValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m61209xcc04d8cb, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/FinderFeedNewSeekBarLayout$showLoading$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        m61209xcc04d8cb.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(m61209xcc04d8cb, "com/tencent/mm/plugin/finder/video/FinderFeedNewSeekBarLayout$showLoading$2", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        c15175x44dff2e9.m61209xcc04d8cb().requestLayout();
    }
}
