package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class z3 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72911a;

    public z3(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI) {
        this.f72911a = launchAAUI;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f72911a.V.sendAccessibilityEvent(128);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
