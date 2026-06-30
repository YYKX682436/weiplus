package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes10.dex */
public final class d1 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19728x5f1b2bb4 f273092a;

    public d1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19728x5f1b2bb4 c19728x5f1b2bb4) {
        this.f273092a = c19728x5f1b2bb4;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19728x5f1b2bb4 c19728x5f1b2bb4 = this.f273092a;
        c19728x5f1b2bb4.f272892g = true;
        c19728x5f1b2bb4.f272893h = false;
        if (c19728x5f1b2bb4.m75776x3036d7ac() != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19728x5f1b2bb4.m75776x3036d7ac());
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }
}
