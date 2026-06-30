package db2;

/* loaded from: classes3.dex */
public final class m5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f309606g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f309607h;

    /* renamed from: i, reason: collision with root package name */
    public r45.s82 f309608i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m5(java.lang.String r2, java.lang.String r3, int r4, r45.qt2 r5, int r6, p3321xbce91901.jvm.p3324x21ffc6bd.i r7) {
        /*
            r1 = this;
            r7 = r6 & 4
            if (r7 == 0) goto L5
            r4 = 0
        L5:
            r6 = r6 & 8
            if (r6 == 0) goto La
            r5 = 0
        La:
            java.lang.String r6 = "query"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r6)
            java.lang.String r6 = "offset"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r6)
            r1.<init>(r5)
            r45.s82 r5 = new r45.s82
            r5.<init>()
            r1.f309608i = r5
            com.tencent.mm.modelbase.l r5 = new com.tencent.mm.modelbase.l
            r5.<init>()
            r6 = 4140(0x102c, float:5.801E-42)
            r5.f152200d = r6
            java.lang.String r6 = "/cgi-bin/micromsg-bin/finderlivesearchmoregames"
            r5.f152199c = r6
            r45.r82 r6 = new r45.r82
            r6.<init>()
            android.content.Context r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r0 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r0)
            java.lang.String r7 = xy2.c.e(r7)
            r0 = 1
            r6.set(r0, r7)
            r7 = 2
            r6.set(r7, r2)
            r7 = 3
            r6.set(r7, r3)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r0 = 4
            r6.set(r0, r7)
            com.tencent.mm.plugin.finder.assist.b3 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f183555a
            r45.rm0 r7 = r7.f()
            r0 = 5
            r6.set(r0, r7)
            r5.f152197a = r6
            r45.s82 r6 = new r45.s82
            r6.<init>()
            r5.f152198b = r6
            com.tencent.mm.modelbase.o r5 = r5.a()
            r1.f309606g = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "NetSceneFinderGameSearch init: query = "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = ", offset = "
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = ", scene = "
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            java.lang.String r3 = "Finder.NetSceneFinderGameSearch"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.m5.<init>(java.lang.String, java.lang.String, int, r45.qt2, int, kotlin.jvm.internal.i):void");
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderGameSearch", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f309606g.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveSearchMoreGamesResponse");
        this.f309608i = (r45.s82) fVar;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f309607h;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f309607h = u0Var;
        return mo9409x10f9447a(sVar, this.f309606g, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4140;
    }
}
