package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f152336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f152337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f152338f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.v2 f152339g;

    public s2(com.p314xaae8f345.mm.p944x882e457a.v2 v2Var, int i17, int i18, java.lang.String str) {
        this.f152339g = v2Var;
        this.f152336d = i17;
        this.f152337e = i18;
        this.f152338f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.vt4 vt4Var;
        r45.xb xbVar;
        com.p314xaae8f345.mm.p944x882e457a.v2 v2Var = this.f152339g;
        v2Var.f152360d.mo13822xfb85f7b0();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        final o45.ug ugVar = (o45.ug) v2Var.f152360d.mo47979x2d63726f();
        final o45.vg vgVar = (o45.vg) v2Var.f152360d.mo13821x7f35c2d1();
        if (vgVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.RemoteReqResp", "null auth.resp");
            return;
        }
        ((c01.f9) o45.qg.f424533a).getClass();
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMReqRespAuth", "summerauth onAutoAuthEnd but account not ready");
            return;
        }
        r45.sr6 sr6Var = vgVar.f424548a;
        if (sr6Var == null || (xbVar = sr6Var.f467485e) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMReqRespAuth", "summerauth mmtls auto not set as ret:%s", java.lang.Integer.valueOf(vgVar.mo150578x7f2fddf8()));
        } else {
            int i17 = xbVar.f471473z;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMReqRespAuth", "summerauth mmtls auto:%s", java.lang.Integer.valueOf(i17));
            gm0.j1.i();
            gm0.j1.u().f354681a.f(47, java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p971x6de15a2e.s sVar = gm0.j1.n().f354821b.f152297d;
            if (sVar != null) {
                sVar.n1((i17 & 1) == 0);
            }
        }
        if (sr6Var != null && (vt4Var = sr6Var.f467487g) != null) {
            c01.f9.c(vt4Var.f470054h);
        }
        int i18 = this.f152336d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        int i19 = this.f152337e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMReqRespAuth", "summerauth onAutoAuthEnd errType:%d, errCode:%d, errMsg:%s", valueOf, java.lang.Integer.valueOf(i19), this.f152338f);
        if (i18 == 0 && i19 == 0) {
            r45.i1 i1Var = sr6Var.f467486f;
            if (i1Var != null) {
                c01.je.p(i1Var.f458187w);
                c01.je.n(sr6Var.f467486f.f458188x);
                c01.je.j(sr6Var.f467486f.f458189y);
            }
            fs.g.b(c01.g9.class, new fs.o() { // from class: c01.f9$$a
                @Override // fs.o
                public final boolean a(fs.n nVar) {
                    ((fn1.a) ((c01.g9) nVar)).getClass();
                    dn1.i iVar = (dn1.i) i95.n0.c(dn1.i.class);
                    iVar.getClass();
                    o45.vg vgVar2 = vgVar;
                    c01.u7.b(vgVar2.f424548a, true);
                    c01.u7.c(vgVar2.f424548a);
                    iVar.f323407d.mo8828x48bdb988(o45.ug.this, vgVar2, true);
                    return false;
                }
            });
            return;
        }
        if (i18 != 4 || i19 != -301) {
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.mo68477x336bdfd8(148L, o45.ag.f424425a ? 119L : 120L, 1L, false);
            fVar.mo68477x336bdfd8(148L, o45.ag.f424426b ? 121L : 122L, 1L, false);
            return;
        }
        jx3.f.INSTANCE.mo68477x336bdfd8(148L, 18L, 1L, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMReqRespAuth", "dkidc onAutoAuthEnd RedirectIDC");
        if (sr6Var == null || sr6Var.f467487g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMReqRespAuth", "dkidc onAutoAuthEnd RedirectIDC but NetworkSectResp is null");
        } else {
            r45.vt4 vt4Var2 = vgVar.f424548a.f467487g;
            c01.f9.d(vt4Var2.f470052f, vt4Var2.f470051e, vt4Var2.f470050d, true, vt4Var2.f470053g);
        }
    }
}
