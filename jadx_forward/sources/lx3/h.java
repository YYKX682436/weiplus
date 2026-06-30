package lx3;

/* loaded from: classes12.dex */
public class h extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f403616d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f403617e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f403618f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.u30 f403619g;

    /* renamed from: h, reason: collision with root package name */
    public final int f403620h;

    /* renamed from: i, reason: collision with root package name */
    public final lx3.f f403621i = new lx3.f(null);

    public h(byte[] bArr, int i17) {
        boolean z17 = false;
        this.f403617e = false;
        this.f403619g = null;
        this.f403620h = 0;
        if (bArr == null) {
            throw new java.lang.NullPointerException("data must not be null");
        }
        this.f403620h = i17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
            z17 = gm0.j1.b().n();
        } else if (com.p314xaae8f345.mm.p971x6de15a2e.x2.c().f153526n.f153435o != 0) {
            z17 = true;
        }
        this.f403617e = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCliReportKV", "isLogin ? %s", java.lang.Boolean.valueOf(z17));
        if (i17 == 1) {
            try {
                p45.i iVar = new p45.i();
                iVar.mo11468x92b714fd(bArr);
                this.f403619g = com.p314xaae8f345.p542x3306d5.smc.C4587xd5ddedd6.m40410x80c7e04(iVar);
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneCliReportKV", "parse data error");
                gm0.j1.i();
                gm0.j1.e().j(new lx3.i(this));
            }
        } else if (i17 == 2) {
            try {
                p45.g gVar = new p45.g();
                gVar.mo11468x92b714fd(bArr);
                this.f403619g = com.p314xaae8f345.p542x3306d5.smc.C4587xd5ddedd6.m40409x48781a29(gVar);
            } catch (java.lang.Exception unused2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneCliReportKV", "parse data error");
                gm0.j1.i();
                gm0.j1.e().j(new lx3.j(this));
            }
        }
        r45.u30 u30Var = this.f403619g;
        if (u30Var == null) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCliReportKV", "NetSceneCliReportKV parse req is null, stack[%s]", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        } else {
            u30Var.f468516i = new r45.fw3();
            this.f403619g.f468516i.f456185d = this.f403621i.b(this.f403620h);
        }
    }

    public final void H(final int i17, final int i18, final java.lang.String str, final com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
            m48017xd0f4c159(true);
            fs.g.c(com.p314xaae8f345.mm.p944x882e457a.j1.class, java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()), new fs.o() { // from class: lx3.h$$a
                @Override // fs.o
                public final boolean a(fs.n nVar) {
                    com.p314xaae8f345.mm.p944x882e457a.j1 j1Var = (com.p314xaae8f345.mm.p944x882e457a.j1) nVar;
                    if (j1Var != null) {
                        j1Var.mo10099x76e0bfae(i17, i18, str, m1Var);
                        return false;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneCliReportKV", "%s returns null, skip notifying.", j1Var);
                    return false;
                }
            });
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f403618f = u0Var;
        r45.u30 u30Var = this.f403619g;
        if (u30Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneCliReportKV", "do scene but req is null!");
            return -2;
        }
        boolean z17 = this.f403617e;
        if (!z17) {
            u30Var.f468515h = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0());
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152203g = false;
        lVar.f152197a = u30Var;
        lVar.f152198b = new r45.v30();
        int i17 = this.f403620h;
        java.lang.String str = 1 == i17 ? "/cgi-bin/micromsg-bin/newreportkvcomm" : "/cgi-bin/micromsg-bin/newreportidkey";
        java.lang.String str2 = 1 == i17 ? "/cgi-bin/micromsg-bin/newreportkvcommrsa" : "/cgi-bin/micromsg-bin/newreportidkeyrsa";
        if (!z17) {
            str = str2;
        }
        lVar.f152199c = str;
        lVar.f152200d = mo808xfb85f7b0();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f403616d = a17;
        if (!z17) {
            a17.m48033x97bfc4c(new o45.pi("010001", "D8D2AE73FF601B93B1471B35870A1B59D7649EEA815CDD8CE5496BBD0C6CFE19C0E082F4E513B615C6030CCFCE3153E25AA00E8156D0311AF72ABBB9BBEC8B1D3751592234B1A621CA774E2EC50047A93FA0BC60DF0C10E8A65C3B29D13167EC217FC6A29034494870705CBF4AC929FBA0E1E656A8F8B50E779AD89BB4EEF6FF", 125));
            this.f403616d.f152247e = 1;
        }
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f403616d, this);
        if (mo9409x10f9447a < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCliReportKV", "mark all failed. do scene %d", java.lang.Integer.valueOf(mo9409x10f9447a));
            try {
                ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40369x44061e83(3, -1, null, i17);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneCliReportKV", "updateReportStrategy failed  hash:%d  , ex:%s", java.lang.Integer.valueOf(hashCode()), com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        }
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        boolean z17 = this.f403617e;
        int i17 = this.f403620h;
        return !z17 ? 1 == i17 ? 997 : 987 : 1 == i17 ? 996 : 986;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p() && (gm0.j1.n() == null || gm0.j1.n().f354821b == null || gm0.j1.n().f354821b.f152297d == null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.NetSceneCliReportKV", "null == MMCore.getNetSceneQueue().getDispatcher(), can't give response to kvcomm.");
            this.f403618f.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        int i27 = this.f403620h;
        if (i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneCliReportKV", "get cli_report_kv strategy err, errType:" + i18 + ", errCode:" + i19);
            ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40369x44061e83(i18, i19, null, i27);
            this.f403618f.mo815x76e0bfae(i18, i19, str, this);
            H(i18, i19, str, this);
            return;
        }
        r45.v30 v30Var = (r45.v30) this.f403616d.f152244b.f152233a;
        this.f403621i.c(v30Var.f469379q, i27);
        try {
        } catch (java.lang.Exception e17) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneCliReportKV", "updateReportStrategy failed  hash:%d  , ex:%s", valueOf, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
        if (i27 != 1) {
            if (i27 == 2) {
                ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40369x44061e83(0, 0, com.p314xaae8f345.p542x3306d5.smc.C4587xd5ddedd6.m40414xaf5c7bd2(v30Var).mo14344x5f01b1f6(), i27);
            }
            this.f403618f.mo815x76e0bfae(i18, i19, str, this);
            H(i18, i19, str, this);
        }
        ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40369x44061e83(0, 0, com.p314xaae8f345.p542x3306d5.smc.C4587xd5ddedd6.m40415x59eaa1d(v30Var).mo14344x5f01b1f6(), i27);
        this.f403618f.mo815x76e0bfae(i18, i19, str, this);
        H(i18, i19, str, this);
    }
}
