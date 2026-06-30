package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

/* loaded from: classes7.dex */
public final class j7 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.t6 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f170232g = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j7.class, "jsRuntime", "getJsRuntime()Lcom/tencent/mm/plugin/appbrand/jsruntime/AppBrandJsRuntime;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f170233a;

    /* renamed from: b, reason: collision with root package name */
    public final int f170234b;

    /* renamed from: c, reason: collision with root package name */
    public final b06.d f170235c = new b06.a();

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f170236d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.g7(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f170237e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h7(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f170238f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f7(this));

    public j7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f170233a = e9Var;
        this.f170234b = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.t6
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t jsRuntime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsRuntime, "jsRuntime");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaServiceDevToolsLogicImpl", "workerId(" + this.f170234b + ") onJsRuntimeCreate");
        ((b06.a) this.f170235c).a(this, f170232g[0], jsRuntime);
        if (f() == null || e() == null) {
            return;
        }
        qk.v6 f17 = f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c7 e17 = e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
        ((xz1.k) f17).Ai(e17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.t6
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaServiceDevToolsLogicImpl", "postJsRuntimeCreate");
        if (f() == null || g() == null || e() == null) {
            return;
        }
        cl.q0.f124254k = true;
        b06.d dVar = this.f170235c;
        f06.v[] vVarArr = f170232g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t) ((b06.a) dVar).b(this, vVarArr[0])).h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w.class);
        if (wVar != null) {
            cl.q0 n07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) wVar).n0();
            n07.getClass();
            ((cl.a) n07.f124257b).h(new cl.RunnableC1400x64ebda2(n07, "console"), false);
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k7.f170241b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaServiceDevToolsLogicImpl", "onJsRuntimeCreate, waitForDebugger");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0 f0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t) ((b06.a) dVar).b(this, vVarArr[0])).h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0.class);
            if (f0Var != null) {
                f0Var.k0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i7(this, wVar));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.t6
    public void c(java.lang.String str) {
        if (f() == null || e() == null) {
            return;
        }
        qk.v6 f17 = f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
        ((xz1.k) f17).Di(e(), str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.t6
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaServiceDevToolsLogicImpl", "beforeWxaServiceCleanup");
        if (f() == null || e() == null) {
            return;
        }
        qk.v6 f17 = f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c7 e17 = e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e17);
        ((xz1.k) f17).Bi(e17);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c7 e() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c7) ((jz5.n) this.f170238f).mo141623x754a37bb();
    }

    public final qk.v6 f() {
        return (qk.v6) ((jz5.n) this.f170236d).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5128x72a3f151 g() {
        return (com.p314xaae8f345.mm.p627x45c4fe06.p628xa770a5da.C5128x72a3f151) ((jz5.n) this.f170237e).mo141623x754a37bb();
    }
}
