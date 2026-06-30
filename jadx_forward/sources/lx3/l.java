package lx3;

/* loaded from: classes12.dex */
public class l extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f403633h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.Object f403634i = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f403635d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f403636e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.ed3 f403637f;

    /* renamed from: g, reason: collision with root package name */
    public final lx3.f f403638g;

    public l(byte[] bArr) {
        this.f403637f = null;
        lx3.f fVar = new lx3.f(null);
        this.f403638g = fVar;
        synchronized (f403634i) {
            f403633h = true;
        }
        r45.ed3 m40408x2b1c8130 = com.p314xaae8f345.p542x3306d5.smc.C4587xd5ddedd6.m40408x2b1c8130();
        this.f403637f = m40408x2b1c8130;
        if (m40408x2b1c8130 != null) {
            r45.fw3 fw3Var = new r45.fw3();
            m40408x2b1c8130.f454843n = fw3Var;
            fw3Var.f456185d = fVar.b(0);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f403636e = u0Var;
        boolean n17 = gm0.j1.b().n();
        r45.ed3 ed3Var = this.f403637f;
        if (!n17) {
            ed3Var.f454839g = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0());
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152203g = false;
        lVar.f152197a = ed3Var;
        lVar.f152198b = new r45.fd3();
        lVar.f152199c = n17 ? "/cgi-bin/micromsg-bin/getkvidkeystrategy" : "/cgi-bin/micromsg-bin/getkvidkeystrategyrsa";
        lVar.f152200d = mo808xfb85f7b0();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f403635d = a17;
        if (!n17) {
            a17.m48033x97bfc4c(new o45.pi("010001", "D8D2AE73FF601B93B1471B35870A1B59D7649EEA815CDD8CE5496BBD0C6CFE19C0E082F4E513B615C6030CCFCE3153E25AA00E8156D0311AF72ABBB9BBEC8B1D3751592234B1A621CA774E2EC50047A93FA0BC60DF0C10E8A65C3B29D13167EC217FC6A29034494870705CBF4AC929FBA0E1E656A8F8B50E779AD89BB4EEF6FF", 125));
            this.f403635d.f152247e = 1;
        }
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f403635d, this);
        if (mo9409x10f9447a < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetCliKVStrategy", "mark all failed. do scene %d", java.lang.Integer.valueOf(mo9409x10f9447a));
            try {
                ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40370xc40ad982(3, -1, null, 1);
                ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40370xc40ad982(3, -1, null, 2);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0.class)).i4(3, -1, null, 1);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0.class)).i4(3, -1, null, 2);
                synchronized (f403634i) {
                    f403633h = false;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetCliKVStrategy", "onReportStrategyResp failed  hash:%d  , ex:%s", java.lang.Integer.valueOf(hashCode()), com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        }
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return gm0.j1.b().n() ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s6.f34739x366c91de : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.q6.f34713x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (gm0.j1.n().f354821b == null || gm0.j1.n().f354821b.f152297d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.NetSceneGetCliKVStrategy", "null == network().getNetSceneQueue().getDispatcher(), can't give response to kvcomm.");
            this.f403636e.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        if (i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetCliKVStrategy", "get report strategy err, errType:" + i18 + ", errCode:" + i19);
            ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40370xc40ad982(i18, i19, null, 1);
            ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40370xc40ad982(i18, i19, null, 2);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0.class)).i4(0, 0, null, 1);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0.class)).i4(0, 0, null, 2);
            this.f403636e.mo815x76e0bfae(i18, i19, str, this);
            synchronized (f403634i) {
                f403633h = false;
            }
            return;
        }
        r45.fd3 fd3Var = (r45.fd3) this.f403635d.f152244b.f152233a;
        this.f403638g.c(fd3Var.f455771w, 0);
        try {
            p45.f m40413x3ec8f73c = com.p314xaae8f345.p542x3306d5.smc.C4587xd5ddedd6.m40413x3ec8f73c(fd3Var);
            p45.c m40412x33356c39 = com.p314xaae8f345.p542x3306d5.smc.C4587xd5ddedd6.m40412x33356c39(fd3Var);
            ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40370xc40ad982(0, 0, m40413x3ec8f73c.mo14344x5f01b1f6(), 1);
            ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40370xc40ad982(0, 0, m40412x33356c39.mo14344x5f01b1f6(), 2);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0.class)).i4(0, 0, m40413x3ec8f73c.mo14344x5f01b1f6(), 1);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.s0.class)).i4(0, 0, m40412x33356c39.mo14344x5f01b1f6(), 2);
        } catch (java.lang.Exception e17) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetCliKVStrategy", "onReportStrategyResp failed  hash:%d  , ex:%s", valueOf, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
        this.f403636e.mo815x76e0bfae(i18, i19, str, this);
        synchronized (f403634i) {
            f403633h = false;
        }
    }
}
