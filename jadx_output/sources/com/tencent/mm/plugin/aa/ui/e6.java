package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes5.dex */
public final class e6 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage f72630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f72631e;

    public e6(com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage paylistAARemarkInputHalfPage, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f72630d = paylistAARemarkInputHalfPage;
        this.f72631e = z2Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f72630d.getClass();
        android.view.View view = this.f72631e.f212058g;
        if (view == null) {
            return;
        }
        view.getHeight();
        view.getPaddingBottom();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
