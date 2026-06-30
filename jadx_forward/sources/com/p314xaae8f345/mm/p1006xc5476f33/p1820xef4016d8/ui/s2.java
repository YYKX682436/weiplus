package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d f228932d;

    public s2(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d) {
        this.f228932d = activityC16363x8a0a619d;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = this.f228932d;
        if (activityC16363x8a0a619d.isFinishing() || activityC16363x8a0a619d.isDestroyed()) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) activityC16363x8a0a619d.f227635w.findViewById(com.p314xaae8f345.mm.R.id.izt);
        if (activityC16363x8a0a619d.G.getVisibility() == 8 && activityC16363x8a0a619d.F.getVisibility() == 8 && activityC16363x8a0a619d.E.getVisibility() == 8 && textView.getVisibility() == 8) {
            return;
        }
        android.view.View findViewById = activityC16363x8a0a619d.findViewById(com.p314xaae8f345.mm.R.id.iza);
        android.view.View view = activityC16363x8a0a619d.f227635w;
        if (view == null || findViewById == null) {
            return;
        }
        if (!activityC16363x8a0a619d.O2) {
            activityC16363x8a0a619d.O2 = true;
            activityC16363x8a0a619d.S2 = view.getHeight();
        }
        int height = findViewById.getHeight();
        activityC16363x8a0a619d.f227635w.getGlobalVisibleRect(new android.graphics.Rect());
        int top = height - activityC16363x8a0a619d.f227635w.getTop();
        int i17 = activityC16363x8a0a619d.S2;
        if (top > i17) {
            activityC16363x8a0a619d.f227635w.setMinimumHeight(top);
        } else {
            activityC16363x8a0a619d.f227635w.setMinimumHeight(i17);
        }
    }
}
