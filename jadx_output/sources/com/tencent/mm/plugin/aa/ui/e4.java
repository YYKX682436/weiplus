package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class e4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72627e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.g4 f72628f;

    public e4(com.tencent.mm.plugin.aa.ui.g4 g4Var, java.lang.String str, java.lang.String str2) {
        this.f72628f = g4Var;
        this.f72626d = str;
        this.f72627e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.aa.ui.g4 g4Var = this.f72628f;
        if (com.tencent.mm.vfs.w6.j(g4Var.f72662e.l7())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", " upload success , delete file");
            com.tencent.mm.vfs.w6.h(g4Var.f72662e.l7());
        }
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = g4Var.f72662e;
        if (launchAAUI.f72505i != 4) {
            launchAAUI.w7(g4Var.f72658a, g4Var.f72659b, this.f72626d, this.f72627e, g4Var.f72660c, g4Var.f72661d);
        } else if (!launchAAUI.t7()) {
            g4Var.f72662e.x7(g4Var.f72658a, g4Var.f72659b, this.f72626d, this.f72627e, g4Var.f72660c, g4Var.f72661d);
        } else {
            com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI2 = g4Var.f72662e;
            launchAAUI2.x7(g4Var.f72658a, g4Var.f72659b, this.f72626d, this.f72627e, g4Var.f72660c, launchAAUI2.H1);
        }
    }
}
