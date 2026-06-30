package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class ec {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f84601a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launching.dc f84602b;

    public ec(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.appbrand.launching.dc dcVar) {
        this.f84601a = str;
        this.f84602b = dcVar;
    }

    public static com.tencent.mm.modelbase.o a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.h00 h00Var = new r45.h00();
        h00Var.f375700d = str;
        h00Var.f375701e = str2;
        h00Var.f375702f = str3;
        lVar.f70664a = h00Var;
        lVar.f70665b = new r45.i00();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp/checkdemoinfo";
        lVar.f70667d = 1124;
        return lVar.a();
    }

    public final void b(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.appbrand.launching.dc dcVar;
        com.tencent.mm.plugin.appbrand.launching.x0$$a x0__a;
        com.tencent.mm.plugin.appbrand.launching.x0 x0Var;
        com.tencent.mm.plugin.appbrand.launching.p0 p0Var;
        boolean k17 = com.tencent.mm.plugin.appbrand.app.r9.Di().k(this.f84601a, i17, str, str2, 0L, 0L);
        if (k17) {
            java.lang.String str3 = this.f84601a;
            ri1.g.a(str3, i17);
            ((gk1.g) com.tencent.mm.plugin.appbrand.app.r9.fj(gk1.g.class)).y0(str3, i17, gk1.d.f272461a);
        }
        if (!k17 || (dcVar = this.f84602b) == null || (p0Var = (x0Var = (x0__a = (com.tencent.mm.plugin.appbrand.launching.x0$$a) dcVar).f85357a).f85037e) == null) {
            return;
        }
        java.lang.String[] strArr = {null};
        boolean a17 = ((com.tencent.mm.plugin.appbrand.launching.a1) p0Var).a(strArr);
        boolean[] zArr = x0__a.f85358b;
        if (!a17) {
            zArr[0] = true;
            return;
        }
        zArr[0] = false;
        java.lang.String str4 = strArr[0];
        iz5.a.d(null, str4);
        if (u46.l.c(x0Var.f85350t, str4)) {
            return;
        }
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = x0Var.f85348r;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPreLaunchProcessWC", "resetInstanceId for username[%s] appId[%s] %s -> %s", launchParcel.f84901d, launchParcel.f84902e, x0Var.f85350t, str4);
        x0Var.f85350t = str4;
    }
}
