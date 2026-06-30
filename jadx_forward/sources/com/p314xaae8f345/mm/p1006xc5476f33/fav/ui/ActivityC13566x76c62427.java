package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavFilterUI */
/* loaded from: classes12.dex */
public class ActivityC13566x76c62427 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements s82.h, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.y0 {
    public static final /* synthetic */ int F = 0;
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 A;
    public o72.r2 C;
    public w82.k D;

    /* renamed from: d, reason: collision with root package name */
    public int f181860d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f181862f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f181863g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Set f181864h;

    /* renamed from: i, reason: collision with root package name */
    public o72.i4 f181865i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f181866m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra f181867n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c f181868o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ListView f181869p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.animation.Animation f181870q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.animation.Animation f181871r;

    /* renamed from: x, reason: collision with root package name */
    public v82.b f181877x;

    /* renamed from: y, reason: collision with root package name */
    public long f181878y;

    /* renamed from: e, reason: collision with root package name */
    public int f181861e = -1;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f181872s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f181873t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f181874u = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Set f181875v = new java.util.HashSet();

    /* renamed from: w, reason: collision with root package name */
    public java.util.List f181876w = new java.util.ArrayList();

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f181879z = "";
    public final int[] B = new int[2];
    public final android.widget.AdapterView.OnItemLongClickListener E = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c2(this);

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13566x76c62427 activityC13566x76c62427) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC13566x76c62427.mo55332x76847179());
        u1Var.g(activityC13566x76c62427.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_k));
        u1Var.n(activityC13566x76c62427.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_g));
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.q2(activityC13566x76c62427));
        u1Var.q(false);
    }

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13566x76c62427 activityC13566x76c62427, android.view.View view, int i17, o72.r2 r2Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC13566x76c62427.mo55332x76847179());
        u1Var.g(activityC13566x76c62427.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_j));
        u1Var.j(activityC13566x76c62427.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_c));
        u1Var.n(activityC13566x76c62427.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.caz));
        u1Var.c(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.r2(activityC13566x76c62427), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.s2(activityC13566x76c62427, view, i17, r2Var));
        u1Var.q(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.y0
    public void D5(int i17, int i18) {
        v82.b bVar = this.f181877x;
        bVar.f515607h = i17;
        bVar.f515609j = i18;
        Y6(9, 0, 1, 2, i18, true);
    }

    @Override // s82.h
    public void F4(long j17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = this.f181868o;
        if (cVar.f182017q) {
            this.D.b(cVar.l() > 0);
        }
    }

    public final void W6() {
        this.f181868o.g(false, null);
        this.f181869p.setOnItemLongClickListener(this.E);
        this.D.c();
        if (a7()) {
            this.A.i();
        }
    }

    public final boolean X6() {
        if (this.f181868o.f182017q) {
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
        int i29 = this.f181860d;
        int i37 = i29 != 0 ? i29 != 1 ? i29 != 2 ? 0 : 3 : 2 : 1;
        v82.b bVar = this.f181877x;
        java.lang.String str = bVar.f515606g;
        int i38 = bVar.f515607h;
        if (!z17) {
            i38 = (int) (bVar.f515611l - bVar.f515610k);
        }
        bVar.f515600a = i17;
        bVar.f515602c = i37;
        bVar.f515601b = i27;
        bVar.f515605f = i19;
        bVar.f515603d = ((int) (java.lang.System.currentTimeMillis() - this.f181878y)) / 1000;
        v82.b bVar2 = this.f181877x;
        bVar2.f515604e = this.f181879z;
        bVar2.f515606g = str;
        bVar2.f515607h = i38;
        bVar2.f515608i = java.lang.String.format("%d", java.lang.Integer.valueOf(i18));
        v82.b bVar3 = this.f181877x;
        bVar3.f515609j = i28;
        bVar3.b();
    }

    public final void Z6(int i17, int i18, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = this.f181868o;
        int i19 = 0;
        int i27 = cVar != null ? cVar.G : 0;
        java.util.List list = this.f181872s;
        if (list != null && ((java.util.LinkedList) list).size() > 0) {
            i19 = v82.b.c(((java.lang.Integer) ((java.util.LinkedList) list).get(0)).intValue());
        }
        Y6(i17, i18, i19, i27, this.f181868o.getCount() - 1, z17);
    }

    public final boolean a7() {
        return this.f181861e == 21;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.y0
    public void e(int i17) {
        Y6(2, 0, 1, 2, this.f181877x.f515609j, true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570289ab2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.y0
    public void l3(int i17, int i18) {
        Y6(3, i17, 1, 2, i18, true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.y0
    public void n4(int i17, int i18) {
        Y6(6, 0, 1, 2, this.f181877x.f515609j, true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        int q17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFilterUI", "onActivityResult reqCode: %d, retCod: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        boolean z17 = false;
        if (i18 != -1) {
            if (i17 == 4105) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = this.f181868o;
                if (cVar == null) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.f(this, "", cVar.k(false), false);
                return;
            }
            if (i17 == 4106 && this.C != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(this.C);
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.f(this, "", arrayList, false);
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
                if (-1 == longExtra || -1 == (q17 = this.f181868o.q(longExtra, stringExtra3))) {
                    return;
                }
                this.f181869p.setSelection(q17);
                return;
            }
            if (i17 == 4105) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.b(mo55332x76847179(), this.f181868o.k(false), stringExtra, stringExtra2, "MicroMsg.FavFilterUI");
            } else if (i17 == 4106) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(this.C);
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.b(mo55332x76847179(), arrayList2, stringExtra, stringExtra2, "MicroMsg.FavFilterUI");
            }
        } else {
            if (i18 != -1) {
                return;
            }
            java.util.List list = this.A.f182497x;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                return;
            }
            java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra2.split(","));
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1) it.next();
                if (b1Var != null) {
                    if (new o72.b3().a(b1Var.f182430a, z17, z17)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFilterUI", "[FavFilterUI] notDownload cause by FavSendFilter");
                        db5.e1.T(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571238e));
                        return;
                    }
                    boolean d17 = b1Var.d();
                    r45.gp0 gp0Var = b1Var.f182431b;
                    if (d17 || b1Var.c()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b2 b2Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b2(this, db5.e1.Q(mo55332x76847179(), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.cax), true, false, null));
                        java.util.Iterator it6 = P1.iterator();
                        while (it6.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.k(this, (java.lang.String) it6.next(), gp0Var, b2Var);
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
                                i0Var.f386175a = 3;
                                r70.g gVar = new r70.g(str2, 1, c01.z1.r(), str, i0Var);
                                gVar.f474641j = "fav_filter_send_img";
                                gVar.f474639h = 0;
                                ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
                            }
                        }
                    }
                    z17 = false;
                }
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                java.util.Iterator it9 = P1.iterator();
                while (it9.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it9.next();
                    ((dk5.s5) tg3.t1.a()).fj(str3, stringExtra, c01.e2.C(str3), 0);
                }
            }
        }
        X6();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.transition.Transition inflateTransition = android.transition.TransitionInflater.from(this).inflateTransition(android.R.transition.fade);
        inflateTransition.excludeTarget(getWindow().getDecorView().findViewById(com.p314xaae8f345.mm.R.id.f563968ei), true);
        inflateTransition.excludeTarget(android.R.id.statusBarBackground, true);
        getWindow().setEnterTransition(inflateTransition);
        this.f181861e = getIntent().getIntExtra("key_preset_search_type", -1);
        mo54450xbf7c1df6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13620xa33772de.a(mo55332x76847179(), this.f181861e));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.d2(this));
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
        this.f181860d = getIntent().getIntExtra("key_search_type", 0);
        this.f181866m = findViewById(com.p314xaae8f345.mm.R.id.f568297me2);
        if (1 == this.f181860d) {
            this.f181862f = getIntent().getStringExtra("key_to_user");
            this.f181863g = getIntent().getStringExtra("key_fav_item_id");
        }
        this.f181870q = android.view.animation.AnimationUtils.loadAnimation(mo55332x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559368ct);
        this.f181871r = android.view.animation.AnimationUtils.loadAnimation(mo55332x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559369cu);
        this.f181869p = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.mff);
        this.f181867n = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra(mo55332x76847179(), 16);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c(mo55332x76847179(), this.f181867n, false);
        this.f181868o = cVar;
        cVar.f182025y = this;
        cVar.F = 2;
        cVar.I = this.f181869p;
        if (1 == this.f181860d) {
            this.f181864h = new java.util.HashSet();
            this.f181865i = new o72.b3();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f181863g)) {
                for (java.lang.String str : this.f181863g.split(",")) {
                    int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, Integer.MAX_VALUE);
                    if (Integer.MAX_VALUE != P) {
                        ((java.util.HashSet) this.f181864h).add(java.lang.Integer.valueOf(P));
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar2 = this.f181868o;
            cVar2.f182008f = this.f181864h;
            cVar2.f182009g = this.f181865i;
        }
        this.f181869p.setAdapter((android.widget.ListAdapter) this.f181868o);
        this.f181869p.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j2(this));
        this.f181869p.setOnItemLongClickListener(this.E);
        this.f181869p.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.k2(this));
        w82.k kVar = new w82.k();
        this.D = kVar;
        kVar.a(findViewById(com.p314xaae8f345.mm.R.id.du7));
        this.D.f525436k = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p2(this);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0(this, findViewById(com.p314xaae8f345.mm.R.id.dvb), this.f181867n);
        this.A = h0Var;
        h0Var.f182488o = this;
        gm0.j1.e().k(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.e2(this), 1000L);
        this.f181877x = new v82.b();
        this.f181878y = java.lang.System.currentTimeMillis();
        this.f181877x.f515606g = v82.b.a();
        this.f181877x.f515610k = this.f181878y;
        java.util.List list = this.f181872s;
        java.util.LinkedList linkedList = (java.util.LinkedList) list;
        linkedList.clear();
        linkedList.add(java.lang.Integer.valueOf(this.f181861e));
        if (a7()) {
            this.f181869p.setVisibility(8);
            this.A.g(0);
            this.f181877x.f515606g = v82.b.a();
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var2 = this.A;
            h0Var2.f182491r = false;
            if (h0Var2.f182474a != null) {
                h0Var2.f182489p = java.lang.System.currentTimeMillis();
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2) h0Var2.f182474a).e(true, h0Var2.f182483j);
            }
        } else if (this.f181861e > 0) {
            this.f181868o.f(list, this.f181873t, this.f181874u);
            this.f181868o.notifyDataSetChanged();
            if (8 != this.A.f182486m.getVisibility()) {
                this.A.g(8);
            }
            if (this.f181868o.isEmpty()) {
                if (this.f181866m.getVisibility() != 0) {
                    android.view.View view = this.f181866m;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavFilterUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavFilterUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f181866m.startAnimation(this.f181870q);
                }
                if (8 != this.f181869p.getVisibility()) {
                    this.f181869p.setVisibility(8);
                    this.f181869p.startAnimation(this.f181871r);
                }
            } else {
                if (8 != this.f181866m.getVisibility()) {
                    android.view.View view2 = this.f181866m;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavFilterUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavFilterUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f181866m.startAnimation(this.f181871r);
                }
                if (this.f181869p.getVisibility() != 0) {
                    this.f181869p.setVisibility(0);
                    this.f181869p.startAnimation(this.f181870q);
                }
            }
            this.f181877x.f515611l = java.lang.System.currentTimeMillis();
            Z6(9, 0, false);
            mo48674x36654fab();
            this.A.g(8);
            this.f181869p.setVisibility(0);
        }
        ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Zi(this, new o04.e(r45.fq0.class, 17, true));
        this.f181877x.e((r45.fq0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(mo55332x76847179(), 17, r45.fq0.class));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        android.view.MenuItem add = menu.add(0, 10, 0, com.p314xaae8f345.mm.R.C30867xcad56011.jzr);
        add.setIcon(com.p314xaae8f345.mm.ui.uk.e(mo55332x76847179(), com.p314xaae8f345.mm.R.raw.f78356x618865ad, mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832)));
        add.setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        int i17 = this.f181877x.f515600a;
        if (!((i17 == 1 || i17 == 9) ? false : true)) {
            Z6(1, 0, false);
        }
        this.A.c();
        super.onDestroy();
        this.f181867n.f();
        this.f181867n = null;
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj().g(this.f181875v);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (4 == i17 && this.f181868o.f182017q) {
            W6();
            return true;
        }
        if (4 != i17 || !a7() || !this.A.a()) {
            return super.onKeyUp(i17, keyEvent);
        }
        this.A.i();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        if (menuItem.getItemId() != 10) {
            return super.onOptionsItemSelected(menuItem);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_enter_fav_search_from", 0);
        intent.putExtra("key_preset_search_type", this.f181861e);
        intent.putExtra("key_search_type", this.f181860d);
        try {
            intent.putExtra("ReportKey.CommonReportObjKey", ((r45.fq0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(this, 17, r45.fq0.class)).mo14344x5f01b1f6());
        } catch (java.io.IOException unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.e(mo55332x76847179(), this.f181868o.f182017q, intent);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        o72.z2.c(getClass().getSimpleName(), "");
        if (a7()) {
            this.A.d();
        }
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        this.f181868o.c();
        this.f181868o.notifyDataSetChanged();
        o72.z2.a(getClass().getSimpleName());
        if (a7()) {
            this.A.e();
        }
        super.onResume();
    }
}
