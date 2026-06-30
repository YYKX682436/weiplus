package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes8.dex */
public class d4 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.n4 f291882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f291883e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.s4 f291884f;

    public d4(com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var, com.p314xaae8f345.mm.ui.p2740x696c9db.n4 n4Var, android.view.View view) {
        this.f291884f = s4Var;
        this.f291882d = n4Var;
        this.f291883e = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var = this.f291884f;
        s4Var.getClass();
        s4Var.f292251y = 3;
        com.p314xaae8f345.mm.ui.p2740x696c9db.n4 n4Var = this.f291882d;
        if (n4Var != null) {
            n4Var.a();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.n4 n4Var = this.f291882d;
        if (n4Var != null) {
            n4Var.mo54453xbb3aa236();
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var = this.f291884f;
        s4Var.getClass();
        s4Var.f292251y = 3;
        android.view.View view = this.f291883e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImagePreviewAnimation", "pennqin, gallery animation result, sx %s, sy %s, tx %s, ty %s.", java.lang.Float.valueOf(view.getScaleX()), java.lang.Float.valueOf(view.getScaleY()), java.lang.Float.valueOf(view.getTranslationX()), java.lang.Float.valueOf(view.getTranslationY()));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.n4 n4Var = this.f291882d;
        if (n4Var != null) {
            n4Var.mo54454xd7e2f2fd();
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var = this.f291884f;
        s4Var.getClass();
        s4Var.f292251y = 2;
    }
}
