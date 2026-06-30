package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes15.dex */
public class y2 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.u2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.a3 f287787a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.a3 a3Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16 c21614x5c06ae16) {
        super(a3Var.f279895g);
        this.f287787a = a3Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.a3 a3Var = this.f287787a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingAnimFrame", "onAnimationEnd: %s", a3Var.f279894f);
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366 = a3Var.f279894f;
        if (c16077xb54fe366 != null) {
            c16077xb54fe366.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.z2(a3Var));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingAnimFrame", "mTargetView is NULL.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.a3 a3Var = this.f287787a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingAnimFrame", "onAnimationStart: %s", a3Var.f279894f);
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366 = a3Var.f279894f;
        if (c16077xb54fe366 != null) {
            c16077xb54fe366.postDelayed(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.x2(this), a3Var.f279893e);
        }
    }
}
