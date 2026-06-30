package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class d4 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea f211757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f211758e;

    public d4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea c15151xe87c41ea, boolean z17) {
        this.f211757d = c15151xe87c41ea;
        this.f211758e = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15151xe87c41ea c15151xe87c41ea = this.f211757d;
        c15151xe87c41ea.m61133x14cd10dd().setVisibility(4);
        c15151xe87c41ea.m61111x9a27c48c(false);
        if (this.f211758e) {
            c15151xe87c41ea.m61148x710e23e0(0);
        }
        if (c15151xe87c41ea.getAutoHideWithKeyboard()) {
            c15151xe87c41ea.setVisibility(8);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }
}
