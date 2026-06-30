package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

@db5.a(m123858x6ac9171 = 3)
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.component.editor.EditorImageUI */
/* loaded from: classes12.dex */
public class ActivityC13155x6eea6ae2 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements g04.h, o72.e5, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.l1 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f178010x = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f178011d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m1 f178012e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 f178013f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.m0 f178014g;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f178018n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f178020p;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.nc f178022r;

    /* renamed from: s, reason: collision with root package name */
    public kd0.p2 f178023s;

    /* renamed from: h, reason: collision with root package name */
    public int f178015h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final long f178016i = -1;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f178017m = null;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f178019o = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final boolean f178021q = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.k1.f240283b;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.e f178024t = new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.i0(this);

    /* renamed from: u, reason: collision with root package name */
    public final db5.t4 f178025u = new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.y(this);

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.Runnable f178026v = new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.c0(this);

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f178027w = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.component.editor.EditorImageUI.14
        {
            this.f39173x3fe91575 = 812146647;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be72 = c5886xd11a0be7;
            java.lang.String str = c5886xd11a0be72.f136194g.f87901a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.n0 n0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.n0(null);
            n0Var.f178146a = c5886xd11a0be72;
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13155x6eea6ae2 activityC13155x6eea6ae2 = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13155x6eea6ae2.this;
            ((java.util.HashMap) activityC13155x6eea6ae2.f178019o).put(str, n0Var);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = activityC13155x6eea6ae2.f178018n;
            if (k0Var == null || !k0Var.i()) {
                return true;
            }
            activityC13155x6eea6ae2.U6(false);
            return true;
        }
    };

    @Override // o72.e5
    public void L0() {
    }

    public final java.lang.String T6() {
        int selectedItemPosition = this.f178013f.getSelectedItemPosition();
        if (-1 != selectedItemPosition) {
            return ((ix1.c) this.f178014g.getItem(selectedItemPosition)).f376855s;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Editor.EditorImageUI", "error position");
        return null;
    }

    public final void U6(boolean z17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList.add(0);
        arrayList2.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i29));
        arrayList.add(2);
        arrayList2.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i89));
        java.lang.String T6 = T6();
        boolean z18 = this.f178021q;
        if ((z18 || this.f178020p) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(T6)) {
            arrayList.add(4);
            arrayList2.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2e));
        }
        arrayList.add(5);
        arrayList2.add(getString(com.p314xaae8f345.mm.R.C30867xcad56011.b2d));
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.n0 n0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.n0) ((java.util.HashMap) this.f178019o).get(T6);
        if (n0Var == null || (c5886xd11a0be7 = n0Var.f178146a) == null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184 c5884x4c2d9184 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5884x4c2d9184();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            am.aq aqVar = c5884x4c2d9184.f136192g;
            aqVar.f87707a = currentTimeMillis;
            aqVar.f87708b = T6;
            c5884x4c2d9184.e();
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c5886xd11a0be7.f136194g.f87902b)) {
            arrayList.add(3);
            arrayList2.add("");
        }
        if (!isFinishing()) {
            if (this.f178018n == null) {
                this.f178018n = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) mo55332x76847179(), 1, false);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f178018n;
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.j0(this, arrayList, n0Var, arrayList2);
            k0Var.f293414s = this.f178025u;
            k0Var.p(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.k0(this));
            if (!mo55332x76847179().isFinishing()) {
                this.f178018n.v();
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(T6)) {
            return;
        }
        gm0.j1.i();
        if (gm0.j1.n().f354821b.n() == 0 || !z17 || z18) {
            return;
        }
        this.f178022r.d(T6);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.l1
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a W() {
        int selectedItemPosition = this.f178013f.getSelectedItemPosition();
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89 = this.f178013f;
        android.view.View childAt = c22506x89e75b89.getChildAt(selectedItemPosition - c22506x89e75b89.getFirstVisiblePosition());
        if (childAt != null) {
            return childAt instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) childAt : (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) childAt.findViewById(com.p314xaae8f345.mm.R.id.h9o);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Editor.EditorImageUI", "getCurView() pos:%s firstPos:%s", java.lang.Integer.valueOf(selectedItemPosition), java.lang.Integer.valueOf(this.f178013f.getFirstVisiblePosition()));
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.l1
    public java.lang.String Y5() {
        return this.f178014g.getItem(this.f178013f.getSelectedItemPosition()).f376844a;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: dealContentView */
    public void mo47898x2105eeb2(android.view.View view) {
        com.p314xaae8f345.mm.ui.bk.l0(com.p314xaae8f345.mm.ui.bk.b(getWindow(), null), m78510xe15784dd());
        ((android.view.ViewGroup) m78510xe15784dd().getParent()).removeView(m78510xe15784dd());
        ((android.view.ViewGroup) getWindow().getDecorView()).addView(m78510xe15784dd(), 0);
    }

    @Override // o72.e5
    /* renamed from: getAesKey */
    public java.lang.String mo54574x1061ea06() {
        r45.gp0 gp0Var;
        ix1.c cVar = (ix1.c) this.f178013f.getSelectedItem();
        if (cVar == null || (gp0Var = cVar.f376857m) == null) {
            return null;
        }
        return gp0Var.f456971u;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a5h;
    }

    @Override // g04.h
    public void k5(java.lang.Object obj, java.lang.Object obj2) {
        g04.l lVar = (g04.l) obj2;
        java.lang.String T6 = T6();
        int b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.k1.b(lVar.f349002a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Editor.EditorImageUI", "local translate, img %s, result %s, ratio %d", T6, lVar.f349002a, java.lang.Integer.valueOf(b17));
        if (((java.lang.String) obj).equals(T6) && com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.k1.f(b17)) {
            this.f178020p = true;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6631xd817ea85 c6631xd817ea85 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6631xd817ea85();
            c6631xd817ea85.f139850e = 2L;
            c6631xd817ea85.f139851f = 5L;
            int selectedItemPosition = this.f178013f.getSelectedItemPosition();
            if (-1 != selectedItemPosition) {
                ix1.c cVar = (ix1.c) this.f178014g.getItem(selectedItemPosition);
                c6631xd817ea85.q(cVar.f376857m.f456967s);
                c6631xd817ea85.p(cVar.f376857m.f456971u);
            }
            c6631xd817ea85.k();
            U6(false);
        }
    }

    @Override // o72.e5
    public void l5() {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (1001 != i17 || -1 != i18) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
        java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("custom_send_text") : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            return;
        }
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(P1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Editor.EditorImageUI", "want to send record msg, but toUser is null");
        } else {
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.b0(this, P1, stringExtra2, new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.z(this, db5.e1.Q(mo55332x76847179(), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.cax), true, false, null))));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m78531x8f8cf1fb();
        if (fp.h.c(19)) {
            getWindow().setFlags(201327616, 201327616);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        this.f178022r = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.nc(this, this, this);
        java.lang.String stringExtra = getIntent().getStringExtra("key_detail_data_id");
        nx1.d q17 = nx1.d.q();
        q17.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = q17.f422815a.iterator();
        while (it.hasNext()) {
            ix1.a aVar = (ix1.a) it.next();
            if (aVar.b() == 2) {
                arrayList.add(aVar);
            }
        }
        this.f178011d = arrayList;
        for (int i17 = 0; i17 < this.f178011d.size(); i17++) {
            if (((ix1.a) this.f178011d.get(i17)).f376844a.equals(stringExtra)) {
                this.f178015h = i17;
            }
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89 = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89) findViewById(com.p314xaae8f345.mm.R.id.ghs);
        this.f178013f = c22506x89e75b89;
        this.f178012e = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m1(c22506x89e75b89, this, this);
        this.f178013f.setVerticalFadingEdgeEnabled(false);
        this.f178013f.setHorizontalFadingEdgeEnabled(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.m0 m0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.m0(null);
        this.f178014g = m0Var;
        m0Var.f178128d = this.f178011d;
        this.f178013f.setAdapter((android.widget.SpinnerAdapter) m0Var);
        this.f178013f.setSelection(this.f178015h);
        this.f178013f.setOnItemSelectedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.d0(this));
        this.f178013f.mo55657x3be48126(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.e0(this));
        this.f178013f.mo55655xf8a6a4f2(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f0(this));
        m78505x1ef531b7(true);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.g0(this));
        this.f178027w.mo48813x58998cd();
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.h0 h0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.h0(this);
        ((jd0.q2) x2Var).getClass();
        this.f178023s = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636(this, h0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f.f178086d.b(this.f178024t);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f.f178086d;
        ((java.util.ArrayList) fVar.f178087a).remove(this.f178024t);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.nc ncVar = this.f178022r;
        if (ncVar != null) {
            ncVar.c();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m1 m1Var = this.f178012e;
        if (m1Var != null) {
            m1Var.f182787b = null;
            m1Var.f182786a = null;
            m1Var.f182790e = null;
        }
        this.f178027w.mo48814x2efc64();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        this.f178012e.a(false);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        qp1.h0.b();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        qp1.h0.a(true, true, true);
    }

    @Override // o72.e5
    public java.lang.String x2() {
        return T6();
    }

    @Override // o72.e5
    public java.lang.String y3() {
        r45.gp0 gp0Var;
        ix1.c cVar = (ix1.c) this.f178013f.getSelectedItem();
        if (cVar == null || (gp0Var = cVar.f376857m) == null) {
            return null;
        }
        return gp0Var.f456967s;
    }
}
