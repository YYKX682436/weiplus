package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

/* loaded from: classes15.dex */
public class b1 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.f1 f257768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f257769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f257770c;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.f1 f1Var, int i17, android.view.View view) {
        this.f257768a = f1Var;
        this.f257769b = i17;
        this.f257770c = view;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.f1 f1Var = this.f257768a;
        if (f1Var != null) {
            f1Var.b();
        }
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0, this.f257769b, 0, 0.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(200L);
        translateAnimation.setStartOffset(0L);
        translateAnimation.setRepeatMode(-1);
        translateAnimation.setRepeatCount(0);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.a1(this));
        this.f257770c.startAnimation(translateAnimation);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
