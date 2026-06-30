package com.tencent.mm.plugin.fav.ui;

@db5.a(3)
/* loaded from: classes12.dex */
public class FavSearchUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements s82.h, com.tencent.mm.plugin.fav.ui.gallery.y0 {
    public static final /* synthetic */ int N = 0;
    public android.view.View A;
    public android.widget.ImageButton B;
    public android.view.MenuItem C;
    public com.tencent.mm.sdk.platformtools.n3 D;
    public v82.b F;
    public long G;
    public com.tencent.mm.plugin.fav.ui.gallery.h0 I;
    public o72.r2 K;
    public w82.k L;
    public final android.widget.AdapterView.OnItemLongClickListener M;

    /* renamed from: d, reason: collision with root package name */
    public int f100393d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f100395f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f100396g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Set f100397h;

    /* renamed from: i, reason: collision with root package name */
    public o72.i4 f100398i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.ra f100399m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.adapter.c f100400n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.adapter.f f100401o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView f100402p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ListView f100403q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ListView f100404r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f100405s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.fav.ui.widget.FavCapacityPanel f100406t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.animation.Animation f100407u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.animation.Animation f100408v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.List f100409w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.List f100410x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.List f100411y;

    /* renamed from: e, reason: collision with root package name */
    public int f100394e = -1;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.Set f100412z = new java.util.HashSet();
    public java.util.List E = new java.util.ArrayList();
    public java.lang.String H = "";

    /* renamed from: J, reason: collision with root package name */
    public final int[] f100392J = new int[2];

    public FavSearchUI() {
        new r45.dq0();
        this.M = new com.tencent.mm.plugin.fav.ui.c5(this);
    }

    public static void U6(com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI, boolean z17) {
        if (8 != favSearchUI.f100404r.getVisibility()) {
            favSearchUI.f100404r.setVisibility(8);
            favSearchUI.f100404r.startAnimation(favSearchUI.f100408v);
        }
        if (8 != favSearchUI.f100403q.getVisibility()) {
            favSearchUI.f100403q.setVisibility(8);
            favSearchUI.f100403q.startAnimation(favSearchUI.f100408v);
        }
        if (favSearchUI.I.f100953m.getVisibility() != 0) {
            favSearchUI.I.g(0);
            favSearchUI.I.f100953m.startAnimation(favSearchUI.f100407u);
        }
        if (z17) {
            favSearchUI.hideVKB();
        }
    }

    public static void V6(com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI, java.util.List list, java.util.List list2) {
        favSearchUI.getClass();
        if ((list == null || list.isEmpty()) && (list2 == null || list2.isEmpty())) {
            favSearchUI.B.setVisibility(8);
        } else {
            favSearchUI.B.setVisibility(0);
        }
    }

    public static void W6(com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI, boolean z17) {
        java.util.List list;
        java.util.List list2;
        java.util.List list3;
        favSearchUI.f100400n.notifyDataSetChanged();
        if (8 != favSearchUI.I.f100953m.getVisibility()) {
            favSearchUI.I.g(8);
        }
        if (8 != favSearchUI.f100404r.getVisibility()) {
            favSearchUI.f100404r.setVisibility(8);
            favSearchUI.f100404r.startAnimation(favSearchUI.f100408v);
        }
        if (favSearchUI.f100400n.isEmpty()) {
            if (favSearchUI.f100405s.getVisibility() != 0) {
                android.view.View view = favSearchUI.f100405s;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavSearchUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavSearchUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                favSearchUI.f100405s.startAnimation(favSearchUI.f100407u);
            }
            if (8 != favSearchUI.f100403q.getVisibility()) {
                favSearchUI.f100403q.setVisibility(8);
                favSearchUI.f100403q.startAnimation(favSearchUI.f100408v);
            }
        } else {
            if (8 != favSearchUI.f100405s.getVisibility()) {
                android.view.View view2 = favSearchUI.f100405s;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavSearchUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavSearchUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                favSearchUI.f100405s.startAnimation(favSearchUI.f100408v);
            }
            if (favSearchUI.f100403q.getVisibility() != 0) {
                favSearchUI.f100403q.setVisibility(0);
                favSearchUI.f100403q.startAnimation(favSearchUI.f100407u);
            }
        }
        favSearchUI.F.f434078l = java.lang.System.currentTimeMillis();
        if (favSearchUI.f100400n.isEmpty() && (((list = favSearchUI.f100410x) == null || list.isEmpty()) && (((list2 = favSearchUI.f100409w) == null || list2.isEmpty()) && (list3 = favSearchUI.f100411y) != null && list3.size() == 1))) {
            java.lang.String str = (java.lang.String) favSearchUI.f100411y.get(0);
            com.tencent.mars.xlog.Log.w("MicroMsg.FavSearchUI", "need del tag %s", str);
            ((java.util.HashSet) favSearchUI.f100412z).add(str);
        }
        if (z17) {
            favSearchUI.hideVKB();
        }
    }

