package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class b5 implements dx4.g {

    /* renamed from: r, reason: collision with root package name */
    public static byte[] f265458r;

    /* renamed from: s, reason: collision with root package name */
    public static java.lang.String f265459s;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f265460t;

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.Map f265461u = new java.util.HashMap();

    /* renamed from: v, reason: collision with root package name */
    public static final java.util.Map f265462v = new java.util.HashMap();

    /* renamed from: w, reason: collision with root package name */
    public static long f265463w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static long f265464x = 0;

    /* renamed from: y, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f265465y;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f265467b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.d1 f265468c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.d1 f265469d;

    /* renamed from: e, reason: collision with root package name */
    public hy4.s f265470e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f265471f;

    /* renamed from: g, reason: collision with root package name */
    public final kd0.p2 f265472g;

    /* renamed from: h, reason: collision with root package name */
    public hy4.h0 f265473h;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.ref.WeakReference f265479n;

    /* renamed from: o, reason: collision with root package name */
    public dx4.f f265480o;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f265466a = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f265474i = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f265475j = new java.util.HashMap();

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Long f265476k = 0L;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.Long f265477l = 0L;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Long f265478m = 0L;

    /* renamed from: p, reason: collision with root package name */
    public final hy4.r f265481p = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.k5(this);

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g f265482q = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.j5(this);

    public b5(dx4.f fVar) {
        this.f265479n = new java.lang.ref.WeakReference(fVar.mo74476x76847179());
        this.f265480o = fVar;
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        android.app.Activity mo74476x76847179 = fVar.mo74476x76847179();
        kd0.n2 n2Var = new kd0.n2() { // from class: com.tencent.mm.plugin.webview.ui.tools.b5$$a
            @Override // kd0.n2
            public final void a() {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 b5Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5.this;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = b5Var.f265471f;
                if (k0Var == null || !k0Var.i()) {
                    return;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.l5(b5Var));
            }
        };
        ((jd0.q2) x2Var).getClass();
        this.f265472g = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636(mo74476x76847179, n2Var);
    }

    public static boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 b5Var, android.view.View view) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59;
        com.p314xaae8f345.p3210x3857dc.d1 mo120147x1d5dd38c;
        int i17;
        int i18;
        if (b5Var.q() || (c22633x83752a59 = b5Var.f265480o.mo74477x143f1b92().f263449a) == null) {
            return false;
        }
        try {
            if (view instanceof android.webkit.WebView) {
                com.p314xaae8f345.p3210x3857dc.d1 mo120147x1d5dd38c2 = c22633x83752a59.mo120147x1d5dd38c();
                if (mo120147x1d5dd38c2 != null && ((i18 = mo120147x1d5dd38c2.f301772a) == 5 || i18 == 8)) {
                    b5Var.t(mo120147x1d5dd38c2);
                }
            } else if ((view instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) && (mo120147x1d5dd38c = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) view).mo120147x1d5dd38c()) != null && ((i17 = mo120147x1d5dd38c.f301772a) == 5 || i17 == 8)) {
                b5Var.s(mo120147x1d5dd38c);
            }
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "onCreateContextMenu exp %s", e17.getMessage());
            return false;
        }
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 b5Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a6357) {
        java.lang.String str;
        hy4.h0 h0Var = b5Var.f265473h;
        if (h0Var == null) {
            return;
        }
        dx4.f fVar = b5Var.f265480o;
        if (fVar != null) {
            h0Var.f367641b = b5Var.f265474i;
            h0Var.f367643d = fVar.mo74477x143f1b92().Q();
        }
        if (c17261xe88a6357 != null) {
            hy4.h0 h0Var2 = b5Var.f265473h;
            h0Var2.f367642c = true;
            h0Var2.f367646g = c17261xe88a6357.f240153e == 22 ? "WX_CODE" : "QR_CODE";
            h0Var2.f367645f = c17261xe88a6357.f240152d;
        }
        if (android.webkit.URLUtil.isDataUrl(b5Var.f265467b)) {
            try {
                str = kk.r.b(b5Var.f265467b);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "getSHA1 ex %s", e17.getMessage());
                str = "";
            }
        } else {
            java.lang.String str2 = b5Var.f265467b;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a;
            str = com.p314xaae8f345.mm.sdk.p2603x2137b148.y9.a(str2);
        }
        hy4.h0 h0Var3 = b5Var.f265473h;
        h0Var3.f367647h = str;
        h0Var3.a(i17);
    }

    public static void c(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 b5Var, java.lang.String str, java.lang.Boolean bool) {
        b5Var.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic mResultOfImageUrl nil");
            return;
        }
        try {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f(b5Var.l(), str, b5Var.f265474i, com.p314xaae8f345.p3210x3857dc.d.g().a(str), b5Var.k(), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.i5(b5Var, bool, str));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic Exception:%s", e17.getLocalizedMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic");
    }

    public static void d(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 b5Var, java.lang.String str) {
        b5Var.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.util.HashMap hashMap = b5Var.f265475j;
        if (hashMap.containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewLongClickHelper", "do cancelRecogQBar:" + str);
            try {
                com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19331xad513397(str, ((java.lang.Long) hashMap.get(str)).longValue()), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a6.class, null);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewLongClickHelper", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public static void e(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 b5Var, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a6357) {
        java.lang.String str;
        java.lang.String substring;
        b5Var.getClass();
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("preUsername", b5Var.l().getIntent().getStringExtra("preUsername"));
            bundle.putString("preChatName", b5Var.l().getIntent().getStringExtra("preChatName"));
            bundle.putString("rawUrl", b5Var.f265480o.mo74477x143f1b92().i());
            java.lang.String stringExtra = b5Var.l().getIntent().getStringExtra("pre_username");
            if (stringExtra == null || !b5Var.f265480o.mo74477x143f1b92().A.j8(stringExtra)) {
                bundle.putString("pre_username", b5Var.l().getIntent().getStringExtra(com.p314xaae8f345.mm.ui.w2.f292736p));
            } else {
                bundle.putString("pre_username", stringExtra);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.d O = b5Var.f265480o.mo74477x143f1b92().O();
            int i17 = O.f264924k;
            if (i17 == 0) {
                i17 = O.f264923j;
            }
            bundle.putInt("geta8key_init_request_id", i17);
            java.lang.String str2 = f265459s;
            if (str2 != null && str2.equals(c17261xe88a6357.f240160o) && f265458r != null) {
                java.lang.String Ri = ((jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class))).Ri(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
                com.p314xaae8f345.mm.vfs.w6.R(Ri, f265458r);
                bundle.putString(com.p314xaae8f345.mm.ui.w2.f292737q, Ri);
                f265458r = null;
            }
            int U = b5Var.f265480o.mo74477x143f1b92().U();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var = b5Var.f265480o.mo74477x143f1b92().A;
            java.lang.String str3 = c17261xe88a6357.f240152d;
            java.lang.String str4 = b5Var.f265474i;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                substring = "";
            } else {
                if (str3.length() <= 1024) {
                    str = str3;
                    v0Var.yf(U, str3, str4, str, c17261xe88a6357.f240153e, c17261xe88a6357.f240154f, bundle);
                    f265460t = false;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewLongClickHelper", "onMenuItemClick recognize qbcode, imagePath: %s", c17261xe88a6357.f240160o);
                }
                substring = str3.substring(0, 1024);
            }
            str = substring;
            v0Var.yf(U, str3, str4, str, c17261xe88a6357.f240153e, c17261xe88a6357.f240154f, bundle);
            f265460t = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewLongClickHelper", "onMenuItemClick recognize qbcode, imagePath: %s", c17261xe88a6357.f240160o);
        } catch (android.os.RemoteException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "recognize qbar result failed");
        }
    }

    public static void f(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 b5Var, java.lang.String str) {
        if (b5Var.q()) {
            return;
        }
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            android.content.Intent intent = b5Var.f265480o.mo74476x76847179().getIntent();
            bundle.putString("serverMsgID", intent.getStringExtra("serverMsgID"));
            bundle.putString("geta8key_username", intent.getStringExtra("geta8key_username"));
            bundle.putString("KPublisherReqId", java.lang.String.valueOf(b5Var.f265480o.a()));
            bundle.putString("sns_local_id", intent.getStringExtra("sns_local_id"));
            b5Var.f265480o.mo74477x143f1b92().A.X9(str, b5Var.f265480o.mo74477x143f1b92().U(), bundle);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "sendImgToFriend fail, ex = " + e17.getMessage());
        }
    }

    public static void g(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 b5Var, java.lang.String str) {
        if (b5Var.q()) {
            return;
        }
        try {
            o72.e4 e4Var = (o72.e4) i95.n0.c(o72.e4.class);
            int Sg = b5Var.f265480o.mo74477x143f1b92().A.Sg(str);
            android.app.Activity l17 = b5Var.l();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g gVar = b5Var.f265482q;
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.s1) e4Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.g(Sg, 34, l17, gVar);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "favoriteUrl fail, ex = " + e17.getMessage());
        }
    }

    public r01.h0 h() {
        java.util.Map map = f265462v;
        if (!((java.util.HashMap) map).containsKey(m(this.f265474i))) {
            return new r01.h0("", false, "", "", 0, 0, "", "", "", 0);
        }
        return (r01.h0) ((java.util.HashMap) map).get(m(this.f265474i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0042, code lost:
    
        if (r0.startsWith("http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/s") != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i() {
        /*
            r7 = this;
            java.lang.String r0 = r7.f265474i
            java.lang.String r1 = "/s"
            java.lang.String r2 = "http://"
            java.lang.String r3 = "https://"
            r4 = 0
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)     // Catch: java.lang.Exception -> L46
            if (r5 != 0) goto L50
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L46
            r5.<init>(r3)     // Catch: java.lang.Exception -> L46
            r3 = 2131769611(0x7f10390b, float:1.9170502E38)
            java.lang.String r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(r3)     // Catch: java.lang.Exception -> L46
            r5.append(r6)     // Catch: java.lang.Exception -> L46
            r5.append(r1)     // Catch: java.lang.Exception -> L46
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L46
            boolean r5 = r0.startsWith(r5)     // Catch: java.lang.Exception -> L46
            if (r5 != 0) goto L44
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L46
            r5.<init>(r2)     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(r3)     // Catch: java.lang.Exception -> L46
            r5.append(r2)     // Catch: java.lang.Exception -> L46
            r5.append(r1)     // Catch: java.lang.Exception -> L46
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Exception -> L46
            boolean r0 = r0.startsWith(r1)     // Catch: java.lang.Exception -> L46
            if (r0 == 0) goto L50
        L44:
            r4 = 1
            goto L50
        L46:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "MicroMsg.WebViewLongClickHelper"
            java.lang.String r3 = "isMpUrl"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r0, r3, r1)
        L50:
            if (r4 == 0) goto L54
            r0 = 5
            return r0
        L54:
            r0 = 3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5.i():int");
    }

    public final java.lang.String j() {
        java.lang.String Z = this.f265480o.mo74477x143f1b92().Z();
        this.f265474i = Z;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Z)) {
            this.f265474i = this.f265480o.mo74477x143f1b92().i();
        }
        return this.f265474i;
    }

    public final boolean k() {
        try {
            return this.f265480o.mo74477x143f1b92().A.mo74369xe8158c5e();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "onCreateContextMenu fail, ex = " + e17.getMessage());
            return false;
        }
    }

    public android.app.Activity l() {
        return (android.app.Activity) this.f265479n.get();
    }

    public final java.lang.String m(java.lang.String url) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(url)) {
            return "";
        }
        if (!((url == null || gm0.j1.s(zq1.a0.class) == null) ? false : ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(url))) {
            return url;
        }
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.n(url);
    }

    public void n() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59;
        if (q() || (c22633x83752a59 = this.f265480o.mo74477x143f1b92().f263449a) == null) {
            return;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_long_press_test_enable, 0) == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewLongClickHelper", "WebViewLongPress AB Test Enabled");
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_webview_long_press_menu_duration, 500);
            if (Ni < 150 || Ni > 2500) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewLongClickHelper", "WebViewLongPress  is invalid, time = %d", java.lang.Integer.valueOf(Ni));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewLongClickHelper", "WebViewLongPress Set Time: %d", java.lang.Integer.valueOf(Ni));
                c22633x83752a59.mo120153xd15cf999().a(Ni);
            }
        }
        c22633x83752a59.setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.n5(this, c22633x83752a59));
    }

    public final boolean o() {
        java.lang.String stringExtra = l().getIntent().getStringExtra("sentUsername");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        int k07 = this.f265480o.mo74477x143f1b92().k0(stringExtra);
        if (k07 == 53 || k07 == 52) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewLongClickHelper", "isAllowScanQRCode open link not allow to ScanQRCode");
            return false;
        }
        try {
            if (this.f265480o.mo74477x143f1b92().A != null) {
                return this.f265480o.mo74477x143f1b92().A.Yh();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewLongClickHelper", "invoker is null");
            return false;
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "unable get config for Scan QRCode" + e17.getMessage());
            return false;
        }
    }

    public final boolean p() {
        java.util.Map map = f265461u;
        if (!((java.util.HashMap) map).containsKey(m(this.f265474i))) {
            return false;
        }
        return ((java.lang.Boolean) ((java.util.HashMap) map).get(m(this.f265474i))).booleanValue();
    }

    public boolean q() {
        return l() == null || this.f265480o == null || l().isFinishing();
    }

    public final boolean r(java.lang.String str) {
        if (q()) {
            return false;
        }
        if (!k()) {
            return true;
        }
        this.f265467b = str;
        if (this.f265471f == null) {
            this.f265471f = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) l(), 1, false);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f265471f;
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.o5(this);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p5(this, str);
        k0Var.p(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.q5(this));
        if (!l().isFinishing()) {
            if ((p() && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f265466a)) ? false : true) {
                this.f265471f.v();
            }
        }
        return this.f265471f.i();
    }

    public final boolean s(com.p314xaae8f345.p3210x3857dc.d1 d1Var) {
        boolean r17 = r(d1Var.f301773b);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f265480o.mo74477x143f1b92().f263449a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar = this.f265480o.mo74477x143f1b92().R;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f265466a) && wVar != null && wVar.b().a() && o()) {
            this.f265469d = d1Var;
            hy4.s sVar = new hy4.s();
            this.f265470e = sVar;
            sVar.a(c22633x83752a59, this.f265481p);
        }
        return r17;
    }

    public final boolean t(com.p314xaae8f345.p3210x3857dc.d1 d1Var) {
        boolean r17 = r(d1Var.f301773b);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f265480o.mo74477x143f1b92().f263449a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar = this.f265480o.mo74477x143f1b92().R;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f265466a) && wVar != null && wVar.b().a() && o()) {
            this.f265468c = d1Var;
            hy4.s sVar = new hy4.s();
            this.f265470e = sVar;
            sVar.a(c22633x83752a59, this.f265481p);
        }
        return r17;
    }

    public void u() {
        kd0.p2 p2Var = this.f265472g;
        if (p2Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) p2Var).f240180d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f265471f;
        if (k0Var != null) {
            k0Var.k();
            this.f265471f = null;
        }
        hy4.s sVar = this.f265470e;
        if (sVar != null) {
            sVar.b();
        }
        this.f265480o = null;
    }

    public final void v() {
        java.util.ArrayList arrayList = this.f265466a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewLongClickHelper", "processGetWXACodeNickName mImageQBarDataList nil");
            return;
        }
        if (arrayList.size() != 1) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a6357 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357) arrayList.get(0);
        kd0.l2 l2Var = (kd0.l2) i95.n0.c(kd0.l2.class);
        int i17 = c17261xe88a6357.f240153e;
        java.lang.String str = c17261xe88a6357.f240152d;
        ((jd0.z1) l2Var).getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z0.e(i17, str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewLongClickHelper", "processGetWXACodeNickName");
            kd0.p2 p2Var = this.f265472g;
            int i18 = c17261xe88a6357.f240153e;
            java.lang.String str2 = c17261xe88a6357.f240152d;
            java.lang.String str3 = this.f265474i;
            kd0.f2 f2Var = new kd0.f2(str2);
            f2Var.f388168b = 4;
            f2Var.f388169c = str3;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) p2Var).i(i18, f2Var);
        }
    }
}
