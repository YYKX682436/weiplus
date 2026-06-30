package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

@db5.a(m123858x6ac9171 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m9.f34451x366c91de)
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.fav.ui.FavImgGalleryUI */
/* loaded from: classes12.dex */
public class ActivityC13568x82804f7e extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements android.widget.AdapterView.OnItemSelectedListener, o72.x3, g04.h, o72.e5, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.l1 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f181889v = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 f181891e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x3 f181892f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f181893g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f181894h;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m1 f181896m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f181898o;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.nc f181900q;

    /* renamed from: r, reason: collision with root package name */
    public kd0.p2 f181901r;

    /* renamed from: t, reason: collision with root package name */
    public long f181903t;

    /* renamed from: d, reason: collision with root package name */
    public int f181890d = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f181895i = true;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f181897n = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public final boolean f181899p = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.k1.f240283b;

    /* renamed from: s, reason: collision with root package name */
    public final db5.t4 f181902s = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.t3(this);

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f181904u = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.fav.ui.FavImgGalleryUI.13
        {
            this.f39173x3fe91575 = 812146647;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be72 = c5886xd11a0be7;
            java.lang.String str = c5886xd11a0be72.f136194g.f87901a;
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y3 y3Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y3(null);
            y3Var.f183149a = c5886xd11a0be72;
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e activityC13568x82804f7e = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e.this;
            ((java.util.HashMap) activityC13568x82804f7e.f181897n).put(str, y3Var);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = activityC13568x82804f7e.f181894h;
            if (k0Var == null || !k0Var.i()) {
                return true;
            }
            activityC13568x82804f7e.U6(false);
            return true;
        }
    };

    @Override // o72.e5
    public void L0() {
    }

    @Override // o72.x3
    public void R4(o72.e2 e2Var) {
        if (e2Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavImgGalleryUI", "on cdn status changed, status:%d", java.lang.Integer.valueOf(e2Var.f67093x10a0fed7));
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item = this.f181892f.getItem(this.f181890d);
            if (item != null) {
                java.lang.String str = e2Var.f67085xf604e54a;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str == null) {
                    str = "";
                }
                if (str.equals(item.i())) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.l3(this, e2Var));
                }
            }
        }
    }

    public final java.util.List T6(r45.bq0 bq0Var, java.lang.String str) {
        java.util.LinkedList linkedList;
        java.util.List T6;
        if (bq0Var == null || (linkedList = bq0Var.f452497f) == null) {
            return null;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            if (gp0Var.T.equals(str)) {
                return bq0Var.f452497f;
            }
            if (o72.x1.h0(gp0Var.I) && (T6 = T6(gp0Var.f456984y2, str)) != null) {
                return T6;
            }
        }
        return null;
    }

    public final void U6(boolean z17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item = this.f181892f.getItem(this.f181890d);
        if (item != null && item.l() == 0) {
            if (item.b()) {
                arrayList.add(0);
                arrayList2.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccw));
            }
            if (item.c()) {
                arrayList.add(1);
                arrayList2.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.cbx));
            }
            arrayList.add(2);
            arrayList2.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i89));
            java.lang.String j17 = item.j();
            boolean z18 = this.f181899p;
            if ((z18 || this.f181898o) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17)) {
                arrayList.add(4);
                arrayList2.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2e));
            }
            arrayList.add(5);
            arrayList2.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2d));
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y3 y3Var = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y3) ((java.util.HashMap) this.f181897n).get(j17);
            if (y3Var == null || (c5886xd11a0be7 = y3Var.f183149a) == null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184 c5884x4c2d9184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                am.aq aqVar = c5884x4c2d9184.f136192g;
                aqVar.f87707a = currentTimeMillis;
                aqVar.f87708b = j17;
                c5884x4c2d9184.e();
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6 s6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.f273431a;
                java.lang.String e17 = s6Var.e(c5886xd11a0be7);
                int c17 = s6Var.c(c5886xd11a0be7);
                arrayList.add(3);
                arrayList2.add(((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) this.f181901r).l(c17, e17));
            }
            if (this.f181894h == null) {
                this.f181894h = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) mo55332x76847179(), 1, false);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f181894h;
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.r3(this, arrayList, y3Var, arrayList2);
            k0Var.f293414s = this.f181902s;
            k0Var.p(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.s3(this));
            if (!mo55332x76847179().isFinishing()) {
                this.f181894h.v();
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17)) {
                return;
            }
            gm0.j1.i();
            if (gm0.j1.n().f354821b.n() == 0 || !z17 || z18) {
                return;
            }
            this.f181900q.d(j17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.l1
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a W() {
        int selectedItemPosition = this.f181891e.getSelectedItemPosition();
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89 = this.f181891e;
        android.view.View childAt = c22506x89e75b89.getChildAt(selectedItemPosition - c22506x89e75b89.getFirstVisiblePosition());
        if (childAt != null) {
            return childAt instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) childAt : (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) childAt.findViewById(com.p314xaae8f345.mm.R.id.h88);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavImgGalleryUI", "getCurView() pos:%s firstPos:%s", java.lang.Integer.valueOf(selectedItemPosition), java.lang.Integer.valueOf(this.f181891e.getFirstVisiblePosition()));
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.l1
    public java.lang.String Y5() {
        return this.f181892f.getItem(this.f181891e.getSelectedItemPosition()).i();
    }

    @Override // o72.e5
    /* renamed from: getAesKey */
    public java.lang.String mo54574x1061ea06() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item = this.f181892f.getItem(this.f181890d);
        if (item == null) {
            return null;
        }
        return item.e();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ab9;
    }

    @Override // g04.h
    public void k5(java.lang.Object obj, java.lang.Object obj2) {
        g04.l lVar = (g04.l) obj2;
        java.lang.String x27 = x2();
        int b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.k1.b(lVar.f349002a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavImgGalleryUI", "local translate, img %s, result %s, ratio %d", x27, lVar.f349002a, java.lang.Integer.valueOf(b17));
        if (((java.lang.String) obj).equals(x27) && com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.k1.f(b17)) {
            this.f181898o = true;
            U6(false);
        }
    }

    @Override // o72.e5
    public void l5() {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (1 == i17) {
            if (-1 != i18) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item = this.f181892f.getItem(this.f181890d);
            if (item == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavImgGalleryUI", "dataItem is null.");
                return;
            } else if (item.a(new o72.b3())) {
                db5.e1.T(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571238e));
                return;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.g(mo55332x76847179(), intent.getStringExtra("Select_Conv_User"), item.p(), item.n(), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m3(this, db5.e1.Q(mo55332x76847179(), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.cax), true, false, null)));
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean z17;
        char c17;
        super.onCreate(bundle);
        m78531x8f8cf1fb();
        if (fp.h.c(19)) {
            getWindow().setFlags(201327616, 201327616);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        this.f181900q = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.nc(this, this, this);
        this.f181895i = getIntent().getBooleanExtra("show_share", true);
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89 = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89) findViewById(com.p314xaae8f345.mm.R.id.ghs);
        this.f181891e = c22506x89e75b89;
        this.f181896m = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m1(c22506x89e75b89, this, this);
        int i17 = 0;
        this.f181891e.setVerticalFadingEdgeEnabled(false);
        this.f181891e.setHorizontalFadingEdgeEnabled(false);
        this.f181891e.setOnItemSelectedListener(this);
        this.f181891e.mo55657x3be48126(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.n3(this));
        if (this.f181895i) {
            this.f181891e.mo55655xf8a6a4f2(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.o3(this));
        }
        m78505x1ef531b7(true);
        this.f181893g = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x3 x3Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x3(this, null);
        this.f181892f = x3Var;
        this.f181891e.setAdapter((android.widget.SpinnerAdapter) x3Var);
        this.f181903t = getIntent().getLongExtra("key_detail_info_id", -1L);
        java.lang.String stringExtra = getIntent().getStringExtra("key_detail_data_id");
        boolean booleanExtra = getIntent().getBooleanExtra("fav_open_from_wnnote", false);
        java.lang.String stringExtra2 = getIntent().getStringExtra("fav_note_xml");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.f181903t);
        char c18 = 2;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Long.valueOf(this.f181903t);
        objArr[1] = java.lang.Boolean.valueOf(F != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavImgGalleryUI", "show one fav info, local id is %d, get from db ok ? %B", objArr);
        if (booleanExtra && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            F = o72.x1.B(stringExtra2, 18);
        }
        if (F != null) {
            arrayList.add(F);
        }
        this.f181893g.clear();
        java.util.List T6 = arrayList.size() == 1 ? T6(((o72.r2) arrayList.get(0)).f67640x5ab01132, stringExtra) : null;
        int size = arrayList.size();
        int i18 = -1;
        int i19 = 0;
        while (i19 < size) {
            o72.r2 r2Var = (o72.r2) arrayList.get(i19);
            if (T6 == null) {
                T6 = r2Var.f67640x5ab01132.f452497f;
            }
            int size2 = T6.size();
            int i27 = i17;
            while (i27 < size2) {
                r45.gp0 gp0Var = (r45.gp0) T6.get(i27);
                int i28 = gp0Var.I;
                if ((i28 == 8 || i28 == 10130) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(o72.x1.x(gp0Var))) {
                    c17 = 2;
                } else {
                    int i29 = gp0Var.I;
                    c17 = 2;
                    if (i29 == 2 || i29 == 8 || i29 == 10130) {
                        this.f181893g.add(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.p(r2Var, gp0Var));
                        if (stringExtra != null && stringExtra.equals(gp0Var.T)) {
                            i18 = this.f181893g.size() - 1;
                        }
                    }
                }
                i27++;
                c18 = c17;
            }
            char c19 = c18;
            if (stringExtra == null && r2Var.f67645x88be67a1 == this.f181903t) {
                z17 = true;
                i18 = this.f181893g.size() - 1;
            } else {
                z17 = true;
            }
            i19++;
            i17 = 0;
            c18 = c19;
        }
        getIntent().removeExtra("key_detail_info_id");
        getIntent().removeExtra("key_detail_data_id");
        this.f181892f.notifyDataSetChanged();
        this.f181891e.post(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.k3(this, i18));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p3(this));
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.q3 q3Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.q3(this);
        ((jd0.q2) x2Var).getClass();
        this.f181901r = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636(this, q3Var);
        this.f181904u.mo48813x58998cd();
        setResult(0, getIntent());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        getIntent().putExtra("key_activity_browse_time", mo78509x4b0ac5a2());
        this.f181904u.mo48814x2efc64();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m1 m1Var = this.f181896m;
        if (m1Var != null) {
            m1Var.f182787b = null;
            m1Var.f182786a = null;
            m1Var.f182790e = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.nc ncVar = this.f181900q;
        if (ncVar != null) {
            ncVar.c();
        }
        super.onDestroy();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/FavImgGalleryUI", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f181890d = i17;
        if (view instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) view).i();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/FavImgGalleryUI", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        this.f181896m.a(true);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView adapterView) {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Y(this);
        qp1.h0.b();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Ia(this);
        qp1.h0.a(true, true, true);
    }

    @Override // o72.e5
    public java.lang.String x2() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item = this.f181892f.getItem(this.f181890d);
        return item == null ? "" : item.j();
    }

    @Override // o72.e5
    public java.lang.String y3() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item = this.f181892f.getItem(this.f181890d);
        if (item == null) {
            return null;
        }
        return item.f();
    }
}
