package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes15.dex */
public class x6 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13478xcdc36e25 f181256a;

    public x6(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13478xcdc36e25 c13478xcdc36e25) {
        this.f181256a = c13478xcdc36e25;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f181256a.f180887e.setVisibility(4);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        this.f181256a.f180887e.setVisibility(0);
    }
}
