package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes8.dex */
public class j4 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.n4 f292042a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.s4 f292043b;

    public j4(com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var, com.p314xaae8f345.mm.ui.p2740x696c9db.n4 n4Var) {
        this.f292043b = s4Var;
        this.f292042a = n4Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewAnimation", "ExitAnimation end!");
        com.p314xaae8f345.mm.ui.p2740x696c9db.n4 n4Var = this.f292042a;
        if (n4Var != null) {
            n4Var.mo54453xbb3aa236();
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var = this.f292043b;
        s4Var.getClass();
        s4Var.f292251y = 1;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewAnimation", "ExitAnimation start!");
        com.p314xaae8f345.mm.ui.p2740x696c9db.n4 n4Var = this.f292042a;
        if (n4Var != null) {
            n4Var.mo54454xd7e2f2fd();
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var = this.f292043b;
        s4Var.getClass();
        s4Var.f292251y = 4;
    }
}
