package bq;

/* loaded from: classes2.dex */
public final class l0 extends bq.e {
    public l0(com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var) {
        super(qt2Var);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.k61 k61Var = new r45.k61();
        k61Var.set(1, gVar);
        k61Var.set(3, db2.t4.f228171a.b(713, qt2Var));
        lVar.f70664a = k61Var;
        r45.l61 l61Var = new r45.l61();
        l61Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) l61Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = l61Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetfollowlist";
        lVar.f70667d = 713;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("FinderGetFollowListCGI", "FinderGetFollowListCGI init");
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.l61 resp = (r45.l61) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderGetFollowListCGI", "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        if (i17 == 0 && i18 == 0) {
            jx3.f.INSTANCE.idkeyStat(1279L, 7L, 1L, false);
        } else {
            jx3.f.INSTANCE.idkeyStat(1279L, 8L, 1L, false);
        }
        com.tencent.mm.protobuf.f fVar2 = this.f70646f.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowListRequest");
        if (((r45.k61) fVar2).getByteString(1) == null) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_FOLLOW_COUNT_INT_SYNC, java.lang.Integer.valueOf(resp.getInteger(4)));
        }
        com.tencent.mm.protobuf.f fVar3 = this.f70646f.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowListResponse");
        java.util.LinkedList list = ((r45.l61) fVar3).getList(1);
        if (list == null) {
            list = new java.util.LinkedList();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("firstPage ");
        com.tencent.mm.protobuf.f fVar4 = this.f70646f.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowListResponse");
        sb6.append(((r45.l61) fVar4).getByteString(2) == null);
        sb6.append(", get ");
        sb6.append(list.size());
        sb6.append(" follow contact ");
        com.tencent.mars.xlog.Log.i("FinderGetFollowListCGI", sb6.toString());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ya2.h.f460484a.j((com.tencent.mm.protocal.protobuf.FinderContact) it.next());
        }
    }
}
