package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class dd implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f215667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7 f215668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f215669f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f215670g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f215671h;

    public dd(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7 c15452x854f54e7, android.view.View view2, int i17, int i18) {
        this.f215667d = view;
        this.f215668e = c15452x854f54e7;
        this.f215669f = view2;
        this.f215670g = i17;
        this.f215671h = i18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anim, "anim");
        float animatedFraction = anim.getAnimatedFraction();
        android.view.View view = this.f215667d;
        float width = view.getWidth();
        int width2 = view.getWidth();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7 c15452x854f54e7 = this.f215668e;
        float f17 = width - ((width2 - c15452x854f54e7.f215091f) * animatedFraction);
        android.view.View view2 = this.f215669f;
        view2.getLayoutParams().width = (int) f17;
        view2.requestLayout();
        view2.setBackgroundColor(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15452x854f54e7.O6(c15452x854f54e7, animatedFraction, this.f215670g, this.f215671h));
        if (animatedFraction >= 1.0f) {
            android.view.View view3 = this.f215667d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMegaVideoBtnAnimUIC$startDisappearAnim$1$2$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMegaVideoBtnAnimUIC$startDisappearAnim$1$2$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
