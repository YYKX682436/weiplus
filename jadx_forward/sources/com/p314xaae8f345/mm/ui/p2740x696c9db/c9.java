package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes12.dex */
public class c9 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f291850b;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.b9 f291857i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f291858j;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.a9 f291863o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.ga f291864p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.z8 f291865q;

    /* renamed from: c, reason: collision with root package name */
    public boolean f291851c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f291852d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f291853e = true;

    /* renamed from: f, reason: collision with root package name */
    public android.view.MenuItem f291854f = null;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f291855g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.o3 f291856h = null;

    /* renamed from: k, reason: collision with root package name */
    public int f291859k = com.p314xaae8f345.mm.R.C30867xcad56011.f571919tj;

    /* renamed from: l, reason: collision with root package name */
    public boolean f291860l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f291861m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f291862n = false;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f291849a = "MicroMsg.SearchViewHelper-" + java.lang.String.valueOf(java.lang.System.currentTimeMillis());

    public c9() {
        this.f291850b = false;
        this.f291858j = true;
        this.f291858j = true;
        this.f291850b = false;
    }

    public void a() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.o3 o3Var = this.f291856h;
        if (o3Var != null) {
            o3Var.b();
        }
    }

    public void b() {
        android.view.MenuItem menuItem;
        if (!this.f291851c || (menuItem = this.f291854f) == null) {
            return;
        }
        if (!this.f291850b) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.z8 z8Var = this.f291865q;
            if (z8Var != null) {
                z8Var.mo81132x16c42d88();
                return;
            }
            return;
        }
        try {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) menuItem.getActionView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(viewGroup.findViewById(com.p314xaae8f345.mm.R.id.cob));
            }
        } catch (java.lang.Exception unused) {
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.z8 z8Var2 = this.f291865q;
        if (z8Var2 != null) {
            z8Var2.mo81132x16c42d88();
        }
    }

    public void c(boolean z17) {
        if (this.f291851c) {
            return;
        }
        this.f291853e = z17;
        if (this.f291854f != null) {
            this.f291855g.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2740x696c9db.x8(this));
        } else {
            this.f291852d = true;
        }
    }

    public void d(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, boolean z17, android.view.Menu menu) {
        android.view.MenuItem menuItem;
        android.view.ViewGroup viewGroup;
        boolean z18 = this.f291851c;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f291855g;
        if (z18) {
            this.f291851c = false;
            try {
                if (u75.b.c() && com.p314xaae8f345.mm.ui.bk.v0() && (menuItem = this.f291854f) != null && (viewGroup = (android.view.ViewGroup) menuItem.getActionView().getParent()) != null) {
                    viewGroup.removeView(viewGroup.findViewById(com.p314xaae8f345.mm.R.id.cob));
                }
            } catch (java.lang.Exception unused) {
            }
            n(menu);
            com.p314xaae8f345.mm.ui.p2740x696c9db.a9 a9Var = this.f291863o;
            if (a9Var != null) {
                i93.C28508x2f5e1a c28508x2f5e1a = (i93.C28508x2f5e1a) a9Var;
                c28508x2f5e1a.getClass();
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1792xdec7722c.ActivityC16176xdf6c8530.f224918u;
                c28508x2f5e1a.f371282a.finish();
            }
            com.p314xaae8f345.mm.ui.p2740x696c9db.o3 o3Var = this.f291856h;
            if (o3Var != null) {
                o3Var.g(false);
            }
            n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2740x696c9db.m8(this, activityC1102x9ee2d9f, z17));
            if (this.f291857i != null) {
                n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2740x696c9db.n8(this));
            }
        }
        n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2740x696c9db.o8(this, activityC1102x9ee2d9f));
    }

    public void e(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, boolean z17, android.view.Menu menu) {
        if (this.f291851c) {
            return;
        }
        this.f291851c = true;
        o();
        k(activityC1102x9ee2d9f, menu);
        this.f291855g.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2740x696c9db.y8(this, activityC1102x9ee2d9f, z17));
        com.p314xaae8f345.mm.ui.p2740x696c9db.b9 b9Var = this.f291857i;
        if (b9Var != null) {
            b9Var.V5();
        }
    }

    public android.view.Menu f(android.view.Menu menu, android.app.Activity activity) {
        boolean z17 = menu instanceof db5.g4;
        db5.g4 g4Var = null;
        java.lang.String str = this.f291849a;
        if (!z17) {
            if (this.f291864p != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "getCurrentMenu, mActivityController.");
                com.p314xaae8f345.mm.ui.p2740x696c9db.e eVar = this.f291864p.E;
                if (eVar != null && eVar.f291897c) {
                    g4Var = eVar.f291898d;
                }
            } else if (activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                g4Var = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity).m78521xfb827dd5();
            }
        }
        if (g4Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "getCurrentMenu, localmenu size = %s.", java.lang.Integer.valueOf(g4Var.size()));
            return g4Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "getCurrentMenu, localmenu is null.");
        return menu;
    }

    public java.lang.String g() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.o3 o3Var = this.f291856h;
        return o3Var != null ? o3Var.mo81045x448ef5fb() : "";
    }

    public boolean h() {
        return false;
    }

    public boolean i() {
        return this.f291853e;
    }

    public void j(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, android.view.Menu menu) {
        if (activityC1102x9ee2d9f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f291849a, "on add search menu, activity is null");
            return;
        }
        if (this.f291856h == null) {
            if (this.f291858j) {
                com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a c22496x54525e2a = new com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a(activityC1102x9ee2d9f);
                this.f291856h = c22496x54525e2a;
                if (this.f291860l) {
                    c22496x54525e2a.findViewById(com.p314xaae8f345.mm.R.id.f564074h7).setBackgroundColor(c22496x54525e2a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u));
                    c22496x54525e2a.findViewById(com.p314xaae8f345.mm.R.id.mes).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562549is);
                    ((android.widget.TextView) c22496x54525e2a.f291494d).setTextColor(android.graphics.Color.parseColor("#7D90A9"));
                    ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) c22496x54525e2a.findViewById(com.p314xaae8f345.mm.R.id.meb)).m82040x7541828(android.graphics.Color.parseColor("#6B6B6B"));
                    c22496x54525e2a.f291495e.setTextColor(android.graphics.Color.parseColor("#CCFFFFFF"));
                    c22496x54525e2a.f291495e.setHintTextColor(android.graphics.Color.parseColor("#4DFFFFFF"));
                }
            } else {
                com.p314xaae8f345.mm.ui.p2740x696c9db.C22520x90c681bf c22520x90c681bf = new com.p314xaae8f345.mm.ui.p2740x696c9db.C22520x90c681bf(activityC1102x9ee2d9f);
                this.f291856h = c22520x90c681bf;
                c22520x90c681bf.mo81058x56599d4(null);
            }
            this.f291856h.mo81049x73ff22de(false);
            this.f291856h.mo81057x95c13e2c(null);
        }
        this.f291856h.mo81051x6c4032e7(new com.p314xaae8f345.mm.ui.p2740x696c9db.p8(this));
        this.f291856h.f(h() && !(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20684x722a90ef()) == 1 && j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20672x8f1bd40b()) <= 0 && !com.p314xaae8f345.mm.ui.bk.U()));
        this.f291856h.mo81059x37562b58(new com.p314xaae8f345.mm.ui.p2740x696c9db.q8(this));
        android.view.MenuItem add = menu.add(0, com.p314xaae8f345.mm.R.id.jha, 0, this.f291859k);
        this.f291854f = add;
        add.setEnabled(true);
        if (!this.f291862n) {
            if (this.f291860l) {
                this.f291854f.setIcon(com.p314xaae8f345.mm.ui.uk.e(activityC1102x9ee2d9f, com.p314xaae8f345.mm.R.raw.f78356x618865ad, activityC1102x9ee2d9f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230)));
            } else {
                this.f291854f.setIcon(com.p314xaae8f345.mm.ui.uk.e(activityC1102x9ee2d9f, com.p314xaae8f345.mm.R.raw.f78356x618865ad, activityC1102x9ee2d9f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832)));
            }
        }
        if (!this.f291856h.e()) {
            this.f291854f.setActionView((android.view.View) this.f291856h);
        } else if (((android.view.View) this.f291856h).getParent() == null) {
            ((android.view.ViewGroup) activityC1102x9ee2d9f.findViewById(com.p314xaae8f345.mm.R.id.u8p)).addView((android.view.View) this.f291856h);
        }
        boolean z17 = this.f291850b;
        if (z17) {
            this.f291854f.setShowAsAction(9);
        } else {
            this.f291854f.setShowAsAction(2);
        }
        if (z17) {
            this.f291865q = new com.p314xaae8f345.mm.ui.p2740x696c9db.r8(this, activityC1102x9ee2d9f, menu);
        } else {
            this.f291865q = new com.p314xaae8f345.mm.ui.p2740x696c9db.s8(this, activityC1102x9ee2d9f, menu);
        }
        this.f291856h.mo81050xd7457004(new com.p314xaae8f345.mm.ui.p2740x696c9db.t8(this));
    }

    public final void k(android.app.Activity activity, android.view.Menu menu) {
        if (this.f291851c || this.f291852d) {
            this.f291852d = false;
            if ((activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) && !this.f291861m) {
                if (this.f291860l) {
                    ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity).mo64405x4dab7448(activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560045u));
                } else {
                    ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity).mo64405x4dab7448(activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a));
                }
            }
            if (menu != null) {
                for (int i17 = 0; i17 < menu.size(); i17++) {
                    android.view.MenuItem item = menu.getItem(i17);
                    if (item.getItemId() != com.p314xaae8f345.mm.R.id.jha) {
                        item.setVisible(false);
                    }
                }
            }
            this.f291855g.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.ui.p2740x696c9db.w8(this, activity), 128L);
        }
    }

    public boolean l(int i17, android.view.KeyEvent keyEvent) {
        if (4 != i17 || !this.f291851c) {
            return false;
        }
        b();
        return true;
    }

    public void m(android.app.Activity activity, android.view.Menu menu) {
        java.lang.String str = this.f291849a;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "on hanle status fail, activity is null");
            return;
        }
        android.view.Menu f17 = f(menu, activity);
        android.view.MenuItem menuItem = this.f291854f;
        if (menuItem == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "can not find search menu, error");
        } else {
            menuItem.setOnMenuItemClickListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.u8(this));
            k(activity, f17);
        }
    }

    public void n(android.view.Menu menu) {
        if (menu != null) {
            for (int i17 = 0; i17 < menu.size(); i17++) {
                android.view.MenuItem item = menu.getItem(i17);
                if (item.getItemId() != com.p314xaae8f345.mm.R.id.jha) {
                    item.setVisible(true);
                }
            }
        }
    }

    public void o() {
    }

    public void p() {
    }

    public void q(java.lang.CharSequence charSequence) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.o3 o3Var = this.f291856h;
        if (o3Var == null) {
            return;
        }
        o3Var.mo81055x764b0e09(charSequence);
    }

    public void r(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.o3 o3Var = this.f291856h;
        if (o3Var == null) {
            return;
        }
        o3Var.mo81060xd7655c6f(str);
    }

    public c9(boolean z17, boolean z18) {
        this.f291850b = false;
        this.f291858j = true;
        this.f291858j = z17;
        this.f291850b = z18;
    }
}
