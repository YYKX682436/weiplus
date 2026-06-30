package ig4;

/* loaded from: classes9.dex */
public class c extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372985d;

    /* renamed from: e, reason: collision with root package name */
    public r45.e17 f372986e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zu6 f372987f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372988g;

    /* renamed from: h, reason: collision with root package name */
    public int f372989h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f372990i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f372991m;

    /* renamed from: n, reason: collision with root package name */
    public long f372992n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f372993o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f372994p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f372995q;

    public c(ig4.c cVar) {
        this.f372985d = cVar.f372985d;
        this.f372986e = cVar.f372986e;
        this.f372987f = cVar.f372987f;
        this.f372988g = cVar.f372988g;
        this.f372989h = cVar.f372989h;
        this.f372990i = cVar.f372990i;
        this.f372991m = cVar.f372991m;
        H();
    }

    public final void H() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.av6();
        lVar.f152198b = new r45.bv6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/uploadvoicefortrans";
        lVar.f152200d = 547;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f372994p = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f372995q = u0Var;
        if (!((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f372988g) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f372985d) || this.f372987f == null || this.f372986e == null) ? false : true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVoiceForTrans", "doScene: Value not Valid, so, do nothing.");
            return -1;
        }
        r45.av6 av6Var = (r45.av6) this.f372994p.f152243a.f152217a;
        av6Var.f451814d = this.f372985d;
        av6Var.f451815e = this.f372986e;
        r45.zu6 zu6Var = this.f372987f;
        av6Var.f451816f = zu6Var;
        java.lang.String str = this.f372988g;
        int i17 = zu6Var.f473912e;
        int i18 = zu6Var.f473913f;
        r45.cu5 cu5Var = new r45.cu5();
        w21.t d17 = ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Bi(pt0.f0.f2(this.f372993o, this.f372992n), str).d(i17, i18);
        if (d17 != null) {
            cu5Var = x51.j1.a(d17.f523997a);
        }
        av6Var.f451817g = cu5Var;
        av6Var.f451818h = this.f372989h;
        av6Var.f451819i = this.f372990i;
        av6Var.f451820m = this.f372991m;
        return mo9409x10f9447a(sVar, this.f372994p, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 547;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.zu6 zu6Var = this.f372987f;
        if (zu6Var != null) {
            int i27 = zu6Var.f473913f;
        }
        if (i18 == 0 && i19 == 0) {
            this.f372987f = ((r45.bv6) this.f372994p.f152244b.f152233a).f452620d;
        }
        this.f372995q.mo815x76e0bfae(i18, i19, str, this);
        r45.zu6 zu6Var2 = this.f372987f;
        if (zu6Var2 == null || zu6Var2.f473913f <= 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(zu6Var2 != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVoiceForTrans", "succeeed finish: %B", objArr);
        }
    }

    public c(java.lang.String str, r45.zu6 zu6Var, int i17, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, long j17, java.lang.String str5) {
        iz5.a.g(null, str2 != null);
        this.f372985d = str;
        this.f372987f = zu6Var;
        this.f372986e = ig4.d.a(i17, str2, j17, str5);
        this.f372988g = str2;
        this.f372989h = i18;
        this.f372990i = str3;
        this.f372991m = str4;
        this.f372992n = j17;
        this.f372993o = str5;
        H();
    }
}
