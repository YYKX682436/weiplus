package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class mf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.mf f82180d = new com.tencent.mm.plugin.appbrand.jsapi.mf();

    public mf() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PrivateJSApiPreloadMiniProgramEnv", "IPC_PreloadNextGame.invoke()");
        com.tencent.mm.plugin.appbrand.task.u0.f89199h.a().P(com.tencent.luggage.sdk.processes.LuggageServiceType.f47627f, com.tencent.mm.plugin.appbrand.service.x6.f88827r);
        return jz5.f0.f302826a;
    }
}
