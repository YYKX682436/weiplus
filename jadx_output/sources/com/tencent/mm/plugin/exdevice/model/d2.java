package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes11.dex */
public class d2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f98875d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f98876e = null;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String[] f98877f;

    public d2(java.lang.String[] strArr, java.lang.String str, int i17) {
        this.f98875d = null;
        if (strArr == null) {
            throw new java.lang.IllegalArgumentException("null == aMac");
        }
        if (strArr.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "0 == aMac.length");
            return;
        }
        this.f98877f = strArr;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "NetSceneBatchSearchHardDevice, %s, list = %d", str, java.lang.Integer.valueOf(strArr.length));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.rg();
        lVar.f70665b = new r45.sg();
        lVar.f70667d = 542;
        lVar.f70666c = "/cgi-bin/micromsg-bin/batchsearchharddevice";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f98875d = a17;
        r45.rg rgVar = (r45.rg) a17.f70710a.f70684a;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str2 : strArr) {
            if (str2 != null) {
                r45.qg qgVar = new r45.qg();
                qgVar.f383959d = str2;
                linkedList.add(qgVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "NetSceneBatchSearchHardDevice, item = %s", str2);
            }
        }
        rgVar.f384823d = linkedList;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            r45.pg pgVar = new r45.pg();
            pgVar.f383011d = str;
            rgVar.f384824e = pgVar;
        }
        if (i17 >= 0) {
            rgVar.f384825f = i17;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f98876e = u0Var;
        return dispatch(sVar, this.f98875d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 542;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.util.Iterator it;
        r45.d74 d74Var;
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "onGYNetEnd, netId = %d, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        boolean z17 = true;
        java.lang.String[] strArr = this.f98877f;
        if (strArr != null && strArr.length == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "device mac is  = %s", strArr[0]);
        }
        if (v0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "null == rr");
            return;
        }
        com.tencent.mm.modelbase.o oVar = this.f98875d;
        if (oVar.f70713d != v0Var.getType()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "mReqResp.getType(%d) != rr.getType(%d)", java.lang.Integer.valueOf(oVar.f70713d), java.lang.Integer.valueOf(v0Var.getType()));
            return;
        }
        if (i18 == 0 && i19 == 0) {
            java.util.Iterator it6 = ((oVar == null || (fVar = oVar.f70711b.f70700a) == null) ? null : (r45.sg) fVar).f385689d.iterator();
            while (it6.hasNext()) {
                r45.tg tgVar = (r45.tg) it6.next();
                com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "BatchSearchHardDeviceResp, ret = %d, bind ticket = %s, mac = %s, device name = %s", java.lang.Integer.valueOf(tgVar.f386388d), tgVar.f386389e, tgVar.f386391g, tgVar.f386392h);
                r45.tn4 tn4Var = tgVar.f386390f;
                if (tn4Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "null == item.Contact");
                } else {
                    java.lang.String g17 = x51.j1.g(tn4Var.f386589d);
                    java.lang.String str2 = tn4Var.Z;
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(g17) && com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "processModContact user is null user:%s enuser:%s", g17, str2);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "processModContact : %s", g17);
                        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(g17, z17);
                        if (n17 == null || !g17.equals(n17.J0())) {
                            com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3(g17);
                            z3Var.k1(tn4Var.f386586J);
                            z3Var.setType(tn4Var.f386597n & tn4Var.f386596m);
                            it = it6;
                            z3Var.W1(tn4Var.V1 & tn4Var.U1);
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                                z3Var.K1(str2);
                            } else if (n17 != null && ((int) n17.E2) > 0) {
                                z3Var.K1(n17.J0());
                            }
                            z3Var.E2 = n17 == null ? 0L : (int) n17.E2;
                            z3Var.M1(x51.j1.g(tn4Var.f386590e));
                            z3Var.R1(x51.j1.g(tn4Var.f386591f));
                            z3Var.S1(x51.j1.g(tn4Var.f386592g));
                            z3Var.g3(tn4Var.f386593h);
                            z3Var.M2(tn4Var.f386604s);
                            z3Var.D1(x51.j1.g(tn4Var.f386607v));
                            z3Var.J2(tn4Var.f386608w);
                            z3Var.Z2(tn4Var.B);
                            z3Var.c3(com.tencent.mm.storage.ha.q(tn4Var.S, tn4Var.f386612y, tn4Var.f386615z));
                            z3Var.h3(tn4Var.A);
                            z3Var.Z1(tn4Var.D);
                            z3Var.o3(tn4Var.E);
                            z3Var.j3(tn4Var.G);
                            z3Var.a2(tn4Var.M);
                            z3Var.b2(tn4Var.L);
                            if (c01.e2.Y(tn4Var.H)) {
                                z3Var.p3(tn4Var.H);
                            }
                            z3Var.K2((int) com.tencent.mm.sdk.platformtools.t8.i1());
                            z3Var.n1(x51.j1.g(tn4Var.f386599p));
                            z3Var.o1(x51.j1.g(tn4Var.f386603r));
                            z3Var.p1(x51.j1.g(tn4Var.f386602q));
                            z3Var.d3(tn4Var.D1);
                            z3Var.e3(tn4Var.E1);
                            if (n17 != null) {
                                java.lang.String str3 = n17.f236591z1;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                java.lang.String str4 = tn4Var.E1;
                                if (!str3.equals(str4 != null ? str4 : "")) {
                                    com.tencent.mm.vfs.w6.h(i21.q.h().b(g17));
                                }
                            }
                            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().j(g17);
                            if (com.tencent.mm.sdk.platformtools.t8.K0(z3Var.d1())) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "dkinit dealModContactExtInfo failed invalid contact");
                            } else {
                                java.lang.String d17 = z3Var.d1();
                                ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
                                com.tencent.mm.modelavatar.g.e(d17, tn4Var, z3Var);
                                r45.cb6 cb6Var = tn4Var.R;
                                if (!z3Var.d1().endsWith("@chatroom") && cb6Var != null) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "SnsFlag modcontact " + cb6Var.f371428d + " " + tn4Var.f386589d);
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SnsBg modcontact ");
                                    sb6.append(cb6Var.f371429e);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", sb6.toString());
                                    com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "SnsBgId modcontact " + cb6Var.f371430f);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "SnsBgId modcontact " + cb6Var.f371431g);
                                    if (p94.w0.c() != null) {
                                        ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).z1(z3Var.d1(), cb6Var);
                                    }
                                }
                                java.lang.String r17 = c01.z1.r();
                                if (r17 != null && !r17.equals(d17)) {
                                    dm.h1 h1Var = (dm.h1) ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Ai(d17);
                                    h1Var.field_username = d17;
                                    h1Var.field_brandList = tn4Var.V;
                                    r45.va0 va0Var = tn4Var.W;
                                    if (va0Var != null) {
                                        h1Var.field_brandFlag = va0Var.f388021d;
                                        h1Var.field_brandInfo = va0Var.f388023f;
                                        h1Var.field_brandIconURL = va0Var.f388024g;
                                        h1Var.field_extInfo = va0Var.f388022e;
                                        h1Var.field_attrSyncVersion = null;
                                        h1Var.field_incrementUpdateTime = 0L;
                                    }
                                    rv.t2 t2Var = (rv.t2) h1Var;
                                    if (!((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Di(t2Var)) {
                                        ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Bi(t2Var);
                                    }
                                    z3Var.D2(h1Var.field_type);
                                }
                            }
                            z3Var.z1(tn4Var.C1);
                            r45.b5 b5Var = tn4Var.f386601p1;
                            if (b5Var != null && (d74Var = b5Var.f370529d) != null) {
                                z3Var.W2(d74Var.f372202e);
                                z3Var.X2(tn4Var.f386601p1.f370529d.f372201d);
                                z3Var.Y2(tn4Var.f386601p1.f370529d.f372203f);
                            }
                            if (c01.e2.D(g17)) {
                                z3Var.U2();
                            }
                            if (z3Var.k2()) {
                                z3Var.setType(z3Var.getType() & (-65));
                            }
                            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().l0(z3Var);
                            } else {
                                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q0(str2, z3Var);
                            }
                            if (n17 != null && (n17.getType() & 2048) != (z3Var.getType() & 2048)) {
                                if ((z3Var.getType() & 2048) != 0) {
                                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().S(z3Var.d1());
                                } else {
                                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().V(z3Var.d1());
                                }
                            }
                            it6 = it;
                            z17 = true;
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.exdevice.NetSceneBatchSearchHardDevice", "cat's replace user with stranger");
                        }
                    }
                    it = it6;
                    it6 = it;
                    z17 = true;
                }
            }
        }
        this.f98876e.onSceneEnd(i18, i19, str, this);
    }
}
