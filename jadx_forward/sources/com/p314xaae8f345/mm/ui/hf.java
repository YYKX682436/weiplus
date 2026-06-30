package com.p314xaae8f345.mm.ui;

/* loaded from: classes14.dex */
public class hf implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f290414a;

    public hf(com.p314xaae8f345.mm.ui.C21424xdbf688d7 c21424xdbf688d7, android.widget.LinearLayout linearLayout) {
        this.f290414a = linearLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f290414a.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
