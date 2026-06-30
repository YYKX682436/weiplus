package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class t8 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.Animation.AnimationListener f90234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f90235b;

    public t8(android.view.animation.Animation.AnimationListener animationListener, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f90234a = animationListener;
        this.f90235b = appBrandRuntime;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        android.view.animation.Animation.AnimationListener animationListener = this.f90234a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(animation);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        android.view.animation.Animation.AnimationListener animationListener = this.f90234a;
        if (animationListener != null) {
            animationListener.onAnimationRepeat(animation);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        android.view.animation.Animation.AnimationListener animationListener = this.f90234a;
        if (animationListener != null) {
            animationListener.onAnimationStart(animation);
        }
        this.f90235b.f74810s.setWillNotDraw(false);
    }
}
