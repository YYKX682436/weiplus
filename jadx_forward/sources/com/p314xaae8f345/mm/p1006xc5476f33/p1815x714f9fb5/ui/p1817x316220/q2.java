package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes15.dex */
public abstract class q2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.a implements com.p314xaae8f345.mm.p944x882e457a.u0, d85.j0 {
    public final k55.k A;
    public za3.l1 B;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 C;
    public boolean D;
    public java.io.Serializable E;
    public boolean F;
    public android.location.Location G;
    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.MyLocationSource H;
    public final o25.y1 I;

    /* renamed from: J, reason: collision with root package name */
    public final i11.c f226408J;
    public boolean K;
    public android.app.ProgressDialog L;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 M;
    public final java.lang.Runnable N;
    public boolean P;
    public float Q;
    public float R;

    /* renamed from: y, reason: collision with root package name */
    public long f226409y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f226410z;

    public q2(android.app.Activity activity) {
        super(activity);
        this.f226409y = -1L;
        this.f226410z = "";
        this.A = new k55.k(this.f226261d);
        this.D = false;
        this.F = false;
        this.G = null;
        this.H = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.r2(this);
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        this.I = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m();
        this.f226408J = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.u2(this);
        this.K = false;
        this.L = null;
        this.M = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.N = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.v2(this);
        this.P = false;
        this.Q = 0.0f;
        this.R = 0.0f;
        gm0.j1.d().a(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60886x8f27a73c, this);
    }

