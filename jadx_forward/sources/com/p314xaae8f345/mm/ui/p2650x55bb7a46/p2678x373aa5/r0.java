package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes9.dex */
public final class r0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.c1 f284602d;

    public r0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.c1 c1Var) {
        this.f284602d = c1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.view.ViewGroup viewGroup = this.f284602d.f284424g;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }
}
