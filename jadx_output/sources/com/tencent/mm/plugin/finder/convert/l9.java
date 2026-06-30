package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class l9 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f103903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103904e;

    public l9(com.tencent.mm.plugin.finder.convert.qe qeVar, android.view.View view) {
        this.f103903d = qeVar;
        this.f103904e = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f103903d.K1(this.f103904e, 0);
    }
}
