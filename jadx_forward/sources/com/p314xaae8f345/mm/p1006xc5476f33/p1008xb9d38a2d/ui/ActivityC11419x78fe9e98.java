package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginPasswordUI */
/* loaded from: classes14.dex */
public class ActivityC11419x78fe9e98 extends com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf {
    public static final /* synthetic */ int G1 = 0;
    public p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c D1;

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f154898l1 = "";

    /* renamed from: p1, reason: collision with root package name */
    public boolean f154899p1 = false;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f154900x1 = false;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f154901y1 = false;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f154902z1 = false;
    public boolean A1 = false;
    public int B1 = -1;
    public final x51.c1 C1 = new x51.c1();
    public boolean E1 = true;
    public java.lang.String F1 = "";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf
    public void X6() {
        super.X6();
        int i17 = this.T;
        if (i17 == 1) {
            this.f154862h.setVisibility(8);
            this.f154861g.setVisibility(8);
            return;
        }
        if (i17 == 2 || i17 == 3 || i17 == 6) {
            this.f154861g.setVisibility(8);
            W6(this.f154862h);
        } else if (i17 == 7) {
            this.f154862h.setVisibility(8);
            W6(this.f154861g);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginPasswordUI", "unknown login type: " + this.T);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf
    public void Z6() {
        super.Z6();
        if (isFinishing() || getWindow() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LoginPasswordUI", "LoginHistoryUI is finishing");
            return;
        }
        java.lang.String obj = this.f154859e.getText().toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 w6Var = this.f154873u;
        w6Var.f155820c = obj;
        if (w6Var.f155819b.equals("")) {
            db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.ghz, com.p314xaae8f345.mm.R.C30867xcad56011.f573937gi1, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.r6(this));
            return;
        }
        int i17 = this.T;
        if (i17 == 2) {
            g7(true);
            wd0.j1 j1Var = (wd0.j1) i95.n0.c(wd0.j1.class);
            p3325xe03a0797.p3326xc267989b.y0 lifecycleScope = getLifecycleAsyncScope();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = mo55332x76847179();
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.t6 t6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.t6(this);
            vd0.v1 v1Var = (vd0.v1) j1Var;
            v1Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleScope, "lifecycleScope");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            je0.i iVar = (je0.i) i95.n0.c(je0.i.class);
            vd0.s1 s1Var = new vd0.s1(t6Var, v1Var, context, lifecycleScope);
            ((ie0.m) iVar).getClass();
            se4.h.a(true, true, s1Var);
            return;
        }
        if (i17 == 6) {
            V6();
            g7(true);
            js.r0 r0Var = (js.r0) i95.n0.c(js.r0.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11423x465a464c c11423x465a464c = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11423x465a464c(this);
            ((is.f) r0Var).getClass();
            u61.o.c(this, r45.gn4.kMobileType_Mask, "BeforeLogin", new is.b(c11423x465a464c));
            return;
        }
        if (!(i17 == 3)) {
            if (!(i17 == 1) && w6Var.f155820c.equals("")) {
                db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.k67, com.p314xaae8f345.mm.R.C30867xcad56011.f573937gi1);
                return;
            }
            mo48674x36654fab();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.class)).U6();
            this.C1.a(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.s6(this));
            return;
        }
        g7(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginPasswordUI", "handleFastSwitchLogin begin ");
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("auth_info_key_prefs", 4);
        if (sharedPreferences == null) {
            g7(false);
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g0z);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            o7(string, bool, bool);
            return;
        }
        java.lang.String string2 = sharedPreferences.getString("_auth_key", "");
        java.lang.String username = this.E;
        byte[] h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(string2);
        sharedPreferences.getString("server_id", "");
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        q61.k kVar = new q61.k() { // from class: com.tencent.mm.plugin.account.ui.LoginPasswordUI$$a
            @Override // q61.k
            public final void a(final boolean z17, final r45.nf5 nf5Var) {
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.G1;
                final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e98 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.this;
                activityC11419x78fe9e98.getClass();
                final java.lang.ref.WeakReference weakReference2 = weakReference;
                activityC11419x78fe9e98.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginPasswordUI$$k
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.G1;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e982 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.this;
                        activityC11419x78fe9e982.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e983 = (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98) weakReference2.get();
                        if (activityC11419x78fe9e983 == null || activityC11419x78fe9e983.isFinishing()) {
                            return;
                        }
                        activityC11419x78fe9e983.g7(false);
                        android.app.ProgressDialog progressDialog = activityC11419x78fe9e982.f154871s;
                        if (progressDialog != null && progressDialog.isShowing()) {
                            activityC11419x78fe9e982.f154871s.dismiss();
                            activityC11419x78fe9e982.f154871s = null;
                        }
                        boolean z18 = z17;
                        r45.nf5 nf5Var2 = nf5Var;
                        if (z18 && nf5Var2 != null) {
                            java.lang.String str = nf5Var2.f462885d;
                            r45.cu5 cu5Var = nf5Var2.f462886e;
                            if (str != null && !str.isEmpty() && cu5Var != null && cu5Var.f453374f != null && cu5Var.f453372d > 0) {
                                q61.j.i(str);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ReportPushLoginURLMainDevice", "reportLoginAssistTipsAgreePageIn");
                                java.util.HashMap d17 = q61.j.d();
                                d17.put("page_id", "50367");
                                d17.put("page_name", "LoginAssistTipsAgree");
                                d17.put("login_ticket_id", q61.j.f441801h);
                                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("page_in", d17, 34575);
                                q61.j.f(q61.j.f441801h, 2);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginPasswordUI", "handleFastSwitchLogin scuccess ");
                                android.content.Intent intent = new android.content.Intent(activityC11419x78fe9e982, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11410x7839932d.class);
                                intent.putExtra("UUID", str);
                                intent.putExtra("NotifyKey", x51.j1.d(cu5Var));
                                activityC11419x78fe9e982.F1 = str;
                                activityC11419x78fe9e983.E1 = false;
                                activityC11419x78fe9e983.D1.a(intent, null);
                                return;
                            }
                        }
                        q61.j.e("", 2, 3, 0, 4);
                        java.lang.String str2 = nf5Var2 != null ? nf5Var2.f462895q : "";
                        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                        activityC11419x78fe9e983.o7(str2, bool2, bool2);
                    }
                });
            }
        };
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.f515113a, p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new q61.i(username, h17, kVar, null), 2, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        tm.a b17;
        super.mo43517x10010bd5();
        if (getIntent() != null) {
            int intExtra = getIntent().getIntExtra("key_errType", 0);
            int intExtra2 = getIntent().getIntExtra("key_errCode", 0);
            java.lang.String stringExtra = getIntent().getStringExtra("key_errMsg");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginPasswordUI", "initView,errType %d,errCode %d", java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(intExtra2));
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.d.b(intExtra, intExtra2) || (b17 = tm.a.b(stringExtra)) == null) {
                return;
            }
            b17.d(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.q6(this));
        }
    }

    public final void m7(final int i17) {
        wd0.d1[] d1VarArr = wd0.d1.f526235d;
        if (i17 == 9) {
            return;
        }
        new android.os.Handler(getMainLooper()).post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginPasswordUI$$f
            @Override // java.lang.Runnable
            public final void run() {
                int i18;
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.G1;
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e98 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.this;
                android.app.ProgressDialog progressDialog = activityC11419x78fe9e98.f154871s;
                if (progressDialog != null && progressDialog.isShowing()) {
                    activityC11419x78fe9e98.f154871s.dismiss();
                    activityC11419x78fe9e98.f154871s = null;
                }
                activityC11419x78fe9e98.g7(false);
                wd0.d1[] d1VarArr2 = wd0.d1.f526235d;
                int i27 = i17;
                if (i27 == 7) {
                    wd0.j1 j1Var = (wd0.j1) i95.n0.c(wd0.j1.class);
                    java.lang.String username = activityC11419x78fe9e98.E;
                    vd0.v1 v1Var = (vd0.v1) j1Var;
                    v1Var.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("Fingerprint_" + username + "_Retry_Count").A("login_fingerprint_retry_count", (10 - v1Var.Di(username)) + 1);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC11419x78fe9e98.mo55332x76847179();
                    int i28 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
                    i18 = com.p314xaae8f345.mm.R.C30867xcad56011.p2m;
                    e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.p2m);
                    e4Var.c();
                    if (((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Di(activityC11419x78fe9e98.E) != 0) {
                        return;
                    }
                } else if (i27 == 5) {
                    i18 = com.p314xaae8f345.mm.R.C30867xcad56011.p2j;
                } else {
                    if (i27 == 6) {
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC11419x78fe9e98.mo55332x76847179();
                        int i29 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x768471792);
                        e4Var2.d(com.p314xaae8f345.mm.R.C30867xcad56011.p2n);
                        e4Var2.c();
                        return;
                    }
                    i18 = com.p314xaae8f345.mm.R.C30867xcad56011.p2k;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginPasswordUI", "[fingerprint login] handleFingerprintFail errCode is %d", java.lang.Integer.valueOf(i27));
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471793 = activityC11419x78fe9e98.mo55332x76847179();
                int i37 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x768471793);
                e4Var3.d(i18);
                e4Var3.c();
                ((is.f) ((js.r0) i95.n0.c(js.r0.class))).hj(activityC11419x78fe9e98.E, false);
                activityC11419x78fe9e98.f154901y1 = true;
                activityC11419x78fe9e98.q7();
            }
        });
    }

    public final void n7() {
        new android.os.Handler(getMainLooper()).post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginPasswordUI$$h
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.G1;
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e98 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.this;
                android.app.ProgressDialog progressDialog = activityC11419x78fe9e98.f154871s;
                if (progressDialog != null && progressDialog.isShowing()) {
                    activityC11419x78fe9e98.f154871s.dismiss();
                    activityC11419x78fe9e98.f154871s = null;
                }
                activityC11419x78fe9e98.g7(false);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC11419x78fe9e98.mo55332x76847179();
                int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
                e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.p2p);
                e4Var.c();
                ((is.f) ((js.r0) i95.n0.c(js.r0.class))).Ai(activityC11419x78fe9e98.E);
                activityC11419x78fe9e98.f154900x1 = true;
                activityC11419x78fe9e98.q7();
            }
        });
    }

    public void o7(java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2) {
        q61.j.f441795b = false;
        q61.j.f441799f = false;
        if (bool2.booleanValue()) {
            if (str == null || str.isEmpty()) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
                e4Var.f293309c = getString(com.p314xaae8f345.mm.R.C30867xcad56011.g0z);
                e4Var.c();
            } else {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
                int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x768471792);
                e4Var2.f293309c = str;
                e4Var2.c();
            }
        }
        if (bool.booleanValue()) {
            this.T = 0;
            q7();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        q61.j.h();
        int intExtra = getIntent().getIntExtra("login_type", -1);
        if (intExtra == 0) {
            q7();
        } else {
            r7(intExtra);
        }
        js.r0 r0Var = (js.r0) i95.n0.c(js.r0.class);
        java.lang.String username = this.E;
        is.f fVar = (is.f) r0Var;
        fVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        long Di = fVar.Di(username);
        ls.k[] kVarArr = ls.k.f402313d;
        if ((Di & 4) != 0) {
            ((is.f) ((js.r0) i95.n0.c(js.r0.class))).wi(this, this.A, this.E, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m6(this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginPasswordUI", "gateway expt disable");
        }
        if (this.T != 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginPasswordUI", "TAGcheckLoginURLMainDevice begin ");
            final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
            q61.j.f441794a.b(this, new q61.k() { // from class: com.tencent.mm.plugin.account.ui.LoginPasswordUI$$i
                @Override // q61.k
                public final void a(final boolean z17, r45.nf5 nf5Var) {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.G1;
                    final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e98 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.this;
                    activityC11419x78fe9e98.getClass();
                    final java.lang.ref.WeakReference weakReference2 = weakReference;
                    activityC11419x78fe9e98.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginPasswordUI$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e982 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.this;
                            java.lang.ref.WeakReference weakReference3 = weakReference2;
                            boolean z18 = z17;
                            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.G1;
                            activityC11419x78fe9e982.getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e983 = (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98) weakReference3.get();
                            if (!z18 || activityC11419x78fe9e983 == null || activityC11419x78fe9e983.isFinishing()) {
                                return;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginPasswordUI", "isEnableChange：%b isNotTimeOut:%b", java.lang.Boolean.valueOf(activityC11419x78fe9e982.d7()), java.lang.Boolean.valueOf(q61.j.f441799f));
                            if (activityC11419x78fe9e982.d7() && q61.j.f441799f) {
                                if ((activityC11419x78fe9e982.getIntent().getIntExtra("login_type", 0) == 0) && activityC11419x78fe9e982.T > 3) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginPasswordUI", "setLoginType(ConstantsUI.LoginHistoryUI.LOGIN_BY_FAST_SWITCH)");
                                    activityC11419x78fe9e982.r7(3);
                                    return;
                                }
                            }
                            activityC11419x78fe9e982.X6();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginPasswordUI", "PushLoginURLTAG3MainDeviceCGI scuccess but can not change");
                        }
                    });
                }
            });
        }
        this.D1 = m2516xaf5070d2(new h.f(), new p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b() { // from class: com.tencent.mm.plugin.account.ui.LoginPasswordUI$$l
            @Override // p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b
            public final void a(java.lang.Object obj) {
                java.lang.String str;
                final p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0059x32c0ac2c c0059x32c0ac2c = (p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0059x32c0ac2c) obj;
                final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e98 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.this;
                if (activityC11419x78fe9e98.E1 || (str = activityC11419x78fe9e98.F1) == null || str.isEmpty()) {
                    return;
                }
                activityC11419x78fe9e98.E1 = true;
                activityC11419x78fe9e98.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginPasswordUI$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.content.Intent intent;
                        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.G1;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e982 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.this;
                        activityC11419x78fe9e982.getClass();
                        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0059x32c0ac2c c0059x32c0ac2c2 = c0059x32c0ac2c;
                        if (c0059x32c0ac2c2.f90575d != -1 || (intent = c0059x32c0ac2c2.f90576e) == null) {
                            return;
                        }
                        boolean booleanExtra = intent.getBooleanExtra(ya.b.f77504xbb80cbe3, false);
                        boolean booleanExtra2 = intent.getBooleanExtra("block", false);
                        boolean booleanExtra3 = intent.getBooleanExtra("show_toast", false);
                        java.lang.String stringExtra = intent.getStringExtra("err_msg");
                        if (java.util.Objects.equals(intent.getStringExtra("UUID"), activityC11419x78fe9e982.F1)) {
                            activityC11419x78fe9e982.F1 = "";
                            if (!booleanExtra) {
                                activityC11419x78fe9e982.o7(stringExtra, java.lang.Boolean.valueOf(booleanExtra2), java.lang.Boolean.valueOf(booleanExtra3));
                                return;
                            }
                            activityC11419x78fe9e982.V6();
                            java.lang.String stringExtra2 = intent.getStringExtra(dm.i4.f66875xa013b0d5);
                            java.lang.String stringExtra3 = intent.getStringExtra("pwd");
                            activityC11419x78fe9e982.g7(true);
                            gm0.j1.d().g(new com.p314xaae8f345.mm.p957x53236a1b.v0(stringExtra2, stringExtra3, 0, "", "", "", 0, "", false, true));
                        }
                    }
                });
            }
        });
        this.f154860f.setVisibility(0);
        boolean[] zArr = {false};
        this.f154860f.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.n6(this, zArr));
        this.f154860f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.o6(this, zArr));
        java.lang.String stringExtra = getIntent().getStringExtra("auth_ticket");
        this.f154875w = stringExtra;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            android.widget.TextView textView = this.f154858d;
            java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6.c();
            if (c17 == null) {
                c17 = "";
            }
            textView.setText(c17);
            android.widget.EditText editText = this.f154859e;
            java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6.d();
            editText.setText(d17 != null ? d17 : "");
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.p6(this), 500L);
        } else if (getIntent().getIntExtra("LoginAction", -1) == 3 && this.T == 3 && intExtra != 0) {
            q61.j.g(1, 1);
            this.f154860f.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginPasswordUI$$g
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.this.Z6();
                }
            });
        }
        this.Y = true;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        this.C1.c(this, i17, strArr, iArr);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginPasswordUI", "onSceneEnd,errType %d,errCode %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        int i19 = this.T;
        if ((i19 == 1) && i17 != 0) {
            android.app.ProgressDialog progressDialog = this.f154871s;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f154871s.dismiss();
                this.f154871s = null;
            }
            g7(false);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            int i27 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.p2s);
            e4Var.c();
            ((is.f) ((js.r0) i95.n0.c(js.r0.class))).Ai(this.E);
            this.f154899p1 = true;
            q7();
            return;
        }
        if ((i19 == 6) && i17 != 0) {
            n7();
            return;
        }
        if ((i19 == 2) && i17 != 0) {
            m7(i18);
            return;
        }
        if ((i19 == 7) && (str2 = this.C) != null && (str3 = this.f154876x) != null && str2.equalsIgnoreCase(str3)) {
            if (i17 == 0) {
                jx3.f.INSTANCE.u(2122L, 0L);
            } else {
                jx3.f.INSTANCE.u(2122L, 1L);
            }
        }
        super.mo815x76e0bfae(i17, i18, str, m1Var);
    }

    public final void p7() {
        this.f154860f.C(com.p314xaae8f345.mm.R.C30867xcad56011.gi7, true);
        this.L.setVisibility(0);
        this.f154859e.setTypeface(android.graphics.Typeface.DEFAULT);
        this.f154859e.setTransformationMethod(new android.text.method.PasswordTransformationMethod());
        this.f154859e.setOnEditorActionListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.j6(this));
        this.f154859e.setOnKeyListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k6(this));
        this.f154859e.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.l6(this));
        if (this.f154859e.getText().toString().length() > 0) {
            this.f154860f.setEnabled(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q7() {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.q7():void");
    }

    public final void r7(int i17) {
        java.lang.String str;
        android.widget.Button button;
        this.B1 = this.T;
        this.T = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginPasswordUI", "initLoginView : " + this.T);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginPasswordUI", "initLoginView lastLoginType: " + this.B1);
        int i18 = this.T;
        if (i18 != 1) {
            if (i18 == 2) {
                this.L.setVisibility(8);
                this.f154860f.C(com.p314xaae8f345.mm.R.C30867xcad56011.p2l, true);
                this.f154861g.setVisibility(8);
                this.f154862h.setVisibility(0);
            } else if (i18 == 3) {
                this.L.setVisibility(8);
                this.f154860f.C(com.p314xaae8f345.mm.R.C30867xcad56011.pah, true);
                this.f154861g.setVisibility(8);
                this.f154862h.setVisibility(0);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.class)).T6();
                if (getIntent().getBooleanExtra("K_NO_NOT_REPORT_ONCE", false)) {
                    getIntent().putExtra("K_NO_NOT_REPORT_ONCE", false);
                } else {
                    q61.j.g(0, 0);
                }
            } else if (i18 == 4) {
                android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11444x1cfdebbd.class);
                intent.putExtra("switch_login_wx_id", this.A);
                intent.putExtra("LastLoginType", this.B1);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginPasswordUI", "jumpToVoiceUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/account/ui/LoginPasswordUI", "jumpToVoiceUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                finish();
            } else if (i18 == 6) {
                this.L.setVisibility(8);
                this.f154860f.C(com.p314xaae8f345.mm.R.C30867xcad56011.p2q, true);
                this.f154861g.setVisibility(8);
                this.f154862h.setVisibility(0);
                v61.d.i(this.f154862h, "other_verify_login", 1);
                str = "current_number_login";
            } else if (i18 != 7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LoginPasswordUI", "unknown login type: " + this.T);
                this.T = 7;
                p7();
            } else {
                p7();
            }
            str = "";
        } else {
            this.L.setVisibility(8);
            this.f154860f.C(com.p314xaae8f345.mm.R.C30867xcad56011.p2t, true);
            this.f154861g.setVisibility(8);
            this.f154873u.f155821d = c01.uc.f119047c.c(this.E, "last_logout_no_pwd_ticket_for_one_click");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.class)).T6();
            str = "one_clk_login";
        }
        v61.d.i(this.f154860f, str, 1);
        X6();
        if (this.f154860f == null || (button = this.f154862h) == null || button.getVisibility() != 0) {
            return;
        }
        this.f154860f.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginPasswordUI$$e
            @Override // java.lang.Runnable
            public final void run() {
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.G1;
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98 activityC11419x78fe9e98 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.this;
                activityC11419x78fe9e98.f154862h.setWidth(activityC11419x78fe9e98.f154860f.getWidth());
            }
        });
    }
}
