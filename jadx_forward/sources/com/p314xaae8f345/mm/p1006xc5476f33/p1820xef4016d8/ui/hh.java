package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class hh implements com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16382x78dd3481 f228530a;

    public hh(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16382x78dd3481 activityC16382x78dd3481) {
        this.f228530a = activityC16382x78dd3481;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.l
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16382x78dd3481 activityC16382x78dd3481 = this.f228530a;
        if (activityC16382x78dd3481.f227901J) {
            activityC16382x78dd3481.A.setVisibility(4);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(activityC16382x78dd3481.mo55332x76847179(), activityC16382x78dd3481.A, activityC16382x78dd3481.H);
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(500L);
            alphaAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.gh(this));
            activityC16382x78dd3481.A.startAnimation(alphaAnimation);
            activityC16382x78dd3481.f227901J = false;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(activityC16382x78dd3481.mo55332x76847179(), activityC16382x78dd3481.A, activityC16382x78dd3481.H);
            activityC16382x78dd3481.A.invalidate();
        }
        activityC16382x78dd3481.c7(true);
        activityC16382x78dd3481.f227925z.setFocusable(true);
        activityC16382x78dd3481.f227925z.setContentDescription("" + (activityC16382x78dd3481.I / 100.0d));
    }
}
