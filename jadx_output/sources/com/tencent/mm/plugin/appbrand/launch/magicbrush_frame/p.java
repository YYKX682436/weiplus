package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

/* loaded from: classes7.dex */
public final class p {
    public p(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MBFramePkgManagementFsIPCInitArgs mBFramePkgManagementFsIPCInitArgs, com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo wxaPkgWrappingInfo, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WAMagicBrushFrameColdLaunchRuntimeLoaderProxy", "registerToMBPkgManagement bizInstance:" + str + ", mbServerProcessName:" + str2 + ", appId:" + str3);
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        com.tencent.mm.ipcinvoker.f.a(str2, new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.WAMagicBrushFrameColdLaunchRuntimeLoaderProxy$RegisterToMBPkgManagementDataIPCWrapper(str, str3, mBFramePkgManagementFsIPCInitArgs, wxaPkgWrappingInfo), com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.n.f84311d, new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.o(rVar));
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f359186d ? j17 : jz5.f0.f302826a;
    }
}
