package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes3.dex */
public class x0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f254278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f254279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f254280f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.d1 f254281g;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.d1 d1Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, android.view.View view, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f254281g = d1Var;
        this.f254278d = k3Var;
        this.f254279e = view;
        this.f254280f = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        android.view.View view = this.f254279e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator$5", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/TaskBarItemAnimator$5", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f254280f.setListener(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.d1 d1Var = this.f254281g;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f254278d;
        d1Var.h(k3Var);
        d1Var.f254129o.remove(k3Var);
        d1Var.E();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f254281g.getClass();
    }
}
