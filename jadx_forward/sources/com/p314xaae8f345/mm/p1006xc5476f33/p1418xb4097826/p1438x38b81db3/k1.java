package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes.dex */
public final class k1 extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f185326d;

    public k1(android.view.ViewGroup viewGroup) {
        this.f185326d = viewGroup;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.view.ViewGroup viewGroup = this.f185326d;
        viewGroup.setAlpha(1.0f);
        viewGroup.setTranslationY(0.0f);
    }
}
