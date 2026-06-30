package db2;

/* loaded from: classes2.dex */
public final class e6 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f309494g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309495h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309496i;

    /* renamed from: m, reason: collision with root package name */
    public final int f309497m;

    public e6(int i17, int i18, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i19, r45.qt2 qt2Var) {
        super(qt2Var);
        this.f309494g = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.vu0 vu0Var = new r45.vu0();
        lVar.f152197a = vu0Var;
        vu0Var.f470107e = str;
        vu0Var.f470109g = gVar;
        this.f309497m = i19;
        vu0Var.f470106d = db2.t4.f309704a.b(8460, qt2Var);
        lVar.f152198b = new r45.wu0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderaudiouserpage";
        lVar.f152200d = 8460;
        this.f309496i = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderTingAudioUserPage", "init enterType:" + i18 + " actionType:" + i17 + " finderUserName " + str + " finderSelfUserName: " + str2 + " lastBuffer:" + gVar);
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderTingAudioUserPage", "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309495h;
        if (u0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    public final boolean K() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f309496i.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAudioUserPageResponse");
        return (((r45.wu0) fVar).f471004o & 1) > 0;
    }

    public final boolean L() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f309496i.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAudioUserPageResponse");
        return (((r45.wu0) fVar).f471004o & 2) > 0;
    }

    public final java.util.LinkedList M() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f309496i.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAudioUserPageResponse");
        r45.wu0 wu0Var = (r45.wu0) fVar;
        java.util.LinkedList linkedList2 = wu0Var.f471001i;
        if (linkedList2 != null) {
            int i17 = 0;
            for (java.lang.Object obj : linkedList2) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.ig4 ig4Var = (r45.ig4) obj;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ig4Var);
                linkedList.add(new ms2.c(ig4Var, wu0Var.f471002m));
                i17 = i18;
            }
        }
        return linkedList;
    }

    public final r45.wx0 N() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f309496i.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAudioUserPageResponse");
        return ((r45.wu0) fVar).f471003n;
    }

    public final r45.sd1 O() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f309496i.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAudioUserPageResponse");
        return ((r45.wu0) fVar).f471005p;
    }

    public final boolean P() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f309496i.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAudioUserPageResponse");
        return ((r45.wu0) fVar).f471001i.isEmpty();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309495h = u0Var;
        return mo9409x10f9447a(sVar, this.f309496i, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 8460;
    }
}
