package bq;

/* loaded from: classes.dex */
public final class b0 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public java.util.List f105009o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.LinkedList f105010p;

    public b0(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var, int i18) {
        super(qt2Var);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.w61 w61Var = new r45.w61();
        w61Var.set(1, db2.t4.f309704a.b(11934, qt2Var));
        w61Var.set(3, gVar);
        w61Var.set(2, java.lang.Integer.valueOf(i17));
        w61Var.set(6, java.lang.Integer.valueOf(i18));
        lVar.f152197a = w61Var;
        lVar.f152200d = 11934;
        lVar.f152198b = new r45.x61();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetinteractionedfeedlist";
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGetAllListCgi", "FinderGetAllListCgi, tabFlag: " + i17 + ", itemFlag:" + i18 + ", lastBuffer: " + gVar);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.x61 resp = (r45.x61) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = this.f152179f.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetInteractionedFeedListRequest");
        r45.w61 w61Var = (r45.w61) fVar2;
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
        r45.kv0 kv0Var = (r45.kv0) w61Var.m75936x14adae67(1);
        cq.j1.a(kVar, oVar, arrayList, kv0Var != null ? kv0Var.m75942xfb822ef2(5) : 0L, false, this.f105016m);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGetAllListCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
