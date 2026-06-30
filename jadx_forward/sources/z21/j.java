package z21;

/* loaded from: classes9.dex */
public class j extends z21.a implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f551139d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f551140e;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f551143h;

    /* renamed from: i, reason: collision with root package name */
    public final long f551144i;

    /* renamed from: o, reason: collision with root package name */
    public final int f551147o;

    /* renamed from: f, reason: collision with root package name */
    public int f551141f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f551142g = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f551145m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f551146n = false;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String[] f551148p = new java.lang.String[0];

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f551149q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new z21.i(this), true);

    public j(java.lang.String str, int i17) {
        this.f551143h = null;
        this.f551144i = -1L;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f551144i = java.lang.System.currentTimeMillis();
        this.f551143h = str;
        this.f551147o = i17;
    }

    @Override // z21.a
    public int H() {
        return 0;
    }

    @Override // z21.a
    public int I() {
        return this.f551141f;
    }

    @Override // z21.a
    public java.lang.String[] J() {
        return this.f551148p;
    }

    @Override // z21.a
    public long K() {
        return this.f551144i;
    }

    @Override // z21.a
    public java.util.List L() {
        return null;
    }

    @Override // z21.a
    public void M() {
        this.f551146n = true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f551139d = u0Var;
        java.lang.String str = this.f551143h;
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
        fp.k.c();
        int i17 = this.f551142g;
        boolean z17 = this.f551146n;
        if (k17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneVoiceAddr", "read failed :" + str);
            this.f551141f = fp.k.a() + com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54059x396cc171;
            return -1;
        }
        int i18 = (int) (k17 - i17);
        if (i18 > 3960) {
            i18 = 3960;
        } else {
            if (i18 < 3300 && !z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneVoiceAddr", fp.k.c() + " read failed :" + str + "can read:" + i18 + " isfinish:" + this.f551146n);
                this.f551141f = fp.k.a() + com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54059x396cc171;
                return -1;
            }
            if (z17) {
                this.f551145m = true;
            }
        }
        fp.k.c();
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str, this.f551142g, i18);
        if (N == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneVoiceAddr", fp.k.c() + " read failed :" + str + " read:" + i18);
            this.f551141f = fp.k.a() + com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54059x396cc171;
            return -1;
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.c17();
        lVar.f152198b = new r45.d17();
        lVar.f152199c = "/cgi-bin/micromsg-bin/voiceaddr";
        lVar.f152200d = 206;
        lVar.f152201e = 94;
        lVar.f152202f = 1000000094;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f551140e = a17;
        r45.c17 c17Var = (r45.c17) a17.f152243a.f152217a;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(N);
        c17Var.f452757e = cu5Var;
        fp.k.c();
        c17Var.f452757e.f453374f.g();
        int i19 = c17Var.f452757e.f453372d;
        kk.k.g(N);
        kk.k.g(c17Var.f452757e.f453374f.g());
        c17Var.f452756d = (java.lang.String) gm0.j1.u().c().l(2, "");
        c17Var.f452758f = this.f551142g;
        c17Var.f452759g = "" + this.f551144i;
        c17Var.f452760h = this.f551145m ? 1 : 0;
        c17Var.f452761i = 0;
        c17Var.f452762m = 0;
        c17Var.f452763n = 0;
        c17Var.f452764o = 0;
        c17Var.f452765p = this.f551147o;
        return mo9409x10f9447a(sVar, this.f551140e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 206;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        fp.k.c();
        m48024x6b3684de(i17);
        com.p314xaae8f345.mm.p944x882e457a.o oVar = (com.p314xaae8f345.mm.p944x882e457a.o) v0Var;
        r45.c17 c17Var = (r45.c17) oVar.f152243a.f152217a;
        r45.d17 d17Var = (r45.d17) oVar.f152244b.f152233a;
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneVoiceAddr", fp.k.c() + " onGYNetEnd file:" + this.f551143h + " errType:" + i18 + " errCode:" + i19);
            this.f551139d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        fp.k.c();
        int i27 = d17Var.f453527d;
        java.util.LinkedList linkedList = d17Var.f453529f;
        java.util.Objects.toString(linkedList);
        if (c17Var.f452760h != 1) {
            this.f551142g = c17Var.f452758f + c17Var.f452757e.f453372d;
            long j17 = this.f551146n ? 0L : 500L;
            this.f551149q.c(j17, j17);
        } else {
            this.f551148p = new java.lang.String[linkedList.size()];
            for (int i28 = 0; i28 < linkedList.size(); i28++) {
                this.f551148p[i28] = ((r45.du5) linkedList.get(i28)).f454289d;
            }
            this.f551139d.mo815x76e0bfae(i18, i19, str, this);
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
        this.f551139d.mo815x76e0bfae(3, fp.k.a() + com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54059x396cc171, "ecurityCheckError", this);
    }
}
