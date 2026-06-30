package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class vf implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15329xd3ad392c f214771a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f214772b;

    public vf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15329xd3ad392c c15329xd3ad392c, pi0.n1 n1Var, android.widget.FrameLayout frameLayout) {
        this.f214771a = c15329xd3ad392c;
        this.f214772b = frameLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15329xd3ad392c.f212863q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15329xd3ad392c c15329xd3ad392c = this.f214771a;
        c15329xd3ad392c.getClass();
        android.widget.FrameLayout frameLayout = c15329xd3ad392c.f212871n;
        if (frameLayout != null) {
            com.p314xaae8f345.mm.ui.kk.c(frameLayout);
        }
        c15329xd3ad392c.f212871n = this.f214772b;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
