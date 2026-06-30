package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI */
/* loaded from: classes14.dex */
public abstract class AbstractActivityC11397xe10f852e extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int L = 0;
    public x51.f A;
    public android.widget.Button B;
    public boolean D;
    public int E;
    public int F;
    public int G;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f154779d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f154780e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f154781f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f154782g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f154783h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f154784i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f154785m;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f154790r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f154791s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f154792t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f154793u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f154794v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ImageView f154795w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f154796x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f154797y;

    /* renamed from: z, reason: collision with root package name */
    public android.content.SharedPreferences f154798z;

    /* renamed from: n, reason: collision with root package name */
    public android.app.ProgressDialog f154786n = null;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db f154787o = null;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 f154788p = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6();

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f154789q = "";
    public java.lang.String C = "";
    public java.lang.String H = "";
    public final int[] I = new int[5];

    /* renamed from: J, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f154778J = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370>(this, com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.account.ui.BaseLoginVoiceUI.1
        {
            this.f39173x3fe91575 = -1399051904;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370 c5690x46542370) {
            am.gj gjVar;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370 c5690x465423702 = c5690x46542370;
            if (c5690x465423702 == null || (gjVar = c5690x465423702.f136016g) == null) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginHistoryUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", gjVar.f88301a, gjVar.f88302b);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_disaster_content", gjVar.f88301a);
            intent.putExtra("key_disaster_url", gjVar.f88302b);
            intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11402x33c6c555.class).addFlags(268435456);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
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

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e abstractActivityC11397xe10f852e, int i17) {
        android.content.Intent intent;
        abstractActivityC11397xe10f852e.I[3] = 1;
        if (i17 == 7001) {
            intent = new android.content.Intent(abstractActivityC11397xe10f852e, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11444x1cfdebbd.class);
            intent.putExtra("login_type", 4);
        } else if (i17 != 7013) {
            switch (i17) {
                case 7006:
                    intent = new android.content.Intent(abstractActivityC11397xe10f852e, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11409x9a874e5a.class);
                    intent.putExtra("login_type", 5);
                    break;
                case 7007:
                    intent = new android.content.Intent(abstractActivityC11397xe10f852e, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.class);
                    intent.putExtra("login_type", 7);
                    break;
                case 7008:
                    intent = new android.content.Intent(abstractActivityC11397xe10f852e, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11435xdfb0be4.class);
                    intent.putExtra("login_type", 8);
                    break;
                default:
                    intent = null;
                    break;
            }
        } else {
            intent = new android.content.Intent(abstractActivityC11397xe10f852e, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.class);
            intent.putExtra("login_sessionid", abstractActivityC11397xe10f852e.H);
            intent.putExtra("login_type", 3);
            intent.putExtra("K_NO_NOT_REPORT_ONCE", true);
            intent.putExtra("LoginAction", 3);
        }
        if (intent != null) {
            intent.putExtra("switch_login_wx_id", abstractActivityC11397xe10f852e.f154794v);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(abstractActivityC11397xe10f852e, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "jumpToOtherLogin", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            abstractActivityC11397xe10f852e.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(abstractActivityC11397xe10f852e, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "jumpToOtherLogin", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.j0(abstractActivityC11397xe10f852e), 300L);
            db5.f.h(abstractActivityC11397xe10f852e);
        }
    }

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.AbstractActivityC11397xe10f852e abstractActivityC11397xe10f852e) {
        e7(abstractActivityC11397xe10f852e.mo55332x76847179(), abstractActivityC11397xe10f852e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8n) + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d());
    }

    public static void e7(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        j45.l.j(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }

    public void V6() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (c7() && this.G != 4 && (this.E & 131072) != 0) {
            db5.h4 h4Var = new db5.h4(this, com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14480xb9cc8658, 0);
            h4Var.f309909t = com.p314xaae8f345.mm.R.C30867xcad56011.gia;
            arrayList.add(h4Var);
        }
        if (this.G != 2 && (this.E & 262144) != 0) {
            db5.h4 h4Var2 = new db5.h4(this, 7005, 0);
            h4Var2.f309909t = com.p314xaae8f345.mm.R.C30867xcad56011.gi8;
            arrayList.add(h4Var2);
        }
        if (Z6() && this.G != 3) {
            db5.h4 h4Var3 = new db5.h4(this, 7013, 0);
            h4Var3.f309909t = com.p314xaae8f345.mm.R.C30867xcad56011.pah;
            arrayList.add(h4Var3);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154796x)) {
            if (this.G != 7) {
                db5.h4 h4Var4 = new db5.h4(this, 7007, 0);
                h4Var4.f309901i = getString(com.p314xaae8f345.mm.R.C30867xcad56011.gi9);
                arrayList.add(h4Var4);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154792t) && this.G != 8) {
                db5.h4 h4Var5 = new db5.h4(this, 7008, 0);
                h4Var5.f309901i = getString(com.p314xaae8f345.mm.R.C30867xcad56011.gi_);
                arrayList.add(h4Var5);
            }
        }
        if (arrayList.size() <= 1) {
            if (arrayList.size() <= 0) {
                this.f154780e.setVisibility(8);
                return;
            }
            this.f154780e.setVisibility(0);
            this.f154780e.setText(((db5.h4) arrayList.get(0)).getTitle());
            this.f154780e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.h0(this, arrayList));
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this, 1, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.d0(this, arrayList);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.e0(this);
        k0Var.f293387d = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f0(this);
        this.f154780e.setVisibility(0);
        this.f154780e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.p2i);
        this.f154780e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.g0(this, k0Var));
    }

    public android.graphics.Bitmap W6(android.graphics.Bitmap bitmap) {
        int width = bitmap.getWidth() - 10;
        int height = bitmap.getHeight() - 10;
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        aVar.c(java.lang.Boolean.FALSE);
        aVar.c(null);
        aVar.c(java.lang.Integer.valueOf(height));
        aVar.c(java.lang.Integer.valueOf(width));
        aVar.c(5);
        aVar.c(5);
        aVar.c(bitmap);
        java.lang.Object obj = new java.lang.Object();
        yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u5.f34506x24728b, "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u5.f34506x24728b, "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    public void X6() {
        this.f154788p.f155819b = this.f154796x.trim();
    }

    public final void Y6() {
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.b(this);
        b17.addFlags(67108864);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154794v)) {
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
        return this.G != 3 && q61.j.f441794a.a() && q61.j.f441795b && ((is.f) ((js.r0) i95.n0.c(js.r0.class))).Vi(c01.b9.f118602c.a("login_weixin_username", ""));
    }

    public boolean a7(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var;
        java.lang.String str2;
        if (i17 == 4) {
            if (i18 != -2023) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 w6Var = this.f154788p;
                if (i18 == -205) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginHistoryUI", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(this.f154790r), this.f154793u);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6.f155818i = w6Var;
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("auth_ticket", this.f154790r);
                    intent.putExtra("binded_mobile", this.f154792t);
                    intent.putExtra("close_safe_device_style", this.f154793u);
                    intent.putExtra("from_source", 2);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.C(this, intent);
                    return true;
                }
                if (i18 == -140) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154789q)) {
                        x51.i1.e(this, str, this.f154789q);
                    }
                    return true;
                }
                if (i18 != -100) {
                    if (i18 == -75) {
                        x51.i1.d(this);
                        return true;
                    }
                    if (i18 == -72) {
                        db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.hxh, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
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
                                    db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.c1t, com.p314xaae8f345.mm.R.C30867xcad56011.f573937gi1);
                                    this.K++;
                                } else {
                                    db5.e1.A(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.c1u), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573937gi1), getString(com.p314xaae8f345.mm.R.C30867xcad56011.c1v), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.u(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.v(this));
                                }
                                return true;
                            }
                            if (i18 != -1) {
                                if (i18 != -311 && i18 != -310) {
                                    if (i18 == -33) {
                                        db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.ahi, com.p314xaae8f345.mm.R.C30867xcad56011.aho, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.x(this));
                                        return true;
                                    }
                                    if (i18 == -32) {
                                        db5.e1.t(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ahk), "", new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w(this));
                                        return true;
                                    }
                                }
                            } else if (gm0.j1.d().n() == 5) {
                                db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.h7l, com.p314xaae8f345.mm.R.C30867xcad56011.h7k);
                                return true;
                            }
                        }
                        gm0.j1.d().a(701, this);
                        gm0.j1.d().a(252, this);
                        if (this.f154787o == null) {
                            this.f154787o = bb5.j.a(this, com.p314xaae8f345.mm.R.C30867xcad56011.hxl, w6Var.f155825h, w6Var.f155824g, w6Var.f155822e, w6Var.f155823f, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.z(this, i17), null, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.a0(this), w6Var);
                        } else {
                            java.lang.String str3 = w6Var.f155822e;
                            int length = w6Var.f155824g.length;
                            fp.k.c();
                            this.f154787o.b(w6Var.f155825h, w6Var.f155824g, w6Var.f155822e, w6Var.f155823f);
                        }
                        return true;
                    }
                    db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.f573936gi0, com.p314xaae8f345.mm.R.C30867xcad56011.f573937gi1);
                    return true;
                }
            }
            gm0.m.o();
            gm0.j1.b();
            if (android.text.TextUtils.isEmpty(gm0.m.f354768x)) {
                str2 = i65.a.r(this, com.p314xaae8f345.mm.R.C30867xcad56011.gqn);
            } else {
                gm0.j1.b();
                str2 = gm0.m.f354768x;
            }
            db5.e1.M(this, str2, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.b0(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.c0(this));
            return true;
        }
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        if (!com.p314xaae8f345.mm.ui.pc.a(this, i17, i18, str, 4)) {
            return this.A.c(this, new x51.r1(i17, i18, str));
        }
        com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db c21463x46cf9db = this.f154787o;
        if (c21463x46cf9db != null && (j0Var = c21463x46cf9db.f278731n) != null) {
            j0Var.dismiss();
            c21463x46cf9db.f278731n = null;
        }
        return true;
    }

    public final void b7(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginHistoryUI", "requestSms %s", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        h11.e eVar = new h11.e(str, 16, "", 0, "");
        gm0.j1.d().g(eVar);
        this.f154786n = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.o(this, eVar));
    }

    public boolean c7() {
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetSecurityVoicePrint.h();
    }

    public final void d7(com.p314xaae8f345.mm.p957x53236a1b.v0 v0Var) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginHistoryUI", "checktask LoginHistoryUI startLauncher 0x%x, stack: %s", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.b(this);
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

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4
    /* renamed from: hideVKB */
    public void mo48674x36654fab() {
        android.view.View currentFocus;
        android.os.IBinder windowToken;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getSystemService("input_method");
        if (inputMethodManager == null || (currentFocus = getCurrentFocus()) == null || (windowToken = currentFocus.getWindowToken()) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.lang.String a17;
        java.lang.String str;
        java.lang.String stringExtra = getIntent().getStringExtra("switch_login_wx_id");
        this.f154794v = stringExtra;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            c01.b9 b9Var = c01.b9.f118602c;
            this.f154796x = b9Var.a("login_user_name", "");
            b9Var.a("last_login_nick_name", "");
            this.f154797y = b9Var.a("last_avatar_path", "");
            this.F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(b9Var.a("last_bind_info", ""), 0);
            a17 = b9Var.a("last_login_alias", "");
            if ((this.F & 1) != 0) {
                this.f154791s = b9Var.a("last_login_bind_qq", "");
            }
            if ((this.F & 4) != 0) {
                this.f154792t = b9Var.a("last_login_bind_mobile", "");
            }
            this.E = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(b9Var.a("last_login_use_voice", ""), 0);
        } else {
            c01.uc ucVar = c01.uc.f119047c;
            this.f154796x = ucVar.c(this.f154794v, "login_user_name");
            this.f154797y = ucVar.c(this.f154794v, "last_avatar_path");
            this.F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(ucVar.c(this.f154794v, "last_bind_info"), 0);
            a17 = ucVar.c(this.f154794v, "last_login_alias");
            if ((this.F & 1) != 0) {
                this.f154791s = ucVar.c(this.f154794v, "last_login_bind_qq");
            }
            if ((this.F & 4) != 0) {
                this.f154792t = ucVar.c(this.f154794v, "last_login_bind_mobile");
            }
            this.E = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(ucVar.c(this.f154794v, "last_login_use_voice"), 0);
            mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.l0(this), com.p314xaae8f345.mm.R.raw.f78350xe9269a14);
        }
        if (this.f154796x.startsWith("wxid")) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154792t) && !this.f154792t.isEmpty()) {
                this.f154796x = this.f154792t;
            } else if (!a17.isEmpty()) {
                this.f154796x = a17;
            }
        }
        this.f154795w = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f567010ht4);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154797y)) {
            try {
                kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
                java.lang.String str2 = this.f154797y;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
                android.graphics.Bitmap h17 = com.p314xaae8f345.mm.p943x351df9c2.z.h(str2, null, false);
                if (h17 != null && h17.getWidth() > 10) {
                    this.f154795w.setImageBitmap(W6(h17));
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LoginHistoryUI", e17, "get avatar error", new java.lang.Object[0]);
            }
        }
        this.f154779d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.iod);
        this.f154781f = findViewById(com.p314xaae8f345.mm.R.id.ipg);
        this.f154780e = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.iox);
        this.B = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.iog);
        this.f154782g = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f567236ip3);
        this.f154783h = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f567238ud3);
        this.f154784i = findViewById(com.p314xaae8f345.mm.R.id.ugl);
        this.f154785m = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.ip9);
        com.p314xaae8f345.mm.ui.dl.i(this.f154782g.getPaint());
        com.p314xaae8f345.mm.ui.dl.i(this.f154783h.getPaint());
        com.p314xaae8f345.mm.ui.dl.i(this.f154785m.getPaint());
        this.f154782g.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m0(this));
        this.f154783h.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.n0(this));
        android.view.View view = this.f154781f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/ui/BaseLoginVoiceUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f154780e.setVisibility(8);
        com.p314xaae8f345.mm.ui.dl.i(this.f154780e.getPaint());
        boolean booleanValue = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Q0(this.f154796x).booleanValue();
        int[] iArr = this.I;
        if (!booleanValue || this.f154796x.equals(this.f154791s)) {
            iArr[2] = 2;
            this.f154779d.setText(this.f154796x);
        } else {
            iArr[2] = 1;
            android.widget.TextView textView = this.f154779d;
            java.lang.String str3 = this.f154796x;
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
            textView.setText(c5Var.f(str, str3));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this, 1, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.o0(this);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.p0(this);
        k0Var.f293387d = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.q0(this);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154794v)) {
            this.f154785m.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k(this, k0Var));
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m()) {
            this.f154785m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.l8m);
            this.f154785m.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m(this));
        } else {
            this.f154785m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.l8j);
            this.f154785m.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.l(this));
        }
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
        mo78530x8b45058f();
        m78560xe21cbbf(false);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273980j) {
            ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            com.p314xaae8f345.mm.ui.vb.j(this, null);
        }
        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (com.p314xaae8f345.mm.ui.bk.A() || com.p314xaae8f345.mm.ui.bk.Q()) {
            v61.g0 g0Var = v61.h0.f514974a;
            v61.h0.a(this.B, this);
            if (com.p314xaae8f345.mm.ui.bk.A() && !com.p314xaae8f345.mm.ui.bk.Q()) {
                this.B.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573940gi4));
            } else if (com.p314xaae8f345.mm.ui.bk.Q()) {
                this.B.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fe_));
            } else {
                this.B.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gh_));
            }
            this.B.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.n(this));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.LoginPasswordReset.h()) {
            this.f154782g.setVisibility(8);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.os.Bundle bundleExtra;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1024 && intent != null) {
            if (i18 == -1) {
                java.lang.String stringExtra = intent.getStringExtra("VoiceLoginAuthPwd");
                intent.getIntExtra("KVoiceHelpCode", 0);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
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
            objArr[0] = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2));
            objArr[1] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2) ? 0 : stringExtra2.length());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginHistoryUI", "hy: onActivityResult, do faceprint auth, authPwd is null:%b, authPwd.len:%d", objArr);
            this.C = stringExtra2;
            X6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginHistoryUI", "AccountSyncApplication.modelCallback %s", ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi());
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        com.p314xaae8f345.mm.ui.vb.e();
        this.f154798z = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0);
        mo43517x10010bd5();
        this.A = new x51.f();
        java.lang.String stringExtra = getIntent().getStringExtra("login_sessionid");
        if (stringExtra != null) {
            this.H = stringExtra;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginHistoryUI", "onDestroy");
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        x51.f fVar = this.A;
        if (fVar != null) {
            fVar.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        int[] iArr = this.I;
        g0Var.d(14262, java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]), java.lang.Integer.valueOf(iArr[2]), java.lang.Integer.valueOf(iArr[3]), java.lang.Integer.valueOf(iArr[4]));
        android.app.ProgressDialog progressDialog = this.f154786n;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f154786n = null;
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            Y6();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f154778J.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        V6();
        this.f154778J.mo48813x58998cd();
        gm0.j1.b();
        gm0.j1.i();
        gm0.j1.b().f354788r = "";
        gm0.j1.i();
        ((java.util.HashMap) gm0.j1.b().f354789s).clear();
        if (gm0.j1.a() && gm0.j1.b().f354787q && !this.f154796x.equals("")) {
            android.app.ProgressDialog progressDialog = this.f154786n;
            if (progressDialog == null || !progressDialog.isShowing()) {
                d7(null);
                return;
            }
            return;
        }
        if (gq.a.a() == 2) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
            aVar.f293242a = of5.b.a(this).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572430b72);
            aVar.f293262s = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572429b71);
            aVar.A = false;
            aVar.f293265v = of5.b.a(this).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572428b70);
            aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k0(this);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(this, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
            j0Var.e(aVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
            if (d0Var != null) {
                d0Var.a(j0Var.f293370r);
            }
            j0Var.show();
            android.preference.PreferenceManager.getDefaultSharedPreferences(this).edit().putLong("db_check_tip_time", java.lang.System.currentTimeMillis()).commit();
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginHistoryUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Scene Type ");
        sb6.append(m1Var.mo808xfb85f7b0());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginHistoryUI", sb6.toString());
        boolean z17 = true;
        if (m1Var.mo808xfb85f7b0() == 145) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.q3.b(m1Var)) {
                return;
            }
            android.app.ProgressDialog progressDialog = this.f154786n;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f154786n.dismiss();
                this.f154786n = null;
            }
            h11.e eVar = (h11.e) m1Var;
            int M = eVar.M();
            if (M == 13) {
                if (i18 == -36) {
                    tm.a b17 = tm.a.b(str);
                    if (eVar.H() == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginHistoryUI", "login check state, sms up");
                        if (b17 != null) {
                            b17.c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.p(this), null);
                            return;
                        }
                        db5.e1.u(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ght), "", new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.q(this), null);
                    } else {
                        if (b17 != null) {
                            b17.c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.r(this), null);
                            return;
                        }
                        b7(this.f154792t);
                    }
                }
            } else if (M == 16) {
                if (i18 == -41) {
                    db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.hwi, com.p314xaae8f345.mm.R.C30867xcad56011.hwj);
                    return;
                } else if (i18 == -75) {
                    db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571530hz), "");
                    return;
                } else if (i18 == -106) {
                    x51.i1.c(this, str, 32045);
                    return;
                }
            } else if (M == 17) {
                if (i17 == 0 && i18 == 0) {
                    new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fa(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.s(this), eVar.Q(), eVar.P(), this.f154792t).b(this);
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
        } else if (m1Var.mo808xfb85f7b0() == 252 || m1Var.mo808xfb85f7b0() == 701) {
            com.p314xaae8f345.mm.p957x53236a1b.v0 v0Var = (com.p314xaae8f345.mm.p957x53236a1b.v0) m1Var;
            this.f154789q = v0Var.H();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LoginHistoryUI", "url " + this.f154789q);
            gm0.j1.d().q(701, this);
            gm0.j1.d().q(252, this);
            int N = v0Var.N();
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 w6Var = this.f154788p;
            w6Var.f155825h = N;
            w6Var.f155822e = v0Var.M();
            w6Var.f155824g = v0Var.K();
            w6Var.f155823f = v0Var.L();
            if (i18 == -205) {
                this.f154790r = v0Var.I();
                this.f154792t = v0Var.R();
                this.f154793u = v0Var.J();
            }
            if (i17 == 4 && (i18 == -16 || i18 == -17)) {
                gm0.j1.d().g(new c01.ra(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.t(this), null));
            } else {
                z17 = false;
            }
            if (z17 || (i17 == 0 && i18 == 0)) {
                gm0.m.E();
                x51.i1.a(this, w6Var.f155819b);
                android.app.ProgressDialog progressDialog2 = this.f154786n;
                if (progressDialog2 != null && progressDialog2.isShowing()) {
                    this.f154786n.setMessage(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx));
                }
                d7(v0Var);
                if (com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A()) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6621xa57cb26b c6621xa57cb26b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6621xa57cb26b();
                    c6621xa57cb26b.f139743d = 2L;
                    c6621xa57cb26b.k();
                }
                if (this.G == 8) {
                    this.D = v0Var.V();
                    if (v0Var.S()) {
                        boolean z18 = this.D;
                        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11463xc681e6dc.class);
                        intent.putExtra("kintent_hint", getString(com.p314xaae8f345.mm.R.C30867xcad56011.itc));
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
            android.app.ProgressDialog progressDialog3 = this.f154786n;
            if (progressDialog3 != null && progressDialog3.isShowing()) {
                this.f154786n.dismiss();
                this.f154786n = null;
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
                    android.widget.Toast.makeText(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fbu, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
                }
            }
        }
        a7(i17, i18, str);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity
    public void setRequestedOrientation(int i17) {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(j71.a.class);
    }
}
