package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class z2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x2 f289823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b3 f289824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f289825f;

    public z2(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x2 x2Var, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b3 b3Var, android.view.View view) {
        this.f289823d = x2Var;
        this.f289824e = b3Var;
        this.f289825f = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b3 b3Var = this.f289824e;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.x2 x2Var = this.f289823d;
        if (x2Var != null) {
            b3Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationClickStatusController", "[resetClickStatus]");
            this.f289825f.setBackgroundResource(x2Var.a() ? com.p314xaae8f345.mm.R.C30861xcebc809e.aj6 : com.p314xaae8f345.mm.R.C30861xcebc809e.f562862qp);
            b3Var.f288996e = null;
            b3Var.f288993b = null;
            b3Var.f288995d = null;
            b3Var.f288997f = null;
        }
        b3Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConversationClickStatusController", "[dismissClickStatus] setBackground back!");
    }
}
