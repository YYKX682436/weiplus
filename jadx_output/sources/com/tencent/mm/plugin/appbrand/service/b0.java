package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public final class b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final nf.r f88629c;

    /* renamed from: d, reason: collision with root package name */
    public static final nf.r f88630d;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f88628b = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.mm.plugin.appbrand.service.b0.class, "WAServiceDebug_enable", "getWAServiceDebug_enable()Z", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.mm.plugin.appbrand.service.b0.class, "WAServiceDebug_blockJsThreadUntilInspectorAttached", "getWAServiceDebug_blockJsThreadUntilInspectorAttached()Z", 0))};

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.service.b0 f88627a = new com.tencent.mm.plugin.appbrand.service.b0();

    static {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.mm.plugin.appbrand.app.q0 q0Var = com.tencent.mm.plugin.appbrand.app.q0.f75227a;
        f88629c = new nf.r(bool, "AppBrandProcessSharedMMKV_" + q0Var.c());
        f88630d = new nf.r(bool, "AppBrandProcessSharedMMKV_" + q0Var.c());
    }

    public static final void c(java.lang.String[] args) {
        kotlin.jvm.internal.o.g(args, "args");
        java.lang.String arrays = java.util.Arrays.toString(args);
        kotlin.jvm.internal.o.f(arrays, "toString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceDebugConfig", "parseCmdVal, args: ".concat(arrays));
        boolean z17 = false;
        if (!(args.length == 0) && kotlin.jvm.internal.o.b("//appbrand_service_debug", args[0]) && 2 <= args.length) {
            java.lang.Integer h17 = r26.h0.h(args[1]);
            if (h17 != null && 1 == h17.intValue()) {
                z17 = true;
            }
            f88627a.d(z17);
        }
    }

    public final boolean a() {
        return ((java.lang.Boolean) f88630d.b(this, f88628b[1])).booleanValue();
    }

    public final boolean b() {
        return ((java.lang.Boolean) f88629c.b(this, f88628b[0])).booleanValue();
    }

    public final void d(boolean z17) {
        f88629c.c(this, f88628b[0], java.lang.Boolean.valueOf(z17));
        com.tencent.mm.sdk.platformtools.o4.M("_devtools_processor_command").putBoolean("debugger", z17);
    }
}
