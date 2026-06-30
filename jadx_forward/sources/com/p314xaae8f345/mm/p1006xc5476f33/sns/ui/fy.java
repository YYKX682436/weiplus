package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class fy extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1 {

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f249905g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f249906h;

    /* renamed from: i, reason: collision with root package name */
    public r45.zs4 f249907i;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a f249908j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.ImageView f249909k;

    /* renamed from: l, reason: collision with root package name */
    public m21.r f249910l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f249911m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f249912n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f249913o;

    /* renamed from: p, reason: collision with root package name */
    public int f249914p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f249915q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f249916r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f249917s;

    /* renamed from: t, reason: collision with root package name */
    public m21.w f249918t;

    /* renamed from: u, reason: collision with root package name */
    public int f249919u;

    /* renamed from: v, reason: collision with root package name */
    public int f249920v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f249921w;

    /* renamed from: x, reason: collision with root package name */
    public int f249922x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f249923y;

    public fy(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        super(abstractActivityC21394xb3d2c0cf);
        this.f249905g = null;
        this.f249913o = "";
        this.f249914p = 0;
        this.f249915q = "";
        this.f249916r = false;
        this.f249917s = false;
        this.f249918t = null;
        this.f249920v = 1;
        this.f249921w = "";
        this.f249922x = -1;
        this.f249923y = false;
    }

    public static void o(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.fy fyVar, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        fyVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateThumbData", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str, 0, -1);
        if (N != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMusicWidget", "updateThumbData replace msg.thumbData, size: %s", java.lang.Integer.valueOf(N.length));
            fyVar.f249905g.f33128x4f3b3aa0 = N;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateThumbData", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public android.view.View b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this.f251490c).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.csk, (android.view.ViewGroup) null);
        this.f249906h = inflate;
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a c18734x8eb4224a = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2305xd1075a44.C18734x8eb4224a) inflate.findViewById(com.p314xaae8f345.mm.R.id.qap);
        this.f249908j = c18734x8eb4224a;
        this.f249909k = c18734x8eb4224a.m72271xbe363c88();
        q();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateMusicCover", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        byte[] bArr = this.f249905g.f33128x4f3b3aa0;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f249911m)) {
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).bj(this.f249911m, this.f249909k, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.cy(this));
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Bi(this.f249911m, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dy(this));
        } else if (this.f249905g.f33128x4f3b3aa0 != null) {
            this.f249907i.f473886h = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(this.f249905g.f33128x4f3b3aa0);
            q();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateMusicCover", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        android.view.View view = this.f249906h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        return view;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean c(int i17, int i18, l56.i iVar, java.lang.String str, java.util.List list, r45.ed4 ed4Var, java.util.LinkedList linkedList, int i19, boolean z17, java.util.List list2, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, java.lang.String str2, int i27, int i28) {
        java.lang.String str3;
        java.lang.String str4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.fy fyVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("commit", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        if (this.f249905g.f33128x4f3b3aa0 != null) {
            p(i17, iVar, str, list, ed4Var, linkedList, i19, z17, list2, c19767x257d7f, i27, i28);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().d();
            str4 = "com.tencent.mm.plugin.sns.ui.TingMusicWidget";
            fyVar = this;
            str3 = "commit";
        } else {
            str3 = "commit";
            str4 = "com.tencent.mm.plugin.sns.ui.TingMusicWidget";
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Bi(this.f249911m, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ey(this, i17, iVar, str, list, ed4Var, linkedList, i19, z17, list2, c19767x257d7f, i27, i28));
            fyVar = this;
        }
        fyVar.f251490c.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, str4);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleronDestroy", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        super.e();
        this.f249923y = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleronDestroy", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableNext", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableNext", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public void g(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("beforeCommit", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("beforeCommit", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n1, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public void i(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        super.i(bundle);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f251490c;
        this.f249905g = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req(abstractActivityC21394xb3d2c0cf.getIntent().getBundleExtra("Ksnsupload_timeline")).f33049x38eb0007;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initMusicViewData", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        if (this.f249907i == null) {
            ((if0.w) ((ff0.q) i95.n0.c(ff0.q.class))).getClass();
            this.f249907i = new r45.zs4();
        }
        r45.zs4 zs4Var = this.f249907i;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = this.f249905g;
        zs4Var.f473882d = c11286x34a5504.f33130x6942258;
        zs4Var.f473883e = c11286x34a5504.f33121x993583fc;
        zs4Var.f473886h = null;
        zs4Var.f473885g = "";
        zs4Var.f473884f = "";
        zs4Var.f473888m = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initMusicViewData", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        java.lang.String stringExtra = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Ksnsupload_music_share_object_xml");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d("<msg>" + stringExtra + "</msg>", "msg", null);
            if (d17 != null) {
                m21.r rVar = new m21.r();
                this.f249910l = rVar;
                rVar.f404532a = zy2.pc.b(".msg", d17);
            }
        }
        if (this.f249910l == null) {
            this.f249910l = new m21.r();
        }
        if (this.f249905g.m48467xfb85f7b0() == 76) {
            this.f249911m = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("music_mv_cover_url");
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936 c11289x4ff06936 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11289x4ff06936) this.f249905g.f33122xe4128443;
            if (c11289x4ff06936 != null) {
                this.f249912n = c11289x4ff06936.f33204x1478a44a;
                this.f249910l.f404532a.set(4, c11289x4ff06936.f33203x2b375427);
                this.f249910l.f404532a.set(5, c11289x4ff06936.f33192xedb9d9a);
                this.f249910l.f404532a.set(7, c11289x4ff06936.f33199xd0293a5e);
                this.f249910l.f404532a.set(8, java.lang.Long.valueOf(c11289x4ff06936.f33197xafbf827));
                this.f249910l.f404532a.set(9, c11289x4ff06936.f33196x187d426e);
                this.f249910l.f404532a.set(10, java.lang.Integer.valueOf(c11289x4ff06936.f33193x89444d94));
                this.f249910l.f404532a.set(6, this.f249905g.f33125x9b39409a);
                this.f249910l.f404532a.set(12, c11289x4ff06936.f33200xa7a65d4d);
                r45.xs4 xs4Var = this.f249910l.f404532a;
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11290x5453c607 c11290x5453c607 = c11289x4ff06936.f33202x8b1eb086;
                xs4Var.set(11, c11290x5453c607 != null ? b21.m.e(c11290x5453c607.f33206x54340220) : "");
            }
        } else if (this.f249905g.m48467xfb85f7b0() == 3) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a55042 = this.f249905g;
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11288x597a4423 c11288x597a4423 = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11288x597a4423) c11286x34a55042.f33122xe4128443;
            if (c11288x597a4423 != null) {
                this.f249912n = c11288x597a4423.f33187x1478a44a;
                this.f249911m = c11288x597a4423.f33186x239f8b5;
                this.f249910l.f404532a.set(6, c11286x34a55042.f33125x9b39409a);
            }
        }
        r45.xs4 xs4Var2 = this.f249910l.f404532a;
        if (xs4Var2 != null) {
            this.f249907i.f473891p = il4.l.g(xs4Var2.m75939xb282bd08(18));
        }
        this.f249918t = m21.w.f(abstractActivityC21394xb3d2c0cf.getIntent());
        java.lang.String stringExtra2 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Ksnsupload_appid");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f249913o = stringExtra2;
        java.lang.String stringExtra3 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("Ksnsupload_appname");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f249915q = stringExtra3;
        this.f249916r = abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("KThrid_app", false);
        this.f249914p = abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("Ksnsupload_isHidden", 0);
        this.f249917s = abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("KSnsAction", false);
        this.f249919u = abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("Ksnsupload_source", 0);
        if (abstractActivityC21394xb3d2c0cf.getIntent().getBooleanExtra("SendAppMessageWrapper_TokenValid", true)) {
            this.f249920v = 1;
        } else {
            this.f249920v = 0;
        }
        java.lang.String stringExtra4 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("SendAppMessageWrapper_PkgName");
        this.f249921w = stringExtra4 != null ? stringExtra4 : "";
        int intExtra = abstractActivityC21394xb3d2c0cf.getIntent().getIntExtra("Ksnsupload_type", -1);
        this.f249922x = intExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMusicWidget", "TingMusicWidget.onCreate snsUploadType: %s, appId: %s, albumCoverUrl: %s", java.lang.Integer.valueOf(intExtra), this.f249913o, this.f249911m);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handlerOnCreate", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    public boolean j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("needAutoDraft", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("needAutoDraft", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.z4
    /* renamed from: onActivityResult */
    public boolean mo70827x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(int r24, l56.i r25, java.lang.String r26, java.util.List r27, r45.ed4 r28, java.util.LinkedList r29, int r30, boolean r31, java.util.List r32, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.fy.p(int, l56.i, java.lang.String, java.util.List, r45.ed4, java.util.LinkedList, int, boolean, java.util.List, com.tencent.mm.pointers.PInt, int, int):boolean");
    }

    public final void q() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateMusicView", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
        this.f249908j.c(this.f249907i);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateMusicView", "com.tencent.mm.plugin.sns.ui.TingMusicWidget");
    }
}
