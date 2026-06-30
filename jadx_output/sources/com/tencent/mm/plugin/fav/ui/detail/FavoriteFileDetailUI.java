package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class FavoriteFileDetailUI extends com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI implements o72.x3, l75.q0 {

    /* renamed from: x0, reason: collision with root package name */
    public static final long f100606x0 = ip.c.k();

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f100607y0 = 0;
    public android.widget.TextView A;
    public android.widget.ImageView B;
    public android.widget.TextView C;
    public com.tencent.mm.sdk.platformtools.n3 D;
    public o72.r2 E;
    public r45.gp0 F;
    public java.lang.String L;
    public long M;
    public java.lang.String N;
    public com.tencent.mm.plugin.handoff.model.AbsHandOffFile S;
    public p82.a T;
    public u82.a U;
    public int W;
    public int X;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f100609m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f100610n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f100611o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.MMImageView f100612p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f100614q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f100615r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f100616s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f100617t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f100618u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ProgressBar f100619v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f100620w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f100621x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f100622y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.f4 f100623z = null;
    public boolean G = false;
    public final o72.b3 H = new o72.b3();
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f100608J = false;
    public boolean K = true;
    public boolean P = false;
    public boolean Q = false;
    public boolean R = false;
    public rl5.r V = null;
    public final db5.t4 Y = new com.tencent.mm.plugin.fav.ui.detail.e(this);
    public final android.view.View.OnTouchListener Z = new com.tencent.mm.plugin.fav.ui.detail.f(this);

    /* renamed from: p0, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f100613p0 = new com.tencent.mm.plugin.fav.ui.detail.g(this);

    public static void Z6(com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI, java.lang.String str) {
        favoriteFileDetailUI.f100600g.f343486k++;
        bw5.ar0 ar0Var = bw5.ar0.TingScene_Fav;
        r45.gp0 gp0Var = favoriteFileDetailUI.F;
        com.tencent.mm.sdk.platformtools.o4 o4Var = o72.x1.f343515a;
        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
        if (o72.x1.t0(ar0Var, gp0Var, o72.x1.x(gp0Var))) {
            return;
        }
        o72.w4 w4Var = (o72.w4) i95.n0.c(o72.w4.class);
        java.lang.String str2 = favoriteFileDetailUI.F.K;
        ((x82.l0) w4Var).getClass();
        ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).wi(favoriteFileDetailUI, str, str2, 2);
    }

    public static void a7(com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI favoriteFileDetailUI) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteFileDetailUI", "click item favid %d, localid %d, itemstatus %d", java.lang.Integer.valueOf(favoriteFileDetailUI.E.field_id), java.lang.Long.valueOf(favoriteFileDetailUI.E.field_localId), java.lang.Integer.valueOf(favoriteFileDetailUI.E.field_itemStatus));
        if (!fp.i.b()) {
            db5.e1.i(favoriteFileDetailUI.getContext(), com.tencent.mm.R.string.cbp, com.tencent.mm.R.string.c__);
            return;
        }
        if (favoriteFileDetailUI.E.P0() || com.tencent.mm.sdk.platformtools.t8.K0(favoriteFileDetailUI.F.f375434s)) {
            o72.x1.D0(favoriteFileDetailUI.E, true);
        } else if (favoriteFileDetailUI.f100608J) {
            favoriteFileDetailUI.E.field_itemStatus = 7;
            o72.x1.z0(favoriteFileDetailUI.F, true, 18, -1L);
        } else {
            o72.x1.y0(favoriteFileDetailUI.E, favoriteFileDetailUI.F, true);
        }
        favoriteFileDetailUI.e7();
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
        java.lang.String str2 = gp0Var.f375404d;
        return str2 != null && str2.matches(".*\\.apk(.1)*");
    }

    @Override // o72.x3
    public void R4(o72.e2 e2Var) {
        java.lang.String str;
        if (e2Var == null || (str = e2Var.field_dataId) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteFileDetailUI", "on cdn status changed, item is null");
            return;
        }
        if (str.equals(this.F.T)) {
            if (this.E.Q0() && com.tencent.mm.sdk.platformtools.t8.K0(this.F.f375434s)) {
                this.D.post(new com.tencent.mm.plugin.fav.ui.detail.n(this, e2Var.v0(), getString(com.tencent.mm.R.string.cdv, o72.x1.O(e2Var.field_offset), o72.x1.O(e2Var.field_totalLen))));
                return;
            }
            this.D.post(new com.tencent.mm.plugin.fav.ui.detail.n(this, e2Var.v0(), getString(com.tencent.mm.R.string.f491193ca2, o72.x1.O(e2Var.field_offset), o72.x1.O(e2Var.field_totalLen))));
            if (this.f100608J && com.tencent.mm.vfs.w6.j(e2Var.field_path)) {
                this.E.field_itemStatus = 10;
                onNotifyChange("", null);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    /* renamed from: b7, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.ui.MMActivity getContext() {
        return (com.tencent.mm.ui.MMActivity) super.getContext();
    }

    public final java.lang.String c7() {
        java.lang.String stringExtra = getIntent().getStringExtra("key_detail_custom_file_path");
        return !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) ? stringExtra : o72.x1.x(this.F);
    }

    public final int d7() {
        r45.jp0 jp0Var;
        r45.jp0 jp0Var2;
        r45.gp0 gp0Var = this.F;
        if (gp0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteFileDetailUI", "get type but data item is null");
            return 8;
        }
        int i17 = gp0Var.I;
        if (i17 != 0) {
            if (i17 == 15) {
                return (gp0Var == null || (jp0Var = gp0Var.O1) == null || (com.tencent.mm.sdk.platformtools.t8.K0(jp0Var.f377998d) && com.tencent.mm.sdk.platformtools.t8.K0(this.F.O1.f378001g))) ? 4 : 15;
            }
            if (i17 == 10130) {
                return 8;
            }
            return i17;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteFileDetailUI", "get data type, but data item type is 0, info type %d", java.lang.Integer.valueOf(this.E.field_type));
        int i18 = this.E.field_type;
        if (4 == i18) {
            return 4;
        }
        if (16 != i18) {
            return 8;
        }
        r45.gp0 gp0Var2 = this.F;
        return (gp0Var2 == null || (jp0Var2 = gp0Var2.O1) == null || (com.tencent.mm.sdk.platformtools.t8.K0(jp0Var2.f377998d) && com.tencent.mm.sdk.platformtools.t8.K0(this.F.O1.f378001g))) ? 4 : 15;
    }

    public final void e7() {
        int i17;
        int i18;
        this.f100611o.setVisibility(8);
        this.f100609m.setVisibility(8);
        this.f100610n.setVisibility(8);
        this.f100616s.setVisibility(8);
        android.view.View view = this.f100621x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        int i19 = 0;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initDownloadingStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initDownloadingStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        o72.e2 Xf = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(this.F.T);
        if (Xf != null) {
            int v07 = (int) Xf.v0();
            int i27 = Xf.field_offset;
            i17 = Xf.field_totalLen;
            i19 = i27;
            i18 = v07;
        } else {
            i17 = (int) this.F.R;
            i18 = 0;
        }
        if (this.E.Q0() && com.tencent.mm.sdk.platformtools.t8.K0(this.F.f375434s)) {
            this.D.post(new com.tencent.mm.plugin.fav.ui.detail.n(this, i18, getString(com.tencent.mm.R.string.cdv, o72.x1.O(i19), o72.x1.O(i17))));
        } else {
            this.D.post(new com.tencent.mm.plugin.fav.ui.detail.n(this, i18, getString(com.tencent.mm.R.string.f491193ca2, o72.x1.O(i19), o72.x1.O(i17))));
        }
    }

    public final void f7() {
        this.f100612p.setVisibility(8);
        this.f100614q.setVisibility(8);
        this.f100611o.setVisibility(8);
        this.f100609m.setVisibility(8);
        this.f100610n.setVisibility(8);
        android.view.View view = this.f100621x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOutOfDateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOutOfDateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f100616s.setVisibility(8);
        this.B.setVisibility(0);
        this.C.setVisibility(0);
        if (this.F.I == 4) {
            this.f100616s.setGravity(17);
            this.f100616s.setText(com.tencent.mm.R.string.cbv);
            return;
        }
        this.f100616s.setGravity(17);
        this.f100616s.setText(com.tencent.mm.R.string.cbu);
        if (this.F.X1 == 2) {
            this.C.setText(com.tencent.mm.R.string.c_o);
        } else {
            this.C.setText(com.tencent.mm.R.string.c_p);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
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
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteFileDetailUI", "init status, info type %d, exist:%B path:%s", java.lang.Integer.valueOf(this.E.field_itemStatus), java.lang.Boolean.valueOf(j76), c7());
        if (this.F.X1 != 0) {
            f7();
            k82.c.f304887a.e(this.M, this.F.X1 != 2 ? 1 : 2);
            return;
        }
        if (!this.E.I0() && !j76 && com.tencent.mm.sdk.platformtools.t8.K0(this.F.f375434s)) {
            o72.r2 r2Var = this.E;
            if (r2Var.field_itemStatus == 8) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.F.f375434s)) {
                    h7();
                    if (z17) {
                        db5.e1.T(getContext(), getString(com.tencent.mm.R.string.brf));
                        return;
                    }
                    return;
                }
                f7();
                if (z17) {
                    int d76 = d7();
                    db5.e1.T(getContext(), getString((4 == d76 || 15 == d76) ? com.tencent.mm.R.string.ccc : com.tencent.mm.R.string.cc7));
                }
                k82.c.f304887a.e(this.M, 1);
                return;
            }
            if (r2Var.P0()) {
                h7();
                if (z17) {
                    db5.e1.T(getContext(), getString(com.tencent.mm.R.string.c_9));
                    return;
                }
                return;
            }
            if (this.E.J0() || this.E.Q0()) {
                e7();
                return;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteFileDetailUI", "other status, not done, downloading, uploading, downloadfail, uploadfail");
                h7();
                return;
            }
        }
        if (!j76) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.F.f375434s)) {
                f7();
                k82.c.f304887a.e(this.M, this.F.X1 != 2 ? 1 : 2);
                return;
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteFileDetailUI", "? info is done, source file not exist, cdn data url is not null");
                h7();
                return;
            }
        }
        if (d7() == 15 && (jp0Var = this.F.O1) != null && !com.tencent.mm.sdk.platformtools.t8.K0(jp0Var.f377998d) && !com.tencent.mm.sdk.platformtools.t8.K0(this.F.O1.f378001g)) {
            this.Q = true;
            this.f100612p.setVisibility(8);
            android.view.View view = this.f100621x;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f100611o.setVisibility(8);
            this.f100609m.setVisibility(8);
            this.f100610n.setVisibility(8);
            this.f100616s.setVisibility(8);
            java.lang.String c76 = c7();
            fp.k.b();
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.oy7);
            this.f100623z = com.tencent.mm.pluginsdk.ui.tools.n8.a(getContext());
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            viewGroup.addView((android.view.View) this.f100623z, 0, layoutParams);
            this.f100623z.setVideoCallback(new com.tencent.mm.plugin.fav.ui.detail.j(this));
            fp.k.b();
            if (c76 != null) {
                this.f100623z.stop();
                this.f100623z.setVideoPath(c76);
            }
            fp.k.b();
            b21.m.j();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11444, 4);
        }
        if (d7() == 15 || d7() == 4) {
            if (!this.Q) {
                android.view.View view2 = this.f100621x;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f100611o.setVisibility(8);
                this.f100609m.setVisibility(8);
                this.f100610n.setVisibility(0);
                this.f100610n.setText(com.tencent.mm.R.string.cb9);
                this.f100616s.setVisibility(8);
                k7();
            }
            gm0.j1.e().j(new com.tencent.mm.plugin.fav.ui.detail.k(this));
        } else {
            if (j7() && com.tencent.mm.sdk.platformtools.y1.c(o72.x1.x(this.F))) {
                android.view.View view3 = this.f100621x;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f100611o.setVisibility(8);
                this.f100609m.setVisibility(0);
                this.f100610n.setVisibility(8);
                this.f100616s.setVisibility(8);
                this.f100609m.setOnClickListener(new com.tencent.mm.plugin.fav.ui.detail.l(this));
            } else {
                android.view.View view4 = this.f100621x;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f100611o.setVisibility(8);
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.F.A)) {
                    this.f100609m.setVisibility(8);
                } else {
                    this.f100609m.setVisibility(0);
                }
                this.f100610n.setVisibility(0);
                this.f100600g.f343485j = true;
                if (i7(this.F)) {
                    this.f100617t.setVisibility(0);
                    this.f100618u.setVisibility(0);
                    this.f100610n.setVisibility(8);
                    this.f100616s.setVisibility(8);
                } else if (this.G) {
                    this.f100610n.setText(com.tencent.mm.R.string.f490508x2);
                    this.f100616s.setVisibility(8);
                } else {
                    this.f100616s.setVisibility(0);
                }
            }
        }
        if (this.S.getFileStatus() != 1) {
            this.S.setFileStatus(1);
            ((d73.i) i95.n0.c(d73.i.class)).Jc(this.S);
        }
        int intExtra = getIntent().getIntExtra("key_detail_open_way", 0);
        if (this.G) {
            this.f100610n.performClick();
        } else {
            if (intExtra == 1) {
                r45.dq0 dq0Var = new r45.dq0();
                dq0Var.f372659m = 2;
                ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(getContext(), this.E, dq0Var);
            } else {
                if (intExtra == 2) {
                    r45.dq0 dq0Var2 = new r45.dq0();
                    dq0Var2.f372659m = 2;
                    if (d7() == 8 && com.tencent.mm.sdk.platformtools.t8.D0(this.F.T, this.N)) {
                        o72.r2 clone = this.E.clone();
                        clone.field_type = 8;
                        clone.B1 = true;
                        clone.C1 = this.E;
                        clone.D1 = this.E.field_localId + "_" + this.N;
                        clone.E1 = this.N;
                        r45.bq0 a17 = q72.c.a(this.E.field_favProto);
                        clone.field_favProto = a17;
                        a17.f370964f = new java.util.LinkedList();
                        clone.field_favProto.f370964f.add(this.F);
                        clone.field_favProto.p(this.F.f375404d);
                        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(getContext(), clone, dq0Var2);
                    } else {
                        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(getContext(), this.E, dq0Var2);
                    }
                }
            }
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.fav.ui.detail.z(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aca;
    }

    public final void h7() {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.fav.ui.detail.h(this));
        android.view.View view = this.f100621x;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initWaitDownloadStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/detail/FavoriteFileDetailUI", "initWaitDownloadStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f100610n.setVisibility(8);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.F.A)) {
            this.f100609m.setVisibility(8);
        } else {
            this.f100609m.setVisibility(0);
        }
        this.f100611o.setVisibility(0);
        o72.e2 Xf = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(this.F.T);
        if (Xf == null || Xf.field_offset <= 0) {
            this.f100611o.setText(this.E.P0() ? com.tencent.mm.R.string.cbb : com.tencent.mm.R.string.f491186dt0);
        } else {
            this.f100611o.setText(this.E.P0() ? com.tencent.mm.R.string.cba : com.tencent.mm.R.string.cb_);
        }
        this.f100616s.setVisibility(8);
    }

    public final boolean j7() {
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(c7());
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a()) {
            return m17.f213266a.F(m17.f213267b);
        }
        return false;
    }

    public final void k7() {
        if (this.P) {
            return;
        }
        this.f100600g.f343486k++;
        this.P = true;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_detail_info_id", this.M);
        intent.putExtra("key_detail_fav_path", c7());
        intent.putExtra("key_detail_fav_thumb_path", o72.x1.X(this.F));
        intent.putExtra("key_detail_fav_video_duration", this.F.f375448y);
        intent.putExtra("key_detail_statExtStr", this.F.R1);
        intent.putExtra("key_detail_msg_uuid", this.F.f375431q2);
        o72.x1.L0(this, ".ui.detail.FavoriteVideoPlayUI", intent, null);
        finish();
    }

    public final void l7() {
        java.lang.String stringExtra = getIntent().getStringExtra("key_detail_data_id");
        this.N = stringExtra;
        o72.r2 itemInfo = this.E;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        o72.b2 b2Var = o72.c2.f343317a;
        kotlin.jvm.internal.o.g(itemInfo, "itemInfo");
        r45.gp0 a17 = b2Var.a(itemInfo.field_favProto, stringExtra);
        this.F = a17;
        if (a17 == null) {
            this.F = o72.x1.J(this.E);
        }
        if (this.F != null) {
            this.G = ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Ai(this.F.K);
        }
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.plugin.fav.ui.detail.BaseFavSearchReportUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        ((x82.l0) ((o72.w4) i95.n0.c(o72.w4.class))).getClass();
        ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
        com.tencent.mm.pluginsdk.ui.tools.f.f(this, i17, i18, intent, true, com.tencent.mm.R.string.h_1, com.tencent.mm.R.string.h_2, 2);
        if (i18 == -1 && i17 == 1) {
            java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            java.lang.String stringExtra2 = intent == null ? null : intent.getStringExtra("custom_send_text");
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(getContext(), "", getString(com.tencent.mm.R.string.cax), true, false, null);
            d7();
            com.tencent.mm.plugin.fav.ui.detail.m mVar = new com.tencent.mm.plugin.fav.ui.detail.m(this, Q);
            int d76 = d7();
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                return;
            }
            java.util.Iterator it = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(",")).iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (d76 == 4 || d76 == 15) {
                    com.tencent.mm.plugin.fav.ui.x5.k(getContext(), str, this.F, mVar);
                    boolean R4 = com.tencent.mm.storage.z3.R4(str);
                    o72.o3.c(R4 ? o72.m3.Chatroom : o72.m3.Chat, this.E, o72.n3.Full, R4 ? c01.v1.o(str) : 0);
                } else {
                    com.tencent.mm.plugin.fav.ui.x5.g(getContext(), str, this.E, this.F, mVar);
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                    ((dk5.s5) tg3.t1.a()).fj(str, stringExtra2, c01.e2.C(str), 0);
                }
            }
            com.tencent.mm.ui.widget.snackbar.j.c(getString(com.tencent.mm.R.string.c9u), null, this, null, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x032d, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.D1(r5, 0) == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x033e, code lost:
    
        if (r12.E.t0() == false) goto L61;
     */
    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.plugin.fav.ui.detail.BaseFavSearchReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 0, 0, getString(com.tencent.mm.R.string.f490359sr));
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        setResult(0, getIntent().putExtra("key_activity_browse_time", getActivityBrowseTimeMs()));
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f100623z;
        if (f4Var != null) {
            f4Var.setVideoCallback(null);
            this.f100623z.stop();
            this.f100623z.onDetach();
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

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        p82.a aVar;
        u82.a aVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteFileDetailUI", "onKeyDown keyCode %d", java.lang.Integer.valueOf(i17));
        if (i17 == 4 && (aVar2 = this.U) != null && aVar2.U(2, false)) {
            return true;
        }
        if (i17 == 4 && (aVar = this.T) != null && aVar.m0(2)) {
            return true;
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteFileDetailUI", "on favitem change, notifyId:%s, curId:%d", str, java.lang.Long.valueOf(this.E.field_localId));
        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.E.field_localId);
        if (F == null && !this.f100608J) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteFileDetailUI", "error, on notify change, cannot find info");
            finish();
            return;
        }
        if (!this.f100608J) {
            this.E = F;
        }
        l7();
        o72.e2 Xf = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(this.F.T);
        boolean z17 = false;
        if (Xf != null) {
            if (Xf.field_status == 1) {
                z17 = true;
            } else if (d7() != 8 && !this.R) {
                if (Xf.field_status == 4 && ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(this.F.T).field_extFlag != 0) {
                    o72.x1.y0(this.E, this.F, true);
                    this.R = true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteFileDetailUI", "FavoriteFileDetail download, check retry, return %B", java.lang.Boolean.valueOf(this.R));
                z17 = this.R;
            }
        }
        if (z17) {
            return;
        }
        this.D.post(new com.tencent.mm.plugin.fav.ui.detail.o(this));
    }

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((l75.s0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).remove(this);
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Y(this);
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f100623z;
        if (f4Var != null) {
            f4Var.stop();
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

    @Override // com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((l75.s0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).add(this);
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Ia(this);
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f100623z;
        if (f4Var != null) {
            f4Var.start();
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
