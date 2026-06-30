package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes3.dex */
public class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d f228627d;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d) {
        this.f228627d = activityC16363x8a0a619d;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d.f227580p3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = this.f228627d;
        activityC16363x8a0a619d.getClass();
        new android.util.DisplayMetrics();
        android.util.DisplayMetrics displayMetrics = activityC16363x8a0a619d.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            int i18 = displayMetrics.widthPixels;
            double d17 = i18 / 750.0d;
            int i19 = (int) (240.0d * d17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyDetailUI", "hy: screen  width: %d, scale : %f, fixedHeight: %d", java.lang.Integer.valueOf(i18), java.lang.Double.valueOf(d17), java.lang.Integer.valueOf(i19));
            activityC16363x8a0a619d.H.setLayoutParams(new android.widget.LinearLayout.LayoutParams(activityC16363x8a0a619d.H.getLayoutParams().width, i19));
        }
        activityC16363x8a0a619d.H.setVisibility(0);
    }
}
