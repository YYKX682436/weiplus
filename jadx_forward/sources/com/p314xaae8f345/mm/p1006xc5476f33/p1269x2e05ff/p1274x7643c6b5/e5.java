package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* loaded from: classes14.dex */
public class e5 extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f174688d;

    public e5(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d5 d5Var, android.view.View view) {
        this.f174688d = view;
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        a(animation);
        android.view.KeyEvent.Callback callback = this.f174688d;
        if (callback instanceof pv.f0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12926x7a5e63a2) ((pv.f0) callback)).a();
        }
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        b(animation);
        android.view.KeyEvent.Callback callback = this.f174688d;
        if (callback instanceof pv.f0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12926x7a5e63a2) ((pv.f0) callback)).a();
        }
    }
}
