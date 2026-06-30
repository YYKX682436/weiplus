package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class aa implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f102865d;

    public aa(com.tencent.mm.plugin.finder.convert.qe qeVar, com.tencent.mm.plugin.finder.convert.qe qeVar2) {
        this.f102865d = qeVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f102865d.f104366q = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f102865d.f104366q = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
