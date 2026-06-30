package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class sa implements com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ec, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc f155721d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f155723f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f155724g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f155725h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f155727m;

    /* renamed from: n, reason: collision with root package name */
    public final d71.d f155728n;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db f155722e = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f155726i = true;

    public sa(d71.d dVar) {
        this.f155728n = dVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ec
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc) {
        this.f155721d = activityC11453xa58e34bc;
        activityC11453xa58e34bc.f155026u.setVisibility(0);
        java.lang.String stringExtra = activityC11453xa58e34bc.getIntent().getStringExtra("binded_mobile");
        this.f155724g = stringExtra;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            this.f155724g = com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.h(activityC11453xa58e34bc.f155031z + activityC11453xa58e34bc.A);
        }
        activityC11453xa58e34bc.f155014f.setTextColor(activityC11453xa58e34bc.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560765tk));
        activityC11453xa58e34bc.f155014f.setEnabled(false);
        activityC11453xa58e34bc.f155014f.setFocusable(false);
        activityC11453xa58e34bc.f155013e.setFocusable(false);
        d71.d dVar = this.f155728n;
        if (dVar != null) {
            activityC11453xa58e34bc.f155013e.m78938x765074af(activityC11453xa58e34bc.f155031z + " " + dVar.a(activityC11453xa58e34bc.A, activityC11453xa58e34bc.D));
        } else {
            activityC11453xa58e34bc.f155013e.m78938x765074af(com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.h(this.f155724g));
        }
        activityC11453xa58e34bc.f155013e.setVisibility(0);
        f();
        activityC11453xa58e34bc.f155027v.setVisibility(0);
        activityC11453xa58e34bc.f155023r.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gi7);
        activityC11453xa58e34bc.f155023r.setVisibility(0);
        activityC11453xa58e34bc.f155023r.setEnabled(true);
        this.f155727m = c01.b9.f118602c.a("login_weixin_username", "");
        java.lang.String stringExtra2 = activityC11453xa58e34bc.getIntent().getStringExtra("auth_ticket");
        this.f155723f = stringExtra2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            return;
        }
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.eb(this), 500L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ec
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.dc dcVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activity = this.f155721d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.class)).U6();
        int ordinal = dcVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 3) {
                return;
            }
            android.content.Intent intent = new android.content.Intent(this.f155721d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11452x4130082f.class);
            intent.putExtra("binded_mobile", this.f155724g);
            intent.putExtra("extspam_ctx_string", this.f155721d.P);
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc = this.f155721d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC11453xa58e34bc, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputSmsPwdLoginLogic", "goToVerifyPwd", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC11453xa58e34bc.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC11453xa58e34bc, "com/tencent/mm/plugin/account/ui/MobileInputSmsPwdLoginLogic", "goToVerifyPwd", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileInputIndepPassLoginLogic", "goNext");
        this.f155721d.mo48674x36654fab();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc2 = this.f155721d;
        activityC11453xa58e34bc2.f155031z = com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.a(activityC11453xa58e34bc2.D);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155721d.f155031z) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155721d.A)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc3 = this.f155721d;
        int i17 = activityC11453xa58e34bc3.H;
        if (i17 == 7) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
                d(this.f155724g, this.f155721d.f155012d.getText().toString());
                return;
            } else {
                d(this.f155724g, null);
                return;
            }
        }
        if (i17 == 6) {
            java.lang.String trim = activityC11453xa58e34bc3.f155016h.m78956xfb85ada3().toString().trim();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(trim)) {
                db5.e1.i(this.f155721d, com.p314xaae8f345.mm.R.C30867xcad56011.k6c, com.p314xaae8f345.mm.R.C30867xcad56011.f573937gi1);
                return;
            }
            this.f155721d.mo48674x36654fab();
            h11.e eVar = new h11.e(this.f155724g, 17, trim, 0, "");
            gm0.j1.d().g(eVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc4 = this.f155721d;
            activityC11453xa58e34bc4.f155019n = db5.e1.Q(activityC11453xa58e34bc4, activityC11453xa58e34bc4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), this.f155721d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ahe), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.mb(this, eVar));
        }
    }

    public void c(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        h11.e eVar = new h11.e(str, 13, "", 0, "");
        gm0.j1.d().g(eVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc = this.f155721d;
        activityC11453xa58e34bc.f155019n = db5.e1.Q(activityC11453xa58e34bc, activityC11453xa58e34bc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), this.f155721d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.lb(this, eVar));
    }

    public final void d(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            db5.e1.i(this.f155721d, com.p314xaae8f345.mm.R.C30867xcad56011.k6d, com.p314xaae8f345.mm.R.C30867xcad56011.f573937gi1);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            db5.e1.i(this.f155721d, com.p314xaae8f345.mm.R.C30867xcad56011.k67, com.p314xaae8f345.mm.R.C30867xcad56011.f573937gi1);
            return;
        }
        this.f155721d.f155012d.setText(str2);
        this.f155721d.mo48674x36654fab();
        com.p314xaae8f345.mm.p957x53236a1b.v0 v0Var = new com.p314xaae8f345.mm.p957x53236a1b.v0(str, str2, (java.lang.String) null, 1);
        gm0.j1.d().g(v0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc = this.f155721d;
        activityC11453xa58e34bc.f155019n = db5.e1.Q(activityC11453xa58e34bc, activityC11453xa58e34bc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), this.f155721d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gic), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ob(this, v0Var));
    }

    public boolean e(int i17, int i18, java.lang.String str) {
        java.lang.String str2;
        o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc = this.f155721d;
        ((com.p314xaae8f345.mm.app.o7) wi6).getClass();
        if (com.p314xaae8f345.mm.ui.pc.a(activityC11453xa58e34bc, i17, i18, str, 4)) {
            return true;
        }
        if (i17 == 4) {
            if (i18 != -2023) {
                if (i18 == -140) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155725h)) {
                        x51.i1.e(this.f155721d, str, this.f155725h);
                    }
                    return true;
                }
                if (i18 != -100) {
                    if (i18 == -9) {
                        db5.e1.i(this.f155721d, com.p314xaae8f345.mm.R.C30867xcad56011.f573936gi0, com.p314xaae8f345.mm.R.C30867xcad56011.f573937gi1);
                        return true;
                    }
                    if (i18 != -3) {
                        if (i18 == -1) {
                            if (gm0.j1.d().n() != 5) {
                                return false;
                            }
                            db5.e1.i(this.f155721d, com.p314xaae8f345.mm.R.C30867xcad56011.h7l, com.p314xaae8f345.mm.R.C30867xcad56011.h7k);
                            return true;
                        }
                        switch (i18) {
                            case -34:
                                dp.a.m125853x26a183b(this.f155721d, com.p314xaae8f345.mm.R.C30867xcad56011.ag7, 0).show();
                                return true;
                            case -33:
                                db5.e1.m(this.f155721d, com.p314xaae8f345.mm.R.C30867xcad56011.ahi, com.p314xaae8f345.mm.R.C30867xcad56011.aho, null);
                                return true;
                            case org.p3343x72743996.net.InterfaceC29524x4f65168b.f73894x389a6e4 /* -32 */:
                                db5.e1.m(this.f155721d, com.p314xaae8f345.mm.R.C30867xcad56011.ahk, com.p314xaae8f345.mm.R.C30867xcad56011.aho, null);
                                return true;
                        }
                    }
                    java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "e", null);
                    if ((d17 != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".e.ShowType"), 0) : 0) == 6) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc2 = this.f155721d;
                        activityC11453xa58e34bc2.getClass();
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("password_invalid_float", "view_exp", activityC11453xa58e34bc2.S, 34575);
                        db5.e1.A(this.f155721d, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f573143nr5), "", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.nro), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.c1v), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.DialogInterfaceOnClickListenerC11480x68132d3(), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.account.ui.sa$$b
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(android.content.DialogInterface dialogInterface, int i19) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.sa saVar = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.sa.this;
                                saVar.f155721d.getClass();
                                v61.d.g("login_forget_password_float", 2);
                                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f573938gi2) + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
                                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc3 = saVar.f155721d;
                                android.content.Intent intent = new android.content.Intent();
                                intent.putExtra("rawUrl", str3);
                                intent.putExtra("showShare", false);
                                intent.putExtra("KRightBtn", true);
                                intent.putExtra("show_bottom", false);
                                intent.putExtra("needRedirect", false);
                                intent.putExtra("neverGetA8Key", true);
                                intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
                                intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
                                j45.l.j(activityC11453xa58e34bc3, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
                            }
                        });
                    } else {
                        tm.a b17 = tm.a.b(str);
                        if (b17 != null) {
                            b17.c(this.f155721d, null, null);
                            return true;
                        }
                        db5.e1.i(this.f155721d, com.p314xaae8f345.mm.R.C30867xcad56011.c1t, com.p314xaae8f345.mm.R.C30867xcad56011.f573937gi1);
                    }
                    return true;
                }
            }
            gm0.j1.b();
            gm0.m.o();
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc3 = this.f155721d;
            gm0.j1.b();
            if (android.text.TextUtils.isEmpty(gm0.m.f354768x)) {
                str2 = i65.a.r(this.f155721d, com.p314xaae8f345.mm.R.C30867xcad56011.gqn);
            } else {
                gm0.j1.b();
                str2 = gm0.m.f354768x;
            }
            db5.e1.M(activityC11453xa58e34bc3, str2, this.f155721d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.db(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fb(this));
            return true;
        }
        return false;
    }

    public final void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc = this.f155721d;
        int i17 = activityC11453xa58e34bc.H;
        if (i17 == 6) {
            activityC11453xa58e34bc.f155016h.b();
            this.f155721d.f155027v.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gi9);
            this.f155721d.f155015g.setVisibility(8);
            this.f155721d.f155016h.setVisibility(0);
            this.f155721d.f155016h.m78955xd454f3ba().requestFocus();
            this.f155721d.f155016h.m78963x3d4bc56f(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ib(this));
            this.f155721d.f155027v.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.jb(this));
            return;
        }
        if (i17 == 7) {
            activityC11453xa58e34bc.f155027v.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gi_);
            this.f155721d.f155015g.setVisibility(0);
            this.f155721d.f155012d.requestFocus();
            this.f155721d.f155016h.setVisibility(8);
            this.f155721d.f155027v.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.kb(this));
        }
    }

    public void g(java.lang.String str) {
        h11.e eVar = new h11.e(str, 16, "", 0, "");
        gm0.j1.d().g(eVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc = this.f155721d;
        activityC11453xa58e34bc.f155019n = db5.e1.Q(activityC11453xa58e34bc, activityC11453xa58e34bc.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), this.f155721d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.nb(this, eVar));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileInputIndepPassLoginLogic", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f155721d.f155019n;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f155721d.f155019n = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activity = this.f155721d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.class)).P6();
        int i19 = 0;
        if (m1Var.mo808xfb85f7b0() == 145) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.q3.b(m1Var)) {
                return;
            }
            h11.e eVar = (h11.e) m1Var;
            int M = eVar.M();
            if (M == 13) {
                if (i18 == -36) {
                    tm.a b17 = tm.a.b(str);
                    if (eVar.H() == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileInputIndepPassLoginLogic", "login check state, sms up");
                        if (b17 != null) {
                            b17.c(this.f155721d, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.pb(this), null);
                            return;
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc2 = this.f155721d;
                            db5.e1.u(activityC11453xa58e34bc2, activityC11453xa58e34bc2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ght), "", new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ta(this), null);
                        }
                    } else if (eVar.H() == 3) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileInputIndepPassLoginLogic", "chooseVoicePhoneLanguage() called");
                        android.content.Intent intent = new android.content.Intent();
                        bh5.c cVar = new bh5.c();
                        cVar.f102455a.f102457a = this.f155721d.mo55332x76847179();
                        cVar.d(intent);
                        cVar.e(true);
                        cVar.a("com.tencent.mm.plugin.account.ui.VoicePhoneLanguageTipsUI");
                        cVar.b(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.C11473x550c6956.class);
                        cVar.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.gb(this));
                    } else {
                        if (b17 != null) {
                            b17.c(this.f155721d, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ua(this), null);
                            return;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc3 = this.f155721d;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(this.f155721d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hxd));
                        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.h(this.f155721d.f155031z + this.f155721d.A));
                        db5.e1.u(activityC11453xa58e34bc3, sb6.toString(), this.f155721d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hxe), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.va(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.wa(this));
                    }
                }
                if (i18 == -106) {
                    this.f155721d.f155016h.b();
                    x51.i1.c(this.f155721d, str, 32044);
                    return;
                }
            } else if (M == 16) {
                if (i18 == -41) {
                    this.f155721d.f155016h.b();
                    db5.e1.i(this.f155721d, com.p314xaae8f345.mm.R.C30867xcad56011.hwi, com.p314xaae8f345.mm.R.C30867xcad56011.hwj);
                    return;
                }
                if (i18 == -75) {
                    this.f155721d.f155016h.b();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc4 = this.f155721d;
                    db5.e1.s(activityC11453xa58e34bc4, activityC11453xa58e34bc4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571530hz), "");
                    return;
                } else if (i18 == -106) {
                    this.f155721d.f155016h.b();
                    x51.i1.c(this.f155721d, str, 0);
                    return;
                } else if (eVar.H() == 3) {
                    this.f155721d.f155016h.a();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc5 = this.f155721d;
                    dp.a.m125854x26a183b(activityC11453xa58e34bc5, activityC11453xa58e34bc5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gwb), 0).show();
                }
            } else if (M == 17) {
                if (i17 == 0 && i18 == 0) {
                    new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fa(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.xa(this), eVar.Q(), eVar.P(), this.f155724g).b(this.f155721d);
                    return;
                }
                if (i18 == -4 && !com.p314xaae8f345.mm.ui.bk.A()) {
                    v61.c.a(this.f155721d, this.f155724g);
                    return;
                } else {
                    if (e(i17, i18, str)) {
                        return;
                    }
                    tm.a b18 = tm.a.b(str);
                    if (b18 != null) {
                        b18.c(this.f155721d, null, null);
                    }
                }
            }
        } else if (m1Var.mo808xfb85f7b0() == 252 || m1Var.mo808xfb85f7b0() == 701) {
            com.p314xaae8f345.mm.p957x53236a1b.v0 v0Var = (com.p314xaae8f345.mm.p957x53236a1b.v0) m1Var;
            this.f155725h = v0Var.H();
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 w6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6();
            w6Var.f155822e = v0Var.M();
            w6Var.f155824g = v0Var.K();
            w6Var.f155823f = v0Var.L();
            w6Var.f155825h = v0Var.N();
            w6Var.f155819b = v0Var.f152963h;
            w6Var.f155820c = this.f155721d.f155012d.getText().toString();
            if (i18 == -75) {
                x51.i1.d(this.f155721d);
                return;
            }
            if (i18 == -106) {
                x51.i1.c(this.f155721d, str, 32045);
                return;
            }
            if (i18 == -217) {
                x51.i1.f(this.f155721d, x51.i.a(v0Var), i18);
                return;
            }
            if (i18 == -205) {
                this.f155723f = v0Var.I();
                java.lang.String R = v0Var.R();
                java.lang.String J2 = v0Var.J();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileInputIndepPassLoginLogic", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(this.f155723f), J2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6.f155818i = w6Var;
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("auth_ticket", this.f155723f);
                intent2.putExtra("binded_mobile", R);
                intent2.putExtra("close_safe_device_style", J2);
                intent2.putExtra("from_source", 6);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.C(this.f155721d, intent2);
                return;
            }
            if (i18 == -140) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155725h)) {
                    return;
                }
                x51.i1.e(this.f155721d, str, this.f155725h);
                return;
            }
            if (i17 == 4 && (i18 == -16 || i18 == -17)) {
                gm0.j1.d().g(new c01.ra(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ya(this), null));
                z17 = true;
            } else {
                z17 = false;
            }
            if (i18 == -6 || i18 == -311 || i18 == -310) {
                if (this.f155722e == null) {
                    this.f155722e = bb5.j.a(this.f155721d, com.p314xaae8f345.mm.R.C30867xcad56011.hxl, w6Var.f155825h, w6Var.f155824g, w6Var.f155822e, w6Var.f155823f, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ab(this, w6Var), null, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.bb(this), w6Var);
                    return;
                }
                int length = w6Var.f155824g.length;
                fp.k.c();
                this.f155722e.b(w6Var.f155825h, w6Var.f155824g, w6Var.f155822e, w6Var.f155823f);
                return;
            }
            if (z17 || (i17 == 0 && i18 == 0)) {
                gm0.j1.b();
                gm0.m.E();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileInputIndepPassLoginLogic", "login username %s", w6Var.f155819b);
                x51.i1.a(this.f155721d, w6Var.f155819b);
                java.lang.String a17 = c01.b9.f118602c.a("login_weixin_username", "");
                if (this.f155721d.N) {
                    c01.uc ucVar = c01.uc.f119047c;
                    ucVar.b(this.f155727m, a17);
                    ucVar.g(c01.z1.r(), c01.z1.q());
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14978, 1, 9, ucVar.f(), ucVar.e(), wo.w0.k());
                }
                if (com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A()) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6621xa57cb26b c6621xa57cb26b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6621xa57cb26b();
                    c6621xa57cb26b.f139743d = 2L;
                    c6621xa57cb26b.k();
                }
                x51.i1.b(this.f155721d, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.cb(this), false, 2);
                if (this.f155721d.H == 6) {
                    this.f155726i = v0Var.V();
                    if (v0Var.S()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc6 = this.f155721d;
                        boolean z18 = this.f155726i;
                        activityC11453xa58e34bc6.getClass();
                        android.content.Intent intent3 = new android.content.Intent(activityC11453xa58e34bc6, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11463xc681e6dc.class);
                        intent3.putExtra("kintent_hint", activityC11453xa58e34bc6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.itc));
                        intent3.putExtra("kintent_cancelable", z18);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent3);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(activityC11453xa58e34bc6, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputUI", "goToSetIndepPwd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        activityC11453xa58e34bc6.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(activityC11453xa58e34bc6, "com/tencent/mm/plugin/account/ui/MobileInputUI", "goToSetIndepPwd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc7 = this.f155721d;
                java.lang.String str2 = w6Var.f155819b;
                activityC11453xa58e34bc7.getClass();
                java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry("login_sessionid", activityC11453xa58e34bc7.T), new java.util.AbstractMap.SimpleEntry(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, wo.w0.k()), new java.util.AbstractMap.SimpleEntry("login_method", 1), new java.util.AbstractMap.SimpleEntry(dm.i4.f66875xa013b0d5, str2)};
                java.util.HashMap hashMap = new java.util.HashMap(4);
                for (int i27 = 0; i27 < 4; i27++) {
                    java.util.Map.Entry entry = entryArr[i27];
                    java.lang.Object key = entry.getKey();
                    java.util.Objects.requireNonNull(key);
                    java.lang.Object value = entry.getValue();
                    java.util.Objects.requireNonNull(value);
                    if (hashMap.put(key, value) != null) {
                        throw new java.lang.IllegalArgumentException("duplicate key: " + key);
                    }
                }
                java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(hashMap);
                java.util.HashMap hashMap2 = new java.util.HashMap(unmodifiableMap);
                hashMap2.put("login_page_type", 0);
                if (activityC11453xa58e34bc7.N) {
                    hashMap2.put("login_page_type", 1);
                } else {
                    int i28 = activityC11453xa58e34bc7.G;
                    if (i28 == 1) {
                        hashMap2.put("login_page_type", 4);
                    } else if (i28 == -1) {
                        int i29 = activityC11453xa58e34bc7.H;
                        if (i29 == 6) {
                            hashMap2.put("login_page_type", 5);
                        } else if (i29 == 7) {
                            hashMap2.put("login_page_type", 6);
                        }
                    }
                }
                java.util.HashMap hashMap3 = new java.util.HashMap(unmodifiableMap);
                java.lang.String str3 = activityC11453xa58e34bc7.Q;
                if (str3 != null && str3.length() > 0) {
                    hashMap3.put("is_new_user", 1);
                }
                ((l71.e) ((js.z0) i95.n0.c(js.z0.class))).f398362d = hashMap3;
                int i37 = this.f155721d.H;
                if (i37 == 6) {
                    i19 = 6;
                } else if (i37 == 7) {
                    i19 = 7;
                }
                v61.d.c(2, i19);
                return;
            }
            if (e(i17, i18, str)) {
                return;
            }
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc activityC11453xa58e34bc8 = this.f155721d;
                dp.a.m125854x26a183b(activityC11453xa58e34bc8, activityC11453xa58e34bc8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fbu, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
            }
        }
        tm.a b19 = tm.a.b(str);
        if (b19 == null || (activityC11453xa58e34bc = this.f155721d) == null) {
            return;
        }
        b19.c(activityC11453xa58e34bc, null, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ec
    /* renamed from: start */
    public void mo48691x68ac462() {
        gm0.j1.d().a(252, this);
        gm0.j1.d().a(701, this);
        gm0.j1.d().a(145, this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.sa.class.getName());
        sb6.append(",L200_100,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L200_100"));
        sb6.append(",1");
        n71.a.c(10645, true, sb6.toString());
        n71.a.d("L200_100");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ec
    /* renamed from: stop */
    public void mo48692x360802() {
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        gm0.j1.d().q(145, this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.sa.class.getName());
        sb6.append(",L200_100,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L200_100"));
        sb6.append(",2");
        n71.a.c(10645, false, sb6.toString());
    }
}
