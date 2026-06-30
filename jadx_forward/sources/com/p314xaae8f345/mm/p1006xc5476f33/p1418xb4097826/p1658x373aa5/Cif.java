package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* renamed from: com.tencent.mm.plugin.finder.view.if, reason: invalid class name */
/* loaded from: classes2.dex */
public final class Cif implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f213836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f213837e;

    public Cif(yz5.l lVar, yz5.l lVar2) {
        this.f213836d = lVar;
        this.f213837e = lVar2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f213836d.mo146xb9724478(java.lang.Float.valueOf(0.8f));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f213837e.mo146xb9724478(java.lang.Float.valueOf(0.5f));
    }
}
