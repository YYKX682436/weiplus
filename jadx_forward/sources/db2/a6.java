package db2;

/* loaded from: classes.dex */
public final class a6 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309433g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309434h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f309435i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f309436m;

    public a6(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.qt2 qt2Var) {
        super(qt2Var);
        this.f309435i = "Finder.NetSceneFinderSnsGetLiveObjectList";
        this.f309436m = new java.util.ArrayList();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 6847;
        r45.nw2 nw2Var = new r45.nw2();
        nw2Var.set(2, gVar);
        nw2Var.set(1, db2.t4.f309704a.b(6847, qt2Var));
        lVar.f152197a = nw2Var;
        lVar.f152198b = new r45.ow2();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findersnsgetliveobjectlist";
        this.f309433g = lVar.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NetSceneFinderSnsGetLiveObjectList pullType:");
        sb6.append(0);
        sb6.append(" lastBuffer:");
        sb6.append(gVar == null ? "null" : com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(gVar.f273689a));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderSnsGetLiveObjectList", sb6.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3 A[LOOP:2: B:24:0x00a1->B:36:0x00d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd A[EDGE_INSN: B:37:0x00dd->B:38:0x00dd BREAK  A[LOOP:2: B:24:0x00a1->B:36:0x00d3], SYNTHETIC] */
    @Override // az2.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J(int r21, int r22, int r23, java.lang.String r24, com.p314xaae8f345.mm.p971x6de15a2e.v0 r25, byte[] r26) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.a6.J(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309434h = u0Var;
        return mo9409x10f9447a(sVar, this.f309433g, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 6847;
    }
}
