package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* renamed from: com.tencent.mm.plugin.game.ui.GameSearchUI */
/* loaded from: classes15.dex */
public class ActivityC15989x4803986e extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.mm.ui.p2740x696c9db.b9 {

    /* renamed from: x, reason: collision with root package name */
    public static final java.util.regex.Pattern f222499x = java.util.regex.Pattern.compile("\\s+");

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.c9 f222500d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f222501e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f222502f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ProgressBar f222503g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f222504h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ListView f222505i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f222506m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.z5 f222507n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.d6 f222508o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f222509p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f222510q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f222511r;

    /* renamed from: u, reason: collision with root package name */
    public int f222514u;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f222512s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public boolean f222513t = false;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemClickListener f222515v = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.i6(this);

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemClickListener f222516w = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.j6(this);

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void H0() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void P4(java.lang.String str) {
        if (this.f222513t) {
            this.f222513t = false;
            return;
        }
        java.lang.String str2 = this.f222511r;
        if (str2 != null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2.equals(str == null ? "" : str)) {
                return;
            }
        }
        this.f222511r = str;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (java.lang.String str3 : f222499x.split(str.replace('*', ' '))) {
                linkedList.add(str3);
            }
            T6(linkedList, 0, true);
            U6(6);
            return;
        }
        while (true) {
            java.util.LinkedList linkedList2 = this.f222512s;
            if (linkedList2.isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c3 c3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c3(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), str, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.e(this));
                gm0.j1.d().g(c3Var);
                linkedList2.add(c3Var);
                return;
            }
            gm0.j1.i();
            gm0.j1.n().f354821b.d((com.p314xaae8f345.mm.p944x882e457a.m1) linkedList2.pop());
        }
    }

    public final void T6(java.util.LinkedList linkedList, int i17, boolean z17) {
        java.util.LinkedList linkedList2;
        while (true) {
            linkedList2 = this.f222512s;
            if (linkedList2.isEmpty()) {
                break;
            }
            gm0.j1.i();
            gm0.j1.n().f354821b.d((com.p314xaae8f345.mm.p944x882e457a.m1) linkedList2.pop());
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.z5 z5Var = this.f222507n;
            z5Var.f223440p = 0;
            z5Var.f223441q = false;
        }
        this.f222510q = linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b3 b3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b3(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.e(this), this.f222507n.f223440p);
        gm0.j1.d().g(b3Var);
        linkedList2.add(b3Var);
        java.util.Iterator it = linkedList.iterator();
        this.f222509p = "";
        while (it.hasNext()) {
            this.f222509p += " " + ((java.lang.String) it.next());
        }
        java.lang.String trim = this.f222509p.trim();
        this.f222509p = trim;
        if (i17 == 1 || i17 == 2) {
            this.f222513t = true;
            this.f222500d.r(trim);
        }
    }

    public final void U6(int i17) {
        switch (i17) {
            case 0:
                this.f222501e.setVisibility(8);
                this.f222502f.setVisibility(8);
                this.f222504h.setVisibility(8);
                this.f222505i.setVisibility(8);
                this.f222503g.setVisibility(8);
                return;
            case 1:
                mo48674x36654fab();
                android.widget.ListView listView = this.f222504h;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(listView, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameSearchUI", "updateUI", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                listView.smoothScrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(listView, "com/tencent/mm/plugin/game/ui/GameSearchUI", "updateUI", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                this.f222500d.a();
                this.f222501e.setVisibility(8);
                this.f222502f.setVisibility(8);
                this.f222504h.setVisibility(8);
                this.f222505i.setVisibility(8);
                this.f222503g.setVisibility(0);
                return;
            case 2:
                this.f222501e.setVisibility(8);
                if (this.f222507n.getCount() > 0) {
                    this.f222502f.setVisibility(8);
                    this.f222504h.setVisibility(0);
                } else {
                    this.f222502f.setVisibility(0);
                    this.f222504h.setVisibility(8);
                }
                this.f222505i.setVisibility(8);
                this.f222503g.setVisibility(8);
                return;
            case 3:
                this.f222501e.setVisibility(0);
                this.f222502f.setVisibility(8);
                this.f222504h.setVisibility(8);
                this.f222505i.setVisibility(8);
                this.f222503g.setVisibility(8);
                return;
            case 4:
                this.f222501e.setVisibility(8);
                this.f222502f.setVisibility(0);
                this.f222504h.setVisibility(8);
                this.f222505i.setVisibility(8);
                this.f222503g.setVisibility(8);
                return;
            case 5:
                this.f222501e.setVisibility(8);
                this.f222502f.setVisibility(8);
                this.f222504h.setVisibility(8);
                this.f222505i.setVisibility(0);
                this.f222503g.setVisibility(8);
                return;
            case 6:
                android.widget.ListView listView2 = this.f222504h;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(listView2, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/GameSearchUI", "updateUI", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                listView2.smoothScrollToPosition(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(listView2, "com/tencent/mm/plugin/game/ui/GameSearchUI", "updateUI", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
                this.f222501e.setVisibility(8);
                this.f222502f.setVisibility(8);
                this.f222504h.setVisibility(8);
                this.f222505i.setVisibility(8);
                this.f222503g.setVisibility(0);
                return;
            default:
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void V5() {
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void Z2() {
        mo48674x36654fab();
        onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bhm;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.e6(this));
        com.p314xaae8f345.mm.ui.p2740x696c9db.c9 c9Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.c9();
        this.f222500d = c9Var;
        c9Var.c(true);
        this.f222500d.f291857i = this;
        this.f222501e = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.p7i);
        this.f222503g = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.mf_);
        this.f222502f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kch);
        this.f222504h = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.mfc);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.z5 z5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.z5(this, null);
        this.f222507n = z5Var;
        this.f222504h.setAdapter((android.widget.ListAdapter) z5Var);
        this.f222504h.setOnItemClickListener(this.f222515v);
        this.f222504h.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.f6(this));
        this.f222504h.setOnScrollListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.g6(this));
        android.view.View inflate = getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bgs, (android.view.ViewGroup) this.f222504h, false);
        this.f222506m = inflate;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameSearchUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/game/ui/GameSearchUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f222504h.addFooterView(this.f222506m);
        this.f222505i = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.mfa);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.d6 d6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.d6(this);
        this.f222508o = d6Var;
        this.f222505i.setAdapter((android.widget.ListAdapter) d6Var);
        this.f222505i.setOnItemClickListener(this.f222516w);
        this.f222505i.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.h6(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public boolean n5(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return true;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str2 : f222499x.split(str.replace('*', ' '))) {
            linkedList.add(str2);
        }
        T6(linkedList, 0, true);
        U6(1);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        super.onCreate(bundle);
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameSearchUI", "account not ready");
            finish();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.a(this);
        gm0.j1.d().a(zd1.e.f77575x366c91de, this);
        gm0.j1.d().a(1329, this);
        this.f222514u = getIntent().getIntExtra("game_report_from_scene", 0);
        mo43517x10010bd5();
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(this, 14, 1401, 0, 2, this.f222514u, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSearchUI", "[onCreate] time:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        this.f222500d.j(this, menu);
        this.f222500d.q("");
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSearchUI", "onDestroy");
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.i.f(this);
        gm0.j1.d().q(zd1.e.f77575x366c91de, this);
        gm0.j1.d().q(1329, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        onBackPressed();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        this.f222500d.m(this, menu);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.LinkedList linkedList;
        int i19;
        char c17;
        if (m1Var.m48006xc9602be3()) {
            return;
        }
        java.util.LinkedList linkedList2 = this.f222512s;
        if (linkedList2.contains(m1Var)) {
            linkedList2.remove(m1Var);
        }
        android.view.View view = this.f222506m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i27 = 0;
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/ui/GameSearchUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        int i28 = 3;
        if (mo808xfb85f7b0 != 1328) {
            if (mo808xfb85f7b0 == 1329 && i17 == 0 && i18 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c3 c3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.c3) m1Var;
                r45.e63 e63Var = (r45.e63) c3Var.f221785e.f152244b.f152233a;
                java.lang.String str2 = e63Var.f454573d;
                java.util.LinkedList linkedList3 = e63Var.f454578i;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.d6 d6Var = this.f222508o;
                d6Var.getClass();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList3)) {
                    java.lang.String str3 = c3Var.f221786f;
                    d6Var.f222899e = str3;
                    java.util.LinkedList linkedList4 = d6Var.f222900f;
                    linkedList4.clear();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b6 b6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b6();
                        b6Var.f222592a = 1;
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                            b6Var.f222593b = d6Var.f222898d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fp_);
                        } else {
                            b6Var.f222593b = str2;
                        }
                        linkedList4.add(b6Var);
                    }
                    java.util.Iterator it = linkedList3.iterator();
                    while (it.hasNext()) {
                        r45.f63 f63Var = (r45.f63) it.next();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b6 b6Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.b6();
                        b6Var2.f222592a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) ? 2 : 3;
                        b6Var2.f222594c = f63Var.f455565d;
                        b6Var2.f222593b = f63Var.f455566e;
                        b6Var2.f222595d = f63Var.f455567f;
                        b6Var2.f222596e = f63Var.f455568g;
                        b6Var2.f222597f = f63Var.f455569h;
                        linkedList4.add(b6Var2);
                    }
                    d6Var.notifyDataSetChanged();
                }
                U6(5);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b3) m1Var).f221767e;
        java.util.LinkedList linkedList5 = ((r45.g63) oVar.f152243a.f152217a).f456445d;
        if (i17 == 0 && i18 == 0) {
            r45.h63 h63Var = (r45.h63) oVar.f152244b.f152233a;
            java.util.LinkedList linkedList6 = h63Var != null ? h63Var.f457402d : null;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList6)) {
                java.lang.String str4 = this.f222509p;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.z5 z5Var = this.f222507n;
                if (z5Var.f223440p != 0) {
                    java.util.Iterator it6 = linkedList6.iterator();
                    while (it6.hasNext()) {
                        r45.i63 i63Var = (r45.i63) it6.next();
                        if (i63Var.f458286e == 3) {
                            java.util.LinkedList linkedList7 = i63Var.f458288g;
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList7)) {
                                z5Var.f223440p = i63Var.f458292n;
                                z5Var.f223441q = i63Var.f458293o;
                                java.util.Iterator it7 = linkedList7.iterator();
                                while (it7.hasNext()) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w5 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w5.a((r45.k63) it7.next());
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.x5 x5Var = a17.f223367m;
                                    x5Var.f223392b = a17.f223355a;
                                    x5Var.f223394d = a17.f223363i;
                                    x5Var.f223395e = a17.f223364j;
                                    x5Var.f223397g = "2";
                                    int i29 = z5Var.f223436i;
                                    z5Var.f223436i = i29 + 1;
                                    x5Var.f223398h = i29 + 301;
                                    x5Var.f223396f = z5Var.f223431d ? 1403 : 1405;
                                    z5Var.f223438n.add(a17);
                                }
                            }
                        }
                        z5Var.f223441q = false;
                    }
                } else {
                    if (z5Var.f223438n == null) {
                        z5Var.f223438n = new java.util.ArrayList();
                    }
                    z5Var.f223433f = 0;
                    z5Var.f223434g = 0;
                    z5Var.f223435h = 0;
                    z5Var.f223436i = 0;
                    z5Var.f223431d = false;
                    z5Var.f223432e = false;
                    z5Var.f223441q = false;
                    z5Var.f223440p = 0;
                    z5Var.f223438n.clear();
                    z5Var.f223442r = false;
                    java.util.Iterator it8 = linkedList6.iterator();
                    while (it8.hasNext()) {
                        r45.i63 i63Var2 = (r45.i63) it8.next();
                        java.util.LinkedList linkedList8 = i63Var2.f458287f;
                        int i37 = (linkedList8 == null || linkedList8.size() == 0) ? 1 : i27;
                        java.util.LinkedList linkedList9 = i63Var2.f458288g;
                        int i38 = (linkedList9 == null || linkedList9.size() == 0) ? 1 : i27;
                        java.util.LinkedList linkedList10 = i63Var2.f458291m;
                        if (((i37 == 0 || i38 == 0 || ((linkedList10 == null || linkedList10.size() == 0) ? 1 : i27) == 0) ? i27 : 1) == 0) {
                            java.util.ArrayList arrayList2 = z5Var.f223438n;
                            java.lang.String str5 = i63Var2.f458285d;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w5 w5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w5();
                            w5Var.f223365k = i27;
                            w5Var.f223356b = str5;
                            w5Var.f223367m = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.x5();
                            arrayList2.add(w5Var);
                            if (!z5Var.f223442r) {
                                java.util.ArrayList arrayList3 = z5Var.f223438n;
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w5) arrayList3.get(arrayList3.size() - 1)).f223366l = true;
                                z5Var.f223442r = true;
                            }
                            if (i63Var2.f458286e == 4 && linkedList10 != null) {
                                java.util.Iterator it9 = linkedList10.iterator();
                                while (it9.hasNext()) {
                                    r45.j63 j63Var = (r45.j63) it9.next();
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w5 w5Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w5();
                                    w5Var2.f223365k = i28;
                                    r45.c63 c63Var = j63Var.f459137d;
                                    java.lang.String str6 = c63Var.f452835d;
                                    w5Var2.f223355a = str6;
                                    w5Var2.f223356b = c63Var.f452836e;
                                    w5Var2.f223357c = c63Var.f452837f;
                                    w5Var2.f223358d = c63Var.f452838g;
                                    w5Var2.f223359e = c63Var.f452839h;
                                    int i39 = c63Var.f452841m;
                                    java.lang.String str7 = c63Var.f452842n;
                                    w5Var2.f223362h = j63Var.f459138e;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.x5 x5Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.x5(i39, 4, str6, str7);
                                    w5Var2.f223367m = x5Var2;
                                    x5Var2.f223397g = "3";
                                    int i47 = z5Var.f223435h;
                                    z5Var.f223435h = i47 + 1;
                                    x5Var2.f223398h = i47 + 601;
                                    z5Var.f223438n.add(w5Var2);
                                    i28 = 3;
                                }
                            }
                            int i48 = i63Var2.f458286e;
                            if ((i48 == 1 || i48 == 2) && (linkedList = i63Var2.f458287f) != null) {
                                java.util.Iterator it10 = linkedList.iterator();
                                while (it10.hasNext()) {
                                    r45.c63 c63Var2 = (r45.c63) it10.next();
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w5 w5Var3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w5();
                                    w5Var3.f223365k = 1;
                                    java.lang.String str8 = c63Var2.f452835d;
                                    w5Var3.f223355a = str8;
                                    w5Var3.f223356b = c63Var2.f452836e;
                                    w5Var3.f223357c = c63Var2.f452837f;
                                    w5Var3.f223358d = c63Var2.f452838g;
                                    w5Var3.f223359e = c63Var2.f452839h;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.x5 x5Var3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.x5(c63Var2.f452841m, 1, str8, c63Var2.f452842n);
                                    w5Var3.f223367m = x5Var3;
                                    int i49 = i63Var2.f458286e;
                                    if (i49 == 1) {
                                        z5Var.f223431d = true;
                                        int i57 = z5Var.f223433f + 1;
                                        z5Var.f223433f = i57;
                                        x5Var3.f223398h = i57;
                                    } else if (i49 == 2) {
                                        z5Var.f223432e = true;
                                        int i58 = z5Var.f223434g + 1;
                                        z5Var.f223434g = i58;
                                        x5Var3.f223398h = i58;
                                    }
                                    x5Var3.f223397g = "1";
                                    z5Var.f223438n.add(w5Var3);
                                }
                                i19 = 3;
                            } else {
                                i19 = 3;
                                if (i48 == 3 && linkedList9 != null) {
                                    z5Var.f223440p = i63Var2.f458292n;
                                    z5Var.f223441q = i63Var2.f458293o;
                                    java.util.Iterator it11 = linkedList9.iterator();
                                    while (it11.hasNext()) {
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w5 a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w5.a((r45.k63) it11.next());
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.x5 x5Var4 = a18.f223367m;
                                        x5Var4.f223392b = a18.f223355a;
                                        x5Var4.f223394d = a18.f223363i;
                                        x5Var4.f223395e = a18.f223364j;
                                        x5Var4.f223397g = "2";
                                        int i59 = z5Var.f223436i;
                                        z5Var.f223436i = i59 + 1;
                                        x5Var4.f223398h = i59 + 301;
                                        z5Var.f223438n.add(a18);
                                    }
                                }
                            }
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i63Var2.f458289h) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i63Var2.f458290i) || i63Var2.f458286e != 1) {
                                c17 = 5;
                            } else {
                                java.lang.String str9 = i63Var2.f458289h;
                                java.lang.String str10 = i63Var2.f458290i;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w5 w5Var4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w5();
                                c17 = 5;
                                w5Var4.f223365k = 5;
                                w5Var4.f223356b = str9;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.x5 x5Var5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.x5(2, str10);
                                w5Var4.f223367m = x5Var5;
                                x5Var5.f223392b = "wx62d9035fd4fd2059";
                                x5Var5.f223397g = "1";
                                x5Var5.f223398h = 300;
                                z5Var.f223438n.add(w5Var4);
                            }
                            i28 = i19;
                            i27 = 0;
                        } else if (i63Var2.f458286e == 1) {
                            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4);
                            android.content.Context context = z5Var.f223437m;
                            java.lang.String string = !K0 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fp9, str4) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fp8);
                            java.util.ArrayList arrayList4 = z5Var.f223438n;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w5 w5Var5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w5();
                            w5Var5.f223365k = 6;
                            w5Var5.f223356b = string;
                            w5Var5.f223367m = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.x5();
                            arrayList4.add(w5Var5);
                            z5Var.f223442r = true;
                        }
                    }
                    java.util.Iterator it12 = z5Var.f223438n.iterator();
                    while (it12.hasNext()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w5 w5Var6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w5) it12.next();
                        if (z5Var.f223431d) {
                            w5Var6.f223367m.f223396f = 1403;
                        } else if (z5Var.f223432e) {
                            w5Var6.f223367m.f223396f = 1404;
                        } else {
                            w5Var6.f223367m.f223396f = 1405;
                        }
                    }
                    z5Var.notifyDataSetChanged();
                }
            }
        }
        U6(2);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void v() {
    }
}
