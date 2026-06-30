package com.tencent.mm.plugin.account.ui;

@db5.a(19)
/* loaded from: classes14.dex */
public abstract class BaseLoginVoiceUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int L = 0;
    public x51.f A;
    public android.widget.Button B;
    public boolean D;
    public int E;
    public int F;
    public int G;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f73246d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f73247e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f73248f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f73249g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f73250h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f73251i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f73252m;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f73257r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f73258s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f73259t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f73260u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f73261v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ImageView f73262w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f73263x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f73264y;

    /* renamed from: z, reason: collision with root package name */
    public android.content.SharedPreferences f73265z;

    /* renamed from: n, reason: collision with root package name */
    public android.app.ProgressDialog f73253n = null;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.applet.SecurityImage f73254o = null;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.account.ui.w6 f73255p = new com.tencent.mm.plugin.account.ui.w6();

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f73256q = "";
    public java.lang.String C = "";
    public java.lang.String H = "";
    public final int[] I = new int[5];

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f73245J = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LoginDisasterEvent>(this, com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI.1
        {
            this.__eventId = -1399051904;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.LoginDisasterEvent loginDisasterEvent) {
            am.gj gjVar;
            com.tencent.mm.autogen.events.LoginDisasterEvent loginDisasterEvent2 = loginDisasterEvent;
            if (loginDisasterEvent2 == null || (gjVar = loginDisasterEvent2.f54483g) == null) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", gjVar.f6768a, gjVar.f6769b);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_disaster_content", gjVar.f6768a);
            intent.putExtra("key_disaster_url", gjVar.f6769b);
            intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.account.ui.DisasterUI.class).addFlags(268435456);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };
    public int K = 0;

    public static void T6(com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI, int i17) {
        android.content.Intent intent;
        baseLoginVoiceUI.I[3] = 1;
        if (i17 == 7001) {
            intent = new android.content.Intent(baseLoginVoiceUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.LoginVoiceUI.class);
            intent.putExtra("login_type", 4);
        } else if (i17 != 7013) {
            switch (i17) {
                case 7006:
                    intent = new android.content.Intent(baseLoginVoiceUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.LoginFaceUI.class);
                    intent.putExtra("login_type", 5);
                    break;
                case 7007:
                    intent = new android.content.Intent(baseLoginVoiceUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.LoginPasswordUI.class);
                    intent.putExtra("login_type", 7);
                    break;
                case 7008:
                    intent = new android.content.Intent(baseLoginVoiceUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.LoginSmsUI.class);
                    intent.putExtra("login_type", 8);
                    break;
                default:
                    intent = null;
                    break;
            }
        } else {
            intent = new android.content.Intent(baseLoginVoiceUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.LoginPasswordUI.class);
            intent.putExtra("login_sessionid", baseLoginVoiceUI.H);
            intent.putExtra("login_type", 3);
            intent.putExtra("K_NO_NOT_REPORT_ONCE", true);
            intent.putExtra("LoginAction", 3);
        }
        if (intent != null) {
            intent.putExtra("switch_login_wx_id", baseLoginVoiceUI.f73261v);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(baseLoginVoiceUI, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "jumpToOtherLogin", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            baseLoginVoiceUI.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(baseLoginVoiceUI, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "jumpToOtherLogin", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.account.ui.j0(baseLoginVoiceUI), 300L);
            db5.f.h(baseLoginVoiceUI);
        }
    }

    public static void U6(com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI baseLoginVoiceUI) {
        e7(baseLoginVoiceUI.getContext(), baseLoginVoiceUI.getString(com.tencent.mm.R.string.l8n) + com.tencent.mm.sdk.platformtools.m2.d());
    }

    public static void e7(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        j45.l.j(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }

    public void V6() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (c7() && this.G != 4 && (this.E & 131072) != 0) {
            db5.h4 h4Var = new db5.h4(this, com.tencent.liteav.TXLiteAVCode.WARNING_AUDIO_RECORDING_WRITE_FAIL, 0);
            h4Var.f228376t = com.tencent.mm.R.string.gia;
            arrayList.add(h4Var);
        }
        if (this.G != 2 && (this.E & 262144) != 0) {
            db5.h4 h4Var2 = new db5.h4(this, 7005, 0);
            h4Var2.f228376t = com.tencent.mm.R.string.gi8;
            arrayList.add(h4Var2);
        }
        if (Z6() && this.G != 3) {
            db5.h4 h4Var3 = new db5.h4(this, 7013, 0);
            h4Var3.f228376t = com.tencent.mm.R.string.pah;
            arrayList.add(h4Var3);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f73263x)) {
            if (this.G != 7) {
                db5.h4 h4Var4 = new db5.h4(this, 7007, 0);
                h4Var4.f228368i = getString(com.tencent.mm.R.string.gi9);
                arrayList.add(h4Var4);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f73259t) && this.G != 8) {
                db5.h4 h4Var5 = new db5.h4(this, 7008, 0);
                h4Var5.f228368i = getString(com.tencent.mm.R.string.gi_);
                arrayList.add(h4Var5);
            }
        }
        if (arrayList.size() <= 1) {
            if (arrayList.size() <= 0) {
                this.f73247e.setVisibility(8);
                return;
            }
            this.f73247e.setVisibility(0);
            this.f73247e.setText(((db5.h4) arrayList.get(0)).getTitle());
            this.f73247e.setOnClickListener(new com.tencent.mm.plugin.account.ui.h0(this, arrayList));
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.account.ui.d0(this, arrayList);
        k0Var.f211881s = new com.tencent.mm.plugin.account.ui.e0(this);
        k0Var.f211854d = new com.tencent.mm.plugin.account.ui.f0(this);
        this.f73247e.setVisibility(0);
        this.f73247e.setText(com.tencent.mm.R.string.p2i);
        this.f73247e.setOnClickListener(new com.tencent.mm.plugin.account.ui.g0(this, k0Var));
    }

    public android.graphics.Bitmap W6(android.graphics.Bitmap bitmap) {
        int width = bitmap.getWidth() - 10;
        int height = bitmap.getHeight() - 10;
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        aVar.c(java.lang.Boolean.FALSE);
        aVar.c(null);
        aVar.c(java.lang.Integer.valueOf(height));
        aVar.c(java.lang.Integer.valueOf(width));
        aVar.c(5);
        aVar.c(5);
        aVar.c(bitmap);
        java.lang.Object obj = new java.lang.Object();
        yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", com.tencent.mm.plugin.appbrand.jsapi.media.u5.NAME, "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", com.tencent.mm.plugin.appbrand.jsapi.media.u5.NAME, "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    public void X6() {
        this.f73255p.f74286b = this.f73263x.trim();
    }

    public final void Y6() {
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.b(this);
        b17.addFlags(67108864);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f73261v)) {
            b17.putExtra("can_finish", true);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
        db5.f.k(this);
    }

    public boolean Z6() {
        return this.G != 3 && q61.j.f360261a.a() && q61.j.f360262b && ((is.f) ((js.r0) i95.n0.c(js.r0.class))).Vi(c01.b9.f37069c.a("login_weixin_username", ""));
    }

    public boolean a7(int i17, int i18, java.lang.String str) {
        com.tencent.mm.ui.widget.dialog.j0 j0Var;
        java.lang.String str2;
        if (i17 == 4) {
            if (i18 != -2023) {
                com.tencent.mm.plugin.account.ui.w6 w6Var = this.f73255p;
                if (i18 == -205) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", com.tencent.mm.sdk.platformtools.t8.G1(this.f73257r), this.f73260u);
                    com.tencent.mm.plugin.account.ui.w6.f74285i = w6Var;
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("auth_ticket", this.f73257r);
                    intent.putExtra("binded_mobile", this.f73259t);
                    intent.putExtra("close_safe_device_style", this.f73260u);
                    intent.putExtra("from_source", 2);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.C(this, intent);
                    return true;
                }
                if (i18 == -140) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f73256q)) {
                        x51.i1.e(this, str, this.f73256q);
                    }
                    return true;
                }
                if (i18 != -100) {
                    if (i18 == -75) {
                        x51.i1.d(this);
                        return true;
                    }
                    if (i18 == -72) {
                        db5.e1.i(this, com.tencent.mm.R.string.hxh, com.tencent.mm.R.string.f490573yv);
                        return true;
                    }
                    if (i18 != -9) {
                        if (i18 != -6) {
                            if (i18 == -3) {
                                tm.a b17 = tm.a.b(str);
                                if (b17 != null) {
                                    b17.c(this, null, null);
                                    return true;
                                }
                                if (this.K < 1) {
                                    db5.e1.i(this, com.tencent.mm.R.string.c1t, com.tencent.mm.R.string.f492404gi1);
                                    this.K++;
                                } else {
                                    db5.e1.A(this, getString(com.tencent.mm.R.string.c1u), getString(com.tencent.mm.R.string.f492404gi1), getString(com.tencent.mm.R.string.c1v), getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.account.ui.u(this), new com.tencent.mm.plugin.account.ui.v(this));
                                }
                                return true;
                            }
                            if (i18 != -1) {
                                if (i18 != -311 && i18 != -310) {
                                    if (i18 == -33) {
                                        db5.e1.m(this, com.tencent.mm.R.string.ahi, com.tencent.mm.R.string.aho, new com.tencent.mm.plugin.account.ui.x(this));
                                        return true;
                                    }
                                    if (i18 == -32) {
                                        db5.e1.t(this, getString(com.tencent.mm.R.string.ahk), "", new com.tencent.mm.plugin.account.ui.w(this));
                                        return true;
                                    }
                                }
                            } else if (gm0.j1.d().n() == 5) {
                                db5.e1.i(this, com.tencent.mm.R.string.h7l, com.tencent.mm.R.string.h7k);
                                return true;
                            }
                        }
                        gm0.j1.d().a(701, this);
                        gm0.j1.d().a(252, this);
                        if (this.f73254o == null) {
                            this.f73254o = bb5.j.a(this, com.tencent.mm.R.string.hxl, w6Var.f74292h, w6Var.f74291g, w6Var.f74289e, w6Var.f74290f, new com.tencent.mm.plugin.account.ui.z(this, i17), null, new com.tencent.mm.plugin.account.ui.a0(this), w6Var);
                        } else {
                            java.lang.String str3 = w6Var.f74289e;
                            int length = w6Var.f74291g.length;
                            fp.k.c();
                            this.f73254o.b(w6Var.f74292h, w6Var.f74291g, w6Var.f74289e, w6Var.f74290f);
                        }
                        return true;
                    }
                    db5.e1.i(this, com.tencent.mm.R.string.f492403gi0, com.tencent.mm.R.string.f492404gi1);
                    return true;
                }
            }
            gm0.m.o();
            gm0.j1.b();
            if (android.text.TextUtils.isEmpty(gm0.m.f273235x)) {
                str2 = i65.a.r(this, com.tencent.mm.R.string.gqn);
            } else {
                gm0.j1.b();
                str2 = gm0.m.f273235x;
            }
            db5.e1.M(this, str2, getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.plugin.account.ui.b0(this), new com.tencent.mm.plugin.account.ui.c0(this));
            return true;
        }
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        if (!com.tencent.mm.ui.pc.a(this, i17, i18, str, 4)) {
            return this.A.c(this, new x51.r1(i17, i18, str));
        }
        com.tencent.mm.ui.applet.SecurityImage securityImage = this.f73254o;
        if (securityImage != null && (j0Var = securityImage.f197198n) != null) {
            j0Var.dismiss();
            securityImage.f197198n = null;
        }
        return true;
    }

    public final void b7(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", "requestSms %s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        h11.e eVar = new h11.e(str, 16, "", 0, "");
        gm0.j1.d().g(eVar);
        this.f73253n = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.account.ui.o(this, eVar));
    }

    public boolean c7() {
        return !com.tencent.mm.sdk.platformtools.f9.MeSetSecurityVoicePrint.h();
    }

    public final void d7(com.tencent.mm.modelsimple.v0 v0Var) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", "checktask LoginHistoryUI startLauncher 0x%x, stack: %s", valueOf, new com.tencent.mm.sdk.platformtools.z3());
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.b(this);
        b17.addFlags(67108864);
        if (v0Var != null) {
            b17.putExtra("kstyle_show_bind_mobile_afterauth", v0Var.O());
            b17.putExtra("kstyle_bind_recommend_show", v0Var.P());
            b17.putExtra("kstyle_bind_wording", v0Var.Q());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "startLauncher", "(Lcom/tencent/mm/modelsimple/NetSceneManualAuth;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "startLauncher", "(Lcom/tencent/mm/modelsimple/NetSceneManualAuth;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.plugin.appbrand.widget.input.x4
    public void hideVKB() {
        android.view.View currentFocus;
        android.os.IBinder windowToken;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getSystemService("input_method");
        if (inputMethodManager == null || (currentFocus = getCurrentFocus()) == null || (windowToken = currentFocus.getWindowToken()) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.String a17;
        java.lang.String str;
        java.lang.String stringExtra = getIntent().getStringExtra("switch_login_wx_id");
        this.f73261v = stringExtra;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            c01.b9 b9Var = c01.b9.f37069c;
            this.f73263x = b9Var.a("login_user_name", "");
            b9Var.a("last_login_nick_name", "");
            this.f73264y = b9Var.a("last_avatar_path", "");
            this.F = com.tencent.mm.sdk.platformtools.t8.D1(b9Var.a("last_bind_info", ""), 0);
            a17 = b9Var.a("last_login_alias", "");
            if ((this.F & 1) != 0) {
                this.f73258s = b9Var.a("last_login_bind_qq", "");
            }
            if ((this.F & 4) != 0) {
                this.f73259t = b9Var.a("last_login_bind_mobile", "");
            }
            this.E = com.tencent.mm.sdk.platformtools.t8.D1(b9Var.a("last_login_use_voice", ""), 0);
        } else {
            c01.uc ucVar = c01.uc.f37514c;
            this.f73263x = ucVar.c(this.f73261v, "login_user_name");
            this.f73264y = ucVar.c(this.f73261v, "last_avatar_path");
            this.F = com.tencent.mm.sdk.platformtools.t8.D1(ucVar.c(this.f73261v, "last_bind_info"), 0);
            a17 = ucVar.c(this.f73261v, "last_login_alias");
            if ((this.F & 1) != 0) {
                this.f73258s = ucVar.c(this.f73261v, "last_login_bind_qq");
            }
            if ((this.F & 4) != 0) {
                this.f73259t = ucVar.c(this.f73261v, "last_login_bind_mobile");
            }
            this.E = com.tencent.mm.sdk.platformtools.t8.D1(ucVar.c(this.f73261v, "last_login_use_voice"), 0);
            setBackBtn(new com.tencent.mm.plugin.account.ui.l0(this), com.tencent.mm.R.raw.actionbar_icon_close_black);
        }
        if (this.f73263x.startsWith("wxid")) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f73259t) && !this.f73259t.isEmpty()) {
                this.f73263x = this.f73259t;
            } else if (!a17.isEmpty()) {
                this.f73263x = a17;
            }
        }
        this.f73262w = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f485477ht4);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f73264y)) {
            try {
                kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
                java.lang.String str2 = this.f73264y;
                ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
                android.graphics.Bitmap h17 = com.tencent.mm.modelavatar.z.h(str2, null, false);
                if (h17 != null && h17.getWidth() > 10) {
                    this.f73262w.setImageBitmap(W6(h17));
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LoginHistoryUI", e17, "get avatar error", new java.lang.Object[0]);
            }
        }
        this.f73246d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iod);
        this.f73248f = findViewById(com.tencent.mm.R.id.ipg);
        this.f73247e = (android.widget.Button) findViewById(com.tencent.mm.R.id.iox);
        this.B = (android.widget.Button) findViewById(com.tencent.mm.R.id.iog);
        this.f73249g = (android.widget.Button) findViewById(com.tencent.mm.R.id.f485703ip3);
        this.f73250h = (android.widget.Button) findViewById(com.tencent.mm.R.id.f485705ud3);
        this.f73251i = findViewById(com.tencent.mm.R.id.ugl);
        this.f73252m = (android.widget.Button) findViewById(com.tencent.mm.R.id.ip9);
        com.tencent.mm.ui.dl.i(this.f73249g.getPaint());
        com.tencent.mm.ui.dl.i(this.f73250h.getPaint());
        com.tencent.mm.ui.dl.i(this.f73252m.getPaint());
        this.f73249g.setOnClickListener(new com.tencent.mm.plugin.account.ui.m0(this));
        this.f73250h.setOnClickListener(new com.tencent.mm.plugin.account.ui.n0(this));
        android.view.View view = this.f73248f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f73247e.setVisibility(8);
        com.tencent.mm.ui.dl.i(this.f73247e.getPaint());
        boolean booleanValue = com.tencent.mm.sdk.platformtools.t8.Q0(this.f73263x).booleanValue();
        int[] iArr = this.I;
        if (!booleanValue || this.f73263x.equals(this.f73258s)) {
            iArr[2] = 2;
            this.f73246d.setText(this.f73263x);
        } else {
            iArr[2] = 1;
            android.widget.TextView textView = this.f73246d;
            java.lang.String str3 = this.f73263x;
            com.tencent.mm.sdk.platformtools.c5 c5Var = new com.tencent.mm.sdk.platformtools.c5();
            if (str3.startsWith("+")) {
                str3 = str3.replace("+", "");
                str = com.tencent.mm.sdk.platformtools.c5.c(str3);
                if (str != null) {
                    str3 = str3.substring(str.length());
                }
            } else {
                str = "86";
            }
            textView.setText(c5Var.f(str, str3));
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.account.ui.o0(this);
        k0Var.f211881s = new com.tencent.mm.plugin.account.ui.p0(this);
        k0Var.f211854d = new com.tencent.mm.plugin.account.ui.q0(this);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f73261v)) {
            this.f73252m.setOnClickListener(new com.tencent.mm.plugin.account.ui.k(this, k0Var));
        } else if (com.tencent.mm.sdk.platformtools.m2.m()) {
            this.f73252m.setText(com.tencent.mm.R.string.l8m);
            this.f73252m.setOnClickListener(new com.tencent.mm.plugin.account.ui.m(this));
        } else {
            this.f73252m.setText(com.tencent.mm.R.string.l8j);
            this.f73252m.setOnClickListener(new com.tencent.mm.plugin.account.ui.l(this));
        }
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.a07));
        hideActionbarLine();
        setBackBtnVisible(false);
        if (com.tencent.mm.sdk.platformtools.a0.f192447j) {
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            com.tencent.mm.ui.vb.j(this, null);
        }
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (com.tencent.mm.ui.bk.A() || com.tencent.mm.ui.bk.Q()) {
            v61.g0 g0Var = v61.h0.f433441a;
            v61.h0.a(this.B, this);
            if (com.tencent.mm.ui.bk.A() && !com.tencent.mm.ui.bk.Q()) {
                this.B.setText(getResources().getString(com.tencent.mm.R.string.f492407gi4));
            } else if (com.tencent.mm.ui.bk.Q()) {
                this.B.setText(getResources().getString(com.tencent.mm.R.string.fe_));
            } else {
                this.B.setText(getResources().getString(com.tencent.mm.R.string.gh_));
            }
            this.B.setOnClickListener(new com.tencent.mm.plugin.account.ui.n(this));
        }
        if (com.tencent.mm.sdk.platformtools.f9.LoginPasswordReset.h()) {
            this.f73249g.setVisibility(8);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.os.Bundle bundleExtra;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1024 && intent != null) {
            if (i18 == -1) {
                java.lang.String stringExtra = intent.getStringExtra("VoiceLoginAuthPwd");
                intent.getIntExtra("KVoiceHelpCode", 0);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    stringExtra.getClass();
                }
                this.C = stringExtra;
                X6();
                return;
            }
            return;
        }
        if (i17 != 1025 || intent == null) {
            if (i17 == 31685 && intent != null && i18 == -1 && (bundleExtra = intent.getBundleExtra("result_data")) != null && bundleExtra.getString("go_next", "").equals("auth_again")) {
                X6();
                return;
            }
            return;
        }
        if (i18 == 2) {
            java.lang.String stringExtra2 = intent.getStringExtra("KFaceLoginAuthPwd");
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2));
            objArr[1] = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2) ? 0 : stringExtra2.length());
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", "hy: onActivityResult, do faceprint auth, authPwd is null:%b, authPwd.len:%d", objArr);
            this.C = stringExtra2;
            X6();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", "AccountSyncApplication.modelCallback %s", ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi());
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        com.tencent.mm.ui.vb.e();
        this.f73265z = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0);
        initView();
        this.A = new x51.f();
        java.lang.String stringExtra = getIntent().getStringExtra("login_sessionid");
        if (stringExtra != null) {
            this.H = stringExtra;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", "onDestroy");
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        x51.f fVar = this.A;
        if (fVar != null) {
            fVar.a();
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        int[] iArr = this.I;
        g0Var.d(14262, java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]), java.lang.Integer.valueOf(iArr[2]), java.lang.Integer.valueOf(iArr[3]), java.lang.Integer.valueOf(iArr[4]));
        android.app.ProgressDialog progressDialog = this.f73253n;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f73253n = null;
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            Y6();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f73245J.dead();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        V6();
        this.f73245J.alive();
        gm0.j1.b();
        gm0.j1.i();
        gm0.j1.b().f273255r = "";
        gm0.j1.i();
        ((java.util.HashMap) gm0.j1.b().f273256s).clear();
        if (gm0.j1.a() && gm0.j1.b().f273254q && !this.f73263x.equals("")) {
            android.app.ProgressDialog progressDialog = this.f73253n;
            if (progressDialog == null || !progressDialog.isShowing()) {
                d7(null);
                return;
            }
            return;
        }
        if (gq.a.a() == 2) {
            com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
            aVar.f211709a = of5.b.a(this).getString(com.tencent.mm.R.string.f490897b72);
            aVar.f211729s = getString(com.tencent.mm.R.string.f490896b71);
            aVar.A = false;
            aVar.f211732v = of5.b.a(this).getString(com.tencent.mm.R.string.f490895b70);
            aVar.E = new com.tencent.mm.plugin.account.ui.k0(this);
            com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(this, com.tencent.mm.R.style.f494791wd);
            j0Var.e(aVar);
            com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
            if (d0Var != null) {
                d0Var.a(j0Var.f211837r);
            }
            j0Var.show();
            android.preference.PreferenceManager.getDefaultSharedPreferences(this).edit().putLong("db_check_tip_time", java.lang.System.currentTimeMillis()).commit();
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Scene Type ");
        sb6.append(m1Var.getType());
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", sb6.toString());
        boolean z17 = true;
        if (m1Var.getType() == 145) {
            if (com.tencent.mm.plugin.account.ui.q3.b(m1Var)) {
                return;
            }
            android.app.ProgressDialog progressDialog = this.f73253n;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f73253n.dismiss();
                this.f73253n = null;
            }
            h11.e eVar = (h11.e) m1Var;
            int M = eVar.M();
            if (M == 13) {
                if (i18 == -36) {
                    tm.a b17 = tm.a.b(str);
                    if (eVar.H() == 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", "login check state, sms up");
                        if (b17 != null) {
                            b17.c(this, new com.tencent.mm.plugin.account.ui.p(this), null);
                            return;
                        }
                        db5.e1.u(this, getString(com.tencent.mm.R.string.ght), "", new com.tencent.mm.plugin.account.ui.q(this), null);
                    } else {
                        if (b17 != null) {
                            b17.c(this, new com.tencent.mm.plugin.account.ui.r(this), null);
                            return;
                        }
                        b7(this.f73259t);
                    }
                }
            } else if (M == 16) {
                if (i18 == -41) {
                    db5.e1.i(this, com.tencent.mm.R.string.hwi, com.tencent.mm.R.string.hwj);
                    return;
                } else if (i18 == -75) {
                    db5.e1.s(this, getString(com.tencent.mm.R.string.f489997hz), "");
                    return;
                } else if (i18 == -106) {
                    x51.i1.c(this, str, 32045);
                    return;
                }
            } else if (M == 17) {
                if (i17 == 0 && i18 == 0) {
                    new com.tencent.mm.plugin.account.ui.fa(new com.tencent.mm.plugin.account.ui.s(this), eVar.Q(), eVar.P(), this.f73259t).b(this);
                    return;
                } else {
                    if (a7(i17, i18, str)) {
                        return;
                    }
                    tm.a b18 = tm.a.b(str);
                    if (b18 != null) {
                        b18.c(this, null, null);
                    }
                }
            }
        } else if (m1Var.getType() == 252 || m1Var.getType() == 701) {
            com.tencent.mm.modelsimple.v0 v0Var = (com.tencent.mm.modelsimple.v0) m1Var;
            this.f73256q = v0Var.H();
            com.tencent.mars.xlog.Log.e("MicroMsg.LoginHistoryUI", "url " + this.f73256q);
            gm0.j1.d().q(701, this);
            gm0.j1.d().q(252, this);
            int N = v0Var.N();
            com.tencent.mm.plugin.account.ui.w6 w6Var = this.f73255p;
            w6Var.f74292h = N;
            w6Var.f74289e = v0Var.M();
            w6Var.f74291g = v0Var.K();
            w6Var.f74290f = v0Var.L();
            if (i18 == -205) {
                this.f73257r = v0Var.I();
                this.f73259t = v0Var.R();
                this.f73260u = v0Var.J();
            }
            if (i17 == 4 && (i18 == -16 || i18 == -17)) {
                gm0.j1.d().g(new c01.ra(new com.tencent.mm.plugin.account.ui.t(this), null));
            } else {
                z17 = false;
            }
            if (z17 || (i17 == 0 && i18 == 0)) {
                gm0.m.E();
                x51.i1.a(this, w6Var.f74286b);
                android.app.ProgressDialog progressDialog2 = this.f73253n;
                if (progressDialog2 != null && progressDialog2.isShowing()) {
                    this.f73253n.setMessage(getString(com.tencent.mm.R.string.f490468vx));
                }
                d7(v0Var);
                if (com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A()) {
                    com.tencent.mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct foldingPhoneLoginTypeStruct = new com.tencent.mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct();
                    foldingPhoneLoginTypeStruct.f58210d = 2L;
                    foldingPhoneLoginTypeStruct.k();
                }
                if (this.G == 8) {
                    this.D = v0Var.V();
                    if (v0Var.S()) {
                        boolean z18 = this.D;
                        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI.class);
                        intent.putExtra("kintent_hint", getString(com.tencent.mm.R.string.itc));
                        intent.putExtra("kintent_cancelable", z18);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "goToSetIndepPwd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "goToSetIndepPwd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    }
                    return;
                }
                return;
            }
            android.app.ProgressDialog progressDialog3 = this.f73253n;
            if (progressDialog3 != null && progressDialog3.isShowing()) {
                this.f73253n.dismiss();
                this.f73253n = null;
            }
            if (i18 == -106) {
                x51.i1.c(this, str, 31685);
                return;
            }
            if (i18 == -217) {
                x51.i1.f(this, x51.i.a(v0Var), i18);
                return;
            } else {
                if (a7(i17, i18, str)) {
                    return;
                }
                tm.a b19 = tm.a.b(str);
                if (b19 != null && b19.c(this, null, null)) {
                    return;
                } else {
                    android.widget.Toast.makeText(this, getString(com.tencent.mm.R.string.fbu, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
                }
            }
        }
        a7(i17, i18, str);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, android.app.Activity
    public void setRequestedOrientation(int i17) {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(j71.a.class);
    }
}
