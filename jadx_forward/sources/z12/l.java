package z12;

/* loaded from: classes12.dex */
public class l extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f550851d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f550852e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f550853f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f550854g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f550855h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f550856i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f550857m;

    /* renamed from: n, reason: collision with root package name */
    public final int f550858n;

    /* renamed from: o, reason: collision with root package name */
    public final int f550859o;

    /* renamed from: p, reason: collision with root package name */
    public final int f550860p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f550861q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f550862r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f550863s;

    /* renamed from: t, reason: collision with root package name */
    public final dn.k f550864t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 f550865u;

    public l(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 c21051xbc71d247, int i17, int i18, int i19, java.lang.String str6) {
        this.f550862r = "";
        this.f550864t = new z12.k(this);
        this.f550853f = str;
        this.f550854g = str3;
        this.f550855h = str2;
        this.f550856i = str4;
        this.f550857m = str5;
        this.f550865u = c21051xbc71d247;
        this.f550858n = i17;
        this.f550859o = i18;
        this.f550860p = i19;
        this.f550861q = str6;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.pl0();
        lVar.f152198b = new r45.ql0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/exchangeemotionpack";
        lVar.f152200d = com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60877x93282336;
        lVar.f152201e = 213;
        lVar.f152202f = 1000000213;
        this.f550851d = lVar.a();
    }

    public static void H(z12.l lVar, java.lang.String str, boolean z17) {
        lVar.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneExchangeEmotionPack", "[cpan] publicStoreEmojiDownLoadTaskEvent productId:%s success:%b", str, java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5324xe5a14934 c5324xe5a14934 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5324xe5a14934();
        am.p4 p4Var = c5324xe5a14934.f135636g;
        p4Var.f89136b = str;
        p4Var.f89135a = 2;
        p4Var.f89137c = z17;
        c5324xe5a14934.e();
    }

    public final void I(java.lang.String str, int i17, int i18, java.lang.String str2) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ri().a(str, i17, i18, str2);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: cancel */
    public void mo9408xae7a2e7a() {
        super.mo9408xae7a2e7a();
        this.f550863s = true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f550852e = u0Var;
        java.lang.String str = this.f550853f;
        int i17 = this.f550859o;
        if (i17 == 0) {
            I(str, 6, 0, this.f550862r);
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f550851d;
        r45.pl0 pl0Var = (r45.pl0) oVar.f152243a.f152217a;
        pl0Var.f464681d = str;
        pl0Var.f464682e = this.f550855h;
        pl0Var.f464683f = this.f550858n;
        pl0Var.f464684g = i17;
        pl0Var.f464685h = this.f550860p;
        pl0Var.f464686i = x51.j1.h(this.f550861q, false);
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60877x93282336;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        java.lang.String str2 = this.f550853f;
        if (i18 != 0 || i19 != 0) {
            this.f550852e.mo815x76e0bfae(i18, i19, str, this);
            if (i19 == 4) {
                return;
            }
            I(str2, -1, 0, this.f550862r);
            return;
        }
        rr.u.a(str2);
        if (this.f550859o == 0) {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(lp0.b.t());
            java.lang.String str3 = a17.f294812f;
            if (str3 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
                if (m18.a()) {
                    m18.f294799a.r(m18.f294800b);
                }
            }
            java.lang.String b17 = com.p314xaae8f345.mm.p947xba6de98f.i2.b("downzip", java.lang.System.currentTimeMillis(), gm0.j1.b().h() + "", "emoji");
            this.f550862r = b17;
            r45.mj0 mj0Var = ((r45.ql0) this.f550851d.f152244b.f152233a).f465615d;
            dn.m mVar = new dn.m();
            mVar.f323318d = "task_NetSceneExchangeEmotionPack";
            mVar.f69601xaca5bdda = b17;
            mVar.f69595x6d25b0d9 = lp0.b.t() + str2;
            mVar.f69592xf1ebe47b = 5;
            mVar.f69620xeb1a61d6 = (long) mj0Var.f462090f;
            mVar.f69575xf11df5f5 = mj0Var.f462089e;
            mVar.f69591xf9dbbe9c = mj0Var.f462088d;
            mVar.f69609xd84b8349 = 2;
            mVar.f323320f = this.f550864t;
            mVar.f69606xccdbf540 = true;
            this.f550863s = false;
            if (!((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.NetSceneExchangeEmotionPack", "add task failed:");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneExchangeEmotionPack", "add custom emoji.need no download pack");
        }
        this.f550852e.mo815x76e0bfae(i18, i19, str, this);
        gm0.j1.n().f354821b.g(new z12.p(str2));
    }

    public l(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this(str, str2, str3, null, null, null, 0, 0, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) ? 1 : 0, str4);
    }

    public l(java.lang.String str) {
        this(str, null, "", null, null, null, 1, 0, 0, null);
    }

    public l(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this(str, str2, str3, str4, str5, null, 0, 0, 0, null);
    }
}
