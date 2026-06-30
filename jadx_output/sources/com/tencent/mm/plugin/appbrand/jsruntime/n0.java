package com.tencent.mm.plugin.appbrand.jsruntime;

/* loaded from: classes7.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f84021a = {false};

    public static com.tencent.mm.plugin.appbrand.jsruntime.t a(android.content.Context context, int i17, boolean z17, java.lang.String str, boolean z18, byte[] bArr, java.lang.String str2, boolean z19, int i18, boolean z27, boolean z28, boolean z29, int i19, boolean z37, com.tencent.mm.plugin.appbrand.jsapi.m mVar, cl.o oVar) {
        b();
        com.tencent.mm.appbrand.v8.IJSRuntime$Config iJSRuntime$Config = new com.tencent.mm.appbrand.v8.IJSRuntime$Config();
        iJSRuntime$Config.f53943a = str;
        iJSRuntime$Config.f53944b = str2;
        iJSRuntime$Config.f53945c = z19;
        iJSRuntime$Config.f53946d = bArr;
        iJSRuntime$Config.f53947e = i18;
        iJSRuntime$Config.f53948f = "1";
        iJSRuntime$Config.f53949g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_appbrand_jsbridge_function_direct_evaluate, true);
        iJSRuntime$Config.f53950h = z29;
        iJSRuntime$Config.f53951i = z27;
        iJSRuntime$Config.f53952j = z28;
        iJSRuntime$Config.f53956n = new java.lang.ref.WeakReference(mVar);
        iJSRuntime$Config.f53955m = z18;
        iJSRuntime$Config.f53954l = i19;
        iJSRuntime$Config.f53959q = oVar;
        if (z37) {
            iJSRuntime$Config.f53960r = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsRuntimeFactory", "[no-node] config.skipNode = true");
        }
        com.tencent.mm.plugin.appbrand.jsruntime.o0 o0Var = new com.tencent.mm.plugin.appbrand.jsruntime.o0(iJSRuntime$Config);
        int o17 = com.tencent.mm.sdk.platformtools.o4.N("MicroMsg.AppBrandJsRuntimeFactory", 2, null).o("V8MinimalCodeLength", 1024);
        cl.a aVar = (cl.a) o0Var.f83968f;
        aVar.getClass();
        iz5.a.g(null, o17 >= 0);
        aVar.f42585r = o17;
        com.eclipsesource.mmv8.MultiContextV8 multiContextV8 = aVar.f42568a;
        if (multiContextV8 != null) {
            multiContextV8.setMinimalCodeLength(o17);
        }
        if (o0Var instanceof com.tencent.mm.plugin.appbrand.jsruntime.g) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(434L, 5L, 1L, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsRuntimeFactory", "Using AppBrandJ2V8BasedJsEngine");
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(434L, 6L, 1L, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsRuntimeFactory", "Using AppBrandNodeJSBasedJsEngine");
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(434L, 0L, 1L, false);
        return o0Var;
    }

    public static void b() {
        boolean z17;
        boolean[] zArr = f84021a;
        if (zArr[0]) {
            z17 = true;
        } else {
            synchronized (zArr) {
                z17 = zArr[0];
            }
        }
        if (z17) {
            return;
        }
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_v8_init_flag_v8_98, "--min_semi_space_size=4 --max_semi_space_size=8 --wasm_lazy_compilation", true);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        java.lang.String str2 = "--verify_snapshot_checksum";
        if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
            str2 = Zi + " --verify_snapshot_checksum";
        }
        if (com.tencent.mm.plugin.appbrand.jsruntime.f2.f83986a.b()) {
            str2 = str2 + " " + com.tencent.mm.plugin.appbrand.jsruntime.f2.f83988c;
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_v8_enable_trap_handler, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsRuntimeFactory", "set v8 flag:%s trapHandler:%b", str2, java.lang.Boolean.valueOf(fj6));
        com.eclipsesource.mmv8.V8.setFlags(str2);
        com.eclipsesource.mmv8.V8.enableTrapHandler(fj6);
        zArr[0] = true;
        cl.r3.f42755c = new com.tencent.mm.plugin.appbrand.jsruntime.m0();
    }

    public static void c(int i17) {
        if (i17 >= 0) {
            com.tencent.mm.sdk.platformtools.o4.N("MicroMsg.AppBrandJsRuntimeFactory", 2, null).A("V8MinimalCodeLength", i17);
        }
    }
}
