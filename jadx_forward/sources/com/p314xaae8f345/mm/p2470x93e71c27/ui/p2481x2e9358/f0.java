package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class f0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f271836d;

    public f0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f271836d = c19666xfd6e2f33;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271836d;
        c19666xfd6e2f33.f271560n.setVisibility(0);
        c19666xfd6e2f33.f271636z.setVisibility(8);
        c19666xfd6e2f33.r1(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271836d;
        if (!c19666xfd6e2f33.U3) {
            android.view.ViewGroup.LayoutParams layoutParams = c19666xfd6e2f33.f271560n.getLayoutParams();
            layoutParams.width = -2;
            c19666xfd6e2f33.f271560n.setLayoutParams(layoutParams);
        }
        c19666xfd6e2f33.f271636z.setVisibility(8);
        c19666xfd6e2f33.r1(false);
        boolean z17 = c19666xfd6e2f33.f271528h3;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatFooter", "animShowSendBtn onAnimationEnd!! cansend change:%s", java.lang.Boolean.valueOf(z17));
            c19666xfd6e2f33.f271636z.setVisibility(0);
            c19666xfd6e2f33.r1(true);
            c19666xfd6e2f33.s();
        }
        c19666xfd6e2f33.f271554m.h();
        c19666xfd6e2f33.post(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.e0(this));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271836d;
        c19666xfd6e2f33.f271560n.setVisibility(0);
        c19666xfd6e2f33.f271554m.getSizeAnimController().a(false);
    }
}
