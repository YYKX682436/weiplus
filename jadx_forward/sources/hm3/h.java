package hm3;

/* loaded from: classes2.dex */
public final class h extends hm3.a {

    /* renamed from: o, reason: collision with root package name */
    public static long f363779o;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f363780i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f363781m;

    /* renamed from: n, reason: collision with root package name */
    public final long f363782n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j17, java.lang.String finderNonceId, boolean z17) {
        super(0, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderNonceId, "finderNonceId");
        long c17 = c01.id.c();
        this.f363782n = c17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 3710;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlike";
        lVar.f152197a = new r45.qd1();
        lVar.f152198b = new r45.rd1();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f363781m = a17;
        long j18 = f363779o;
        if (c17 < j18) {
            f363779o = 1 + j18;
            this.f363782n = j18;
        }
        f363779o = this.f363782n;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLikeRequest");
        r45.qd1 qd1Var = (r45.qd1) fVar;
        qd1Var.set(1, java.lang.Long.valueOf(j17));
        qd1Var.set(2, 0L);
        qd1Var.set(3, java.lang.Integer.valueOf(z17 ? 3 : 4));
        qd1Var.set(4, java.lang.Long.valueOf(this.f363782n));
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        qd1Var.set(11, xy2.c.e(context));
        qd1Var.set(7, 91);
        qd1Var.set(8, finderNonceId);
        qd1Var.set(11, "");
        qd1Var.set(12, 0);
        qd1Var.set(13, 0);
        db2.t4 t4Var = db2.t4.f309704a;
        r45.kv0 a18 = t4Var.a(3710);
        a18.set(1, 91);
        a18.set(3, 1);
        qd1Var.set(9, a18);
        qd1Var.set(10, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(j17, null, 91));
        db2.t4.i(t4Var, (r45.kv0) qd1Var.m75936x14adae67(9), kz5.b0.c(new jz5.l(91, java.lang.Long.valueOf(j17))), null, 4, null);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f363780i = callback;
        return mo9409x10f9447a(dispatcher, this.f363781m, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3710;
    }

    @Override // hm3.a, com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        super.mo804x5f9cdc6f(i17, i18, i19, str, v0Var, bArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.NetSceneMusicMvMVFinderLike", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f363780i;
            if (u0Var != null) {
                u0Var.mo815x76e0bfae(i18, i19, str, this);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f363781m.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLikeResponse");
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = this.f363780i;
        if (u0Var2 != null) {
            u0Var2.mo815x76e0bfae(i18, i19, str, this);
        }
        hz2.d dVar = hz2.d.f367846a;
        dVar.h(i18, i19, str);
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d1i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        dVar.d(i18, i19, string);
        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d1h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        dVar.f(i18, i19, string2);
    }
}
