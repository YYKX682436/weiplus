package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes3.dex */
public final class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l f220656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.b f220657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f220658f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f220659g;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.b bVar, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.f220656d = lVar;
        this.f220657e = bVar;
        this.f220658f = viewPropertyAnimator;
        this.f220659g = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        this.f220658f.setListener(null);
        android.view.View view = this.f220659g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator$animateChangeImpl$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/BaseItemAnimator$animateChangeImpl$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f220659g;
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.b bVar = this.f220657e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = bVar.f220561b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.l lVar = this.f220656d;
        lVar.h(k3Var);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var2 = bVar.f220561b;
        if (k3Var2 != null) {
            java.util.ArrayList arrayList2 = lVar.f220747r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k3Var2);
            arrayList2.remove(k3Var2);
        }
        lVar.E();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.a, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f220657e.f220561b;
        this.f220656d.getClass();
    }
}
