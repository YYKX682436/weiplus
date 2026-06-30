package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

/* loaded from: classes7.dex */
public final class b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final nf.r f170162c;

    /* renamed from: d, reason: collision with root package name */
    public static final nf.r f170163d;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f170161b = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b0.class, "WAServiceDebug_enable", "getWAServiceDebug_enable()Z", 0)), p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b0.class, "WAServiceDebug_blockJsThreadUntilInspectorAttached", "getWAServiceDebug_blockJsThreadUntilInspectorAttached()Z", 0))};

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b0 f170160a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b0();

    static {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0 q0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a;
        f170162c = new nf.r(bool, "AppBrandProcessSharedMMKV_" + q0Var.c());
        f170163d = new nf.r(bool, "AppBrandProcessSharedMMKV_" + q0Var.c());
    }

    public static final void c(java.lang.String[] args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        java.lang.String arrays = java.util.Arrays.toString(args);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandServiceDebugConfig", "parseCmdVal, args: ".concat(arrays));
        boolean z17 = false;
        if (!(args.length == 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("//appbrand_service_debug", args[0]) && 2 <= args.length) {
            java.lang.Integer h17 = r26.h0.h(args[1]);
            if (h17 != null && 1 == h17.intValue()) {
                z17 = true;
            }
            f170160a.d(z17);
        }
    }

    public final boolean a() {
        return ((java.lang.Boolean) f170163d.b(this, f170161b[1])).booleanValue();
    }

    public final boolean b() {
        return ((java.lang.Boolean) f170162c.b(this, f170161b[0])).booleanValue();
    }

    public final void d(boolean z17) {
        f170162c.c(this, f170161b[0], java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("_devtools_processor_command").putBoolean("debugger", z17);
    }
}
