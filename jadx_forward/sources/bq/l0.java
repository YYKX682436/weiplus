package bq;

/* loaded from: classes2.dex */
public final class l0 extends bq.e {
    public l0(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var) {
        super(qt2Var);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.k61 k61Var = new r45.k61();
        k61Var.set(1, gVar);
        k61Var.set(3, db2.t4.f309704a.b(713, qt2Var));
        lVar.f152197a = k61Var;
        r45.l61 l61Var = new r45.l61();
        l61Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) l61Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = l61Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetfollowlist";
        lVar.f152200d = 713;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGetFollowListCGI", "FinderGetFollowListCGI init");
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.l61 resp = (r45.l61) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGetFollowListCGI", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        if (i17 == 0 && i18 == 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 7L, 1L, false);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 8L, 1L, false);
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = this.f152179f.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowListRequest");
        if (((r45.k61) fVar2).m75934xbce7f2f(1) == null) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FOLLOW_COUNT_INT_SYNC, java.lang.Integer.valueOf(resp.m75939xb282bd08(4)));
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = this.f152179f.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowListResponse");
        java.util.LinkedList m75941xfb821914 = ((r45.l61) fVar3).m75941xfb821914(1);
        if (m75941xfb821914 == null) {
            m75941xfb821914 = new java.util.LinkedList();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("firstPage ");
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar4 = this.f152179f.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowListResponse");
        sb6.append(((r45.l61) fVar4).m75934xbce7f2f(2) == null);
        sb6.append(", get ");
        sb6.append(m75941xfb821914.size());
        sb6.append(" follow contact ");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGetFollowListCGI", sb6.toString());
        java.util.Iterator it = m75941xfb821914.iterator();
        while (it.hasNext()) {
            ya2.h.f542017a.j((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) it.next());
        }
    }
}
