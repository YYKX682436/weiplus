package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

/* loaded from: classes15.dex */
public class d1 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.f1 f257775a;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.f1 f1Var) {
        this.f257775a = f1Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.f1 f1Var = this.f257775a;
        if (f1Var != null) {
            f1Var.a();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
