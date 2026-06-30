package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI */
/* loaded from: classes12.dex */
public class ActivityC13590x9555381d extends com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43 implements o72.x3, l75.q0 {

    /* renamed from: x0, reason: collision with root package name */
    public static final long f182139x0 = ip.c.k();

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f182140y0 = 0;
    public android.widget.TextView A;
    public android.widget.ImageView B;
    public android.widget.TextView C;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 D;
    public o72.r2 E;
    public r45.gp0 F;
    public java.lang.String L;
    public long M;
    public java.lang.String N;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16084xdca2b46a S;
    public p82.a T;
    public u82.a U;
    public int W;
    public int X;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f182142m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f182143n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f182144o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.C21405x85fc1ce0 f182145p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f182147q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f182148r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f182149s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f182150t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f182151u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ProgressBar f182152v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f182153w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f182154x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f182155y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f182156z = null;
    public boolean G = false;
    public final o72.b3 H = new o72.b3();
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f182141J = false;
    public boolean K = true;
    public boolean P = false;
    public boolean Q = false;
    public boolean R = false;
    public rl5.r V = null;
    public final db5.t4 Y = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.e(this);
    public final android.view.View.OnTouchListener Z = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.f(this);

    /* renamed from: p0, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f182146p0 = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.g(this);

    public static void Z6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d, java.lang.String str) {
        activityC13590x9555381d.f182133g.f425019k++;
        bw5.ar0 ar0Var = bw5.ar0.TingScene_Fav;
        r45.gp0 gp0Var = activityC13590x9555381d.F;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = o72.x1.f425048a;
        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
        if (o72.x1.t0(ar0Var, gp0Var, o72.x1.x(gp0Var))) {
            return;
        }
        o72.w4 w4Var = (o72.w4) i95.n0.c(o72.w4.class);
        java.lang.String str2 = activityC13590x9555381d.F.K;
        ((x82.l0) w4Var).getClass();
        ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).wi(activityC13590x9555381d, str, str2, 2);
    }

    public static void a7(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteFileDetailUI", "click item favid %d, localid %d, itemstatus %d", java.lang.Integer.valueOf(activityC13590x9555381d.E.f67643xc8a07680), java.lang.Long.valueOf(activityC13590x9555381d.E.f67645x88be67a1), java.lang.Integer.valueOf(activityC13590x9555381d.E.f67644x3059914a));
        if (!fp.i.b()) {
            db5.e1.i(activityC13590x9555381d.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.cbp, com.p314xaae8f345.mm.R.C30867xcad56011.c__);
            return;
        }
        if (activityC13590x9555381d.E.P0() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC13590x9555381d.F.f456967s)) {
            o72.x1.D0(activityC13590x9555381d.E, true);
        } else if (activityC13590x9555381d.f182141J) {
            activityC13590x9555381d.E.f67644x3059914a = 7;
            o72.x1.z0(activityC13590x9555381d.F, true, 18, -1L);
        } else {
            o72.x1.y0(activityC13590x9555381d.E, activityC13590x9555381d.F, true);
        }
        activityC13590x9555381d.e7();
    }

    public static boolean i7(r45.gp0 gp0Var) {
        if (gp0Var == null) {
            return false;
        }
        java.lang.String str = gp0Var.K;
        if (str != null && str.equalsIgnoreCase("apk")) {
            return true;
        }
        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
        java.lang.String x17 = o72.x1.x(gp0Var);
        if (x17 != null && x17.matches(".*\\.apk(.1)*")) {
            return true;
        }
        java.lang.String str2 = gp0Var.f456937d;
        return str2 != null && str2.matches(".*\\.apk(.1)*");
    }

    @Override // o72.x3
    public void R4(o72.e2 e2Var) {
        java.lang.String str;
        if (e2Var == null || (str = e2Var.f67085xf604e54a) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteFileDetailUI", "on cdn status changed, item is null");
            return;
        }
        if (str.equals(this.F.T)) {
            if (this.E.Q0() && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.F.f456967s)) {
                this.D.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.n(this, e2Var.v0(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.cdv, o72.x1.O(e2Var.f67090x90a9378), o72.x1.O(e2Var.f67094xeb1a61d6))));
                return;
            }
            this.D.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.n(this, e2Var.v0(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572726ca2, o72.x1.O(e2Var.f67090x90a9378), o72.x1.O(e2Var.f67094xeb1a61d6))));
            if (this.f182141J && com.p314xaae8f345.mm.vfs.w6.j(e2Var.f67091x2260084a)) {
                this.E.f67644x3059914a = 10;
                mo735xb0dfc7d8("", null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: b7, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf mo55332x76847179() {
        return (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) super.mo55332x76847179();
    }

    public final java.lang.String c7() {
        java.lang.String stringExtra = getIntent().getStringExtra("key_detail_custom_file_path");
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) ? stringExtra : o72.x1.x(this.F);
    }

    public final int d7() {
        r45.jp0 jp0Var;
        r45.jp0 jp0Var2;
        r45.gp0 gp0Var = this.F;
        if (gp0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteFileDetailUI", "get type but data item is null");
            return 8;
        }
        int i17 = gp0Var.I;
        if (i17 != 0) {
            if (i17 == 15) {
                return (gp0Var == null || (jp0Var = gp0Var.O1) == null || (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jp0Var.f459531d) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.F.O1.f459534g))) ? 4 : 15;
            }
            if (i17 == 10130) {
                return 8;
            }
            return i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteFileDetailUI", "get data type, but data item type is 0, info type %d", java.lang.Integer.valueOf(this.E.f67657x2262335f));
        int i18 = this.E.f67657x2262335f;
        if (4 == i18) {
            return 4;
        }
        if (16 != i18) {
            return 8;
        }
        r45.gp0 gp0Var2 = this.F;
        return (gp0Var2 == null || (jp0Var2 = gp0Var2.O1) == null || (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jp0Var2.f459531d) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.F.O1.f459534g))) ? 4 : 15;
    }

    public final void e7() {
        int i17;
        int i18;
        this.f182144o.setVisibility(8);
        this.f182142m.setVisibility(8);
        this.f182143n.setVisibility(8);
        this.f182149s.setVisibility(8);
        android.view.View view = this.f182154x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        int i19 = 0;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initDownloadingStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initDownloadingStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        o72.e2 Xf = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(this.F.T);
        if (Xf != null) {
            int v07 = (int) Xf.v0();
            int i27 = Xf.f67090x90a9378;
            i17 = Xf.f67094xeb1a61d6;
            i19 = i27;
            i18 = v07;
        } else {
            i17 = (int) this.F.R;
            i18 = 0;
        }
        if (this.E.Q0() && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.F.f456967s)) {
            this.D.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.n(this, i18, getString(com.p314xaae8f345.mm.R.C30867xcad56011.cdv, o72.x1.O(i19), o72.x1.O(i17))));
        } else {
            this.D.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.n(this, i18, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572726ca2, o72.x1.O(i19), o72.x1.O(i17))));
        }
    }

    public final void f7() {
        this.f182145p.setVisibility(8);
        this.f182147q.setVisibility(8);
        this.f182144o.setVisibility(8);
        this.f182142m.setVisibility(8);
        this.f182143n.setVisibility(8);
        android.view.View view = this.f182154x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOutOfDateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOutOfDateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f182149s.setVisibility(8);
        this.B.setVisibility(0);
        this.C.setVisibility(0);
        if (this.F.I == 4) {
            this.f182149s.setGravity(17);
            this.f182149s.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cbv);
            return;
        }
        this.f182149s.setGravity(17);
        this.f182149s.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cbu);
        if (this.F.X1 == 2) {
            this.C.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c_o);
        } else {
            this.C.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c_p);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        p82.a aVar = this.T;
        if (aVar != null) {
            aVar.p();
        }
        super.finish();
    }

    public final void g7(boolean z17) {
        r45.jp0 jp0Var;
        boolean j76 = j7();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteFileDetailUI", "init status, info type %d, exist:%B path:%s", java.lang.Integer.valueOf(this.E.f67644x3059914a), java.lang.Boolean.valueOf(j76), c7());
        if (this.F.X1 != 0) {
            f7();
            k82.c.f386420a.e(this.M, this.F.X1 != 2 ? 1 : 2);
            return;
        }
        if (!this.E.I0() && !j76 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.F.f456967s)) {
            o72.r2 r2Var = this.E;
            if (r2Var.f67644x3059914a == 8) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.F.f456967s)) {
                    h7();
                    if (z17) {
                        db5.e1.T(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.brf));
                        return;
                    }
                    return;
                }
                f7();
                if (z17) {
                    int d76 = d7();
                    db5.e1.T(mo55332x76847179(), getString((4 == d76 || 15 == d76) ? com.p314xaae8f345.mm.R.C30867xcad56011.ccc : com.p314xaae8f345.mm.R.C30867xcad56011.cc7));
                }
                k82.c.f386420a.e(this.M, 1);
                return;
            }
            if (r2Var.P0()) {
                h7();
                if (z17) {
                    db5.e1.T(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_9));
                    return;
                }
                return;
            }
            if (this.E.J0() || this.E.Q0()) {
                e7();
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteFileDetailUI", "other status, not done, downloading, uploading, downloadfail, uploadfail");
                h7();
                return;
            }
        }
        if (!j76) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.F.f456967s)) {
                f7();
                k82.c.f386420a.e(this.M, this.F.X1 != 2 ? 1 : 2);
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteFileDetailUI", "? info is done, source file not exist, cdn data url is not null");
                h7();
                return;
            }
        }
        if (d7() == 15 && (jp0Var = this.F.O1) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jp0Var.f459531d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.F.O1.f459534g)) {
            this.Q = true;
            this.f182145p.setVisibility(8);
            android.view.View view = this.f182154x;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f182144o.setVisibility(8);
            this.f182142m.setVisibility(8);
            this.f182143n.setVisibility(8);
            this.f182149s.setVisibility(8);
            java.lang.String c76 = c7();
            fp.k.b();
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.oy7);
            this.f182156z = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n8.a(mo55332x76847179());
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            viewGroup.addView((android.view.View) this.f182156z, 0, layoutParams);
            this.f182156z.mo69326x360a109e(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.j(this));
            fp.k.b();
            if (c76 != null) {
                this.f182156z.mo69303x360802();
                this.f182156z.mo69327xab3268fe(c76);
            }
            fp.k.b();
            b21.m.j();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11444, 4);
        }
        if (d7() == 15 || d7() == 4) {
            if (!this.Q) {
                android.view.View view2 = this.f182154x;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f182144o.setVisibility(8);
                this.f182142m.setVisibility(8);
                this.f182143n.setVisibility(0);
                this.f182143n.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cb9);
                this.f182149s.setVisibility(8);
                k7();
            }
            gm0.j1.e().j(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.k(this));
        } else {
            if (j7() && com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(o72.x1.x(this.F))) {
                android.view.View view3 = this.f182154x;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f182144o.setVisibility(8);
                this.f182142m.setVisibility(0);
                this.f182143n.setVisibility(8);
                this.f182149s.setVisibility(8);
                this.f182142m.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.l(this));
            } else {
                android.view.View view4 = this.f182154x;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f182144o.setVisibility(8);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.F.A)) {
                    this.f182142m.setVisibility(8);
                } else {
                    this.f182142m.setVisibility(0);
                }
                this.f182143n.setVisibility(0);
                this.f182133g.f425018j = true;
                if (i7(this.F)) {
                    this.f182150t.setVisibility(0);
                    this.f182151u.setVisibility(0);
                    this.f182143n.setVisibility(8);
                    this.f182149s.setVisibility(8);
                } else if (this.G) {
                    this.f182143n.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572041x2);
                    this.f182149s.setVisibility(8);
                } else {
                    this.f182149s.setVisibility(0);
                }
            }
        }
        if (this.S.getFileStatus() != 1) {
            this.S.mo65014x87c0aa90(1);
            ((d73.i) i95.n0.c(d73.i.class)).Jc(this.S);
        }
        int intExtra = getIntent().getIntExtra("key_detail_open_way", 0);
        if (this.G) {
            this.f182143n.performClick();
        } else {
            if (intExtra == 1) {
                r45.dq0 dq0Var = new r45.dq0();
                dq0Var.f454192m = 2;
                ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(mo55332x76847179(), this.E, dq0Var);
            } else {
                if (intExtra == 2) {
                    r45.dq0 dq0Var2 = new r45.dq0();
                    dq0Var2.f454192m = 2;
                    if (d7() == 8 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(this.F.T, this.N)) {
                        o72.r2 m150781x5a5dd5d = this.E.m150781x5a5dd5d();
                        m150781x5a5dd5d.f67657x2262335f = 8;
                        m150781x5a5dd5d.B1 = true;
                        m150781x5a5dd5d.C1 = this.E;
                        m150781x5a5dd5d.D1 = this.E.f67645x88be67a1 + "_" + this.N;
                        m150781x5a5dd5d.E1 = this.N;
                        r45.bq0 a17 = q72.c.a(this.E.f67640x5ab01132);
                        m150781x5a5dd5d.f67640x5ab01132 = a17;
                        a17.f452497f = new java.util.LinkedList();
                        m150781x5a5dd5d.f67640x5ab01132.f452497f.add(this.F);
                        m150781x5a5dd5d.f67640x5ab01132.p(this.F.f456937d);
                        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(mo55332x76847179(), m150781x5a5dd5d, dq0Var2);
                    } else {
                        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(mo55332x76847179(), this.E, dq0Var2);
                    }
                }
            }
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.z(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aca;
    }

    public final void h7() {
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.h(this));
        android.view.View view = this.f182154x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initWaitDownloadStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initWaitDownloadStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f182143n.setVisibility(8);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.F.A)) {
            this.f182142m.setVisibility(8);
        } else {
            this.f182142m.setVisibility(0);
        }
        this.f182144o.setVisibility(0);
        o72.e2 Xf = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(this.F.T);
        if (Xf == null || Xf.f67090x90a9378 <= 0) {
            this.f182144o.setText(this.E.P0() ? com.p314xaae8f345.mm.R.C30867xcad56011.cbb : com.p314xaae8f345.mm.R.C30867xcad56011.f572719dt0);
        } else {
            this.f182144o.setText(this.E.P0() ? com.p314xaae8f345.mm.R.C30867xcad56011.cba : com.p314xaae8f345.mm.R.C30867xcad56011.cb_);
        }
        this.f182149s.setVisibility(8);
    }

    public final boolean j7() {
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(c7());
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a()) {
            return m17.f294799a.F(m17.f294800b);
        }
        return false;
    }

    public final void k7() {
        if (this.P) {
            return;
        }
        this.f182133g.f425019k++;
        this.P = true;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_detail_info_id", this.M);
        intent.putExtra("key_detail_fav_path", c7());
        intent.putExtra("key_detail_fav_thumb_path", o72.x1.X(this.F));
        intent.putExtra("key_detail_fav_video_duration", this.F.f456981y);
        intent.putExtra("key_detail_statExtStr", this.F.R1);
        intent.putExtra("key_detail_msg_uuid", this.F.f456964q2);
        o72.x1.L0(this, ".ui.detail.FavoriteVideoPlayUI", intent, null);
        finish();
    }

    public final void l7() {
        java.lang.String stringExtra = getIntent().getStringExtra("key_detail_data_id");
        this.N = stringExtra;
        o72.r2 itemInfo = this.E;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        o72.b2 b2Var = o72.c2.f424850a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemInfo, "itemInfo");
        r45.gp0 a17 = b2Var.a(itemInfo.f67640x5ab01132, stringExtra);
        this.F = a17;
        if (a17 == null) {
            this.F = o72.x1.J(this.E);
        }
        if (this.F != null) {
            this.G = ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Ai(this.F.K);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13589x120fb59a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        ((x82.l0) ((o72.w4) i95.n0.c(o72.w4.class))).getClass();
        ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.f(this, i17, i18, intent, true, com.p314xaae8f345.mm.R.C30867xcad56011.h_1, com.p314xaae8f345.mm.R.C30867xcad56011.h_2, 2);
        if (i18 == -1 && i17 == 1) {
            java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            java.lang.String stringExtra2 = intent == null ? null : intent.getStringExtra("custom_send_text");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(mo55332x76847179(), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.cax), true, false, null);
            d7();
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.m mVar = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.m(this, Q);
            int d76 = d7();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                return;
            }
            java.util.Iterator it = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(",")).iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (d76 == 4 || d76 == 15) {
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.k(mo55332x76847179(), str, this.F, mVar);
                    boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str);
                    o72.o3.c(R4 ? o72.m3.Chatroom : o72.m3.Chat, this.E, o72.n3.Full, R4 ? c01.v1.o(str) : 0);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.g(mo55332x76847179(), str, this.E, this.F, mVar);
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                    ((dk5.s5) tg3.t1.a()).fj(str, stringExtra2, c01.e2.C(str), 0);
                }
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(getString(com.p314xaae8f345.mm.R.C30867xcad56011.c9u), null, this, null, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x032d, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(r5, 0) == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x033e, code lost:
    
        if (r12.E.t0() == false) goto L61;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13589x120fb59a, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 0, 0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571892sr));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        setResult(0, getIntent().putExtra("key_activity_browse_time", mo78509x4b0ac5a2()));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f182156z;
        if (f4Var != null) {
            f4Var.mo69326x360a109e(null);
            this.f182156z.mo69303x360802();
            this.f182156z.mo69312x3f5eee52();
        }
        p82.a aVar = this.T;
        if (aVar != null) {
            aVar.o0();
        }
        u82.a aVar2 = this.U;
        if (aVar2 != null) {
            aVar2.getClass();
        }
        if (this.S != null) {
            ((d73.i) i95.n0.c(d73.i.class)).a9(this.S);
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        p82.a aVar;
        u82.a aVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteFileDetailUI", "onKeyDown keyCode %d", java.lang.Integer.valueOf(i17));
        if (i17 == 4 && (aVar2 = this.U) != null && aVar2.U(2, false)) {
            return true;
        }
        if (i17 == 4 && (aVar = this.T) != null && aVar.m0(2)) {
            return true;
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteFileDetailUI", "on favitem change, notifyId:%s, curId:%d", str, java.lang.Long.valueOf(this.E.f67645x88be67a1));
        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.E.f67645x88be67a1);
        if (F == null && !this.f182141J) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteFileDetailUI", "error, on notify change, cannot find info");
            finish();
            return;
        }
        if (!this.f182141J) {
            this.E = F;
        }
        l7();
        o72.e2 Xf = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(this.F.T);
        boolean z17 = false;
        if (Xf != null) {
            if (Xf.f67093x10a0fed7 == 1) {
                z17 = true;
            } else if (d7() != 8 && !this.R) {
                if (Xf.f67093x10a0fed7 == 4 && ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(this.F.T).f67087x26b1b2e8 != 0) {
                    o72.x1.y0(this.E, this.F, true);
                    this.R = true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteFileDetailUI", "FavoriteFileDetail download, check retry, return %B", java.lang.Boolean.valueOf(this.R));
                z17 = this.R;
            }
        }
        if (z17) {
            return;
        }
        this.D.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.o(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        ((l75.s0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).mo49775xc84af884(this);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Y(this);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f182156z;
        if (f4Var != null) {
            f4Var.mo69303x360802();
        }
        p82.a aVar = this.T;
        if (aVar != null) {
            aVar.z();
        }
        u82.a aVar2 = this.U;
        if (aVar2 != null) {
            aVar2.A();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        ((l75.s0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).add(this);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Ia(this);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f182156z;
        if (f4Var != null) {
            f4Var.mo69330x68ac462();
        }
        p82.a aVar = this.T;
        if (aVar != null) {
            aVar.x();
        }
        u82.a aVar2 = this.U;
        if (aVar2 != null) {
            aVar2.z();
        }
    }
}
