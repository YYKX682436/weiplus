package tb3;

/* loaded from: classes8.dex */
public class d extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.t {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f498536d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f498537e;

    /* renamed from: f, reason: collision with root package name */
    public r45.do0 f498538f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f498539g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f498540h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f498541i;

    public d(int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.co0();
        lVar.f152198b = new r45.do0();
        lVar.f152200d = 1970;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152199c = "/cgi-bin/mmpay-bin/ftfhb/ffrequestwxhb";
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f498536d = a17;
        r45.co0 co0Var = (r45.co0) a17.f152243a.f152217a;
        co0Var.f453212d = i17;
        co0Var.f453213e = i18;
        co0Var.f453214f = i19;
        co0Var.f453215g = i27;
        r45.r1 c17 = at4.g0.c();
        if (c17 != null) {
            co0Var.f453216h = c17.f465942f;
            co0Var.f453217i = c17.f465943g;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f498537e = u0Var;
        return mo9409x10f9447a(sVar, this.f498536d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1970;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneF2FLuckyMoneyPrepare", "errType %d,errCode %d,errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.do0 do0Var = (r45.do0) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f498538f = do0Var;
        this.f498539g = do0Var.f454146g;
        this.f498540h = do0Var.f454145f;
        this.f498541i = do0Var.f454147h;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f498537e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
