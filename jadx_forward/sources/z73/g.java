package z73;

/* loaded from: classes11.dex */
public class g extends z73.a {

    /* renamed from: q, reason: collision with root package name */
    public static final bm5.p1 f552115q = new z73.e();

    /* renamed from: p, reason: collision with root package name */
    public final boolean f552116p;

    public g(java.lang.String str, java.lang.String str2, java.util.List list, boolean z17) {
        this.f552116p = true;
        if (z17) {
            this.f552108o = 0;
        } else {
            str = lp0.a.f401789j;
            str2 = lp0.a.a();
            list = z73.h.c();
            this.f552108o = 1;
        }
        this.f552102f = str;
        this.f552103g = str2;
        this.f552104h.addAll(list);
        this.f552116p = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(24470, this.f552105i, "", java.lang.Integer.valueOf(this.f552108o), java.lang.Boolean.FALSE);
        g0Var.A(1821, 1);
    }

    @Override // z73.a, com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        sc0.h hVar = (sc0.h) f552115q.b();
        z73.f fVar = new z73.f(this);
        y45.t tVar = (y45.t) hVar;
        synchronized (tVar.f540924b) {
            if (tVar.f540924b[0] != null) {
                d55.u.d("MicroMsg.RecoveryWatchDog", "[!] %s: previous called begin() was not ended, cancel it first.", tVar.f540923a);
                y45.u.a().removeCallbacks(tVar.f540924b[0]);
            }
            tVar.f540924b[0] = new y45.s(tVar, fVar);
            y45.u.a().postDelayed(tVar.f540924b[0], 60000L);
            d55.u.b("MicroMsg.RecoveryWatchDog", "[+] %s: begin() was called, stack: %s", tVar.f540923a, android.util.Log.getStackTraceString(new java.lang.Throwable()));
        }
        return super.mo807x6c193ac1(sVar, u0Var);
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "errType:%d errCode:%d errMsg:%s ", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f552101e.mo815x76e0bfae(i18, i19, str, this);
        bm5.p1 p1Var = f552115q;
        if (i18 != 0 || i19 != 0) {
            if (i18 == 4) {
                ((y45.t) ((sc0.h) p1Var.b())).a();
            }
            y73.a.a(5, i18);
            return;
        }
        ((y45.t) ((sc0.h) p1Var.b())).a();
        r45.g35 g35Var = (r45.g35) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        r45.j35 j35Var = g35Var.f456386d;
        com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb g17 = y73.p.g();
        oq1.n nVar = null;
        if (j35Var == null && g17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "no other patch, try to use x mmdiff patch.");
            nVar = y73.p.h(null, true);
        }
        if (j35Var == null && g17 == null && nVar == null) {
            int i27 = g35Var.f456391i;
            if (i27 == 1) {
                y73.a.a(1, 0);
                return;
            }
            if (i27 == 2) {
                y73.a.a(2, 0);
                return;
            }
            if (i27 == 3) {
                y73.a.a(3, 0);
                return;
            }
            if (i27 == 4) {
                y73.a.a(6, 0);
                return;
            } else if (i27 == 6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "revoke this patch.");
                return;
            } else {
                y73.a.a(5, 0);
                return;
            }
        }
        boolean z17 = this.f552116p;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "check from setting about ui. ");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb = new com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb(j35Var);
        if (g17 == null || !y73.p.b(g17)) {
            g17 = c16114x800e8cdb;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "user repair hardcode");
        }
        g17.f223956v = true;
        oq1.n h17 = y73.p.h(g17, true);
        if ((h17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb) && y73.p.b(h17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "user xkey patch hardcode");
            g17 = (com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb) h17;
        } else {
            g17.f223958x = true;
            g17.f223959y = true;
            g17.f223960z = false;
            g17.B = 6;
            g17.C = 1;
        }
        if (g17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "syncResponse is null.");
        } else {
            new y73.d0(g17).j(z17);
            y73.a.a(4, 0);
        }
    }
}