    public static void t(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2 q2Var, android.view.MenuItem menuItem, int i17) {
        q2Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = q2Var.f226264g;
        android.app.Activity activity = q2Var.f226261d;
        switch (itemId) {
            case 0:
                if (q2Var.D) {
                    ((yb0.c0) ((zb0.c0) i95.n0.c(zb0.c0.class))).getClass();
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r8.a(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.t3());
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("show_bottom", false);
                    intent.putExtra("jsapi_args_appid", "wx751a1acca5688ba3");
                    intent.putExtra("rawUrl", q2Var.f226410z);
                    intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, com.p314xaae8f345.mm.R.C30867xcad56011.i9h);
                    intent.putExtra("webview_bg_color_rsID", com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3);
                    j45.l.j(activity, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
                    return;
                }
                return;
            case 1:
                int i18 = q2Var.f226263f;
                if (i18 == 2 || i18 == 12 || i18 == 13) {
                    o72.v2.d(q2Var.n().getLongExtra("kFavInfoLocalId", -1L), 1, 0);
                }
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Retr_Msg_content", va3.w.b(c16279x64cea23));
                intent2.putExtra("Retr_Msg_Type", 9);
                o72.r3.a(intent2, new com.p314xaae8f345.mm.p2610xe8058ca2.C21013x64a751f(c16279x64cea23.f226124m, c16279x64cea23.f226122h, java.lang.Double.valueOf(c16279x64cea23.f226120f), java.lang.Double.valueOf(c16279x64cea23.f226119e), java.lang.Double.valueOf(c16279x64cea23.f226121g)));
                j45.l.u(activity, ".ui.transmit.MsgRetransmitUI", intent2, null);
                ((o82.i) ((o72.u4) i95.n0.c(o72.u4.class))).Ai(q2Var.n(), q2Var.f226276v, q2Var.f226275u, 3);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                hashMap.put("view_id", "forward_button_in_menu_in_poi_page");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", null, hashMap, 27051);
                q2Var.G("forward_friend_more_poi");
                return;
            case 2:
                q2Var.z();
                return;
            case 3:
                double d17 = c16279x64cea23.f226119e;
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("kfavorite", true);
                q2Var.f226262e.getClass();
                intent3.putExtra("kopenGmapNums", 0);
                q2Var.f226262e.getClass();
                intent3.putExtra("kopenOthersNums", 0);
                q2Var.f226262e.getClass();
                intent3.putExtra("kopenreportType", -1);
                java.lang.String str = q2Var.f226269o;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                intent3.putExtra("kRemark", str != null ? str : "");
                intent3.putExtra("kwebmap_slat", c16279x64cea23.f226119e);
                intent3.putExtra("kwebmap_lng", c16279x64cea23.f226120f);
                intent3.putExtra("Kwebmap_locaion", c16279x64cea23.f226122h);
                intent3.putExtra("kPoiName", q2Var.f226270p);
                intent3.putExtra("kPoiid", c16279x64cea23.f226127p);
                intent3.putExtra("KIsFromPoiList", c16279x64cea23.f226128q);
                intent3.putExtra("KPoiCategoryTips", c16279x64cea23.f226129r);
                intent3.putExtra("kPoiBusinessHour", c16279x64cea23.f226130s);
                intent3.putExtra("KPoiPhone", c16279x64cea23.f226131t);
                intent3.putExtra("KPoiPriceTips", c16279x64cea23.f226132u);
                intent3.putExtra("kBuildingID", c16279x64cea23.f226133v);
                intent3.putExtra("kFloorName", c16279x64cea23.f226134w);
                activity.setResult(-1, intent3);
                activity.finish();
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                hashMap.put("view_id", "fav_button_in_menu_in_poi_page");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", null, hashMap, 27051);
                return;
            case 4:
                db5.e1.u(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571902t2), "", new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.s2(q2Var), null);
                ((o82.i) ((o72.u4) i95.n0.c(o72.u4.class))).Ai(q2Var.n(), q2Var.f226276v, q2Var.f226275u, 6);
                return;
            case 5:
                long longExtra = q2Var.n().getLongExtra("kFavInfoLocalId", -1L);
                android.content.Intent intent4 = new android.content.Intent();
                intent4.putExtra("key_fav_item_id", longExtra);
                intent4.putExtra("key_fav_scene", 2);
                o72.x1.L0(activity, ".ui.FavTagEditUI", intent4, null);
                ((o82.i) ((o72.u4) i95.n0.c(o72.u4.class))).Ai(q2Var.n(), q2Var.f226276v, q2Var.f226275u, 7);
                return;
            case 6:
                android.content.Intent intent5 = new android.content.Intent();
                intent5.putExtra("Retr_Msg_content", va3.w.b(c16279x64cea23));
                intent5.putExtra("Retr_Msg_Id", q2Var.f226409y);
                intent5.putExtra("Retr_MsgTalker", q2Var.f226273s);
                j45.l.u(activity, ".ui.chatting.ChattingSendDataToDeviceUI", intent5, null);
                return;
            case 7:
                ((o82.i) ((o72.u4) i95.n0.c(o72.u4.class))).Ai(q2Var.n(), q2Var.f226276v, q2Var.f226275u, 5);
                try {
                    o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(q2Var.n().getLongExtra("kFavInfoLocalId", -1L));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15378, java.lang.Integer.valueOf(F.f67643xc8a07680), java.lang.Integer.valueOf(F.f67657x2262335f));
                    q2Var.v(F);
                    q2Var.x(activity, F, true, new r45.dq0());
                    activity.finish();
                    return;
                } catch (java.lang.Throwable unused) {
                    dp.a.m125853x26a183b(activity, com.p314xaae8f345.mm.R.C30867xcad56011.cco, 0).show();
                    return;
                }
            case 8:
            default:
                return;
            case 9:
                q2Var.l();
                return;
            case 10:
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str2 = c16279x64cea23.f226124m;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str2 == null) {
                    str2 = "";
                }
                sb6.append(str2);
                sb6.append(" ");
                java.lang.String str3 = c16279x64cea23.f226122h;
                sb6.append(str3 != null ? str3 : "");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(sb6.toString());
                dp.a.m125853x26a183b(activity, com.p314xaae8f345.mm.R.C30867xcad56011.f571894st, 0).show();
                q2Var.G("copy_more_poi");
                return;
            case 11:
                q2Var.w();
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.p3 p3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.p3.f207707a;
                p3Var.c(null, false, true, "poi_info_from_qqmap_guide", null);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                p3Var.c(null, true, false, "click_report_addr_in_menu_in_poi_page", hashMap);
                q2Var.G("feedback_more_poi");
                return;
            case 12:
                long longExtra2 = q2Var.n().getLongExtra("kFavOriginFavInfoLocalId", -1L);
                java.lang.String stringExtra = q2Var.n().getStringExtra("KFavOriginDataId");
                if (longExtra2 < 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ViewMapUI", "favLocalId < 0 || Util.isNullOrNil(detailDataId)");
                    return;
                }
                o72.r2 F2 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(longExtra2);
                if (F2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ViewMapUI", "goFavDetails() favItemInfo is null");
                    return;
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.lang.String str4 = F2.f67643xc8a07680 + "_" + (java.lang.System.currentTimeMillis() / 1000);
                java.util.LinkedList linkedList = F2.f67653xef67d413.f466629e;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        sb7.append((java.lang.String) it.next());
                        sb7.append(";");
                    }
                }
                r45.dq0 dq0Var = new r45.dq0();
                dq0Var.f454186d = 9;
                dq0Var.f454187e = 0;
                dq0Var.f454190h = "";
                dq0Var.f454189g = str4;
                dq0Var.f454191i = sb7.toString();
                F2.E1 = stringExtra;
                ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(q2Var.f226274t.getContext(), F2, dq0Var);
                return;
        }
    }

    public abstract void A();

    public final void B(db5.g4 g4Var) {
        boolean booleanExtra = n().getBooleanExtra("kFavCanRemark", true);
        android.app.Activity activity = this.f226261d;
        if (booleanExtra) {
            g4Var.g(9, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.guk), com.p314xaae8f345.mm.R.raw.f80259x58c5ec65);
        }
        if (n().getBooleanExtra("kFavCanDel", true)) {
            g4Var.l(7, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccm), com.p314xaae8f345.mm.R.raw.f80259x58c5ec65, this.F);
            g4Var.g(5, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572729ca5), com.p314xaae8f345.mm.R.raw.f79116xd8cf08bb);
            g4Var.g(4, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0), com.p314xaae8f345.mm.R.raw.f80075x444ae503);
            int intExtra = n().getIntExtra("kFavShowIconType", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ViewMapUI", "[onCreateFavMenu], showIcon type = " + intExtra);
            if (intExtra == 2) {
                g4Var.c(0, 12, 0, i65.a.r(activity, com.p314xaae8f345.mm.R.C30867xcad56011.f572730cb0), com.p314xaae8f345.mm.R.raw.f80047x8e8a2dc3);
            }
            if (intExtra == 1) {
                g4Var.c(0, 12, 0, i65.a.r(activity, com.p314xaae8f345.mm.R.C30867xcad56011.f572730cb0), com.p314xaae8f345.mm.R.raw.f80730x666e864f);
            }
        }
    }

    public void C() {
    }

    public abstract void D();

    public void E(double d17, double d18, int i17, double d19) {
    }

    public void F(java.lang.String str, java.lang.String str2) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).Ai().g(str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_content", va3.w.b(this.f226264g));
        intent.putExtra("Retr_Msg_Type", 9);
        intent.putExtra("Retr_MsgQuickShare", true);
        intent.putExtra("custom_send_text", str2);
        intent.putExtra("Select_Conv_User", str);
        j45.l.u(this.f226261d, ".ui.transmit.MsgRetransmitUI", intent, null);
        o72.u4 u4Var = (o72.u4) i95.n0.c(o72.u4.class);
        android.content.Intent n17 = n();
        java.lang.String str3 = this.f226276v;
        long j17 = this.f226275u;
        int i17 = o72.u4.W0;
        ((o82.i) u4Var).Ai(n17, str3, j17, 3);
    }

    public void G(java.lang.String str) {
    }

    public void H() {
    }

    public boolean I() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ViewMapUI", "tryShowMoreSheet: ");
        final boolean q17 = q();
        android.app.Activity activity = this.f226261d;
        boolean z17 = false;
        if (q17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activity, 0, false);
            this.C = k0Var;
            int i17 = this.f226263f;
            if (i17 == 2 || i17 == 12 || i17 == 13) {
                k0Var.f293407o = new db5.o4() { // from class: com.tencent.mm.plugin.location.ui.impl.q2$$a
                    @Override // db5.o4
                    /* renamed from: onCreateMMMenu */
                    public final void mo887xc459429a(db5.g4 g4Var) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2.this.B(g4Var);
                    }
                };
            } else {
                k0Var.f293407o = new db5.o4() { // from class: com.tencent.mm.plugin.location.ui.impl.q2$$b
                    @Override // db5.o4
                    /* renamed from: onCreateMMMenu */
                    public final void mo887xc459429a(db5.g4 g4Var) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2 q2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2.this;
                        android.app.Activity activity2 = q2Var.f226261d;
                        g4Var.l(10, activity2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.guw), com.p314xaae8f345.mm.R.raw.f80513x94e251bf, false);
                        if (q2Var.f226263f != 10) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = q2Var.f226264g;
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16279x64cea23.f226122h)) {
                                return;
                            }
                            java.lang.String str = c16279x64cea23.f226127p;
                            if (str == null || !str.startsWith("UgcPoiEx_")) {
                                g4Var.l(11, activity2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gux), com.p314xaae8f345.mm.R.raw.f80514xcd2169e0, q2Var.F);
                            }
                        }
                    }
                };
            }
            k0Var.f293417v = new db5.t4() { // from class: com.tencent.mm.plugin.location.ui.impl.q2$$c
                @Override // db5.t4
                /* renamed from: onMMMenuItemSelected */
                public final void mo888x34063ac(android.view.MenuItem menuItem, int i18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2.t(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2.this, menuItem, i18);
                }
            };
            k0Var.f293414s = new db5.t4() { // from class: com.tencent.mm.plugin.location.ui.impl.q2$$c
                @Override // db5.t4
                /* renamed from: onMMMenuItemSelected */
                public final void mo888x34063ac(android.view.MenuItem menuItem, int i18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2.t(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2.this, menuItem, i18);
                }
            };
            if (!this.F) {
                java.lang.String str = this.f226264g.f226127p;
                if (str != null && str.startsWith("UgcPoiEx_")) {
                    z17 = true;
                }
                if (!z17) {
                    ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) this.I).Di(this.f226261d, this.C, 1, null, new yz5.l() { // from class: com.tencent.mm.plugin.location.ui.impl.q2$$d
                        @Override // yz5.l
                        /* renamed from: invoke */
                        public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                            final java.lang.String str2 = (java.lang.String) obj;
                            final com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2 q2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2.this;
                            q2Var.getClass();
                            ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
                            id5.a aVar = new id5.a();
                            o15.b bVar = new o15.b();
                            bVar.m126728xdc93280d(va3.w.b(q2Var.f226264g));
                            aVar.k(bVar);
                            n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
                            ((dk5.y) a0Var).wi(q2Var.f226261d, aVar, str2, n13.t.a(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j() { // from class: com.tencent.mm.plugin.location.ui.impl.q2$$h
                                @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
                                public final void a(boolean z18, java.lang.String str3, int i18) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2 q2Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2.this;
                                    q2Var2.p();
                                    if (z18) {
                                        q2Var2.F(str2, str3);
                                    }
                                }
                            }));
                            java.util.HashMap hashMap = new java.util.HashMap();
                            hashMap.put("chat_name", str2);
                            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                            hashMap.put("view_id", "forward_recent_user_in_menu_in_poi_page");
                            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", null, hashMap, 27051);
                            q2Var.G("forward_recent_more_poi");
                            return jz5.f0.f384359a;
                        }
                    });
                }
            }
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activity, 1, false);
            this.C = k0Var2;
            k0Var2.f293414s = new db5.t4() { // from class: com.tencent.mm.plugin.location.ui.impl.q2$$c
                @Override // db5.t4
                /* renamed from: onMMMenuItemSelected */
                public final void mo888x34063ac(android.view.MenuItem menuItem, int i18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2.t(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2.this, menuItem, i18);
                }
            };
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var3 = this.C;
        k0Var3.f293405n = new db5.o4() { // from class: com.tencent.mm.plugin.location.ui.impl.q2$$e
            @Override // db5.o4
            /* renamed from: onCreateMMMenu */
            public final void mo887xc459429a(db5.g4 g4Var) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2 q2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.q2.this;
                android.app.Activity activity2 = q2Var.f226261d;
                g4Var.j(1, activity2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572092yh), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m), q2Var.F);
                int i18 = q2Var.f226263f;
                boolean z18 = q17;
                if (i18 != 2) {
                    if (i18 != 7) {
                        switch (i18) {
                            case 11:
                            case 14:
                                break;
                            case 12:
                            case 13:
                                break;
                            default:
                                return;
                        }
                    }
                    if (z18) {
                        java.lang.String str2 = q2Var.f226264g.f226127p;
                        if (str2 != null && str2.startsWith("UgcPoiEx_")) {
                            g4Var.clear();
                            ((db5.h4) g4Var.j(1, activity2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.guz), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m), true)).f309905p = android.text.TextUtils.TruncateAt.END;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (z18) {
                    return;
                }
                q2Var.B(g4Var);
            }
        };
        k0Var3.v();
        return true;
    }

    @Override // ab3.e
    public boolean b(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.Q = motionEvent.getX();
            this.R = motionEvent.getY();
            java.lang.System.currentTimeMillis();
            this.P = false;
            C();
        } else if (action == 1) {
            if (!this.P) {
                java.lang.System.currentTimeMillis();
            }
            D();
        } else if (action == 2 && (java.lang.Math.abs(motionEvent.getX() - this.Q) > 10.0f || java.lang.Math.abs(motionEvent.getY() - this.R) > 10.0f)) {
            this.P = true;
            A();
        }
        return false;
    }

    @Override // ab3.e
    public void c(int i17, int i18, android.content.Intent intent) {
        if (-1 == i18) {
            if (4096 == i17) {
                if (this.f226266i.f226340i != null) {
                    java.lang.CharSequence charSequenceExtra = intent.getCharSequenceExtra("key_result");
                    this.f226269o = charSequenceExtra == null ? "" : charSequenceExtra.toString();
                    r();
                }
            } else if (4100 == i17 && this.f226266i.f226341j != null) {
                this.f226271q = intent.getStringArrayListExtra("key_fav_result_list");
                r();
            }
        }
        if (i17 == 4098 || i17 == 4099) {
            za3.d dVar = this.f226262e;
            dVar.getClass();
            if (i17 != 4098) {
                if (i17 == 4099 && -1 == i18 && intent != null) {
                    java.lang.String stringExtra = intent.getStringExtra("selectpkg");
                    android.content.Intent intent2 = new android.content.Intent((android.content.Intent) intent.getBundleExtra("transferback").getParcelable("targetintent"));
                    intent2.setPackage(stringExtra);
                    intent2.addFlags(524288);
                    android.content.Context context = dVar.f552433a;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent2);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/MapHelper", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/location/ui/MapHelper", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                }
                return;
            }
            if (-1 == i18 && intent != null) {
                java.lang.String stringExtra2 = intent.getStringExtra("selectpkg");
                android.os.Bundle bundleExtra = intent.getBundleExtra("transferback");
                boolean booleanExtra = intent.getBooleanExtra("isalways", false);
                java.util.ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("locations");
                dVar.g((com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23) parcelableArrayList.get(0), (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23) parcelableArrayList.get(1), stringExtra2, booleanExtra, false);
                return;
            }
            if (4097 == i18) {
                if (intent.getBooleanExtra("isalways", false)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11091, 6, 2);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11091, 6, 1);
                }
                java.util.ArrayList parcelableArrayList2 = intent.getBundleExtra("transferback").getParcelableArrayList("locations");
                com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23) parcelableArrayList2.get(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea232 = (com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23) parcelableArrayList2.get(1);
                android.content.Intent intent3 = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(java.lang.String.format("http://maps.google.com/maps?f=d&saddr=%f,%f&daddr=%f,%f&hl=" + (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16279x64cea23.f226123i) ? "zh-cn" : c16279x64cea23.f226123i), java.lang.Double.valueOf(c16279x64cea232.f226119e), java.lang.Double.valueOf(c16279x64cea232.f226120f), java.lang.Double.valueOf(c16279x64cea23.f226119e), java.lang.Double.valueOf(c16279x64cea23.f226120f))));
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("targetintent", intent3);
                android.content.Intent intent4 = new android.content.Intent();
                android.content.Context context2 = dVar.f552433a;
                intent4.setClassName(context2, "com.tencent.mm.pluginsdk.ui.tools.AppChooserUI");
                intent4.putExtra("type", 1);
                intent4.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggk));
                intent4.putExtra("targetintent", intent3);
                intent4.putExtra("transferback", bundle);
                intent4.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 6);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(4099);
                arrayList2.add(intent4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.k((android.app.Activity) context2, arrayList2.toArray(), "com/tencent/mm/plugin/location/ui/MapHelper", "webMap", "(Lcom/tencent/mm/plugin/location/model/LocationInfo;Lcom/tencent/mm/plugin/location/model/LocationInfo;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
        }
    }

    @Override // ab3.e
    public void e(android.os.Bundle bundle) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25952x67c9fe77.m99118x9cf0d20b().m99126x8786117e(null, this.H);
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.f226277w = i11.h.e();
        android.app.Activity activity = this.f226261d;
        java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(activity);
        this.f226264g.f226123i = f17;
        this.f226265h.f226123i = f17;
        o25.n1.e(activity);
        activity.requestWindowFeature(1);
        activity.setContentView(o());
        com.p314xaae8f345.mm.ui.v9.d(activity);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) m(com.p314xaae8f345.mm.R.id.jbp);
        this.f226274t = com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x.wi(activity);
        if ((this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1) || ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, null)) {
            frameLayout.addView(this.f226274t);
        }
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            this.f226274t.m66024x7c4248dc();
        } else {
            this.f226274t.m66023xc5fe1141();
        }
        this.f226262e = new za3.d(activity);
        this.f226266i = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.f(this);
        this.f226269o = n().getStringExtra("kRemark");
        this.f226271q = n().getStringArrayListExtra("kTags");
        this.f226263f = n().getIntExtra("map_view_type", 0);
        this.f226275u = java.lang.System.currentTimeMillis();
        ((o82.i) ((o72.u4) i95.n0.c(o72.u4.class))).getClass();
        java.lang.String a17 = v82.b.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getSearchId(...)");
        this.f226276v = a17;
        this.E = n().getSerializableExtra("key_from_type");
        double doubleExtra = n().getDoubleExtra("kwebmap_slat", 0.0d);
        double doubleExtra2 = n().getDoubleExtra("kwebmap_lng", 0.0d);
        java.lang.String stringExtra = n().getStringExtra("kPoiid");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ViewMapUI", "poiClassifyId " + stringExtra);
        if (stringExtra != null && stringExtra.contains("UgcPoiEx_")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ViewMapUI", "poi is ugc, dslat " + doubleExtra + " " + doubleExtra2);
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            double[] dArr = new double[2];
            com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.C4223x8502b2d7.m34971xde5778f6(new double[]{doubleExtra, doubleExtra2}, dArr);
            doubleExtra = dArr[0];
            doubleExtra2 = dArr[1];
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ViewMapUI", "start dslat " + doubleExtra + " " + doubleExtra2);
        int intExtra = n().getIntExtra("kwebmap_scale", 15);
        this.f226272r = intExtra;
        if (intExtra <= 0) {
            this.f226272r = 15;
        }
        this.f226270p = n().getStringExtra("kPoiName");
        java.lang.String stringExtra2 = n().getStringExtra("Kwebmap_locaion");
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = this.f226264g;
        c16279x64cea23.f226119e = doubleExtra;
        c16279x64cea23.f226120f = doubleExtra2;
        c16279x64cea23.f226122h = stringExtra2;
        c16279x64cea23.f226121g = this.f226272r;
        c16279x64cea23.f226124m = this.f226270p;
        c16279x64cea23.f226128q = n().getBooleanExtra("KIsFromPoiList", false);
        this.f226264g.f226129r = n().getStringExtra("KPoiCategoryTips");
        this.f226264g.f226130s = n().getStringExtra("kPoiBusinessHour");
        this.f226264g.f226131t = n().getStringExtra("KPoiPhone");
        this.f226264g.f226132u = n().getFloatExtra("KPoiPriceTips", 0.0f);
        this.f226264g.f226127p = n().getStringExtra("kPoiid");
        this.f226264g.f226133v = n().getStringExtra("kBuildingID");
        this.f226264g.f226133v = n().getStringExtra("kFloorName");
        this.f226409y = n().getLongExtra("kMsgId", -1L);
        this.f226273s = n().getStringExtra("map_talker_name");
        this.f226266i.f226339h = (android.widget.LinearLayout) m(com.p314xaae8f345.mm.R.id.gy8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.f fVar = this.f226266i;
        fVar.f226337f = this.f226274t;
        fVar.f226332a = (android.widget.RelativeLayout) m(com.p314xaae8f345.mm.R.id.f568856oa0);
        this.f226266i.f226333b = (android.widget.ImageView) m(com.p314xaae8f345.mm.R.id.obw);
        this.f226266i.f226334c = (android.widget.ImageButton) m(com.p314xaae8f345.mm.R.id.oby);
        this.f226266i.f226335d = m(com.p314xaae8f345.mm.R.id.obz);
        this.f226266i.f226336e = (android.widget.TextView) m(com.p314xaae8f345.mm.R.id.f564019fu);
        this.f226266i.f226338g = (android.widget.TextView) m(com.p314xaae8f345.mm.R.id.f567470jl4);
        this.f226266i.f226337f.mo1001x8873d7af().mo992x76535355(15);
        int i17 = this.f226263f;
        if (i17 != 0 && i17 != 3) {
            this.f226266i.f226334c.setVisibility(0);
            android.view.View view = this.f226266i.f226335d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/BaseMapUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/location/ui/impl/BaseMapUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f226266i.f226334c.setEnabled(false);
            this.f226266i.f226334c.setImageResource(com.p314xaae8f345.mm.R.raw.f80193xebd790ad);
        }
        this.f226266i.f226337f.mo1012x463017ca(false);
        this.f226266i.f226333b.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d(this));
        this.f226266i.f226336e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.e(this));
        y();
        s(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        this.f226266i.f226337f.mo1015x731810ef(0.5f, 0.5f);
    }

    @Override // ab3.e
    public void f() {
        this.A.d();
        this.M.mo50300x3fa464aa(this.N);
        this.M = null;
        gm0.j1.d().q(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60886x8f27a73c, this);
        android.app.ProgressDialog progressDialog = this.L;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.L = null;
        }
        ((i11.g) this.f226268n).c(this.f226278x);
        this.f226267m.clear();
        this.f226266i.f226337f.mo997x5cd39ffa();
        java.lang.System.gc();
    }

    @Override // ab3.e
    public boolean g(int i17, android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.C;
        if (k0Var == null || !k0Var.i()) {
            I();
            return true;
        }
        this.C.u();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.a
    public void j() {
        android.content.Intent intent = new android.content.Intent();
        this.f226262e.getClass();
        intent.putExtra("kopenGmapNums", 0);
        this.f226262e.getClass();
        intent.putExtra("kopenOthersNums", 0);
        this.f226262e.getClass();
        intent.putExtra("kopenreportType", -1);
        java.lang.String str = this.f226269o;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        intent.putExtra("kRemark", str);
        intent.putExtra("soso_street_view_url", this.f226410z);
        this.f226261d.setResult(-1, intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.a
    public void k() {
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m1Var.mo808xfb85f7b0();
        if (m1Var.mo808xfb85f7b0() == 424) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ViewMapUI", "msg failed.errtype:%d, errcode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public boolean u(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23) {
        if (this.f226266i.f226337f.mo1001x8873d7af() == null || !va3.w.d(c16279x64cea23.f226119e, c16279x64cea23.f226120f)) {
            return false;
        }
        this.f226266i.f226337f.mo1001x8873d7af().mo989x42ab093c(c16279x64cea23.f226119e, c16279x64cea23.f226120f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ViewMapUI", "map animToLat: lat %s lng %s", java.lang.Double.valueOf(c16279x64cea23.f226119e), java.lang.Double.valueOf(c16279x64cea23.f226120f));
        return true;
    }

    public final void v(o72.r2 r2Var) {
        r2Var.f67641x225ba391 = 0;
        r2Var.f67659xa783a79b = java.lang.System.currentTimeMillis();
        r2Var.f67645x88be67a1 = -1L;
        r2Var.f67651x76e81a5a = 6;
        r45.jq0 jq0Var = r2Var.f67640x5ab01132.f452495d;
        if (jq0Var != null) {
            jq0Var.i("");
            r2Var.f67640x5ab01132.f452495d.g(6);
            r2Var.f67640x5ab01132.f452495d.e(c01.z1.r());
        }
        r2Var.f67642xd3939c3a = c01.z1.r();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.gp0 gp0Var = new r45.gp0();
        r45.hp0 hp0Var = new r45.hp0();
        hp0Var.f457887e = r2Var.f67640x5ab01132.f452499h;
        gp0Var.J1 = hp0Var;
        gp0Var.t0("WeNote_0");
        gp0Var.h0(6);
        linkedList.add(0, gp0Var);
        r2Var.f67640x5ab01132.d(linkedList);
        r2Var.f67657x2262335f = 18;
        r2Var.f67660x4b6e9352 = o72.r2.G0(r2Var);
    }

    public void w() {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.app.Activity activity = this.f226261d;
        final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(activity);
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bso, (android.view.ViewGroup) null);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.c9x);
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.bys);
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.h5n);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obc);
        findViewById2.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.location.ui.impl.q2$$f
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.lang.Object obj = new java.lang.Object();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1.this;
                arrayList.add(y1Var2);
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/location/ui/impl/ViewMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(y1Var2);
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/location/ui/impl/ViewMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj2, array2);
                y1Var2.q();
                yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/location/ui/impl/ViewMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/location/ui/impl/ViewMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.location.ui.impl.q2$$g
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.lang.Object obj = new java.lang.Object();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1.this;
                arrayList.add(y1Var2);
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/location/ui/impl/ViewMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(y1Var2);
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/location/ui/impl/ViewMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj2, array2);
                y1Var2.q();
                yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/location/ui/impl/ViewMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/location/ui/impl/ViewMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        float q17 = i65.a.q(activity);
        if (q17 != 1.0f && (layoutParams = findViewById3.getLayoutParams()) != null) {
            int dimension = (int) (activity.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df) * q17);
            layoutParams.width = dimension;
            layoutParams.height = dimension;
            findViewById3.setLayoutParams(layoutParams);
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        y1Var.k(inflate);
        y1Var.s();
    }

    public final void x(android.content.Context context, o72.r2 r2Var, boolean z17, r45.dq0 dq0Var) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5773x64e6b625 c5773x64e6b625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5773x64e6b625();
        am.zl zlVar = c5773x64e6b625.f136087g;
        zlVar.f56x88be67a1 = r2Var.f67645x88be67a1;
        zlVar.f90121k = 5;
        zlVar.f90112b = r2Var.f67660x4b6e9352;
        zlVar.f90114d = context;
        android.os.Bundle bundle = new android.os.Bundle();
        r45.sp0 sp0Var = r2Var.f67640x5ab01132.G;
        if (sp0Var != null) {
            bundle.putString("noteauthor", sp0Var.f467424d);
            bundle.putString("noteeditor", sp0Var.f467425e);
        }
        bundle.putLong("edittime", r2Var.f67659xa783a79b);
        am.zl zlVar2 = c5773x64e6b625.f136087g;
        zlVar2.f90118h = bundle;
        zlVar2.f55x5ab01132 = r2Var.f67640x5ab01132;
        zlVar2.f90111a = 2;
        zlVar2.f90122l = z17;
        zlVar2.f90123m = dq0Var;
        c5773x64e6b625.e();
    }

    public void y() {
        java.io.Serializable serializable;
        boolean z17 = true;
        this.f226266i.f226336e.setEnabled(true);
        boolean z18 = q() && n().getIntExtra("intent_map_key", -1) == 4 && ((serializable = this.E) == zy2.o9.f559050e || serializable == zy2.o9.f559049d);
        this.F = z18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = this.f226264g;
        if (!z18) {
            u(c16279x64cea23);
        }
        this.f226266i.f226337f.mo1001x8873d7af().mo992x76535355(this.f226272r);
        this.f226266i.f226334c.setEnabled(true);
        if (n().getBooleanExtra("kShowshare", true)) {
            this.f226266i.f226334c.setVisibility(0);
        } else {
            this.f226266i.f226334c.setVisibility(8);
        }
        java.lang.String stringExtra = n().getStringExtra("soso_street_view_url");
        this.f226410z = stringExtra;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) && (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.n() || com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m())) {
            this.D = true;
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.n() || com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m()) {
            this.D = false;
        }
        this.f226266i.f226334c.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.t2(this));
        ab3.h hVar = this.f226266i.f226337f;
        android.app.Activity activity = this.f226261d;
        za3.l1 l1Var = new za3.l1(hVar, activity, false);
        this.B = l1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.C16319x94a0c128 c16319x94a0c128 = l1Var.f552523p;
        if (c16319x94a0c128 != null) {
            android.widget.ImageView imageView = l1Var.f552519i;
            c16319x94a0c128.m65994xbb8aeee6(imageView, 0.0d, 0.0d);
            c16319x94a0c128.m66005x2417c2be(imageView, "info_window_tag");
        }
        if (!this.F) {
            za3.l1 l1Var2 = this.B;
            l1Var2.getClass();
            double d17 = c16279x64cea23.f226119e;
            l1Var2.f552515e = d17;
            double d18 = c16279x64cea23.f226120f;
            l1Var2.f552516f = d18;
            if (!va3.w.d(d17, d18)) {
                za3.l1 l1Var3 = this.B;
                l1Var3.f552514d = false;
                l1Var3.f552520m.setVisibility(8);
            }
        }
        if (2 == this.f226263f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ViewMapUI", "location id %s", c16279x64cea23.f226118d);
            if (n().getBooleanExtra("kFavCanRemark", true) && !q()) {
                this.f226266i.f226332a.removeAllViews();
                android.view.View inflate = android.view.View.inflate(activity, com.p314xaae8f345.mm.R.C30864xbddafb2a.bsm, null);
                this.f226266i.f226332a.addView(inflate, new android.widget.LinearLayout.LayoutParams(-1, -2));
                this.f226266i.f226340i = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.inq);
                this.f226266i.f226340i.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.location.ui.impl.a$$a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.a.this;
                        aVar.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(view);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/BaseMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array);
                        aVar.l();
                        yj0.a.h(aVar, "com/tencent/mm/plugin/location/ui/impl/BaseMapUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                });
                this.f226266i.f226341j = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.inv);
                this.f226266i.f226341j.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.b(this));
                r();
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16279x64cea23.f226122h)) {
                this.f226266i.f226332a.setVisibility(0);
            }
        }
        this.f226267m.put(c16279x64cea23.f226118d, this.B);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16279x64cea23.f226122h) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16279x64cea23.f226124m)) {
            z17 = false;
        }
        if (z17) {
            java.lang.String str = this.f226270p;
            if (str != null && !str.equals("")) {
                this.B.f552522o = this.f226270p;
            }
            za3.l1 l1Var4 = this.B;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            this.B.getClass();
            sb6.append(c16279x64cea23.f226122h);
            l1Var4.mo65933x765074af(sb6.toString());
        } else if (va3.w.d(c16279x64cea23.f226119e, c16279x64cea23.f226120f)) {
            u60.h hVar2 = new u60.h(c16279x64cea23.f226119e, c16279x64cea23.f226120f);
            hVar2.f506406f = c16279x64cea23.f226118d;
            ((i11.g) this.f226268n).b(hVar2, this.f226278x);
        }
        this.B.getClass();
    }

    public void z() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = this.f226264g;
        double d17 = c16279x64cea23.f226119e;
        double d18 = c16279x64cea23.f226120f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea232 = this.f226265h;
        double d19 = c16279x64cea232.f226119e;
        double d27 = c16279x64cea232.f226120f;
        if (c16279x64cea232.a()) {
            H();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12809, 3, "");
        this.K = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.M;
        if (n3Var == null) {
            return;
        }
        java.lang.Runnable runnable = this.N;
        if (runnable != null) {
            n3Var.mo50300x3fa464aa(runnable);
        }
        this.M.mo50297x7c4d7ca2(runnable, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        android.app.Activity activity = this.f226261d;
        this.L = db5.e1.Q(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), this.f226261d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fry), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.w2(this));
    }
}
