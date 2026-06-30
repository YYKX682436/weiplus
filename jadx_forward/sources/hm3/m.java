package hm3;

/* loaded from: classes.dex */
public final class m extends hm3.a {

    /* renamed from: i, reason: collision with root package name */
    public final long f363796i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f363797m;

    /* renamed from: n, reason: collision with root package name */
    public final int f363798n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f363799o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f363800p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f363801q;

    /* renamed from: r, reason: collision with root package name */
    public r45.h51 f363802r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j17, java.lang.String nonceId, int i17, int i18) {
        super(i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        this.f363796i = j17;
        this.f363797m = nonceId;
        this.f363798n = i17;
        java.lang.String str = "MicroMsg.NetSceneMusicMvGetFinderFeedDetail@" + hashCode();
        this.f363799o = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 3763;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetcommentdetail";
        lVar.f152197a = new r45.g51();
        lVar.f152198b = new r45.h51();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f363801q = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetCommentDetailRequest");
        r45.g51 g51Var = (r45.g51) fVar;
        g51Var.set(1, java.lang.Long.valueOf(j17));
        g51Var.set(11, nonceId);
        g51Var.set(3, 1);
        g51Var.set(20, db2.t4.f309704a.n());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "FinderGetCommentDetail feedId:%s, nonceId:%s", java.lang.Long.valueOf(j17), nonceId);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f363800p = callback;
        return mo9409x10f9447a(dispatcher, this.f363801q, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3763;
    }

    @Override // hm3.a, com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        super.mo804x5f9cdc6f(i17, i18, i19, str, v0Var, bArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363799o, "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f363800p;
            if (u0Var != null) {
                u0Var.mo815x76e0bfae(i18, i19, str, this);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f363801q.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetCommentDetailResponse");
        this.f363802r = (r45.h51) fVar;
        r45.h51 h51Var = new r45.h51();
        r45.h51 h51Var2 = this.f363802r;
        h51Var.mo11468x92b714fd(h51Var2 != null ? h51Var2.mo14344x5f01b1f6() : null);
        fm3.y yVar = fm3.y.f345694a;
        java.lang.String nonceId = this.f363797m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("putFinderFeedDetail, feedId:");
        long j17 = this.f363796i;
        sb6.append(j17);
        sb6.append(", nonceId:");
        sb6.append(nonceId);
        sb6.append(", response:");
        sb6.append(h51Var.hashCode());
        sb6.append(",timestamp:");
        sb6.append(elapsedRealtime);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvCgiRetCache", sb6.toString());
        fm3.y.f345695b.put(new fm3.f(j17, nonceId), new fm3.e(h51Var, elapsedRealtime));
        yVar.a(elapsedRealtime);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = this.f363800p;
        if (u0Var2 != null) {
            u0Var2.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
