package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class pf implements com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f6 f228849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16379x3e9c9e32 f228850b;

    public pf(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16379x3e9c9e32 activityC16379x3e9c9e32, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.f6 f6Var) {
        this.f228850b = activityC16379x3e9c9e32;
        this.f228849a = f6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.l
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16379x3e9c9e32 activityC16379x3e9c9e32 = this.f228850b;
        activityC16379x3e9c9e32.f227860n.setVisibility(4);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(activityC16379x3e9c9e32.mo55332x76847179(), activityC16379x3e9c9e32.f227860n, this.f228849a.f226813h.f226771h);
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.of(this));
        activityC16379x3e9c9e32.f227860n.startAnimation(alphaAnimation);
    }
}
