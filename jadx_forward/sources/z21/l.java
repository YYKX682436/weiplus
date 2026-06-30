package z21;

/* loaded from: classes9.dex */
public class l extends z21.a implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f551178d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f551179e;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f551183i;

    /* renamed from: m, reason: collision with root package name */
    public final long f551184m;

    /* renamed from: o, reason: collision with root package name */
    public final int f551186o;

    /* renamed from: f, reason: collision with root package name */
    public int f551180f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f551181g = false;

    /* renamed from: h, reason: collision with root package name */
    public int f551182h = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f551185n = false;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String[] f551187p = new java.lang.String[0];

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f551188q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new z21.k(this), true);

    public l(java.lang.String str, int i17) {
        this.f551183i = null;
        this.f551184m = -1L;
        this.f551186o = 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        this.f551184m = sb6.toString().hashCode();
        this.f551183i = str;
        this.f551186o = i17;
    }

    @Override // z21.a
    public int H() {
        return 0;
    }

    @Override // z21.a
    public int I() {
        return this.f551180f;
    }

    @Override // z21.a
    public java.lang.String[] J() {
        return this.f551187p;
    }

    @Override // z21.a
    public long K() {
        return this.f551184m;
    }

    @Override // z21.a
    public java.util.List L() {
        return null;
    }

    @Override // z21.a
    public void M() {
        this.f551181g = true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f551178d = u0Var;
        java.lang.String str = this.f551183i;
        int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(str);
        if (k17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneVoiceInput", "read failed :" + str);
            this.f551180f = fp.k.a() + com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54059x396cc171;
            return -1;
        }
        int i17 = k17 - this.f551182h;
        if (i17 > 3960) {
            i17 = 3960;
        } else {
            if (i17 < 3300 && !this.f551181g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneVoiceInput", fp.k.c() + " read failed :" + str + "can read:" + i17 + " isfinish:" + this.f551181g);
                this.f551180f = fp.k.a() + com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54059x396cc171;
                return -1;
            }
            if (this.f551181g) {
                this.f551185n = true;
            }
        }
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str, this.f551182h, i17);
        if (N == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneVoiceInput", fp.k.c() + " read failed :" + str + " read:" + i17);
            this.f551180f = fp.k.a() + com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54059x396cc171;
            return -1;
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.du6();
        lVar.f152198b = new r45.eu6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/uploadinputvoice";
        lVar.f152200d = 349;
        lVar.f152201e = 158;
        lVar.f152202f = 1000000158;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f551179e = a17;
        r45.du6 du6Var = (r45.du6) a17.f152243a.f152217a;
        du6Var.f454291d = (java.lang.String) gm0.j1.u().c().l(2, "");
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(N);
        du6Var.f454292e = cu5Var;
        fp.k.c();
        du6Var.f454292e.f453374f.g();
        int i18 = du6Var.f454292e.f453372d;
        kk.k.g(N);
        kk.k.g(du6Var.f454292e.f453374f.g());
        du6Var.f454293f = this.f551182h;
        du6Var.f454294g = "" + this.f551184m;
        du6Var.f454295h = this.f551185n ? 1 : 0;
        du6Var.f454296i = 0;
        du6Var.f454297m = 0;
        du6Var.f454298n = this.f551186o;
        du6Var.f454299o = 0;
        return mo9409x10f9447a(sVar, this.f551179e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 349;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        m48024x6b3684de(i17);
        com.p314xaae8f345.mm.p944x882e457a.o oVar = (com.p314xaae8f345.mm.p944x882e457a.o) v0Var;
        r45.du6 du6Var = (r45.du6) oVar.f152243a.f152217a;
        r45.eu6 eu6Var = (r45.eu6) oVar.f152244b.f152233a;
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneVoiceInput", fp.k.c() + " onGYNetEnd file:" + this.f551183i + " errType:" + i18 + " errCode:" + i19);
            this.f551178d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        fp.k.c();
        int i27 = eu6Var.f455268d;
        if (du6Var.f454295h != 1) {
            this.f551182h = du6Var.f454293f + du6Var.f454292e.f453372d;
            long j17 = this.f551181g ? 0L : 500L;
            this.f551188q.c(j17, j17);
        } else {
            r45.cu5 cu5Var = eu6Var.f455269e;
            if (cu5Var != null && (gVar = cu5Var.f453374f) != null) {
                this.f551187p = new java.lang.String[]{gVar.i()};
            }
            this.f551178d.mo815x76e0bfae(i18, i19, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 20;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: setSecurityCheckError */
    public void mo14485xb35c0942(com.p314xaae8f345.mm.p944x882e457a.n1 n1Var) {
        this.f551178d.mo815x76e0bfae(3, fp.k.a() + com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54059x396cc171, "ecurityCheckError", this);
    }
}
