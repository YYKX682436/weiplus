package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingFingerprintHomeUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintHomeUI */
/* loaded from: classes14.dex */
public final class ActivityC17393x8aef9d67 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f241739o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f241740d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f241741e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f241742f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f241743g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f241744h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f241745i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f241746m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f241747n;

    public final void T6(boolean z17, boolean z18) {
        rk0.c.c("MicroMsg.SettingFingerprintHomeUI", "[fingerprint login] current safe request", new java.lang.Object[0]);
        wd0.f[] fVarArr = wd0.f.f526244d;
        ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).wi(getLifecycleAsyncScope(), z18 ? 2 : 1, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.m3(z18, this));
    }

    public final void U6(java.lang.String str) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.A = false;
        aVar.f293262s = str;
        aVar.f293265v = mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
        aVar.E = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.n3.f242878d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(mo55332x76847179, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
    }

    public final void V6(boolean z17, boolean z18) {
        rk0.c.c("MicroMsg.SettingFingerprintHomeUI", "current click the switch button, state is " + z17, new java.lang.Object[0]);
        if (!z18) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("switch_status_before", java.lang.Integer.valueOf(!z17 ? 1 : 0));
            hashMap.put("switch_status_after", java.lang.Integer.valueOf(z17 ? 1 : 0));
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ub.f243136a;
            if (str == null) {
                str = "";
            }
            hashMap.put("fingerprint_session_id", str);
            ((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Ai("fingerprint_login_switch", "view_clk", hashMap);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
        e4Var.f293309c = getString(com.p314xaae8f345.mm.R.C30867xcad56011.p9d);
        e4Var.f293313g = 2;
        this.f241746m = e4Var.c();
        if (z17) {
            boolean o17 = wt5.a.o(mo55332x76847179(), 1);
            rk0.c.c("MicroMsg.SettingFingerprintHomeUI", "[fingerprint login] has fingerprint " + o17, new java.lang.Object[0]);
            if (!o17) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = this.f241746m;
                if (f4Var != null) {
                    f4Var.dismiss();
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(mo55332x76847179());
                u1Var.g(getString(com.p314xaae8f345.mm.R.C30867xcad56011.p98));
                u1Var.a(false);
                u1Var.n(getString(com.p314xaae8f345.mm.R.C30867xcad56011.p9a));
                u1Var.j(getString(com.p314xaae8f345.mm.R.C30867xcad56011.p9_));
                u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.o3(this));
                u1Var.q(false);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vb vbVar = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vb.f243172a;
            if (!vbVar.b()) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var2 = this.f241746m;
                if (f4Var2 != null) {
                    f4Var2.dismiss();
                }
                java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.p9e, vbVar.a());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                U6(string);
                return;
            }
        }
        this.f241745i = true;
        T6(true, z17);
    }

    public final void W6() {
        mo56583xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        wd0.j1 j1Var = (wd0.j1) i95.n0.c(wd0.j1.class);
        java.lang.String r17 = c01.z1.r();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
        if (((vd0.v1) j1Var).Ni(r17)) {
            android.widget.Button button = this.f241740d;
            if (button == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("openBtn");
                throw null;
            }
            button.setVisibility(8);
            android.widget.Button button2 = this.f241741e;
            if (button2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeBtn");
                throw null;
            }
            button2.setVisibility(0);
            android.widget.TextView textView = this.f241742f;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("updateBtn");
                throw null;
            }
            textView.setVisibility(0);
            android.widget.TextView textView2 = this.f241743g;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTV");
                throw null;
            }
            textView2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.p9h));
            android.widget.TextView textView3 = this.f241744h;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTV");
                throw null;
            }
            textView3.setVisibility(4);
        } else {
            android.widget.Button button3 = this.f241740d;
            if (button3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("openBtn");
                throw null;
            }
            button3.setVisibility(0);
            android.widget.Button button4 = this.f241741e;
            if (button4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeBtn");
                throw null;
            }
            button4.setVisibility(8);
            android.widget.TextView textView4 = this.f241742f;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("updateBtn");
                throw null;
            }
            textView4.setVisibility(4);
            android.widget.TextView textView5 = this.f241743g;
            if (textView5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTV");
                throw null;
            }
            textView5.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.p9g));
            android.widget.TextView textView6 = this.f241744h;
            if (textView6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTV");
                throw null;
            }
            textView6.setVisibility(0);
        }
        android.widget.TextView textView7 = this.f241743g;
        if (textView7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTV");
            throw null;
        }
        com.p314xaae8f345.mm.ui.bk.s0(textView7.getPaint());
        android.widget.TextView textView8 = this.f241742f;
        if (textView8 != null) {
            com.p314xaae8f345.mm.ui.bk.s0(textView8.getPaint());
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("updateBtn");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.end;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1) {
            com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10685x7a6659ac c10685x7a6659ac = intent != null ? (com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10685x7a6659ac) intent.getParcelableExtra("bind_result") : null;
            if (c10685x7a6659ac == null || c10685x7a6659ac.f149347e != 0) {
                rk0.c.b("MicroMsg.SettingFingerprintHomeUI", "[fingerprint login] result is ok, but param is null", new java.lang.Object[0]);
                return;
            }
            rk0.c.c("MicroMsg.SettingFingerprintHomeUI", "[fingerprint login] bind result(callback) is errType: " + c10685x7a6659ac.f149346d + ", errCode: " + c10685x7a6659ac.f149347e + ", errMsg: " + c10685x7a6659ac.f149348f + ",res is " + c10685x7a6659ac.f149349g, new java.lang.Object[0]);
            js.r0 r0Var = (js.r0) i95.n0.c(js.r0.class);
            js.a aVar = js.a.WCAccountLogoutEntry_Fingerprint;
            is.f fVar = (is.f) r0Var;
            fVar.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 Ui = fVar.Ui();
            if (Ui != null) {
                Ui.A(fVar.Ni(aVar), Integer.MAX_VALUE);
            }
            java.lang.String stringExtra = intent.getStringExtra("fingerprint_id");
            if (stringExtra == null) {
                stringExtra = "";
            }
            wd0.j1 j1Var = (wd0.j1) i95.n0.c(wd0.j1.class);
            java.lang.String r17 = c01.z1.r();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
            ((vd0.v1) j1Var).aj(true, stringExtra, r17);
            return;
        }
        if (i18 != 0) {
            return;
        }
        if (intent == null) {
            rk0.c.c("MicroMsg.SettingFingerprintHomeUI", "[fingerprint login] result is canceled", new java.lang.Object[0]);
            return;
        }
        rk0.c.c("MicroMsg.SettingFingerprintHomeUI", "[fingerprint login] result is verify error", new java.lang.Object[0]);
        com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10685x7a6659ac c10685x7a6659ac2 = (com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10685x7a6659ac) intent.getParcelableExtra("bind_result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[fingerprint login] bind result(callback) is errType: ");
        sb6.append(c10685x7a6659ac2 != null ? java.lang.Integer.valueOf(c10685x7a6659ac2.f149346d) : null);
        sb6.append(", errCode: ");
        sb6.append(c10685x7a6659ac2 != null ? java.lang.Integer.valueOf(c10685x7a6659ac2.f149347e) : null);
        sb6.append(", errMsg: ");
        sb6.append(c10685x7a6659ac2 != null ? c10685x7a6659ac2.f149348f : null);
        sb6.append(",res is ");
        sb6.append(c10685x7a6659ac2 != null ? c10685x7a6659ac2.f149349g : null);
        rk0.c.c("MicroMsg.SettingFingerprintHomeUI", sb6.toString(), new java.lang.Object[0]);
        if (c10685x7a6659ac2 != null) {
            if (c10685x7a6659ac2.f149348f.length() > 0) {
                ((en.a) ((en.k) i95.n0.c(en.k.class))).Zi(mo55332x76847179(), c10685x7a6659ac2.f149346d, c10685x7a6659ac2.f149347e, c10685x7a6659ac2.f149348f);
                return;
            }
        }
        if (intent.getIntExtra("verify_result", 0) == 1022) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vb.f243173b = java.lang.System.currentTimeMillis() / 1000;
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.p9e, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vb.f243172a.a());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            U6(string);
            return;
        }
        if (this.f241747n) {
            java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.p9j);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            U6(string2);
        } else {
            java.lang.String string3 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.p9c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            U6(string3);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        mo56583xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.kio);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f241740d = (android.widget.Button) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f565291bz2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f241741e = (android.widget.Button) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.vki);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f241742f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.odf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f241743g = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.cut);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f241744h = (android.widget.TextView) findViewById5;
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.f3(this));
        this.f241747n = false;
        android.widget.Button button = this.f241740d;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("openBtn");
            throw null;
        }
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.g3(this));
        android.widget.Button button2 = this.f241741e;
        if (button2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeBtn");
            throw null;
        }
        button2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.h3(this));
        android.widget.TextView textView = this.f241742f;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("updateBtn");
            throw null;
        }
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i3(this));
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ub.f243136a == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            long n17 = j62.e.g().n();
            if (n17 == 0) {
                str = "0";
            } else if (n17 > 0) {
                str = java.lang.Long.toString(n17, 10);
            } else {
                char[] cArr = new char[64];
                long j17 = (n17 >>> 1) / 5;
                long j18 = 10;
                int i17 = 63;
                cArr[63] = java.lang.Character.forDigit((int) (n17 - (j17 * j18)), 10);
                while (j17 > 0) {
                    i17--;
                    cArr[i17] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                    j17 /= j18;
                }
                str = new java.lang.String(cArr, i17, 64 - i17);
            }
            sb6.append(str);
            sb6.append('_');
            sb6.append(java.lang.System.currentTimeMillis());
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ub.f243136a = sb6.toString();
        }
        wd0.j1 j1Var = (wd0.j1) i95.n0.c(wd0.j1.class);
        java.lang.String r17 = c01.z1.r();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
        boolean Ni = ((vd0.v1) j1Var).Ni(r17);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FingerPrintSettingPage);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 4, 29254);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(this, kz5.c1.k(new jz5.l("fingerprint_login_status", java.lang.Boolean.valueOf(Ni)), new jz5.l("fingerprint_session_id", com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ub.f243136a)));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ub.f243136a = null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        W6();
        if (this.f241745i) {
            this.f241745i = false;
            wd0.j1 j1Var = (wd0.j1) i95.n0.c(wd0.j1.class);
            java.lang.String r17 = c01.z1.r();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
            boolean Ni = ((vd0.v1) j1Var).Ni(r17);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
            e4Var.f293309c = getString(com.p314xaae8f345.mm.R.C30867xcad56011.p9d);
            e4Var.f293313g = 2;
            this.f241746m = e4Var.c();
            if (!Ni || this.f241747n) {
                T6(false, true);
            } else {
                T6(false, false);
            }
        }
    }
}
