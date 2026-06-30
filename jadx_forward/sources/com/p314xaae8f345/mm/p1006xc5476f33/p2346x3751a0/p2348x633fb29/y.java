package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes12.dex */
public class y extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f258449g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Set f258450h = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f258451d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f258452e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f258453f = new java.util.LinkedList();

    public y(java.lang.String str, java.lang.String str2, int i17, int i18) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.r1(1);
        f9Var.u1(str);
        f9Var.e1(c01.w9.o(str));
        f9Var.j1(1);
        f9Var.d1(str2);
        f9Var.m124850x7650bebc(i17);
        long M9 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
        iz5.a.g(null, M9 != -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "new msg inserted to db , local id = " + M9);
        if ((i18 & 4) != 0) {
            ((java.util.HashSet) f258450h).add(java.lang.Long.valueOf(M9));
        }
    }

    public final void H(int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) ((java.util.LinkedList) this.f258453f).get(i17);
        f9Var.r1(5);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.m124847x74d37ac6(), f9Var, true);
        java.util.Iterator it = ((java.util.ArrayList) f258449g).iterator();
        while (it.hasNext()) {
            c01.w8 w8Var = (c01.w8) it.next();
            f9Var.j();
            w8Var.getClass();
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f258451d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ez5();
        lVar.f152198b = new r45.fz5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/newsendmsg";
        lVar.f152200d = 522;
        lVar.f152201e = 237;
        lVar.f152202f = 1000000237;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f258452e = a17;
        r45.ez5 ez5Var = (r45.ez5) a17.f152243a.f152217a;
        java.util.List c67 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().c6(Integer.MAX_VALUE);
        if (c67.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "no sending message");
            return -2;
        }
        java.util.List list = this.f258453f;
        java.util.LinkedList linkedList = (java.util.LinkedList) list;
        linkedList.clear();
        for (int i17 = 0; i17 < c67.size(); i17++) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) c67.get(i17);
            if (f9Var.A0() == 1) {
                r45.ll4 ll4Var = new r45.ll4();
                r45.du5 du5Var = new r45.du5();
                du5Var.f454289d = f9Var.Q0();
                du5Var.f454290e = true;
                ll4Var.f461105d = du5Var;
                ll4Var.f461108g = (int) (f9Var.mo78012x3fdd41df() / 1000);
                ll4Var.f461107f = f9Var.mo78013xfb85f7b0();
                ll4Var.f461106e = f9Var.j();
                ll4Var.f461109h = c01.y1.a(c01.z1.r(), f9Var.mo78012x3fdd41df()).hashCode();
                ll4Var.f461110i = c01.ia.f(null);
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).Bi(f9Var.Q0())) {
                    ll4Var.f461111m = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().X(f9Var.Q0());
                }
                ez5Var.f455384e.add(ll4Var);
                ez5Var.f455383d = ez5Var.f455384e.size();
                linkedList.add(f9Var);
            }
        }
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f258452e, this);
        if (mo9409x10f9447a < 0) {
            for (int i18 = 0; i18 < ((java.util.LinkedList) list).size(); i18++) {
                H(i18);
            }
        }
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 522;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "onGYNetEnd errtype:" + i18 + " errcode:" + i19);
        r45.fz5 fz5Var = (r45.fz5) this.f258452e.f152244b.f152233a;
        if (fz5Var != null && (i18 == 4 || (i18 == 0 && i19 == 0))) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).Di(fz5Var.f456285f);
        }
        java.util.List list = this.f258453f;
        if (i18 != 0 || i19 != 0) {
            for (int i27 = 0; i27 < ((java.util.LinkedList) list).size(); i27++) {
                H(i27);
            }
            this.f258451d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        java.util.LinkedList linkedList = fz5Var.f456284e;
        java.util.LinkedList linkedList2 = (java.util.LinkedList) list;
        if (linkedList2.size() == linkedList.size()) {
            int i28 = 0;
            while (i28 < linkedList.size()) {
                r45.ml4 ml4Var = (r45.ml4) linkedList.get(i28);
                if (ml4Var.f462159d != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSendMsg", "send msg failed: item ret code=" + ml4Var.f462159d);
                    H(i28);
                    this.f258451d.mo815x76e0bfae(4, ml4Var.f462159d, str, this);
                    return;
                }
                long m124847x74d37ac6 = ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) linkedList2.get(i28)).m124847x74d37ac6();
                java.lang.String Q0 = ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) linkedList2.get(i28)).Q0();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "msg local id = " + m124847x74d37ac6 + ", SvrId = " + ml4Var.f462166n + " sent successfully!");
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(Q0, m124847x74d37ac6);
                Li.o1(ml4Var.f462166n);
                Li.r1(2);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(m124847x74d37ac6, Li, true);
                i28++;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "total " + i28 + " msgs sent successfully");
        }
        int mo807x6c193ac1 = mo807x6c193ac1(m47995xb7ba1aa7(), this.f258451d);
        if (mo807x6c193ac1 == -2) {
            this.f258451d.mo815x76e0bfae(0, 0, str, this);
        } else if (mo807x6c193ac1 < 0) {
            this.f258451d.mo815x76e0bfae(3, -1, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 10;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return ((java.util.LinkedList) this.f258453f).size() > 0 ? com.p314xaae8f345.mm.p944x882e457a.o1.EOk : com.p314xaae8f345.mm.p944x882e457a.o1.EFailed;
    }
}
