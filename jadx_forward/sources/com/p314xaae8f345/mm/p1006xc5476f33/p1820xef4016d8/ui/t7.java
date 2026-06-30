package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class t7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f228979d;

    public t7(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d) {
        this.f228979d = activityC16371xf216ae6d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = this.f228979d;
        if (activityC16371xf216ae6d.isFinishing() || activityC16371xf216ae6d.isDestroyed()) {
            return;
        }
        android.view.View view = activityC16371xf216ae6d.f227761w;
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.izt) : null;
        android.view.ViewGroup viewGroup = activityC16371xf216ae6d.G;
        if (viewGroup != null && viewGroup.getVisibility() == 8) {
            android.widget.TextView textView2 = activityC16371xf216ae6d.F;
            if (textView2 != null && textView2.getVisibility() == 8) {
                android.widget.TextView textView3 = activityC16371xf216ae6d.E;
                if (textView3 != null && textView3.getVisibility() == 8) {
                    if (textView != null && textView.getVisibility() == 8) {
                        return;
                    }
                }
            }
        }
        android.view.View findViewById = activityC16371xf216ae6d.findViewById(com.p314xaae8f345.mm.R.id.iza);
        android.view.View view2 = activityC16371xf216ae6d.f227761w;
        if (view2 == null || findViewById == null) {
            return;
        }
        if (!activityC16371xf216ae6d.O2) {
            activityC16371xf216ae6d.O2 = true;
            activityC16371xf216ae6d.S2 = view2 != null ? view2.getHeight() : 0;
        }
        int height = findViewById.getHeight();
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view3 = activityC16371xf216ae6d.f227761w;
        if (view3 != null) {
            view3.getGlobalVisibleRect(rect);
        }
        android.view.View view4 = activityC16371xf216ae6d.f227761w;
        int top = height - (view4 != null ? view4.getTop() : 0);
        int i17 = activityC16371xf216ae6d.S2;
        if (top > i17) {
            android.view.View view5 = activityC16371xf216ae6d.f227761w;
            if (view5 == null) {
                return;
            }
            view5.setMinimumHeight(top);
            return;
        }
        android.view.View view6 = activityC16371xf216ae6d.f227761w;
        if (view6 == null) {
            return;
        }
        view6.setMinimumHeight(i17);
    }
}
