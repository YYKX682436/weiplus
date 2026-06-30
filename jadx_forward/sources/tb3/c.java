package tb3;

/* loaded from: classes9.dex */
public class c extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f498518d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f498519e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zn0 f498520f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f498521g;

    /* renamed from: h, reason: collision with root package name */
    public int f498522h;

    /* renamed from: i, reason: collision with root package name */
    public int f498523i;

    /* renamed from: m, reason: collision with root package name */
    public int f498524m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f498525n;

    /* renamed from: o, reason: collision with root package name */
    public int f498526o;

    /* renamed from: p, reason: collision with root package name */
    public r45.lj5 f498527p;

    /* renamed from: q, reason: collision with root package name */
    public int f498528q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f498529r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f498530s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f498531t;

    /* renamed from: u, reason: collision with root package name */
    public int f498532u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f498533v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f498534w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f498535x;

    public c(java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.yn0();
        lVar.f152198b = new r45.zn0();
        lVar.f152200d = 1997;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        lVar.f152199c = "/cgi-bin/mmpay-bin/ftfhb/ffopenwxhb";
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f498518d = a17;
        r45.yn0 yn0Var = (r45.yn0) a17.f152243a.f152217a;
        yn0Var.f472766d = str;
        yn0Var.f472774o = gVar;
        r45.r1 c17 = at4.g0.c();
        if (c17 != null) {
            yn0Var.f472767e = c17.f465941e;
            yn0Var.f472768f = c17.f465940d;
            yn0Var.f472769g = c17.f465945i;
            yn0Var.f472770h = c17.f465946m;
            yn0Var.f472771i = c17.f465944h;
            yn0Var.f472772m = c17.f465942f;
            yn0Var.f472773n = c17.f465943g;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f498519e = u0Var;
        return mo9409x10f9447a(sVar, this.f498518d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1997;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        this.f498520f = (r45.zn0) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NetSceneF2FLuckyMoneyOpen", "errType %d, retCode %d, retMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f498520f.f473752d), this.f498520f.f473753e);
        r45.zn0 zn0Var = this.f498520f;
        this.f498521g = zn0Var.f473755g;
        this.f498522h = zn0Var.f473756h;
        this.f498524m = zn0Var.f473757i;
        this.f498523i = zn0Var.f473754f;
        this.f498525n = zn0Var.f473758m;
        this.f498526o = zn0Var.f473759n;
        this.f498527p = zn0Var.f473760o;
        this.f498528q = zn0Var.f473761p;
        this.f498529r = zn0Var.f473762q;
        this.f498530s = zn0Var.f473763r;
        this.f498531t = zn0Var.f473764s;
        this.f498532u = zn0Var.f473765t;
        this.f498533v = zn0Var.f473766u;
        this.f498534w = zn0Var.f473767v;
        this.f498535x = zn0Var.f473769x;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f498519e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, zn0Var.f473752d, zn0Var.f473753e, this);
        }
    }
}
