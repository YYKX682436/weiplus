package tb3;

/* loaded from: classes9.dex */
public class e extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f498542d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f498543e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f498544f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f498545g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f498546h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f498547i;

    /* renamed from: m, reason: collision with root package name */
    public int f498548m;

    public e() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ao0();
        lVar.f152198b = new r45.bo0();
        lVar.f152200d = 1990;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152199c = "/cgi-bin/mmpay-bin/ftfhb/ffquerydowxhb";
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f498542d = a17;
        r45.ao0 ao0Var = (r45.ao0) a17.f152243a.f152217a;
        ao0Var.f451698f = java.lang.System.currentTimeMillis() / 1000;
        r45.r1 c17 = at4.g0.c();
        if (c17 != null) {
            ao0Var.f451696d = c17.f465942f;
            ao0Var.f451697e = c17.f465943g;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f498543e = u0Var;
        return mo9409x10f9447a(sVar, this.f498542d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1990;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneF2FLuckyMoneyQuery", "errType %d,errCode %d,errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.bo0 bo0Var = (r45.bo0) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f498544f = bo0Var.f452440f;
        this.f498545g = bo0Var.f452441g;
        this.f498548m = bo0Var.f452442h;
        this.f498546h = bo0Var.f452444m;
        this.f498547i = bo0Var.f452443i;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f498543e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, bo0Var.f452438d, bo0Var.f452439e, this);
        }
    }
}
