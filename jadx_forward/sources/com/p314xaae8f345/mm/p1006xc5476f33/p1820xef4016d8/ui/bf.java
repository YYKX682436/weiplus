package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes3.dex */
public final class bf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def f228286d;

    public bf(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def activityC16377xf00b6def) {
        this.f228286d = activityC16377xf00b6def;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def activityC16377xf00b6def = this.f228286d;
        android.widget.ImageView imageView = activityC16377xf00b6def.A;
        android.view.ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        float width = (activityC16377xf00b6def.f227845v != null ? r3.getWidth() : 0) * 1.0993f;
        if (layoutParams2 != null) {
            layoutParams2.width = java.lang.Math.round(width);
        }
        if (layoutParams2 != null) {
            layoutParams2.height = java.lang.Math.round(width * 1.72f);
        }
        android.widget.ImageView imageView2 = activityC16377xf00b6def.A;
        if (imageView2 != null) {
            imageView2.setLayoutParams(layoutParams2);
        }
        android.view.View view = activityC16377xf00b6def.f227845v;
        android.view.ViewGroup.LayoutParams layoutParams3 = view != null ? view.getLayoutParams() : null;
        if (layoutParams3 != null) {
            float f17 = 1;
            layoutParams3.width += (int) (i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) * f17);
            layoutParams3.height -= (int) (f17 * i65.a.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
            android.view.View view2 = activityC16377xf00b6def.f227845v;
            if (view2 != null) {
                view2.setLayoutParams(layoutParams3);
            }
        }
        android.view.View view3 = activityC16377xf00b6def.E;
        android.view.ViewGroup.LayoutParams layoutParams4 = view3 != null ? view3.getLayoutParams() : null;
        float round = (float) java.lang.Math.round(width * 0.98d);
        if (layoutParams4 != null) {
            layoutParams4.width = java.lang.Math.round(round);
        }
        if (layoutParams4 != null) {
            layoutParams4.height = java.lang.Math.round(round * 1.72f);
        }
        android.view.View view4 = activityC16377xf00b6def.E;
        if (view4 == null) {
            return;
        }
        view4.setLayoutParams(layoutParams4);
    }
}
