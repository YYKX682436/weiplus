package com.tencent.mm.plugin.appbrand.service;

/* loaded from: classes7.dex */
public final class j7 implements com.tencent.mm.plugin.appbrand.service.t6 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f88699g = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.mm.plugin.appbrand.service.j7.class, "jsRuntime", "getJsRuntime()Lcom/tencent/mm/plugin/appbrand/jsruntime/AppBrandJsRuntime;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f88700a;

    /* renamed from: b, reason: collision with root package name */
    public final int f88701b;

    /* renamed from: c, reason: collision with root package name */
    public final b06.d f88702c = new b06.a();

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f88703d = jz5.h.b(new com.tencent.mm.plugin.appbrand.service.g7(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f88704e = jz5.h.b(new com.tencent.mm.plugin.appbrand.service.h7(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f88705f = jz5.h.b(new com.tencent.mm.plugin.appbrand.service.f7(this));

    public j7(com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f88700a = e9Var;
        this.f88701b = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.t6
    public void a(com.tencent.mm.plugin.appbrand.jsruntime.t jsRuntime) {
        kotlin.jvm.internal.o.g(jsRuntime, "jsRuntime");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaServiceDevToolsLogicImpl", "workerId(" + this.f88701b + ") onJsRuntimeCreate");
        ((b06.a) this.f88702c).a(this, f88699g[0], jsRuntime);
        if (f() == null || e() == null) {
            return;
        }
        qk.v6 f17 = f();
        kotlin.jvm.internal.o.d(f17);
        com.tencent.mm.plugin.appbrand.service.c7 e17 = e();
        kotlin.jvm.internal.o.d(e17);
        ((xz1.k) f17).Ai(e17);
    }

    @Override // com.tencent.mm.plugin.appbrand.service.t6
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaServiceDevToolsLogicImpl", "postJsRuntimeCreate");
        if (f() == null || g() == null || e() == null) {
            return;
        }
        cl.q0.f42721k = true;
        b06.d dVar = this.f88702c;
        f06.v[] vVarArr = f88699g;
        com.tencent.mm.plugin.appbrand.jsruntime.w wVar = (com.tencent.mm.plugin.appbrand.jsruntime.w) ((com.tencent.mm.plugin.appbrand.jsruntime.t) ((b06.a) dVar).b(this, vVarArr[0])).h0(com.tencent.mm.plugin.appbrand.jsruntime.w.class);
        if (wVar != null) {
            cl.q0 n07 = ((com.tencent.mm.plugin.appbrand.jsruntime.n) wVar).n0();
            n07.getClass();
            ((cl.a) n07.f42724b).h(new cl.q0$$a(n07, "console"), false);
        }
        if (com.tencent.mm.plugin.appbrand.service.k7.f88708b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WxaServiceDevToolsLogicImpl", "onJsRuntimeCreate, waitForDebugger");
            com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var = (com.tencent.mm.plugin.appbrand.jsruntime.f0) ((com.tencent.mm.plugin.appbrand.jsruntime.t) ((b06.a) dVar).b(this, vVarArr[0])).h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class);
            if (f0Var != null) {
                f0Var.k0(new com.tencent.mm.plugin.appbrand.service.i7(this, wVar));
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.service.t6
    public void c(java.lang.String str) {
        if (f() == null || e() == null) {
            return;
        }
        qk.v6 f17 = f();
        kotlin.jvm.internal.o.d(f17);
        ((xz1.k) f17).Di(e(), str);
    }

    @Override // com.tencent.mm.plugin.appbrand.service.t6
    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaServiceDevToolsLogicImpl", "beforeWxaServiceCleanup");
        if (f() == null || e() == null) {
            return;
        }
        qk.v6 f17 = f();
        kotlin.jvm.internal.o.d(f17);
        com.tencent.mm.plugin.appbrand.service.c7 e17 = e();
        kotlin.jvm.internal.o.d(e17);
        ((xz1.k) f17).Bi(e17);
    }

    public final com.tencent.mm.plugin.appbrand.service.c7 e() {
        return (com.tencent.mm.plugin.appbrand.service.c7) ((jz5.n) this.f88705f).getValue();
    }

    public final qk.v6 f() {
        return (qk.v6) ((jz5.n) this.f88703d).getValue();
    }

    public final com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni g() {
        return (com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni) ((jz5.n) this.f88704e).getValue();
    }
}
