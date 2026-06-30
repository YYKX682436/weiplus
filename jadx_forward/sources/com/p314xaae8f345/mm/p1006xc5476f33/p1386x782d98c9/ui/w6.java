package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes15.dex */
public class w6 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13478xcdc36e25 f181248a;

    public w6(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13478xcdc36e25 c13478xcdc36e25) {
        this.f181248a = c13478xcdc36e25;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13478xcdc36e25 c13478xcdc36e25 = this.f181248a;
        c13478xcdc36e25.f180890h.reset();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(c13478xcdc36e25.f180891i, 4000L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        this.f181248a.f180887e.setVisibility(0);
    }
}
