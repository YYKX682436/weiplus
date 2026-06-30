package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes3.dex */
public final class e9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f228400d;

    public e9(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d) {
        this.f228400d = activityC16371xf216ae6d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup.LayoutParams layoutParams;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d.f227704r3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = this.f228400d;
        activityC16371xf216ae6d.getClass();
        new android.util.DisplayMetrics();
        android.util.DisplayMetrics displayMetrics = activityC16371xf216ae6d.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            int i18 = displayMetrics.widthPixels;
            double d17 = i18 / activityC16371xf216ae6d.f227747p3;
            int i19 = (int) (activityC16371xf216ae6d.f227750q3 * d17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[fixBgAreaHeight] screen  width: %d, scale : %f, fixedHeight: %d", java.lang.Integer.valueOf(i18), java.lang.Double.valueOf(d17), java.lang.Integer.valueOf(i19));
            android.widget.RelativeLayout relativeLayout = activityC16371xf216ae6d.H;
            if (relativeLayout != null) {
                android.widget.RelativeLayout relativeLayout2 = activityC16371xf216ae6d.H;
                relativeLayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams((relativeLayout2 == null || (layoutParams = relativeLayout2.getLayoutParams()) == null) ? 0 : layoutParams.width, i19));
            }
        }
        android.widget.RelativeLayout relativeLayout3 = activityC16371xf216ae6d.H;
        if (relativeLayout3 == null) {
            return;
        }
        relativeLayout3.setVisibility(0);
    }
}
