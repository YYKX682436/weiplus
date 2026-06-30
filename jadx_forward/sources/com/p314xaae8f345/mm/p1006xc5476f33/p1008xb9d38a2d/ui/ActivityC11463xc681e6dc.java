package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI */
/* loaded from: classes11.dex */
public class ActivityC11463xc681e6dc extends com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11468x5768076f {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f155136y = 0;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f155137i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f155138m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f155139n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f155140o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f155141p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f155142q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.EditText f155143r;

    /* renamed from: u, reason: collision with root package name */
    public boolean f155146u;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f155144s = null;

    /* renamed from: t, reason: collision with root package name */
    public boolean f155145t = false;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f155147v = null;

    /* renamed from: w, reason: collision with root package name */
    public int f155148w = 0;

    /* renamed from: x, reason: collision with root package name */
    public r45.cu5 f155149x = null;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11468x5768076f
    public com.p314xaae8f345.mm.p944x882e457a.m1 a7() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155147v)) {
            this.f155147v = (java.lang.String) gm0.j1.u().c().l(77830, null);
        }
        return new com.p314xaae8f345.mm.p957x53236a1b.f1(this.f155182e, this.f155147v, this.f155148w, this.f155149x);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11468x5768076f
    public void b7() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155147v)) {
            i7();
        } else {
            if (!this.f155146u) {
                i7();
                return;
            }
            gm0.j1.d().g(new com.p314xaae8f345.mm.p957x53236a1b.l1(1, this.f155143r.getText().toString(), "", "", "", false));
            this.f155184g = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572085yb), true, false, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11468x5768076f
    public java.lang.String c7() {
        return ((android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.f568127ls5)).getText().toString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11468x5768076f
    public java.lang.String d7() {
        return ((android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.f568126ls4)).getText().toString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11468x5768076f
    public boolean f7(int i17, int i18, java.lang.String str) {
        if (i17 != 0 || i18 != 0) {
            return e7(i17, i18, str);
        }
        setResult(-1);
        finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11468x5768076f
    public void g7(c71.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.hwv, com.p314xaae8f345.mm.R.C30867xcad56011.hwx);
            return;
        }
        if (ordinal == 1) {
            db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.hww, com.p314xaae8f345.mm.R.C30867xcad56011.hwx);
        } else if (ordinal == 2) {
            db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.k69, com.p314xaae8f345.mm.R.C30867xcad56011.hwx);
        } else {
            if (ordinal != 3) {
                return;
            }
            db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.k66, com.p314xaae8f345.mm.R.C30867xcad56011.hwx);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cds;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.lang.String str;
        if (!this.f155185h) {
            m78601x22395ca8();
        }
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.hx_);
        this.f155138m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ovg);
        this.f155140o = findViewById(com.p314xaae8f345.mm.R.id.f563924da);
        this.f155137i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568122ls0);
        this.f155141p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f563955e4);
        java.lang.String str2 = this.f155144s;
        if (str2 != null && str2.length() > 0) {
            this.f155137i.setText(this.f155144s);
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.lry);
        this.f155142q = findViewById;
        this.f155143r = (android.widget.EditText) findViewById.findViewById(com.p314xaae8f345.mm.R.id.f568125ls3);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.gcx);
        this.f155139n = findViewById2;
        findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fg(this));
        if (this.f155145t || !gm0.j1.b().m()) {
            android.view.View view = this.f155140o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = this.f155140o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.String c17 = c01.z1.c();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
                c17 = c01.z1.r();
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.y3(c17)) {
                    c17 = null;
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
                java.lang.String str3 = (java.lang.String) gm0.j1.u().c().l(6, null);
                java.lang.String str4 = (java.lang.String) gm0.j1.u().c().l(5, null);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Q0(str3).booleanValue()) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.c5 c5Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.c5();
                        if (str3.startsWith("+")) {
                            str3 = str3.replace("+", "");
                            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.c(str3);
                            if (str != null) {
                                str3 = str3.substring(str.length());
                            }
                        } else {
                            str = "86";
                        }
                        java.lang.String f17 = c5Var.f(str, str3);
                        this.f155141p.setText(com.p314xaae8f345.mm.R.C30867xcad56011.isz);
                        this.f155138m.setText(f17);
                    }
                    this.f155137i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hxb);
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                    android.view.View view3 = this.f155140o;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    this.f155138m.setText(str4);
                    this.f155141p.setText(com.p314xaae8f345.mm.R.C30867xcad56011.iqi);
                    this.f155137i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hxa);
                }
            } else {
                this.f155141p.setText(com.p314xaae8f345.mm.R.C30867xcad56011.j0q);
                this.f155138m.setText(c17);
            }
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.khv);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kpv);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.c_y);
        android.widget.EditText editText = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.f568127ls5);
        android.widget.EditText editText2 = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.f568126ls4);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j()) {
            textView.setTextSize(1, 14.0f);
            textView2.setTextSize(1, 14.0f);
            textView3.setTextSize(1, 14.0f);
            editText.setTextSize(1, 14.0f);
            editText2.setTextSize(1, 14.0f);
        }
        float measureText = this.f155141p.getPaint().measureText(this.f155141p.getText().toString());
        int max = (int) java.lang.Math.max(java.lang.Math.max(java.lang.Math.max(measureText, textView2.getPaint().measureText(textView2.getText().toString())), textView3.getPaint().measureText(textView3.getText().toString())), textView.getPaint().measureText(textView.getText().toString()));
        textView.setWidth(max);
        this.f155141p.setWidth(max);
        textView2.setWidth(max);
        textView2.setWidth(max);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11468x5768076f, com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f155144s = getIntent().getStringExtra("kintent_hint");
        this.f155185h = getIntent().getBooleanExtra("kintent_cancelable", true);
        this.f155145t = getIntent().getBooleanExtra("from_unbind", false);
        gm0.j1.d().a(384, this);
        gm0.j1.d().a(255, this);
        mo43517x10010bd5();
        byte[] h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(c01.h9.a().getString("_auth_key", ""));
        r45.nc ncVar = new r45.nc();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(h17)) {
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(new byte[0]);
            this.f155149x = cu5Var;
        } else {
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(h17);
            this.f155149x = cu5Var2;
            try {
                ncVar.mo11468x92b714fd(h17);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicorMsg.RegByMobileSetPwdUI", e17, "summersetpwd Failed parse autoauthkey buf", new java.lang.Object[0]);
            }
        }
        java.lang.String stringExtra = getIntent().getStringExtra("setpwd_ticket");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.RegByMobileSetPwdUI", "get reset pwd ticket %s", stringExtra);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            gm0.j1.d().g(new com.p314xaae8f345.mm.p957x53236a1b.w0(1));
            this.f155184g = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), true, false, null);
            return;
        }
        this.f155147v = stringExtra;
        this.f155148w = getIntent().getIntExtra("setpwd_ticket_type", 6);
        android.view.View view = this.f155142q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f155139n;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11468x5768076f, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(384, this);
        gm0.j1.d().q(255, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        java.lang.String stringExtra = intent.getStringExtra("setpwd_ticket");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.RegByMobileSetPwdUI", "onNewIntent get reset pwd ticket %s", stringExtra);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            return;
        }
        this.f155147v = stringExtra;
        this.f155148w = 4;
        android.view.View view = this.f155142q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onNewIntent", "(Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onNewIntent", "(Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f155139n;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onNewIntent", "(Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onNewIntent", "(Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11468x5768076f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.RegByMobileSetPwdUI", "errorCode %d, errorMsg %s, scene %s", java.lang.Integer.valueOf(i18), str, m1Var);
        super.mo815x76e0bfae(i17, i18, str, m1Var);
        if (m1Var.mo808xfb85f7b0() != 255) {
            if (m1Var.mo808xfb85f7b0() == 384) {
                if (i17 != 0 || i18 != 0) {
                    db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.hx6, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
                    return;
                } else {
                    gm0.j1.u().c().w(77830, ((com.p314xaae8f345.mm.p957x53236a1b.l1) m1Var).H());
                    i7();
                    return;
                }
            }
            return;
        }
        if (((com.p314xaae8f345.mm.p957x53236a1b.w0) m1Var).f152978g == 1) {
            if (i17 == 0 && i18 == 0) {
                android.view.View view = this.f155142q;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = this.f155139n;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f155146u = true;
                return;
            }
            if (i18 == -3 && i17 == 4) {
                this.f155146u = false;
                return;
            }
            android.view.View view3 = this.f155142q;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f155139n;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            tm.a b17 = tm.a.b(str);
            if (b17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.RegByMobileSetPwdUI", "summertips errCode[%d], showType[%d], url[%s], desc[%s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(b17.f501933c), b17.f501931a, b17.f501932b);
                db5.e1.G(this, b17.f501932b, b17.f501934d, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.gg(this));
            }
        }
    }
}
