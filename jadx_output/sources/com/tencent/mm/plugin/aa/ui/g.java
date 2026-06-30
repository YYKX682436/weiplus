package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class g implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AAImagPreviewUI f72647d;

    public g(com.tencent.mm.plugin.aa.ui.AAImagPreviewUI aAImagPreviewUI) {
        this.f72647d = aAImagPreviewUI;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.aa.ui.AAImagPreviewUI aAImagPreviewUI = this.f72647d;
        aAImagPreviewUI.finish();
        aAImagPreviewUI.overridePendingTransition(com.tencent.mm.R.anim.f477902eq, com.tencent.mm.R.anim.f477903er);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
