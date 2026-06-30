package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

/* loaded from: classes15.dex */
public class a1 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.b1 f257765a;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.b1 b1Var) {
        this.f257765a = b1Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceViewAnimationHelper", "next end");
        com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.f1 f1Var = this.f257765a.f257768a;
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
