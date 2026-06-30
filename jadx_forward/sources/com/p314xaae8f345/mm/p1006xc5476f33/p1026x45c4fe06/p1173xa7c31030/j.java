package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030;

/* loaded from: classes7.dex */
public class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.f {
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        super(o6Var);
        this.f168880m = o6Var.q2();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.f
    public void a() {
        if (this.f168880m) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.a(this.f168875e, "Game", "DRAW_CALLS", ((fa1.t) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(this.f168875e).C0()).f2().f130118i.b());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandPerformanceManagerWC", e17, "get QualityEvent of WAGame but fail.", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.f
    public void b() {
        yg.a aVar;
        int i17;
        int i18;
        ae.q qVar;
        if (this.f168880m) {
            try {
                qVar = (ae.q) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(this.f168875e).C0().z1(ae.q.class);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandPerformanceManagerWC", e17, "get QualityEvent of WAGame but fail.", new java.lang.Object[0]);
                aVar = null;
            }
            if (qVar == null) {
                throw new ae.s();
            }
            yg.h hVar = ((ae.a) qVar).w().f130118i;
            synchronized (hVar.f543597a) {
                aVar = hVar.f543599c;
            }
            if (aVar == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.h.e(this.f168874d, 303, java.lang.Math.round(aVar.f543551a) + " fps");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.a(this.f168875e, "Game", "FPS_GAME_RT", (double) aVar.f543551a);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.a(this.f168875e, "Game", "FPS_GAME_EX", (double) aVar.f543552b);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.a(this.f168875e, "Game", "JANK", (double) aVar.f543553c);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.a(this.f168875e, "Game", "BIG_JANK", aVar.f543554d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.a(this.f168875e, "Game", "STUTTER", aVar.f543555e);
            try {
                fa1.t tVar = (fa1.t) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(this.f168875e).C0();
                yg.h hVar2 = tVar.f2().f130118i;
                synchronized (hVar2.f543597a) {
                    i17 = hVar2.f543611o.f543581a;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.a(this.f168875e, "Game", "FPS_GAME_LAG", i17);
                yg.h hVar3 = tVar.f2().f130118i;
                synchronized (hVar3.f543597a) {
                    i18 = hVar3.f543611o.f543582b;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.a(this.f168875e, "Game", "FPS_GAME_LOW", i18);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandPerformanceManagerWC", e18, "get QualityEvent of WAGame but fail.", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.f
    public void c() {
        if (this.f168880m) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.a(this.f168875e, "Game", "TRIANGLES", ((fa1.t) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(this.f168875e).C0()).f2().f130118i.d());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandPerformanceManagerWC", e17, "get QualityEvent of WAGame but fail.", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.f
    public void d() {
        if (this.f168880m) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.a(this.f168875e, "Game", "VERTEXES", ((fa1.t) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(this.f168875e).C0()).f2().f130118i.e());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandPerformanceManagerWC", e17, "get QualityEvent of WAGame but fail.", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.f
    public void e() {
        if (this.f168880m && !this.f168874d.L0()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(this.f168875e, true);
            int b07 = b17 != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.b0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) - b17.f169685x : Integer.MAX_VALUE;
            if (b07 != Integer.MAX_VALUE) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.h.e(this.f168874d, 103, b07 + "m");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.f
    public void f() {
        super.f();
        if (this.f168880m) {
            yd.b0 h17 = yd.c0.INST.h();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.a(this.f168875e, "Hardware", "NATIVE_MEMORY", h17.f542452b);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.h.e(this.f168874d, 105, h17.f542461k);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.a(this.f168875e, "Hardware", "SYSTEM_MEMORY", h17.f542455e);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.a(this.f168875e, "Hardware", "TOTAL_SWAP_MEMORY", h17.f542456f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.a(this.f168875e, "Hardware", "JAVA_HEAP_MEMORY", h17.f542457g);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.a(this.f168875e, "Hardware", "PRIVATE_OTHER_MEMORY", h17.f542458h);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.a(this.f168875e, "Hardware", "CODE_MEMORY", h17.f542459i);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.a(this.f168875e, "Hardware", "STACK_MEMORY", h17.f542460j);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.a(this.f168875e, "Hardware", "GRAPHICS_MEMORY", h17.f542454d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.a(this.f168875e, "Hardware", "DALVIK_MEMORY", h17.f542453c);
        }
    }
}
