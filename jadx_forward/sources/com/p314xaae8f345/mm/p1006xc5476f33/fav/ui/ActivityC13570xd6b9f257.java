package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.fav.ui.FavSearchUI */
/* loaded from: classes12.dex */
public class ActivityC13570xd6b9f257 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements s82.h, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.y0 {
    public static final /* synthetic */ int N = 0;
    public android.view.View A;
    public android.widget.ImageButton B;
    public android.view.MenuItem C;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 D;
    public v82.b F;
    public long G;
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 I;
    public o72.r2 K;
    public w82.k L;
    public final android.widget.AdapterView.OnItemLongClickListener M;

    /* renamed from: d, reason: collision with root package name */
    public int f181926d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f181928f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f181929g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Set f181930h;

    /* renamed from: i, reason: collision with root package name */
    public o72.i4 f181931i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra f181932m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c f181933n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.f f181934o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13620xa33772de f181935p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ListView f181936q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ListView f181937r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f181938s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13616x9df1f62f f181939t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.animation.Animation f181940u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.animation.Animation f181941v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.List f181942w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.List f181943x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.List f181944y;

    /* renamed from: e, reason: collision with root package name */
    public int f181927e = -1;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.Set f181945z = new java.util.HashSet();
    public java.util.List E = new java.util.ArrayList();
    public java.lang.String H = "";

    /* renamed from: J, reason: collision with root package name */
    public final int[] f181925J = new int[2];

