package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes5.dex */
public class v1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.y1 f220855d;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.y1 y1Var) {
        this.f220855d = y1Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.y1 y1Var = this.f220855d;
        android.view.ViewGroup.LayoutParams layoutParams = y1Var.f220891d.f220480q.getLayoutParams();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70 c15854x49003e70 = y1Var.f220891d;
        layoutParams.width = c15854x49003e70.A;
        c15854x49003e70.f220480q.setLayoutParams(layoutParams);
        y1Var.f220891d.f220480q.setAlpha(1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.y1 y1Var = this.f220855d;
        y1Var.f220891d.f220480q.setVisibility(0);
        android.view.ViewGroup.LayoutParams layoutParams = y1Var.f220891d.f220480q.getLayoutParams();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70 c15854x49003e70 = y1Var.f220891d;
        layoutParams.width = c15854x49003e70.A;
        c15854x49003e70.f220480q.setLayoutParams(layoutParams);
        y1Var.f220891d.f220480q.setAlpha(1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f220855d.f220891d.f220480q.setVisibility(0);
    }
}
