package com.tencent.mm.plugin.fav.ui;

@db5.a(2048)
/* loaded from: classes12.dex */
public class FavoriteIndexUI extends com.tencent.mm.plugin.fav.ui.FavBaseUI implements s82.h, w82.a0, w82.r1 {

    /* renamed from: y1, reason: collision with root package name */
    public static final /* synthetic */ int f100436y1 = 0;
    public com.tencent.mm.plugin.fav.ui.adapter.c T;
    public w82.k U;
    public o72.r2 V;
    public android.widget.TextView X;
    public com.tencent.mm.ui.widget.dialog.y1 Z;

    /* renamed from: p1, reason: collision with root package name */
    public o72.r2 f100439p1;
    public long S = 0;
    public int W = 0;
    public java.lang.String Y = "";

    /* renamed from: p0, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f100438p0 = null;

    /* renamed from: x0, reason: collision with root package name */
    public final int[] f100440x0 = new int[2];

    /* renamed from: y0, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f100442y0 = new com.tencent.mm.plugin.fav.ui.tb(this);

    /* renamed from: l1, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemLongClickListener f100437l1 = new com.tencent.mm.plugin.fav.ui.vb(this);

    /* renamed from: x1, reason: collision with root package name */
    public final android.view.View.OnClickListener f100441x1 = new com.tencent.mm.plugin.fav.ui.xa(this);

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$4, reason: invalid class name */
    /* loaded from: classes12.dex */
    class AnonymousClass4 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FavUsageChangedEvent> {
        public AnonymousClass4(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = 354680028;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.FavUsageChangedEvent favUsageChangedEvent) {
            com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.this.f100279t.post(new com.tencent.mm.plugin.fav.ui.rb(this));
            return true;
        }
    }

