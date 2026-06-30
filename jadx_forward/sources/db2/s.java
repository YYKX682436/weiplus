package db2;

/* loaded from: classes.dex */
public final class s extends az2.o {

    /* renamed from: t, reason: collision with root package name */
    public int f309680t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(long j17, java.lang.String nonceId, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.av0 av0Var = new r45.av0();
        db2.t4 t4Var = db2.t4.f309704a;
        av0Var.set(1, t4Var.b(11856, qt2Var));
        jz5.l P6 = ((ey2.k0) pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class)).P6();
        av0Var.set(5, java.lang.Float.valueOf(((java.lang.Number) P6.f384366d).floatValue()));
        av0Var.set(6, java.lang.Float.valueOf(((java.lang.Number) P6.f384367e).floatValue()));
        av0Var.set(10, t4Var.n());
        av0Var.set(3, java.lang.Long.valueOf(j17));
        av0Var.set(7, nonceId);
        av0Var.set(4, java.lang.Integer.valueOf(i17));
        av0Var.set(2, gVar);
        lVar.f152197a = av0Var;
        r45.bv0 bv0Var = new r45.bv0();
        bv0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) bv0Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = bv0Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderauthorsingleflow";
        lVar.f152200d = 11856;
        p(lVar.a());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a.m(1001, true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init feeId:");
        sb6.append(pm0.v.u(j17));
        sb6.append(", displayTabType=");
        sb6.append(i17);
        sb6.append(", lastBuffer=");
        sb6.append(gVar != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderAuthorSingleFlow", sb6.toString());
    }

    @Override // az2.o, az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.bv0 resp = (r45.bv0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        super.A(i17, i18, str, resp, m1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderAuthorSingleFlow", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " resp=" + resp);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206926a;
        v1Var.m(1001, false);
        if (i17 != 0 || i18 != 0) {
            v1Var.w(1001, this.f97668n);
            return;
        }
        v1Var.h(1001, false);
        yr2.a aVar = yr2.a.f546192a;
        r45.sq2 sq2Var = (r45.sq2) resp.m75936x14adae67(5);
        java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        aVar.b(sq2Var, m75941xfb821914, 3688);
        v1Var.a(1001, resp.m75941xfb821914(1).size());
    }

    @Override // az2.o
    public java.util.List C(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.bv0 resp = (r45.bv0) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914 = resp.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb821914) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
            arrayList.add(h90Var.a(c19792x256d2725, 0));
        }
        return arrayList;
    }

    @Override // az2.o
    public long D() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f152179f.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAuthorSingleFlowReq");
        r45.kv0 kv0Var = (r45.kv0) ((r45.av0) fVar).m75936x14adae67(1);
        if (kv0Var != null) {
            return kv0Var.m75942xfb822ef2(5);
        }
        return 0L;
    }
}
