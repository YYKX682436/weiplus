package db2;

/* loaded from: classes2.dex */
public final class s3 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f309683t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f309684u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.kx2 f309685v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(java.util.LinkedList feedIdList, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedIdList, "feedIdList");
        this.f309683t = feedIdList;
        this.f309684u = gVar;
        r45.kx2 kx2Var = new r45.kx2();
        this.f309685v = kx2Var;
        kx2Var.set(2, gVar);
        jz5.l P6 = ((ey2.k0) pf5.u.f435469a.e(c61.l7.class).a(ey2.k0.class)).P6();
        kx2Var.set(3, java.lang.Float.valueOf(((java.lang.Number) P6.f384366d).floatValue()));
        kx2Var.set(4, java.lang.Float.valueOf(((java.lang.Number) P6.f384367e).floatValue()));
        kx2Var.set(5, db2.t4.f309704a.n());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = feedIdList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next();
            r45.zw2 zw2Var = new r45.zw2();
            zw2Var.set(0, java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()));
            zw2Var.set(1, c19792x256d2725.m76829x97edf6c0());
            linkedList.add(zw2Var);
        }
        kx2Var.set(6, linkedList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderStreamReRank", "initCommReqResp feedIds=" + kz5.n0.g0(this.f309683t, ";", null, null, 0, null, db2.p3.f309651d, 30, null) + ", lastBuffer=" + this.f309684u);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = this.f309685v;
        r45.lx2 lx2Var = new r45.lx2();
        lx2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) lx2Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = lx2Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderstreamrerank";
        lVar.f152200d = 19525;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.lx2 resp = (r45.lx2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCgiEnd: errType ");
        sb6.append(i17);
        sb6.append(", errCode ");
        sb6.append(i18);
        sb6.append(", errMsg ");
        sb6.append(str);
        sb6.append(", requestFeedIds:");
        java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        sb6.append(kz5.n0.g0(m75941xfb821914, ";", null, null, 0, null, db2.q3.f309660d, 30, null));
        sb6.append(" rerank_last_buffer:");
        sb6.append(resp.m75934xbce7f2f(2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderStreamReRank", sb6.toString());
        if (i17 == 0 && i18 == 0) {
            pm0.v.V(0L, new db2.r3(this, resp));
        }
    }
}
