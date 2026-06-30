package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes11.dex */
public class d2 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f180408d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f180409e = null;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String[] f180410f;

    public d2(java.lang.String[] strArr, java.lang.String str, int i17) {
        this.f180408d = null;
        if (strArr == null) {
            throw new java.lang.IllegalArgumentException("null == aMac");
        }
        if (strArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "0 == aMac.length");
            return;
        }
        this.f180410f = strArr;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "NetSceneBatchSearchHardDevice, %s, list = %d", str, java.lang.Integer.valueOf(strArr.length));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.rg();
        lVar.f152198b = new r45.sg();
        lVar.f152200d = 542;
        lVar.f152199c = "/cgi-bin/micromsg-bin/batchsearchharddevice";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f180408d = a17;
        r45.rg rgVar = (r45.rg) a17.f152243a.f152217a;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str2 : strArr) {
            if (str2 != null) {
                r45.qg qgVar = new r45.qg();
                qgVar.f465492d = str2;
                linkedList.add(qgVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "NetSceneBatchSearchHardDevice, item = %s", str2);
            }
        }
        rgVar.f466356d = linkedList;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            r45.pg pgVar = new r45.pg();
            pgVar.f464544d = str;
            rgVar.f466357e = pgVar;
        }
        if (i17 >= 0) {
            rgVar.f466358f = i17;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f180409e = u0Var;
        return mo9409x10f9447a(sVar, this.f180408d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 542;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.util.Iterator it;
        r45.d74 d74Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "onGYNetEnd, netId = %d, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        boolean z17 = true;
        java.lang.String[] strArr = this.f180410f;
        if (strArr != null && strArr.length == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "device mac is  = %s", strArr[0]);
        }
        if (v0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "null == rr");
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f180408d;
        if (oVar.f152246d != v0Var.mo13822xfb85f7b0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "mReqResp.getType(%d) != rr.getType(%d)", java.lang.Integer.valueOf(oVar.f152246d), java.lang.Integer.valueOf(v0Var.mo13822xfb85f7b0()));
            return;
        }
        if (i18 == 0 && i19 == 0) {
            java.util.Iterator it6 = ((oVar == null || (fVar = oVar.f152244b.f152233a) == null) ? null : (r45.sg) fVar).f467222d.iterator();
            while (it6.hasNext()) {
                r45.tg tgVar = (r45.tg) it6.next();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "BatchSearchHardDeviceResp, ret = %d, bind ticket = %s, mac = %s, device name = %s", java.lang.Integer.valueOf(tgVar.f467921d), tgVar.f467922e, tgVar.f467924g, tgVar.f467925h);
                r45.tn4 tn4Var = tgVar.f467923f;
                if (tn4Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "null == item.Contact");
                } else {
                    java.lang.String g17 = x51.j1.g(tn4Var.f468122d);
                    java.lang.String str2 = tn4Var.Z;
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "processModContact user is null user:%s enuser:%s", g17, str2);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "processModContact : %s", g17);
                        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(g17, z17);
                        if (n17 == null || !g17.equals(n17.J0())) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3(g17);
                            z3Var.k1(tn4Var.f468119J);
                            z3Var.mo43621x7650bebc(tn4Var.f468130n & tn4Var.f468129m);
                            it = it6;
                            z3Var.W1(tn4Var.V1 & tn4Var.U1);
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                                z3Var.K1(str2);
                            } else if (n17 != null && ((int) n17.E2) > 0) {
                                z3Var.K1(n17.J0());
                            }
                            z3Var.E2 = n17 == null ? 0L : (int) n17.E2;
                            z3Var.M1(x51.j1.g(tn4Var.f468123e));
                            z3Var.R1(x51.j1.g(tn4Var.f468124f));
                            z3Var.S1(x51.j1.g(tn4Var.f468125g));
                            z3Var.g3(tn4Var.f468126h);
                            z3Var.M2(tn4Var.f468137s);
                            z3Var.D1(x51.j1.g(tn4Var.f468140v));
                            z3Var.J2(tn4Var.f468141w);
                            z3Var.Z2(tn4Var.B);
                            z3Var.c3(com.p314xaae8f345.mm.p2621x8fb0427b.ha.q(tn4Var.S, tn4Var.f468145y, tn4Var.f468148z));
                            z3Var.h3(tn4Var.A);
                            z3Var.Z1(tn4Var.D);
                            z3Var.o3(tn4Var.E);
                            z3Var.j3(tn4Var.G);
                            z3Var.a2(tn4Var.M);
                            z3Var.b2(tn4Var.L);
                            if (c01.e2.Y(tn4Var.H)) {
                                z3Var.p3(tn4Var.H);
                            }
                            z3Var.K2((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
                            z3Var.n1(x51.j1.g(tn4Var.f468132p));
                            z3Var.o1(x51.j1.g(tn4Var.f468136r));
                            z3Var.p1(x51.j1.g(tn4Var.f468135q));
                            z3Var.d3(tn4Var.D1);
                            z3Var.e3(tn4Var.E1);
                            if (n17 != null) {
                                java.lang.String str3 = n17.f318124z1;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                java.lang.String str4 = tn4Var.E1;
                                if (!str3.equals(str4 != null ? str4 : "")) {
                                    com.p314xaae8f345.mm.vfs.w6.h(i21.q.h().b(g17));
                                }
                            }
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().j(g17);
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z3Var.d1())) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "dkinit dealModContactExtInfo failed invalid contact");
                            } else {
                                java.lang.String d17 = z3Var.d1();
                                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
                                com.p314xaae8f345.mm.p943x351df9c2.g.e(d17, tn4Var, z3Var);
                                r45.cb6 cb6Var = tn4Var.R;
                                if (!z3Var.d1().endsWith("@chatroom") && cb6Var != null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "SnsFlag modcontact " + cb6Var.f452961d + " " + tn4Var.f468122d);
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SnsBg modcontact ");
                                    sb6.append(cb6Var.f452962e);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", sb6.toString());
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "SnsBgId modcontact " + cb6Var.f452963f);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "SnsBgId modcontact " + cb6Var.f452964g);
                                    if (p94.w0.c() != null) {
                                        ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c()).z1(z3Var.d1(), cb6Var);
                                    }
                                }
                                java.lang.String r17 = c01.z1.r();
                                if (r17 != null && !r17.equals(d17)) {
                                    dm.h1 h1Var = (dm.h1) ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Ai(d17);
                                    h1Var.f66748xdec927b = d17;
                                    h1Var.f66736x6bad7fc0 = tn4Var.V;
                                    r45.va0 va0Var = tn4Var.W;
                                    if (va0Var != null) {
                                        h1Var.f66733x6baace8e = va0Var.f469554d;
                                        h1Var.f66735x6bac33d0 = va0Var.f469556f;
                                        h1Var.f66734xea1bd3d4 = va0Var.f469557g;
                                        h1Var.f66740x26b3182a = va0Var.f469555e;
                                        h1Var.f66731x4b3625c7 = null;
                                        h1Var.f66742x48b98940 = 0L;
                                    }
                                    rv.t2 t2Var = (rv.t2) h1Var;
                                    if (!((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Di(t2Var)) {
                                        ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Bi(t2Var);
                                    }
                                    z3Var.D2(h1Var.f66746x2262335f);
                                }
                            }
                            z3Var.z1(tn4Var.C1);
                            r45.b5 b5Var = tn4Var.f468134p1;
                            if (b5Var != null && (d74Var = b5Var.f452062d) != null) {
                                z3Var.W2(d74Var.f453735e);
                                z3Var.X2(tn4Var.f468134p1.f452062d.f453734d);
                                z3Var.Y2(tn4Var.f468134p1.f452062d.f453736f);
                            }
                            if (c01.e2.D(g17)) {
                                z3Var.U2();
                            }
                            if (z3Var.k2()) {
                                z3Var.mo43621x7650bebc(z3Var.m124896xfb85f7b0() & (-65));
                            }
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(z3Var);
                            } else {
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q0(str2, z3Var);
                            }
                            if (n17 != null && (n17.m124896xfb85f7b0() & 2048) != (z3Var.m124896xfb85f7b0() & 2048)) {
                                if ((z3Var.m124896xfb85f7b0() & 2048) != 0) {
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().S(z3Var.d1());
                                } else {
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().V(z3Var.d1());
                                }
                            }
                            it6 = it;
                            z17 = true;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "cat's replace user with stranger");
                        }
                    }
                    it = it6;
                    it6 = it;
                    z17 = true;
                }
            }
        }
        this.f180409e.mo815x76e0bfae(i18, i19, str, this);
    }
}
