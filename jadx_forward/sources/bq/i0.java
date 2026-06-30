package bq;

/* loaded from: classes.dex */
public final class i0 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public int f105023o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String finderUserName, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var, long j17, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(qt2Var);
        j17 = (i18 & 8) != 0 ? 0L : j17;
        i17 = (i18 & 16) != 0 ? 0 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        r45.w51 w51Var = new r45.w51();
        w51Var.set(3, gVar);
        db2.t4 t4Var = db2.t4.f309704a;
        w51Var.set(1, t4Var.b(3966, qt2Var));
        w51Var.set(2, finderUserName);
        w51Var.set(4, java.lang.Integer.valueOf(i17));
        w51Var.set(6, java.lang.Long.valueOf(j17));
        w51Var.set(5, t4Var.n());
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = w51Var;
        lVar.f152200d = 3966;
        lVar.f152198b = new r45.x51();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetfavlist";
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.x51 resp = (r45.x51) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = this.f152179f.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListRequest");
        r45.w51 w51Var = (r45.w51) fVar2;
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
        r45.kv0 kv0Var = (r45.kv0) w51Var.m75936x14adae67(1);
        cq.j1.a(kVar, oVar, arrayList, kv0Var != null ? kv0Var.m75942xfb822ef2(5) : 0L, false, this.f105016m);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGetFavFeedCgi", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("server increatment size:");
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = this.f152179f.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListResponse");
        sb6.append(((r45.x51) fVar3).m75941xfb821914(1).size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGetFavFeedCgi", sb6.toString());
    }
}
