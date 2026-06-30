package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class pb implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f251742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 f251743e;

    public pb(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773, int i17) {
        this.f251743e = activityC18007x6d5e9773;
        this.f251742d = i17;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        int i39 = this.f251742d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773 = this.f251743e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayoutChange", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$21");
        try {
            android.graphics.Rect rect = new android.graphics.Rect();
            android.view.Window window = activityC18007x6d5e9773.getWindow();
            java.lang.String str = activityC18007x6d5e9773.f248233d;
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            int i47 = rect.top;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "rect=" + rect.toString() + ", screenH=" + com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.c7(activityC18007x6d5e9773) + ", cutH=" + i39 + ", statusBarH=" + i47 + ", isHalfScreen=" + com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.e7(activityC18007x6d5e9773));
            if (i47 > 0) {
                if (i47 != i39) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "cutH != statusBarH, reset height");
                    if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.e7(activityC18007x6d5e9773)) {
                        android.view.View findViewById = activityC18007x6d5e9773.findViewById(com.p314xaae8f345.mm.R.id.gw6);
                        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) findViewById.getLayoutParams();
                        layoutParams.topMargin = i47;
                        findViewById.setLayoutParams(layoutParams);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "fixContentHeight, containerParams top margin is " + i47 + ", screenHeight is " + com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.c7(activityC18007x6d5e9773));
                    } else {
                        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.b7(activityC18007x6d5e9773).getLayoutParams();
                        layoutParams2.height = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.c7(activityC18007x6d5e9773) - i47;
                        layoutParams2.topMargin = i47;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.b7(activityC18007x6d5e9773).setLayoutParams(layoutParams2);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "fixContentHeight, root height is " + layoutParams2.height + ", root top margin is " + i47 + ", screenHeight is " + com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.c7(activityC18007x6d5e9773));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$5600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        p012xc85e97e9.p093xedfae76a.j0 j0Var = activityC18007x6d5e9773.H2;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$5600", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                        j0Var.mo523x53d8522f(java.lang.Integer.valueOf(layoutParams2.height));
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$5700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    int i48 = activityC18007x6d5e9773.P1;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$5700", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    sb6.append(i48);
                    sb6.append("|");
                    sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.c7(activityC18007x6d5e9773));
                    ca4.e0.a("cut_height_error", "", i39, i47, sb6.toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.b7(activityC18007x6d5e9773).removeOnLayoutChangeListener(this);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(activityC18007x6d5e9773.f248233d, "onLayoutChange error:" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773.b7(activityC18007x6d5e9773).removeOnLayoutChangeListener(this);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayoutChange", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$21");
    }
}
