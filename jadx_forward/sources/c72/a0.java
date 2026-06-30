package c72;

/* loaded from: classes8.dex */
public class a0 extends c72.a implements com.p314xaae8f345.mm.p971x6de15a2e.l0, c72.b {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f121063d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f121064e;

    /* renamed from: f, reason: collision with root package name */
    public long f121065f = -1;

    /* renamed from: g, reason: collision with root package name */
    public float f121066g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f121067h = null;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f121068i = null;

    public a0(int i17, int i18, java.lang.String str, java.lang.String str2, byte[] bArr, r45.ua3 ua3Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.va3();
        lVar.f152198b = new r45.wa3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getbioconfig";
        lVar.f152200d = com.p314xaae8f345.p3085x8ea91595.p3088xaf3f29eb.C26651x338099a8.f55984x5fe5d0c0;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f121064e = a17;
        r45.va3 va3Var = (r45.va3) a17.f152243a.f152217a;
        va3Var.f469558d = 1;
        va3Var.f469559e = i17;
        va3Var.f469562h = i18;
        va3Var.f469563i = str;
        va3Var.f469564m = str2;
        va3Var.f469565n = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
        va3Var.f469566o = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(ua3Var.m75963xebb06ba0());
    }

    @Override // c72.b
    public float b() {
        float f17 = this.f121066g;
        if (f17 <= 0.0f || f17 > 1.0f) {
            this.f121066g = 0.5f;
        }
        return this.f121066g;
    }

    @Override // c72.b
    public byte[] c() {
        return this.f121067h;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f121063d = u0Var;
        return mo9409x10f9447a(sVar, this.f121064e, this);
    }

    @Override // c72.b
    public long g() {
        return this.f121065f;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.p3085x8ea91595.p3088xaf3f29eb.C26651x338099a8.f55984x5fe5d0c0;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.wa3 wa3Var = (r45.wa3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 == 0 && i19 == 0) {
            long j17 = wa3Var.f470538d;
            this.f121065f = j17;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = wa3Var.f470539e;
            if (gVar != null) {
                this.f121067h = gVar.f273689a;
            }
            this.f121066g = wa3Var.f470543i;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = wa3Var.f470542h;
            if (gVar2 != null) {
                this.f121068i = gVar2.f273689a;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetBioConfig", "carson logic bioId:%s Config is:%s ratio:%s", java.lang.Long.valueOf(j17), this.f121067h, java.lang.Float.valueOf(this.f121066g));
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f121063d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // c72.b
    public byte[] p() {
        return this.f121068i;
    }
}
