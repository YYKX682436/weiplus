package ek2;

/* loaded from: classes.dex */
public final class l3 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f335029g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f335030h;

    public l3(long j17, long j18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17) {
        super(null, 1, null);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 4168;
        r45.a81 a81Var = new r45.a81();
        a81Var.set(1, db2.t4.f309704a.a(4168));
        a81Var.set(3, xy2.c.f(this.f97687d));
        a81Var.set(2, java.lang.Long.valueOf(j17));
        a81Var.set(4, java.lang.Long.valueOf(j18));
        a81Var.set(6, gVar);
        a81Var.set(5, str);
        a81Var.set(7, java.lang.Integer.valueOf(i17));
        lVar.f152197a = a81Var;
        lVar.f152198b = new r45.b81();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetliverewardgains";
        this.f335029g = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderGetLiveReward", "NetSceneFinderGetLiveReward init, finderUsername = " + a81Var.m75945x2fec8307(3) + ", liveId = " + j17 + ", objectId = " + j18 + ", objectNonceId = " + str + ",  lastBuffer = " + gVar + ", reward_type:" + i17);
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneFinderGetLiveReward", "onGYNetEnd, errType:" + i18 + ", errCode:" + i19 + ", errMsg:" + str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f335030h;
        if (u0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    public final java.util.LinkedList K() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f335029g.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRewardGainsResponse");
        java.util.LinkedList m75941xfb821914 = ((r45.b81) fVar).m75941xfb821914(5);
        return m75941xfb821914 == null ? new java.util.LinkedList() : m75941xfb821914;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f335030h = u0Var;
        return mo9409x10f9447a(sVar, this.f335029g, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4168;
    }
}
