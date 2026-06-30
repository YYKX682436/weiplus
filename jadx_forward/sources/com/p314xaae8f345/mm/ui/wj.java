package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class wj implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21446xfcab30d8 f294067d;

    public wj(com.p314xaae8f345.mm.ui.C21446xfcab30d8 c21446xfcab30d8) {
        this.f294067d = c21446xfcab30d8;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.ui.C21446xfcab30d8 c21446xfcab30d8 = this.f294067d;
        android.view.View view = c21446xfcab30d8.Z1;
        if (view != null) {
            view.setBackground(c21446xfcab30d8.f278230j2.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.azm));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
