package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes15.dex */
public class s2 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.t2 f284189a;

    public s2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.t2 t2Var) {
        this.f284189a = t2Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16 c21614x5c06ae16 = this.f284189a.f284223d;
        java.lang.String str = com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16.W;
        c21614x5c06ae16.d();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.t2 t2Var = this.f284189a;
        ((android.os.Vibrator) t2Var.f284223d.getContext().getSystemService("vibrator")).vibrate(500L);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21614x5c06ae16 c21614x5c06ae16 = t2Var.f284223d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.b3 b3Var = c21614x5c06ae16.V;
        if (b3Var != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p9 p9Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p9) b3Var;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.n9.a(p9Var.f283621c, c21614x5c06ae16.S, c21614x5c06ae16.R, p9Var.f283619a, p9Var.f283620b);
        }
    }
}
