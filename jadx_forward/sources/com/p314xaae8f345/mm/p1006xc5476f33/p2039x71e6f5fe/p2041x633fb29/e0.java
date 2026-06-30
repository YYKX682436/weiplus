package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes11.dex */
public class e0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f240408d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f240409e;

    /* renamed from: f, reason: collision with root package name */
    public float f240410f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f240411g;

    /* renamed from: h, reason: collision with root package name */
    public final int f240412h;

    /* renamed from: i, reason: collision with root package name */
    public long f240413i;

    /* renamed from: m, reason: collision with root package name */
    public final int f240414m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f240415n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f240416o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f240417p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f240418q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f240419r;

    /* renamed from: s, reason: collision with root package name */
    public int f240420s;

    /* renamed from: t, reason: collision with root package name */
    public float f240421t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f240422u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f240423v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f240424w;

    public e0(int i17, int i18, java.lang.String str, java.lang.String str2, int i19, int i27) {
        this(0, i17, i18, str, str2, i19, i27);
    }

    public float H() {
        return this.f240417p ? this.f240421t : this.f240410f;
    }

    public java.lang.String I() {
        return this.f240417p ? this.f240423v : ((r45.xv4) this.f240409e.f152244b.f152233a).f472035i;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f240408d = u0Var;
        this.f240413i = java.lang.System.currentTimeMillis();
        return mo9409x10f9447a(sVar, this.f240409e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        if (this.f240414m == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.k1.f33803x366c91de;
        }
        return 294;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.xv4 xv4Var = (r45.xv4) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f240410f = xv4Var.f472033g;
        this.f240411g = xv4Var.f472031e;
        boolean z17 = xv4Var.f472037n;
        this.f240417p = z17;
        if (z17) {
            this.f240418q = xv4Var.f472038o.i();
            this.f240419r = xv4Var.f472039p.i();
            this.f240420s = xv4Var.f472040q;
            this.f240421t = xv4Var.f472041r;
            this.f240422u = xv4Var.f472042s.i();
            this.f240423v = xv4Var.f472043t.i();
            this.f240424w = xv4Var.f472044u.i();
        }
        this.f240408d.mo815x76e0bfae(i18, i19, str, this);
    }

    public e0(int i17, int i18, int i19, java.lang.String str, java.lang.String str2, int i27, int i28) {
        this.f240414m = -1;
        this.f240417p = false;
        this.f240418q = "";
        this.f240419r = "";
        this.f240420s = 0;
        this.f240421t = 0.0f;
        this.f240422u = "";
        this.f240423v = "";
        this.f240424w = "";
        this.f240414m = i17;
        this.f240415n = str;
        this.f240416o = str2;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.wv4 wv4Var = new r45.wv4();
        wv4Var.f471051d = i18;
        wv4Var.f471052e = i19;
        wv4Var.f471057m = str;
        wv4Var.f471058n = str2;
        wv4Var.f471059o = i17;
        wv4Var.f471060p = i27;
        wv4Var.f471061q = i28;
        lVar.f152197a = wv4Var;
        lVar.f152198b = new r45.xv4();
        lVar.f152199c = "/cgi-bin/micromsg-bin/newocrtranslation";
        lVar.f152200d = mo808xfb85f7b0();
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f240409e = lVar.a();
        this.f240412h = i18;
    }
}