    public static void o7(com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI, android.content.Context context, int i17, com.tencent.mm.plugin.fav.ui.adapter.c cVar, o72.r2 r2Var) {
        java.lang.String str;
        int i18;
        boolean z17;
        favoriteIndexUI.getClass();
        long i19 = ip.c.i();
        int i27 = com.tencent.mm.R.string.c_s;
        if (4105 == i17) {
            r2 = cVar != null ? cVar.m() : 0L;
            str = "fav_multi_send,";
        } else if (4106 == i17) {
            r2 = r2Var != null ? r2Var.field_datatotalsize : 0L;
            if (r2Var.field_type == 18) {
                i19 = ip.c.h();
                i18 = com.tencent.mm.R.string.c_t;
            } else {
                i19 = ip.c.i();
                i18 = com.tencent.mm.R.string.c_u;
            }
            i27 = i18;
            str = "fav_trans_send,";
        } else {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteMenuHelper", "%s totalSize:%s, maxLimitSize:%s", str, java.lang.Long.valueOf(r2), java.lang.Long.valueOf(i19));
        if (r2 > i19) {
            db5.e1.T(context, context.getString(i27, com.tencent.mm.sdk.platformtools.t8.f0(i19)));
            z17 = true;
        } else {
            z17 = false;
        }
        if (!z17 && com.tencent.mm.plugin.fav.ui.ec.g(context, i17, cVar, r2Var)) {
            o72.z2.a(".ui.transmit.SelectConversationUI");
        }
    }

    public static void p7(com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI) {
        java.lang.String str;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = favoriteIndexUI.Z;
        if (y1Var != null) {
            android.view.View view = y1Var.f212027f;
            long a07 = o72.x1.a0();
            long b07 = o72.x1.b0();
            if (b07 > a07) {
                b07 = a07;
            }
            java.lang.String O = o72.x1.O((float) a07);
            java.lang.String O2 = o72.x1.O((float) b07);
            com.tencent.mm.ui.bk.r0(((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc)).getPaint(), 0.8f);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.vkz);
            textView.setText(O2 + " / " + O);
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            java.util.List o47 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().o4();
            long j17 = 0;
            if (o47 != null) {
                java.util.Iterator it = o47.iterator();
                while (it.hasNext()) {
                    j17 += o72.x1.b((o72.r2) it.next());
                }
            }
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.tzb);
            int i17 = favoriteIndexUI.f100279t.f443823n;
            if (i17 == 1) {
                str = favoriteIndexUI.getContext().getString(com.tencent.mm.R.string.ntz, o72.x1.O((float) (j17 - o72.x1.K())));
            } else if (i17 == 3) {
                str = favoriteIndexUI.getContext().getString(com.tencent.mm.R.string.f491741nu0, o72.x1.O((float) o72.x1.K()));
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(str);
            }
        }
    }

    public static boolean r7(java.util.List list, android.content.Context context, android.content.DialogInterface.OnClickListener onClickListener, boolean z17, boolean z18) {
        r45.bq0 bq0Var;
        r45.op0 op0Var;
        if (list == null || list.isEmpty()) {
            return true;
        }
        o72.b3 b3Var = new o72.b3();
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        boolean z19 = false;
        while (it.hasNext()) {
            o72.r2 r2Var = (o72.r2) it.next();
            if (r2Var != null && (bq0Var = r2Var.field_favProto) != null && bq0Var.f370964f != null) {
                int i37 = r2Var.field_type;
                if (i37 == 3) {
                    i27++;
                } else if (i37 == 19 && com.tencent.mm.plugin.fav.ui.b0.b(bq0Var.I)) {
                    i28++;
                } else if ((r2Var.field_type == 5 && o72.j3.a(r2Var.field_favProto.f370968m)) || (r2Var.field_type == 24 && (op0Var = r2Var.field_favProto.P) != null && op0Var.f382420t)) {
                    i29++;
                } else {
                    java.util.Iterator it6 = r2Var.field_favProto.f370964f.iterator();
                    int i38 = 0;
                    while (it6.hasNext()) {
                        int i39 = ((r45.gp0) it6.next()).X1;
                        java.util.Iterator it7 = it6;
                        if (i39 == 2) {
                            i17++;
                        } else if (i39 == 1) {
                            i18++;
                        } else {
                            i38++;
                        }
                        it6 = it7;
                    }
                    if (b3Var.a(r2Var, z17, z18)) {
                        i19++;
                        if (i38 > 0) {
                            i38--;
                        }
                    }
                    if (!z19 && i38 == r2Var.field_favProto.f370964f.size()) {
                        z19 = true;
                    }
                }
            }
        }
        if (1 != list.size()) {
            if (i17 <= 0 && i18 <= 0 && i19 <= 0 && i27 <= 0 && i28 <= 0 && i29 <= 0) {
                return true;
            }
            if (z19) {
                db5.e1.B(context, context.getString(z17 ? com.tencent.mm.R.string.nxu : com.tencent.mm.R.string.f491191ca1), "", context.getString(com.tencent.mm.R.string.f490939bb1), context.getString(com.tencent.mm.R.string.baz), onClickListener, null, com.tencent.mm.R.color.aaq);
                return false;
            }
            db5.e1.T(context, context.getString(com.tencent.mm.R.string.f491190ca0));
            return false;
        }
        if (((o72.r2) list.get(0)).field_type == 14 && (i17 > 0 || i18 > 0)) {
            db5.e1.T(context, context.getString(com.tencent.mm.R.string.c_v));
            return false;
        }
        if (i17 > 0) {
            db5.e1.T(context, context.getString(com.tencent.mm.R.string.c_w, java.lang.Integer.valueOf(((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).rj(((o72.r2) list.get(0)).field_type))));
            return false;
        }
        if (i18 > 0) {
            int i47 = ((o72.r2) list.get(0)).field_type;
            if (i47 == 2) {
                db5.e1.T(context, context.getString(com.tencent.mm.R.string.c_y));
                return false;
            }
            if (i47 != 4) {
                if (i47 == 8) {
                    db5.e1.T(context, context.getString(com.tencent.mm.R.string.c_x));
                    return false;
                }
                if (i47 != 16) {
                    return false;
                }
            }
            db5.e1.T(context, context.getString(com.tencent.mm.R.string.c_z));
            return false;
        }
        if (i19 > 0) {
            db5.e1.T(context, context.getString(com.tencent.mm.R.string.f489705e));
            return false;
        }
        if (i27 > 0) {
            db5.e1.T(context, context.getString(com.tencent.mm.R.string.f489706f));
            return false;
        }
        if (i28 > 0) {
            db5.e1.T(context, context.getString(com.tencent.mm.R.string.f489703c));
            return false;
        }
        if (i29 <= 0) {
            return true;
        }
        db5.e1.T(context, context.getString(com.tencent.mm.R.string.f489707g));
        return false;
    }

    @Override // s82.h
    public void F4(long j17, boolean z17) {
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = this.T;
        if (cVar.f100484q) {
            this.U.b(cVar.l() > 0);
            Z6(this.T.l());
        }
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI
    public boolean V6() {
        return ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().getCount() > 0;
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI
    public void a7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "enterMoreModeImpl hide post");
        showOptionMenu(11, false);
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI
    public void c7() {
        t7();
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI
    public com.tencent.mm.plugin.fav.ui.adapter.b d7() {
        if (this.T == null) {
            com.tencent.mm.plugin.fav.ui.adapter.c cVar = new com.tencent.mm.plugin.fav.ui.adapter.c(getContext(), this.f100281v, false);
            this.T = cVar;
            cVar.f100477h = new com.tencent.mm.plugin.fav.ui.ta(this);
            cVar.f100492y = this;
            cVar.F = 1;
            cVar.I = this.f100270h;
        }
        return this.T;
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI
    public java.util.Set e7() {
        return new java.util.HashSet();
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI
    public o72.i4 f7() {
        return null;
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI
    public android.view.View.OnClickListener g7() {
        return this.f100441x1;
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI
    public java.lang.String h7() {
        return i65.a.r(this, com.tencent.mm.R.string.f491198cb1);
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI
    public void j7() {
        super.j7();
        this.f100279t.b(false);
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI
    public void l7() {
        this.f100279t.post(new com.tencent.mm.plugin.fav.ui.ua(this));
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI
    public void m7() {
        this.f100272m.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.favorites_regular, getResources().getColor(com.tencent.mm.R.color.f478520a84)));
        this.f100271i.setText(com.tencent.mm.R.string.ca7);
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI
    public void n7() {
        super.n7();
        this.f100275p.post(new com.tencent.mm.plugin.fav.ui.ub(this));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x00e8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0329  */
    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r20, int r21, android.content.Intent r22) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o25.n1.d(this, getContentView());
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f100285z = this;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "onCreate favoriteindex");
        super.onCreate(bundle);
        if (((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().u2() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavoriteIndexUI", "onCreate favoriteindex, but favorite db is null ,return");
            finish();
            return;
        }
        ((m82.l) pf5.z.f353948a.a(this).a(m82.l.class)).f324713d = this.D;
        setMMTitle(com.tencent.mm.R.string.f491198cb1);
        setBackBtn(new com.tencent.mm.plugin.fav.ui.gb(this));
        this.f100270h.setOnItemLongClickListener(this.f100437l1);
        this.f100270h.setOnTouchListener(new com.tencent.mm.plugin.fav.ui.pb(this));
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.modelbase.u0 u0Var = this.f100442y0;
        d17.a(438, u0Var);
        gm0.j1.d().a(401, u0Var);
        android.view.LayoutInflater.from(this);
        new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this, 1, false);
        new db5.g4(this);
        new db5.g4(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "initPostEntry: ");
        addIconOptionMenu(11, com.tencent.mm.R.string.c98, com.tencent.mm.R.raw.icons_outlined_add2, new com.tencent.mm.plugin.fav.ui.wa(this));
        boolean z17 = this.F;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "initSelectAllButton: useTopFilter=%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "initSelectAllButton: calling addTextOptionMenu with text: %s", getString(com.tencent.mm.R.string.nxf));
            addTextOptionMenu(12, getString(com.tencent.mm.R.string.nxf), new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$$b
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                    com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var;
                    com.tencent.mm.plugin.fav.ui.gallery.y1 y1Var;
                    com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.this;
                    int i17 = com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.f100436y1;
                    favoriteIndexUI.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "Select All button clicked");
                    if (favoriteIndexUI.F) {
                        h0Var = ((com.tencent.mm.plugin.fav.ui.da) pf5.z.f353948a.a(favoriteIndexUI).a(com.tencent.mm.plugin.fav.ui.da.class)).f100582m;
                        if (h0Var == null) {
                            kotlin.jvm.internal.o.o("mFavGallery");
                            throw null;
                        }
                    } else {
                        h0Var = null;
                    }
                    if (h0Var == null || !h0Var.a() || (y1Var = h0Var.f100941a) == null) {
                        return true;
                    }
                    com.tencent.mm.plugin.fav.ui.gallery.l2 l2Var = (com.tencent.mm.plugin.fav.ui.gallery.l2) y1Var;
                    if (l2Var.d()) {
                        com.tencent.mm.plugin.fav.ui.gallery.a1 a1Var = h0Var.f100960t;
                        if (a1Var != null) {
                            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_cancel_select_all_btn", "view_clk", a1Var.c(h0Var.f100941a), 32903);
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[unselectAll] Clear all selections");
                        com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a.b();
                        l2Var.f100996d.notifyDataSetChanged();
                        com.tencent.mm.plugin.fav.ui.gallery.z1 z1Var = l2Var.f100993a;
                        if (z1Var != null) {
                            ((com.tencent.mm.plugin.fav.ui.gallery.h0) z1Var).k(0);
                            com.tencent.mm.plugin.fav.ui.gallery.z0 z0Var = ((com.tencent.mm.plugin.fav.ui.gallery.h0) l2Var.f100993a).f100963w;
                            if (z0Var != null) {
                                ((com.tencent.mm.plugin.fav.ui.t9) z0Var).c(null);
                            }
                        }
                    } else {
                        com.tencent.mm.plugin.fav.ui.gallery.a1 a1Var2 = h0Var.f100960t;
                        if (a1Var2 != null) {
                            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_select_all_btn", "view_clk", a1Var2.c(h0Var.f100941a), 32903);
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[selectAll] Start loading all image/video data from database");
                        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.fav.ui.gallery.k2(l2Var));
                    }
                    favoriteIndexUI.invalidateOptionsMenu();
                    return true;
                }
            });
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "initSelectAllButton: hiding select all button by default");
            showOptionMenu(12, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "initSelectAllButton: completed");
        }
        w82.k kVar = new w82.k();
        this.U = kVar;
        kVar.a(findViewById(com.tencent.mm.R.id.dtg));
        this.U.f443903k = new com.tencent.mm.plugin.fav.ui.ab(this);
        gm0.j1.e().j(new com.tencent.mm.plugin.fav.ui.mb(this));
        o72.i2.b().a(null);
        kk.j jVar = com.tencent.mm.plugin.fav.ui.u1.f101464a;
        o72.z2.f343535a = new java.util.Vector();
        o25.n1.d(this, getContentView());
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FavoriteIndexUI)).Rj(this, iy1.a.Fav);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(43, 34, 188, getIntent());
        android.widget.TextView textView = (android.widget.TextView) this.f100274o.findViewById(com.tencent.mm.R.id.v_8);
        this.X = textView;
        ym5.a1.h(textView, new com.tencent.mm.plugin.fav.ui.qb(this));
        this.X.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.f100436y1;
                com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.this;
                favoriteIndexUI.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/fav/ui/FavoriteIndexUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", favoriteIndexUI, array);
                favoriteIndexUI.s7("");
                favoriteIndexUI.v7("view_clk");
                yj0.a.h(favoriteIndexUI, "com/tencent/mm/plugin/fav/ui/FavoriteIndexUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.f100279t.setUsageTipsBarVisibilityListener(this);
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.AnonymousClass4 anonymousClass4 = new com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.AnonymousClass4(com.tencent.mm.app.a0.f53288d);
        this.f100438p0 = anonymousClass4;
        anonymousClass4.alive();
        android.view.View view = this.f100274o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavoriteIndexUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavoriteIndexUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.Y = gm0.j1.b().j() + "_" + java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.fav.ui.da daVar = (com.tencent.mm.plugin.fav.ui.da) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.fav.ui.da.class);
        java.lang.String str = this.Y;
        daVar.getClass();
        kotlin.jvm.internal.o.g(str, "<set-?>");
        daVar.H = str;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        boolean z17 = this.F;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "onCreateOptionsMenu: called, useTopFilter=%b, menu size=%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(menu.size()));
        if (!z17) {
            android.view.MenuItem add = menu.add(0, 10, 0, com.tencent.mm.R.string.jzr);
            add.setIcon(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.actionbar_icon_dark_search, getResources().getColor(com.tencent.mm.R.color.FG_0)));
            add.setShowAsAction(2);
        }
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "onCreateOptionsMenu: completed, result=%b, menu size=%d", java.lang.Boolean.valueOf(onCreateOptionsMenu), java.lang.Integer.valueOf(menu.size()));
        return onCreateOptionsMenu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f2, code lost:
    
        r6[r9] = r0;
     */
    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.onDestroy():void");
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = this.T;
        if (cVar != null) {
            cVar.onItemClick(adapterView, view, i17, j17);
            s82.g gVar = (s82.g) view.getTag();
            if (gVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteIndexUI", "on item click, holder is null..");
                return;
            }
            o72.r2 r2Var = gVar.f404774a;
            if (r2Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FavoriteIndexUI", "on item click, info is null..");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "click type is %d", java.lang.Integer.valueOf(r2Var.field_type));
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12746, java.lang.Integer.valueOf(gVar.f404774a.field_type), 0, java.lang.Integer.valueOf(i17 - 1));
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (4 != i17 || !this.T.f100484q) {
            return super.onKeyUp(i17, keyEvent);
        }
        t7();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        if (this.F || menuItem.getItemId() != 10) {
            return super.onOptionsItemSelected(menuItem);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_enter_fav_search_from", 0);
        com.tencent.mm.plugin.fav.ui.ec.e(getContext(), this.T.f100484q, intent);
        return true;
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        o72.z2.c(getClass().getSimpleName(), "");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 64) {
            if (i17 != 80) {
                return;
            }
            if (iArr[0] != 0) {
                db5.e1.C(this, getString(com.tencent.mm.R.string.hhn), "", getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.fav.ui.ib(this), new com.tencent.mm.plugin.fav.ui.jb(this));
                return;
            } else {
                o72.x1.M0(this, ".ui.FavPostVoiceUI", new android.content.Intent(), 4102, null);
                overridePendingTransition(0, 0);
                return;
            }
        }
        if (iArr[0] != 0) {
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhm), "", getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.fav.ui.kb(this), new com.tencent.mm.plugin.fav.ui.lb(this));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477855dd);
        intent.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477783bc);
        intent.putExtra("map_view_type", 3);
        j45.l.n(this, ya.b.LOCATION, ".ui.RedirectUI", intent, 4097);
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        java.lang.System.currentTimeMillis();
        super.onResume();
        this.f100275p.post(new com.tencent.mm.plugin.fav.ui.va(this));
        java.lang.System.currentTimeMillis();
        o72.z2.a(getClass().getSimpleName());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q7(java.util.List r22, java.lang.String r23, java.lang.String r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.q7(java.util.List, java.lang.String, java.lang.String, boolean):void");
    }

    public void s7(java.lang.String str) {
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.Z;
        if (y1Var != null) {
            y1Var.q();
        }
        com.tencent.mm.ui.widget.dialog.y1 y1Var2 = new com.tencent.mm.ui.widget.dialog.y1(this);
        this.Z = y1Var2;
        y1Var2.j(com.tencent.mm.R.layout.f488761e55);
        android.view.View view = this.Z.f212027f;
        view.setBackground(null);
        view.findViewById(com.tencent.mm.R.id.f483758bz2).setOnClickListener(new com.tencent.mm.plugin.fav.ui.nb(this));
        long a07 = o72.x1.a0();
        long b07 = o72.x1.b0();
        if (b07 > a07) {
            b07 = a07;
        }
        java.lang.String O = o72.x1.O((float) a07);
        java.lang.String O2 = o72.x1.O((float) b07);
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc)).getPaint(), 0.8f);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.vkz);
        textView.setText(O2 + " / " + O);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.tzb);
        if (str.isEmpty()) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(str);
        }
        ((com.tencent.mm.plugin.fav.ui.widget.FavSpaceUsageBar) view.findViewById(com.tencent.mm.R.id.lbl)).setProgress((o72.x1.b0() * 1.0d) / o72.x1.a0());
        view.findViewById(com.tencent.mm.R.id.ssu).setOnClickListener(new com.tencent.mm.plugin.fav.ui.ob(this));
        this.Z.s();
    }

    @Override // com.tencent.mm.plugin.fav.ui.FavBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(m82.l.class);
    }

    public final void t7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoriteIndexUI", "exitEditMode: show post");
        this.T.g(false, null);
        this.f100270h.setOnItemLongClickListener(this.f100437l1);
        showOptionMenu(11, true);
        this.U.c();
        b7();
    }

    public void u7(boolean z17) {
        android.view.View view = this.f100274o;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavoriteIndexUI", "onVisibilityChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavoriteIndexUI", "onVisibilityChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        w7();
    }

    public final void v7(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("fav_cap_status", 0);
        hashMap.put("fav_cap_usage", java.lang.Float.valueOf(((float) o72.x1.b0()) / 1024.0f));
        hashMap.put("fav_cap_limit", java.lang.Float.valueOf(((float) o72.x1.a0()) / 1024.0f));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("fav_space_cap_bar", str, hashMap, 32903);
    }

    public final void w7() {
        long a07 = o72.x1.a0();
        long b07 = o72.x1.b0();
        if (b07 > a07) {
            b07 = a07;
        }
        this.X.setText(com.tencent.mm.sdk.platformtools.x2.h(com.tencent.mm.R.string.nuo, o72.x1.O((float) a07), o72.x1.O((float) b07)));
    }
}
