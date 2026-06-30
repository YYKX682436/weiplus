package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes8.dex */
public final class g6 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.y3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f273177a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.x3 f273178b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w3 f273179c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f273180d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f273181e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f273182f;

    /* renamed from: g, reason: collision with root package name */
    public final o25.y1 f273183g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.p f273184h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f273185i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f273186j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f273187k;

    public g6(android.app.Activity context, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.x3 config, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w3 creator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(creator, "creator");
        this.f273177a = context;
        this.f273178b = config;
        this.f273179c = creator;
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        this.f273183g = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m();
        java.lang.String str = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) com.p314xaae8f345.mm.p794xb0fa9b5e.d0.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(config.f273518h), com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p5.class)).f149939d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBMenuBottomSheetHelper", "init defaultPkgName:" + str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "also(...)");
        this.f273186j = str;
        this.f273187k = jz5.h.b(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f6(this));
    }

    public static final void a(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g6 g6Var, android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r5 r5Var;
        g6Var.getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r5[] m75875xcee59d22 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r5.m75875xcee59d22();
        int length = m75875xcee59d22.length;
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                r5Var = null;
                break;
            }
            r5Var = m75875xcee59d22[i17];
            if (r5Var.ordinal() == menuItem.getItemId()) {
                break;
            } else {
                i17++;
            }
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.x3 x3Var = g6Var.f273178b;
        if (r5Var != null) {
            ((sy.x) ((ty.m0) i95.n0.c(ty.m0.class))).wi(java.lang.Integer.toString(g6Var.hashCode()), x3Var.f273514d, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(x3Var.f273516f), r5Var.f273411d, x3Var.f273518h, g6Var.f273179c.i5());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBMenuBottomSheetHelper", "dealMenuClick: " + menuItem.getItemId());
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r5[] r5VarArr = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r5.f273410e;
        android.app.Activity activity = g6Var.f273177a;
        if (itemId == 0) {
            by5.s0.j(x3Var.f273514d);
            boolean z18 = x3Var.f273522l;
            if (z18 || (!z18 && x3Var.f273527q)) {
                com.p314xaae8f345.mm.p2829xfa87f9de.i.f(g6Var.f273177a, x3Var.f273515e, x3Var.f273516f, x3Var.f273514d, x3Var.f273520j, x3Var.f273521k, !z18 && x3Var.f273527q);
                return;
            } else {
                db5.e1.E(activity, x3Var.f273523m, "", activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), false, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v5.f273488d);
                return;
            }
        }
        if (itemId == 1) {
            yz5.a aVar = g6Var.f273180d;
            if (aVar != null) {
                aVar.mo152xb9724478();
                return;
            }
            return;
        }
        if (itemId == 3) {
            if (x3Var.f273513c != null) {
                d73.i iVar = (d73.i) i95.n0.c(d73.i.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c838260 = x3Var.f273513c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(abstractC16085x8c838260);
                iVar.f6(abstractC16085x8c838260);
                return;
            }
            return;
        }
        if (itemId == 5) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activity);
            u1Var.g(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g_6));
            u1Var.a(true);
            u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571535i4);
            u1Var.l(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w5(g6Var));
            u1Var.i(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.x5.f273532a);
            u1Var.q(false);
            return;
        }
        if (itemId == 6) {
            by5.s0.i(x3Var.f273514d);
            ((gb0.n) ((fb0.k) i95.n0.c(fb0.k.class))).wi(activity, new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.y5(g6Var));
            return;
        }
        if (itemId == 4) {
            ((gb0.n) ((fb0.k) i95.n0.c(fb0.k.class))).wi(activity, new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.z5(g6Var));
            return;
        }
        if (itemId == 8) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = x3Var.f273511a.f381610a;
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai() && c16601x7ed0e40c != null) {
                z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ri(c16601x7ed0e40c);
            }
            x3Var.f273511a.B(!z17);
            return;
        }
        if (itemId == 9) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) x3Var.f273512b).A(true, 2);
            g6Var.c("view_clk");
            return;
        }
        if (itemId == 10) {
            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
            java.lang.String str = x3Var.f273515e;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = x3Var.f273516f;
            java.lang.String str3 = str2 != null ? str2 : "";
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a6 a6Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a6(g6Var);
            ((yb0.g) b0Var).getClass();
            com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.e(activity, str, str3, a6Var);
            return;
        }
        if (itemId == 7) {
            com.p314xaae8f345.mm.ui.ee.f(activity.getTaskId(), null);
            return;
        }
        if (itemId == 13) {
            yz5.a aVar2 = g6Var.f273181e;
            if (aVar2 != null) {
                aVar2.mo152xb9724478();
                return;
            }
            return;
        }
        if (itemId == 2) {
            jt.a0 a0Var = (jt.a0) i95.n0.c(jt.a0.class);
            java.lang.String str4 = x3Var.f273515e;
            java.lang.String str5 = x3Var.f273516f;
            java.lang.String str6 = x3Var.f273514d;
            java.lang.String valueOf = java.lang.String.valueOf(activity.hashCode());
            java.lang.String str7 = x3Var.f273517g;
            ((ht.s) a0Var).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.t3.r(activity, str4, str5, str6, valueOf, "FROM_SCENE_OPEN_BY_QB", str7);
            return;
        }
        if (itemId == 11) {
            jt.a0 a0Var2 = (jt.a0) i95.n0.c(jt.a0.class);
            android.app.Activity activity2 = g6Var.f273177a;
            java.lang.String str8 = x3Var.f273515e;
            java.lang.String str9 = x3Var.f273516f;
            java.lang.String str10 = x3Var.f273514d;
            java.lang.String valueOf2 = java.lang.String.valueOf(activity.hashCode());
            java.lang.String str11 = x3Var.f273517g;
            ((ht.s) a0Var2).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.t3.r(activity2, str8, str9, str10, valueOf2, "SEARCH_IN_FILE", str11);
            return;
        }
        if (itemId != 12) {
            if (itemId == 14) {
                ((qg5.h2) ((ct.x2) i95.n0.c(ct.x2.class))).wi(activity, x3Var.f273520j, x3Var.f273521k);
                ((v02.f0) ((a00.j) i95.n0.c(a00.j.class))).wj();
                return;
            }
            return;
        }
        jt.a0 a0Var3 = (jt.a0) i95.n0.c(jt.a0.class);
        android.app.Activity activity3 = g6Var.f273177a;
        java.lang.String str12 = x3Var.f273515e;
        java.lang.String str13 = str12 == null ? "" : str12;
        java.lang.String str14 = x3Var.f273516f;
        java.lang.String str15 = str14 == null ? "" : str14;
        java.lang.String str16 = x3Var.f273514d;
        java.lang.String str17 = str16 == null ? "" : str16;
        java.lang.String valueOf3 = java.lang.String.valueOf(activity.hashCode());
        java.lang.String str18 = x3Var.f273517g;
        java.lang.String str19 = str18 == null ? "" : str18;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w3 w3Var = g6Var.f273179c;
        ((ht.s) a0Var3).getClass();
        new com.p314xaae8f345.mm.p2470x93e71c27.ui.q2(activity3, str13, str15, str17, valueOf3, str19, w3Var).f272623h.C();
    }

    public void b() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f273182f;
        boolean z17 = false;
        if (k0Var != null) {
            k0Var.V1 = false;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this.f273177a, 0, false);
        this.f273182f = k0Var2;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.x3 x3Var = this.f273178b;
        if (!x3Var.f273531u) {
            boolean z18 = x3Var.f273522l;
            boolean z19 = true;
            if (!z18) {
                if (!z18 && x3Var.f273527q) {
                    z17 = true;
                }
                z19 = z17;
            }
            if (z19) {
                ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) this.f273183g).Di(this.f273177a, k0Var2, 1, null, new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.t5(this));
            }
        }
        k0Var2.f293405n = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b6(this, k0Var2);
        k0Var2.f293407o = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c6(this, k0Var2);
        k0Var2.f293414s = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d6(this);
        k0Var2.f293417v = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e6(this);
    }

    public final void c(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("btn_scene", 7);
        hashMap.put("view_id", "float_win_btn");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(str, hashMap, 33488);
    }
}
