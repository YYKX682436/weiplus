package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

@db5.a(m123858x6ac9171 = 147)
/* renamed from: com.tencent.mm.plugin.account.ui.LoginHistoryUI */
/* loaded from: classes14.dex */
public class ActivityC11413x78c85cdf extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f154856y0 = 0;
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
    public android.widget.LinearLayout f154857J;
    public android.widget.LinearLayout K;
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b L;
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905 M;
    public android.widget.Button N;
    public boolean Q;
    public int R;
    public int S;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f154858d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f154859e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.sdk.p1015x373aa5.C11389x36418bdf f154860f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f154861g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f154862h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f154863i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f154864m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f154865n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f154866o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f154867p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f154869q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.Button f154870r;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f154875w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f154876x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f154878y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f154879z;

    /* renamed from: s, reason: collision with root package name */
    public android.app.ProgressDialog f154871s = null;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db f154872t = null;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 f154873u = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6();

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f154874v = "";
    public java.lang.String P = "";
    public int T = -1;
    public boolean U = false;
    public final java.util.List V = new java.util.ArrayList();
    public final java.util.Map W = new java.util.HashMap();
    public final java.lang.String X = "";
    public boolean Y = false;
    public final int[] Z = new int[5];

    /* renamed from: p0, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f154868p0 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370>(this, com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.account.ui.LoginHistoryUI.1
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
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/account/ui/LoginHistoryUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    /* renamed from: x0, reason: collision with root package name */
    public int f154877x0 = 0;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf activityC11413x78c85cdf) {
        k7(activityC11413x78c85cdf.mo55332x76847179(), activityC11413x78c85cdf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8n) + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d());
    }

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf activityC11413x78c85cdf, java.lang.String str) {
        activityC11413x78c85cdf.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginHistoryUI", "requestSms %s", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        h11.e eVar = new h11.e(str, 16, "", 0, "");
        gm0.j1.d().g(eVar);
        activityC11413x78c85cdf.f154871s = db5.e1.Q(activityC11413x78c85cdf, activityC11413x78c85cdf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC11413x78c85cdf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.n4(activityC11413x78c85cdf, eVar));
    }

    public static void k7(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("KRightBtn", true);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        j45.l.n(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, 327);
    }

    public void V6() {
        gm0.j1.d().a(701, this);
        gm0.j1.d().a(252, this);
    }

    public void W6(android.widget.Button button) {
        java.util.List list = this.V;
        if (((java.util.ArrayList) list).size() > 1) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this, 1, false);
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.d5(this);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.e5(this);
            k0Var.f293387d = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.f5(this);
            button.setVisibility(0);
            button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.p2i);
            button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.g5(this, k0Var));
            return;
        }
        if (((java.util.ArrayList) list).size() <= 0) {
            button.setVisibility(8);
            return;
        }
        if (e7() && 7013 == ((db5.h4) ((java.util.ArrayList) list).get(0)).f309899g && button.getVisibility() == 8) {
            q61.j.g(1, 0);
        }
        button.setVisibility(0);
        button.setText(((db5.h4) ((java.util.ArrayList) list).get(0)).getTitle());
        button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.h5(this));
    }

    public void X6() {
        java.util.List list = this.V;
        ((java.util.ArrayList) list).clear();
        if ((!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetSecurityVoicePrint.h()) && this.T != 4 && (this.R & 131072) != 0) {
            db5.h4 h4Var = new db5.h4(this, com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14480xb9cc8658, 0);
            h4Var.f309909t = com.p314xaae8f345.mm.R.C30867xcad56011.gia;
            ((java.util.ArrayList) list).add(h4Var);
        }
        if (this.T != 2) {
            if (((vd0.v1) ((wd0.j1) i95.n0.c(wd0.j1.class))).Ri(this.E)) {
                db5.h4 h4Var2 = new db5.h4(this, 7005, 0);
                h4Var2.f309909t = com.p314xaae8f345.mm.R.C30867xcad56011.gi8;
                ((java.util.ArrayList) list).add(h4Var2);
            }
        }
        if (e7() && this.T != 3) {
            db5.h4 h4Var3 = new db5.h4(this, 7013, 0);
            h4Var3.f309909t = com.p314xaae8f345.mm.R.C30867xcad56011.pah;
            ((java.util.ArrayList) list).add(h4Var3);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.C)) {
            if (this.T != 7) {
                db5.h4 h4Var4 = new db5.h4(this, 7007, 0);
                h4Var4.f309901i = getString(com.p314xaae8f345.mm.R.C30867xcad56011.gi9);
                ((java.util.ArrayList) list).add(h4Var4);
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154878y) && this.T != 8) {
                db5.h4 h4Var5 = new db5.h4(this, 7008, 0);
                h4Var5.f309901i = getString(com.p314xaae8f345.mm.R.C30867xcad56011.gi_);
                ((java.util.ArrayList) list).add(h4Var5);
            }
            if (this.C.equalsIgnoreCase(this.f154876x)) {
                this.f154859e.setHint(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hxj));
            }
        }
        W6(this.f154861g);
    }

    public android.graphics.Bitmap Y6(android.graphics.Bitmap bitmap) {
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
        yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u5.f34506x24728b, "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.u5.f34506x24728b, "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        return createBitmap;
    }

    public void Z6() {
        this.f154873u.f155819b = this.C.trim();
    }

    public java.lang.String a7(java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c5 c5Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.c5();
        if (this.C.startsWith("+")) {
            str = str.replace("+", "");
            str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.c(str);
            if (str2 != null) {
                str = str.substring(str2.length());
            }
        } else {
            str2 = "86";
        }
        return c5Var.f(str2, str);
    }

    public final void b7() {
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.b(this);
        b17.addFlags(67108864);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.A)) {
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
        k7(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.mtg) + com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d());
    }

    public boolean d7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.sdk.p1015x373aa5.C11389x36418bdf c11389x36418bdf = this.f154860f;
        if (c11389x36418bdf == null || c11389x36418bdf.f154727x) {
            return false;
        }
        android.widget.EditText editText = this.f154859e;
        return (editText == null || !editText.isFocused() || this.f154859e.getText().length() <= 0) && !mo78538xecd98af8();
    }

    public boolean e7() {
        if (this.T != 3 && q61.j.f441794a.a() && q61.j.f441795b) {
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
            intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11444x1cfdebbd.class);
            intent.putExtra("login_type", 4);
            intent.putExtra("login_sessionid", str);
        } else if (i17 != 7013) {
            switch (i17) {
                case 7005:
                    intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.class);
                    intent.putExtra("login_sessionid", str);
                    intent.putExtra("login_type", 2);
                    break;
                case 7006:
                    intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11409x9a874e5a.class);
                    intent.putExtra("login_type", 5);
                    break;
                case 7007:
                    intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.class);
                    intent.putExtra("login_sessionid", str);
                    intent.putExtra("login_type", 7);
                    break;
                case 7008:
                    intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11435xdfb0be4.class);
                    intent.putExtra("login_sessionid", str);
                    intent.putExtra("login_type", 8);
                    break;
                default:
                    intent = null;
                    break;
            }
        } else {
            intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98.class);
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
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.i5(this), 300L);
            db5.f.h(this);
        }
    }

    public void g7(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.sdk.p1015x373aa5.C11389x36418bdf c11389x36418bdf = this.f154860f;
        if (c11389x36418bdf == null || c11389x36418bdf.f154727x == z17) {
            return;
        }
        c11389x36418bdf.A(z17);
        if (!z17) {
            this.f154860f.B(com.p314xaae8f345.mm.R.C30867xcad56011.gi7);
            android.view.ViewGroup.LayoutParams layoutParams = this.f154860f.getLayoutParams();
            layoutParams.width = -2;
            this.f154860f.setLayoutParams(layoutParams);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.class)).P6();
            android.widget.EditText editText = this.f154859e;
            if (editText != null) {
                editText.setEnabled(true);
                return;
            }
            return;
        }
        int width = this.f154860f.getWidth();
        this.f154860f.C(com.p314xaae8f345.mm.R.C30867xcad56011.p2r, false);
        android.view.ViewGroup.LayoutParams layoutParams2 = this.f154860f.getLayoutParams();
        layoutParams2.width = width;
        this.f154860f.setLayoutParams(layoutParams2);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.class)).O6();
        android.widget.EditText editText2 = this.f154859e;
        if (editText2 != null) {
            editText2.clearFocus();
            this.f154859e.setEnabled(false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bsz;
    }

    public boolean h7(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var;
        java.lang.String str2;
        if (i17 == 4) {
            if (i18 != -2023) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 w6Var = this.f154873u;
                if (i18 == -205) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginHistoryUI", "summerphone MM_ERR_QQ_OK_NEED_MOBILE authTicket[%s], closeShowStyle[%s]", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(this.f154875w), this.f154879z);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6.f155818i = w6Var;
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("auth_ticket", this.f154875w);
                    intent.putExtra("binded_mobile", this.f154878y);
                    intent.putExtra("close_safe_device_style", this.f154879z);
                    intent.putExtra("from_source", 2);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.C(this, intent);
                    return true;
                }
                if (i18 == -140) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f154874v)) {
                        x51.i1.e(this, str, this.f154874v);
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
                    if (i18 == -9) {
                        db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.f573936gi0, com.p314xaae8f345.mm.R.C30867xcad56011.f573937gi1);
                        return true;
                    }
                    if (i18 != -6) {
                        if (i18 == -3) {
                            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "e", null);
                            if ((d17 != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".e.ShowType"), 0) : 0) == 6) {
                                if ((this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98) || (this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11435xdfb0be4)) {
                                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("password_invalid_float", "view_exp", this.W, 34575);
                                }
                                db5.e1.A(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.nrg), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.nro), getString(com.p314xaae8f345.mm.R.C30867xcad56011.c1v), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.DialogInterfaceOnClickListenerC11414x9c700ea2(), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.account.ui.LoginHistoryUI$$b
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(android.content.DialogInterface dialogInterface, int i19) {
                                        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf.f154856y0;
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf activityC11413x78c85cdf = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf.this;
                                        activityC11413x78c85cdf.getClass();
                                        if ((activityC11413x78c85cdf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98) || (activityC11413x78c85cdf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11435xdfb0be4)) {
                                            v61.d.g("login_forget_password_float", 1);
                                        }
                                        activityC11413x78c85cdf.c7();
                                    }
                                });
                            } else {
                                int i19 = this.f154877x0;
                                if (i19 < 1) {
                                    this.f154877x0 = i19 + 1;
                                    tm.a b17 = tm.a.b(str);
                                    if (b17 != null) {
                                        b17.c(this, null, null);
                                        return true;
                                    }
                                    db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.c1t, com.p314xaae8f345.mm.R.C30867xcad56011.f573937gi1);
                                } else {
                                    db5.e1.A(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.c1u), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573937gi1), getString(com.p314xaae8f345.mm.R.C30867xcad56011.c1v), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.v4(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w4(this));
                                }
                            }
                            return true;
                        }
                        if (i18 == -1) {
                            if (gm0.j1.d().n() == 5) {
                                db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.h7l, com.p314xaae8f345.mm.R.C30867xcad56011.h7k);
                            } else {
                                db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.f573829mt1, com.p314xaae8f345.mm.R.C30867xcad56011.f573937gi1);
                            }
                            return true;
                        }
                        if (i18 != -311 && i18 != -310) {
                            if (i18 == -33) {
                                db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.ahi, com.p314xaae8f345.mm.R.C30867xcad56011.aho, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.y4(this));
                                return true;
                            }
                            if (i18 == -32) {
                                db5.e1.t(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ahk), "", new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.x4(this));
                                return true;
                            }
                        }
                    }
                    gm0.j1.d().a(701, this);
                    gm0.j1.d().a(252, this);
                    if (this.f154872t == null) {
                        this.f154872t = bb5.j.a(this, com.p314xaae8f345.mm.R.C30867xcad56011.hxl, w6Var.f155825h, w6Var.f155824g, w6Var.f155822e, w6Var.f155823f, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.z4(this, i17), null, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.a5(this), w6Var);
                    } else {
                        java.lang.String str3 = w6Var.f155822e;
                        int length = w6Var.f155824g.length;
                        fp.k.c();
                        this.f154872t.b(w6Var.f155825h, w6Var.f155824g, w6Var.f155822e, w6Var.f155823f);
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
            if (android.text.TextUtils.isEmpty(gm0.m.f354768x)) {
                str2 = i65.a.r(this, com.p314xaae8f345.mm.R.C30867xcad56011.gqn);
            } else {
                gm0.j1.b();
                str2 = gm0.m.f354768x;
            }
            db5.e1.M(this, str2, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.b5(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.c5(this));
            return true;
        }
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        if (!com.p314xaae8f345.mm.ui.pc.a(this, i17, i18, str, 4)) {
            return this.H.c(this, new x51.r1(i17, i18, str));
        }
        com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db c21463x46cf9db = this.f154872t;
        if (c21463x46cf9db != null && (j0Var = c21463x46cf9db.f278731n) != null) {
            j0Var.dismiss();
            c21463x46cf9db.f278731n = null;
        }
        return true;
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

    public void i7() {
        java.util.HashMap hashMap = new java.util.HashMap(this.W);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Q0(this.C).booleanValue() || this.C.equals(this.f154876x)) {
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

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.I = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.p6b);
        this.K = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.do9);
        this.f154857J = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.g5u);
        this.L = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21490xb2dd0b6b) findViewById(com.p314xaae8f345.mm.R.id.ipa);
        this.M = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905) findViewById(com.p314xaae8f345.mm.R.id.f568500n16);
        java.lang.String stringExtra = getIntent().getStringExtra("switch_login_wx_id");
        this.A = stringExtra;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            m78560xe21cbbf(false);
            c01.b9 b9Var = c01.b9.f118602c;
            this.C = b9Var.a("login_user_name", "");
            this.F = b9Var.a("last_avatar_path", "");
            this.S = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(b9Var.a("last_bind_info", ""), 0);
            this.D = b9Var.a("last_login_alias", "");
            this.E = b9Var.a("login_weixin_username", "");
            if ((this.S & 1) != 0) {
                this.f154876x = b9Var.a("last_login_bind_qq", "");
            }
            if ((this.S & 4) != 0) {
                this.f154878y = b9Var.a("last_login_bind_mobile", "");
            }
            this.R = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(b9Var.a("last_login_use_voice", ""), 0);
        } else {
            java.lang.String str = this.A;
            this.E = str;
            c01.uc ucVar = c01.uc.f119047c;
            this.C = ucVar.c(str, "login_user_name");
            this.F = ucVar.c(this.A, "last_avatar_path");
            this.S = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(ucVar.c(this.A, "last_bind_info"), 0);
            this.D = ucVar.c(this.A, "last_login_alias");
            if ((this.S & 1) != 0) {
                this.f154876x = ucVar.c(this.A, "last_login_bind_qq");
            }
            if ((this.S & 4) != 0) {
                this.f154878y = ucVar.c(this.A, "last_login_bind_mobile");
            }
            this.R = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(ucVar.c(this.A, "last_login_use_voice"), 0);
            mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k5(this), com.p314xaae8f345.mm.R.raw.f78350xe9269a14);
        }
        this.B = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f567010ht4);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.F)) {
            try {
                kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
                java.lang.String str2 = this.F;
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
                android.graphics.Bitmap h17 = com.p314xaae8f345.mm.p943x351df9c2.z.h(str2, null, false);
                if (h17 != null && h17.getWidth() > 10) {
                    this.B.setImageBitmap(Y6(h17));
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LoginHistoryUI", e17, "get avatar error", new java.lang.Object[0]);
            }
        }
        this.f154858d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.iod);
        this.f154859e = this.L.m78930xd454f3ba();
        this.f154860f = (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.sdk.p1015x373aa5.C11389x36418bdf) findViewById(com.p314xaae8f345.mm.R.id.iol);
        this.f154863i = findViewById(com.p314xaae8f345.mm.R.id.ipg);
        this.f154864m = findViewById(com.p314xaae8f345.mm.R.id.f567232ip2);
        this.f154865n = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f568456mw2);
        this.f154861g = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.iox);
        this.f154862h = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.ucz);
        this.N = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.iog);
        this.f154866o = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f567236ip3);
        this.f154867p = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f567238ud3);
        this.f154869q = findViewById(com.p314xaae8f345.mm.R.id.ugl);
        this.f154870r = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.ip9);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 c22607x763d2049 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049) findViewById(com.p314xaae8f345.mm.R.id.f78277xe59a1298);
        if (c22607x763d2049 != null) {
            c22607x763d2049.e(new al5.e0() { // from class: com.tencent.mm.plugin.account.ui.LoginHistoryUI$$c
                @Override // al5.e0
                public final void J2(boolean z17, int i17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf activityC11413x78c85cdf = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf.this;
                    if (z17) {
                        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf.f154856y0;
                        activityC11413x78c85cdf.getClass();
                    } else if (activityC11413x78c85cdf.U) {
                        activityC11413x78c85cdf.U = false;
                        activityC11413x78c85cdf.f7(((db5.h4) ((java.util.ArrayList) activityC11413x78c85cdf.V).get(0)).f309899g);
                    }
                }
            });
        }
        boolean c17 = com.p314xaae8f345.mm.ui.b4.c(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginHistoryUI", "setupImeInsetsForEdgeToEdge isTargetSDKVersionOver35=%b", java.lang.Boolean.valueOf(c17));
        if (c17) {
            android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.f78278x5eba1220);
            if (scrollView == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LoginHistoryUI", "setupImeInsetsForEdgeToEdge scrollView not found");
            } else {
                final int paddingBottom = scrollView.getPaddingBottom();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginHistoryUI", "setupImeInsetsForEdgeToEdge originalPaddingBottom=%d", java.lang.Integer.valueOf(paddingBottom));
                n3.k0 k0Var = new n3.k0() { // from class: com.tencent.mm.plugin.account.ui.LoginHistoryUI$$d
                    @Override // n3.k0
                    public final n3.g3 a(android.view.View view, n3.g3 g3Var) {
                        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf.f154856y0;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf activityC11413x78c85cdf = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11413x78c85cdf.this;
                        activityC11413x78c85cdf.getClass();
                        int i18 = g3Var.a(8).f328580d;
                        int i19 = g3Var.a(2).f328580d;
                        int max = java.lang.Math.max(i18, i19);
                        boolean z17 = max > 300 && gh5.d.b(activityC11413x78c85cdf);
                        int max2 = java.lang.Math.max(max, 0);
                        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
                        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
                        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i19);
                        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(max2);
                        int i27 = paddingBottom;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginHistoryUI", "setupImeInsetsForEdgeToEdge onApplyWindowInsets imeVisible=%b, imeHeight=%d, navBarHeight=%d, imeOffset=%d originalPaddingBottom=%d", valueOf, valueOf2, valueOf3, valueOf4, java.lang.Integer.valueOf(i27));
                        if (z17) {
                            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i27 + max2);
                        } else {
                            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i27);
                        }
                        return g3Var;
                    }
                };
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                n3.a1.u(scrollView, k0Var);
            }
        }
        com.p314xaae8f345.mm.ui.dl.i(this.f154866o.getPaint());
        com.p314xaae8f345.mm.ui.dl.i(this.f154867p.getPaint());
        com.p314xaae8f345.mm.ui.dl.i(this.f154870r.getPaint());
        this.f154866o.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.l5(this));
        v61.d.i(this.f154866o, "login_forget_password", 1);
        this.f154867p.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m5(this));
        this.L.setVisibility(8);
        this.I.setVisibility(8);
        this.K.setVisibility(8);
        this.f154857J.setVisibility(8);
        this.f154860f.setVisibility(8);
        android.view.View view = this.f154863i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f154864m;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f154865n;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f154861g.setVisibility(8);
        this.f154862h.setVisibility(8);
        com.p314xaae8f345.mm.ui.dl.i(this.f154861g.getPaint());
        ck5.f b17 = ck5.f.b(this.f154859e);
        b17.f124094f = 4;
        b17.f124093e = 16;
        b17.d(null);
        boolean booleanValue = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Q0(this.C).booleanValue();
        int[] iArr = this.Z;
        if (!booleanValue || this.C.equals(this.f154876x)) {
            iArr[2] = 2;
            this.f154858d.setText(this.C);
        } else {
            iArr[2] = 1;
            this.f154858d.setText(a7(this.C));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this, 1, false);
        k0Var2.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.n5(this);
        k0Var2.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.o5(this);
        k0Var2.f293387d = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.p5(this);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.A)) {
            this.f154870r.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.j4(this, k0Var2));
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.m()) {
            this.f154870r.setText(com.p314xaae8f345.mm.R.C30867xcad56011.l8m);
            this.f154870r.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.l4(this));
        } else {
            this.f154870r.setText(com.p314xaae8f345.mm.R.C30867xcad56011.l8j);
            this.f154870r.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k4(this));
        }
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
        mo78530x8b45058f();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273980j) {
            ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
            com.p314xaae8f345.mm.ui.vb.j(this, null);
        }
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (com.p314xaae8f345.mm.ui.bk.A() || com.p314xaae8f345.mm.ui.bk.Q()) {
            v61.g0 g0Var = v61.h0.f514974a;
            v61.h0.a(this.N, this);
            if (com.p314xaae8f345.mm.ui.bk.A() && !com.p314xaae8f345.mm.ui.bk.Q()) {
                this.N.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573940gi4));
            } else if (com.p314xaae8f345.mm.ui.bk.Q()) {
                this.N.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fe_));
            } else {
                this.N.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gh_));
            }
            this.N.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.m4(this));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.LoginPasswordReset.h()) {
            this.f154866o.setVisibility(8);
        }
    }

    public final void j7(com.p314xaae8f345.mm.p957x53236a1b.v0 v0Var) {
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
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "startLauncher", "(Lcom/tencent/mm/modelsimple/NetSceneManualAuth;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "startLauncher", "(Lcom/tencent/mm/modelsimple/NetSceneManualAuth;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    public final void l7() {
        this.Z[4] = 1;
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc.class);
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

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.os.Bundle bundleExtra;
        android.os.Bundle bundleExtra2;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1024 && intent != null) {
            if (i18 == -1) {
                java.lang.String stringExtra = intent.getStringExtra("VoiceLoginAuthPwd");
                intent.getIntExtra("KVoiceHelpCode", 0);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
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
                objArr[0] = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2));
                objArr[1] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2) ? 0 : stringExtra2.length());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginHistoryUI", "hy: onActivityResult, do faceprint auth, authPwd is null:%b, authPwd.len:%d", objArr);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginHistoryUI", "[Security Center Login] onActivityResult requestCode:" + i17 + ",resultCode:" + i18 + ", resData: " + string);
        if (string == null || !string.equals("jump_to_phone_num_verify")) {
            return;
        }
        l7();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        v61.d.f(1);
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginHistoryUI", "AccountSyncApplication.modelCallback %s", ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi());
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        com.p314xaae8f345.mm.ui.vb.e();
        this.G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0);
        android.content.Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("login_success_need_bind_fingerprint", false)) {
            intent.getStringExtra("bind_login_fingerprint_info");
        }
        mo43517x10010bd5();
        this.H = new x51.f();
        v61.d.e(1);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.class)).V6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginHistoryUI", "onDestroy");
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        x51.f fVar = this.H;
        if (fVar != null) {
            fVar.a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        int[] iArr = this.Z;
        g0Var.d(14262, java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]), java.lang.Integer.valueOf(iArr[2]), java.lang.Integer.valueOf(iArr[3]), java.lang.Integer.valueOf(iArr[4]));
        android.app.ProgressDialog progressDialog = this.f154871s;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f154871s = null;
        }
        g7(false);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            b7();
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f154868p0.mo48814x2efc64();
        mo48674x36654fab();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        X6();
        this.f154868p0.mo48813x58998cd();
        gm0.j1.b();
        gm0.j1.i();
        gm0.j1.b().f354788r = "";
        gm0.j1.i();
        ((java.util.HashMap) gm0.j1.b().f354789s).clear();
        if (gm0.j1.a() && gm0.j1.b().f354787q && !this.C.equals("")) {
            android.app.ProgressDialog progressDialog = this.f154871s;
            if (progressDialog == null || !progressDialog.isShowing()) {
                j7(null);
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
            aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.j5(this);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(this, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
            j0Var.e(aVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
            if (d0Var != null) {
                d0Var.a(j0Var.f293370r);
            }
            j0Var.show();
            android.preference.PreferenceManager.getDefaultSharedPreferences(this).edit().putLong("db_check_tip_time", java.lang.System.currentTimeMillis()).commit();
        }
        v61.d.e(1);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginHistoryUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Scene Type ");
        sb6.append(m1Var.mo808xfb85f7b0());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginHistoryUI", sb6.toString());
        if (m1Var.mo808xfb85f7b0() == 145) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.q3.b(m1Var)) {
                return;
            }
            android.app.ProgressDialog progressDialog = this.f154871s;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f154871s.dismiss();
                this.f154871s = null;
            }
            g7(false);
            h11.e eVar = (h11.e) m1Var;
            int M = eVar.M();
            if (M == 13) {
                if (i18 == -36) {
                    tm.a b17 = tm.a.b(str);
                    if (eVar.H() == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginHistoryUI", "login check state, sms up");
                        if (b17 != null) {
                            b17.c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.o4(this), null);
                            return;
                        }
                        db5.e1.u(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.ght), "", new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.p4(this), null);
                    } else {
                        if (b17 != null) {
                            b17.c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.q4(this), null);
                            return;
                        }
                        db5.e1.u(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hxd) + com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.h(this.f154878y), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hxe), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.r4(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.s4(this));
                    }
                }
                if (i18 == -106) {
                    this.M.b();
                    x51.i1.c(this, str, 32044);
                    return;
                }
            } else if (M == 16) {
                if (i18 == -41) {
                    db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.hwi, com.p314xaae8f345.mm.R.C30867xcad56011.hwj);
                    this.M.b();
                    return;
                } else if (i18 == -75) {
                    db5.e1.s(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571530hz), "");
                    this.M.b();
                    return;
                } else if (i18 == -106) {
                    x51.i1.c(this, str, 32045);
                    this.M.b();
                    return;
                }
            } else if (M == 17) {
                if (i17 == 0 && i18 == 0) {
                    new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fa(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.t4(this), eVar.Q(), eVar.P(), this.f154878y).b(this);
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
        } else if (m1Var.mo808xfb85f7b0() == 252 || m1Var.mo808xfb85f7b0() == 701) {
            com.p314xaae8f345.mm.p957x53236a1b.v0 v0Var = (com.p314xaae8f345.mm.p957x53236a1b.v0) m1Var;
            this.f154874v = v0Var.H();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LoginHistoryUI", "url " + this.f154874v);
            gm0.j1.d().q(701, this);
            gm0.j1.d().q(252, this);
            int N = v0Var.N();
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 w6Var = this.f154873u;
            w6Var.f155825h = N;
            w6Var.f155822e = v0Var.M();
            w6Var.f155824g = v0Var.K();
            w6Var.f155823f = v0Var.L();
            if (i18 == -205) {
                this.f154875w = v0Var.I();
                this.f154878y = v0Var.R();
                this.f154879z = v0Var.J();
            }
            if (i17 == 4 && (i18 == -16 || i18 == -17)) {
                gm0.j1.d().g(new c01.ra(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.u4(this), null));
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17 || (i17 == 0 && i18 == 0)) {
                gm0.m.E();
                x51.i1.a(this, w6Var.f155819b);
                android.app.ProgressDialog progressDialog2 = this.f154871s;
                if (progressDialog2 != null && progressDialog2.isShowing()) {
                    this.f154871s.setMessage(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx));
                }
                if ((this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11419x78fe9e98) || (this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11435xdfb0be4)) {
                    java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry("login_sessionid", this.X), new java.util.AbstractMap.SimpleEntry(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52908x661c1030, wo.w0.k()), new java.util.AbstractMap.SimpleEntry("login_method", 2), new java.util.AbstractMap.SimpleEntry(dm.i4.f66875xa013b0d5, w6Var.f155819b)};
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
                    ((l71.e) ((js.z0) i95.n0.c(js.z0.class))).f398362d = hashMap2;
                    int i27 = this.T;
                    v61.d.c(1, i27 != 1 ? i27 != 2 ? i27 != 4 ? i27 != 6 ? 0 : 12 : 11 : 10 : 8);
                    if (this.T == 3) {
                        q61.j.e(q61.j.f441801h, 2, 1, 0, 0);
                    }
                }
                j7(v0Var);
                v61.d.f(1);
                if (this.T == 8) {
                    this.Q = v0Var.V();
                    if (v0Var.S()) {
                        boolean z18 = this.Q;
                        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11463xc681e6dc.class);
                        intent.putExtra("kintent_hint", getString(com.p314xaae8f345.mm.R.C30867xcad56011.itc));
                        intent.putExtra("kintent_cancelable", z18);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "goToSetIndepPwd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/LoginHistoryUI", "goToSetIndepPwd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }
                if (com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A()) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6621xa57cb26b c6621xa57cb26b = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6621xa57cb26b();
                    c6621xa57cb26b.f139743d = 2L;
                    c6621xa57cb26b.k();
                    return;
                }
                return;
            }
            if (this.T == 3) {
                q61.j.e(q61.j.f441801h, 2, 3, 0, 3);
            }
            android.app.ProgressDialog progressDialog3 = this.f154871s;
            if (progressDialog3 != null && progressDialog3.isShowing()) {
                this.f154871s.dismiss();
                this.f154871s = null;
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
                    dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fbu, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
                }
            }
        }
        h7(i17, i18, str);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, android.app.Activity
    public void setRequestedOrientation(int i17) {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(vm3.d.class);
        hashSet.add(j71.a.class);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.k3.class);
    }
}
