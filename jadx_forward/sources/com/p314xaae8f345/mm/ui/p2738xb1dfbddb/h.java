package com.p314xaae8f345.mm.ui.p2738xb1dfbddb;

/* loaded from: classes3.dex */
public final class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c f291469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f291470e;

    public h(com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c c22490xdfa0051c, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.f291469d = c22490xdfa0051c;
        this.f291470e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        this.f291469d.f291446o = false;
        this.f291470e.setListener(null);
    }
}
