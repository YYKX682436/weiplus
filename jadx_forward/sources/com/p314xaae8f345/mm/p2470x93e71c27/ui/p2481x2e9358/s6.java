package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public final class s6 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f272177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 f272178e;

    public s6(android.view.ViewPropertyAnimator viewPropertyAnimator, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 c8Var) {
        this.f272177d = viewPropertyAnimator;
        this.f272178e = c8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f272177d;
        viewPropertyAnimator.setListener(null);
        viewPropertyAnimator.setUpdateListener(null);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.c8 c8Var = this.f272178e;
        android.view.View h17 = c8Var.h();
        h17.setOutlineProvider(new zl5.a(true, false, 0.0f));
        h17.setClipToOutline(true);
        c8Var.c().setVisibility(0);
        if (c8Var.f271753b.m75444x92b2a53() == null || ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8) ((sb5.i0) c8Var.e().f542241c.a(sb5.i0.class))).f281837y) {
            return;
        }
        java.lang.Object mo141623x754a37bb = ((jz5.n) c8Var.f271772u).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.view.View view = (android.view.View) mo141623x754a37bb;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$animOpen$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$animOpen$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
