package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class a4 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72569b;

    public a4(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI, java.lang.String str) {
        this.f72569b = launchAAUI;
        this.f72568a = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72569b;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "click launchDialog cancel，mode：%s，submode：%s", java.lang.Integer.valueOf(launchAAUI.f72504h), java.lang.Integer.valueOf(launchAAUI.f72505i));
            launchAAUI.f7(13);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "click launchDialog confirm，mode：%s，submode：%s", java.lang.Integer.valueOf(launchAAUI.f72504h), java.lang.Integer.valueOf(launchAAUI.f72505i));
        launchAAUI.getClass();
        launchAAUI.u7(launchAAUI, this.f72568a, false, new java.util.ArrayList());
        launchAAUI.f7(12);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 8, 4);
    }
}
