package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes15.dex */
public class r2 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16 f284170d;

    public r2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16 c21614x5c06ae16) {
        this.f284170d = c21614x5c06ae16;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingAnimFrame", "onAnimationEnd: luckBag");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16 c21614x5c06ae16 = this.f284170d;
        if (c21614x5c06ae16.Q) {
            c21614x5c06ae16.d();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingAnimFrame", "onAnimationStart: luckyBag");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16 c21614x5c06ae16 = this.f284170d;
        if (c21614x5c06ae16.K == 1) {
            c21614x5c06ae16.G = c21614x5c06ae16.f279728i * c21614x5c06ae16.C;
            c21614x5c06ae16.H = -c21614x5c06ae16.L;
        }
    }
}
