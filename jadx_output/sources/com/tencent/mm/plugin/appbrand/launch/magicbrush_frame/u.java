package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

/* loaded from: classes7.dex */
public final class u implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.v f84317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams f84318e;

    public u(com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.v vVar, com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameLaunchParams wAMagicBrushFrameLaunchParams) {
        this.f84317d = vVar;
        this.f84318e = wAMagicBrushFrameLaunchParams;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$WAMagicBrushFrameColdLaunchResultIPCWrapper wAMagicBrushFrameColdLaunchRuntimeLoaderProxy$WAMagicBrushFrameColdLaunchResultIPCWrapper = (com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$WAMagicBrushFrameColdLaunchResultIPCWrapper) obj;
        if (!wAMagicBrushFrameColdLaunchRuntimeLoaderProxy$WAMagicBrushFrameColdLaunchResultIPCWrapper.f84251d) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WAMagicBrushFrameColdLaunchRuntimeLoaderProxy", "startWithParams(" + this.f84318e + ") failed, message:" + wAMagicBrushFrameColdLaunchRuntimeLoaderProxy$WAMagicBrushFrameColdLaunchResultIPCWrapper.f84252e);
            this.f84317d.f84320a.b();
            return;
        }
        fj1.y yVar = this.f84317d.f84320a;
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC = wAMagicBrushFrameColdLaunchRuntimeLoaderProxy$WAMagicBrushFrameColdLaunchResultIPCWrapper.f84252e;
        kotlin.jvm.internal.o.d(appBrandSysConfigWC);
        yVar.getClass();
        com.tencent.mars.xlog.Log.i(yVar.f263144d, "notifyColdLaunchResult");
        yVar.f263148h = appBrandSysConfigWC;
        yVar.f263149i = new fj1.j();
        yVar.f263150j = new fj1.h(yVar);
        yVar.f263151k = new fj1.b0(yVar);
        com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo appPkgInfo = appBrandSysConfigWC.f305852r;
        kotlin.jvm.internal.o.f(appPkgInfo, "appPkgInfo");
        fj1.t tVar = new fj1.t(yVar.c(), appPkgInfo);
        yVar.f263152l = tVar;
        yVar.f263153m = new com.tencent.mm.plugin.appbrand.page.u5(null, tVar.f263138b);
        pm0.v.X(new fj1.w(yVar));
    }
}
