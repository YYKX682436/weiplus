package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI */
/* loaded from: classes5.dex */
public class ActivityC17437x244fdb47 extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a implements com.p314xaae8f345.mm.p944x882e457a.u0, al5.e0 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f242052u = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 f242053e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 f242054f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f242055g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f242056h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f242057i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f242058m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ScrollView f242059n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f242060o;

    /* renamed from: p, reason: collision with root package name */
    public v61.j0 f242061p;

    /* renamed from: q, reason: collision with root package name */
    public k14.y f242062q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.ArrayList f242063r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.ArrayList f242064s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f242065t = false;

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsModifyAliasUI", "keyboard show %s, keyboardHeight %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        if (!z17) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f242055g.getLayoutParams();
            layoutParams.bottomMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu);
            layoutParams.topMargin = 0;
            this.f242055g.setLayoutParams(layoutParams);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d2049 = this.f242053e;
            c22607x763d2049.setPadding(c22607x763d2049.getPaddingLeft(), this.f242053e.getPaddingTop(), this.f242053e.getPaddingRight(), 0);
            this.f242059n.scrollBy(0, 0);
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f242055g.getLayoutParams();
        layoutParams2.bottomMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        layoutParams2.topMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        this.f242055g.setLayoutParams(layoutParams2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d20492 = this.f242053e;
        c22607x763d20492.setPadding(c22607x763d20492.getPaddingLeft(), this.f242053e.getPaddingTop(), this.f242053e.getPaddingRight(), i17);
        int height = this.f242059n.getHeight();
        this.f242053e.requestLayout();
        this.f242053e.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ah(this, height));
    }

    public final void Z6(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(this);
        z2Var.i(com.p314xaae8f345.mm.R.C30864xbddafb2a.cl_);
        ((android.widget.TextView) z2Var.f293591g.findViewById(com.p314xaae8f345.mm.R.id.moo)).setText(str);
        android.widget.Button button = (android.widget.Button) z2Var.f293591g.findViewById(com.p314xaae8f345.mm.R.id.kao);
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bh(this, str));
        com.p314xaae8f345.mm.p2776x373aa5.C22781xca7662c3 c22781xca7662c3 = (com.p314xaae8f345.mm.p2776x373aa5.C22781xca7662c3) z2Var.f293591g.findViewById(com.p314xaae8f345.mm.R.id.jpf);
        c22781xca7662c3.m82520x3020863b(getString(com.p314xaae8f345.mm.R.C30867xcad56011.gy6));
        c22781xca7662c3.m82518x39051bcf(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ch(this, button));
        c22781xca7662c3.m82519xfb972f1d(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.dh(this));
        android.widget.ImageView imageView = (android.widget.ImageView) z2Var.f293591g.findViewById(com.p314xaae8f345.mm.R.id.jpg);
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562263b8);
        }
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.eh(this, z2Var));
        z2Var.C();
    }

    public final void a7(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f242057i.setVisibility(8);
        } else {
            this.f242057i.setVisibility(0);
            this.f242057i.setText(str);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.clp;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f242053e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049) findViewById(com.p314xaae8f345.mm.R.id.hdf);
        this.f242055g = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kao);
        this.f242054f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04) findViewById(com.p314xaae8f345.mm.R.id.f564467s8);
        this.f242056h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.v3t);
        this.f242057i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.dhj);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.v3q);
        this.f242058m = textView;
        if (this.f242065t) {
            textView.setVisibility(0);
            this.f242056h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.phv);
        } else {
            textView.setVisibility(8);
            this.f242056h.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574586iu0);
        }
        this.f242059n = (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.mcm);
        this.f242055g.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.wg(this));
        this.f242054f.requestFocus();
        this.f242054f.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(20)});
        this.f242054f.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xg(this));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yg(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f242065t = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("AliasModifyOpt", 0) == 1;
        this.f242063r = getIntent().getIntegerArrayListExtra("key_ticket_type");
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("key_ticket");
        this.f242064s = stringArrayListExtra;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsModifyAliasUI", "ticketTypes %s, tickets %s", this.f242063r, stringArrayListExtra);
        mo43517x10010bd5();
        gm0.j1.d().a(3516, this);
        gm0.j1.d().a(177, this);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) == 0) {
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(3516, this);
        gm0.j1.d().q(177, this);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, final com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsModifyAliasUI", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f242060o;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (m1Var.mo808xfb85f7b0() == 3516) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6746x43f2e743 c6746x43f2e743 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6746x43f2e743();
            c6746x43f2e743.f140772e = 4L;
            c6746x43f2e743.p(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17413x56438321.f241849r);
            if (m1Var != this.f242061p) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SettingsModifyAliasUI", "check alias, not my scene, ignore!");
                return;
            }
            if (i17 == 0 && i18 == 0) {
                Z6(((v61.j0) m1Var).f514984f);
            } else {
                c6746x43f2e743.f140773f = 6L;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    a7(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571924to));
                } else {
                    tm.a b17 = tm.a.b(str);
                    if (this.f242065t) {
                        if (b17 != null) {
                            if (b17.f501933c != 3) {
                                a7(b17.f501932b);
                            } else {
                                b17.c(mo55332x76847179(), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI$$a
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(android.content.DialogInterface dialogInterface, int i19) {
                                        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17437x244fdb47.f242052u;
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17437x244fdb47 activityC17437x244fdb47 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17437x244fdb47.this;
                                        activityC17437x244fdb47.getClass();
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsModifyAliasUI", "onOk");
                                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(2133L, 1L, 1L, false);
                                        activityC17437x244fdb47.Z6(((v61.j0) m1Var).f514984f);
                                    }
                                }, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.DialogInterfaceOnClickListenerC17439xa8ff173b());
                            }
                        } else if (i18 == -14) {
                            this.f242058m.setTextColor(b3.l.m9702x7444d5ad(mo55332x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
                        } else {
                            a7(str);
                        }
                    } else if (b17 != null) {
                        a7(b17.f501932b);
                    } else {
                        a7(str);
                    }
                }
            }
            c6746x43f2e743.k();
            return;
        }
        if (m1Var.mo808xfb85f7b0() == 177) {
            if (m1Var != this.f242062q) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SettingsModifyAliasUI", "general set, not my scene, ignore!");
                return;
            }
            if (i17 != 0 || i18 != 0) {
                if (i18 == -7 || i18 == -10) {
                    db5.e1.i(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f574326hv5, com.p314xaae8f345.mm.R.C30867xcad56011.gyf);
                    return;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    db5.e1.i(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f571924to, com.p314xaae8f345.mm.R.C30867xcad56011.gyf);
                    return;
                }
                tm.a b18 = tm.a.b(str);
                if (b18 != null) {
                    b18.d(this, null);
                    return;
                } else {
                    db5.e1.s(this, str, getString(com.p314xaae8f345.mm.R.C30867xcad56011.gyf));
                    return;
                }
            }
            db5.e1.T(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572013w9));
            java.lang.String str2 = this.f242062q.f384951f;
            java.lang.String str3 = (java.lang.String) gm0.j1.u().c().l(42, null);
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LAST_LOGIN_USERNAME_STRING;
            java.lang.String str4 = (java.lang.String) c17.m(u3Var2, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsModifyAliasUI", "newAlias %s, oldAlias %s, lastLogin %s", str2, str3, str4);
            gm0.j1.u().c().w(42, str2);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || str3.equals(str4)) {
                gm0.j1.u().c().x(u3Var2, str2);
                c01.uc.f119047c.h(c01.z1.r(), "login_user_name", str2);
                c01.b9.f118602c.d("login_user_name", str2);
            }
            c01.b9.f118602c.d("last_login_alias", str2);
            c01.uc.f119047c.h(c01.z1.r(), "last_login_alias", str2);
            W6(-1);
            setResult(-1);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d2049;
        super.onWindowFocusChanged(z17);
        if (!z17 || (c22607x763d2049 = this.f242053e) == null) {
            return;
        }
        c22607x763d2049.e(this);
    }
}
