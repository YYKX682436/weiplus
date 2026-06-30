package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes3.dex */
public class s0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f254229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f254230e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f254231f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f254232g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f254233h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f254234i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f254235m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f254236n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 f254237o;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.ViewOnTouchListenerC18555xc58183f3 viewOnTouchListenerC18555xc58183f3, android.view.View view, float f17, float f18, float f19, float f27, float f28, float f29, int i17) {
        this.f254237o = viewOnTouchListenerC18555xc58183f3;
        this.f254229d = view;
        this.f254230e = f17;
        this.f254231f = f18;
        this.f254232g = f19;
        this.f254233h = f27;
        this.f254234i = f28;
        this.f254235m = f29;
        this.f254236n = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.view.View view = this.f254229d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer$6", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer$6", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        float f17 = this.f254230e;
        android.view.View view2 = this.f254229d;
        view2.setScaleX(f17);
        view2.setScaleY(this.f254231f);
        view2.setX(this.f254232g);
        view2.setY(this.f254233h);
        view2.setTranslationX(this.f254234i);
        view2.setTranslationY(this.f254235m);
        view2.getLayoutParams().width = this.f254236n;
        view2.requestLayout();
        view2.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.r0(this), 500L);
        this.f254237o.B = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
