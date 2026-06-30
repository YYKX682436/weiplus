package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavTagEditUI */
/* loaded from: classes11.dex */
public class ActivityC13572xe5ee659d extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f181946s = 0;

    /* renamed from: d, reason: collision with root package name */
    public o72.r2 f181947d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f181948e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 f181949f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 f181950g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f181951h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ListView f181952i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f181953m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.f f181954n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1413xbb6ca34f.g f181955o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f181956p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f181957q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public boolean f181958r = false;

    public final void T6() {
        if (this.f181956p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavTagEditUI", "match max length, disable finish button");
            if (m78536x89ba3761(0)) {
                m78500x43e00957(0, false);
                return;
            }
            return;
        }
        o72.r2 r2Var = this.f181947d;
        if (r2Var == null) {
            if (this.f181950g.m79121x4cc68f0b() > 0 || this.f181950g.m79118xdb574fcd().length() > 0) {
                if (m78536x89ba3761(0)) {
                    return;
                }
                m78500x43e00957(0, true);
                return;
            } else {
                if (m78536x89ba3761(0)) {
                    m78500x43e00957(0, false);
                    return;
                }
                return;
            }
        }
        if (r2Var.f67653xef67d413.f466629e.size() != this.f181950g.m79121x4cc68f0b() || this.f181950g.m79118xdb574fcd().length() > 0) {
            if (m78536x89ba3761(0)) {
                return;
            }
            m78500x43e00957(0, true);
            return;
        }
        java.util.ArrayList<java.lang.String> m79122xe175c322 = this.f181950g.m79122xe175c322();
        for (int i17 = 0; i17 < m79122xe175c322.size(); i17++) {
            if (!m79122xe175c322.get(i17).equals(this.f181947d.f67653xef67d413.f466629e.get(i17))) {
                if (m78536x89ba3761(0)) {
                    return;
                }
                m78500x43e00957(0, true);
                return;
            }
        }
        if (m78536x89ba3761(0)) {
            m78500x43e00957(0, false);
        }
    }

    public final void U6() {
        db5.e1.A(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572736cc0), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571541ib), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.o6(this), null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.abx;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        long longExtra = getIntent().getLongExtra("key_fav_item_id", -1L);
        if (-1 != longExtra) {
            this.f181947d = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(longExtra);
        }
        this.f181948e = getIntent().getStringArrayListExtra("key_fav_result_list");
        java.util.ArrayList<java.lang.Integer> integerArrayListExtra = getIntent().getIntegerArrayListExtra("key_fav_item_ids");
        if (integerArrayListExtra != null) {
            java.util.ArrayList arrayList = this.f181957q;
            arrayList.clear();
            for (int i17 = 0; i17 < integerArrayListExtra.size(); i17++) {
                arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(integerArrayListExtra.get(i17).intValue()));
            }
        }
        this.f181950g = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5) findViewById(com.p314xaae8f345.mm.R.id.dwl);
        this.f181951h = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f568751nx4);
        this.f181952i = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.mfk);
        this.f181953m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jdc);
        this.f181950g.k(true);
        this.f181950g.m79136x213c66d4(com.p314xaae8f345.mm.R.C30861xcebc809e.b4q);
        this.f181950g.m79134xa13ce0e(true);
        this.f181950g.m79124x6c4032e7(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p6(this));
        this.f181950g.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.q6(this), 100L);
        o72.r2 r2Var = this.f181947d;
        if (r2Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 c13623x735f56a5 = this.f181950g;
            java.util.LinkedList linkedList = r2Var.f67653xef67d413.f466629e;
            c13623x735f56a5.r(linkedList, linkedList);
        } else {
            java.util.List list = this.f181948e;
            if (list != null) {
                this.f181950g.r(list, list);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.r6 r6Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.r6(this, mo55332x76847179());
        this.f181954n = r6Var;
        r6Var.f182035i = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.s6(this);
        o72.r2 r2Var2 = this.f181947d;
        java.util.LinkedList linkedList2 = r2Var2 == null ? null : r2Var2.f67653xef67d413.f466629e;
        java.util.Set set = r6Var.f182033g;
        ((java.util.HashSet) set).clear();
        if (linkedList2 != null) {
            set.addAll(linkedList2);
        }
        o72.r2 r2Var3 = this.f181947d;
        if (r2Var3 != null && !r2Var3.f67653xef67d413.f466628d.isEmpty()) {
            android.view.View inflate = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570296ac0, null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.dve);
            textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572737cc1));
            textView.setVisibility(0);
            int dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561315f3);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 c13623x735f56a52 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5) inflate.findViewById(com.p314xaae8f345.mm.R.id.dwm);
            this.f181949f = c13623x735f56a52;
            c13623x735f56a52.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13623x735f56a5 c13623x735f56a53 = this.f181949f;
            r45.rq0 rq0Var = this.f181947d.f67653xef67d413;
            c13623x735f56a53.r(rq0Var.f466629e, rq0Var.f466628d);
            this.f181949f.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bfk);
            this.f181949f.setPadding(0, 0, 0, dimensionPixelSize);
            this.f181949f.m79124x6c4032e7(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.t6(this));
            this.f181951h.addHeaderView(inflate);
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).tj().c() > 0) {
            this.f181951h.addHeaderView(android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.abz, null));
        }
        this.f181951h.setAdapter((android.widget.ListAdapter) this.f181954n);
        this.f181951h.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u6(this));
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.g6 g6Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.g6(this, mo55332x76847179());
        this.f181955o = g6Var;
        this.f181952i.setAdapter((android.widget.ListAdapter) g6Var);
        this.f181952i.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h6(this));
        boolean booleanExtra = getIntent().getBooleanExtra("key_fav_is_add_tag", false);
        this.f181958r = booleanExtra;
        if (booleanExtra) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.c_a);
        } else {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572728ca4);
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m6(this));
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.n6(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        T6();
        if (this.f181947d != null) {
            ((a82.y1) ((o72.s4) i95.n0.c(o72.s4.class))).Di(java.lang.Long.valueOf(this.f181947d.f67645x88be67a1));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        U6();
        return true;
    }
}
