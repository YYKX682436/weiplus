package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI */
/* loaded from: classes12.dex */
public class ActivityC13597x28c5d1bd extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements android.widget.AdapterView.OnItemSelectedListener, o72.x3, g04.h, o72.e5, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.l1 {
    public static final /* synthetic */ int C = 0;
    public long A;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 f182405f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.f0 f182406g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f182407h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f182408i;

    /* renamed from: s, reason: collision with root package name */
    public boolean f182415s;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.nc f182417u;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m1 f182419w;

    /* renamed from: d, reason: collision with root package name */
    public int f182403d = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 f182404e = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f182409m = true;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f182410n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f182411o = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public boolean f182412p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f182413q = 0;

    /* renamed from: r, reason: collision with root package name */
    public final r45.dq0 f182414r = new r45.dq0();

    /* renamed from: t, reason: collision with root package name */
    public final boolean f182416t = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.k1.f240283b;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Map f182418v = new java.util.HashMap();

    /* renamed from: x, reason: collision with root package name */
    public boolean f182420x = false;

    /* renamed from: y, reason: collision with root package name */
    public int f182421y = 0;

    /* renamed from: z, reason: collision with root package name */
    public final db5.t4 f182422z = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.a0(this);
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d B = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI.13
        {
            this.f39173x3fe91575 = 812146647;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be72 = c5886xd11a0be7;
            java.lang.String str = c5886xd11a0be72.f136194g.f87901a;
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.ActivityC13597x28c5d1bd activityC13597x28c5d1bd = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.ActivityC13597x28c5d1bd.this;
            ((java.util.HashMap) activityC13597x28c5d1bd.f182418v).put(str, c5886xd11a0be72);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = activityC13597x28c5d1bd.f182408i;
            if (k0Var == null || !k0Var.i()) {
                return true;
            }
            activityC13597x28c5d1bd.V6(false);
            return true;
        }
    };

    @Override // o72.e5
    public void L0() {
    }

    @Override // o72.x3
    public void R4(o72.e2 e2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item;
        if (e2Var == null || (item = this.f182406g.getItem(this.f182403d)) == null) {
            return;
        }
        java.lang.String str = e2Var.f67085xf604e54a;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (str.equals(item.i()) && item.k() == 2) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.s(this, e2Var));
        }
    }

    public final void T6() {
        if (this.f182419w == null || !U6()) {
            finish();
        } else {
            this.f182419w.a(true);
        }
    }

    public final boolean U6() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item = this.f182406g.getItem(this.f182403d);
        return item != null && item.k() == 2;
    }

    public final void V6(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item = this.f182406g.getItem(this.f182403d);
        if (item == null) {
            return;
        }
        if (item.l() != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMediaGalleryUI", "showMenu, illegalType");
        } else if (item.k() == 2) {
            if (item.b()) {
                arrayList.add(0);
                arrayList2.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccw));
            }
            if (item.c()) {
                arrayList.add(1);
                arrayList2.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.cbx));
            }
            arrayList.add(2);
            arrayList2.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccr));
            java.lang.String j17 = item.j();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7) ((java.util.HashMap) this.f182418v).get(j17);
            if (c5886xd11a0be7 != null) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6 s6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.f273431a;
                java.lang.String e17 = s6Var.e(c5886xd11a0be7);
                arrayList.add(3);
                int c17 = s6Var.c(c5886xd11a0be7);
                ((jd0.z1) ((kd0.l2) i95.n0.c(kd0.l2.class))).getClass();
                if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.o(c17, e17)) {
                    arrayList2.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572740cc4));
                } else {
                    ((jd0.z1) ((kd0.l2) i95.n0.c(kd0.l2.class))).getClass();
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.d(c17, e17)) {
                        arrayList2.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572738cc2));
                    } else {
                        arrayList2.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572739cc3));
                    }
                }
            } else {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184 c5884x4c2d9184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                am.aq aqVar = c5884x4c2d9184.f136192g;
                aqVar.f87707a = currentTimeMillis;
                aqVar.f87708b = j17;
                c5884x4c2d9184.e();
            }
            boolean z18 = this.f182416t;
            if ((z18 || this.f182415s) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17)) {
                arrayList.add(5);
                arrayList2.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2e));
            }
            arrayList.add(6);
            arrayList2.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2d));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17)) {
                gm0.j1.i();
                if (gm0.j1.n().f354821b.n() != 0 && z17 && !z18) {
                    this.f182417u.d(j17);
                }
            }
        } else if (com.p314xaae8f345.mm.vfs.w6.j(item.j())) {
            if (item.b()) {
                arrayList.add(0);
                arrayList2.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccw));
            }
            arrayList.add(2);
            arrayList2.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i8d));
        }
        if (!this.f182420x) {
            arrayList.add(4);
            arrayList2.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.caz));
        }
        if (this.f182408i == null) {
            this.f182408i = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) mo55332x76847179(), 1, false);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f182408i;
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.y(this, arrayList, arrayList2);
        k0Var.f293414s = this.f182422z;
        k0Var.p(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.z(this));
        this.f182408i.v();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.l1
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a W() {
        int selectedItemPosition = this.f182405f.getSelectedItemPosition();
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89 = this.f182405f;
        android.view.View childAt = c22506x89e75b89.getChildAt(selectedItemPosition - c22506x89e75b89.getFirstVisiblePosition());
        if (childAt == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMediaGalleryUI", "getCurView() pos:%s firstPos:%s", java.lang.Integer.valueOf(selectedItemPosition), java.lang.Integer.valueOf(this.f182405f.getFirstVisiblePosition()));
            return null;
        }
        if (childAt instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) {
            return (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) childAt;
        }
        android.view.View findViewById = childAt.findViewById(com.p314xaae8f345.mm.R.id.h88);
        if (findViewById instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) {
            return (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) findViewById;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.l1
    public java.lang.String Y5() {
        return this.f182406g.getItem(this.f182405f.getSelectedItemPosition()).i();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        setResult(0, getIntent().putExtra("KEY_VIEW_PIC_CNT", this.f182421y));
        super.finish();
    }

    @Override // o72.e5
    /* renamed from: getAesKey */
    public java.lang.String mo54574x1061ea06() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item = this.f182406g.getItem(this.f182403d);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMediaGalleryUI", "local translate, img %s, result %s, ratio %d", x27, lVar.f349002a, java.lang.Integer.valueOf(b17));
        if (((java.lang.String) obj).equals(x27) && com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.k1.f(b17)) {
            this.f182415s = true;
            V6(false);
        }
    }

    @Override // o72.e5
    public void l5() {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        boolean z17;
        if (1 == i17) {
            if (-1 != i18) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item = this.f182406g.getItem(this.f182403d);
            if (item == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMediaGalleryUI", "dataItem is null.");
                return;
            }
            java.lang.String j17 = item.j();
            if (item.a(new o72.b3())) {
                db5.e1.T(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571238e));
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
            java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(mo55332x76847179(), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.cax), true, false, null);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(j17)) {
                java.util.Iterator it = P1.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.g(mo55332x76847179(), (java.lang.String) it.next(), item.p(), item.n(), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.t(this, Q));
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.u(this, Q);
                java.util.Iterator it6 = P1.iterator();
                while (it6.hasNext()) {
                    java.lang.String str = (java.lang.String) it6.next();
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.k(this, str, item.n(), uVar);
                    if (stringExtra2 != null) {
                        int length = stringExtra2.length();
                        int i19 = 0;
                        while (true) {
                            if (i19 >= length) {
                                z17 = true;
                                break;
                            }
                            int codePointAt = stringExtra2.codePointAt(i19);
                            if (!java.lang.Character.isWhitespace(codePointAt)) {
                                z17 = false;
                                break;
                            }
                            i19 += java.lang.Character.charCount(codePointAt);
                        }
                        if (!z17) {
                            ((dk5.s5) tg3.t1.a()).fj(str, stringExtra2, c01.e2.C(str), 0);
                        }
                    }
                }
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int i17;
        int i18;
        int i19;
        int size;
        super.onCreate(bundle);
        if (fp.h.c(19)) {
            getWindow().setFlags(201327616, 201327616);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        this.f182417u = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.nc(this, this, this);
        this.f182409m = getIntent().getBooleanExtra("show_share", true);
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89 = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89) findViewById(com.p314xaae8f345.mm.R.id.ghs);
        this.f182405f = c22506x89e75b89;
        c22506x89e75b89.setVerticalFadingEdgeEnabled(false);
        this.f182405f.setHorizontalFadingEdgeEnabled(false);
        this.f182405f.setOnItemSelectedListener(this);
        this.f182405f.mo55657x3be48126(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.v(this));
        if (this.f182409m) {
            this.f182405f.mo55655xf8a6a4f2(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.w(this));
        }
        m78505x1ef531b7(true);
        this.f182407h = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.f0 f0Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.f0(this, null);
        this.f182406g = f0Var;
        this.f182405f.setAdapter((android.widget.SpinnerAdapter) f0Var);
        long[] longArrayExtra = getIntent().getLongArrayExtra("KEY_MEDIA_FAVID_LIST");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String stringExtra = getIntent().getStringExtra("key_detail_data_id");
        this.A = getIntent().getLongExtra("key_detail_info_id", -1L);
        boolean booleanExtra = getIntent().getBooleanExtra("fav_open_from_wnnote", false);
        java.lang.String stringExtra2 = getIntent().getStringExtra("fav_note_xml");
        if (longArrayExtra == null) {
            o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.A);
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Long.valueOf(this.A);
            objArr[1] = java.lang.Boolean.valueOf(F != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMediaGalleryUI", "show one fav info, local id is %d, get from db ok ? %B", objArr);
            if (booleanExtra && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                F = o72.x1.B(stringExtra2, 18);
            }
            if (F != null) {
                arrayList.add(F);
            }
        } else {
            for (long j17 : longArrayExtra) {
                o72.r2 F2 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
                if (F2 != null && !arrayList.contains(F2)) {
                    arrayList.add(F2);
                }
            }
            if (arrayList.size() == 0 && booleanExtra && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                arrayList.add(o72.x1.B(stringExtra2, 18));
            }
        }
        this.f182407h.clear();
        int size2 = arrayList.size();
        int i27 = -1;
        int i28 = 0;
        while (i28 < size2) {
            o72.r2 r2Var = (o72.r2) arrayList.get(i28);
            int size3 = r2Var.f67640x5ab01132.f452497f.size();
            int i29 = 0;
            while (i29 < size3) {
                r45.gp0 gp0Var = (r45.gp0) r2Var.f67640x5ab01132.f452497f.get(i29);
                int i37 = gp0Var.I;
                if (((i37 != 8 && i37 != 10130) || com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(o72.x1.x(gp0Var))) && ((i19 = gp0Var.I) == 2 || i19 == 4 || i19 == 15 || i19 == 8)) {
                    this.f182407h.add(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.p(r2Var, gp0Var));
                    if (stringExtra != null && stringExtra.equals(gp0Var.T)) {
                        long j18 = r2Var.f67645x88be67a1;
                        if (j18 != -1) {
                            i17 = size2;
                            i18 = i27;
                            if (j18 == this.A) {
                                size = this.f182407h.size();
                            } else {
                                i27 = i18;
                                i29++;
                                size2 = i17;
                            }
                        } else {
                            i17 = size2;
                            size = this.f182407h.size();
                        }
                        i27 = size - 1;
                        i29++;
                        size2 = i17;
                    }
                }
                i17 = size2;
                i18 = i27;
                i27 = i18;
                i29++;
                size2 = i17;
            }
            int i38 = size2;
            i27 = (stringExtra == null && r2Var.f67645x88be67a1 == this.A) ? this.f182407h.size() - 1 : i27;
            i28++;
            size2 = i38;
        }
        getIntent().removeExtra("key_detail_info_id");
        getIntent().removeExtra("key_detail_data_id");
        this.f182406g.notifyDataSetChanged();
        if (i27 >= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavMediaGalleryUI", "pre match selection %d", java.lang.Integer.valueOf(i27));
            this.f182405f.setSelection(i27);
            this.f182403d = i27;
        }
        this.f182413q = i27;
        this.f182405f.post(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.d0(this, i27));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.x(this));
        this.B.mo48813x58998cd();
        setResult(0, getIntent().putExtra("KEY_VIEW_PIC_CNT", this.f182421y));
        int intExtra = getIntent().getIntExtra("key_detail_fav_scene", 0);
        r45.dq0 dq0Var = this.f182414r;
        dq0Var.f454186d = intExtra;
        dq0Var.f454187e = getIntent().getIntExtra("key_detail_fav_sub_scene", 0);
        dq0Var.f454188f = getIntent().getIntExtra("key_detail_fav_index", 0);
        dq0Var.f454190h = getIntent().getStringExtra("key_detail_fav_query");
        dq0Var.f454189g = getIntent().getStringExtra("key_detail_fav_sessionid");
        java.lang.String stringExtra3 = getIntent().getStringExtra("key_detail_fav_tags");
        dq0Var.f454191i = stringExtra3;
        java.lang.String str = dq0Var.f454190h;
        if (str == null) {
            str = "";
        }
        dq0Var.f454190h = str;
        java.lang.String str2 = dq0Var.f454189g;
        if (str2 == null) {
            str2 = "";
        }
        dq0Var.f454189g = str2;
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        dq0Var.f454191i = stringExtra3;
        if (getIntent().getBooleanExtra("KEY_MEDIA_SUPPORT_DRAG", false)) {
            this.f182419w = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m1(this.f182405f, this, this);
        }
        this.f182420x = getIntent().getBooleanExtra("KEY_MEDIA_HIDE_GO_DETAIL", false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        getIntent().putExtra("key_activity_browse_time", mo78509x4b0ac5a2());
        this.B.mo48814x2efc64();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m1 m1Var = this.f182419w;
        if (m1Var != null) {
            m1Var.f182787b = null;
            m1Var.f182786a = null;
            m1Var.f182790e = null;
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f182410n).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb4505 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505) it.next();
            if (viewOnClickListenerC13625xe5fb4505 != null) {
                viewOnClickListenerC13625xe5fb4505.e();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.nc ncVar = this.f182417u;
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
        yj0.a.b("com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f182421y++;
        this.f182403d = i17;
        if (view instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) view).i();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb4505 = this.f182404e;
        if (viewOnClickListenerC13625xe5fb4505 != null) {
            viewOnClickListenerC13625xe5fb4505.e();
        }
        if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb45052 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505) view;
            if ((this.f182406g.getItemViewType(i17) == 15 || this.f182406g.getItemViewType(i17) == 4) && !viewOnClickListenerC13625xe5fb45052.d()) {
                if (i17 != this.f182413q || this.f182412p) {
                    viewOnClickListenerC13625xe5fb45052.m55411x903960f9(false);
                } else {
                    viewOnClickListenerC13625xe5fb45052.m55411x903960f9(true);
                    this.f182412p = true;
                }
                viewOnClickListenerC13625xe5fb45052.f();
                this.f182404e = viewOnClickListenerC13625xe5fb45052;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaGalleryUI", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || this.f182419w == null) {
            return super.onKeyDown(i17, keyEvent);
        }
        T6();
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
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item = this.f182406g.getItem(this.f182403d);
        return (item != null && item.k() == 2) ? item.j() : "";
    }

    @Override // o72.e5
    public java.lang.String y3() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item = this.f182406g.getItem(this.f182403d);
        if (item == null) {
            return null;
        }
        return item.f();
    }
}
