package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class FavFilterUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements s82.h, com.tencent.mm.plugin.fav.ui.gallery.y0 {
    public static final /* synthetic */ int F = 0;
    public com.tencent.mm.plugin.fav.ui.gallery.h0 A;
    public o72.r2 C;
    public w82.k D;

    /* renamed from: d, reason: collision with root package name */
    public int f100327d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f100329f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f100330g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Set f100331h;

    /* renamed from: i, reason: collision with root package name */
    public o72.i4 f100332i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f100333m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.ra f100334n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.adapter.c f100335o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ListView f100336p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.animation.Animation f100337q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.animation.Animation f100338r;

    /* renamed from: x, reason: collision with root package name */
    public v82.b f100344x;

    /* renamed from: y, reason: collision with root package name */
    public long f100345y;

    /* renamed from: e, reason: collision with root package name */
    public int f100328e = -1;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f100339s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f100340t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f100341u = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Set f100342v = new java.util.HashSet();

    /* renamed from: w, reason: collision with root package name */
    public java.util.List f100343w = new java.util.ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f100346z = "";
    public final int[] B = new int[2];
    public final android.widget.AdapterView.OnItemLongClickListener E = new com.tencent.mm.plugin.fav.ui.c2(this);

    public static void U6(com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(favFilterUI.getContext());
        u1Var.g(favFilterUI.getContext().getString(com.tencent.mm.R.string.c_k));
        u1Var.n(favFilterUI.getContext().getString(com.tencent.mm.R.string.c_g));
        u1Var.l(new com.tencent.mm.plugin.fav.ui.q2(favFilterUI));
        u1Var.q(false);
    }

    public static void V6(com.tencent.mm.plugin.fav.ui.FavFilterUI favFilterUI, android.view.View view, int i17, o72.r2 r2Var) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(favFilterUI.getContext());
        u1Var.g(favFilterUI.getContext().getString(com.tencent.mm.R.string.c_j));
        u1Var.j(favFilterUI.getContext().getString(com.tencent.mm.R.string.c_c));
        u1Var.n(favFilterUI.getContext().getString(com.tencent.mm.R.string.caz));
        u1Var.c(new com.tencent.mm.plugin.fav.ui.r2(favFilterUI), new com.tencent.mm.plugin.fav.ui.s2(favFilterUI, view, i17, r2Var));
        u1Var.q(false);
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.y0
    public void D5(int i17, int i18) {
        v82.b bVar = this.f100344x;
        bVar.f434074h = i17;
        bVar.f434076j = i18;
        Y6(9, 0, 1, 2, i18, true);
    }

    @Override // s82.h
    public void F4(long j17, boolean z17) {
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = this.f100335o;
        if (cVar.f100484q) {
            this.D.b(cVar.l() > 0);
        }
    }

    public final void W6() {
        this.f100335o.g(false, null);
        this.f100336p.setOnItemLongClickListener(this.E);
        this.D.c();
        if (a7()) {
            this.A.i();
        }
    }

    public final boolean X6() {
        if (this.f100335o.f100484q) {
            W6();
            return true;
        }
        if (!a7() || !this.A.a()) {
            return false;
        }
        this.A.i();
        return true;
    }

    public final void Y6(int i17, int i18, int i19, int i27, int i28, boolean z17) {
        int i29 = this.f100327d;
        int i37 = i29 != 0 ? i29 != 1 ? i29 != 2 ? 0 : 3 : 2 : 1;
        v82.b bVar = this.f100344x;
        java.lang.String str = bVar.f434073g;
        int i38 = bVar.f434074h;
        if (!z17) {
            i38 = (int) (bVar.f434078l - bVar.f434077k);
        }
        bVar.f434067a = i17;
        bVar.f434069c = i37;
        bVar.f434068b = i27;
        bVar.f434072f = i19;
        bVar.f434070d = ((int) (java.lang.System.currentTimeMillis() - this.f100345y)) / 1000;
        v82.b bVar2 = this.f100344x;
        bVar2.f434071e = this.f100346z;
        bVar2.f434073g = str;
        bVar2.f434074h = i38;
        bVar2.f434075i = java.lang.String.format("%d", java.lang.Integer.valueOf(i18));
        v82.b bVar3 = this.f100344x;
        bVar3.f434076j = i28;
        bVar3.b();
    }

    public final void Z6(int i17, int i18, boolean z17) {
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = this.f100335o;
        int i19 = 0;
        int i27 = cVar != null ? cVar.G : 0;
        java.util.List list = this.f100339s;
        if (list != null && ((java.util.LinkedList) list).size() > 0) {
            i19 = v82.b.c(((java.lang.Integer) ((java.util.LinkedList) list).get(0)).intValue());
        }
        Y6(i17, i18, i19, i27, this.f100335o.getCount() - 1, z17);
    }

    public final boolean a7() {
        return this.f100328e == 21;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.y0
    public void e(int i17) {
        Y6(2, 0, 1, 2, this.f100344x.f434076j, true);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488756ab2;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.y0
    public void l3(int i17, int i18) {
        Y6(3, i17, 1, 2, i18, true);
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.y0
    public void n4(int i17, int i18) {
        Y6(6, 0, 1, 2, this.f100344x.f434076j, true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        int q17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavFilterUI", "onActivityResult reqCode: %d, retCod: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        boolean z17 = false;
        if (i18 != -1) {
            if (i17 == 4105) {
                com.tencent.mm.plugin.fav.ui.adapter.c cVar = this.f100335o;
                if (cVar == null) {
                    return;
                }
                com.tencent.mm.plugin.fav.ui.ec.f(this, "", cVar.k(false), false);
                return;
            }
            if (i17 == 4106 && this.C != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(this.C);
                com.tencent.mm.plugin.fav.ui.ec.f(this, "", arrayList, false);
                return;
            }
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("custom_send_text");
        java.lang.String stringExtra2 = intent.getStringExtra("Select_Conv_User");
        if (i17 != 1) {
            if (i17 == 4103) {
                long longExtra = intent.getLongExtra("key_fav_result_local_id", -1L);
                java.lang.String stringExtra3 = intent.getStringExtra("key_fav_result_fake_local_id");
                if (-1 == longExtra || -1 == (q17 = this.f100335o.q(longExtra, stringExtra3))) {
                    return;
                }
                this.f100336p.setSelection(q17);
                return;
            }
            if (i17 == 4105) {
                com.tencent.mm.plugin.fav.ui.ec.b(getContext(), this.f100335o.k(false), stringExtra, stringExtra2, "MicroMsg.FavFilterUI");
            } else if (i17 == 4106) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(this.C);
                com.tencent.mm.plugin.fav.ui.ec.b(getContext(), arrayList2, stringExtra, stringExtra2, "MicroMsg.FavFilterUI");
            }
        } else {
            if (i18 != -1) {
                return;
            }
            java.util.List list = this.A.f100964x;
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                return;
            }
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra2.split(","));
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var = (com.tencent.mm.plugin.fav.ui.gallery.b1) it.next();
                if (b1Var != null) {
                    if (new o72.b3().a(b1Var.f100897a, z17, z17)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FavFilterUI", "[FavFilterUI] notDownload cause by FavSendFilter");
                        db5.e1.T(getContext(), getString(com.tencent.mm.R.string.f489705e));
                        return;
                    }
                    boolean d17 = b1Var.d();
                    r45.gp0 gp0Var = b1Var.f100898b;
                    if (d17 || b1Var.c()) {
                        com.tencent.mm.plugin.fav.ui.b2 b2Var = new com.tencent.mm.plugin.fav.ui.b2(this, db5.e1.Q(getContext(), "", getString(com.tencent.mm.R.string.cax), true, false, null));
                        java.util.Iterator it6 = P1.iterator();
                        while (it6.hasNext()) {
                            com.tencent.mm.plugin.fav.ui.x5.k(this, (java.lang.String) it6.next(), gp0Var, b2Var);
                        }
                    } else {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(o72.x1.x(gp0Var));
                        java.util.Iterator it7 = P1.iterator();
                        while (it7.hasNext()) {
                            java.lang.String str = (java.lang.String) it7.next();
                            java.util.Iterator it8 = arrayList3.iterator();
                            while (it8.hasNext()) {
                                java.lang.String str2 = (java.lang.String) it8.next();
                                k70.i0 i0Var = new k70.i0();
                                i0Var.f304642a = 3;
                                r70.g gVar = new r70.g(str2, 1, c01.z1.r(), str, i0Var);
                                gVar.f393108j = "fav_filter_send_img";
                                gVar.f393106h = 0;
                                ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
                            }
                        }
                    }
                    z17 = false;
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                java.util.Iterator it9 = P1.iterator();
                while (it9.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it9.next();
                    ((dk5.s5) tg3.t1.a()).fj(str3, stringExtra, c01.e2.C(str3), 0);
                }
            }
        }
        X6();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.transition.Transition inflateTransition = android.transition.TransitionInflater.from(this).inflateTransition(android.R.transition.fade);
        inflateTransition.excludeTarget(getWindow().getDecorView().findViewById(com.tencent.mm.R.id.f482435ei), true);
        inflateTransition.excludeTarget(android.R.id.statusBarBackground, true);
        getWindow().setEnterTransition(inflateTransition);
        this.f100328e = getIntent().getIntExtra("key_preset_search_type", -1);
        setMMTitle(com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView.a(getContext(), this.f100328e));
        setBackBtn(new com.tencent.mm.plugin.fav.ui.d2(this));
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.a07));
        this.f100327d = getIntent().getIntExtra("key_search_type", 0);
        this.f100333m = findViewById(com.tencent.mm.R.id.f486764me2);
        if (1 == this.f100327d) {
            this.f100329f = getIntent().getStringExtra("key_to_user");
            this.f100330g = getIntent().getStringExtra("key_fav_item_id");
        }
        this.f100337q = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477835ct);
        this.f100338r = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477836cu);
        this.f100336p = (android.widget.ListView) findViewById(com.tencent.mm.R.id.mff);
        this.f100334n = new com.tencent.mm.plugin.fav.ui.ra(getContext(), 16);
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = new com.tencent.mm.plugin.fav.ui.adapter.c(getContext(), this.f100334n, false);
        this.f100335o = cVar;
        cVar.f100492y = this;
        cVar.F = 2;
        cVar.I = this.f100336p;
        if (1 == this.f100327d) {
            this.f100331h = new java.util.HashSet();
            this.f100332i = new o72.b3();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f100330g)) {
                for (java.lang.String str : this.f100330g.split(",")) {
                    int P = com.tencent.mm.sdk.platformtools.t8.P(str, Integer.MAX_VALUE);
                    if (Integer.MAX_VALUE != P) {
                        ((java.util.HashSet) this.f100331h).add(java.lang.Integer.valueOf(P));
                    }
                }
            }
            com.tencent.mm.plugin.fav.ui.adapter.c cVar2 = this.f100335o;
            cVar2.f100475f = this.f100331h;
            cVar2.f100476g = this.f100332i;
        }
        this.f100336p.setAdapter((android.widget.ListAdapter) this.f100335o);
        this.f100336p.setOnItemClickListener(new com.tencent.mm.plugin.fav.ui.j2(this));
        this.f100336p.setOnItemLongClickListener(this.E);
        this.f100336p.setOnTouchListener(new com.tencent.mm.plugin.fav.ui.k2(this));
        w82.k kVar = new w82.k();
        this.D = kVar;
        kVar.a(findViewById(com.tencent.mm.R.id.du7));
        this.D.f443903k = new com.tencent.mm.plugin.fav.ui.p2(this);
        com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var = new com.tencent.mm.plugin.fav.ui.gallery.h0(this, findViewById(com.tencent.mm.R.id.dvb), this.f100334n);
        this.A = h0Var;
        h0Var.f100955o = this;
        gm0.j1.e().k(new com.tencent.mm.plugin.fav.ui.e2(this), 1000L);
        this.f100344x = new v82.b();
        this.f100345y = java.lang.System.currentTimeMillis();
        this.f100344x.f434073g = v82.b.a();
        this.f100344x.f434077k = this.f100345y;
        java.util.List list = this.f100339s;
        java.util.LinkedList linkedList = (java.util.LinkedList) list;
        linkedList.clear();
        linkedList.add(java.lang.Integer.valueOf(this.f100328e));
        if (a7()) {
            this.f100336p.setVisibility(8);
            this.A.g(0);
            this.f100344x.f434073g = v82.b.a();
            com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var2 = this.A;
            h0Var2.f100958r = false;
            if (h0Var2.f100941a != null) {
                h0Var2.f100956p = java.lang.System.currentTimeMillis();
                ((com.tencent.mm.plugin.fav.ui.gallery.l2) h0Var2.f100941a).e(true, h0Var2.f100950j);
            }
        } else if (this.f100328e > 0) {
            this.f100335o.f(list, this.f100340t, this.f100341u);
            this.f100335o.notifyDataSetChanged();
            if (8 != this.A.f100953m.getVisibility()) {
                this.A.g(8);
            }
            if (this.f100335o.isEmpty()) {
                if (this.f100333m.getVisibility() != 0) {
                    android.view.View view = this.f100333m;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavFilterUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavFilterUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f100333m.startAnimation(this.f100337q);
                }
                if (8 != this.f100336p.getVisibility()) {
                    this.f100336p.setVisibility(8);
                    this.f100336p.startAnimation(this.f100338r);
                }
            } else {
                if (8 != this.f100333m.getVisibility()) {
                    android.view.View view2 = this.f100333m;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavFilterUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavFilterUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f100333m.startAnimation(this.f100338r);
                }
                if (this.f100336p.getVisibility() != 0) {
                    this.f100336p.setVisibility(0);
                    this.f100336p.startAnimation(this.f100337q);
                }
            }
            this.f100344x.f434078l = java.lang.System.currentTimeMillis();
            Z6(9, 0, false);
            hideVKB();
            this.A.g(8);
            this.f100336p.setVisibility(0);
        }
        ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Zi(this, new o04.e(r45.fq0.class, 17, true));
        this.f100344x.e((r45.fq0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(getContext(), 17, r45.fq0.class));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        android.view.MenuItem add = menu.add(0, 10, 0, com.tencent.mm.R.string.jzr);
        add.setIcon(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.actionbar_icon_dark_search, getContext().getResources().getColor(com.tencent.mm.R.color.FG_0)));
        add.setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        int i17 = this.f100344x.f434067a;
        if (!((i17 == 1 || i17 == 9) ? false : true)) {
            Z6(1, 0, false);
        }
        this.A.c();
        super.onDestroy();
        this.f100334n.f();
        this.f100334n = null;
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj().g(this.f100342v);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (4 == i17 && this.f100335o.f100484q) {
            W6();
            return true;
        }
        if (4 != i17 || !a7() || !this.A.a()) {
            return super.onKeyUp(i17, keyEvent);
        }
        this.A.i();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        if (menuItem.getItemId() != 10) {
            return super.onOptionsItemSelected(menuItem);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_enter_fav_search_from", 0);
        intent.putExtra("key_preset_search_type", this.f100328e);
        intent.putExtra("key_search_type", this.f100327d);
        try {
            intent.putExtra("ReportKey.CommonReportObjKey", ((r45.fq0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(this, 17, r45.fq0.class)).toByteArray());
        } catch (java.io.IOException unused) {
        }
        com.tencent.mm.plugin.fav.ui.ec.e(getContext(), this.f100335o.f100484q, intent);
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        o72.z2.c(getClass().getSimpleName(), "");
        if (a7()) {
            this.A.d();
        }
        super.onPause();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        this.f100335o.c();
        this.f100335o.notifyDataSetChanged();
        o72.z2.a(getClass().getSimpleName());
        if (a7()) {
            this.A.e();
        }
        super.onResume();
    }
}