    public ActivityC13570xd6b9f257() {
        new r45.dq0();
        this.M = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.c5(this);
    }

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257, boolean z17) {
        if (8 != activityC13570xd6b9f257.f181937r.getVisibility()) {
            activityC13570xd6b9f257.f181937r.setVisibility(8);
            activityC13570xd6b9f257.f181937r.startAnimation(activityC13570xd6b9f257.f181941v);
        }
        if (8 != activityC13570xd6b9f257.f181936q.getVisibility()) {
            activityC13570xd6b9f257.f181936q.setVisibility(8);
            activityC13570xd6b9f257.f181936q.startAnimation(activityC13570xd6b9f257.f181941v);
        }
        if (activityC13570xd6b9f257.I.f182486m.getVisibility() != 0) {
            activityC13570xd6b9f257.I.g(0);
            activityC13570xd6b9f257.I.f182486m.startAnimation(activityC13570xd6b9f257.f181940u);
        }
        if (z17) {
            activityC13570xd6b9f257.mo48674x36654fab();
        }
    }

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257, java.util.List list, java.util.List list2) {
        activityC13570xd6b9f257.getClass();
        if ((list == null || list.isEmpty()) && (list2 == null || list2.isEmpty())) {
            activityC13570xd6b9f257.B.setVisibility(8);
        } else {
            activityC13570xd6b9f257.B.setVisibility(0);
        }
    }

    public static void W6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257, boolean z17) {
        java.util.List list;
        java.util.List list2;
        java.util.List list3;
        activityC13570xd6b9f257.f181933n.notifyDataSetChanged();
        if (8 != activityC13570xd6b9f257.I.f182486m.getVisibility()) {
            activityC13570xd6b9f257.I.g(8);
        }
        if (8 != activityC13570xd6b9f257.f181937r.getVisibility()) {
            activityC13570xd6b9f257.f181937r.setVisibility(8);
            activityC13570xd6b9f257.f181937r.startAnimation(activityC13570xd6b9f257.f181941v);
        }
        if (activityC13570xd6b9f257.f181933n.isEmpty()) {
            if (activityC13570xd6b9f257.f181938s.getVisibility() != 0) {
                android.view.View view = activityC13570xd6b9f257.f181938s;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavSearchUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavSearchUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                activityC13570xd6b9f257.f181938s.startAnimation(activityC13570xd6b9f257.f181940u);
            }
            if (8 != activityC13570xd6b9f257.f181936q.getVisibility()) {
                activityC13570xd6b9f257.f181936q.setVisibility(8);
                activityC13570xd6b9f257.f181936q.startAnimation(activityC13570xd6b9f257.f181941v);
            }
        } else {
            if (8 != activityC13570xd6b9f257.f181938s.getVisibility()) {
                android.view.View view2 = activityC13570xd6b9f257.f181938s;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavSearchUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavSearchUI", "refreshResultView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                activityC13570xd6b9f257.f181938s.startAnimation(activityC13570xd6b9f257.f181941v);
            }
            if (activityC13570xd6b9f257.f181936q.getVisibility() != 0) {
                activityC13570xd6b9f257.f181936q.setVisibility(0);
                activityC13570xd6b9f257.f181936q.startAnimation(activityC13570xd6b9f257.f181940u);
            }
        }
        activityC13570xd6b9f257.F.f515611l = java.lang.System.currentTimeMillis();
        if (activityC13570xd6b9f257.f181933n.isEmpty() && (((list = activityC13570xd6b9f257.f181943x) == null || list.isEmpty()) && (((list2 = activityC13570xd6b9f257.f181942w) == null || list2.isEmpty()) && (list3 = activityC13570xd6b9f257.f181944y) != null && list3.size() == 1))) {
            java.lang.String str = (java.lang.String) activityC13570xd6b9f257.f181944y.get(0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavSearchUI", "need del tag %s", str);
            ((java.util.HashSet) activityC13570xd6b9f257.f181945z).add(str);
        }
        if (z17) {
            activityC13570xd6b9f257.mo48674x36654fab();
        }
    }

    public static void X6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257, android.view.View view, int i17, o72.r2 r2Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC13570xd6b9f257.mo55332x76847179());
        u1Var.g(activityC13570xd6b9f257.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_j));
        u1Var.j(activityC13570xd6b9f257.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_c));
        u1Var.n(activityC13570xd6b9f257.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.caz));
        u1Var.c(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u4(activityC13570xd6b9f257), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.v4(activityC13570xd6b9f257, view, i17, r2Var));
        u1Var.q(false);
    }

    public static void Y6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13570xd6b9f257 activityC13570xd6b9f257) {
        activityC13570xd6b9f257.f181934o.notifyDataSetChanged();
        if (8 != activityC13570xd6b9f257.I.f182486m.getVisibility()) {
            activityC13570xd6b9f257.I.g(8);
        }
        if (activityC13570xd6b9f257.f181937r.getVisibility() != 0) {
            activityC13570xd6b9f257.f181937r.setVisibility(0);
            activityC13570xd6b9f257.f181937r.startAnimation(activityC13570xd6b9f257.f181940u);
        }
        if (8 != activityC13570xd6b9f257.f181936q.getVisibility()) {
            activityC13570xd6b9f257.f181936q.setVisibility(8);
            activityC13570xd6b9f257.f181936q.startAnimation(activityC13570xd6b9f257.f181941v);
        }
        if (8 != activityC13570xd6b9f257.f181938s.getVisibility()) {
            android.view.View view = activityC13570xd6b9f257.f181938s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavSearchUI", "refreshTagView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavSearchUI", "refreshTagView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            activityC13570xd6b9f257.f181938s.startAnimation(activityC13570xd6b9f257.f181941v);
        }
    }

    public static void e7(android.app.Activity activity) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activity);
        u1Var.g(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_k));
        u1Var.n(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_g));
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.t4());
        u1Var.q(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.y0
    public void D5(int i17, int i18) {
        v82.b bVar = this.F;
        bVar.f515607h = i17;
        bVar.f515609j = i18;
        c7(9, 0, 1, 2, i18, true);
    }

    @Override // s82.h
    public void F4(long j17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = this.f181933n;
        if (cVar.f182017q) {
            this.L.b(cVar.l() > 0);
        }
    }

    public final void Z6() {
        this.f181933n.g(false, null);
        this.f181936q.setOnItemLongClickListener(this.M);
        this.L.c();
        if (d7()) {
            this.I.i();
        }
    }

    public final boolean a7() {
        if (this.f181933n.f182017q) {
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
        bVar.f515600a = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = this.f181933n;
        if (cVar != null) {
            bVar.f515601b = cVar.G;
        }
        int i19 = this.f181926d;
        if (i19 == 0) {
            bVar.f515602c = 1;
        } else if (i19 == 1) {
            bVar.f515602c = 2;
        } else if (i19 != 2) {
            bVar.f515602c = 0;
        } else {
            bVar.f515602c = 3;
        }
        bVar.f515603d = ((int) (java.lang.System.currentTimeMillis() - this.G)) / 1000;
        this.F.f515604e = this.H;
        java.util.List list = this.f181942w;
        if (list != null) {
            if (list.size() > 0) {
                int intValue = ((java.lang.Integer) this.f181942w.get(0)).intValue();
                this.F.f515605f = v82.b.c(intValue);
            } else {
                this.F.f515605f = 0;
            }
        }
        v82.b bVar2 = this.F;
        bVar2.f515607h = (int) (bVar2.f515611l - bVar2.f515610k);
        bVar2.f515608i = java.lang.String.format("%d", java.lang.Integer.valueOf(i18));
        this.F.f515609j = this.f181933n.getCount() - 1;
        this.F.b();
    }

    public final void c7(int i17, int i18, int i19, int i27, int i28, boolean z17) {
        int i29 = this.f181926d;
        int i37 = i29 != 0 ? i29 != 1 ? i29 != 2 ? 0 : 3 : 2 : 1;
        java.lang.String str = this.H;
        v82.b bVar = this.F;
        java.lang.String str2 = bVar.f515606g;
        int i38 = bVar.f515607h;
        if (!z17) {
            i38 = (int) (bVar.f515611l - bVar.f515610k);
        }
        bVar.f515600a = i17;
        bVar.f515602c = i37;
        bVar.f515601b = i27;
        bVar.f515605f = i19;
        bVar.f515603d = ((int) (java.lang.System.currentTimeMillis() - this.G)) / 1000;
        v82.b bVar2 = this.F;
        bVar2.f515604e = str;
        bVar2.f515606g = str2;
        bVar2.f515607h = i38;
        bVar2.f515608i = java.lang.String.format("%d", java.lang.Integer.valueOf(i18));
        v82.b bVar3 = this.F;
        bVar3.f515609j = i28;
        bVar3.b();
    }

    public final boolean d7() {
        return this.f181927e == 21;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.y0
    public void e(int i17) {
        c7(2, 0, 1, 2, this.F.f515609j, true);
    }

    public final void f7() {
        if (this.f181935p != null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13620xa33772de c13620xa33772de = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13620xa33772de) android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.abv, null);
        this.f181935p = c13620xa33772de;
        android.view.View findViewById = c13620xa33772de.findViewById(com.p314xaae8f345.mm.R.id.b5i);
        this.A = findViewById;
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h5(this));
        android.widget.ImageButton imageButton = (android.widget.ImageButton) this.f181935p.findViewById(com.p314xaae8f345.mm.R.id.mdl);
        this.B = imageButton;
        imageButton.setVisibility(8);
        this.f181935p.m55396x1f63255f(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j5(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.abw;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.y0
    public void l3(int i17, int i18) {
        c7(3, i17, 1, 2, i18, true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.y0
    public void n4(int i17, int i18) {
        c7(6, 0, 1, 2, this.F.f515609j, true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSearchUI", "onActivityResult reqCode: %d, retCod: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1) {
            if (i17 == 4105) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = this.f181933n;
                if (cVar == null) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.f(this, "", cVar.k(false), false);
                return;
            }
            if (i17 == 4106 && this.K != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(this.K);
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.f(this, "", arrayList, false);
                return;
            }
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("custom_send_text");
        java.lang.String stringExtra2 = intent.getStringExtra("Select_Conv_User");
        if (i17 != 1) {
            if (i17 == 4105) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.b(mo55332x76847179(), this.f181933n.k(false), stringExtra, stringExtra2, "MicroMsg.FavSearchUI");
            } else if (i17 == 4106) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(this.K);
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ec.b(mo55332x76847179(), arrayList2, stringExtra, stringExtra2, "MicroMsg.FavSearchUI");
            }
        } else {
            if (i18 != -1) {
                return;
            }
            java.util.List list = this.I.f182497x;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                return;
            }
            java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra2.split(","));
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.b1) it.next();
                if (b1Var != null) {
                    if (new o72.b3().a(b1Var.f182430a, false, false)) {
                        db5.e1.T(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571238e));
                        return;
                    }
                    boolean d17 = b1Var.d();
                    r45.gp0 gp0Var = b1Var.f182431b;
                    if (d17 || b1Var.c()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b5 b5Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.b5(this, db5.e1.Q(mo55332x76847179(), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.cax), true, false, null));
                        java.util.Iterator it6 = P1.iterator();
                        while (it6.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.k(this, (java.lang.String) it6.next(), gp0Var, b5Var);
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
                                gVar.f474641j = "fav_search_send_img";
                                gVar.f474639h = 0;
                                ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
                            }
                        }
                    }
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
        a7();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.transition.Transition inflateTransition = android.transition.TransitionInflater.from(this).inflateTransition(android.R.transition.fade);
        inflateTransition.excludeTarget(getWindow().getDecorView().findViewById(com.p314xaae8f345.mm.R.id.f563968ei), true);
        inflateTransition.excludeTarget(android.R.id.statusBarBackground, true);
        getWindow().setEnterTransition(inflateTransition);
        this.D = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        mo54450xbf7c1df6("");
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
        int intExtra = getIntent().getIntExtra("key_search_type", 0);
        this.f181926d = intExtra;
        if (1 == intExtra) {
            this.f181928f = getIntent().getStringExtra("key_to_user");
            this.f181929g = getIntent().getStringExtra("key_fav_item_id");
        }
        this.f181927e = getIntent().getIntExtra("key_preset_search_type", -1);
        this.f181937r = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f568751nx4);
        this.f181936q = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.mff);
        this.f181938s = findViewById(com.p314xaae8f345.mm.R.id.f568297me2);
        this.f181940u = android.view.animation.AnimationUtils.loadAnimation(mo55332x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559368ct);
        this.f181941v = android.view.animation.AnimationUtils.loadAnimation(mo55332x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559369cu);
        f7();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13616x9df1f62f c13616x9df1f62f = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13616x9df1f62f) android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.aau, null);
        this.f181939t = c13616x9df1f62f;
        c13616x9df1f62f.f183058g = getIntent().getIntExtra("key_enter_fav_search_from", 0);
        this.f181934o = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.k5(this, mo55332x76847179());
        if (((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj().c() > 0) {
            this.f181937r.addHeaderView((android.widget.TextView) android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.abz, null));
        }
        this.f181937r.addFooterView(this.f181939t);
        this.f181937r.setAdapter((android.widget.ListAdapter) this.f181934o);
        this.f181932m = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra(mo55332x76847179(), 16);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c(mo55332x76847179(), this.f181932m, false);
        this.f181933n = cVar;
        cVar.f182025y = this;
        cVar.F = 2;
        cVar.I = this.f181936q;
        if (1 == this.f181926d) {
            this.f181930h = new java.util.HashSet();
            this.f181931i = new o72.b3();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f181929g)) {
                for (java.lang.String str : this.f181929g.split(",")) {
                    int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, Integer.MAX_VALUE);
                    if (Integer.MAX_VALUE != P) {
                        ((java.util.HashSet) this.f181930h).add(java.lang.Integer.valueOf(P));
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.c cVar2 = this.f181933n;
            cVar2.f182008f = this.f181930h;
            cVar2.f182009g = this.f181931i;
        }
        this.f181936q.setAdapter((android.widget.ListAdapter) this.f181933n);
        this.f181936q.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p5(this));
        this.f181936q.setOnItemLongClickListener(this.M);
        this.f181936q.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.n4(this));
        w82.k kVar = new w82.k();
        this.L = kVar;
        kVar.a(findViewById(com.p314xaae8f345.mm.R.id.du7));
        this.L.f525436k = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.s4(this);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0(this, findViewById(com.p314xaae8f345.mm.R.id.dvb), this.f181932m);
        this.I = h0Var;
        h0Var.f182488o = this;
        gm0.j1.e().k(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.d5(this), 1000L);
        this.F = new v82.b();
        this.G = java.lang.System.currentTimeMillis();
        this.F.f515606g = v82.b.a();
        this.F.f515610k = this.G;
        if (d7()) {
            this.f181935p.d(this.f181927e, false);
            this.f181936q.setVisibility(8);
            this.f181937r.setVisibility(8);
            this.I.g(0);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var2 = this.I;
            h0Var2.f182491r = false;
            if (h0Var2.f182474a != null) {
                h0Var2.f182489p = java.lang.System.currentTimeMillis();
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2) h0Var2.f182474a).e(true, h0Var2.f182483j);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f181942w = arrayList;
            arrayList.add(java.lang.Integer.valueOf(this.f181927e));
        } else {
            int i17 = this.f181927e;
            if (i17 > 0) {
                this.f181935p.d(i17, true);
                this.I.g(8);
                this.f181936q.setVisibility(0);
            }
        }
        ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Zi(this, new o04.e(r45.fq0.class, 17, true));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        f7();
        android.view.MenuItem add = menu.add(0, com.p314xaae8f345.mm.R.id.jha, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f571919tj);
        this.C = add;
        add.setActionView(this.f181935p);
        this.C.setShowAsAction(9);
        this.f181935p.post(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.e5(this));
        this.C.setOnActionExpandListener(new n3.y(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.f5(this)));
        this.D.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.g5(this));
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        int i17 = this.F.f515600a;
        if (!((i17 == 1 || i17 == 9) ? false : true)) {
            b7(1, 0);
        }
        this.I.c();
        super.onDestroy();
        this.f181932m.f();
        this.f181932m = null;
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj().g(this.f181945z);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (4 == i17 && this.f181933n.f182017q) {
            Z6();
            return true;
        }
        if (4 != i17 || !d7() || !this.I.a()) {
            return super.onKeyUp(i17, keyEvent);
        }
        this.I.i();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        o72.z2.c(getClass().getSimpleName(), "");
        if (d7()) {
            this.I.d();
        }
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        this.f181933n.c();
        this.f181933n.notifyDataSetChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13616x9df1f62f c13616x9df1f62f = this.f181939t;
        if (c13616x9df1f62f.f183056e != o72.x1.K() / 1048576) {
            c13616x9df1f62f.f183056e = o72.x1.K() / 1048576;
            android.widget.TextView textView = c13616x9df1f62f.f183057f;
            android.content.Context context = textView.getContext();
            java.lang.Object[] objArr = new java.lang.Object[2];
            long j17 = c13616x9df1f62f.f183059h - c13616x9df1f62f.f183056e;
            if (j17 <= 0) {
                j17 = 0;
            }
            objArr[0] = java.lang.Long.valueOf(j17);
            objArr[1] = java.lang.Long.valueOf(c13616x9df1f62f.f183056e);
            textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c9f, objArr));
        }
        o72.z2.a(getClass().getSimpleName());
        if (d7()) {
            this.I.e();
        }
        super.onResume();
    }
}
