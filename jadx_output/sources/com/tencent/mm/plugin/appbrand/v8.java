package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class v8 extends com.tencent.mm.plugin.appbrand.g3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f90648b;

    public v8(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.b7 b7Var) {
        this.f90648b = o6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public java.lang.String b() {
        return "SkylineInit";
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public void c() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_weapp_skyline_engine_background_executor, false);
        df.a1 a1Var = df.a1.f229421a;
        com.tencent.skyline.SkylineLog.i("SkylineManager", "setFlutterEngineBackgroundExecutorEnable: " + fj6);
        df.a1.f229422b = fj6;
        d();
    }
}
