package com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui;

/* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI */
/* loaded from: classes9.dex */
public class ViewOnClickListenerC19553xcfaf7ef extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f270057d;

    /* renamed from: f, reason: collision with root package name */
    public d05.l f270059f;

    /* renamed from: g, reason: collision with root package name */
    public d05.l f270060g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f270062i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f270063m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f270064n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f270065o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f270066p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f270067q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f270068r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f270069s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.EditText f270070t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.EditText f270071u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.EditText f270072v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.EditText f270073w;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f270058e = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public int f270061h = -1;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.BaseAdapter f270074x = new e05.o(this);

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.BaseAdapter f270075y = new e05.e(this);

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2463xc4fd4d1a.ui.ViewOnClickListenerC19553xcfaf7ef viewOnClickListenerC19553xcfaf7ef) {
        java.util.ArrayList arrayList = (java.util.ArrayList) viewOnClickListenerC19553xcfaf7ef.f270058e;
        arrayList.clear();
        if (viewOnClickListenerC19553xcfaf7ef.f270062i) {
            java.util.Iterator it = ((java.util.ArrayList) viewOnClickListenerC19553xcfaf7ef.f270057d).iterator();
            while (it.hasNext()) {
                d05.l lVar = (d05.l) it.next();
                if (lVar.f307142a != 2) {
                    arrayList.add(lVar);
                }
            }
            return;
        }
        java.util.Iterator it6 = ((java.util.ArrayList) viewOnClickListenerC19553xcfaf7ef.f270057d).iterator();
        while (it6.hasNext()) {
            d05.l lVar2 = (d05.l) it6.next();
            if (lVar2.f307142a != 1) {
                arrayList.add(lVar2);
            }
        }
    }

    public final void V6() {
        d05.l lVar = this.f270059f;
        if (lVar != null) {
            this.f270064n.setText(lVar.f307146e);
            if (this.f270059f.f307149h != null) {
                this.f270068r.setVisibility(0);
                this.f270070t.setVisibility(8);
                this.f270066p.setText(this.f270059f.f307149h.f307146e);
                this.f270071u.setHint(this.f270059f.f307149h.f307147f);
                if ("Y".equals(this.f270059f.f307144c)) {
                    this.f270066p.setVisibility(0);
                    this.f270071u.setVisibility(0);
                    this.f270068r.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572141zu);
                } else {
                    this.f270066p.setVisibility(8);
                    this.f270071u.setVisibility(8);
                    if ("N".equals(this.f270059f.f307144c)) {
                        this.f270068r.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572036wx);
                    }
                }
            } else {
                this.f270068r.setVisibility(8);
                this.f270070t.setVisibility(0);
                this.f270070t.setHint(this.f270059f.f307147f);
                this.f270066p.setVisibility(8);
                this.f270071u.setVisibility(8);
            }
        }
        d05.l lVar2 = this.f270060g;
        if (lVar2 != null) {
            this.f270065o.setText(lVar2.f307146e);
            if (this.f270060g.f307149h == null) {
                this.f270069s.setVisibility(8);
                this.f270072v.setVisibility(0);
                this.f270072v.setHint(this.f270060g.f307147f);
                this.f270067q.setVisibility(8);
                this.f270073w.setVisibility(8);
                return;
            }
            this.f270069s.setVisibility(0);
            this.f270072v.setVisibility(8);
            this.f270067q.setText(this.f270060g.f307149h.f307146e);
            this.f270073w.setHint(this.f270060g.f307149h.f307147f);
            if ("Y".equals(this.f270060g.f307144c)) {
                this.f270067q.setVisibility(0);
                this.f270073w.setVisibility(0);
                this.f270069s.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572141zu);
            } else {
                this.f270067q.setVisibility(8);
                this.f270073w.setVisibility(8);
                if ("N".equals(this.f270060g.f307144c)) {
                    this.f270069s.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572036wx);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d8p;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f575171l31);
        this.f270064n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pfo);
        this.f270066p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pfp);
        this.f270065o = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pfq);
        this.f270067q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pfr);
        this.f270070t = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.pfe);
        this.f270071u = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.pff);
        this.f270072v = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.pfg);
        this.f270073w = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.pfh);
        this.f270068r = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pfi);
        this.f270069s = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.pfj);
        this.f270068r.setOnClickListener(this);
        this.f270069s.setOnClickListener(this);
        this.f270064n.setOnClickListener(new e05.g(this));
        this.f270065o.setOnClickListener(new e05.h(this));
        mo54448x9c8c0d33(new e05.i(this));
        findViewById(com.p314xaae8f345.mm.R.id.kao).setOnClickListener(new e05.j(this));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.p314xaae8f345.mm.R.id.pfi) {
            this.f270063m = true;
            showDialog(2);
        } else if (view.getId() == com.p314xaae8f345.mm.R.id.pfj) {
            this.f270063m = false;
            showDialog(2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditChangeAmountUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        V6();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, android.app.Activity
    public android.app.Dialog onCreateDialog(int i17) {
        if (i17 == 1) {
            android.view.View inflate = getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d6z, (android.view.ViewGroup) null);
            com.p314xaae8f345.mm.ui.C21391x3d89d23a c21391x3d89d23a = (com.p314xaae8f345.mm.ui.C21391x3d89d23a) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564268mf);
            c21391x3d89d23a.setAdapter((android.widget.ListAdapter) this.f270074x);
            c21391x3d89d23a.setOnItemClickListener(new e05.k(this));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
            aVar.f293242a = of5.b.a(this).getString(com.p314xaae8f345.mm.R.C30867xcad56011.l2z);
            aVar.L = inflate;
            aVar.G = null;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(this, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
            j0Var.e(aVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
            if (d0Var == null) {
                return j0Var;
            }
            d0Var.a(j0Var.f293370r);
            return j0Var;
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return db5.e1.F(this, "", "", true);
            }
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.l2y);
            int i18 = this.f270061h;
            if (i18 > 0) {
                string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.l2w, java.lang.Integer.valueOf(i18));
            }
            return db5.e1.u(this, string, null, new e05.m(this), new e05.n(this));
        }
        android.view.View inflate2 = getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d6z, (android.view.ViewGroup) null);
        com.p314xaae8f345.mm.ui.C21391x3d89d23a c21391x3d89d23a2 = (com.p314xaae8f345.mm.ui.C21391x3d89d23a) inflate2.findViewById(com.p314xaae8f345.mm.R.id.f564268mf);
        c21391x3d89d23a2.setAdapter((android.widget.ListAdapter) this.f270075y);
        c21391x3d89d23a2.setOnItemClickListener(new e05.l(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar2.f293242a = of5.b.a(this).getString(com.p314xaae8f345.mm.R.C30867xcad56011.l2v);
        aVar2.L = inflate2;
        aVar2.G = null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(this, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var2.e(aVar2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var2 = aVar2.f293256m;
        if (d0Var2 == null) {
            return j0Var2;
        }
        d0Var2.a(j0Var2.f293370r);
        return j0Var2;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            if (m1Var instanceof d05.e) {
                d05.e eVar = (d05.e) m1Var;
                java.util.List list = eVar.f307121d;
                this.f270057d = list;
                this.f270061h = eVar.f307123f;
                if (list != null && list.size() >= 2) {
                    this.f270059f = (d05.l) this.f270057d.get(0);
                    d05.l lVar = (d05.l) this.f270057d.get(1);
                    this.f270060g = lVar;
                    this.f270059f.f307142a = 1;
                    lVar.f307142a = 2;
                }
                V6();
                return true;
            }
        } else if (m1Var instanceof d05.c) {
            db5.e1.G(this, str, null, false, new e05.f(this));
            return true;
        }
        return false;
    }
}
