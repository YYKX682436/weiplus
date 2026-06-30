package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29;

/* loaded from: classes9.dex */
public class w4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f227212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f227213e;

    public w4(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, java.lang.String str) {
        this.f227212d = c22789xd23e9a9b;
        this.f227213e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f227212d;
        c22789xd23e9a9b.startAnimation(alphaAnimation);
        alphaAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.v4(this));
        c22789xd23e9a9b.m82581x764e93a7(this.f227213e);
        c22789xd23e9a9b.n();
        c22789xd23e9a9b.d();
        c22789xd23e9a9b.g();
        c22789xd23e9a9b.setVisibility(0);
    }
}
