package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes3.dex */
public class l0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z f254174d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar) {
        this.f254174d = zVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar = this.f254174d;
        zVar.I1.animate().setListener(null);
        zVar.I1.setTranslationY(0.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.z zVar = this.f254174d;
        zVar.I1.animate().setListener(null);
        zVar.I1.setTranslationY(0.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
