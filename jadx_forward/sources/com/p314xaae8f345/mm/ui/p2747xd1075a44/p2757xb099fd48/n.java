package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes9.dex */
public class n implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u f293461a;

    public n(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u uVar) {
        this.f293461a = uVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u uVar = this.f293461a;
        uVar.f293527f.C.setVisibility(0);
        uVar.f293527f.r(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f293461a.f293527f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0.b(j0Var, j0Var.I);
    }
}
