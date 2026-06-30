package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ca implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f103035d;

    public ca(com.tencent.mm.plugin.finder.convert.qe qeVar, com.tencent.mm.plugin.finder.convert.qe qeVar2) {
        this.f103035d = qeVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f103035d.f104367r = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f103035d.f104367r = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
