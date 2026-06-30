package db2;

/* loaded from: classes2.dex */
public final class f6 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f309507g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309508h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309509i;

    /* renamed from: m, reason: collision with root package name */
    public final int f309510m;

    public f6(int i17, int i18, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i19, r45.qt2 qt2Var) {
        super(qt2Var);
        this.f309507g = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.wi2 wi2Var = new r45.wi2();
        lVar.f152197a = wi2Var;
        wi2Var.f470728d = str;
        wi2Var.f470730f = str2 == null ? xy2.c.f(qt2Var) : str2;
        wi2Var.f470732h = i18;
        wi2Var.f470734m = i17;
        if (i17 == 0) {
            wi2Var.f470731g = gVar;
        } else if (i17 == 1) {
            wi2Var.f470735n = gVar;
        } else if (i17 == 3) {
            wi2Var.f470736o = gVar;
        }
        this.f309510m = i19;
        wi2Var.f470729e = db2.t4.f309704a.b(11732, qt2Var);
        lVar.f152198b = new r45.xi2();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findermusicalbumuserpage";
        lVar.f152200d = 11732;
        this.f309509i = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderTingMusicUserPage", "NetSceneFinderTingMusicUserPage init enterType:" + i18 + " actionType:" + i17 + " finderUserName " + str + " finderSelfUserName: " + str2 + " lastBuffer:" + gVar);
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderTingMusicUserPage", "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309508h;
        if (u0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    public final java.util.LinkedList K() {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f309509i.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderMusicAlbumUserPageResponse");
        r45.fc6 fc6Var = ((r45.xi2) fVar).f471666h;
        if (fc6Var != null && (linkedList = fc6Var.f455742e) != null) {
            int i17 = 0;
            for (java.lang.Object obj : linkedList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.dg4 dg4Var = (r45.dg4) obj;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dg4Var);
                linkedList2.add(new ms2.e(dg4Var));
                i17 = i18;
            }
        }
        return linkedList2;
    }

    public final boolean L() {
        r45.i66 i66Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f309509i.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderMusicAlbumUserPageResponse");
        r45.fc6 fc6Var = ((r45.xi2) fVar).f471666h;
        return (fc6Var == null || (i66Var = fc6Var.f455741d) == null || i66Var.f458300d != 1) ? false : true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309508h = u0Var;
        return mo9409x10f9447a(sVar, this.f309509i, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 11732;
    }
}
