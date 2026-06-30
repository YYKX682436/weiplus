package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class c implements db5.t4, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f251286d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f251287e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f251288f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 f251289g;

    /* renamed from: h, reason: collision with root package name */
    public final android.app.Activity f251290h;

    /* renamed from: i, reason: collision with root package name */
    public final int f251291i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k4 f251292m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f251293n;

    /* renamed from: o, reason: collision with root package name */
    public i64.b1 f251294o;

    public c(android.app.Activity activity, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k4 k4Var) {
        java.lang.String str = "MicroMsg.TimeLineMMMenuItemSelectedListener-" + hashCode();
        this.f251286d = str;
        this.f251290h = activity;
        this.f251291i = i17;
        this.f251292m = k4Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }

    public static /* synthetic */ android.app.Activity a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.c cVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        android.app.Activity activity = cVar.f251290h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        return activity;
    }

    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addListener", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f251286d, "addListener");
        gm0.j1.i();
        gm0.j1.n().f354821b.a(218, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addListener", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addToLaterListen", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 tlObj = this.f251289g;
        android.view.View view = this.f251287e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addLaterListen", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tlObj, "tlObj");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingSnsUtils", "addToLaterListen");
        android.app.Activity activity = this.f251290h;
        if (activity == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addLaterListen", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
        } else {
            bw5.lp0 d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.wm.d(tlObj);
            i95.m c17 = i95.n0.c(qk.a8.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            bw5.ar0 ar0Var = bw5.ar0.TingScene_Moment;
            bw5.v70 d18 = d17.d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d18, "getListenItem(...)");
            qk.a8.E8((qk.a8) c17, activity, ar0Var, d18, null, 0, 0, view, null, null, com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60883xc58bd72e, null);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_clk", null, je4.g.a(d17.d()), 5, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addLaterListen", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addToLaterListen", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addToPlayList", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        bw5.lp0 d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.wm.d(this.f251289g);
        ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).k(d17, bw5.ar0.TingScene_UnDefined);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addToPlayList", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void e(android.view.View view, java.lang.String str, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("bindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        this.f251287e = view;
        this.f251288f = str;
        this.f251289g = c19807x593d1720;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("bindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void f() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("favoriteAppBrand", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f251289g;
        r45.y87 y87Var = c19807x593d1720.f39044xb84ea7e1;
        if (c19807x593d1720 == null || y87Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f251286d, "favoriteAppBrand weappInfo null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favoriteAppBrand", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        k91.v5 Bi = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Bi(y87Var.f472397d);
        r45.dp0 dp0Var = new r45.dp0();
        dp0Var.f454167d = y87Var.f472397d;
        if (Bi != null) {
            dp0Var.f454168e = Bi.f68904x28d45f97;
        }
        dp0Var.f454172i = y87Var.f472398e;
        dp0Var.f454169f = y87Var.f472400g;
        dp0Var.f454174n = y87Var.f472399f;
        dp0Var.f454177q = y87Var.f472403m;
        dp0Var.f454178r = y87Var.f472404n;
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.h0(19);
        r45.a90 a90Var = this.f251289g.f39014x86965dde;
        if (a90Var != null) {
            str = a90Var.f451371f;
            java.util.LinkedList linkedList = a90Var.f451373h;
            if (linkedList == null || linkedList.isEmpty()) {
                gp0Var.z0(true);
            } else {
                r45.jj4 jj4Var = (r45.jj4) this.f251289g.f39014x86965dde.f451373h.get(0);
                java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d) + ca4.z0.U(jj4Var);
                gp0Var.A0(str2);
                gp0Var.B0(str2);
            }
        } else {
            gp0Var.z0(true);
            str = null;
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        android.app.Activity activity = this.f251290h;
        if (K0) {
            str = (Bi == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Bi.f68913x21f9b213)) ? activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572147a00) : Bi.f68913x21f9b213;
        }
        gp0Var.O0(str);
        gp0Var.m0(str);
        gp0Var.e0(o72.d2.d(gp0Var.toString(), 19));
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.e(c01.z1.r());
        jq0Var.c(java.lang.System.currentTimeMillis());
        jq0Var.g(2);
        r45.bq0 bq0Var = new r45.bq0();
        bq0Var.f452497f.add(gp0Var);
        bq0Var.b(dp0Var);
        bq0Var.o(jq0Var);
        bq0Var.p(str);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87856i = activity;
        c4Var.f87851d = str;
        c4Var.f87852e = str;
        c4Var.f87848a = bq0Var;
        c4Var.f87850c = 19;
        c5303xc75d2f73.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favoriteAppBrand", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            Method dump skipped, instructions count: 807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.c.g():void");
    }

    public void h() {
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        r45.a90 a90Var;
        r45.xs4 xs4Var;
        r45.y8 y8Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("favoriteMusic", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(this.f251288f);
        if (this.f251289g.f39014x86965dde.f451373h.size() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favoriteMusic", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        r45.jj4 jj4Var = (r45.jj4) this.f251289g.f39014x86965dde.f451373h.get(0);
        if (k17 == null || jj4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f251286d, "favorite music fail, snsinfo or mediaobj is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favoriteMusic", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f251289g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        if (jj4Var == null || k17 == null || k17.f38324x142bbdc6 == 0) {
            str = "favoriteMusic";
            str2 = "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or media is null");
            c4Var.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cac;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Xj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
            c4Var.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cau;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            str = "favoriteMusic";
            str2 = "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener";
        } else {
            java.lang.String format = java.lang.String.format("%s#%s", ca4.z0.t0(k17.f68891x29d1292e), jj4Var.f459388d);
            r45.bq0 bq0Var = new r45.bq0();
            r45.jq0 jq0Var = new r45.jq0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.GetFavDataSource", "fav sns music, from %s", k17.m70374x6bf53a6c());
            jq0Var.e(k17.m70374x6bf53a6c());
            jq0Var.j(c01.z1.r());
            jq0Var.g(2);
            str = "favoriteMusic";
            str2 = "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener";
            jq0Var.c(k17.m70357x3fdd41df() * 1000);
            jq0Var.d(k17.m70367x7525eefd() + "");
            jq0Var.i(format);
            if (c19807x593d1720 != null && (y8Var = c19807x593d1720.f39012x33e0f24f) != null) {
                jq0Var.b(y8Var.f472379d);
            }
            r45.gp0 gp0Var = new r45.gp0();
            gp0Var.g0(format);
            gp0Var.I0(jj4Var.f459391g);
            gp0Var.J0(jj4Var.f459401q);
            gp0Var.K0(k17.m70371x485d7().f39014x86965dde.f451372g);
            if (c19807x593d1720 == null || (xs4Var = c19807x593d1720.f39014x86965dde.f451385w) == null || !com.p314xaae8f345.mm.vfs.w6.j(xs4Var.m75945x2fec8307(13))) {
                z17 = false;
            } else {
                gp0Var.B0(c19807x593d1720.f39014x86965dde.f451385w.m75945x2fec8307(13));
                z17 = true;
            }
            java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d) + ca4.z0.U(jj4Var);
            if (com.p314xaae8f345.mm.vfs.w6.j(str3)) {
                gp0Var.B0(str3);
                z17 = true;
            }
            if (!z17) {
                gp0Var.z0(true);
                gp0Var.o0(jj4Var.f459393i);
                r45.tq0 tq0Var = new r45.tq0();
                tq0Var.o(jj4Var.f459393i);
                bq0Var.r(tq0Var);
            }
            gp0Var.D0(jj4Var.P);
            gp0Var.E0(jj4Var.Q);
            gp0Var.h0(7);
            gp0Var.O0(jj4Var.f459397o);
            gp0Var.m0(jj4Var.f459390f);
            gp0Var.x0(true);
            if (c19807x593d1720 != null && (a90Var = c19807x593d1720.f39014x86965dde) != null && a90Var.f451385w != null) {
                r45.hp0 hp0Var = new r45.hp0();
                hp0Var.C = c19807x593d1720.f39014x86965dde.f451385w;
                gp0Var.J1 = hp0Var;
            }
            bq0Var.f452497f.add(gp0Var);
            bq0Var.o(jq0Var);
            c4Var.f87848a = bq0Var;
            c4Var.f87850c = 7;
            qb4.a.h(gp0Var, k17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        }
        c4Var.f87856i = this.f251290h;
        c4Var.f87860m = 25;
        c5303xc75d2f73.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
    }

    public void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("favoriteMusicAlbum", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        r45.km6 km6Var = this.f251289g.f39014x86965dde.A;
        java.lang.String str = this.f251286d;
        if (km6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "favorite music fail, tingAlbumShareObject is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favoriteMusicAlbum", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        bw5.o50 v17 = il4.d.v(km6Var.f460372e);
        if (v17 != null) {
            ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).getClass();
            android.app.Activity activity = this.f251290h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            new cl4.v().b(activity, v17, 25);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "favoriteMusicAlbum categoryItem null");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favoriteMusicAlbum", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("favoriteMusicMv", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(this.f251288f);
        if (this.f251289g.f39014x86965dde.f451373h.size() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favoriteMusicMv", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        r45.jj4 jj4Var = (r45.jj4) this.f251289g.f39014x86965dde.f451373h.get(0);
        if (k17 == null || jj4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f251286d, "favorite music fail, snsinfo or mediaobj is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favoriteMusicMv", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f251289g;
        r45.a90 a90Var = c19807x593d1720.f39014x86965dde;
        if (a90Var.f451370e == 47) {
            ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
            java.lang.String str = jj4Var.P;
            if (str == null) {
                str = "";
            }
            ((dl4.m0) tVar).Bi(str, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h(this, c5303xc75d2f73, k17, jj4Var));
        } else {
            qb4.a.j(c5303xc75d2f73, k17, jj4Var, c19807x593d1720, a90Var.f451385w, null);
            android.app.Activity activity = this.f251290h;
            am.c4 c4Var = c5303xc75d2f73.f135623g;
            c4Var.f87856i = activity;
            c4Var.f87860m = 25;
            c5303xc75d2f73.e();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favoriteMusicMv", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("favoriteProduct", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        if (this.f251289g == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favoriteProduct", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f251289g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        if (c19807x593d1720 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or tlObj is null");
            c4Var.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cac;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        } else {
            r45.bq0 bq0Var = new r45.bq0();
            r45.jq0 jq0Var = new r45.jq0();
            r45.aq0 aq0Var = new r45.aq0();
            jq0Var.e(c19807x593d1720.f39018xf3f56116);
            jq0Var.j(c01.z1.r());
            jq0Var.g(2);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            jq0Var.c(java.lang.System.currentTimeMillis());
            r45.y8 y8Var = c19807x593d1720.f39012x33e0f24f;
            if (y8Var != null) {
                jq0Var.b(y8Var.f472379d);
            }
            r45.a90 a90Var = c19807x593d1720.f39014x86965dde;
            if (a90Var != null) {
                aq0Var.g(a90Var.f451371f);
                aq0Var.d(c19807x593d1720.f39014x86965dde.f451369d);
                java.util.LinkedList linkedList = c19807x593d1720.f39014x86965dde.f451373h;
                if (linkedList != null && !linkedList.isEmpty()) {
                    r45.jj4 jj4Var = (r45.jj4) c19807x593d1720.f39014x86965dde.f451373h.get(0);
                    aq0Var.i(jj4Var.f459406v);
                    aq0Var.e(jj4Var.f459405u);
                    aq0Var.f(jj4Var.f459393i);
                }
            }
            c4Var.f87851d = aq0Var.f451721d;
            c4Var.f87852e = aq0Var.f451723f;
            c4Var.f87848a = bq0Var;
            c4Var.f87850c = 10;
            bq0Var.o(jq0Var);
            bq0Var.n(aq0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        }
        c4Var.f87856i = this.f251290h;
        c4Var.f87860m = 26;
        c5303xc75d2f73.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favoriteProduct", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void l() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("favoriteTV", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        if (this.f251289g == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favoriteTV", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f251289g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillEventInfoTV", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        if (c19807x593d1720 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or tlObj is null");
            c4Var.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cac;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfoTV", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        } else {
            r45.bq0 bq0Var = new r45.bq0();
            r45.jq0 jq0Var = new r45.jq0();
            r45.mq0 mq0Var = new r45.mq0();
            jq0Var.e(c19807x593d1720.f39018xf3f56116);
            jq0Var.j(c01.z1.r());
            jq0Var.g(8);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            jq0Var.c(java.lang.System.currentTimeMillis());
            r45.y8 y8Var = c19807x593d1720.f39012x33e0f24f;
            if (y8Var != null) {
                jq0Var.b(y8Var.f472379d);
            }
            r45.a90 a90Var = c19807x593d1720.f39014x86965dde;
            if (a90Var != null) {
                mq0Var.g(a90Var.f451371f);
                mq0Var.d(c19807x593d1720.f39014x86965dde.f451369d);
                java.util.LinkedList linkedList = c19807x593d1720.f39014x86965dde.f451373h;
                if (linkedList != null && !linkedList.isEmpty()) {
                    r45.jj4 jj4Var = (r45.jj4) c19807x593d1720.f39014x86965dde.f451373h.get(0);
                    mq0Var.e(jj4Var.f459405u);
                    mq0Var.f(jj4Var.f459393i);
                }
            }
            c4Var.f87851d = mq0Var.f462268d;
            c4Var.f87852e = mq0Var.f462270f;
            c4Var.f87848a = bq0Var;
            c4Var.f87850c = 15;
            bq0Var.o(jq0Var);
            bq0Var.q(mq0Var);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfoTV", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        }
        c4Var.f87856i = this.f251290h;
        c4Var.f87860m = 27;
        c5303xc75d2f73.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favoriteTV", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void m() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("favoriteUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f251289g;
        java.lang.String str = c19807x593d1720.f39014x86965dde.f451372g;
        java.lang.String str2 = c19807x593d1720.f39012x33e0f24f.f472379d;
        android.app.Activity activity = this.f251290h;
        java.lang.String e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs.e(activity, str, str2);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17);
        java.lang.String str3 = this.f251286d;
        if (K0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str3, "favorite url fail, url is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favoriteUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.b(this.f251288f);
        java.lang.String str4 = "";
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        if (b17 != null) {
            java.lang.String a17 = c01.n2.a("" + b17.f68891x29d1292e);
            c01.l2 c17 = c01.n2.d().c(a17, true);
            c17.i("prePublishId", "sns_" + ca4.z0.t0(b17.f68891x29d1292e));
            c17.i("preUsername", b17.f68896xdde069b);
            c17.i("preChatName", "");
            c17.i("url", e17);
            c17.i("preMsgIndex", 0);
            c17.i("sendAppMsgScene", 1);
            c17.i("adExtStr", b17.m70371x485d7().f39040xbd345fc4);
            c4Var.f87855h = a17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(this.f251288f);
        if (k17 != null && this.f251289g.f39014x86965dde.f451370e == 18) {
            i64.s1.d(i64.q1.AdUrl, i64.p1.Fav, i64.r1.Samll, 0, k17, this.f251291i);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f251289g.f39021x5732e226)) {
            n(activity, k17.m70363x51f8f990());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favoriteUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        if (k17.m70377x3172ed()) {
            int i17 = this.f251291i;
            com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(i17, i17 == 0 ? 1 : 2, b17.f68891x29d1292e, 11, 0);
            ca4.m0.f(c11137xb05b06ad, this.f251294o, k17, 11);
            ca4.z0.x0(c11137xb05b06ad);
        }
        qb4.a.c(c5303xc75d2f73, e17, this.f251288f);
        c4Var.f87856i = activity;
        c4Var.f87860m = 28;
        c5303xc75d2f73.e();
        if (c5303xc75d2f73.f135624h.f87966a == 0) {
            long i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
                try {
                    str4 = java.net.URLEncoder.encode(e17, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                } catch (java.io.UnsupportedEncodingException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str3, e18, "", new java.lang.Object[0]);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13378, str4, java.lang.Long.valueOf(i18), 3, 2, 1);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favoriteUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void n(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("favouriteAdNativeLandingPages", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str);
        if (k17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favouriteAdNativeLandingPages", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = k17.m70371x485d7();
        if (k17.m70377x3172ed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17932x22276883 m70351xaa22b9ed = k17.m70351xaa22b9ed();
            java.lang.String a17 = za4.z0.a(k17);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                m70351xaa22b9ed.f67593x28cf0d8f = a17;
            }
            str2 = m70351xaa22b9ed.f67593x28cf0d8f;
        } else {
            str2 = m70371x485d7.f39021x5732e226;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str2, dm.n.f67493x36901555, null);
        if (d17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favouriteAdNativeLandingPages", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        boolean containsKey = d17.containsKey(".adxml.adCanvasInfo");
        android.app.Activity activity = this.f251290h;
        if (!containsKey) {
            db5.e1.i(activity, com.p314xaae8f345.mm.R.C30867xcad56011.cam, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favouriteAdNativeLandingPages", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        java.lang.String a18 = c01.n2.a("" + k17.f68891x29d1292e);
        java.lang.String str3 = (java.lang.String) d17.get(".adxml.adCanvasInfo.shareTitle");
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = (java.lang.String) d17.get(".adxml.adCanvasInfo.shareWebUrl");
        if (str4 == null) {
            str4 = "";
        }
        java.lang.String str5 = (java.lang.String) d17.get(".adxml.adCanvasInfo.shareDesc");
        java.lang.String str6 = str5 != null ? str5 : "";
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6111xbfced4cd c6111xbfced4cd = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6111xbfced4cd();
        am.kx kxVar = c6111xbfced4cd.f136387g;
        kxVar.f88721b = str;
        kxVar.f88722c = c5303xc75d2f73;
        kxVar.f88720a = str4;
        c6111xbfced4cd.e();
        boolean z17 = c6111xbfced4cd.f136388h.f88810a;
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        if (!z17) {
            if (c4Var.f87859l == 0) {
                c4Var.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cak;
            }
            db5.e1.i(activity, c4Var.f87859l, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favouriteAdNativeLandingPages", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        c4Var.f87855h = a18;
        c4Var.f87851d = str3;
        c4Var.f87852e = str6;
        r45.bq0 bq0Var = c4Var.f87848a;
        if (bq0Var != null && (linkedList = bq0Var.f452497f) != null && linkedList.size() > 0 && bq0Var.f452497f.get(0) != null) {
            ((r45.gp0) bq0Var.f452497f.get(0)).Z(str2);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.gp0) bq0Var.f452497f.get(0)).f456937d)) {
                ((r45.gp0) bq0Var.f452497f.get(0)).O0(c4Var.f87851d);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.gp0) bq0Var.f452497f.get(0)).f456941f)) {
                ((r45.gp0) bq0Var.f452497f.get(0)).m0(c4Var.f87852e);
            }
            r45.jq0 jq0Var = new r45.jq0();
            jq0Var.e(m70371x485d7.f39018xf3f56116);
            jq0Var.j(c01.z1.r());
            jq0Var.g(2);
            jq0Var.c(java.lang.System.currentTimeMillis());
            bq0Var.o(jq0Var);
        }
        c4Var.f87856i = activity;
        c4Var.f87860m = 28;
        c5303xc75d2f73.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favouriteAdNativeLandingPages", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void o(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73;
        am.c4 c4Var;
        java.lang.String str4;
        int i17;
        java.lang.String str5;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("favouriteCardUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str);
        if (k17 == null || !k17.m70377x3172ed()) {
            str2 = null;
        } else {
            str2 = k17.m70348x7741d701();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                str2 = k17.m70349x104289b3();
            }
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2);
        android.app.Activity activity = this.f251290h;
        if (K0) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f251289g;
            str2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs.e(activity, c19807x593d1720.f39014x86965dde.f451372g, c19807x593d1720.f39012x33e0f24f.f472379d);
        }
        java.lang.String str6 = str2;
        boolean K02 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6);
        java.lang.String str7 = this.f251286d;
        if (K02) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str7, "favorite url fail, url is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favouriteCardUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f732 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.b(this.f251288f);
        int i18 = 1;
        am.c4 c4Var2 = c5303xc75d2f732.f135623g;
        if (b17 != null) {
            java.lang.String a17 = c01.n2.a("" + b17.f68891x29d1292e);
            c01.l2 c17 = c01.n2.d().c(a17, true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sns_");
            str3 = str7;
            c5303xc75d2f73 = c5303xc75d2f732;
            sb6.append(ca4.z0.t0(b17.f68891x29d1292e));
            c17.i("prePublishId", sb6.toString());
            c17.i("preUsername", b17.f68896xdde069b);
            c17.i("preChatName", "");
            c17.i("url", str6);
            c17.i("preMsgIndex", 0);
            i18 = 1;
            c17.i("sendAppMsgScene", 1);
            c17.i("adExtStr", b17.m70371x485d7().f39040xbd345fc4);
            c4Var2.f87855h = a17;
        } else {
            str3 = str7;
            c5303xc75d2f73 = c5303xc75d2f732;
        }
        if (k17 == null || !(this.f251289g.f39014x86965dde.f451370e == 18 || k17.m70377x3172ed())) {
            c4Var = c4Var2;
            str4 = "";
            i17 = i18;
        } else {
            c4Var = c4Var2;
            str4 = "";
            i17 = 1;
            i64.s1.d(i64.q1.AdUrl, i64.p1.Fav, i64.r1.Samll, 0, k17, this.f251291i);
            if (this.f251289g != null) {
                int i19 = this.f251291i;
                com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(i19, i19 == 0 ? 1 : 2, b17.f68891x29d1292e, 11, 0);
                ca4.m0.f(c11137xb05b06ad, this.f251294o, k17, 11);
                ca4.z0.x0(c11137xb05b06ad);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f251289g.f39021x5732e226)) {
            n(activity, k17.m70363x51f8f990());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favouriteCardUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f733 = c5303xc75d2f73;
        qb4.a.c(c5303xc75d2f733, str6, this.f251288f);
        c4Var.f87856i = activity;
        c4Var.f87860m = 28;
        c5303xc75d2f733.e();
        if (c5303xc75d2f733.f135624h.f87966a == 0) {
            long i110 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                try {
                    str5 = java.net.URLEncoder.encode(str6, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                } catch (java.io.UnsupportedEncodingException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str3, e17, str4, new java.lang.Object[0]);
                    str5 = str4;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13378, str5, java.lang.Long.valueOf(i110), 3, 2, java.lang.Integer.valueOf(i17));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favouriteCardUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002c. Please report as an issue. */
    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int i18;
        int i19;
        java.lang.String str;
        r45.a90 a90Var;
        int i27;
        java.lang.String t17;
        int i28;
        java.lang.String str2 = "onMMMenuItemSelected";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        if (this.f251287e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.f9 f9Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.ContextTranslate;
        ta4.y0 y0Var = ta4.y0.f498396a;
        int i29 = this.f251291i;
        w04.a aVar = w04.a.INSTANCE;
        int i37 = 5;
        java.lang.String str3 = this.f251286d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k4 k4Var = this.f251292m;
        android.app.Activity activity = this.f251290h;
        switch (itemId) {
            case 0:
                java.lang.String t18 = t();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t18)) {
                    t18 = this.f251289g.f39013x4c306a8a;
                }
                java.lang.String s17 = s(t18);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.f(s17)) {
                    db5.e1.T(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st));
                    i18 = 2;
                    aVar.A9(2, this.f251289g.Id, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o0(s17));
                } else {
                    i18 = 2;
                    db5.e1.T(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571893ss));
                }
                y0Var.d(i18, this.f251288f, 1, "");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 1:
                java.lang.String t19 = t();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t19)) {
                    t19 = this.f251289g.f39013x4c306a8a;
                }
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.K(k4Var)) {
                    k4Var.a().g(this.f251288f, this.f251289g.Id);
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
                java.lang.String str4 = this.f251288f;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                qb4.a.f(c5303xc75d2f73, str4, t19, 0, 0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                am.c4 c4Var = c5303xc75d2f73.f135623g;
                c4Var.f87856i = activity;
                c4Var.f87860m = 30;
                c5303xc75d2f73.e();
                y0Var.d(4, this.f251288f, 1, "");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 2:
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.K(k4Var)) {
                    k4Var.a().g(this.f251288f, this.f251289g.Id);
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f732 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.b(this.f251288f);
                if (b17.m70377x3172ed() && b17.m70354x74235b3e().m70146xae00c4ba()) {
                    n(activity, this.f251288f);
                } else if (this.f251289g.f39034xebc78809 == 1) {
                    qb4.a.b(c5303xc75d2f732, this.f251288f, 0);
                    am.c4 c4Var2 = c5303xc75d2f732.f135623g;
                    c4Var2.f87856i = activity;
                    c4Var2.f87860m = 31;
                    c5303xc75d2f732.e();
                } else if (this.f251287e.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj) {
                    qb4.a.b(c5303xc75d2f732, this.f251288f, ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj) this.f251287e.getTag()).f251636b);
                    am.c4 c4Var3 = c5303xc75d2f732.f135623g;
                    c4Var3.f87856i = activity;
                    c4Var3.f87860m = 31;
                    c5303xc75d2f732.e();
                }
                if (b17.m70377x3172ed()) {
                    int i38 = this.f251291i;
                    com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(i38, i38 == 0 ? 1 : 2, b17.f68891x29d1292e, 11, 0);
                    ca4.m0.f(c11137xb05b06ad, this.f251294o, b17, 11);
                    ca4.z0.x0(c11137xb05b06ad);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1929, 8);
                }
                y0Var.d(4, this.f251288f, 3, "");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 3:
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.K(k4Var)) {
                    k4Var.a().g(this.f251288f, this.f251289g.Id);
                }
                y0Var.d(4, this.f251288f, 3, "");
                m();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 4:
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.K(k4Var)) {
                    k4Var.a().g(this.f251288f, this.f251289g.Id);
                }
                h();
                y0Var.d(4, this.f251288f, 3, "");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 5:
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.K(k4Var)) {
                    k4Var.a().g(this.f251288f, this.f251289g.Id);
                }
                k();
                y0Var.d(4, this.f251288f, 3, "");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 6:
            default:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 7:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(this.f251288f);
                if (k17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str3, "delete comment fail!!! snsInfo is null");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                    return;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activity);
                u1Var.g(activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j9o));
                u1Var.n(activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0));
                u1Var.k(activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561015a31));
                u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.f(this, k17));
                u1Var.j(activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
                u1Var.i(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.d(this, k17));
                u1Var.q(false);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 8:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(this.f251288f);
                if (k18 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.a.c(k18);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("sns_permission_snsinfo_svr_id", k18.f68891x29d1292e);
                    intent.putExtra("sns_permission_userName", k18.m70374x6bf53a6c());
                    intent.putExtra("sns_permission_anim", true);
                    intent.setClass(activity, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18092x8ce2ee1b.class);
                    android.app.Activity activity2 = this.f251290h;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(11);
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.k(activity2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/listener/TimeLineMMMenuItemSelectedListener", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 9:
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.K(k4Var)) {
                    k4Var.a().g(this.f251288f, this.f251289g.Id);
                }
                l();
                y0Var.d(4, this.f251288f, 3, "");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 10:
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.K(k4Var)) {
                    k4Var.a().g(this.f251288f, this.f251289g.Id);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.b(this.f251288f);
                if (b18 != null && b18.m70377x3172ed() && b18.m70354x74235b3e().m70146xae00c4ba()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(this.f251288f);
                    if (k19 != null && k19.m70377x3172ed()) {
                        int i39 = this.f251291i;
                        com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad2 = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(i39, i39 == 0 ? 1 : 2, b18.f68891x29d1292e, 11, 0);
                        ca4.m0.f(c11137xb05b06ad2, this.f251294o, b18, 11);
                        ca4.z0.x0(c11137xb05b06ad2);
                    }
                    n(activity, this.f251288f);
                } else {
                    p(activity, this.f251288f);
                }
                if (b18 != null && b18.m70377x3172ed()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1929, 8);
                }
                y0Var.d(4, this.f251288f, 3, "");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 11:
                if (this.f251287e.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1 u1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1) this.f251287e.getTag();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.f(u1Var2.f252088c)) {
                        db5.e1.T(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st));
                        r45.e86 e86Var = u1Var2.f252090e;
                        if (e86Var != null) {
                            aVar.A9(4, this.f251289g.Id + ":" + e86Var.f454665m, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o0(u1Var2.f252088c));
                        }
                    } else {
                        db5.e1.T(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571893ss));
                    }
                    y0Var.d(2, this.f251288f, 2, u1Var2.f252089d);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 12:
                r45.jj4 jj4Var = (r45.jj4) this.f251289g.f39014x86965dde.f451373h.get(0);
                java.lang.String str5 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d) + ca4.z0.U(jj4Var);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Select_Conv_Type", 3);
                intent2.putExtra("select_is_ret", true);
                intent2.putExtra("mutil_select_is_ret", true);
                intent2.putExtra("image_path", str5);
                intent2.putExtra("Retr_Msg_Type", 11);
                j45.l.v(activity, ".ui.transmit.SelectConversationUI", intent2, 15);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 13:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(this.f251288f);
                int i47 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.a.f244096a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealNotInterest", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealNotInterest", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 14:
                if (f9Var.k(this.f251287e.getContext(), null)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k110 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(this.f251288f);
                    if (k110 != null) {
                        if (i29 == 0) {
                            m21.w.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.b1.f34602x366c91de);
                        } else {
                            m21.w.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.b1.f34602x366c91de);
                        }
                        ca4.z0.T(k110);
                        k110.m70377x3172ed();
                        k110.m70375x338a8cc7();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s6.m(k110);
                    y0Var.d(5, this.f251288f, 1, "");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 15:
                if ((this.f251287e.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1) && f9Var.k(this.f251287e.getContext(), null)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1 u1Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1) this.f251287e.getTag();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b19 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().b1(u1Var3.f252087b);
                    if (b19 != null) {
                        if (i29 == 0) {
                            m21.w.d(715);
                        } else {
                            m21.w.c(715);
                        }
                        ca4.z0.T(b19);
                        b19.m70377x3172ed();
                        b19.m70375x338a8cc7();
                        r45.e86 e86Var2 = u1Var3.f252090e;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s6.l((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1) this.f251287e.getTag());
                    y0Var.d(5, this.f251288f, 2, u1Var3.f252089d);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 16:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s6.n(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(this.f251288f));
                y0Var.d(10, this.f251288f, 1, "");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 17:
                if (this.f251287e.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1 u1Var4 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1) this.f251287e.getTag();
                    java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s6.f246212a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unTranslateComment", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                    if (u1Var4 != null) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        r45.e86 e86Var3 = u1Var4.f252090e;
                        int i48 = e86Var3.f454665m;
                        sb6.append(i48 != 0 ? i48 : e86Var3.f454670r);
                        sb6.append("");
                        java.lang.String e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s6.e(u1Var4.f252087b, sb6.toString());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s6.p(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s6.f(e17));
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6106x6983e65d c6106x6983e65d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6106x6983e65d();
                        am.gx gxVar = c6106x6983e65d.f136383g;
                        i19 = 2;
                        gxVar.f88329a = 2;
                        gxVar.f88330b = e17;
                        c6106x6983e65d.e();
                    } else {
                        i19 = 2;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unTranslateComment", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                    y0Var.d(10, this.f251288f, i19, u1Var4.f252089d);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 18:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendData", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k111 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(this.f251288f);
                if (k111 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendData", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                } else {
                    android.content.Intent intent3 = new android.content.Intent();
                    if (k111.m70405x7b43eb28()) {
                        r45.jj4 c17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.c(k111, this.f251287e.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj) this.f251287e.getTag()).f251636b : 0);
                        if (c17 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str3, "send photo fail, mediaObj is null");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendData", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                        } else {
                            java.lang.String str6 = c17.f459388d;
                            intent3.putExtra("sns_send_data_ui_image_path", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2.m(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.l(c17), activity));
                            intent3.putExtra("sns_send_data_ui_image_media_id", str6);
                            intent3.putExtra("exdevice_open_scene_type", 1);
                            intent3.putExtra("sns_local_id", this.f251288f);
                            intent3.putExtra("sns_send_data_ui_activity", true);
                            j45.l.u(activity, ".ui.chatting.ChattingSendDataToDeviceUI", intent3, null);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendData", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                        }
                    } else {
                        if ((k111.m70371x485d7().f39014x86965dde.f451370e == 4 || k111.m70371x485d7().f39014x86965dde.f451370e == 42 || k111.m70371x485d7().f39014x86965dde.f451370e == 47 || k111.m70371x485d7().f39014x86965dde.f451370e == 48 || k111.m70371x485d7().f39014x86965dde.f451370e == 15 || k111.m70371x485d7().f39014x86965dde.f451370e == 3) && (k111.m70371x485d7().f39014x86965dde.f451373h.isEmpty() || k111.m70371x485d7().f39014x86965dde.f451373h.get(0) == null)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str3, "mediaObj is null, send failed!");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendData", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                        }
                        intent3.putExtra("exdevice_open_scene_type", 1);
                        intent3.putExtra("sns_local_id", this.f251288f);
                        intent3.putExtra("sns_send_data_ui_activity", true);
                        j45.l.u(activity, ".ui.chatting.ChattingSendDataToDeviceUI", intent3, null);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendData", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 19:
                q(activity);
                y0Var.d(8, this.f251288f, 3, "");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 20:
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.K(k4Var)) {
                    k4Var.a().g(this.f251288f, this.f251289g.Id);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.b(this.f251288f);
                if (b27 != null && b27.m70377x3172ed() && b27.m70354x74235b3e().m70146xae00c4ba()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k112 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(this.f251288f);
                    if (k112 != null && k112.m70377x3172ed() && this.f251289g != null) {
                        int i49 = this.f251291i;
                        com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad3 = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(i49, i49 == 0 ? 1 : 2, b27.f68891x29d1292e, 11, 0);
                        ca4.m0.f(c11137xb05b06ad3, this.f251294o, b27, 11);
                        ca4.z0.x0(c11137xb05b06ad3);
                    }
                    n(activity, this.f251288f);
                } else {
                    o(activity, this.f251288f);
                }
                if (b27 != null && b27.m70377x3172ed()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1929, 7);
                }
                y0Var.d(4, this.f251288f, 3, "");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 21:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b28 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.b(this.f251288f);
                if (b28 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str3, "edit photo fail, info is null");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                    return;
                }
                str2 = "onMMMenuItemSelected";
                if (this.f251287e.getTag() == null || !(this.f251287e.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str3, "edit photo fail, tag is null or tag is not SnsImageViewTag");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj ojVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj) this.f251287e.getTag();
                android.app.Activity activity3 = this.f251290h;
                android.content.Intent intent4 = menuItem.getIntent();
                int i57 = this.f251291i;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kj.c(activity3, intent4, b28, ojVar, i57 == 0 ? 1 : 2, i57, this.f251292m);
                y0Var.d(6, this.f251288f, 3, "");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 22:
                str = "onMMMenuItemSelected";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("favoriteNoteLink", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                if (this.f251289g == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "favNotelink,tlobj is null, return");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favoriteNoteLink", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                } else {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f733 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
                    qb4.a.g(c5303xc75d2f733, this.f251288f);
                    am.c4 c4Var4 = c5303xc75d2f733.f135623g;
                    c4Var4.f87856i = activity;
                    c4Var4.f87860m = 28;
                    c5303xc75d2f733.e();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favoriteNoteLink", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                }
                y0Var.d(4, this.f251288f, 3, "");
                str2 = str;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 23:
                str = "onMMMenuItemSelected";
                f();
                y0Var.d(4, this.f251288f, 3, "");
                str2 = str;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 24:
                str = "onMMMenuItemSelected";
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f251289g;
                if (c19807x593d1720 != null && c19807x593d1720.f39014x86965dde != null) {
                    ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).f(this.f251289g.f39014x86965dde.f451379q);
                    db5.e1.T(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cbq));
                    y0Var.d(4, this.f251288f, 3, "");
                }
                str2 = str;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 25:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("favoriteVideoCard", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d17202 = this.f251289g;
                if (c19807x593d17202 == null || (a90Var = c19807x593d17202.f39014x86965dde) == null || !((i27 = a90Var.f451370e) == 28 || i27 == 59 || i27 == 50)) {
                    str = "onMMMenuItemSelected";
                } else {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f734 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d17203 = this.f251289g;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillEventFinderFeedInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                    am.c4 c4Var5 = c5303xc75d2f734.f135623g;
                    if (c19807x593d17203 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, tlObj is null");
                        c4Var5.f87859l = com.p314xaae8f345.mm.R.C30867xcad56011.cad;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventFinderFeedInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                        str = "onMMMenuItemSelected";
                    } else {
                        java.lang.String format = java.lang.String.format("%s", c19807x593d17203.Id);
                        r45.bq0 bq0Var = new r45.bq0();
                        r45.jq0 jq0Var = new r45.jq0();
                        r45.gp0 gp0Var = new r45.gp0();
                        str = "onMMMenuItemSelected";
                        jq0Var.e(c19807x593d17203.f39018xf3f56116);
                        jq0Var.j(c01.z1.r());
                        jq0Var.g(2);
                        jq0Var.c(c19807x593d17203.f39015xc86e6609 * 1000);
                        jq0Var.d(c19807x593d17203.Id + "");
                        jq0Var.i(format);
                        gp0Var.g0(format);
                        qb4.a.i(gp0Var, c19807x593d17203);
                        gp0Var.h0(20);
                        if (c19807x593d17203.f39014x86965dde.f451385w != null) {
                            r45.hp0 hp0Var = new r45.hp0();
                            hp0Var.C = c19807x593d17203.f39014x86965dde.f451385w;
                            gp0Var.J1 = hp0Var;
                        }
                        gp0Var.z0(true);
                        gp0Var.x0(true);
                        bq0Var.f452497f.add(gp0Var);
                        bq0Var.o(jq0Var);
                        bq0Var.i(c19807x593d17203.f39014x86965dde.f451377o);
                        c4Var5.f87848a = bq0Var;
                        c4Var5.f87850c = 20;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillEventFinderFeedInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                    }
                    c4Var5.f87856i = activity;
                    c5303xc75d2f734.e();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favoriteVideoCard", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                y0Var.d(4, this.f251288f, 3, "");
                str2 = str;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 26:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b29 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.b(this.f251288f);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj ojVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj) this.f251287e.getTag();
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = b29.m70371x485d7();
                r45.jj4 jj4Var2 = ojVar2.f251636b < m70371x485d7.f39014x86965dde.f451373h.size() ? (r45.jj4) m70371x485d7.f39014x86965dde.f451373h.get(ojVar2.f251636b) : new r45.jj4();
                su4.i1 i1Var = new su4.i1();
                i1Var.f494456b = activity;
                i1Var.f494461g = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.l(jj4Var2);
                i1Var.f494460f = b29.f68896xdde069b;
                if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5) || (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.ActivityC18439x36286657)) {
                    i1Var.f494458d = 10;
                } else if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac) {
                    i1Var.f494458d = 7;
                }
                i1Var.f494462h = jj4Var2;
                i1Var.f494459e = ca4.z0.t0(b29.f68891x29d1292e);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) ((su4.x0) i95.n0.c(su4.x0.class))).fj(i1Var);
                y0Var.d(7, this.f251288f, 3, "");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 27:
            case 29:
                if (29 == menuItem.getItemId()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1 u1Var5 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1) this.f251287e.getTag();
                    if (u1Var5 != null) {
                        y0Var.d(7, this.f251288f, 2, u1Var5.f252089d);
                        t17 = u1Var5.f252088c;
                    } else {
                        t17 = null;
                    }
                } else {
                    t17 = t();
                    y0Var.d(7, this.f251288f, 1, "");
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t17)) {
                    t17 = this.f251289g.f39013x4c306a8a;
                }
                java.lang.String s18 = s(t17);
                ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
                java.lang.String l17 = o13.n.l(77);
                su4.j2 j2Var = new su4.j2();
                j2Var.f494475e = l17;
                j2Var.f494471a = activity;
                j2Var.f494474d = s18;
                j2Var.f494472b = 77;
                j2Var.f494476f = true;
                j2Var.f494478h = true;
                j2Var.f494479i = false;
                j2Var.f494491u = true;
                j2Var.f494485o = i65.a.d(activity, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
                j2Var.f494486p = false;
                ((java.util.HashMap) j2Var.f494477g).put("chatSearch", "1");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
                if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac) {
                    if (menuItem.getItemId() == 29) {
                        i28 = 7;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b37 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.b(this.f251288f);
                        tg0.v1 v1Var = (tg0.v1) i95.n0.c(tg0.v1.class);
                        java.lang.String t07 = ca4.z0.t0(b37.f68891x29d1292e);
                        long length = s18.length();
                        ((sg0.q3) v1Var).getClass();
                        su4.k3.d(2, l17, 77, 0, "", "", t07, "", 3, "", 0L, length, i28, "", "", -1, 0);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                        return;
                    }
                    i28 = i37;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b372 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.b(this.f251288f);
                    tg0.v1 v1Var2 = (tg0.v1) i95.n0.c(tg0.v1.class);
                    java.lang.String t072 = ca4.z0.t0(b372.f68891x29d1292e);
                    long length2 = s18.length();
                    ((sg0.q3) v1Var2).getClass();
                    su4.k3.d(2, l17, 77, 0, "", "", t072, "", 3, "", 0L, length2, i28, "", "", -1, 0);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                    return;
                }
                if (!(activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18144x3e20023a)) {
                    i28 = 0;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b3722 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.b(this.f251288f);
                    tg0.v1 v1Var22 = (tg0.v1) i95.n0.c(tg0.v1.class);
                    java.lang.String t0722 = ca4.z0.t0(b3722.f68891x29d1292e);
                    long length22 = s18.length();
                    ((sg0.q3) v1Var22).getClass();
                    su4.k3.d(2, l17, 77, 0, "", "", t0722, "", 3, "", 0L, length22, i28, "", "", -1, 0);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                    return;
                }
                i37 = 6;
                i28 = i37;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b37222 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.b(this.f251288f);
                tg0.v1 v1Var222 = (tg0.v1) i95.n0.c(tg0.v1.class);
                java.lang.String t07222 = ca4.z0.t0(b37222.f68891x29d1292e);
                long length222 = s18.length();
                ((sg0.q3) v1Var222).getClass();
                su4.k3.d(2, l17, 77, 0, "", "", t07222, "", 3, "", 0L, length222, i28, "", "", -1, 0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 28:
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.K(k4Var)) {
                    k4Var.a().g(this.f251288f, this.f251289g.Id);
                }
                j();
                y0Var.d(4, this.f251288f, 3, "");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 30:
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.K(k4Var)) {
                    k4Var.a().g(this.f251288f, this.f251289g.Id);
                }
                i();
                y0Var.d(4, this.f251288f, 3, "");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 31:
                d();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 32:
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.K(k4Var)) {
                    k4Var.a().g(this.f251288f, this.f251289g.Id);
                }
                g();
                y0Var.d(4, this.f251288f, 3, "");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 33:
                c();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 34:
                com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c c10687xa533b04c = new com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b38 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.b(this.f251288f);
                if (b38 != null) {
                    c10687xa533b04c.f149355e = "sns_content_" + b38.m70367x7525eefd();
                    ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).fj(activity, c10687xa533b04c);
                    y0Var.d(12, this.f251288f, 1, "");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 35:
                com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c c10687xa533b04c2 = new com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c();
                if (this.f251287e.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1 u1Var6 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1) this.f251287e.getTag();
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    r45.e86 e86Var4 = u1Var6.f252090e;
                    int i58 = e86Var4.f454665m;
                    sb7.append(i58 != 0 ? i58 : e86Var4.f454670r);
                    sb7.append("");
                    c10687xa533b04c2.f149355e = "sns_comment_" + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s6.e(u1Var6.f252087b, sb7.toString());
                    ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).fj(activity, c10687xa533b04c2);
                    y0Var.d(12, this.f251288f, 2, u1Var6.f252089d);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 36:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 b39 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.b(this.f251288f);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj ojVar3 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj) this.f251287e.getTag();
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d72 = b39.m70371x485d7();
                r45.jj4 jj4Var3 = ojVar3.f251636b < m70371x485d72.f39014x86965dde.f451373h.size() ? (r45.jj4) m70371x485d72.f39014x86965dde.f451373h.get(ojVar3.f251636b) : new r45.jj4();
                java.lang.String l18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.l(jj4Var3);
                if (!com.p314xaae8f345.mm.vfs.w6.j(l18)) {
                    l18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var3.f459388d) + ca4.z0.U(jj4Var3);
                }
                if (!com.p314xaae8f345.mm.vfs.w6.j(l18)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "image search path not ready");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                    return;
                }
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("imgPath", l18);
                hashMap2.put("snsMediaMid", jj4Var3.f459388d);
                hashMap2.put("snsMediaTid", ca4.z0.t0(b39.f68891x29d1292e));
                hashMap2.put("reuseImageInfo", new tg0.a(jj4Var3.G, jj4Var3.I, jj4Var3.H, jj4Var3.f459392h, jj4Var3.f459391g).a());
                ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ai(activity, 2, 5, hashMap2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 37:
                if (this.f251287e.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1 u1Var7 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1) this.f251287e.getTag();
                    java.util.LinkedList linkedList = u1Var7.f252090e.f454673u;
                    if (linkedList != null && !linkedList.isEmpty()) {
                        r45.l86 f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.x1.f252839a.f(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(u1Var7.f252087b), u1Var7.f252090e);
                        if (f17 == null || f17.f460763d == null || f17.f460764e == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str3, "add emoticon info is null");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                            return;
                        }
                        final com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb wi6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r4) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6.class))).wi(((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r4) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6.class))).Bi(f17.f460763d, f17.f460764e.f453374f));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.r2 r2Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.r2.f252792a;
                        int i59 = u1Var7.f252094i == 0 ? 1 : 3;
                        r2Var.h(wi6, i59, ca4.z0.t0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.n(u1Var7.f252087b)), u1Var7.f252090e.f454665m + "");
                        final int i66 = 1000078;
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.r4) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.t6.class))).Ni(wi6, new yz5.l(wi6, i66) { // from class: com.tencent.mm.plugin.sns.ui.listener.c$$a

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f251296e;

                            @Override // yz5.l
                            /* renamed from: invoke */
                            public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.c.this;
                                cVar.getClass();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$onMMMenuItemSelected$0", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.f251286d, "CONTEXT_MENU_ID_COPY_COMMENT >> loadEmoticonFileFromIEmojiInfo: %b", (java.lang.Boolean) obj);
                                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.s0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.y5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.y5.class))).wi(cVar.f251287e.getContext(), this.f251296e, 1000078, null);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$onMMMenuItemSelected$0", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                                return null;
                            }
                        });
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        java.lang.Object[] objArr = new java.lang.Object[3];
        boolean z17 = false;
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = java.lang.Integer.valueOf(m1Var != null ? m1Var.mo808xfb85f7b0() : -1);
        java.lang.String str3 = this.f251286d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "onSceneEnd errType=%d, errCode=%d, sceneType=%d", objArr);
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f251293n;
            if (u3Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "onSceneEnd: delProgressDialog null");
            } else if (u3Var.isShowing()) {
                z17 = true;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "onSceneEnd: delProgressDialog not showing");
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "delProgressDialog dismiss");
                this.f251293n.dismiss();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2 q2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2) m1Var;
                int L = q2Var.L();
                if (L == 4 || L == 6) {
                    android.app.Activity activity = this.f251290h;
                    if (i17 == 0 && i18 == 0) {
                        db5.t7.i(activity, activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.md7), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentUsername", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                        r45.e86 e86Var = q2Var.f246125i;
                        if (e86Var == null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentUsername", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                            str2 = "";
                        } else {
                            java.lang.String str4 = e86Var.f454659d;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentUsername", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                            str2 = str4;
                        }
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2, c01.z1.r())) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 D0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().D0(q2Var.M(), q2Var.J(), q2Var.L() == 6 ? 10 : 9);
                            if (D0 != null) {
                                D0.u0();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().mo11261xce0038c9(D0.f72763xa3c65b86, D0);
                            }
                        }
                    } else {
                        db5.t7.i(activity, activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.md6), com.p314xaae8f345.mm.R.raw.f80097x8eab27b0);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void p(android.content.Context context, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("favouriteSight", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str);
        if (k17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favouriteSight", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        if (k17.m70377x3172ed()) {
            i64.s1.d(i64.q1.Sight, i64.p1.Fav, i64.r1.Samll, 0, k17, this.f251291i);
            int i17 = this.f251291i;
            com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = new com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad(i17, i17 == 0 ? 1 : 2, k17.f68891x29d1292e, 11, 0);
            ca4.m0.f(c11137xb05b06ad, this.f251294o, k17, 11);
            ca4.z0.x0(c11137xb05b06ad);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        qb4.a.e(c5303xc75d2f73, k17);
        android.app.Activity activity = this.f251290h;
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87856i = activity;
        c4Var.f87860m = 29;
        c5303xc75d2f73.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("favouriteSight", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void q(android.content.Context context) {
        java.lang.String str;
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("mutePlayVideo", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(this.f251288f);
        java.lang.String str2 = this.f251286d;
        if (k17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "mute play video but sns info is null.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mutePlayVideo", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        if (k17.m70377x3172ed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "mute play video but it is ad");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mutePlayVideo", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        if (k17.m70371x485d7() == null || k17.m70371x485d7().f39014x86965dde == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(k17.m70371x485d7().f39014x86965dde.f451373h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "mute play video but media is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mutePlayVideo", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        r45.jj4 jj4Var = (r45.jj4) k17.m70371x485d7().f39014x86965dde.f451373h.get(0);
        if (jj4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "mute paly video but media is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mutePlayVideo", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d);
        if (com.p314xaae8f345.mm.vfs.w6.j(d17 + ca4.z0.R(jj4Var))) {
            str = d17 + ca4.z0.U(jj4Var);
        } else {
            str = "";
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(d17 + ca4.z0.Y(jj4Var))) {
            str = d17 + ca4.z0.a0(jj4Var);
        }
        int[] iArr = new int[2];
        android.view.View view = this.f251287e;
        if (view != null) {
            view.getLocationInWindow(iArr);
            i17 = this.f251287e.getWidth();
            i18 = this.f251287e.getHeight();
        } else {
            i17 = 0;
            i18 = 0;
        }
        if (jj4Var.f459389e == 8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "click to play fake sns video");
            android.content.Intent intent = new android.content.Intent();
            if (k17.m70371x485d7().f39043xa1529a15 == null) {
                intent.setClassName(context, "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoActivity");
            } else {
                intent.setClassName(context, "com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoActivity");
            }
            intent.putExtra("intent_video_is_preview", false);
            intent.putExtra("intent_video_is_mute_play", true);
            intent.putExtra("intent_video_sns_local_id", com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.m(this.f251288f));
            intent.putExtra("intent_video_sns_create_time", k17.m70357x3fdd41df());
            if (this.f251287e != null) {
                intent.putExtra("intent_left", iArr[0]);
                intent.putExtra("intent_top", iArr[1]);
                intent.putExtra("intent_width", i17);
                intent.putExtra("intent_height", i18);
            }
            intent.putExtra("intent_video_thumb_path", str);
            android.app.Activity activity = this.f251290h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/listener/TimeLineMMMenuItemSelectedListener", "mutePlayVideo", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/sns/ui/listener/TimeLineMMMenuItemSelectedListener", "mutePlayVideo", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mutePlayVideo", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("intent_thumbpath", str);
        intent2.putExtra("intent_localid", this.f251288f);
        intent2.putExtra("intent_from_scene", this.f251291i);
        intent2.putExtra("intent_ismute", true);
        gc4.n nVar = gc4.n.f351998a;
        r45.m1 m1Var = this.f251289g.f39019x6e5c4c04.f465089m;
        intent2.putExtra("intent_third_sdk_msg", nVar.b(m1Var.f461587d, m1Var.f461589f));
        intent2.putExtra("intent_publish_id", ca4.z0.s0(k17.f68891x29d1292e));
        android.app.Activity activity2 = this.f251290h;
        intent2.putExtra("intent_bottom_height", com.p314xaae8f345.mm.ui.bl.c(activity2));
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac) {
            intent2.putExtra("sns_video_scene", 5);
        } else if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd) {
            intent2.putExtra("sns_video_scene", 6);
        }
        if (this.f251287e != null) {
            intent2.putExtra("img_gallery_left", iArr[0]);
            intent2.putExtra("img_gallery_top", iArr[1]);
            intent2.putExtra("img_gallery_width", i17);
            intent2.putExtra("img_gallery_height", i18);
        }
        if (!pc4.d.f434943a.d(k17.m70371x485d7()) || k17.m70377x3172ed()) {
            intent2.setClass(activity2, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.class);
            android.app.Activity activity3 = this.f251290h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activity3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/listener/TimeLineMMMenuItemSelectedListener", "mutePlayVideo", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity3.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activity3, "com/tencent/mm/plugin/sns/ui/listener/TimeLineMMMenuItemSelectedListener", "mutePlayVideo", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity2.overridePendingTransition(0, 0);
        } else {
            ik4.l lVar = ik4.l.f373474a;
            java.lang.String str3 = jj4Var.f459388d;
            intent2.putExtra("intent_fromplayingvideo", str3 != null ? ik4.l.f373477d.containsKey(str3) : false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2184x67fe93cb.ActivityC18194xa82f7027.f249883d.a(activity2, intent2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("mutePlayVideo", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void r() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeListener", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f251286d, "removeListener");
        gm0.j1.i();
        gm0.j1.n().f354821b.q(218, this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeListener", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public final java.lang.String s(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryGetAdText", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        android.view.View view = this.f251287e;
        if (view != null && (view.getTag(com.p314xaae8f345.mm.R.id.r0u) instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.go)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.go goVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.go) this.f251287e.getTag(com.p314xaae8f345.mm.R.id.r0u);
            if (goVar.f249984g && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(goVar.f249985h)) {
                java.lang.String str2 = goVar.f249985h;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryGetAdText", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return str2;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryGetAdText", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        return str;
    }

    public final java.lang.String t() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.r6 f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("tryGetTranslatedContent", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        android.view.View view = this.f251287e;
        if (view != null && (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18422x36b32e92)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryGetTranslatedContent", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return null;
        }
        if (view == null || !(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.go) || !((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.go) this.f251287e.getTag()).c() || (f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s6.f(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(this.f251288f).m70367x7525eefd())) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryGetTranslatedContent", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return null;
        }
        java.lang.String str = f17.f246178b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("tryGetTranslatedContent", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        return str;
    }
}
