package com.tencent.mm.plugin.appbrand.report;

@j95.b
/* loaded from: classes7.dex */
public final class j1 extends i95.w implements gg1.g {

    /* renamed from: d, reason: collision with root package name */
    public boolean f87885d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f87886e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f87887f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f87888g = "";

    public static final com.tencent.mm.autogen.mmdata.rpt.WeAppVideoCastStruct wi(com.tencent.mm.plugin.appbrand.report.j1 j1Var, int i17) {
        j1Var.getClass();
        com.tencent.mm.autogen.mmdata.rpt.WeAppVideoCastStruct weAppVideoCastStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppVideoCastStruct();
        weAppVideoCastStruct.f62877d = weAppVideoCastStruct.b("AppId", j1Var.f87887f, true);
        if (com.tencent.mm.plugin.appbrand.app.r9.ij().k1(weAppVideoCastStruct.f62877d, "appInfo") != null) {
            weAppVideoCastStruct.f62878e = r1.u0().f305629d + 1000;
        }
        weAppVideoCastStruct.f62882i = i17;
        weAppVideoCastStruct.f62879f = java.lang.System.currentTimeMillis();
        weAppVideoCastStruct.f62881h = weAppVideoCastStruct.b("VideoUrl", j1Var.f87886e, true);
        weAppVideoCastStruct.f62880g = weAppVideoCastStruct.b("PagePath", j1Var.f87888g, true);
        weAppVideoCastStruct.f62888o = j1Var.f87885d ? 2L : 1L;
        return weAppVideoCastStruct;
    }

    public void Ai(int i17) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.appbrand.report.f1(this, i17));
    }

    public void Bi(boolean z17, java.lang.String deviceName, java.lang.String manufactureName, int i17) {
        kotlin.jvm.internal.o.g(deviceName, "deviceName");
        kotlin.jvm.internal.o.g(manufactureName, "manufactureName");
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.appbrand.report.h1(this, i17, z17, deviceName, manufactureName));
    }
}
