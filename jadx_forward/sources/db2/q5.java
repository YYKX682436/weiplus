package db2;

/* loaded from: classes2.dex */
public final class q5 extends az2.v {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309661g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309662h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f309663i;

    /* renamed from: m, reason: collision with root package name */
    public r45.y71 f309664m;

    /* renamed from: n, reason: collision with root package name */
    public int f309665n;

    /* renamed from: o, reason: collision with root package name */
    public int f309666o;

    /* renamed from: p, reason: collision with root package name */
    public final long f309667p;

    /* renamed from: q, reason: collision with root package name */
    public int f309668q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f309669r;

    /* renamed from: s, reason: collision with root package name */
    public final org.json.JSONObject f309670s;

    /* renamed from: t, reason: collision with root package name */
    public final org.json.JSONObject f309671t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(long j17, java.lang.String nonceId, java.lang.String sessionBuffer, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, float f17, float f18, r45.kv0 baseRequest, r45.kd1 kd1Var, r45.qt2 contextObj, r45.gy0 gy0Var, java.util.LinkedList linkedList, int i18, r45.o72 o72Var, r45.q92 q92Var, int i19) {
        super(contextObj);
        java.lang.String m75945x2fec8307;
        r45.k30 k30Var;
        java.lang.String m75945x2fec83072;
        r45.nm1 nm1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionBuffer, "sessionBuffer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseRequest, "baseRequest");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        this.f309663i = "NetSceneFinderGetLiveRelatedList";
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.f309670s = jSONObject;
        this.f309671t = new org.json.JSONObject();
        this.f309667p = j17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 6479;
        this.f309664m = new r45.y71();
        N().set(3, java.lang.Long.valueOf(j17));
        N().set(4, nonceId);
        N().set(5, java.lang.Float.valueOf(f17));
        N().set(6, java.lang.Float.valueOf(f18));
        N().set(2, gVar);
        N().set(10, sessionBuffer);
        N().set(1, baseRequest);
        N().set(23, java.lang.Integer.valueOf(i19));
        N().set(7, java.lang.Integer.valueOf(i17));
        N().set(11, kd1Var);
        N().set(14, gy0Var);
        N().set(16, java.lang.Integer.valueOf(this.f309666o));
        r45.y71 N = N();
        zl2.q4 q4Var = zl2.q4.f555466a;
        N.set(17, q4Var.b());
        N().set(18, linkedList);
        N().set(19, java.lang.Integer.valueOf(i18));
        N().set(8, db2.t4.f309704a.n());
        N().set(9, zl2.q4.d(q4Var, null, new java.util.LinkedList(((b92.m2) ((zy2.n8) i95.n0.c(zy2.n8.class))).wi("FinderGetLiveRelated")), 1, null));
        N().set(24, o72Var);
        java.util.LinkedList m75941xfb821914 = q92Var != null ? q92Var.m75941xfb821914(0) : null;
        if (!(m75941xfb821914 == null || m75941xfb821914.isEmpty())) {
            N().set(20, q92Var != null ? q92Var.m75941xfb821914(0) : null);
            N().set(21, q92Var != null ? q92Var.m75934xbce7f2f(1) : null);
            N().set(22, q92Var != null ? q92Var.m75934xbce7f2f(2) : null);
        }
        lVar.f152197a = N();
        lVar.f152198b = new r45.z71();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetliverelatedlist";
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f309661g = a17;
        if (this.f309668q == 3) {
            a17.m47986x306cfea3(true);
        }
        jSONObject.put("object_id", j17);
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("realInit feedId ");
        sb6.append(j17);
        sb6.append("  category  lastBuffer relScene:");
        sb6.append(i17);
        sb6.append(' ');
        sb6.append(gVar);
        sb6.append(" tab_tips_path=");
        sb6.append(kd1Var != null ? kd1Var.m75945x2fec8307(3) : null);
        sb6.append("  tabTipsByPassInfo=");
        sb6.append((kd1Var != null ? kd1Var.m75934xbce7f2f(2) : null) != null);
        sb6.append(" objectId=");
        sb6.append(kd1Var != null ? java.lang.Long.valueOf(kd1Var.m75942xfb822ef2(0)) : null);
        sb6.append(" isUserCmd=");
        sb6.append(a17.mo47974xd4193e2f());
        sb6.append(" pullType:");
        sb6.append(N().m75939xb282bd08(16));
        sb6.append(" speed=");
        r45.om1 om1Var = (r45.om1) N().m75936x14adae67(17);
        sb6.append((om1Var == null || (nm1Var = (r45.nm1) om1Var.m75936x14adae67(0)) == null) ? null : java.lang.Integer.valueOf(nm1Var.m75939xb282bd08(0)));
        sb6.append(" readStatSize:");
        sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
        sb6.append(" cur_object_index:");
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneFinderGetLiveRelatedList", sb6.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneFinderGetLiveRelatedList", "refObjectId:".concat(pm0.v.u(o72Var != null ? o72Var.m75942xfb822ef2(9) : 0L)));
        java.lang.String str = "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneFinderGetLiveRelatedList", "ref_comment_scene:".concat((o72Var == null || (k30Var = (r45.k30) o72Var.m75936x14adae67(16)) == null || (m75945x2fec83072 = k30Var.m75945x2fec8307(2)) == null) ? "" : m75945x2fec83072));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("comm_by_pass:");
        sb7.append(gy0Var != null ? java.lang.Integer.valueOf(gy0Var.m75939xb282bd08(0)) : null);
        sb7.append(", ");
        sb7.append(gy0Var != null ? gy0Var.m75934xbce7f2f(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneFinderGetLiveRelatedList", sb7.toString());
        if (o72Var != null && (m75945x2fec8307 = o72Var.m75945x2fec8307(5)) != null) {
            str = m75945x2fec8307;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneFinderGetLiveRelatedList", "chnl_expose_type:".concat(str));
    }

    @Override // az2.u
    public java.util.List H() {
        return kz5.b0.c(new jz5.l("pull_type", java.lang.String.valueOf(N().m75939xb282bd08(16))));
    }

    @Override // az2.v, az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        super.J(i17, i18, i19, str, v0Var, bArr);
        java.lang.String str2 = hashCode() + " errType " + i18 + ", errCode " + i19 + ", errMsg " + str + ", pullType:" + this.f309666o;
        java.lang.String str3 = this.f309663i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "feedId " + this.f309667p + ", " + hc2.o0.k(M()));
            this.f309671t.put("count", M().size());
            com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f309661g;
            if (oVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rr");
                throw null;
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRelatedListResponse");
            if (((r45.z71) fVar).m75933x41a8a7f2(7)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "setHasShowFinderLoadMoreScrollFlag now");
                zl2.q4 q4Var = zl2.q4.f555466a;
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_HAS_SHOW_LIVE_GUIDE_SERVER_FLAG_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309662h;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // az2.v
    public java.util.List K(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f309661g;
        if (oVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rr");
            throw null;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRelatedListResponse");
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914 = ((r45.z71) fVar).m75941xfb821914(1);
        if (m75941xfb821914 == null) {
            return kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb821914) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
            arrayList.add(h90Var.a(c19792x256d2725, 0));
        }
        return arrayList;
    }

    @Override // az2.v
    public long L() {
        r45.kv0 kv0Var = (r45.kv0) N().m75936x14adae67(1);
        if (kv0Var != null) {
            return kv0Var.m75942xfb822ef2(5);
        }
        return 0L;
    }

    public final java.util.LinkedList M() {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f309661g;
        if (oVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rr");
            throw null;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRelatedListResponse");
        java.util.LinkedList m75941xfb821914 = ((r45.z71) fVar).m75941xfb821914(1);
        return m75941xfb821914 == null ? new java.util.LinkedList() : m75941xfb821914;
    }

    public final r45.y71 N() {
        r45.y71 y71Var = this.f309664m;
        if (y71Var != null) {
            return y71Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("request");
        throw null;
    }

    public final void O(int i17) {
        this.f309666o = i17;
        N().set(16, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309663i, hashCode() + " setReqPullType " + i17);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309662h = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f309661g;
        if (oVar != null) {
            return mo9409x10f9447a(sVar, oVar, this);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rr");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 6479;
    }

    @Override // az2.u, cz2.j
    public cz2.f v() {
        return cz2.f.f306536e;
    }

    @Override // az2.u, cz2.j
    public org.json.JSONObject w() {
        return this.f309670s;
    }

    @Override // az2.u, cz2.j
    public org.json.JSONObject z() {
        return this.f309671t;
    }
}
