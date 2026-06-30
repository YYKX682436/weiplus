package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes3.dex */
public class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72810d;

    public t3(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI) {
        this.f72810d = launchAAUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72810d;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) launchAAUI.f72517u.getLayoutParams();
        android.view.View findViewById = launchAAUI.findViewById(com.tencent.mm.R.id.hty);
        layoutParams.leftMargin = findViewById.getLeft() - 12;
        layoutParams.width = findViewById.getWidth() + 24;
        layoutParams.topMargin = findViewById.getTop() - 12;
        layoutParams.height = findViewById.getHeight() + 24;
        launchAAUI.f72517u.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.aa.ui.LaunchAAUI.g7(launchAAUI);
    }
}
