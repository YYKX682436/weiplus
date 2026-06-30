package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

/* loaded from: classes7.dex */
public class y implements pd1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 f169100a;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var) {
        this.f169100a = o0Var;
    }

    public void a(pd1.o oVar) {
        java.lang.String mo129528xb5884f29 = oVar.mo129528xb5884f29();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f169100a.f169051a, "onError, key: " + mo129528xb5884f29);
    }

    public void b(pd1.o oVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895 c12753x672cc895;
        java.lang.String mo129528xb5884f29 = oVar.mo129528xb5884f29();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var = this.f169100a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o0Var.f169051a, "onLoadEnd, key: " + mo129528xb5884f29);
        java.lang.String str = o0Var.f169063m;
        if (str == null || !str.equals(mo129528xb5884f29) || (c12753x672cc895 = o0Var.f169056f) == null) {
            return;
        }
        c12753x672cc895.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.t(this));
        oVar.mo129534x68ac462();
    }

    public void c(pd1.o oVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895 c12753x672cc895;
        java.lang.String mo129528xb5884f29 = oVar.mo129528xb5884f29();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var = this.f169100a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o0Var.f169051a, "onLoading, key: " + mo129528xb5884f29);
        java.lang.String str = o0Var.f169063m;
        if (str == null || !str.equals(mo129528xb5884f29) || (c12753x672cc895 = o0Var.f169056f) == null) {
            return;
        }
        c12753x672cc895.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.s(this));
    }

    public void d(pd1.o oVar) {
        java.lang.String mo129528xb5884f29 = oVar.mo129528xb5884f29();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f169100a.f169051a, "onPause, key: " + mo129528xb5884f29);
        if (this.f169100a.D) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f169100a.f169051a, "onPause, runtime paused");
            return;
        }
        java.lang.Integer c17 = oVar.c();
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f169100a.f169051a, "onPause, pageViewId is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var = this.f169100a;
        int intValue = c17.intValue();
        pd1.n mo129529xfb85f7b0 = oVar.mo129529xfb85f7b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.d h17 = o0Var.h(intValue);
        if (h17 != null) {
            h17.c(mo129529xfb85f7b0, mo129528xb5884f29);
        }
        java.lang.String str = this.f169100a.f169063m;
        if (str == null || !str.equals(mo129528xb5884f29)) {
            this.f169100a.l(c17.intValue(), mo129528xb5884f29, "onPause");
        }
    }

    public void e(pd1.o oVar, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.c cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.C12753x672cc895 c12753x672cc895;
        java.lang.String str;
        pd1.c cVar2;
        java.lang.String mo129528xb5884f29 = oVar.mo129528xb5884f29();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f169100a.f169051a, "onPlay, key: " + mo129528xb5884f29);
        if (this.f169100a.D) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f169100a.f169051a, "onPlay, runtime paused");
            return;
        }
        java.lang.Integer c17 = oVar.c();
        pd1.c cVar3 = pd1.c.NONE;
        int i17 = 1;
        if (c17 != null) {
            cVar = this.f169100a.j(c17.intValue(), mo129528xb5884f29);
            if (cVar != null) {
                pd1.c cVar4 = cVar.f168963b;
                if ((cVar4 == null || cVar3 == cVar4) ? false : true) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var = this.f169100a;
                    int intValue = c17.intValue();
                    pd1.n mo129529xfb85f7b0 = oVar.mo129529xfb85f7b0();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.d h17 = o0Var.h(intValue);
                    if (h17 != null) {
                        if (!o0Var.f169057g) {
                            o0Var.f169054d.m52187x5190507a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.p(o0Var));
                            o0Var.f169054d.m52183xeb4f1038(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.r(o0Var));
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(o0Var.f169053c.f156336n, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o(o0Var));
                            o0Var.f169054d.m52182x1880b8de(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.b0(o0Var));
                            o0Var.f169057g = true;
                        }
                        h17.a(mo129529xfb85f7b0, mo129528xb5884f29);
                    }
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f169100a.f169051a, "onPlay, pageViewId is null");
            cVar = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.k kVar = this.f169100a.C;
        if (kVar != null && cVar != null && (cVar2 = cVar.f168963b) != null && cVar3 != cVar2) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7073x1992e4f7 a17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.p0) kVar).a(cVar.f168970i);
            a17.f143810g = 1L;
            int ordinal = cVar2.ordinal();
            if (ordinal != 1) {
                i17 = 2;
                if (ordinal != 2) {
                    i17 = 3;
                    if (ordinal != 3) {
                        i17 = 0;
                    }
                }
            }
            a17.f143811h = i17;
            a17.k();
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0.b(this.f169100a) && (str = this.f169100a.f169063m) != null && str.equals(mo129528xb5884f29)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var2 = this.f169100a;
            if (o0Var2.f169056f != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o0Var2.f169051a, "processTransferFromOnPlay for other video is playing");
                this.f169100a.f169056f.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.x(this, z17));
                return;
            }
        }
        java.lang.String str2 = this.f169100a.f169063m;
        if (str2 != null && str2.equals(mo129528xb5884f29)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f169100a.f169051a, "onPlay, mark pip video play");
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.u(this));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var3 = this.f169100a;
            o0Var3.f169069s = false;
            o0Var3.f169076z.mo51100x4c4bb389();
            return;
        }
        if (c17 != null) {
            this.f169100a.d(c17.intValue(), mo129528xb5884f29, "onPlay");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var4 = this.f169100a;
        if ((o0Var4.f169071u && o0Var4.f169072v) || o0Var4.f169063m == null || (c12753x672cc895 = o0Var4.f169056f) == null) {
            return;
        }
        c12753x672cc895.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.x(this, z17));
    }

    public void f(pd1.o oVar) {
        java.lang.String mo129528xb5884f29 = oVar.mo129528xb5884f29();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f169100a.f169051a, "onPlayEnd, key: " + mo129528xb5884f29);
        java.lang.String str = this.f169100a.f169063m;
        if (str != null && str.equals(mo129528xb5884f29)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var = this.f169100a;
            if (o0Var.f169056f != null) {
                o0Var.a("onPlayEnd");
                o0Var.f169069s = true;
            }
        }
        java.lang.Integer c17 = oVar.c();
        if (c17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var2 = this.f169100a;
            int intValue = c17.intValue();
            pd1.n mo129529xfb85f7b0 = oVar.mo129529xfb85f7b0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.d h17 = o0Var2.h(intValue);
            if (h17 != null) {
                h17.c(mo129529xfb85f7b0, mo129528xb5884f29);
            }
            java.lang.String str2 = this.f169100a.f169063m;
            if (str2 == null || !str2.equals(mo129528xb5884f29)) {
                this.f169100a.l(c17.intValue(), mo129528xb5884f29, "onPlayEnd");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f169100a.f169051a, "onPlayEnd, pageViewId is null");
        }
        if (this.f169100a.f169062l != null) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.w(this));
        }
    }

    public void g(pd1.o oVar) {
        java.lang.String mo129528xb5884f29 = oVar.mo129528xb5884f29();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var = this.f169100a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o0Var.f169051a, "onStop, key: " + mo129528xb5884f29);
        java.lang.String str = o0Var.f169063m;
        if (str != null && str.equals(mo129528xb5884f29) && o0Var.f169056f != null) {
            o0Var.a("onStop");
            o0Var.f169069s = true;
        }
        java.lang.Integer c17 = oVar.c();
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(o0Var.f169051a, "onStop, pageViewId is null");
            return;
        }
        int intValue = c17.intValue();
        pd1.n mo129529xfb85f7b0 = oVar.mo129529xfb85f7b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.d h17 = o0Var.h(intValue);
        if (h17 != null) {
            h17.c(mo129529xfb85f7b0, mo129528xb5884f29);
        }
        java.lang.String str2 = o0Var.f169063m;
        if (str2 == null || !str2.equals(mo129528xb5884f29)) {
            o0Var.l(c17.intValue(), mo129528xb5884f29, "onStop");
        }
    }
}
