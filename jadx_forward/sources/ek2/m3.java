package ek2;

/* loaded from: classes.dex */
public final class m3 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f335038g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f335039h;

    /* renamed from: i, reason: collision with root package name */
    public int f335040i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(int i17, long j17, long j18, java.lang.String objectNonceId, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectNonceId, "objectNonceId");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 22440;
        r45.gu1 gu1Var = new r45.gu1();
        gu1Var.set(3, java.lang.Integer.valueOf(i17));
        gu1Var.set(1, db2.t4.f309704a.a(22440));
        gu1Var.set(2, xy2.c.f(this.f97687d));
        gu1Var.set(4, java.lang.Long.valueOf(j17));
        gu1Var.set(5, java.lang.Long.valueOf(j18));
        gu1Var.set(7, gVar);
        gu1Var.set(6, objectNonceId);
        lVar.f152197a = gu1Var;
        lVar.f152198b = new r45.hu1();
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetprizehistory";
        this.f335038g = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneFinderLiveLotteryHistory", "NetSceneFinderLiveLotteryHistory init, finderUsername = " + gu1Var.m75945x2fec8307(2) + ", liveId = " + j17 + ", objectId = " + j18 + ", objectNonceId = " + objectNonceId + ", scene = " + i17 + ",  lastBuffer = " + gVar);
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneFinderLiveLotteryHistory", "onGYNetEnd, errType:" + i18 + ", errCode:" + i19 + ", errMsg:" + str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f335039h;
        if (u0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f335039h = u0Var;
        return mo9409x10f9447a(sVar, this.f335038g, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 22440;
    }
}
