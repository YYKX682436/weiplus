package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class h5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72673d;

    public h5(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI) {
        this.f72673d = launchAAUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72673d;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) launchAAUI.P1.getLayoutParams();
        layoutParams.height = 0;
        launchAAUI.P1.setLayoutParams(layoutParams);
        android.widget.ScrollView scrollView = launchAAUI.O1;
        if (scrollView != null) {
            scrollView.scrollTo(0, 0);
        }
        launchAAUI.P1.postDelayed(new com.tencent.mm.plugin.aa.ui.g5(this), 100L);
    }
}
