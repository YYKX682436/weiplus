package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class y5 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 f214910d;

    public y5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34) {
        this.f214910d = c15270x6d877a34;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34 = this.f214910d;
        android.view.ViewGroup.LayoutParams layoutParams = c15270x6d877a34.m61882x623e5088().getLayoutParams();
        layoutParams.width = c15270x6d877a34.getReplyBtnWidth();
        c15270x6d877a34.m61882x623e5088().setLayoutParams(layoutParams);
        c15270x6d877a34.m61882x623e5088().setAlpha(1.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34.a(c15270x6d877a34);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34 c15270x6d877a34 = this.f214910d;
        android.view.ViewGroup.LayoutParams layoutParams = c15270x6d877a34.m61882x623e5088().getLayoutParams();
        layoutParams.width = c15270x6d877a34.getReplyBtnWidth();
        c15270x6d877a34.m61882x623e5088().setLayoutParams(layoutParams);
        c15270x6d877a34.m61882x623e5088().setAlpha(1.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15270x6d877a34.a(c15270x6d877a34);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f214910d.m61882x623e5088().setVisibility(0);
    }
}
