package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class q2 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI f72777a;

    public q2(com.tencent.mm.plugin.aa.ui.LaunchAAByPersonAmountSelectUI launchAAByPersonAmountSelectUI) {
        this.f72777a = launchAAByPersonAmountSelectUI;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f72777a.f72486o.sendAccessibilityEvent(128);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
