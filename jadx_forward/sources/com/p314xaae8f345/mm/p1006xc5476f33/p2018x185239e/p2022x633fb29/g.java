package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29;

/* loaded from: classes9.dex */
public class g implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final long f238351d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f238352e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.nq4 f238353f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f238354g = null;

    /* renamed from: h, reason: collision with root package name */
    public int f238355h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f238356i;

    public g(long j17, r45.nq4 nq4Var) {
        this.f238353f = null;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f238356i = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5881x7dc1b82c>(a0Var) { // from class: com.tencent.mm.plugin.remittance.model.MsgCheckTaskMgr$MsgCheckTask$1
            {
                this.f39173x3fe91575 = -85283268;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5881x7dc1b82c c5881x7dc1b82c) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5881x7dc1b82c c5881x7dc1b82c2 = c5881x7dc1b82c;
                am.xp xpVar = c5881x7dc1b82c2.f136189g;
                if (xpVar.f89930d == null) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.g.this;
                if (!gVar.f238353f.f463131e.equals(xpVar.f89927a)) {
                    return false;
                }
                am.xp xpVar2 = c5881x7dc1b82c2.f136189g;
                if (pt0.f0.Li(xpVar2.f89929c, xpVar2.f89928b).mo78013xfb85f7b0() != 419430449) {
                    return false;
                }
                int i17 = xpVar2.f89930d.I0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgCheckTaskMgr", "MsgCheck msgID:%s transeferID:%s paySubType:%s", java.lang.Long.valueOf(xpVar2.f89928b), xpVar2.f89927a, java.lang.Integer.valueOf(i17));
                if ((i17 != 3 && i17 != 23 && i17 != 4 && i17 != 24 && i17 != 5 && i17 != 25 && i17 != 6 && i17 != 26) || gVar.f238352e) {
                    return false;
                }
                gVar.b();
                return false;
            }
        };
        this.f238351d = j17;
        this.f238352e = false;
        this.f238353f = nq4Var;
    }

    public void a() {
        gm0.j1.d().a(6230, this);
        gm0.j1.d().a(4895, this);
        this.f238356i.mo48813x58998cd();
        java.lang.String str = this.f238353f.f463131e;
        long j17 = this.f238351d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgCheckTaskMgr", "start MsgCheckTask %s after %s", str, java.lang.Long.valueOf(j17));
        this.f238355h = 1;
        if (this.f238354g == null) {
            this.f238354g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) this, false);
        }
        long j18 = j17 * 1000;
        this.f238354g.c(j18, j18);
    }

    public void b() {
        r45.nq4 nq4Var;
        gm0.j1.d().q(6230, this);
        gm0.j1.d().q(4895, this);
        this.f238356i.mo48814x2efc64();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f238354g;
        if (b4Var != null && !b4Var.e()) {
            this.f238354g.d();
            this.f238352e = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.h hVar = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.h.f238380b;
        java.lang.String str = this.f238353f.f463131e;
        r45.qq4 qq4Var = hVar.f238381a;
        java.util.Iterator it = qq4Var.f465737d.iterator();
        while (true) {
            if (!it.hasNext()) {
                nq4Var = null;
                break;
            } else {
                nq4Var = (r45.nq4) it.next();
                if (str.equals(nq4Var.f463131e)) {
                    break;
                }
            }
        }
        qq4Var.f465737d.remove(nq4Var);
        hVar.b();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17 = m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.j0;
        r45.nq4 nq4Var = this.f238353f;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.j0 j0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.j0) m1Var;
            if (j0Var.f238398g.equals(nq4Var.f463131e)) {
                if (i17 == 0 && i18 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgCheckTaskMgr", "MsgCheck retCode:%s retMsg:%s transferID:%s", java.lang.Integer.valueOf(j0Var.f238396e.f464843d), j0Var.f238396e.f464844e, nq4Var.f463131e);
                    if (j0Var.f238396e.f464843d == 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23016, 1, nq4Var.f463131e);
                        kw3.p.Ai().Di().e(nq4Var.f463134h, j0Var.f238396e.f464845f, 0L);
                    }
                }
                b();
                return;
            }
            return;
        }
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.l1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.l1 l1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.l1) m1Var;
            if (l1Var.f238414s.equals(nq4Var.f463131e)) {
                if (i17 == 0 && i18 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgCheckTaskMgr", "UnionMsgCheck retCode:%s retMsg:%s transferID:%s", java.lang.Integer.valueOf(l1Var.f238413r.f473982d), l1Var.f238413r.f473983e, nq4Var.f463131e);
                    if (l1Var.f238413r.f473982d == 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23016, 1, nq4Var.f463131e);
                        kw3.p.Ai().Di().e(nq4Var.f463134h, l1Var.f238413r.f473984f, 0L);
                    }
                }
                b();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        int i17 = this.f238355h;
        if (i17 == 1) {
            r45.nq4 nq4Var = this.f238353f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgCheckTaskMgr", "onTimerExpired, do MsgCheck scene, transferID:%s", nq4Var.f463131e);
            this.f238352e = true;
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(nq4Var.f463134h) || c01.e2.R(nq4Var.f463134h)) {
                gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.l1(nq4Var.f463131e, nq4Var.f463132f, nq4Var.f463133g));
            } else {
                gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.j0(nq4Var.f463131e, nq4Var.f463132f, nq4Var.f463133g));
            }
            this.f238355h = 2;
            this.f238354g.c(18000L, 18000L);
        } else if (i17 == 2) {
            b();
        }
        return true;
    }
}
