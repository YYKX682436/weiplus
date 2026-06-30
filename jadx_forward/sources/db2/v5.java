package db2;

/* loaded from: classes2.dex */
public final class v5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f309730g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309731h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309732i;

    /* renamed from: m, reason: collision with root package name */
    public final org.json.JSONObject f309733m;

    /* renamed from: n, reason: collision with root package name */
    public final org.json.JSONObject f309734n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f309735o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f309736p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public v5(java.lang.String username, java.util.List cmdList, boolean z17, int i17, java.lang.String str, java.lang.Long l17, java.lang.String str2, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null, 1, null);
        ?? r66 = (i18 & 4) != 0 ? 0 : z17;
        i17 = (i18 & 8) != 0 ? 0 : i17;
        str = (i18 & 16) != 0 ? null : str;
        l17 = (i18 & 32) != 0 ? null : l17;
        str2 = (i18 & 64) != 0 ? null : str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdList, "cmdList");
        this.f309730g = "Finder.NetSceneFinderOplog";
        this.f309733m = new org.json.JSONObject();
        this.f309734n = new org.json.JSONObject();
        this.f309736p = "";
        this.f309736p = username;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 3870;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderoplog";
        r45.rn2 rn2Var = new r45.rn2();
        rn2Var.set(1, username);
        if (i17 != 0) {
            rn2Var.set(5, java.lang.Integer.valueOf(i17));
        }
        if (!(str == null || str.length() == 0)) {
            rn2Var.set(6, str);
        }
        rn2Var.m75941xfb821914(2).addAll(cmdList);
        db2.t4 t4Var = db2.t4.f309704a;
        r45.kv0 a17 = t4Var.a(3870);
        cq.k1.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209252ge).mo141623x754a37bb()).r()).booleanValue()) {
            a17.set(8, java.lang.Integer.valueOf(a17.m75939xb282bd08(8) | 4));
        }
        rn2Var.set(3, a17);
        r45.kv0 kv0Var = (r45.kv0) rn2Var.m75936x14adae67(3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kv0Var);
        kv0Var.set(1, java.lang.Integer.valueOf((int) r66));
        if (str2 != null && l17 != null) {
            t4Var.j((r45.kv0) rn2Var.m75936x14adae67(3), l17.longValue(), str2);
        }
        lVar.f152197a = rn2Var;
        lVar.f152198b = new r45.sn2();
        this.f309731h = lVar.a();
        synchronized (cmdList) {
            java.util.Iterator it = cmdList.iterator();
            int i19 = 0;
            while (it.hasNext()) {
                r45.hx0 hx0Var = (r45.hx0) it.next();
                this.f309734n.put("req" + i19, hx0Var.m75939xb282bd08(0));
                i19++;
            }
        }
        this.f309734n.put("isMegaVideo", (boolean) r66);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309730g, "NetSceneFinderOplog init ");
    }

    @Override // az2.u
    public boolean I() {
        return !this.f309735o;
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.String str2 = this.f309730g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "retList " + K().size());
        org.json.JSONObject jSONObject = this.f309733m;
        jSONObject.put("retsize", K().size());
        int i27 = 0;
        for (r45.ix0 ix0Var : K()) {
            jSONObject.put("resp" + i27, ix0Var.m75939xb282bd08(1));
            jSONObject.put("respm" + i27, ix0Var.m75945x2fec8307(2));
            i27++;
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309732i;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        for (r45.ix0 ix0Var2 : K()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "retCode " + ix0Var2.m75939xb282bd08(1) + " retMsg " + ix0Var2.m75945x2fec8307(2));
            if (!this.f309735o) {
                hz2.d dVar = hz2.d.f367846a;
                int m75939xb282bd08 = ix0Var2.m75939xb282bd08(1);
                java.lang.String m75945x2fec8307 = ix0Var2.m75945x2fec8307(2);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec8307)) {
                    if (m75939xb282bd08 == -5002) {
                        i95.m c17 = i95.n0.c(zy2.b6.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        cq.k1.a();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209252ge).mo141623x754a37bb()).r()).booleanValue()) {
                            if (m75945x2fec8307 != null) {
                                dVar.o(m75945x2fec8307);
                            }
                            jx3.f.INSTANCE.mo68477x336bdfd8(1264L, 1L, 1L, false);
                        }
                    } else if (m75939xb282bd08 == -5001) {
                        if (m75945x2fec8307 != null) {
                            dVar.n(m75945x2fec8307);
                        }
                        jx3.f.INSTANCE.mo68477x336bdfd8(1264L, 1L, 1L, false);
                    } else if (m75939xb282bd08 == -4019) {
                        if (m75945x2fec8307 != null) {
                            dVar.m(m75945x2fec8307);
                        }
                        jx3.f.INSTANCE.mo68477x336bdfd8(1264L, 6L, 1L, false);
                    } else if (m75939xb282bd08 == -4017) {
                        if (m75945x2fec8307 != null) {
                            dVar.m(m75945x2fec8307);
                        }
                        jx3.f.INSTANCE.mo68477x336bdfd8(1264L, 2L, 1L, false);
                    } else if (m75939xb282bd08 == -4007) {
                        if (m75945x2fec8307 != null) {
                            dVar.m(m75945x2fec8307);
                        }
                        jx3.f.INSTANCE.mo68477x336bdfd8(1264L, 1L, 1L, false);
                    } else if (m75939xb282bd08 != -4006) {
                        dVar.e(4, m75939xb282bd08, m75945x2fec8307);
                    } else {
                        if (m75945x2fec8307 != null) {
                            dVar.m(m75945x2fec8307);
                        }
                        jx3.f.INSTANCE.mo68477x336bdfd8(1264L, 0L, 1L, false);
                    }
                }
            }
        }
    }

    public final java.util.List K() {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f309731h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderOplogResponse");
        java.util.LinkedList m75941xfb821914 = ((r45.sn2) fVar).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getRetList(...)");
        return m75941xfb821914;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309732i = u0Var;
        return mo9409x10f9447a(sVar, this.f309731h, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3870;
    }

    @Override // az2.u, cz2.j
    public cz2.f v() {
        return cz2.f.f306536e;
    }

    @Override // az2.u, cz2.j
    public org.json.JSONObject w() {
        return this.f309734n;
    }

    @Override // az2.u, cz2.j
    public org.json.JSONObject z() {
        return this.f309733m;
    }
}
