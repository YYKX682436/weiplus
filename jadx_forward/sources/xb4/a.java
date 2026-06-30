package xb4;

/* loaded from: classes2.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f534444d;

    public a(android.view.View view) {
        this.f534444d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueAnimator, "valueAnimator");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        if (!(floatValue == 0.0f)) {
            android.view.View view = this.f534444d;
            view.setScaleX(floatValue);
            view.setScaleY(floatValue);
            android.view.View view2 = this.f534444d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(floatValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/animation/timeline/AdCommonBackAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/animation/timeline/AdCommonBackAnimation$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ui.animation.timeline.AdCommonBackAnimation$1");
    }
}
