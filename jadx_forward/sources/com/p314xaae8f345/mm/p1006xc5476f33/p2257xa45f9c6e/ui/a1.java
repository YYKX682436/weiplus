package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes3.dex */
public class a1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.b1 f254090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f254091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f254092f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.d1 f254093g;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.d1 d1Var, com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.b1 b1Var, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f254093g = d1Var;
        this.f254090d = b1Var;
        this.f254091e = viewPropertyAnimator;
        this.f254092f = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f254091e.setListener(null);
        android.view.View view = this.f254092f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator$8", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f254092f;
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.b1 b1Var = this.f254090d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = b1Var.f254097b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.d1 d1Var = this.f254093g;
        d1Var.h(k3Var);
        d1Var.f254132r.remove(b1Var.f254097b);
        d1Var.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f254090d.f254097b;
        this.f254093g.getClass();
    }
}
