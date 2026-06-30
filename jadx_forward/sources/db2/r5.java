package db2;

/* loaded from: classes2.dex */
public final class r5 extends az2.v {

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f309675g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309676h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f309677i;

    /* renamed from: m, reason: collision with root package name */
    public int f309678m;

    /* renamed from: n, reason: collision with root package name */
    public final int f309679n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i18, float f17, float f18, r45.xu2 sectionInfo, r45.qt2 qt2Var) {
        super(qt2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sectionInfo, "sectionInfo");
        this.f309677i = "Finder.NetSceneFinderGetRelatedList";
        this.f309679n = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 3688;
        r45.z91 z91Var = new r45.z91();
        z91Var.set(3, 0L);
        z91Var.set(7, "");
        z91Var.set(4, java.lang.Integer.valueOf(i17));
        z91Var.set(5, java.lang.Float.valueOf(f17));
        z91Var.set(6, java.lang.Float.valueOf(f18));
        z91Var.set(2, gVar);
        db2.t4 t4Var = db2.t4.f309704a;
        z91Var.set(1, t4Var.b(3688, this.f97687d));
        z91Var.set(9, java.lang.Integer.valueOf(i18));
        z91Var.set(11, sectionInfo);
        z91Var.set(14, t4Var.n());
        db2.t4.i(t4Var, (r45.kv0) z91Var.m75936x14adae67(1), kz5.b0.c(new jz5.l(java.lang.Integer.valueOf(i18), 0L)), null, 4, null);
        lVar.f152197a = z91Var;
        lVar.f152198b = new r45.aa1();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetrelatedlist";
        this.f309675g = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderGetRelatedList", "NetSceneFinderGetRelatedList feedId 0 tabType " + i17 + " category  lastBuffer " + gVar);
    }

    @Override // az2.v, az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        super.J(i17, i18, i19, str, v0Var, bArr);
        java.lang.String str2 = this.f309677i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "feedId 0 tabType=" + this.f309679n + ", " + hc2.o0.k(M()));
            java.util.Iterator it = M().iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).cl((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next(), this.f97687d);
            }
            com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f309675g;
            if (oVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rr");
                throw null;
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            if (fVar instanceof r45.aa1) {
                yr2.a aVar = yr2.a.f546192a;
                r45.aa1 aa1Var = (r45.aa1) fVar;
                r45.sq2 sq2Var = (r45.sq2) aa1Var.m75936x14adae67(5);
                java.util.LinkedList m75941xfb821914 = aa1Var.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
                aVar.b(sq2Var, m75941xfb821914, 3688);
                dq.b b17 = cq.k1.b();
                r45.rf6 rf6Var = (r45.rf6) aa1Var.m75936x14adae67(22);
                b17.d(rf6Var != null ? rf6Var.m75939xb282bd08(0) : 0, str2);
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309676h;
        if (u0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // az2.v
    public java.util.List K(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f309675g;
        if (oVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rr");
            throw null;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetRelatedListResp");
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914 = ((r45.aa1) fVar).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
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
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f309675g;
        if (oVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rr");
            throw null;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetRelatedListReq");
        r45.kv0 kv0Var = (r45.kv0) ((r45.z91) fVar).m75936x14adae67(1);
        if (kv0Var != null) {
            return kv0Var.m75942xfb822ef2(5);
        }
        return 0L;
    }

    public final java.util.LinkedList M() {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f309675g;
        if (oVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rr");
            throw null;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetRelatedListResp");
        java.util.LinkedList m75941xfb821914 = ((r45.aa1) fVar).m75941xfb821914(1);
        return m75941xfb821914 == null ? new java.util.LinkedList() : m75941xfb821914;
    }

    public final boolean N() {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f309675g;
        if (oVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rr");
            throw null;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetRelatedListResp");
        return ((r45.aa1) fVar).m75939xb282bd08(3) != 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309676h = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f309675g;
        if (oVar != null) {
            return mo9409x10f9447a(sVar, oVar, this);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rr");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3688;
    }
}
