package com.tencent.mm.plugin.appbrand.performance;

/* loaded from: classes7.dex */
public class j extends com.tencent.mm.plugin.appbrand.performance.f {
    public j(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        super(o6Var);
        this.f87347m = o6Var.q2();
    }

    @Override // com.tencent.mm.plugin.appbrand.performance.f
    public void a() {
        if (this.f87347m) {
            try {
                com.tencent.mm.plugin.appbrand.performance.m.a(this.f87342e, "Game", "DRAW_CALLS", ((fa1.t) com.tencent.mm.plugin.appbrand.l.b(this.f87342e).C0()).f2().f48585i.b());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandPerformanceManagerWC", e17, "get QualityEvent of WAGame but fail.", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.performance.f
    public void b() {
        yg.a aVar;
        int i17;
        int i18;
        ae.q qVar;
        if (this.f87347m) {
            try {
                qVar = (ae.q) com.tencent.mm.plugin.appbrand.l.b(this.f87342e).C0().z1(ae.q.class);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandPerformanceManagerWC", e17, "get QualityEvent of WAGame but fail.", new java.lang.Object[0]);
                aVar = null;
            }
            if (qVar == null) {
                throw new ae.s();
            }
            yg.h hVar = ((ae.a) qVar).w().f48585i;
            synchronized (hVar.f462064a) {
                aVar = hVar.f462066c;
            }
            if (aVar == null) {
                return;
            }
            com.tencent.mm.plugin.appbrand.performance.h.e(this.f87341d, 303, java.lang.Math.round(aVar.f462018a) + " fps");
            com.tencent.mm.plugin.appbrand.performance.m.a(this.f87342e, "Game", "FPS_GAME_RT", (double) aVar.f462018a);
            com.tencent.mm.plugin.appbrand.performance.m.a(this.f87342e, "Game", "FPS_GAME_EX", (double) aVar.f462019b);
            com.tencent.mm.plugin.appbrand.performance.m.a(this.f87342e, "Game", "JANK", (double) aVar.f462020c);
            com.tencent.mm.plugin.appbrand.performance.m.a(this.f87342e, "Game", "BIG_JANK", aVar.f462021d);
            com.tencent.mm.plugin.appbrand.performance.m.a(this.f87342e, "Game", "STUTTER", aVar.f462022e);
            try {
                fa1.t tVar = (fa1.t) com.tencent.mm.plugin.appbrand.l.b(this.f87342e).C0();
                yg.h hVar2 = tVar.f2().f48585i;
                synchronized (hVar2.f462064a) {
                    i17 = hVar2.f462078o.f462048a;
                }
                com.tencent.mm.plugin.appbrand.performance.m.a(this.f87342e, "Game", "FPS_GAME_LAG", i17);
                yg.h hVar3 = tVar.f2().f48585i;
                synchronized (hVar3.f462064a) {
                    i18 = hVar3.f462078o.f462049b;
                }
                com.tencent.mm.plugin.appbrand.performance.m.a(this.f87342e, "Game", "FPS_GAME_LOW", i18);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandPerformanceManagerWC", e18, "get QualityEvent of WAGame but fail.", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.performance.f
    public void c() {
        if (this.f87347m) {
            try {
                com.tencent.mm.plugin.appbrand.performance.m.a(this.f87342e, "Game", "TRIANGLES", ((fa1.t) com.tencent.mm.plugin.appbrand.l.b(this.f87342e).C0()).f2().f48585i.d());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandPerformanceManagerWC", e17, "get QualityEvent of WAGame but fail.", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.performance.f
    public void d() {
        if (this.f87347m) {
            try {
                com.tencent.mm.plugin.appbrand.performance.m.a(this.f87342e, "Game", "VERTEXES", ((fa1.t) com.tencent.mm.plugin.appbrand.l.b(this.f87342e).C0()).f2().f48585i.e());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandPerformanceManagerWC", e17, "get QualityEvent of WAGame but fail.", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.performance.f
    public void e() {
        if (this.f87347m && !this.f87341d.L0()) {
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime b17 = com.tencent.mm.plugin.appbrand.report.quality.e.b(this.f87342e, true);
            int b07 = b17 != null ? com.tencent.mm.sdk.platformtools.t8.b0(com.tencent.mm.sdk.platformtools.x2.f193071a) - b17.f88152x : Integer.MAX_VALUE;
            if (b07 != Integer.MAX_VALUE) {
                com.tencent.mm.plugin.appbrand.performance.h.e(this.f87341d, 103, b07 + "m");
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.performance.f
    public void f() {
        super.f();
        if (this.f87347m) {
            yd.b0 h17 = yd.c0.INST.h();
            com.tencent.mm.plugin.appbrand.performance.m.a(this.f87342e, "Hardware", "NATIVE_MEMORY", h17.f460919b);
            com.tencent.mm.plugin.appbrand.performance.h.e(this.f87341d, 105, h17.f460928k);
            com.tencent.mm.plugin.appbrand.performance.m.a(this.f87342e, "Hardware", "SYSTEM_MEMORY", h17.f460922e);
            com.tencent.mm.plugin.appbrand.performance.m.a(this.f87342e, "Hardware", "TOTAL_SWAP_MEMORY", h17.f460923f);
            com.tencent.mm.plugin.appbrand.performance.m.a(this.f87342e, "Hardware", "JAVA_HEAP_MEMORY", h17.f460924g);
            com.tencent.mm.plugin.appbrand.performance.m.a(this.f87342e, "Hardware", "PRIVATE_OTHER_MEMORY", h17.f460925h);
            com.tencent.mm.plugin.appbrand.performance.m.a(this.f87342e, "Hardware", "CODE_MEMORY", h17.f460926i);
            com.tencent.mm.plugin.appbrand.performance.m.a(this.f87342e, "Hardware", "STACK_MEMORY", h17.f460927j);
            com.tencent.mm.plugin.appbrand.performance.m.a(this.f87342e, "Hardware", "GRAPHICS_MEMORY", h17.f460921d);
            com.tencent.mm.plugin.appbrand.performance.m.a(this.f87342e, "Hardware", "DALVIK_MEMORY", h17.f460920c);
        }
    }
}
