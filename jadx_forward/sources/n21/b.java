package n21;

/* loaded from: classes12.dex */
public class b extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f415771d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f415772e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f415773f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f415774g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f415775h;

    /* renamed from: i, reason: collision with root package name */
    public final int f415776i;

    /* renamed from: m, reason: collision with root package name */
    public final int f415777m;

    /* renamed from: n, reason: collision with root package name */
    public final int f415778n;

    /* renamed from: p, reason: collision with root package name */
    public final int f415780p;

    /* renamed from: o, reason: collision with root package name */
    public int f415779o = 0;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f415781q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new n21.a(this), true);

    public b(java.lang.String str, int i17, int i18, int i19, int i27) {
        this.f415773f = null;
        this.f415774g = null;
        this.f415775h = null;
        this.f415776i = 0;
        this.f415777m = 0;
        this.f415778n = 0;
        this.f415780p = 5;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        this.f415773f = sb6.toString();
        this.f415775h = str;
        this.f415780p = i17;
        this.f415776i = i18;
        this.f415777m = i19;
        this.f415778n = i27;
        this.f415774g = kk.k.g(com.p314xaae8f345.mm.vfs.w6.N(str, 0, (int) com.p314xaae8f345.mm.vfs.w6.k(str)));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f415771d = u0Var;
        java.lang.String str = this.f415775h;
        int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(str);
        fp.k.c();
        int i17 = this.f415779o;
        if (k17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadMedia", "read failed :" + str);
            return -1;
        }
        int i18 = k17 - i17;
        if (i18 > 3960) {
            i18 = 3960;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadMedia", fp.k.c() + " read file:" + str + " filelen:" + k17 + " oldoff:" + this.f415779o + "  canReadLen " + i18);
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str, this.f415779o, i18);
        if (N == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadMedia", "read data error");
            return -1;
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.hu6();
        lVar.f152198b = new r45.iu6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmuploadmedia";
        lVar.f152200d = 240;
        lVar.f152201e = 111;
        lVar.f152202f = 1000000111;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f415772e = a17;
        r45.hu6 hu6Var = (r45.hu6) a17.f152243a.f152217a;
        r45.du5 du5Var = new r45.du5();
        du5Var.f454289d = this.f415773f;
        du5Var.f454290e = true;
        hu6Var.f457987d = du5Var;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(N);
        hu6Var.f457992i = cu5Var;
        hu6Var.f457991h = N.length;
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.f454289d = this.f415774g;
        du5Var2.f454290e = true;
        hu6Var.f457988e = du5Var2;
        hu6Var.f457989f = k17;
        hu6Var.f457990g = this.f415779o;
        hu6Var.f457993m = this.f415780p;
        hu6Var.f457994n = 1;
        hu6Var.f457995o = this.f415776i;
        hu6Var.f457996p = this.f415777m;
        hu6Var.f457997q = this.f415778n;
        return mo9409x10f9447a(sVar, this.f415772e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 240;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        m48024x6b3684de(i17);
        fp.k.c();
        com.p314xaae8f345.mm.p944x882e457a.o oVar = (com.p314xaae8f345.mm.p944x882e457a.o) v0Var;
        r45.hu6 hu6Var = (r45.hu6) oVar.f152243a.f152217a;
        java.lang.String str2 = ((r45.iu6) oVar.f152244b.f152233a).f458880d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hu6Var.f457989f);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(hu6Var.f457991h);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(hu6Var.f457990g);
        java.lang.String str3 = this.f415775h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadMedia", "fileName:%s, md5:%s, totalLen:%d, dataLen:%d, startPos:%d", str3, str2, valueOf, valueOf2, valueOf3);
        if (i18 == 0 && i19 == 0) {
            if (hu6Var.f457989f <= hu6Var.f457991h + hu6Var.f457990g && str2 != null && !str2.equals("0")) {
                this.f415771d.mo815x76e0bfae(i18, i19, str, this);
                return;
            } else {
                this.f415779o = hu6Var.f457990g + hu6Var.f457992i.f453372d;
                this.f415781q.c(500L, 500L);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadMedia", fp.k.c() + " onGYNetEnd file:" + str3 + " errType:" + i18 + " errCode:" + i19);
        this.f415771d.mo815x76e0bfae(i18, i19, str, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 60;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }
}
