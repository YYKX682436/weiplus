package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class l2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01 f233423d;

    public l2(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01 c16692x9f29da01) {
        this.f233423d = c16692x9f29da01;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01 c16692x9f29da01 = this.f233423d;
        c16692x9f29da01.m67320x8d34e836(false);
        c16692x9f29da01.invalidate();
    }
}
