package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class g1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.e2 f284481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f284482e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f284483f;

    public g1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.e2 e2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, android.view.View view) {
        this.f284481d = e2Var;
        this.f284482e = k3Var;
        this.f284483f = view;
    }

    public final void a(android.animation.Animator animator) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.e2 e2Var = this.f284481d;
        ((java.util.ArrayList) e2Var.f284450n).remove(animator);
        java.util.HashMap hashMap = e2Var.f284451o;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f284482e;
        hashMap.remove(k3Var);
        android.view.View view = this.f284483f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$animateAdd$anim$1$2", "finish", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/view/MediaGroupFoldItemAnimator$animateAdd$anim$1$2", "finish", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        e2Var.h(k3Var);
        e2Var.J();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        a(animation);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        a(animation);
    }
}
