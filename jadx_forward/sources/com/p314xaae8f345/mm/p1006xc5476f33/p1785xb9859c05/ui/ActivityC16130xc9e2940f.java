package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallContactUI */
/* loaded from: classes8.dex */
public class ActivityC16130xc9e2940f extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f224084f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.w f224085g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f224086h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f224087i;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10 f224089n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f224090o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f224091p;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.c9 f224082d = new com.p314xaae8f345.mm.ui.p2740x696c9db.c9(true, true);

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f224083e = null;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16126xf9dfd05 f224088m = null;

    /* renamed from: q, reason: collision with root package name */
    public int f224092q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f224093r = -1;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.f f224094s = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.a1(this);

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Runnable f224095t = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.b1(this);

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Runnable f224096u = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.d1(this);

    /* renamed from: v, reason: collision with root package name */
    public boolean f224097v = true;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f224098w = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.u0(this, android.os.Looper.getMainLooper());

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.blm;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onBusinessPermissionDenied */
    public void mo53824x34301f29(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.g3c);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.x0(this));
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(this, "android.permission.READ_CONTACTS", 48, null, null);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallContactUI", "summerper checkPermission checkContacts[%b],stack[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        if (a17) {
            this.f224086h = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.hur);
            this.f224087i = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f564288n4);
            this.f224084f = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f564265mc);
            this.f224089n = (com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10) findViewById(com.p314xaae8f345.mm.R.id.f564281mx);
            this.f224090o = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f564287n3);
            com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = this.f224082d;
            c9Var.f291857i = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.y0(this);
            c9Var.f291859k = com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8;
            m78489xd6d59aa8(true, c9Var);
            this.f224085g = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.w(mo55332x76847179());
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.w.f224578x = s83.b.f486400b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16126xf9dfd05 c16126xf9dfd05 = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16126xf9dfd05(mo55332x76847179(), this.f224085g.t());
            this.f224088m = c16126xf9dfd05;
            this.f224084f.addFooterView(c16126xf9dfd05, null, false);
            this.f224084f.setAdapter((android.widget.ListAdapter) this.f224085g);
            this.f224084f.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.z0(this));
            this.f224089n.setVisibility(0);
            this.f224084f.setOnScrollListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.e1(this));
            this.f224089n.m79298x40d747ee(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f1(this));
            if (this.f224085g.t() <= 0) {
                this.f224086h.setVisibility(8);
                this.f224083e = db5.e1.Q(mo55332x76847179(), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g3r), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.c1(this));
                s75.d.b(this.f224095t, "IPCall_LoadSystemAddressBook");
            } else {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.c.f223969e == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.c.f223969e = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.c();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.c.f223969e.a();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.g.f223998d == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.g.f223998d = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.g();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.g.f223998d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.f fVar = this.f224094s;
        java.util.ArrayList arrayList = gVar.f224000b;
        if (arrayList.contains(fVar)) {
            arrayList.remove(fVar);
        }
        this.f224098w.mo50303x856b99f0(1);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallContactUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallContactUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 48 && iArr[0] != 0) {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhf), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.v0(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.w0(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        mo2548x55429c53();
    }
}
