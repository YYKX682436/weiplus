package bq;

/* loaded from: classes2.dex */
public final class v0 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f105068o;

    public v0(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i18, float f17, float f18, r45.xu2 xu2Var, r45.qt2 qt2Var) {
        super(qt2Var);
        this.f105068o = i17;
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
        z91Var.set(1, t4Var.b(3688, this.f105016m));
        z91Var.set(9, java.lang.Integer.valueOf(i18));
        z91Var.set(11, xu2Var);
        z91Var.set(14, t4Var.n());
        db2.t4.i(t4Var, (r45.kv0) z91Var.m75936x14adae67(1), kz5.b0.c(new jz5.l(java.lang.Integer.valueOf(i18), 0L)), null, 4, null);
        lVar.f152197a = z91Var;
        lVar.f152198b = new r45.aa1();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetrelatedlist";
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGetRelatedListCGI", "init feedId 0 tabType " + i17 + " lastBuffer " + gVar);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.kv0 kv0Var;
        r45.aa1 resp = (r45.aa1) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGetRelatedListCGI", "processCgiResult errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        cq.k kVar = (cq.k) c17;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f152179f;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb821914 = resp.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 : m75941xfb821914) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.h90 h90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
            arrayList.add(h90Var.a(c19792x256d2725, 0));
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = this.f152179f.f152243a.f152217a;
        r45.z91 z91Var = fVar2 instanceof r45.z91 ? (r45.z91) fVar2 : null;
        cq.j1.a(kVar, oVar, arrayList, (z91Var == null || (kv0Var = (r45.kv0) z91Var.m75936x14adae67(1)) == null) ? 0L : kv0Var.m75942xfb822ef2(5), false, this.f105016m);
        if (i17 == 0 && i18 == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedId 0 tabType=");
            sb6.append(this.f105068o);
            sb6.append(", ");
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = this.f152179f.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetRelatedListResp");
            java.util.LinkedList m75941xfb8219142 = ((r45.aa1) fVar3).m75941xfb821914(1);
            if (m75941xfb8219142 == null) {
                m75941xfb8219142 = new java.util.LinkedList();
            }
            sb6.append(hc2.o0.k(m75941xfb8219142));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGetRelatedListCGI", sb6.toString());
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar4 = this.f152179f.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetRelatedListResp");
            java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725> m75941xfb8219143 = ((r45.aa1) fVar4).m75941xfb821914(1);
            if (m75941xfb8219143 == null) {
                m75941xfb8219143 = new java.util.LinkedList();
            }
            for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject : m75941xfb8219143) {
                i95.m c18 = i95.n0.c(c61.yb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).cl(finderObject, this.f105016m);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar5 = this.f152179f.f152244b.f152233a;
            if (fVar5 instanceof r45.aa1) {
                i95.m c19 = i95.n0.c(c61.yb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                r45.aa1 aa1Var = (r45.aa1) fVar5;
                r45.sq2 sq2Var = (r45.sq2) aa1Var.m75936x14adae67(5);
                java.util.LinkedList m75941xfb8219144 = aa1Var.m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219144, "getObject(...)");
                yr2.a.f546192a.b(sq2Var, m75941xfb8219144, 3688);
                dq.b b17 = cq.k1.b();
                r45.rf6 rf6Var = (r45.rf6) aa1Var.m75936x14adae67(22);
                b17.d(rf6Var != null ? rf6Var.m75939xb282bd08(0) : 0, "Finder.FinderGetRelatedListCGI");
            }
        }
    }
}
