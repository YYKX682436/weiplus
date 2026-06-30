package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class q2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f246120d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f246121e;

    /* renamed from: f, reason: collision with root package name */
    public final int f246122f;

    /* renamed from: g, reason: collision with root package name */
    public final long f246123g;

    /* renamed from: h, reason: collision with root package name */
    public final int f246124h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.e86 f246125i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f246126m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.p96 f246127n;

    /* renamed from: o, reason: collision with root package name */
    public int f246128o;

    public q2(long j17, r45.p96 p96Var) {
        this.f246122f = -1;
        this.f246123g = 0L;
        this.f246124h = -1;
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f246123g = j17;
        this.f246122f = 15;
        this.f246127n = p96Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.s96();
        lVar.f152198b = new r45.t96();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsnsobjectop";
        lVar.f152200d = 218;
        lVar.f152201e = 104;
        lVar.f152202f = 1000000104;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f246121e = a17;
        r45.s96 s96Var = (r45.s96) a17.f152243a.f152217a;
        r45.o96 o96Var = new r45.o96();
        o96Var.f463584d = j17;
        o96Var.f463585e = 15;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("debugPrintSnsObjectOpVisibility", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsObjectOp", "debugPrintSnsObjectOpVisibility:\n OpType=%d\n GroupUserCount=%d\n GroupContactTagIdList=[%s]\n GroupContactTagIdListCount=%d\n BlackListCount=%d\n BlackContactTagIdList=[%s]\n BlackContactTagIdListCount=%d,", java.lang.Integer.valueOf(p96Var.f464432o), java.lang.Integer.valueOf(p96Var.f464428h), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v0(p96Var.f464431n), java.lang.Integer.valueOf(p96Var.f464430m), java.lang.Integer.valueOf(p96Var.f464424d), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v0(p96Var.f464427g), java.lang.Integer.valueOf(p96Var.f464426f));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("debugPrintSnsObjectOpVisibility", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        try {
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(p96Var.mo14344x5f01b1f6());
            o96Var.f463586f = cu5Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSnsObjectOp", "opSwitch error " + e17.getMessage());
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(o96Var);
        s96Var.f467116e = linkedList;
        s96Var.f467115d = linkedList.size();
    }

    public final void H(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearSnsObjectExcludeBlackList", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        c19806x4c372b7.f38960xc6d7bd1d.clear();
        c19806x4c372b7.f38961xa0d74df2 = 0;
        c19806x4c372b7.f38958xbe522252.clear();
        c19806x4c372b7.f38959xf984e1dd = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearSnsObjectExcludeBlackList", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
    }

    public final void I(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearSnsObjectIncludeContactList", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        c19806x4c372b7.f38975x1f0e1eca.clear();
        c19806x4c372b7.f38976xa7abf065 = 0;
        c19806x4c372b7.f38971xffe88d2.clear();
        c19806x4c372b7.f38972xbc148b5d = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearSnsObjectIncludeContactList", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
    }

    public long J() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        r45.e86 e86Var = this.f246125i;
        if (e86Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
            return 0L;
        }
        if (this.f246122f == 6) {
            long j17 = e86Var.f454670r;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
            return j17;
        }
        long j18 = e86Var.f454665m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        return j18;
    }

    public int K() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLoalId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLoalId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        return this.f246124h;
    }

    public int L() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOpType", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOpType", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        return this.f246122f;
    }

    public long M() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        return this.f246123g;
    }

    public final void N(java.lang.Long l17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetLikeFlag", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(l17.longValue());
            if (W0 != null) {
                boolean z17 = true;
                W0.m70448xb8471e25(1);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7().mo11468x92b714fd(W0.f68881x4c58c87d);
                java.lang.String r17 = c01.z1.r();
                java.util.Iterator<r45.e86> it = c19806x4c372b7.f38984xe83113e0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = false;
                        break;
                    } else if (it.next().f454659d.equals(r17)) {
                        break;
                    }
                }
                if (!z17) {
                    r45.e86 e86Var = new r45.e86();
                    e86Var.f454659d = r17;
                    c19806x4c372b7.f38984xe83113e0.add(e86Var);
                    c19806x4c372b7.f38982x6c24f798 = c19806x4c372b7.f38984xe83113e0.size();
                    W0.f68881x4c58c87d = c19806x4c372b7.mo14344x5f01b1f6();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.c(W0);
            }
        } catch (java.lang.Exception unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetLikeFlag", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public final int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        this.f246120d = u0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsObjectOp", "doScene: ");
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f246121e, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        return 218;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        p012xc85e97e9.p093xedfae76a.c1 a18;
        p012xc85e97e9.p093xedfae76a.c1 a19;
        int i27;
        p012xc85e97e9.p093xedfae76a.c1 a27;
        p012xc85e97e9.p093xedfae76a.c1 a28;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsObjectOp", "netId : " + i17 + " errType :" + i18 + " errCode: " + i19 + " errMsg :" + str);
        if (i18 != 0 || i19 != 0) {
            this.f246128o = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            if (i18 == 4) {
                int i28 = this.f246122f;
                if (i28 == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().w(this.f246123g);
                } else if (i28 == 5) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().k(this.f246123g, 20, this.f246128o, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().x(this.f246123g);
                    N(java.lang.Long.valueOf(this.f246123g));
                } else if (i28 == 7) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().k(this.f246123g, 21, this.f246128o, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().x(this.f246123g);
                    N(java.lang.Long.valueOf(this.f246123g));
                }
            }
            this.f246120d.mo815x76e0bfae(i18, i19, str, this);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
            return;
        }
        switch (this.f246122f) {
            case 1:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().w(this.f246123g);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().mo70496xb06685ab(this.f246123g);
                r45.t96 t96Var = (r45.t96) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
                if (t96Var.f467752f == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej().P1(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.sj(), t96Var.f467754h);
                }
                pb4.e eVar = pb4.e.f434729a;
                long j17 = this.f246123g;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteStarSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
                if (cc4.b.f122015a.c()) {
                    l75.k0 f17 = eVar.f();
                    p75.n0 n0Var = dm.ab.f317249y;
                    n0Var.getClass();
                    p75.m0 i29 = dm.ab.A.i(java.lang.Long.valueOf(j17));
                    if (n0Var instanceof p75.z) {
                        throw new java.lang.IllegalArgumentException("Not support multi table delete");
                    }
                    java.lang.String table = n0Var.b();
                    p75.h hVar = (p75.h) i29;
                    java.lang.String b17 = hVar.b();
                    java.lang.String[] e17 = hVar.e();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
                    int mo70514xb06685ab = f17.mo70514xb06685ab(table, b17, e17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSnsInfoStorage", "deleteStarSnsInfo >>  " + j17 + " result: " + mo70514xb06685ab);
                    if (mo70514xb06685ab > 0) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6098x8f514c1e c6098x8f514c1e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6098x8f514c1e();
                        java.lang.String j18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.j("sns_table_", j17);
                        am.yw ywVar = c6098x8f514c1e.f136375g;
                        ywVar.f90019b = j18;
                        ywVar.f90018a = 3;
                        ywVar.f90020c = c01.z1.r();
                        c6098x8f514c1e.e();
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteStarSnsInfo", "com.tencent.mm.plugin.sns.storage.star.SnsStarSnsInfoStorage");
                break;
            case 2:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(this.f246123g);
                if (W0 != null) {
                    W0.m70460x23d307c3(1);
                    W0.m70451x2f244d1a();
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f(W0);
                    f18.f38967x15579d0d &= -1543;
                    H(f18);
                    I(f18);
                    try {
                        W0.f68881x4c58c87d = f18.mo14344x5f01b1f6();
                    } catch (java.io.IOException e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneSnsObjectOp", e18, "", new java.lang.Object[0]);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().v3(this.f246123g, W0);
                    synchronized (jm0.k.f381803i) {
                        gm0.j1.b().c();
                        if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                            throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                        }
                        a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
                    }
                    zc4.g gVar = (zc4.g) ((zc4.h) a17).P6(zc4.g.class);
                    long j19 = this.f246123g;
                    o75.b bVar = o75.b.f425114b;
                    gVar.i7(j19, o75.b.f425116d);
                    break;
                }
                break;
            case 3:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W02 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(this.f246123g);
                if (W02 != null) {
                    W02.m70460x23d307c3(0);
                    W02.m70472x585e04d1();
                    W02.m70445x635d8e6b();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().v3(this.f246123g, W02);
                    synchronized (jm0.k.f381803i) {
                        gm0.j1.b().c();
                        if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                            throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                        }
                        a18 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
                    }
                    zc4.g gVar2 = (zc4.g) ((zc4.h) a18).P6(zc4.g.class);
                    long j27 = this.f246123g;
                    o75.b bVar2 = o75.b.f425114b;
                    gVar2.i7(j27, o75.b.f425116d);
                    break;
                }
                break;
            case 4:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W03 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(this.f246123g);
                if (W03 != null) {
                    try {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7().mo11468x92b714fd(W03.f68881x4c58c87d);
                        java.util.Iterator<r45.e86> it = c19806x4c372b7.f38963x20c46e68.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                r45.e86 next = it.next();
                                r45.e86 e86Var = this.f246125i;
                                if (e86Var != null && next.f454665m == e86Var.f454665m) {
                                    r8 = next;
                                }
                            }
                        }
                        if (r8 != null) {
                            c19806x4c372b7.f38963x20c46e68.remove(r8);
                        }
                        W03.m70440x8904a400(c19806x4c372b7.mo14344x5f01b1f6());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().V2(W03);
                        synchronized (jm0.k.f381803i) {
                            gm0.j1.b().c();
                            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                            }
                            a19 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
                        }
                        zc4.g gVar3 = (zc4.g) ((zc4.h) a19).P6(zc4.g.class);
                        long j28 = this.f246123g;
                        o75.b bVar3 = o75.b.f425114b;
                        gVar3.i7(j28, o75.b.f425116d);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().z0(W03.f68891x29d1292e, r0.f454665m, this.f246125i.f454662g);
                        break;
                    } catch (java.lang.Exception e19) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneSnsObjectOp", e19, "", new java.lang.Object[0]);
                        break;
                    }
                }
                break;
            case 5:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().x(this.f246123g);
                break;
            case 6:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(this.f246123g);
                if (y07 != null) {
                    try {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b72 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7) new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7().mo11468x92b714fd(y07.f67595x4c58c87d);
                        java.util.Iterator<r45.e86> it6 = c19806x4c372b72.f38963x20c46e68.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                r45.e86 next2 = it6.next();
                                r45.e86 e86Var2 = this.f246125i;
                                if (e86Var2 != null && next2.f454670r == e86Var2.f454670r) {
                                    r8 = next2;
                                }
                            }
                        }
                        if (r8 != null) {
                            c19806x4c372b72.f38963x20c46e68.remove(r8);
                        }
                        y07.m70321x8904a400(c19806x4c372b72.mo14344x5f01b1f6());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().mo11260x413cb2b4(y07);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w1 Aj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj();
                        long j29 = y07.f67610x29d1292e;
                        r45.e86 e86Var3 = this.f246125i;
                        Aj.z0(j29, e86Var3.f454670r, e86Var3.f454662g);
                        break;
                    } catch (java.lang.Exception e27) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneSnsObjectOp", e27, "", new java.lang.Object[0]);
                        break;
                    }
                }
                break;
            case 7:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().x(this.f246123g);
                break;
            case 8:
                java.lang.Object obj = this.f246126m;
                r8 = obj != null && (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c) ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c) obj : null;
                if (r8 != null && (i27 = r8.f247479e) > 0) {
                    if (i27 != 1 || ((java.lang.Integer) r8.f247480f.get(0)).intValue() != 101) {
                        a84.n.d(this.f246123g);
                        i64.u1.b(22, 1, 103);
                        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5258xf7a88d47().e();
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsObjectOp", "onGYNetEnd, reasonIdCount = " + r8.f247479e);
                    break;
                } else if (obj == null || !(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c) || ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c) obj).f247478d != 101) {
                    a84.n.d(this.f246123g);
                    i64.u1.b(22, 1, 103);
                    new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5258xf7a88d47().e();
                    break;
                }
                break;
            case 9:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W04 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(this.f246123g);
                if (W04 != null) {
                    W04.m70438xfb6d55cb(2);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().v3(this.f246123g, W04);
                    synchronized (jm0.k.f381803i) {
                        gm0.j1.b().c();
                        if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                            throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                        }
                        a27 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
                    }
                    zc4.g gVar4 = (zc4.g) ((zc4.h) a27).P6(zc4.g.class);
                    long j37 = this.f246123g;
                    o75.b bVar4 = o75.b.f425114b;
                    gVar4.i7(j37, o75.b.f425117e);
                    break;
                }
                break;
            case 11:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsObjectOp", "scene end switch 0");
                gm0.j1.i();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEWYEAR_2016_HONGBAO_SNS_CTRLLUCKYOPEN_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
                gm0.j1.i();
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEWYEAR_2016_HONGBAO_SNS_CTRLLUCKYCOUNT_INT_SYNC;
                int intValue = ((java.lang.Integer) c17.m(u3Var, 0)).intValue();
                gm0.j1.i();
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(intValue + 1));
                gm0.j1.i();
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEWYEAR_2016_HONGBAO_SNS_CTRLLUCKYCOUNT2_INT_SYNC;
                int intValue2 = ((java.lang.Integer) c18.m(u3Var2, 0)).intValue() + 1;
                int i37 = (intValue2 * 2) + nd1.d1.f72919x366c91de;
                if (i37 >= 216) {
                    i37 = 216;
                }
                if (i37 >= 200) {
                    ha4.b.a(i37);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsObjectOp", "opcount open " + i37 + " " + intValue2);
                gm0.j1.i();
                gm0.j1.u().c().x(u3Var2, java.lang.Integer.valueOf(intValue2));
                break;
            case 12:
                java.lang.Object obj2 = this.f246126m;
                if (obj2 != null && (obj2 instanceof r45.j96)) {
                    boolean z17 = ((r45.j96) obj2).f459208d == 1;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().o1(this.f246123g, z17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsObjectOp", "remind  update [snsId:%d] ->isSilence: %b", java.lang.Long.valueOf(this.f246123g), java.lang.Boolean.valueOf(z17));
                    break;
                }
                break;
            case 15:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W05 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(this.f246123g);
                if (W05 != null && this.f246127n != null) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f(W05);
                    r45.p96 p96Var = this.f246127n;
                    int i38 = p96Var.f464432o;
                    if (i38 == 3 && (p96Var.f464428h > 0 || p96Var.f464430m > 0)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsObjectOp", "[onGYNetEnd] CHANGE_VISIBILITY -> INCLUDE");
                        r45.p96 p96Var2 = this.f246127n;
                        int i39 = p96Var2.f464428h;
                        if (i39 > 0) {
                            f19.f38967x15579d0d = 4 | f19.f38967x15579d0d;
                        }
                        int i47 = p96Var2.f464430m;
                        if (i47 > 0) {
                            f19.f38967x15579d0d |= 512;
                        }
                        f19.f38975x1f0e1eca = p96Var2.f464429i;
                        f19.f38976xa7abf065 = i39;
                        f19.f38971xffe88d2 = p96Var2.f464431n;
                        f19.f38972xbc148b5d = i47;
                        H(f19);
                        W05.m70460x23d307c3(0);
                        W05.m70472x585e04d1();
                    } else if (i38 == 4 && (p96Var.f464424d > 0 || p96Var.f464426f > 0)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsObjectOp", "[onGYNetEnd] CHANGE_VISIBILITY -> EXCLUDE");
                        r45.p96 p96Var3 = this.f246127n;
                        int i48 = p96Var3.f464424d;
                        if (i48 > 0) {
                            f19.f38967x15579d0d |= 2;
                        }
                        int i49 = p96Var3.f464426f;
                        if (i49 > 0) {
                            f19.f38967x15579d0d |= 1024;
                        }
                        f19.f38960xc6d7bd1d = p96Var3.f464425e;
                        f19.f38961xa0d74df2 = i48;
                        f19.f38958xbe522252 = p96Var3.f464427g;
                        f19.f38959xf984e1dd = i49;
                        I(f19);
                        W05.m70460x23d307c3(0);
                        W05.m70472x585e04d1();
                    } else if (i38 == 1 || i38 == 2) {
                        if (i38 == 1) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsObjectOp", "[onGYNetEnd] CHANGE_VISIBILITY -> PUBLIC");
                            W05.m70460x23d307c3(0);
                            W05.m70472x585e04d1();
                            W05.m70445x635d8e6b();
                        }
                        if (this.f246127n.f464432o == 2) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsObjectOp", "[onGYNetEnd] CHANGE_VISIBILITY -> PRIVATE");
                            W05.m70460x23d307c3(1);
                            W05.m70451x2f244d1a();
                        }
                        f19.f38967x15579d0d &= -1543;
                        H(f19);
                        I(f19);
                    }
                    try {
                        W05.f68881x4c58c87d = f19.mo14344x5f01b1f6();
                    } catch (java.io.IOException e28) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneSnsObjectOp", e28, "", new java.lang.Object[0]);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().v3(this.f246123g, W05);
                    synchronized (jm0.k.f381803i) {
                        gm0.j1.b().c();
                        if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                            throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                        }
                        a28 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(zc4.h.class);
                    }
                    zc4.g gVar5 = (zc4.g) ((zc4.h) a28).P6(zc4.g.class);
                    long j38 = this.f246123g;
                    o75.b bVar5 = o75.b.f425114b;
                    gVar5.i7(j38, o75.b.f425116d);
                    break;
                }
                break;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().g();
        this.f246120d.mo815x76e0bfae(i18, i19, str, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
    }

    public q2(long j17, int i17) {
        this(j17, i17, (r45.e86) null, (java.lang.Object) null);
    }

    public q2(long j17, int i17, java.lang.Object obj) {
        this(j17, i17, (r45.e86) null, obj);
    }

    public q2(long j17, int i17, r45.e86 e86Var) {
        this(j17, i17, e86Var, (java.lang.Object) null);
    }

    public q2(long j17, int i17, r45.e86 e86Var, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262;
        java.lang.String str3;
        int i18;
        java.lang.String str4;
        this.f246122f = -1;
        this.f246123g = 0L;
        this.f246124h = -1;
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f246125i = e86Var;
        this.f246122f = i17;
        this.f246123g = j17;
        this.f246126m = obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsObjectOp", "snsId : " + j17 + "  op : " + i17);
        if (e86Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsObjectOp", e86Var.f454665m + " " + e86Var.f454670r);
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.s96();
        lVar.f152198b = new r45.t96();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsnsobjectop";
        lVar.f152200d = 218;
        lVar.f152201e = 104;
        lVar.f152202f = 1000000104;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f246121e = a17;
        r45.s96 s96Var = (r45.s96) a17.f152243a.f152217a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(j17);
        if (W0 != null) {
            this.f246124h = W0.f38324x142bbdc6;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsObjectOp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsObjectOp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        r45.o96 o96Var = new r45.o96();
        o96Var.f463586f = new r45.cu5();
        o96Var.f463584d = j17;
        o96Var.f463585e = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsObjectOp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSnsObjectOp ");
        sb6.append(i17);
        sb6.append(" ");
        sb6.append(obj == null ? "" : obj.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsObjectOp", sb6.toString());
        if (i17 == 8 || i17 == 10 || i17 == 7 || i17 == 8 || i17 == 6) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 y07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Vi().y0(j17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 m70298xd15b2ed8 = y07 != null ? y07.m70298xd15b2ed8() : null;
            if (m70298xd15b2ed8 == null || !m70298xd15b2ed8.m70377x3172ed()) {
                c17933xe8d1b226 = m70298xd15b2ed8;
                str = "";
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = m70298xd15b2ed8.m70346x10413e67();
                str = m70346x10413e67 == null ? "" : m70346x10413e67.f38104xce64ddf1;
                c17933xe8d1b226 = m70298xd15b2ed8;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsObjectOp", "aduxinfo " + str);
            }
            if (i17 == 7) {
                l44.b3 b3Var = l44.b3.f397574a;
                java.lang.String j18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.j("ad_table_", j17);
                str2 = str;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAdUnlikeResponse", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdInteractHelper", "onAdUnlikeResponse() called with: snsId = " + j18);
                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) l44.b3.f397587n).e(j18);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAdUnlikeResponse", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
            } else {
                str2 = str;
            }
            c17933xe8d1b2262 = c17933xe8d1b226;
            str3 = str2;
        } else {
            str3 = "";
            c17933xe8d1b2262 = null;
        }
        if (i17 == 6) {
            if (e86Var != null && (e86Var.f454665m != 0 || e86Var.f454670r != 0)) {
                r45.j76 j76Var = new r45.j76();
                j76Var.f459163d = e86Var.f454670r;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                j76Var.f459164e = x51.j1.i(str3 == null ? "" : str3);
                try {
                    byte[] mo14344x5f01b1f6 = j76Var.mo14344x5f01b1f6();
                    r45.cu5 cu5Var = new r45.cu5();
                    cu5Var.d(mo14344x5f01b1f6);
                    o96Var.f463586f = cu5Var;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneSnsObjectOp", e17, "", new java.lang.Object[0]);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsObjectOp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsObjectOp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
            }
        } else {
            if (i17 == 7) {
                r45.b76 b76Var = new r45.b76();
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                b76Var.f452152d = x51.j1.i(str3 == null ? "" : str3);
                try {
                    byte[] mo14344x5f01b1f62 = b76Var.mo14344x5f01b1f6();
                    r45.cu5 cu5Var2 = new r45.cu5();
                    cu5Var2.d(mo14344x5f01b1f62);
                    o96Var.f463586f = cu5Var2;
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneSnsObjectOp", e18, "", new java.lang.Object[0]);
                }
            } else if (i17 == 8) {
                boolean z19 = obj != null && (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c);
                if (z19) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c) obj;
                    boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    str3 = str3 == null ? "" : str3;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(str3);
                    sb7.append("&" + cVar.f247481g + "|" + cVar.f247482h);
                    str3 = sb7.toString();
                }
                r45.e76 e76Var = new r45.e76();
                boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                e76Var.f454611d = x51.j1.i(str3 == null ? "" : str3);
                if (c17933xe8d1b2262 != null) {
                    e76Var.f454612e = c17933xe8d1b2262.m70350x13c652ad();
                    java.lang.String m70367x7525eefd = c17933xe8d1b2262.m70367x7525eefd();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsStatExtBySnsId", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b1(m70367x7525eefd);
                    if (b17 != null) {
                        str4 = i64.q0.d(b17.m70371x485d7());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsStatExtBySnsId", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsStatExtBySnsId", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
                        str4 = "";
                    }
                    e76Var.f454613f = x51.j1.i(str4 == null ? "" : str4);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c cVar2 = z19 ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c) obj : null;
                if (cVar2 != null && (i18 = cVar2.f247479e) > 0) {
                    e76Var.f454615h = i18;
                    java.util.LinkedList linkedList = e76Var.f454616i;
                    java.util.LinkedList linkedList2 = cVar2.f247480f;
                    if (linkedList != null) {
                        linkedList.addAll(linkedList2);
                    }
                    if (cVar2.f247479e != 1 || ((java.lang.Integer) linkedList2.get(0)).intValue() != 101) {
                        a84.n.d(j17);
                        i64.u1.b(22, 1, 102);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsObjectOp", "getSnsObjectOp, reasonIdCount = " + cVar2.f247479e);
                } else if (z19 && ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c) obj).f247478d == 101) {
                    e76Var.f454614g = 101;
                } else {
                    a84.n.d(j17);
                    i64.u1.b(22, 1, 102);
                    if (z19) {
                        e76Var.f454614g = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.c) obj).f247478d;
                    }
                }
                try {
                    byte[] mo14344x5f01b1f63 = e76Var.mo14344x5f01b1f6();
                    r45.cu5 cu5Var3 = new r45.cu5();
                    cu5Var3.d(mo14344x5f01b1f63);
                    o96Var.f463586f = cu5Var3;
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneSnsObjectOp", e19, "", new java.lang.Object[0]);
                }
            } else if (i17 == 4) {
                if (e86Var != null && (e86Var.f454665m != 0 || e86Var.f454670r != 0)) {
                    r45.q96 q96Var = new r45.q96();
                    q96Var.f465317d = e86Var.f454665m;
                    try {
                        byte[] mo14344x5f01b1f64 = q96Var.mo14344x5f01b1f6();
                        r45.cu5 cu5Var4 = new r45.cu5();
                        cu5Var4.d(mo14344x5f01b1f64);
                        o96Var.f463586f = cu5Var4;
                    } catch (java.lang.Exception e27) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneSnsObjectOp", e27, "", new java.lang.Object[0]);
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsObjectOp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                }
            } else if (i17 == 10) {
                r45.ba6 ba6Var = new r45.ba6();
                if (obj instanceof com.p314xaae8f345.mm.p2495xc50a8b8b.g) {
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.g) obj;
                    ba6Var.f452185d = x51.j1.a(gVar.f273689a);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsObjectOp", "NetSceneSnsObjectOpticket " + gVar.f273689a.length);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSnsObjectOp", "error ticket");
                }
                try {
                    byte[] mo14344x5f01b1f65 = ba6Var.mo14344x5f01b1f6();
                    r45.cu5 cu5Var5 = new r45.cu5();
                    cu5Var5.d(mo14344x5f01b1f65);
                    o96Var.f463586f = cu5Var5;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsObjectOp", "opFree " + mo14344x5f01b1f65.length);
                } catch (java.lang.Exception e28) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSnsObjectOp", "error ticket " + e28.getMessage());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneSnsObjectOp", e28, "", new java.lang.Object[0]);
                }
            } else if (i17 == 12) {
                if (obj instanceof r45.j96) {
                    r45.j96 j96Var = (r45.j96) obj;
                    try {
                        o96Var.f463586f = x51.j1.a(j96Var.mo14344x5f01b1f6());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsObjectOp", "snsMetionBlockOp, switch:%d " + j96Var.f459208d);
                    } catch (java.lang.Exception e29) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSnsObjectOp", "error snsMetionBlockOp " + e29.getMessage());
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSnsObjectOp", "error snsMetionBlockOp");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsObjectOp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        }
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList3.add(o96Var);
        s96Var.f467116e = linkedList3;
        s96Var.f467115d = linkedList3.size();
        if (i17 == 1) {
            try {
                r45.k57 k57Var = new r45.k57();
                r45.cu5 cu5Var6 = new r45.cu5();
                cu5Var6.d(fo3.s.INSTANCE.h());
                k57Var.f459929f = cu5Var6;
                r45.cu5 cu5Var7 = new r45.cu5();
                cu5Var7.d(k57Var.mo14344x5f01b1f6());
                s96Var.f467117f = cu5Var7;
            } catch (java.lang.Throwable unused) {
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.NetSceneSnsObjectOp", "snsId:" + j17 + " type:" + i17, new java.lang.Object[0]);
    }

    public q2(long j17, int i17, int i18, java.lang.String str) {
        this.f246122f = -1;
        this.f246123g = 0L;
        this.f246124h = -1;
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f246125i = null;
        this.f246122f = 9;
        this.f246123g = j17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsObjectOp", "snsId : " + j17 + "  op : 9");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.s96();
        lVar.f152198b = new r45.t96();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmsnsobjectop";
        lVar.f152200d = 218;
        lVar.f152201e = 104;
        lVar.f152202f = 1000000104;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f246121e = a17;
        r45.s96 s96Var = (r45.s96) a17.f152243a.f152217a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 W0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().W0(j17);
        if (W0 != null) {
            this.f246124h = W0.f38324x142bbdc6;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsObjectOp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        r45.o96 o96Var = new r45.o96();
        o96Var.f463586f = new r45.cu5();
        o96Var.f463584d = j17;
        o96Var.f463585e = 9;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsObjectOp", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
        r45.r96 r96Var = new r45.r96();
        r96Var.f466195f = i17;
        r96Var.f466193d = i18;
        r96Var.f466194e = x51.j1.i(str);
        try {
            byte[] mo14344x5f01b1f6 = r96Var.mo14344x5f01b1f6();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(mo14344x5f01b1f6);
            o96Var.f463586f = cu5Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneSnsObjectOp", e17, "", new java.lang.Object[0]);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(o96Var);
        s96Var.f467116e = linkedList;
        s96Var.f467115d = linkedList.size();
    }
}
