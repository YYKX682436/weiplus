package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class u3 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p2658x373aa5.C21801xa1cf70e9 f283007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4 f283008b;

    public u3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p2658x373aa5.C21801xa1cf70e9 c21801xa1cf70e9, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.g4 g4Var) {
        this.f283007a = c21801xa1cf70e9;
        this.f283008b = g4Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t3 t3Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t3(this.f283008b);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p2658x373aa5.C21801xa1cf70e9 c21801xa1cf70e9 = this.f283007a;
        c21801xa1cf70e9.post(t3Var);
        c21801xa1cf70e9.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
