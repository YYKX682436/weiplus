package com.tencent.mm.plugin.account.ui;

@db5.a(147)
/* loaded from: classes14.dex */
public class LoginHistoryUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f73323y0 = 0;
    public java.lang.String A;
    public android.widget.ImageView B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public android.content.SharedPreferences G;
    public x51.f H;
    public android.widget.LinearLayout I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.LinearLayout f73324J;
    public android.widget.LinearLayout K;
    public com.tencent.mm.ui.base.MMFormInputView L;
    public com.tencent.mm.ui.base.MMFormVerifyCodeInputView M;
    public android.widget.Button N;
    public boolean Q;
    public int R;
    public int S;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f73325d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f73326e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.account.sdk.view.ProgressButton f73327f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f73328g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f73329h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f73330i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f73331m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f73332n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f73333o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f73334p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f73336q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.Button f73337r;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f73342w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f73343x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f73345y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f73346z;

    /* renamed from: s, reason: collision with root package name */
    public android.app.ProgressDialog f73338s = null;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.applet.SecurityImage f73339t = null;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.account.ui.w6 f73340u = new com.tencent.mm.plugin.account.ui.w6();

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f73341v = "";
    public java.lang.String P = "";
    public int T = -1;
    public boolean U = false;
    public final java.util.List V = new java.util.ArrayList();
    public final java.util.Map W = new java.util.HashMap();
    public final java.lang.String X = "";
    public boolean Y = false;
    public final int[] Z = new int[5];

    /* renamed from: p0, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f73335p0 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LoginDisasterEvent>(this, com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.account.ui.LoginHistoryUI.1
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
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    /* renamed from: x0, reason: collision with root package name */
    public int f73344x0 = 0;

    public static void T6(com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI) {
        k7(loginHistoryUI.getContext(), loginHistoryUI.getString(com.tencent.mm.R.string.l8n) + com.tencent.mm.sdk.platformtools.m2.d());
    }

    public static void U6(com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI, java.lang.String str) {
        loginHistoryUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", "requestSms %s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        h11.e eVar = new h11.e(str, 16, "", 0, "");
        gm0.j1.d().g(eVar);
        loginHistoryUI.f73338s = db5.e1.Q(loginHistoryUI, loginHistoryUI.getString(com.tencent.mm.R.string.f490573yv), loginHistoryUI.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.account.ui.n4(loginHistoryUI, eVar));
    }

    public static void k7(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("KRightBtn", true);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        j45.l.n(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, 327);
    }

    public void V6() {
        gm0.j1.d().a(701, this);
        gm0.j1.d().a(252, this);
    }

    public void W6(android.widget.Button button) {
        java.util.List list = this.V;
        if (((java.util.ArrayList) list).size() > 1) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this, 1, false);
            k0Var.f211872n = new com.tencent.mm.plugin.account.ui.d5(this);
            k0Var.f211881s = new com.tencent.mm.plugin.account.ui.e5(this);
            k0Var.f211854d = new com.tencent.mm.plugin.account.ui.f5(this);
            button.setVisibility(0);
            button.setText(com.tencent.mm.R.string.p2i);
            button.setOnClickListener(new com.tencent.mm.plugin.account.ui.g5(this, k0Var));
            return;
        }
        if (((java.util.ArrayList) list).size() <= 0) {
            button.setVisibility(8);
            return;
        }
        if (e7() && 7013 == ((db5.h4) ((java.util.ArrayList) list).get(0)).f228366g && button.getVisibility() == 8) {
            q61.j.g(1, 0);
        }
        button.setVisibility(0);
        button.setText(((db5.h4) ((java.util.ArrayList) list).get(0)).getTitle());
        button.setOnClickListener(new com.tencent.mm.plugin.account.ui.h5(this));
    }

    public void X6() {
        java.util.List list = this.V;
        ((java.util.ArrayList) list).clear();
        if ((!com.tencent.mm.sdk.platformtools.f9.MeSetSecurityVoicePrint.h()) && this.T != 4 && (this.R & 131072) != 0) {
            db5.h4 h4Var = new db5.h4(this, com.tencent.liteav.TXLiteAVCode.WARNING_AUDIO_RECORDING_WRITE_FAIL, 0);
            h4Var.f228376t = com.tencent.mm.R.string.gia;
            ((java.util.ArrayList) list).add(h4Var);
        }
        if (this.T != 2) {
            if (((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Ri(this.E)) {
                db5.h4 h4Var2 = new db5.h4(this, 7005, 0);
                h4Var2.f228376t = com.tencent.mm.R.string.gi8;
                ((java.util.ArrayList) list).add(h4Var2);
            }
        }
        if (e7() && this.T != 3) {
            db5.h4 h4Var3 = new db5.h4(this, 7013, 0);
            h4Var3.f228376t = com.tencent.mm.R.string.pah;
            ((java.util.ArrayList) list).add(h4Var3);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.C)) {
            if (this.T != 7) {
                db5.h4 h4Var4 = new db5.h4(this, 7007, 0);
                h4Var4.f228368i = getString(com.tencent.mm.R.string.gi9);
                ((java.util.ArrayList) list).add(h4Var4);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f73345y) && this.T != 8) {
                db5.h4 h4Var5 = new db5.h4(this, 7008, 0);
                h4Var5.f228368i = getString(com.tencent.mm.R.string.gi_);
                ((java.util.ArrayList) list).add(h4Var5);
            }
            if (this.C.equalsIgnoreCase(this.f73343x)) {
                this.f73326e.setHint(getString(com.tencent.mm.R.string.hxj));
            }
        }
        W6(this.f73328g);
    }

    public android.graphics.Bitmap Y6(android.graphics.Bitmap bitmap) {
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
        yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", com.tencent.mm.plugin.appbrand.jsapi.media.u5.NAME, "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", com.tencent.mm.plugin.appbrand.jsapi.media.u5.NAME, "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    public void Z6() {
        this.f73340u.f74286b = this.C.trim();
    }

    public java.lang.String a7(java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.sdk.platformtools.c5 c5Var = new com.tencent.mm.sdk.platformtools.c5();
        if (this.C.startsWith("+")) {
            str = str.replace("+", "");
            str2 = com.tencent.mm.sdk.platformtools.c5.c(str);
            if (str2 != null) {
                str = str.substring(str2.length());
            }
        } else {
            str2 = "86";
        }
        return c5Var.f(str2, str);
    }

    public final void b7() {
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.b(this);
        b17.addFlags(67108864);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.A)) {
            b17.putExtra("can_finish", true);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
        db5.f.k(this);
    }

    public final void c7() {
        k7(this, getString(com.tencent.mm.R.string.mtg) + com.tencent.mm.sdk.platformtools.m2.d());
    }

    public boolean d7() {
        com.tencent.mm.plugin.account.sdk.view.ProgressButton progressButton = this.f73327f;
        if (progressButton == null || progressButton.f73194x) {
            return false;
        }
        android.widget.EditText editText = this.f73326e;
        return (editText == null || !editText.isFocused() || this.f73326e.getText().length() <= 0) && !isPaused();
    }

    public boolean e7() {
        if (this.T != 3 && q61.j.f360261a.a() && q61.j.f360262b) {
            if (((is.f) ((js.r0) i95.n0.c(js.r0.class))).Vi(this.E)) {
                return true;
            }
        }
        return false;
    }

    public void f7(int i17) {
        android.content.Intent intent;
        this.Z[3] = 1;
        java.lang.String str = this.X;
        if (i17 == 7001) {
            intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.LoginVoiceUI.class);
            intent.putExtra("login_type", 4);
            intent.putExtra("login_sessionid", str);
        } else if (i17 != 7013) {
            switch (i17) {
                case 7005:
                    intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.LoginPasswordUI.class);
                    intent.putExtra("login_sessionid", str);
                    intent.putExtra("login_type", 2);
                    break;
                case 7006:
                    intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.LoginFaceUI.class);
                    intent.putExtra("login_type", 5);
                    break;
                case 7007:
                    intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.LoginPasswordUI.class);
                    intent.putExtra("login_sessionid", str);
                    intent.putExtra("login_type", 7);
                    break;
                case 7008:
                    intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.LoginSmsUI.class);
                    intent.putExtra("login_sessionid", str);
                    intent.putExtra("login_type", 8);
                    break;
                default:
                    intent = null;
                    break;
            }
        } else {
            intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.LoginPasswordUI.class);
            intent.putExtra("login_sessionid", str);
            intent.putExtra("login_type", 3);
            intent.putExtra("K_NO_NOT_REPORT_ONCE", true);
            intent.putExtra("LoginAction", 3);
        }
        if (intent != null) {
            intent.putExtra("switch_login_wx_id", this.A);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "jumpToOtherLogin", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "jumpToOtherLogin", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.account.ui.i5(this), 300L);
            db5.f.h(this);
        }
    }

    public void g7(boolean z17) {
        com.tencent.mm.plugin.account.sdk.view.ProgressButton progressButton = this.f73327f;
        if (progressButton == null || progressButton.f73194x == z17) {
            return;
        }
        progressButton.A(z17);
        if (!z17) {
            this.f73327f.B(com.tencent.mm.R.string.gi7);
            android.view.ViewGroup.LayoutParams layoutParams = this.f73327f.getLayoutParams();
            layoutParams.width = -2;
            this.f73327f.setLayoutParams(layoutParams);
            ((com.tencent.mm.plugin.account.ui.k3) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.account.ui.k3.class)).P6();
            android.widget.EditText editText = this.f73326e;
            if (editText != null) {
                editText.setEnabled(true);
                return;
            }
            return;
        }
        int width = this.f73327f.getWidth();
        this.f73327f.C(com.tencent.mm.R.string.p2r, false);
        android.view.ViewGroup.LayoutParams layoutParams2 = this.f73327f.getLayoutParams();
        layoutParams2.width = width;
        this.f73327f.setLayoutParams(layoutParams2);
        ((com.tencent.mm.plugin.account.ui.k3) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.account.ui.k3.class)).O6();
        android.widget.EditText editText2 = this.f73326e;
        if (editText2 != null) {
            editText2.clearFocus();
            this.f73326e.setEnabled(false);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bsz;
    }

    public boolean h7(int i17, int i18, java.lang.String str) {
        com.tencent.mm.ui.widget.dialog.j0 j0Var;
        java.lang.String str2;
        if (i17 == 4) {
            if (i18 != -2023) {
                com.tencent.mm.plugin.account.ui.w6 w6Var = this.f73340u;
                if (i18 == -205) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", com.tencent.mm.sdk.platformtools.t8.G1(this.f73342w), this.f73346z);
                    com.tencent.mm.plugin.account.ui.w6.f74285i = w6Var;
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("auth_ticket", this.f73342w);
                    intent.putExtra("binded_mobile", this.f73345y);
                    intent.putExtra("close_safe_device_style", this.f73346z);
                    intent.putExtra("from_source", 2);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.C(this, intent);
                    return true;
                }
                if (i18 == -140) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f73341v)) {
                        x51.i1.e(this, str, this.f73341v);
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
                    if (i18 == -9) {
                        db5.e1.i(this, com.tencent.mm.R.string.f492403gi0, com.tencent.mm.R.string.f492404gi1);
                        return true;
                    }
                    if (i18 != -6) {
                        if (i18 == -3) {
                            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "e", null);
                            if ((d17 != null ? com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".e.ShowType"), 0) : 0) == 6) {
                                if ((this instanceof com.tencent.mm.plugin.account.ui.LoginPasswordUI) || (this instanceof com.tencent.mm.plugin.account.ui.LoginSmsUI)) {
                                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("password_invalid_float", "view_exp", this.W, 34575);
                                }
                                db5.e1.A(this, getString(com.tencent.mm.R.string.nrg), "", getString(com.tencent.mm.R.string.nro), getString(com.tencent.mm.R.string.c1v), new com.tencent.mm.plugin.account.ui.LoginHistoryUI$$a(), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.account.ui.LoginHistoryUI$$b
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(android.content.DialogInterface dialogInterface, int i19) {
                                        int i27 = com.tencent.mm.plugin.account.ui.LoginHistoryUI.f73323y0;
                                        com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI = com.tencent.mm.plugin.account.ui.LoginHistoryUI.this;
                                        loginHistoryUI.getClass();
                                        if ((loginHistoryUI instanceof com.tencent.mm.plugin.account.ui.LoginPasswordUI) || (loginHistoryUI instanceof com.tencent.mm.plugin.account.ui.LoginSmsUI)) {
                                            v61.d.g("login_forget_password_float", 1);
                                        }
                                        loginHistoryUI.c7();
                                    }
                                });
                            } else {
                                int i19 = this.f73344x0;
                                if (i19 < 1) {
                                    this.f73344x0 = i19 + 1;
                                    tm.a b17 = tm.a.b(str);
                                    if (b17 != null) {
                                        b17.c(this, null, null);
                                        return true;
                                    }
                                    db5.e1.i(this, com.tencent.mm.R.string.c1t, com.tencent.mm.R.string.f492404gi1);
                                } else {
                                    db5.e1.A(this, getString(com.tencent.mm.R.string.c1u), getString(com.tencent.mm.R.string.f492404gi1), getString(com.tencent.mm.R.string.c1v), getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.account.ui.v4(this), new com.tencent.mm.plugin.account.ui.w4(this));
                                }
                            }
                            return true;
                        }
                        if (i18 == -1) {
                            if (gm0.j1.d().n() == 5) {
                                db5.e1.i(this, com.tencent.mm.R.string.h7l, com.tencent.mm.R.string.h7k);
                            } else {
                                db5.e1.i(this, com.tencent.mm.R.string.f492296mt1, com.tencent.mm.R.string.f492404gi1);
                            }
                            return true;
                        }
                        if (i18 != -311 && i18 != -310) {
                            if (i18 == -33) {
                                db5.e1.m(this, com.tencent.mm.R.string.ahi, com.tencent.mm.R.string.aho, new com.tencent.mm.plugin.account.ui.y4(this));
                                return true;
                            }
                            if (i18 == -32) {
                                db5.e1.t(this, getString(com.tencent.mm.R.string.ahk), "", new com.tencent.mm.plugin.account.ui.x4(this));
                                return true;
                            }
                        }
                    }
                    gm0.j1.d().a(701, this);
                    gm0.j1.d().a(252, this);
                    if (this.f73339t == null) {
                        this.f73339t = bb5.j.a(this, com.tencent.mm.R.string.hxl, w6Var.f74292h, w6Var.f74291g, w6Var.f74289e, w6Var.f74290f, new com.tencent.mm.plugin.account.ui.z4(this, i17), null, new com.tencent.mm.plugin.account.ui.a5(this), w6Var);
                    } else {
                        java.lang.String str3 = w6Var.f74289e;
                        int length = w6Var.f74291g.length;
                        fp.k.c();
                        this.f73339t.b(w6Var.f74292h, w6Var.f74291g, w6Var.f74289e, w6Var.f74290f);
                    }
                    return true;
                }
            }
            gm0.m.o();
            tm.a b18 = tm.a.b(str);
            if (b18 != null && b18.c(this, null, null)) {
                return true;
            }
            gm0.j1.b();
            if (android.text.TextUtils.isEmpty(gm0.m.f273235x)) {
                str2 = i65.a.r(this, com.tencent.mm.R.string.gqn);
            } else {
                gm0.j1.b();
                str2 = gm0.m.f273235x;
            }
            db5.e1.M(this, str2, getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.plugin.account.ui.b5(this), new com.tencent.mm.plugin.account.ui.c5(this));
            return true;
        }
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        if (!com.tencent.mm.ui.pc.a(this, i17, i18, str, 4)) {
            return this.H.c(this, new x51.r1(i17, i18, str));
        }
        com.tencent.mm.ui.applet.SecurityImage securityImage = this.f73339t;
        if (securityImage != null && (j0Var = securityImage.f197198n) != null) {
            j0Var.dismiss();
            securityImage.f197198n = null;
        }
        return true;
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

    public void i7() {
        java.util.HashMap hashMap = new java.util.HashMap(this.W);
        if (!com.tencent.mm.sdk.platformtools.t8.Q0(this.C).booleanValue() || this.C.equals(this.f73343x)) {
            hashMap.put("login_method", 2);
        } else {
            hashMap.put("login_method", 1);
        }
        int i17 = this.T;
        if (i17 == 1) {
            v61.d.g("one_clk_login", 1);
        } else if (i17 == 6) {
            v61.d.g("current_number_login", 1);
        } else {
            v61.d.g("login_account", 1);
        }
        if (this.T == 3) {
            q61.j.g(0, 1);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.I = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.p6b);
        this.K = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.do9);
        this.f73324J = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.g5u);
        this.L = (com.tencent.mm.ui.base.MMFormInputView) findViewById(com.tencent.mm.R.id.ipa);
        this.M = (com.tencent.mm.ui.base.MMFormVerifyCodeInputView) findViewById(com.tencent.mm.R.id.f486967n16);
        java.lang.String stringExtra = getIntent().getStringExtra("switch_login_wx_id");
        this.A = stringExtra;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            setBackBtnVisible(false);
            c01.b9 b9Var = c01.b9.f37069c;
            this.C = b9Var.a("login_user_name", "");
            this.F = b9Var.a("last_avatar_path", "");
            this.S = com.tencent.mm.sdk.platformtools.t8.D1(b9Var.a("last_bind_info", ""), 0);
            this.D = b9Var.a("last_login_alias", "");
            this.E = b9Var.a("login_weixin_username", "");
            if ((this.S & 1) != 0) {
                this.f73343x = b9Var.a("last_login_bind_qq", "");
            }
            if ((this.S & 4) != 0) {
                this.f73345y = b9Var.a("last_login_bind_mobile", "");
            }
            this.R = com.tencent.mm.sdk.platformtools.t8.D1(b9Var.a("last_login_use_voice", ""), 0);
        } else {
            java.lang.String str = this.A;
            this.E = str;
            c01.uc ucVar = c01.uc.f37514c;
            this.C = ucVar.c(str, "login_user_name");
            this.F = ucVar.c(this.A, "last_avatar_path");
            this.S = com.tencent.mm.sdk.platformtools.t8.D1(ucVar.c(this.A, "last_bind_info"), 0);
            this.D = ucVar.c(this.A, "last_login_alias");
            if ((this.S & 1) != 0) {
                this.f73343x = ucVar.c(this.A, "last_login_bind_qq");
            }
            if ((this.S & 4) != 0) {
                this.f73345y = ucVar.c(this.A, "last_login_bind_mobile");
            }
            this.R = com.tencent.mm.sdk.platformtools.t8.D1(ucVar.c(this.A, "last_login_use_voice"), 0);
            setBackBtn(new com.tencent.mm.plugin.account.ui.k5(this), com.tencent.mm.R.raw.actionbar_icon_close_black);
        }
        this.B = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f485477ht4);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.F)) {
            try {
                kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
                java.lang.String str2 = this.F;
                ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
                android.graphics.Bitmap h17 = com.tencent.mm.modelavatar.z.h(str2, null, false);
                if (h17 != null && h17.getWidth() > 10) {
                    this.B.setImageBitmap(Y6(h17));
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LoginHistoryUI", e17, "get avatar error", new java.lang.Object[0]);
            }
        }
        this.f73325d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.iod);
        this.f73326e = this.L.getContentEditText();
        this.f73327f = (com.tencent.mm.plugin.account.sdk.view.ProgressButton) findViewById(com.tencent.mm.R.id.iol);
        this.f73330i = findViewById(com.tencent.mm.R.id.ipg);
        this.f73331m = findViewById(com.tencent.mm.R.id.f485699ip2);
        this.f73332n = (android.widget.Button) findViewById(com.tencent.mm.R.id.f486923mw2);
        this.f73328g = (android.widget.Button) findViewById(com.tencent.mm.R.id.iox);
        this.f73329h = (android.widget.Button) findViewById(com.tencent.mm.R.id.ucz);
        this.N = (android.widget.Button) findViewById(com.tencent.mm.R.id.iog);
        this.f73333o = (android.widget.Button) findViewById(com.tencent.mm.R.id.f485703ip3);
        this.f73334p = (android.widget.Button) findViewById(com.tencent.mm.R.id.f485705ud3);
        this.f73336q = findViewById(com.tencent.mm.R.id.ugl);
        this.f73337r = (android.widget.Button) findViewById(com.tencent.mm.R.id.ip9);
        com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = (com.tencent.mm.ui.widget.InputPanelLinearLayout) findViewById(com.tencent.mm.R.id.keyboard_change_input_panel);
        if (inputPanelLinearLayout != null) {
            inputPanelLinearLayout.e(new al5.e0() { // from class: com.tencent.mm.plugin.account.ui.LoginHistoryUI$$c
                @Override // al5.e0
                public final void J2(boolean z17, int i17) {
                    com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI = com.tencent.mm.plugin.account.ui.LoginHistoryUI.this;
                    if (z17) {
                        int i18 = com.tencent.mm.plugin.account.ui.LoginHistoryUI.f73323y0;
                        loginHistoryUI.getClass();
                    } else if (loginHistoryUI.U) {
                        loginHistoryUI.U = false;
                        loginHistoryUI.f7(((db5.h4) ((java.util.ArrayList) loginHistoryUI.V).get(0)).f228366g);
                    }
                }
            });
        }
        boolean c17 = com.tencent.mm.ui.b4.c(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", "setupImeInsetsForEdgeToEdge isTargetSDKVersionOver35=%b", java.lang.Boolean.valueOf(c17));
        if (c17) {
            android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.keyboard_change_scroll_view);
            if (scrollView == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.LoginHistoryUI", "setupImeInsetsForEdgeToEdge scrollView not found");
            } else {
                final int paddingBottom = scrollView.getPaddingBottom();
                com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", "setupImeInsetsForEdgeToEdge originalPaddingBottom=%d", java.lang.Integer.valueOf(paddingBottom));
                n3.k0 k0Var = new n3.k0() { // from class: com.tencent.mm.plugin.account.ui.LoginHistoryUI$$d
                    @Override // n3.k0
                    public final n3.g3 a(android.view.View view, n3.g3 g3Var) {
                        int i17 = com.tencent.mm.plugin.account.ui.LoginHistoryUI.f73323y0;
                        com.tencent.mm.plugin.account.ui.LoginHistoryUI loginHistoryUI = com.tencent.mm.plugin.account.ui.LoginHistoryUI.this;
                        loginHistoryUI.getClass();
                        int i18 = g3Var.a(8).f247047d;
                        int i19 = g3Var.a(2).f247047d;
                        int max = java.lang.Math.max(i18, i19);
                        boolean z17 = max > 300 && gh5.d.b(loginHistoryUI);
                        int max2 = java.lang.Math.max(max, 0);
                        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
                        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
                        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i19);
                        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(max2);
                        int i27 = paddingBottom;
                        com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", "setupImeInsetsForEdgeToEdge onApplyWindowInsets imeVisible=%b, imeHeight=%d, navBarHeight=%d, imeOffset=%d originalPaddingBottom=%d", valueOf, valueOf2, valueOf3, valueOf4, java.lang.Integer.valueOf(i27));
                        if (z17) {
                            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i27 + max2);
                        } else {
                            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i27);
                        }
                        return g3Var;
                    }
                };
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                n3.a1.u(scrollView, k0Var);
            }
        }
        com.tencent.mm.ui.dl.i(this.f73333o.getPaint());
        com.tencent.mm.ui.dl.i(this.f73334p.getPaint());
        com.tencent.mm.ui.dl.i(this.f73337r.getPaint());
        this.f73333o.setOnClickListener(new com.tencent.mm.plugin.account.ui.l5(this));
        v61.d.i(this.f73333o, "login_forget_password", 1);
        this.f73334p.setOnClickListener(new com.tencent.mm.plugin.account.ui.m5(this));
        this.L.setVisibility(8);
        this.I.setVisibility(8);
        this.K.setVisibility(8);
        this.f73324J.setVisibility(8);
        this.f73327f.setVisibility(8);
        android.view.View view = this.f73330i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f73331m;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f73332n;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f73328g.setVisibility(8);
        this.f73329h.setVisibility(8);
        com.tencent.mm.ui.dl.i(this.f73328g.getPaint());
        ck5.f b17 = ck5.f.b(this.f73326e);
        b17.f42561f = 4;
        b17.f42560e = 16;
        b17.d(null);
        boolean booleanValue = com.tencent.mm.sdk.platformtools.t8.Q0(this.C).booleanValue();
        int[] iArr = this.Z;
        if (!booleanValue || this.C.equals(this.f73343x)) {
            iArr[2] = 2;
            this.f73325d.setText(this.C);
        } else {
            iArr[2] = 1;
            this.f73325d.setText(a7(this.C));
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this, 1, false);
        k0Var2.f211872n = new com.tencent.mm.plugin.account.ui.n5(this);
        k0Var2.f211881s = new com.tencent.mm.plugin.account.ui.o5(this);
        k0Var2.f211854d = new com.tencent.mm.plugin.account.ui.p5(this);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.A)) {
            this.f73337r.setOnClickListener(new com.tencent.mm.plugin.account.ui.j4(this, k0Var2));
        } else if (com.tencent.mm.sdk.platformtools.m2.m()) {
            this.f73337r.setText(com.tencent.mm.R.string.l8m);
            this.f73337r.setOnClickListener(new com.tencent.mm.plugin.account.ui.l4(this));
        } else {
            this.f73337r.setText(com.tencent.mm.R.string.l8j);
            this.f73337r.setOnClickListener(new com.tencent.mm.plugin.account.ui.k4(this));
        }
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.a07));
        hideActionbarLine();
        if (com.tencent.mm.sdk.platformtools.a0.f192447j) {
            ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            com.tencent.mm.ui.vb.j(this, null);
        }
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (com.tencent.mm.ui.bk.A() || com.tencent.mm.ui.bk.Q()) {
            v61.g0 g0Var = v61.h0.f433441a;
            v61.h0.a(this.N, this);
            if (com.tencent.mm.ui.bk.A() && !com.tencent.mm.ui.bk.Q()) {
                this.N.setText(getResources().getString(com.tencent.mm.R.string.f492407gi4));
            } else if (com.tencent.mm.ui.bk.Q()) {
                this.N.setText(getResources().getString(com.tencent.mm.R.string.fe_));
            } else {
                this.N.setText(getResources().getString(com.tencent.mm.R.string.gh_));
            }
            this.N.setOnClickListener(new com.tencent.mm.plugin.account.ui.m4(this));
        }
        if (com.tencent.mm.sdk.platformtools.f9.LoginPasswordReset.h()) {
            this.f73333o.setVisibility(8);
        }
    }

    public final void j7(com.tencent.mm.modelsimple.v0 v0Var) {
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
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "startLauncher", "(Lcom/tencent/mm/modelsimple/NetSceneManualAuth;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "startLauncher", "(Lcom/tencent/mm/modelsimple/NetSceneManualAuth;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    public final void l7() {
        this.Z[4] = 1;
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MobileInputUI.class);
        intent.putExtra("mobile_input_purpose", 1);
        int[] iArr = new int[5];
        iArr[4] = 1;
        intent.putExtra("kv_report_login_method_data", iArr);
        intent.putExtra("login_sessionid", this.X);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "switchUser", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "switchUser", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.os.Bundle bundleExtra;
        android.os.Bundle bundleExtra2;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1024 && intent != null) {
            if (i18 == -1) {
                java.lang.String stringExtra = intent.getStringExtra("VoiceLoginAuthPwd");
                intent.getIntExtra("KVoiceHelpCode", 0);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    stringExtra.getClass();
                }
                this.P = stringExtra;
                Z6();
                return;
            }
            return;
        }
        if (i17 == 1025 && intent != null) {
            if (i18 == 2) {
                java.lang.String stringExtra2 = intent.getStringExtra("KFaceLoginAuthPwd");
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2));
                objArr[1] = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2) ? 0 : stringExtra2.length());
                com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", "hy: onActivityResult, do faceprint auth, authPwd is null:%b, authPwd.len:%d", objArr);
                this.P = stringExtra2;
                Z6();
                return;
            }
            return;
        }
        if (i17 == 31685 && intent != null) {
            if (i18 == -1 && (bundleExtra2 = intent.getBundleExtra("result_data")) != null && bundleExtra2.getString("go_next", "").equals("auth_again")) {
                Z6();
                return;
            }
            return;
        }
        if (i17 != 327 || !this.Y || intent == null || (bundleExtra = intent.getBundleExtra("result_data")) == null) {
            return;
        }
        java.lang.String string = bundleExtra.getString("go_next");
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", "[Security Center Login] onActivityResult requestCode:" + i17 + ",resultCode:" + i18 + ", resData: " + string);
        if (string == null || !string.equals("jump_to_phone_num_verify")) {
            return;
        }
        l7();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        v61.d.f(1);
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", "AccountSyncApplication.modelCallback %s", ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi());
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        com.tencent.mm.ui.vb.e();
        this.G = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0);
        android.content.Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("login_success_need_bind_fingerprint", false)) {
            intent.getStringExtra("bind_login_fingerprint_info");
        }
        initView();
        this.H = new x51.f();
        v61.d.e(1);
        ((com.tencent.mm.plugin.account.ui.k3) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.account.ui.k3.class)).V6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", "onDestroy");
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        x51.f fVar = this.H;
        if (fVar != null) {
            fVar.a();
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        int[] iArr = this.Z;
        g0Var.d(14262, java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]), java.lang.Integer.valueOf(iArr[2]), java.lang.Integer.valueOf(iArr[3]), java.lang.Integer.valueOf(iArr[4]));
        android.app.ProgressDialog progressDialog = this.f73338s;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f73338s = null;
        }
        g7(false);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            b7();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f73335p0.dead();
        hideVKB();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        X6();
        this.f73335p0.alive();
        gm0.j1.b();
        gm0.j1.i();
        gm0.j1.b().f273255r = "";
        gm0.j1.i();
        ((java.util.HashMap) gm0.j1.b().f273256s).clear();
        if (gm0.j1.a() && gm0.j1.b().f273254q && !this.C.equals("")) {
            android.app.ProgressDialog progressDialog = this.f73338s;
            if (progressDialog == null || !progressDialog.isShowing()) {
                j7(null);
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
            aVar.E = new com.tencent.mm.plugin.account.ui.j5(this);
            com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(this, com.tencent.mm.R.style.f494791wd);
            j0Var.e(aVar);
            com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
            if (d0Var != null) {
                d0Var.a(j0Var.f211837r);
            }
            j0Var.show();
            android.preference.PreferenceManager.getDefaultSharedPreferences(this).edit().putLong("db_check_tip_time", java.lang.System.currentTimeMillis()).commit();
        }
        v61.d.e(1);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Scene Type ");
        sb6.append(m1Var.getType());
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", sb6.toString());
        if (m1Var.getType() == 145) {
            if (com.tencent.mm.plugin.account.ui.q3.b(m1Var)) {
                return;
            }
            android.app.ProgressDialog progressDialog = this.f73338s;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f73338s.dismiss();
                this.f73338s = null;
            }
            g7(false);
            h11.e eVar = (h11.e) m1Var;
            int M = eVar.M();
            if (M == 13) {
                if (i18 == -36) {
                    tm.a b17 = tm.a.b(str);
                    if (eVar.H() == 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LoginHistoryUI", "login check state, sms up");
                        if (b17 != null) {
                            b17.c(this, new com.tencent.mm.plugin.account.ui.o4(this), null);
                            return;
                        }
                        db5.e1.u(this, getString(com.tencent.mm.R.string.ght), "", new com.tencent.mm.plugin.account.ui.p4(this), null);
                    } else {
                        if (b17 != null) {
                            b17.c(this, new com.tencent.mm.plugin.account.ui.q4(this), null);
                            return;
                        }
                        db5.e1.u(this, getString(com.tencent.mm.R.string.hxd) + com.tencent.mm.sdk.platformtools.c5.h(this.f73345y), getString(com.tencent.mm.R.string.hxe), new com.tencent.mm.plugin.account.ui.r4(this), new com.tencent.mm.plugin.account.ui.s4(this));
                    }
                }
                if (i18 == -106) {
                    this.M.b();
                    x51.i1.c(this, str, 32044);
                    return;
                }
            } else if (M == 16) {
                if (i18 == -41) {
                    db5.e1.i(this, com.tencent.mm.R.string.hwi, com.tencent.mm.R.string.hwj);
                    this.M.b();
                    return;
                } else if (i18 == -75) {
                    db5.e1.s(this, getString(com.tencent.mm.R.string.f489997hz), "");
                    this.M.b();
                    return;
                } else if (i18 == -106) {
                    x51.i1.c(this, str, 32045);
                    this.M.b();
                    return;
                }
            } else if (M == 17) {
                if (i17 == 0 && i18 == 0) {
                    new com.tencent.mm.plugin.account.ui.fa(new com.tencent.mm.plugin.account.ui.t4(this), eVar.Q(), eVar.P(), this.f73345y).b(this);
                    return;
                } else {
                    if (h7(i17, i18, str)) {
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
            this.f73341v = v0Var.H();
            com.tencent.mars.xlog.Log.e("MicroMsg.LoginHistoryUI", "url " + this.f73341v);
            gm0.j1.d().q(701, this);
            gm0.j1.d().q(252, this);
            int N = v0Var.N();
            com.tencent.mm.plugin.account.ui.w6 w6Var = this.f73340u;
            w6Var.f74292h = N;
            w6Var.f74289e = v0Var.M();
            w6Var.f74291g = v0Var.K();
            w6Var.f74290f = v0Var.L();
            if (i18 == -205) {
                this.f73342w = v0Var.I();
                this.f73345y = v0Var.R();
                this.f73346z = v0Var.J();
            }
            if (i17 == 4 && (i18 == -16 || i18 == -17)) {
                gm0.j1.d().g(new c01.ra(new com.tencent.mm.plugin.account.ui.u4(this), null));
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17 || (i17 == 0 && i18 == 0)) {
                gm0.m.E();
                x51.i1.a(this, w6Var.f74286b);
                android.app.ProgressDialog progressDialog2 = this.f73338s;
                if (progressDialog2 != null && progressDialog2.isShowing()) {
                    this.f73338s.setMessage(getString(com.tencent.mm.R.string.f490468vx));
                }
                if ((this instanceof com.tencent.mm.plugin.account.ui.LoginPasswordUI) || (this instanceof com.tencent.mm.plugin.account.ui.LoginSmsUI)) {
                    java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry("login_sessionid", this.X), new java.util.AbstractMap.SimpleEntry(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, wo.w0.k()), new java.util.AbstractMap.SimpleEntry("login_method", 2), new java.util.AbstractMap.SimpleEntry(dm.i4.COL_USERNAME, w6Var.f74286b)};
                    java.util.HashMap hashMap = new java.util.HashMap(4);
                    for (int i19 = 0; i19 < 4; i19++) {
                        java.util.Map.Entry entry = entryArr[i19];
                        java.lang.Object key = entry.getKey();
                        java.util.Objects.requireNonNull(key);
                        java.lang.Object value = entry.getValue();
                        java.util.Objects.requireNonNull(value);
                        if (hashMap.put(key, value) != null) {
                            throw new java.lang.IllegalArgumentException("duplicate key: " + key);
                        }
                    }
                    java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(hashMap);
                    new java.util.HashMap(unmodifiableMap).put("login_page_type", 2);
                    java.util.HashMap hashMap2 = new java.util.HashMap(unmodifiableMap);
                    hashMap2.put("is_new_user", 0);
                    ((l71.e) ((js.z0) i95.n0.c(js.z0.class))).f316829d = hashMap2;
                    int i27 = this.T;
                    v61.d.c(1, i27 != 1 ? i27 != 2 ? i27 != 4 ? i27 != 6 ? 0 : 12 : 11 : 10 : 8);
                    if (this.T == 3) {
                        q61.j.e(q61.j.f360268h, 2, 1, 0, 0);
                    }
                }
                j7(v0Var);
                v61.d.f(1);
                if (this.T == 8) {
                    this.Q = v0Var.V();
                    if (v0Var.S()) {
                        boolean z18 = this.Q;
                        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI.class);
                        intent.putExtra("kintent_hint", getString(com.tencent.mm.R.string.itc));
                        intent.putExtra("kintent_cancelable", z18);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "goToSetIndepPwd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "goToSetIndepPwd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }
                if (com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A()) {
                    com.tencent.mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct foldingPhoneLoginTypeStruct = new com.tencent.mm.autogen.mmdata.rpt.FoldingPhoneLoginTypeStruct();
                    foldingPhoneLoginTypeStruct.f58210d = 2L;
                    foldingPhoneLoginTypeStruct.k();
                    return;
                }
                return;
            }
            if (this.T == 3) {
                q61.j.e(q61.j.f360268h, 2, 3, 0, 3);
            }
            android.app.ProgressDialog progressDialog3 = this.f73338s;
            if (progressDialog3 != null && progressDialog3.isShowing()) {
                this.f73338s.dismiss();
                this.f73338s = null;
            }
            g7(false);
            if (i18 == -106) {
                x51.i1.c(this, str, 31685);
                return;
            }
            if (i18 == -217) {
                x51.i1.f(this, x51.i.a(v0Var), i18);
                return;
            } else {
                if (h7(i17, i18, str)) {
                    return;
                }
                tm.a b19 = tm.a.b(str);
                if (b19 != null && b19.c(this, null, null)) {
                    return;
                } else {
                    dp.a.makeText(this, getString(com.tencent.mm.R.string.fbu, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
                }
            }
        }
        h7(i17, i18, str);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, android.app.Activity
    public void setRequestedOrientation(int i17) {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(vm3.d.class);
        hashSet.add(j71.a.class);
        hashSet.add(com.tencent.mm.plugin.account.ui.k3.class);
    }
}
