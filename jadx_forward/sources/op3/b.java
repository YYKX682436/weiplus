package op3;

/* loaded from: classes5.dex */
public class b extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f428783d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f428784e;

    /* renamed from: f, reason: collision with root package name */
    public final android.util.Pair f428785f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6857x603256ba f428786g;

    public b(android.util.Pair pair, java.lang.String str, java.lang.String str2, int i17) {
        r45.kz5 kz5Var = new r45.kz5();
        kz5Var.f460576d = c01.z1.r();
        kz5Var.f460577e = str;
        kz5Var.f460578f = str2;
        kz5Var.f460579g = ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).aj(pair);
        kz5Var.f460580h = i17;
        this.f428785f = pair;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = kz5Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/sendpat";
        lVar.f152200d = 849;
        lVar.f152198b = new r45.lz5();
        this.f428783d = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendPat", "NetSceneSendPat ChatUsername:%s PattedUsername:%s msgPointer:%s", str, str2, pair);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f428784e = u0Var;
        return mo9409x10f9447a(sVar, this.f428783d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 849;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendPat", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f428784e.mo815x76e0bfae(i18, i19, str, this);
    }
}
