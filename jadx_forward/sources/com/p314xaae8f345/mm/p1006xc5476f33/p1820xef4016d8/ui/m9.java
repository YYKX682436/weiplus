package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes3.dex */
public final class m9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f228705d;

    public m9(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d) {
        this.f228705d = activityC16371xf216ae6d;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = this.f228705d;
        int h17 = com.p314xaae8f345.mm.ui.bl.h(activityC16371xf216ae6d.mo55332x76847179());
        int a17 = com.p314xaae8f345.mm.ui.bl.a(activityC16371xf216ae6d.mo55332x76847179());
        android.widget.LinearLayout linearLayout = activityC16371xf216ae6d.f227744p0;
        int height = h17 + ((a17 - (linearLayout != null ? linearLayout.getHeight() : 0)) / 2);
        android.widget.LinearLayout linearLayout2 = activityC16371xf216ae6d.f227744p0;
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout2 != null ? linearLayout2.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = height;
        }
        android.widget.LinearLayout linearLayout3 = activityC16371xf216ae6d.f227744p0;
        if (linearLayout3 != null) {
            linearLayout3.setLayoutParams(marginLayoutParams);
        }
        android.widget.LinearLayout linearLayout4 = activityC16371xf216ae6d.f227744p0;
        if (linearLayout4 != null && linearLayout4.getHeight() == 0) {
            android.widget.LinearLayout linearLayout5 = activityC16371xf216ae6d.f227744p0;
            float b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 14);
            if (linearLayout5 != null) {
                linearLayout5.setOutlineProvider(new zl5.a(true, true, b17));
            }
            if (linearLayout5 == null) {
                return;
            }
            linearLayout5.setClipToOutline(true);
            return;
        }
        android.widget.LinearLayout linearLayout6 = activityC16371xf216ae6d.f227744p0;
        float height2 = (linearLayout6 != null ? linearLayout6.getHeight() : 0) / 2;
        if (linearLayout6 != null) {
            linearLayout6.setOutlineProvider(new zl5.a(true, true, height2));
        }
        if (linearLayout6 == null) {
            return;
        }
        linearLayout6.setClipToOutline(true);
    }
}
