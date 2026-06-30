package db2;

/* loaded from: classes2.dex */
public final class o5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309639g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309640h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f309641i;

    public o5(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        super(null, 1, null);
        this.f309641i = "Finder.NetSceneFinderGetFollowList";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 713;
        r45.k61 k61Var = new r45.k61();
        k61Var.set(1, gVar);
        k61Var.set(3, db2.t4.f309704a.a(713));
        lVar.f152197a = k61Var;
        lVar.f152198b = new r45.l61();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetfollowlist";
        this.f309639g = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderGetFollowList", "NetSceneFinderGetFollowList init ");
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.String str2 = this.f309641i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        if (i18 == 0 && i19 == 0) {
            jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 7L, 1L, false);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(1279L, 8L, 1L, false);
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f309639g;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowListRequest");
        if (((r45.k61) fVar).m75934xbce7f2f(1) == null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FOLLOW_COUNT_INT_SYNC;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowListResponse");
            c17.x(u3Var, java.lang.Integer.valueOf(((r45.l61) fVar2).m75939xb282bd08(4)));
        }
        java.util.LinkedList K = K();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("firstPage ");
        sb6.append(L() == null);
        sb6.append(", get ");
        sb6.append(K.size());
        sb6.append(" follow contact ");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        java.util.Iterator it = K.iterator();
        while (it.hasNext()) {
            ya2.h.f542017a.j((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) it.next());
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309640h;
        if (u0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    public final java.util.LinkedList K() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f309639g.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowListResponse");
        java.util.LinkedList m75941xfb821914 = ((r45.l61) fVar).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getContactList(...)");
        return m75941xfb821914;
    }

    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g L() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f309639g.f152244b.f152233a;
        r45.l61 l61Var = fVar instanceof r45.l61 ? (r45.l61) fVar : null;
        if (l61Var != null) {
            return l61Var.m75934xbce7f2f(2);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309640h = u0Var;
        return mo9409x10f9447a(sVar, this.f309639g, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 713;
    }
}
