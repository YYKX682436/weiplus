package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

@db5.a(m123858x6ac9171 = 35)
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI */
/* loaded from: classes4.dex */
public class ActivityC18010xd5ae6b28 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p2470x93e71c27.ui.b1, com.p314xaae8f345.mm.p2470x93e71c27.ui.a1, com.p314xaae8f345.mm.p2470x93e71c27.ui.c1 {
    public static final /* synthetic */ int K = 0;
    public long A;
    public int B;
    public int C;
    public boolean D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 I;

    /* renamed from: J, reason: collision with root package name */
    public int f248306J;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f248307d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18405x4d382505 f248308e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f248309f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f248310g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f248311h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f248312i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f248313m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f248314n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f248315o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f248316p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f248317q;

    /* renamed from: r, reason: collision with root package name */
    public final i64.c1 f248318r = new i64.c1("SnsAdStreamVideoPlayUI");

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f248319s = "";

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f248320t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f248321u;

    /* renamed from: v, reason: collision with root package name */
    public int f248322v;

    /* renamed from: w, reason: collision with root package name */
    public int f248323w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f248324x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f248325y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f248326z;

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18405x4d382505 T6(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18010xd5ae6b28 activityC18010xd5ae6b28) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18405x4d382505 c18405x4d382505 = activityC18010xd5ae6b28.f248308e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        return c18405x4d382505;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoEnded", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStreamVideoPlayUI", "%s video ended", str2);
        this.f248318r.f370654i.f379443b++;
        this.f248308e.mo48239x360802();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18405x4d382505 c18405x4d382505 = this.f248308e;
        c18405x4d382505.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showThumbView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        c18405x4d382505.f271275h.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showThumbView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18405x4d382505 c18405x4d3825052 = this.f248308e;
        c18405x4d3825052.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopHideSeekBarTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        c18405x4d3825052.O1.d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopHideSeekBarTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        this.f248308e.mo64629xc2e9d13b(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoEnded", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onError", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onError", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoWaiting", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoWaiting", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("finish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStreamVideoPlayUI", "stop play");
        this.f248308e.d();
        this.f248308e.k0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().w(this.f248314n, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        i64.c1 c1Var = this.f248318r;
        if (c1Var != null && (str3 = this.f248319s) != null && str3.length() > 0) {
            c1Var.f();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KComponentCid", this.f248319s);
            intent.putExtra("KStreamVideoPlayCount", c1Var.f370651f);
            intent.putExtra("KStreamVideoPlayCompleteCount", c1Var.f370652g);
            intent.putExtra("KStreamVideoTotalPlayTimeInMs", c1Var.f370653h);
            setResult(-1, intent);
        }
        int i17 = this.f248323w;
        if (i17 != 0) {
            str2 = "MicroMsg.SnsAdStreamVideoPlayUI";
            str = "finish";
            i64.s1.b(i64.n1.LeaveCompleteVideo, this.f248321u, this.f248320t, this.f248322v, i17, this.f248324x, this.f248325y, this.f248326z, this.A, this.B, this.C);
        } else {
            str = "finish";
            str2 = "MicroMsg.SnsAdStreamVideoPlayUI";
        }
        if (this.D) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportVideo", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.I;
            int m70350x13c652ad = c17933xe8d1b226 == null ? 0 : c17933xe8d1b226.m70350x13c652ad();
            if (this.I == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportVideo", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            } else {
                java.lang.String d17 = c1Var.d();
                int i18 = c1Var.f370648c;
                long j17 = i18 - c1Var.f370650e;
                if (j17 < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "reportVideo minus staytime found! totaltime[%d], offscreenTime[%ld]", java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(c1Var.f370650e));
                    j17 = c1Var.f370648c;
                }
                int i19 = (int) j17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70346x10413e67 = this.I.m70346x10413e67();
                java.lang.String str4 = m70346x10413e67 == null ? "" : m70346x10413e67.f38106x4281f227;
                i64.w wVar = new i64.w();
                wVar.f370882l = this.I.m70354x74235b3e().f38261xc453974;
                gm0.j1.i();
                gm0.j1.n().f354821b.g(new i64.m0(this.F, 6, 2, c1Var.f370648c, null, null, 2, d17, -1, m70350x13c652ad, i19, i19, 0, this.I.m70351xaa22b9ed().m70313x3f7dbf73(), this.I.m70351xaa22b9ed().m70312x94afa0a4(), str4, wVar));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportVideo", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            }
        }
        super.finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getForceOrientation", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        if (this.f248315o) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getForceOrientation", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getForceOrientation", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        return 4;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cqc;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPause", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        j64.b bVar = this.f248318r.f370654i;
        int i17 = bVar.f379444c;
        long j17 = bVar.f379448g;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        bVar.f379444c = i17 + ((int) (android.os.SystemClock.elapsedRealtime() - j17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPause", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.c1
    /* renamed from: idkeyStat */
    public void mo69402x336bdfd8(long j17, long j18, long j19, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("idkeyStat", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("idkeyStat", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.lang.String str;
        android.graphics.Bitmap J2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        this.f248307d = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.m7j);
        this.f248308e = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18405x4d382505) findViewById(com.p314xaae8f345.mm.R.id.p0x);
        this.f248307d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ae(this));
        this.f248307d.setPadding(0, 0, 0, com.p314xaae8f345.mm.ui.bk.j(this));
        this.f248309f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mva);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(this.G, this.H)) {
            this.f248309f.setVisibility(8);
        } else {
            this.f248309f.setVisibility(0);
            this.f248309f.setText(this.G);
            this.f248309f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.be(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initVideoView", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        this.f248308e.m75326x5d1e8363(this);
        this.f248308e.mo61532x526554de(this);
        this.f248308e.mo48221xf83edb22(this);
        this.f248308e.mo48224x6c9eb6a9(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.wj());
        this.f248308e.h(false, this.f248311h, 0);
        this.f248308e.mo48237xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN);
        this.f248308e.m48235xbc2f47ad(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g4());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initVideoView", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initThumb", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f248313m) || !com.p314xaae8f345.mm.vfs.w6.j(this.f248313m) || (J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(this.f248313m, null)) == null) {
            java.lang.String str2 = "attach" + this.f248314n;
            java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.wj(), str2);
            java.lang.String V = ca4.z0.V(str2);
            java.lang.String str3 = d17 + V;
            this.f248313m = str3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStreamVideoPlayUI", "try download thumb img %s, save to %s", this.f248314n, str3);
            java.lang.String str4 = this.f248313m;
            java.lang.String str5 = this.f248312i;
            r45.jj4 h17 = m21.y.h(str4, 2, str5, str5, 1, 1, "");
            ca4.s0 s0Var = new ca4.s0(h17);
            s0Var.d(3);
            s0Var.e(h17.f459388d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().c(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ce(this, h17.f459388d));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.m0 Cj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj();
            com.p314xaae8f345.mm.p2621x8fb0427b.s7 d18 = com.p314xaae8f345.mm.p2621x8fb0427b.s7.d();
            str = "MicroMsg.SnsAdStreamVideoPlayUI";
            d18.f276846b = (int) (java.lang.System.currentTimeMillis() / 1000);
            Cj.g(h17, 8, s0Var, d18, d17, V);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initThumb", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        } else {
            this.f248308e.mo64626x52d31475(J2);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initThumb", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            str = "MicroMsg.SnsAdStreamVideoPlayUI";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "start play");
        if (!this.f248308e.mo61531xc00617a4()) {
            if (this.f248308e.mo61523x898ffe25() == this.f248308e.mo61527x6d590e18()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("seekTo", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18405x4d382505 c18405x4d382505 = this.f248308e;
                if (c18405x4d382505 != null) {
                    c18405x4d382505.a(0, true);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("seekTo", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            } else {
                int mo61523x898ffe25 = this.f248308e.mo61523x898ffe25();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("seekTo", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18405x4d382505 c18405x4d3825052 = this.f248308e;
                if (c18405x4d3825052 != null) {
                    c18405x4d3825052.a(mo61523x898ffe25, true);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("seekTo", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            }
            this.f248308e.mo48238x68ac462();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.c1
    /* renamed from: kvStat */
    public void mo69404xbd3cda5f(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("kvStat", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("kvStat", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18405x4d382505 c18405x4d382505 = this.f248308e;
        c18405x4d382505.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideThumbView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        c18405x4d382505.f271275h.setVisibility(4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideThumbView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPrepared", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStreamVideoPlayUI", "%s prepared, video total time %d", str2, java.lang.Integer.valueOf(this.f248308e.mo61527x6d590e18()));
        this.f248308e.k0();
        if (this.f248306J == 0) {
            this.f248306J = this.f248308e.mo61527x6d590e18();
        }
        i64.c1 c1Var = this.f248318r;
        c1Var.f370654i.f379447f = getResources().getConfiguration().orientation == 2 ? 2 : 1;
        j64.b bVar = c1Var.f370654i;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        bVar.f379448g = android.os.SystemClock.elapsedRealtime();
        j64.b bVar2 = c1Var.f370654i;
        bVar2.f379446e = 2;
        bVar2.f379444c = 0;
        bVar2.f379442a++;
        bVar2.f379448g = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPrepared", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        int i19;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.util.Iterator it;
        java.lang.String str6;
        java.lang.String str7 = "onActivityResult";
        java.lang.String str8 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        int i27 = -1;
        if (999 != i17) {
            str = "onActivityResult";
            str2 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI";
        } else if (-1 == i18) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
            java.util.Iterator it6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(",")).iterator();
            while (it6.hasNext()) {
                java.lang.String str9 = (java.lang.String) it6.next();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStreamVideoPlayUI", "send sight to %s", str9);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendAppMsg", str8);
                ot0.q qVar = new ot0.q();
                qVar.f430187f = this.f248317q;
                qVar.f430199i = 4;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f248310g)) {
                    qVar.f430207k = this.f248311h;
                } else {
                    qVar.f430207k = this.f248310g;
                }
                java.lang.String str10 = this.f248312i;
                qVar.f430267z = str10;
                qVar.f430170a2 = this.f248311h;
                qVar.f430174b2 = this.f248306J;
                qVar.f430178c2 = this.f248317q;
                qVar.f430186e2 = this.H;
                qVar.f430182d2 = this.G;
                qVar.f430190f2 = str10;
                qVar.f430194g2 = this.f248320t;
                qVar.f430198h2 = this.f248321u;
                qVar.Y1 = this.E;
                byte[] N = com.p314xaae8f345.mm.vfs.w6.N(this.f248313m, 0, i27);
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Integer.valueOf(N == null ? 0 : N.length);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStreamVideoPlayUI", "read buf size %d", objArr);
                if (ot0.j1.a() != null) {
                    ((ez.w0) ot0.j1.a()).getClass();
                    i19 = 0;
                    str3 = "sendAppMsg";
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.I(qVar, "", "", str9, "", N);
                } else {
                    i19 = 0;
                    str3 = "sendAppMsg";
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str3, str8);
                ((dk5.s5) tg3.t1.a()).Ui(stringExtra2, str9);
                if (this.D) {
                    ca4.z0.x0(new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(0, 6, this.I.f68891x29d1292e, 12, 0));
                }
                if (this.f248323w != 0) {
                    boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str9);
                    str4 = str7;
                    str5 = str8;
                    it = it6;
                    str6 = stringExtra2;
                    i64.s1.e(R4 ? i64.p1.Chatroom : i64.p1.Chat, this.f248321u, this.f248320t, this.f248322v, this.f248323w, this.f248324x, this.f248325y, this.f248326z, this.A, this.B, this.C, R4 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str9) : i19);
                } else {
                    str4 = str7;
                    str5 = str8;
                    it = it6;
                    str6 = stringExtra2;
                }
                str7 = str4;
                str8 = str5;
                it6 = it;
                stringExtra2 = str6;
                i27 = -1;
            }
            str = str7;
            str2 = str8;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6), null, this, null, null);
        } else {
            str = "onActivityResult";
            str2 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI";
            if (this.D) {
                ca4.z0.x0(new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(0, 6, this.I.f68891x29d1292e, 13, 0));
            }
        }
        if (998 == i17) {
            int i28 = this.f248323w;
            if (i28 != 0) {
                i64.s1.e(i64.p1.Sns, this.f248321u, this.f248320t, this.f248322v, i28, this.f248324x, this.f248325y, this.f248326z, this.A, this.B, this.C, 0);
            }
            if (-1 == i18) {
                if (this.D) {
                    ca4.z0.x0(new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(0, 6, this.I.f68891x29d1292e, 15, 0));
                }
            } else if (this.D) {
                ca4.z0.x0(new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(0, 6, this.I.f68891x29d1292e, 16, 0));
            }
        }
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        super.onCreate(bundle);
        this.f248310g = getIntent().getStringExtra("KUrl");
        this.f248311h = getIntent().getStringExtra("KStremVideoUrl");
        this.f248312i = getIntent().getStringExtra("KThumUrl");
        this.f248313m = getIntent().getStringExtra("KThumbPath");
        this.f248314n = getIntent().getStringExtra("KMediaId");
        this.f248315o = getIntent().getBooleanExtra("ForceLandscape", false);
        this.f248316p = getIntent().getBooleanExtra("KBlockFav", false);
        java.lang.String stringExtra = getIntent().getStringExtra("KMediaTitle");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f248317q = stringExtra;
        this.f248306J = getIntent().getIntExtra("KMediaVideoTime", 0);
        java.lang.String stringExtra2 = getIntent().getStringExtra("KSta_SnSId");
        this.I = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b1("" + ca4.z0.F0(stringExtra2));
        this.D = getIntent().getBooleanExtra("KFromTimeLine", false);
        this.f248318r.f370649d = android.os.SystemClock.elapsedRealtime();
        this.f248319s = getIntent().getStringExtra("KComponentCid");
        this.f248320t = getIntent().getStringExtra("KSta_StremVideoAduxInfo");
        this.f248321u = getIntent().getStringExtra("KSta_StremVideoPublishId");
        this.f248322v = getIntent().getIntExtra("KSta_SourceType", 0);
        this.f248323w = getIntent().getIntExtra("KSta_Scene", 0);
        this.f248324x = getIntent().getStringExtra("KSta_FromUserName");
        this.f248325y = getIntent().getStringExtra("KSta_ChatName");
        this.f248326z = getIntent().getStringExtra("KSta_SnSId");
        this.A = getIntent().getLongExtra("KSta_MsgId", 0L);
        this.B = getIntent().getIntExtra("KSta_FavID", 0);
        this.C = getIntent().getIntExtra("KSta_ChatroomMembercount", 0);
        this.E = getIntent().getStringExtra("KSta_SnsStatExtStr");
        java.lang.String stringExtra3 = getIntent().getStringExtra("KViewId");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.F = stringExtra3;
        this.G = getIntent().getStringExtra("StreamWording");
        this.H = getIntent().getStringExtra("StremWebUrl");
        mo54450xbf7c1df6("");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this, 1, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vd(this);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.wd(this);
        k0Var.f293387d = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xd(this);
        mo74404x84f07bce(1001, com.p314xaae8f345.mm.R.C30861xcebc809e.bud, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.yd(this, k0Var));
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zd(this), com.p314xaae8f345.mm.R.C30861xcebc809e.buc);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFullScreen", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        getWindow().getDecorView().setSystemUiVisibility(1792);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFullScreen", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        mo78578x8b18f126(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        if (i17 != 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            return false;
        }
        finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        super.onResume();
        i64.c1 c1Var = this.f248318r;
        if (c1Var != null) {
            c1Var.c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    /* renamed from: onSeekComplete */
    public void mo55683xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSeekComplete", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSeekComplete", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStop", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        super.onStop();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pausePlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStreamVideoPlayUI", "pause play");
        this.f248308e.mo48231x65825f6();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pausePlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        boolean z17 = this.D;
        i64.c1 c1Var = this.f248318r;
        if (z17) {
            int i17 = getResources().getConfiguration().orientation;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pushVideoPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            c1Var.e(this.f248308e.mo61523x898ffe25());
            j64.b bVar = c1Var.f370654i;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            bVar.f379448g = android.os.SystemClock.elapsedRealtime();
            j64.b bVar2 = c1Var.f370654i;
            bVar2.f379447f = i17 == 2 ? 2 : 1;
            bVar2.f379446e = 2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pushVideoPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        }
        if (c1Var != null) {
            c1Var.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStop", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.a1
    public void r(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAdStreamVideoPlayUI", "%s download finish", str);
        this.f248318r.f370647b = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetVideoPlayFps", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetVideoPlayFps", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }
}
