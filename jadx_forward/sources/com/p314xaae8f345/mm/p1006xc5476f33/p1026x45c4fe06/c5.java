package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class c5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f158564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 f158565e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l5 f158566f;

    public c5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l5 l5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 c11808xe47dc718) {
        this.f158566f = l5Var;
        this.f158564d = c11510xdd90c2f2;
        this.f158565e = c11808xe47dc718;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2;
        this.f158566f.f165758i.c();
        if (this.f158564d == null) {
            this.f158566f.u();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l5 l5Var = this.f158566f;
        java.lang.String str = this.f158565e.f158811d;
        java.util.Iterator it = l5Var.f165759m.iterator();
        while (true) {
            if (!it.hasNext()) {
                c11510xdd90c2f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) ((java.util.HashMap) l5Var.f165760n).get(str);
                break;
            } else {
                c11510xdd90c2f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) it.next();
                if (c11510xdd90c2f2.f156336n.equals(str)) {
                    break;
                }
            }
        }
        if (c11510xdd90c2f2 != null) {
            this.f158566f.B(this.f158564d, c11510xdd90c2f2, this.f158565e);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l5 l5Var2 = this.f158566f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 cfg = this.f158565e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.d9 d9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.d9) l5Var2;
        d9Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cfg, "cfg");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 rt6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v1.a((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) cfg, d9Var);
        if (rt6 == null) {
            try {
                java.lang.Class cls = d9Var.f165756g;
                rt6 = (ze.n) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) new d56.b(cls, cls).d(d9Var).f308165b);
            } catch (d56.c unused) {
                rt6 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l5) d9Var);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l5 l5Var3 = this.f158566f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22 = this.f158564d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 config = this.f158565e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.d9 d9Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.d9) l5Var3;
        d9Var2.getClass();
        ze.n nVar = (ze.n) c11510xdd90c2f22;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rt6, "rt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        if (rt6.J0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWidgetImpl", "loadNew(), runtime[" + rt6.f156336n + "] initialized, should be persistent, use loadExisted() instead");
            d9Var2.B(nVar, rt6, config);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rt6.f156329e, d9Var2)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.b3.f169345a.e((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) config);
            }
            if (d9Var2.f165754e) {
                rt6.i0();
                return;
            }
            return;
        }
        rt6.f156337o = nVar;
        rt6.I0(config);
        d9Var2.f165759m.push(rt6);
        d9Var2.m(rt6.f156343s);
        if (nVar != null) {
            nVar.f0();
        }
        rt6.X0();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rt6.f156329e, d9Var2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.b3.f169345a.c((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) config);
        }
    }
}
