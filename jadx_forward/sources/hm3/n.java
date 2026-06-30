package hm3;

/* loaded from: classes.dex */
public final class n extends hm3.a {

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f363803i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f363804m;

    /* renamed from: n, reason: collision with root package name */
    public r45.d71 f363805n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String finderUserName, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        super(0, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 3965;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetlikedlist";
        lVar.f152197a = new r45.c71();
        lVar.f152198b = new r45.d71();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f363804m = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListRequest");
        r45.c71 c71Var = (r45.c71) fVar;
        c71Var.set(1, 0L);
        c71Var.set(2, finderUserName);
        c71Var.set(3, gVar);
        c71Var.set(5, "");
        c71Var.set(6, 0);
        r45.kv0 kv0Var = new r45.kv0();
        kv0Var.set(1, 93);
        c71Var.set(4, kv0Var);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f363803i = callback;
        return mo9409x10f9447a(dispatcher, this.f363804m, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3965;
    }

    @Override // hm3.a, com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        super.mo804x5f9cdc6f(i17, i18, i19, str, v0Var, bArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.NetSceneMusicMvGetFinderLikeFeed", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f363803i;
            if (u0Var != null) {
                u0Var.mo815x76e0bfae(i18, i19, str, this);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f363804m.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListResponse");
        this.f363805n = (r45.d71) fVar;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = this.f363803i;
        if (u0Var2 != null) {
            u0Var2.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
