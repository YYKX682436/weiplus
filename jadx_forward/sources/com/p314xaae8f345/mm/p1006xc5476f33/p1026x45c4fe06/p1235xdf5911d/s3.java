package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

/* loaded from: classes5.dex */
public final class s3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w3 f173840d;

    public s3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w3 w3Var) {
        this.f173840d = w3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.w3 w3Var = this.f173840d;
        if (w3Var.getContext().getResources().getConfiguration().orientation != 2) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("WxAssistantWindow");
            android.view.WindowManager.LayoutParams layoutParams = w3Var.f173867h;
            M.putInt(w3Var.f173865f, layoutParams.x);
            M.putInt(w3Var.f173866g, layoutParams.y);
        }
    }
}
