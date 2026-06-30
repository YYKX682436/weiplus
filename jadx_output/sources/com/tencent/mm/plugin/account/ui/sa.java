package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class sa implements com.tencent.mm.plugin.account.ui.ec, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.account.ui.MobileInputUI f74188d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f74190f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f74191g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f74192h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f74194m;

    /* renamed from: n, reason: collision with root package name */
    public final d71.d f74195n;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.applet.SecurityImage f74189e = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f74193i = true;

    public sa(d71.d dVar) {
        this.f74195n = dVar;
    }

    @Override // com.tencent.mm.plugin.account.ui.ec
    public void a(com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI) {
        this.f74188d = mobileInputUI;
        mobileInputUI.f73493u.setVisibility(0);
        java.lang.String stringExtra = mobileInputUI.getIntent().getStringExtra("binded_mobile");
        this.f74191g = stringExtra;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.f74191g = com.tencent.mm.sdk.platformtools.c5.h(mobileInputUI.f73498z + mobileInputUI.A);
        }
        mobileInputUI.f73481f.setTextColor(mobileInputUI.getResources().getColor(com.tencent.mm.R.color.f479232tk));
        mobileInputUI.f73481f.setEnabled(false);
        mobileInputUI.f73481f.setFocusable(false);
        mobileInputUI.f73480e.setFocusable(false);
        d71.d dVar = this.f74195n;
        if (dVar != null) {
            mobileInputUI.f73480e.setText(mobileInputUI.f73498z + " " + dVar.a(mobileInputUI.A, mobileInputUI.D));
        } else {
            mobileInputUI.f73480e.setText(com.tencent.mm.sdk.platformtools.c5.h(this.f74191g));
        }
        mobileInputUI.f73480e.setVisibility(0);
        f();
        mobileInputUI.f73494v.setVisibility(0);
        mobileInputUI.f73490r.setText(com.tencent.mm.R.string.gi7);
        mobileInputUI.f73490r.setVisibility(0);
        mobileInputUI.f73490r.setEnabled(true);
        this.f74194m = c01.b9.f37069c.a("login_weixin_username", "");
        java.lang.String stringExtra2 = mobileInputUI.getIntent().getStringExtra("auth_ticket");
        this.f74190f = stringExtra2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            return;
        }
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.account.ui.eb(this), 500L);
    }

    @Override // com.tencent.mm.plugin.account.ui.ec
    public void b(com.tencent.mm.plugin.account.ui.dc dcVar) {
        com.tencent.mm.plugin.account.ui.MobileInputUI activity = this.f74188d;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.account.ui.k3) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.account.ui.k3.class)).U6();
        int ordinal = dcVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 3) {
                return;
            }
            android.content.Intent intent = new android.content.Intent(this.f74188d, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MMLoginVerifyPwdUI.class);
            intent.putExtra("binded_mobile", this.f74191g);
            intent.putExtra("extspam_ctx_string", this.f74188d.P);
            com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = this.f74188d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mobileInputUI, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputSmsPwdLoginLogic", "goToVerifyPwd", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mobileInputUI.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(mobileInputUI, "com/tencent/mm/plugin/account/ui/MobileInputSmsPwdLoginLogic", "goToVerifyPwd", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MobileInputIndepPassLoginLogic", "goNext");
        this.f74188d.hideVKB();
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI2 = this.f74188d;
        mobileInputUI2.f73498z = com.tencent.mm.sdk.platformtools.c5.a(mobileInputUI2.D);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f74188d.f73498z) || com.tencent.mm.sdk.platformtools.t8.K0(this.f74188d.A)) {
            return;
        }
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI3 = this.f74188d;
        int i17 = mobileInputUI3.H;
        if (i17 == 7) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                d(this.f74191g, this.f74188d.f73479d.getText().toString());
                return;
            } else {
                d(this.f74191g, null);
                return;
            }
        }
        if (i17 == 6) {
            java.lang.String trim = mobileInputUI3.f73483h.getText().toString().trim();
            if (com.tencent.mm.sdk.platformtools.t8.K0(trim)) {
                db5.e1.i(this.f74188d, com.tencent.mm.R.string.k6c, com.tencent.mm.R.string.f492404gi1);
                return;
            }
            this.f74188d.hideVKB();
            h11.e eVar = new h11.e(this.f74191g, 17, trim, 0, "");
            gm0.j1.d().g(eVar);
            com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI4 = this.f74188d;
            mobileInputUI4.f73486n = db5.e1.Q(mobileInputUI4, mobileInputUI4.getString(com.tencent.mm.R.string.f490573yv), this.f74188d.getString(com.tencent.mm.R.string.ahe), true, true, new com.tencent.mm.plugin.account.ui.mb(this, eVar));
        }
    }

    public void c(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        h11.e eVar = new h11.e(str, 13, "", 0, "");
        gm0.j1.d().g(eVar);
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = this.f74188d;
        mobileInputUI.f73486n = db5.e1.Q(mobileInputUI, mobileInputUI.getString(com.tencent.mm.R.string.f490573yv), this.f74188d.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.account.ui.lb(this, eVar));
    }

    public final void d(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            db5.e1.i(this.f74188d, com.tencent.mm.R.string.k6d, com.tencent.mm.R.string.f492404gi1);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            db5.e1.i(this.f74188d, com.tencent.mm.R.string.k67, com.tencent.mm.R.string.f492404gi1);
            return;
        }
        this.f74188d.f73479d.setText(str2);
        this.f74188d.hideVKB();
        com.tencent.mm.modelsimple.v0 v0Var = new com.tencent.mm.modelsimple.v0(str, str2, (java.lang.String) null, 1);
        gm0.j1.d().g(v0Var);
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = this.f74188d;
        mobileInputUI.f73486n = db5.e1.Q(mobileInputUI, mobileInputUI.getString(com.tencent.mm.R.string.f490573yv), this.f74188d.getString(com.tencent.mm.R.string.gic), true, true, new com.tencent.mm.plugin.account.ui.ob(this, v0Var));
    }

    public boolean e(int i17, int i18, java.lang.String str) {
        java.lang.String str2;
        o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = this.f74188d;
        ((com.tencent.mm.app.o7) wi6).getClass();
        if (com.tencent.mm.ui.pc.a(mobileInputUI, i17, i18, str, 4)) {
            return true;
        }
        if (i17 == 4) {
            if (i18 != -2023) {
                if (i18 == -140) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f74192h)) {
                        x51.i1.e(this.f74188d, str, this.f74192h);
                    }
                    return true;
                }
                if (i18 != -100) {
                    if (i18 == -9) {
                        db5.e1.i(this.f74188d, com.tencent.mm.R.string.f492403gi0, com.tencent.mm.R.string.f492404gi1);
                        return true;
                    }
                    if (i18 != -3) {
                        if (i18 == -1) {
                            if (gm0.j1.d().n() != 5) {
                                return false;
                            }
                            db5.e1.i(this.f74188d, com.tencent.mm.R.string.h7l, com.tencent.mm.R.string.h7k);
                            return true;
                        }
                        switch (i18) {
                            case -34:
                                dp.a.makeText(this.f74188d, com.tencent.mm.R.string.ag7, 0).show();
                                return true;
                            case -33:
                                db5.e1.m(this.f74188d, com.tencent.mm.R.string.ahi, com.tencent.mm.R.string.aho, null);
                                return true;
                            case org.chromium.net.NetError.ERR_BLOCKED_BY_ORB /* -32 */:
                                db5.e1.m(this.f74188d, com.tencent.mm.R.string.ahk, com.tencent.mm.R.string.aho, null);
                                return true;
                        }
                    }
                    java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "e", null);
                    if ((d17 != null ? com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".e.ShowType"), 0) : 0) == 6) {
                        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI2 = this.f74188d;
                        mobileInputUI2.getClass();
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("password_invalid_float", "view_exp", mobileInputUI2.S, 34575);
                        db5.e1.A(this.f74188d, com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f491610nr5), "", com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.nro), com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.c1v), new com.tencent.mm.plugin.account.ui.sa$$a(), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.account.ui.sa$$b
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(android.content.DialogInterface dialogInterface, int i19) {
                                com.tencent.mm.plugin.account.ui.sa saVar = com.tencent.mm.plugin.account.ui.sa.this;
                                saVar.f74188d.getClass();
                                v61.d.g("login_forget_password_float", 2);
                                java.lang.String str3 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f492405gi2) + com.tencent.mm.sdk.platformtools.m2.d();
                                com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI3 = saVar.f74188d;
                                android.content.Intent intent = new android.content.Intent();
                                intent.putExtra("rawUrl", str3);
                                intent.putExtra("showShare", false);
                                intent.putExtra("KRightBtn", true);
                                intent.putExtra("show_bottom", false);
                                intent.putExtra("needRedirect", false);
                                intent.putExtra("neverGetA8Key", true);
                                intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
                                intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
                                j45.l.j(mobileInputUI3, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
                            }
                        });
                    } else {
                        tm.a b17 = tm.a.b(str);
                        if (b17 != null) {
                            b17.c(this.f74188d, null, null);
                            return true;
                        }
                        db5.e1.i(this.f74188d, com.tencent.mm.R.string.c1t, com.tencent.mm.R.string.f492404gi1);
                    }
                    return true;
                }
            }
            gm0.j1.b();
            gm0.m.o();
            com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI3 = this.f74188d;
            gm0.j1.b();
            if (android.text.TextUtils.isEmpty(gm0.m.f273235x)) {
                str2 = i65.a.r(this.f74188d, com.tencent.mm.R.string.gqn);
            } else {
                gm0.j1.b();
                str2 = gm0.m.f273235x;
            }
            db5.e1.M(mobileInputUI3, str2, this.f74188d.getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.plugin.account.ui.db(this), new com.tencent.mm.plugin.account.ui.fb(this));
            return true;
        }
        return false;
    }

    public final void f() {
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = this.f74188d;
        int i17 = mobileInputUI.H;
        if (i17 == 6) {
            mobileInputUI.f73483h.b();
            this.f74188d.f73494v.setText(com.tencent.mm.R.string.gi9);
            this.f74188d.f73482g.setVisibility(8);
            this.f74188d.f73483h.setVisibility(0);
            this.f74188d.f73483h.getContentEditText().requestFocus();
            this.f74188d.f73483h.setSendSmsBtnClickListener(new com.tencent.mm.plugin.account.ui.ib(this));
            this.f74188d.f73494v.setOnClickListener(new com.tencent.mm.plugin.account.ui.jb(this));
            return;
        }
        if (i17 == 7) {
            mobileInputUI.f73494v.setText(com.tencent.mm.R.string.gi_);
            this.f74188d.f73482g.setVisibility(0);
            this.f74188d.f73479d.requestFocus();
            this.f74188d.f73483h.setVisibility(8);
            this.f74188d.f73494v.setOnClickListener(new com.tencent.mm.plugin.account.ui.kb(this));
        }
    }

    public void g(java.lang.String str) {
        h11.e eVar = new h11.e(str, 16, "", 0, "");
        gm0.j1.d().g(eVar);
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = this.f74188d;
        mobileInputUI.f73486n = db5.e1.Q(mobileInputUI, mobileInputUI.getString(com.tencent.mm.R.string.f490573yv), this.f74188d.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.account.ui.nb(this, eVar));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI;
        com.tencent.mars.xlog.Log.i("MicroMsg.MobileInputIndepPassLoginLogic", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f74188d.f73486n;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f74188d.f73486n = null;
        }
        com.tencent.mm.plugin.account.ui.MobileInputUI activity = this.f74188d;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.account.ui.k3) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.account.ui.k3.class)).P6();
        int i19 = 0;
        if (m1Var.getType() == 145) {
            if (com.tencent.mm.plugin.account.ui.q3.b(m1Var)) {
                return;
            }
            h11.e eVar = (h11.e) m1Var;
            int M = eVar.M();
            if (M == 13) {
                if (i18 == -36) {
                    tm.a b17 = tm.a.b(str);
                    if (eVar.H() == 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MobileInputIndepPassLoginLogic", "login check state, sms up");
                        if (b17 != null) {
                            b17.c(this.f74188d, new com.tencent.mm.plugin.account.ui.pb(this), null);
                            return;
                        } else {
                            com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI2 = this.f74188d;
                            db5.e1.u(mobileInputUI2, mobileInputUI2.getString(com.tencent.mm.R.string.ght), "", new com.tencent.mm.plugin.account.ui.ta(this), null);
                        }
                    } else if (eVar.H() == 3) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MobileInputIndepPassLoginLogic", "chooseVoicePhoneLanguage() called");
                        android.content.Intent intent = new android.content.Intent();
                        bh5.c cVar = new bh5.c();
                        cVar.f20922a.f20924a = this.f74188d.getContext();
                        cVar.d(intent);
                        cVar.e(true);
                        cVar.a("com.tencent.mm.plugin.account.ui.VoicePhoneLanguageTipsUI");
                        cVar.b(com.tencent.mm.plugin.account.ui.VoiceCodeHalfScreenDialogFragment.class);
                        cVar.i(new com.tencent.mm.plugin.account.ui.gb(this));
                    } else {
                        if (b17 != null) {
                            b17.c(this.f74188d, new com.tencent.mm.plugin.account.ui.ua(this), null);
                            return;
                        }
                        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI3 = this.f74188d;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(this.f74188d.getString(com.tencent.mm.R.string.hxd));
                        sb6.append(com.tencent.mm.sdk.platformtools.c5.h(this.f74188d.f73498z + this.f74188d.A));
                        db5.e1.u(mobileInputUI3, sb6.toString(), this.f74188d.getString(com.tencent.mm.R.string.hxe), new com.tencent.mm.plugin.account.ui.va(this), new com.tencent.mm.plugin.account.ui.wa(this));
                    }
                }
                if (i18 == -106) {
                    this.f74188d.f73483h.b();
                    x51.i1.c(this.f74188d, str, 32044);
                    return;
                }
            } else if (M == 16) {
                if (i18 == -41) {
                    this.f74188d.f73483h.b();
                    db5.e1.i(this.f74188d, com.tencent.mm.R.string.hwi, com.tencent.mm.R.string.hwj);
                    return;
                }
                if (i18 == -75) {
                    this.f74188d.f73483h.b();
                    com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI4 = this.f74188d;
                    db5.e1.s(mobileInputUI4, mobileInputUI4.getString(com.tencent.mm.R.string.f489997hz), "");
                    return;
                } else if (i18 == -106) {
                    this.f74188d.f73483h.b();
                    x51.i1.c(this.f74188d, str, 0);
                    return;
                } else if (eVar.H() == 3) {
                    this.f74188d.f73483h.a();
                    com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI5 = this.f74188d;
                    dp.a.makeText(mobileInputUI5, mobileInputUI5.getString(com.tencent.mm.R.string.gwb), 0).show();
                }
            } else if (M == 17) {
                if (i17 == 0 && i18 == 0) {
                    new com.tencent.mm.plugin.account.ui.fa(new com.tencent.mm.plugin.account.ui.xa(this), eVar.Q(), eVar.P(), this.f74191g).b(this.f74188d);
                    return;
                }
                if (i18 == -4 && !com.tencent.mm.ui.bk.A()) {
                    v61.c.a(this.f74188d, this.f74191g);
                    return;
                } else {
                    if (e(i17, i18, str)) {
                        return;
                    }
                    tm.a b18 = tm.a.b(str);
                    if (b18 != null) {
                        b18.c(this.f74188d, null, null);
                    }
                }
            }
        } else if (m1Var.getType() == 252 || m1Var.getType() == 701) {
            com.tencent.mm.modelsimple.v0 v0Var = (com.tencent.mm.modelsimple.v0) m1Var;
            this.f74192h = v0Var.H();
            com.tencent.mm.plugin.account.ui.w6 w6Var = new com.tencent.mm.plugin.account.ui.w6();
            w6Var.f74289e = v0Var.M();
            w6Var.f74291g = v0Var.K();
            w6Var.f74290f = v0Var.L();
            w6Var.f74292h = v0Var.N();
            w6Var.f74286b = v0Var.f71430h;
            w6Var.f74287c = this.f74188d.f73479d.getText().toString();
            if (i18 == -75) {
                x51.i1.d(this.f74188d);
                return;
            }
            if (i18 == -106) {
                x51.i1.c(this.f74188d, str, 32045);
                return;
            }
            if (i18 == -217) {
                x51.i1.f(this.f74188d, x51.i.a(v0Var), i18);
                return;
            }
            if (i18 == -205) {
                this.f74190f = v0Var.I();
                java.lang.String R = v0Var.R();
                java.lang.String J2 = v0Var.J();
                com.tencent.mars.xlog.Log.i("MicroMsg.MobileInputIndepPassLoginLogic", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", com.tencent.mm.sdk.platformtools.t8.G1(this.f74190f), J2);
                com.tencent.mm.plugin.account.ui.w6.f74285i = w6Var;
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("auth_ticket", this.f74190f);
                intent2.putExtra("binded_mobile", R);
                intent2.putExtra("close_safe_device_style", J2);
                intent2.putExtra("from_source", 6);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.C(this.f74188d, intent2);
                return;
            }
            if (i18 == -140) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f74192h)) {
                    return;
                }
                x51.i1.e(this.f74188d, str, this.f74192h);
                return;
            }
            if (i17 == 4 && (i18 == -16 || i18 == -17)) {
                gm0.j1.d().g(new c01.ra(new com.tencent.mm.plugin.account.ui.ya(this), null));
                z17 = true;
            } else {
                z17 = false;
            }
            if (i18 == -6 || i18 == -311 || i18 == -310) {
                if (this.f74189e == null) {
                    this.f74189e = bb5.j.a(this.f74188d, com.tencent.mm.R.string.hxl, w6Var.f74292h, w6Var.f74291g, w6Var.f74289e, w6Var.f74290f, new com.tencent.mm.plugin.account.ui.ab(this, w6Var), null, new com.tencent.mm.plugin.account.ui.bb(this), w6Var);
                    return;
                }
                int length = w6Var.f74291g.length;
                fp.k.c();
                this.f74189e.b(w6Var.f74292h, w6Var.f74291g, w6Var.f74289e, w6Var.f74290f);
                return;
            }
            if (z17 || (i17 == 0 && i18 == 0)) {
                gm0.j1.b();
                gm0.m.E();
                com.tencent.mars.xlog.Log.i("MicroMsg.MobileInputIndepPassLoginLogic", "login username %s", w6Var.f74286b);
                x51.i1.a(this.f74188d, w6Var.f74286b);
                java.lang.String a17 = c01.b9.f37069c.a("login_weixin_username", "");
                if (this.f74188d.N) {
                    c01.uc ucVar = c01.uc.f37514c;
                    ucVar.b(this.f74194m, a17);
                    ucVar.g(c01.z1.r(), c01.z1.q());
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14978, 1, 9, ucVar.f(), ucVar.e(), wo.w0.k());
                }
                if (com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A()) {
                    com.tencent.mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct foldingPhoneLoginTypeStruct = new com.tencent.mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct();
                    foldingPhoneLoginTypeStruct.f58210d = 2L;
                    foldingPhoneLoginTypeStruct.k();
                }
                x51.i1.b(this.f74188d, new com.tencent.mm.plugin.account.ui.cb(this), false, 2);
                if (this.f74188d.H == 6) {
                    this.f74193i = v0Var.V();
                    if (v0Var.S()) {
                        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI6 = this.f74188d;
                        boolean z18 = this.f74193i;
                        mobileInputUI6.getClass();
                        android.content.Intent intent3 = new android.content.Intent(mobileInputUI6, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI.class);
                        intent3.putExtra("kintent_hint", mobileInputUI6.getString(com.tencent.mm.R.string.itc));
                        intent3.putExtra("kintent_cancelable", z18);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent3);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(mobileInputUI6, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MobileInputUI", "goToSetIndepPwd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        mobileInputUI6.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(mobileInputUI6, "com/tencent/mm/plugin/account/ui/MobileInputUI", "goToSetIndepPwd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }
                com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI7 = this.f74188d;
                java.lang.String str2 = w6Var.f74286b;
                mobileInputUI7.getClass();
                java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry("login_sessionid", mobileInputUI7.T), new java.util.AbstractMap.SimpleEntry(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, wo.w0.k()), new java.util.AbstractMap.SimpleEntry("login_method", 1), new java.util.AbstractMap.SimpleEntry(dm.i4.COL_USERNAME, str2)};
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
                if (mobileInputUI7.N) {
                    hashMap2.put("login_page_type", 1);
                } else {
                    int i28 = mobileInputUI7.G;
                    if (i28 == 1) {
                        hashMap2.put("login_page_type", 4);
                    } else if (i28 == -1) {
                        int i29 = mobileInputUI7.H;
                        if (i29 == 6) {
                            hashMap2.put("login_page_type", 5);
                        } else if (i29 == 7) {
                            hashMap2.put("login_page_type", 6);
                        }
                    }
                }
                java.util.HashMap hashMap3 = new java.util.HashMap(unmodifiableMap);
                java.lang.String str3 = mobileInputUI7.Q;
                if (str3 != null && str3.length() > 0) {
                    hashMap3.put("is_new_user", 1);
                }
                ((l71.e) ((js.z0) i95.n0.c(js.z0.class))).f316829d = hashMap3;
                int i37 = this.f74188d.H;
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
                com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI8 = this.f74188d;
                dp.a.makeText(mobileInputUI8, mobileInputUI8.getString(com.tencent.mm.R.string.fbu, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
            }
        }
        tm.a b19 = tm.a.b(str);
        if (b19 == null || (mobileInputUI = this.f74188d) == null) {
            return;
        }
        b19.c(mobileInputUI, null, null);
    }

    @Override // com.tencent.mm.plugin.account.ui.ec
    public void start() {
        gm0.j1.d().a(252, this);
        gm0.j1.d().a(701, this);
        gm0.j1.d().a(145, this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.tencent.mm.plugin.account.ui.sa.class.getName());
        sb6.append(",L200_100,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L200_100"));
        sb6.append(",1");
        n71.a.c(10645, true, sb6.toString());
        n71.a.d("L200_100");
    }

    @Override // com.tencent.mm.plugin.account.ui.ec
    public void stop() {
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        gm0.j1.d().q(145, this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.tencent.mm.plugin.account.ui.sa.class.getName());
        sb6.append(",L200_100,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L200_100"));
        sb6.append(",2");
        n71.a.c(10645, false, sb6.toString());
    }
}
