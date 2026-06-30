package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class e4 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4 f282422a;

    public e4(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4 g4Var) {
        this.f282422a = g4Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4 g4Var = this.f282422a;
        g4Var.j(true);
        fq.b bVar = g4Var.f282479a.f346952p;
        bVar.f346930h.setVisibility(8);
        bVar.f346926d.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
