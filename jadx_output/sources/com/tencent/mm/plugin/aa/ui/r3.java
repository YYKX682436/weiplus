package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class r3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72786a;

    public r3(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI) {
        this.f72786a = launchAAUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        h61.i iVar = (h61.i) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "fetch operation data finish");
        if (iVar == null) {
            return null;
        }
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72786a;
        launchAAUI.W = iVar;
        if (!launchAAUI.k7()) {
            launchAAUI.C7();
            launchAAUI.H7();
            launchAAUI.s7();
            launchAAUI.A7();
            com.tencent.mm.plugin.aa.ui.LaunchAAUI.g7(launchAAUI);
        }
        r45.tw4 tw4Var = launchAAUI.W.f279150d;
        launchAAUI.Q1.a();
        launchAAUI.Q1.setBannerData(tw4Var);
        return null;
    }
}
