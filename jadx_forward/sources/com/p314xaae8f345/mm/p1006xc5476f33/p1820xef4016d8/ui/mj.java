package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class mj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9 f228726d;

    public mj(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9 activityC16387x8521db9) {
        this.f228726d = activityC16387x8521db9;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9 activityC16387x8521db9 = this.f228726d;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) activityC16387x8521db9.f228024z.getLayoutParams();
        float width = activityC16387x8521db9.f228016v.getWidth() * 1.0993f;
        layoutParams.width = java.lang.Math.round(width);
        layoutParams.height = java.lang.Math.round(width * 1.72f);
        activityC16387x8521db9.f228024z.setLayoutParams(layoutParams);
        android.view.ViewGroup.LayoutParams layoutParams2 = activityC16387x8521db9.f228016v.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width += (int) (i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) * 1.0f);
            layoutParams2.height -= (int) (i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) * 1.0f);
            activityC16387x8521db9.f228016v.setLayoutParams(layoutParams2);
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = activityC16387x8521db9.D.getLayoutParams();
        float round = (float) java.lang.Math.round(width * 0.98d);
        layoutParams3.width = java.lang.Math.round(round);
        layoutParams3.height = java.lang.Math.round(round * 1.72f);
        activityC16387x8521db9.D.setLayoutParams(layoutParams3);
    }
}
