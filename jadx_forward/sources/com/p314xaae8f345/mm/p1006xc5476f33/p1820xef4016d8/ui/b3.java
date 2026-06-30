package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes3.dex */
public class b3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d f228269d;

    public b3(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d) {
        this.f228269d = activityC16363x8a0a619d;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = this.f228269d;
        int h17 = com.p314xaae8f345.mm.ui.bl.h(activityC16363x8a0a619d.mo55332x76847179()) + ((com.p314xaae8f345.mm.ui.bl.a(activityC16363x8a0a619d.mo55332x76847179()) - activityC16363x8a0a619d.f227620p0.getHeight()) / 2);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) activityC16363x8a0a619d.f227620p0.getLayoutParams();
        marginLayoutParams.topMargin = h17;
        activityC16363x8a0a619d.f227620p0.setLayoutParams(marginLayoutParams);
        if (activityC16363x8a0a619d.f227620p0.getHeight() != 0) {
            android.widget.LinearLayout linearLayout = activityC16363x8a0a619d.f227620p0;
            float height = linearLayout.getHeight() / 2;
            if (linearLayout != null) {
                linearLayout.setOutlineProvider(new zl5.a(true, true, height));
            }
            if (linearLayout == null) {
                return;
            }
            linearLayout.setClipToOutline(true);
            return;
        }
        android.widget.LinearLayout linearLayout2 = activityC16363x8a0a619d.f227620p0;
        float b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 14);
        if (linearLayout2 != null) {
            linearLayout2.setOutlineProvider(new zl5.a(true, true, b17));
        }
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setClipToOutline(true);
    }
}