    public static void X6(com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI, android.view.View view, int i17, o72.r2 r2Var) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(favSearchUI.getContext());
        u1Var.g(favSearchUI.getContext().getString(com.tencent.mm.R.string.c_j));
        u1Var.j(favSearchUI.getContext().getString(com.tencent.mm.R.string.c_c));
        u1Var.n(favSearchUI.getContext().getString(com.tencent.mm.R.string.caz));
        u1Var.c(new com.tencent.mm.plugin.fav.ui.u4(favSearchUI), new com.tencent.mm.plugin.fav.ui.v4(favSearchUI, view, i17, r2Var));
        u1Var.q(false);
    }

    public static void Y6(com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI) {
        favSearchUI.f100401o.notifyDataSetChanged();
        if (8 != favSearchUI.I.f100953m.getVisibility()) {
            favSearchUI.I.g(8);
        }
        if (favSearchUI.f100404r.getVisibility() != 0) {
            favSearchUI.f100404r.setVisibility(0);
            favSearchUI.f100404r.startAnimation(favSearchUI.f100407u);
        }
        if (8 != favSearchUI.f100403q.getVisibility()) {
            favSearchUI.f100403q.setVisibility(8);
            favSearchUI.f100403q.startAnimation(favSearchUI.f100408v);
        }
        if (8 != favSearchUI.f100405s.getVisibility()) {
            android.view.View view = favSearchUI.f100405s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavSearchUI", "refreshTagView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavSearchUI", "refreshTagView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            favSearchUI.f100405s.startAnimation(favSearchUI.f100408v);
        }
    }

    public static void e7(android.app.Activity activity) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(activity);
        u1Var.g(activity.getString(com.tencent.mm.R.string.c_k));
        u1Var.n(activity.getString(com.tencent.mm.R.string.c_g));
        u1Var.l(new com.tencent.mm.plugin.fav.ui.t4());
        u1Var.q(false);
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.y0
    public void D5(int i17, int i18) {
        v82.b bVar = this.F;
        bVar.f434074h = i17;
        bVar.f434076j = i18;
        c7(9, 0, 1, 2, i18, true);
    }

    @Override // s82.h
    public void F4(long j17, boolean z17) {
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = this.f100400n;
        if (cVar.f100484q) {
            this.L.b(cVar.l() > 0);
        }
    }

    public final void Z6() {
        this.f100400n.g(false, null);
        this.f100403q.setOnItemLongClickListener(this.M);
        this.L.c();
        if (d7()) {
            this.I.i();
        }
    }

    public final boolean a7() {
        if (this.f100400n.f100484q) {
            Z6();
            return true;
        }
        if (!d7() || !this.I.a()) {
            return false;
        }
        this.I.i();
        return true;
    }

    public final void b7(int i17, int i18) {
        v82.b bVar = this.F;
        bVar.f434067a = i17;
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = this.f100400n;
        if (cVar != null) {
            bVar.f434068b = cVar.G;
        }
        int i19 = this.f100393d;
        if (i19 == 0) {
            bVar.f434069c = 1;
        } else if (i19 == 1) {
            bVar.f434069c = 2;
        } else if (i19 != 2) {
            bVar.f434069c = 0;
        } else {
            bVar.f434069c = 3;
        }
        bVar.f434070d = ((int) (java.lang.System.currentTimeMillis() - this.G)) / 1000;
        this.F.f434071e = this.H;
        java.util.List list = this.f100409w;
        if (list != null) {
            if (list.size() > 0) {
                int intValue = ((java.lang.Integer) this.f100409w.get(0)).intValue();
                this.F.f434072f = v82.b.c(intValue);
            } else {
                this.F.f434072f = 0;
            }
        }
        v82.b bVar2 = this.F;
        bVar2.f434074h = (int) (bVar2.f434078l - bVar2.f434077k);
        bVar2.f434075i = java.lang.String.format("%d", java.lang.Integer.valueOf(i18));
        this.F.f434076j = this.f100400n.getCount() - 1;
        this.F.b();
    }

    public final void c7(int i17, int i18, int i19, int i27, int i28, boolean z17) {
        int i29 = this.f100393d;
        int i37 = i29 != 0 ? i29 != 1 ? i29 != 2 ? 0 : 3 : 2 : 1;
        java.lang.String str = this.H;
        v82.b bVar = this.F;
        java.lang.String str2 = bVar.f434073g;
        int i38 = bVar.f434074h;
        if (!z17) {
            i38 = (int) (bVar.f434078l - bVar.f434077k);
        }
        bVar.f434067a = i17;
        bVar.f434069c = i37;
        bVar.f434068b = i27;
        bVar.f434072f = i19;
        bVar.f434070d = ((int) (java.lang.System.currentTimeMillis() - this.G)) / 1000;
        v82.b bVar2 = this.F;
        bVar2.f434071e = str;
        bVar2.f434073g = str2;
        bVar2.f434074h = i38;
        bVar2.f434075i = java.lang.String.format("%d", java.lang.Integer.valueOf(i18));
        v82.b bVar3 = this.F;
        bVar3.f434076j = i28;
        bVar3.b();
    }

    public final boolean d7() {
        return this.f100394e == 21;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.y0
    public void e(int i17) {
        c7(2, 0, 1, 2, this.F.f434076j, true);
    }

    public final void f7() {
        if (this.f100402p != null) {
            return;
        }
        com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView favSearchActionView = (com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView) android.view.View.inflate(getContext(), com.tencent.mm.R.layout.abv, null);
        this.f100402p = favSearchActionView;
        android.view.View findViewById = favSearchActionView.findViewById(com.tencent.mm.R.id.b5i);
        this.A = findViewById;
        findViewById.setOnClickListener(new com.tencent.mm.plugin.fav.ui.h5(this));
        android.widget.ImageButton imageButton = (android.widget.ImageButton) this.f100402p.findViewById(com.tencent.mm.R.id.mdl);
        this.B = imageButton;
        imageButton.setVisibility(8);
        this.f100402p.setOnSearchChangedListener(new com.tencent.mm.plugin.fav.ui.j5(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.abw;
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.y0
    public void l3(int i17, int i18) {
        c7(3, i17, 1, 2, i18, true);
    }

    @Override // com.tencent.mm.plugin.fav.ui.gallery.y0
    public void n4(int i17, int i18) {
        c7(6, 0, 1, 2, this.F.f434076j, true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSearchUI", "onActivityResult reqCode: %d, retCod: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1) {
            if (i17 == 4105) {
                com.tencent.mm.plugin.fav.ui.adapter.c cVar = this.f100400n;
                if (cVar == null) {
                    return;
                }
                com.tencent.mm.plugin.fav.ui.ec.f(this, "", cVar.k(false), false);
                return;
            }
            if (i17 == 4106 && this.K != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(this.K);
                com.tencent.mm.plugin.fav.ui.ec.f(this, "", arrayList, false);
                return;
            }
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("custom_send_text");
        java.lang.String stringExtra2 = intent.getStringExtra("Select_Conv_User");
        if (i17 != 1) {
            if (i17 == 4105) {
                com.tencent.mm.plugin.fav.ui.ec.b(getContext(), this.f100400n.k(false), stringExtra, stringExtra2, "MicroMsg.FavSearchUI");
            } else if (i17 == 4106) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(this.K);
                com.tencent.mm.plugin.fav.ui.ec.b(getContext(), arrayList2, stringExtra, stringExtra2, "MicroMsg.FavSearchUI");
            }
        } else {
            if (i18 != -1) {
                return;
            }
            java.util.List list = this.I.f100964x;
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                return;
            }
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra2.split(","));
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var = (com.tencent.mm.plugin.fav.ui.gallery.b1) it.next();
                if (b1Var != null) {
                    if (new o72.b3().a(b1Var.f100897a, false, false)) {
                        db5.e1.T(getContext(), getString(com.tencent.mm.R.string.f489705e));
                        return;
                    }
                    boolean d17 = b1Var.d();
                    r45.gp0 gp0Var = b1Var.f100898b;
                    if (d17 || b1Var.c()) {
                        com.tencent.mm.plugin.fav.ui.b5 b5Var = new com.tencent.mm.plugin.fav.ui.b5(this, db5.e1.Q(getContext(), "", getString(com.tencent.mm.R.string.cax), true, false, null));
                        java.util.Iterator it6 = P1.iterator();
                        while (it6.hasNext()) {
                            com.tencent.mm.plugin.fav.ui.x5.k(this, (java.lang.String) it6.next(), gp0Var, b5Var);
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
                                gVar.f393108j = "fav_search_send_img";
                                gVar.f393106h = 0;
                                ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
                            }
                        }
                    }
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
        a7();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.transition.Transition inflateTransition = android.transition.TransitionInflater.from(this).inflateTransition(android.R.transition.fade);
        inflateTransition.excludeTarget(getWindow().getDecorView().findViewById(com.tencent.mm.R.id.f482435ei), true);
        inflateTransition.excludeTarget(android.R.id.statusBarBackground, true);
        getWindow().setEnterTransition(inflateTransition);
        this.D = new com.tencent.mm.sdk.platformtools.n3();
        setMMTitle("");
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.a07));
        int intExtra = getIntent().getIntExtra("key_search_type", 0);
        this.f100393d = intExtra;
        if (1 == intExtra) {
            this.f100395f = getIntent().getStringExtra("key_to_user");
            this.f100396g = getIntent().getStringExtra("key_fav_item_id");
        }
        this.f100394e = getIntent().getIntExtra("key_preset_search_type", -1);
        this.f100404r = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f487218nx4);
        this.f100403q = (android.widget.ListView) findViewById(com.tencent.mm.R.id.mff);
        this.f100405s = findViewById(com.tencent.mm.R.id.f486764me2);
        this.f100407u = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477835ct);
        this.f100408v = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477836cu);
        f7();
        com.tencent.mm.plugin.fav.ui.widget.FavCapacityPanel favCapacityPanel = (com.tencent.mm.plugin.fav.ui.widget.FavCapacityPanel) android.view.View.inflate(getContext(), com.tencent.mm.R.layout.aau, null);
        this.f100406t = favCapacityPanel;
        favCapacityPanel.f101525g = getIntent().getIntExtra("key_enter_fav_search_from", 0);
        this.f100401o = new com.tencent.mm.plugin.fav.ui.k5(this, getContext());
        if (((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj().c() > 0) {
            this.f100404r.addHeaderView((android.widget.TextView) android.view.View.inflate(getContext(), com.tencent.mm.R.layout.abz, null));
        }
        this.f100404r.addFooterView(this.f100406t);
        this.f100404r.setAdapter((android.widget.ListAdapter) this.f100401o);
        this.f100399m = new com.tencent.mm.plugin.fav.ui.ra(getContext(), 16);
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = new com.tencent.mm.plugin.fav.ui.adapter.c(getContext(), this.f100399m, false);
        this.f100400n = cVar;
        cVar.f100492y = this;
        cVar.F = 2;
        cVar.I = this.f100403q;
        if (1 == this.f100393d) {
            this.f100397h = new java.util.HashSet();
            this.f100398i = new o72.b3();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f100396g)) {
                for (java.lang.String str : this.f100396g.split(",")) {
                    int P = com.tencent.mm.sdk.platformtools.t8.P(str, Integer.MAX_VALUE);
                    if (Integer.MAX_VALUE != P) {
                        ((java.util.HashSet) this.f100397h).add(java.lang.Integer.valueOf(P));
                    }
                }
            }
            com.tencent.mm.plugin.fav.ui.adapter.c cVar2 = this.f100400n;
            cVar2.f100475f = this.f100397h;
            cVar2.f100476g = this.f100398i;
        }
        this.f100403q.setAdapter((android.widget.ListAdapter) this.f100400n);
        this.f100403q.setOnItemClickListener(new com.tencent.mm.plugin.fav.ui.p5(this));
        this.f100403q.setOnItemLongClickListener(this.M);
        this.f100403q.setOnTouchListener(new com.tencent.mm.plugin.fav.ui.n4(this));
        w82.k kVar = new w82.k();
        this.L = kVar;
        kVar.a(findViewById(com.tencent.mm.R.id.du7));
        this.L.f443903k = new com.tencent.mm.plugin.fav.ui.s4(this);
        com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var = new com.tencent.mm.plugin.fav.ui.gallery.h0(this, findViewById(com.tencent.mm.R.id.dvb), this.f100399m);
        this.I = h0Var;
        h0Var.f100955o = this;
        gm0.j1.e().k(new com.tencent.mm.plugin.fav.ui.d5(this), 1000L);
        this.F = new v82.b();
        this.G = java.lang.System.currentTimeMillis();
        this.F.f434073g = v82.b.a();
        this.F.f434077k = this.G;
        if (d7()) {
            this.f100402p.d(this.f100394e, false);
            this.f100403q.setVisibility(8);
            this.f100404r.setVisibility(8);
            this.I.g(0);
            com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var2 = this.I;
            h0Var2.f100958r = false;
            if (h0Var2.f100941a != null) {
                h0Var2.f100956p = java.lang.System.currentTimeMillis();
                ((com.tencent.mm.plugin.fav.ui.gallery.l2) h0Var2.f100941a).e(true, h0Var2.f100950j);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f100409w = arrayList;
            arrayList.add(java.lang.Integer.valueOf(this.f100394e));
        } else {
            int i17 = this.f100394e;
            if (i17 > 0) {
                this.f100402p.d(i17, true);
                this.I.g(8);
                this.f100403q.setVisibility(0);
            }
        }
        ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Zi(this, new o04.e(r45.fq0.class, 17, true));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        f7();
        android.view.MenuItem add = menu.add(0, com.tencent.mm.R.id.jha, 0, com.tencent.mm.R.string.f490386tj);
        this.C = add;
        add.setActionView(this.f100402p);
        this.C.setShowAsAction(9);
        this.f100402p.post(new com.tencent.mm.plugin.fav.ui.e5(this));
        this.C.setOnActionExpandListener(new n3.y(new com.tencent.mm.plugin.fav.ui.f5(this)));
        this.D.post(new com.tencent.mm.plugin.fav.ui.g5(this));
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        int i17 = this.F.f434067a;
        if (!((i17 == 1 || i17 == 9) ? false : true)) {
            b7(1, 0);
        }
        this.I.c();
        super.onDestroy();
        this.f100399m.f();
        this.f100399m = null;
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj().g(this.f100412z);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (4 == i17 && this.f100400n.f100484q) {
            Z6();
            return true;
        }
        if (4 != i17 || !d7() || !this.I.a()) {
            return super.onKeyUp(i17, keyEvent);
        }
        this.I.i();
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        o72.z2.c(getClass().getSimpleName(), "");
        if (d7()) {
            this.I.d();
        }
        super.onPause();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        this.f100400n.c();
        this.f100400n.notifyDataSetChanged();
        com.tencent.mm.plugin.fav.ui.widget.FavCapacityPanel favCapacityPanel = this.f100406t;
        if (favCapacityPanel.f101523e != o72.x1.K() / 1048576) {
            favCapacityPanel.f101523e = o72.x1.K() / 1048576;
            android.widget.TextView textView = favCapacityPanel.f101524f;
            android.content.Context context = textView.getContext();
            java.lang.Object[] objArr = new java.lang.Object[2];
            long j17 = favCapacityPanel.f101526h - favCapacityPanel.f101523e;
            if (j17 <= 0) {
                j17 = 0;
            }
            objArr[0] = java.lang.Long.valueOf(j17);
            objArr[1] = java.lang.Long.valueOf(favCapacityPanel.f101523e);
            textView.setText(context.getString(com.tencent.mm.R.string.c9f, objArr));
        }
        o72.z2.a(getClass().getSimpleName());
        if (d7()) {
            this.I.e();
        }
        super.onResume();
    }
}
