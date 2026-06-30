package tb3;

/* loaded from: classes2.dex */
public class b extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f498514d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f498515e;

    /* renamed from: f, reason: collision with root package name */
    public int f498516f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f498517g;

    public b(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152197a = new r45.wn0();
        lVar.f152198b = new r45.xn0();
        lVar.f152200d = 1971;
        lVar.f152199c = "/cgi-bin/mmpay-bin/ftfhb/ffwxhbinvalidateshareurl";
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f498514d = a17;
        r45.wn0 wn0Var = (r45.wn0) a17.f152243a.f152217a;
        r45.r1 c17 = at4.g0.c();
        if (c17 != null) {
            wn0Var.f470841e = c17.f465942f;
            wn0Var.f470842f = c17.f465943g;
        }
        wn0Var.f470840d = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f498515e = u0Var;
        return mo9409x10f9447a(sVar, this.f498514d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1971;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(" NetSceneF2FLuckyMoneyInvalid", "errType %d,errCode %d,errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.xn0 xn0Var = (r45.xn0) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        int i27 = xn0Var.f471782d;
        this.f498516f = i27;
        java.lang.String str2 = xn0Var.f471783e;
        this.f498517g = str2;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f498515e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i27, str2, this);
        }
    }
}
