package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class f implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AAImagPreviewUI f72633d;

    public f(com.tencent.mm.plugin.aa.ui.AAImagPreviewUI aAImagPreviewUI) {
        this.f72633d = aAImagPreviewUI;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f72633d.f72437n = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f72633d.f72439p.setVisibility(0);
    }
}
