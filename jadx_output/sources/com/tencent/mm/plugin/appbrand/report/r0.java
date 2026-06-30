package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes7.dex */
public final class r0 implements uf.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.report.q0 f88394d = new com.tencent.mm.plugin.appbrand.report.q0(null);

    /* renamed from: a, reason: collision with root package name */
    public final uf.f f88395a;

    /* renamed from: b, reason: collision with root package name */
    public final long f88396b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f88397c;

    public r0(uf.f castContext) {
        com.tencent.mm.plugin.appbrand.page.i3 x07;
        com.tencent.mm.plugin.appbrand.page.v5 pageView;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07;
        kotlin.jvm.internal.o.g(castContext, "castContext");
        this.f88395a = castContext;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = ((uf.o1) castContext).f427075g;
        java.lang.String str = null;
        com.tencent.mm.plugin.appbrand.o6 o6Var = appBrandRuntime instanceof com.tencent.mm.plugin.appbrand.o6 ? (com.tencent.mm.plugin.appbrand.o6) appBrandRuntime : null;
        this.f88396b = (o6Var == null || (u07 = o6Var.u0()) == null) ? 0L : u07.f47284z + 1000;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2 = ((uf.o1) castContext).f427075g;
        if (appBrandRuntime2 != null && (x07 = appBrandRuntime2.x0()) != null && (pageView = x07.getPageView()) != null) {
            str = pageView.X1();
        }
        this.f88397c = str == null ? "" : str;
    }

    @Override // uf.l
    public void a(uf.a action, int i17, java.lang.String manufactureName, java.lang.String deviceName, boolean z17) {
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(manufactureName, "manufactureName");
        kotlin.jvm.internal.o.g(deviceName, "deviceName");
        com.tencent.mm.autogen.mmdata.rpt.WeAppVideoCastStruct weAppVideoCastStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppVideoCastStruct();
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = ((uf.o1) this.f88395a).f427075g;
        weAppVideoCastStruct.f62877d = weAppVideoCastStruct.b("AppId", appBrandRuntime != null ? appBrandRuntime.f74803n : null, true);
        weAppVideoCastStruct.f62878e = this.f88396b;
        weAppVideoCastStruct.f62879f = java.lang.System.currentTimeMillis();
        weAppVideoCastStruct.f62880g = weAppVideoCastStruct.b("PagePath", this.f88397c, true);
        weAppVideoCastStruct.f62881h = weAppVideoCastStruct.b("VideoUrl", com.tencent.mm.plugin.appbrand.utils.i1.a(((uf.o1) this.f88395a).f427076h), true);
        weAppVideoCastStruct.f62882i = action.f426966d;
        weAppVideoCastStruct.f62883j = i17;
        weAppVideoCastStruct.f62884k = z17 ? 1L : 0L;
        weAppVideoCastStruct.f62886m = weAppVideoCastStruct.b("ModelName", deviceName, true);
        weAppVideoCastStruct.f62887n = weAppVideoCastStruct.b("ManuFacturer", manufactureName, true);
        uf.o1 o1Var = (uf.o1) this.f88395a;
        weAppVideoCastStruct.f62888o = o1Var.f427078m ? 2L : 1L;
        weAppVideoCastStruct.f62889p = uf.d2.f427016d != o1Var.f427074f ? 1L : 0L;
        weAppVideoCastStruct.k();
    }
}
