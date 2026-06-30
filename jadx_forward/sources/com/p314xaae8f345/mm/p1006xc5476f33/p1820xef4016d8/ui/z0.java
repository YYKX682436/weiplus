package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16361xa250edf2 f229286d;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16361xa250edf2 activityC16361xa250edf2) {
        this.f229286d = activityC16361xa250edf2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16361xa250edf2 activityC16361xa250edf2 = this.f229286d;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) activityC16361xa250edf2.G.getLayoutParams();
        int width = (int) (activityC16361xa250edf2.f227556g.getWidth() * 1.1f);
        layoutParams.width = width;
        layoutParams.height = (int) (width * 1.72f);
        activityC16361xa250edf2.G.setLayoutParams(layoutParams);
    }
}
