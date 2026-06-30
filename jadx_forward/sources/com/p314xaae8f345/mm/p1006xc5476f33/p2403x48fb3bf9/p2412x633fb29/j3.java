package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes15.dex */
public class j3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f264492a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f264493b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f264494c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f264495d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f264496e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f264497f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f264498g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f264499h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f264500i;

    public j3(android.content.Context context, boolean z17, java.lang.String str, java.lang.String str2) {
        this.f264498g = false;
        this.f264492a = context;
        this.f264498g = z17;
        this.f264493b = str;
        this.f264499h = str2;
    }

    public static void a(r45.xv5 xv5Var, java.util.LinkedList linkedList) {
        if (n("snsapi_userinfo", xv5Var.f472046d) != null) {
            linkedList.add("snsapi_userinfo");
        } else if (n("snsapi_login", xv5Var.f472046d) != null) {
            linkedList.add("snsapi_login");
        } else {
            linkedList.add("group_sns_login");
        }
    }

    public static java.lang.Boolean b(r45.xv5 xv5Var, boolean z17) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = xv5Var.A;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(gVar != null && gVar.f273689a.length > 0);
        objArr[1] = java.lang.Boolean.valueOf(xv5Var.B);
        objArr[2] = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOauthUtil", "gameBuffer is not empty = %s, have gameCenter page = %s, isFromQRCodeScan = %s", objArr);
        if (gVar != null && gVar.f273689a.length > 0 && xv5Var.B) {
            r45.lq3 lq3Var = new r45.lq3();
            try {
                lq3Var.mo11468x92b714fd(gVar.g());
                java.util.LinkedList linkedList2 = lq3Var.f461253d;
                if (linkedList2 != null && !linkedList2.isEmpty()) {
                    r45.aw6 aw6Var = lq3Var.f461255f;
                    if (aw6Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOauthUtil", "interface config is null!");
                        return java.lang.Boolean.FALSE;
                    }
                    r45.zv6 zv6Var = aw6Var.f451850e;
                    if (zv6Var != null && (linkedList = zv6Var.f473947d) != null && !linkedList.isEmpty()) {
                        r45.cw6 cw6Var = lq3Var.f461255f.f451849d;
                        if (cw6Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(cw6Var.f453409f) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lq3Var.f461255f.f451849d.f453410g) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lq3Var.f461255f.f451849d.f453408e)) {
                            return java.lang.Boolean.TRUE;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOauthUtil", "interface_config title is not enough");
                        return java.lang.Boolean.FALSE;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOauthUtil", "interface_config body is empty");
                    return java.lang.Boolean.FALSE;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOauthUtil", "grant info list is empty!");
                return java.lang.Boolean.FALSE;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDKOauthUtil", "parse proto fail, %s", e17.getMessage());
            }
        }
        return java.lang.Boolean.FALSE;
    }

    public static r45.xv5 c(r45.dg5 dg5Var) {
        if (dg5Var == null) {
            return null;
        }
        r45.xv5 xv5Var = new r45.xv5();
        xv5Var.f76492x92037252 = dg5Var.f76492x92037252;
        xv5Var.f472050h = false;
        xv5Var.f472051i = false;
        xv5Var.f472054o = true;
        xv5Var.f472052m = false;
        xv5Var.f472046d = dg5Var.f453971e;
        xv5Var.f472047e = dg5Var.f453973g;
        xv5Var.f472048f = dg5Var.f453974h;
        xv5Var.f472049g = "";
        xv5Var.f472053n = dg5Var.f453975i;
        xv5Var.f472055p = dg5Var.f453976m;
        xv5Var.f472056q = dg5Var.f453977n;
        xv5Var.f472057r = dg5Var.f453978o;
        xv5Var.f472058s = dg5Var.f453979p;
        xv5Var.f472059t = dg5Var.f453980q;
        xv5Var.f472064y = dg5Var.f453981r;
        xv5Var.C = dg5Var.f453982s;
        xv5Var.A = dg5Var.f453984u;
        xv5Var.B = dg5Var.f453985v;
        return xv5Var;
    }

    public static void g(final android.app.Activity activity) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOauthUtil", "delayFish activity: " + activity);
        activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        ku5.u0 u0Var = ku5.t0.f394148d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.model.j3$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOauthUtil", "delayFish activity done");
                activity.finish();
            }
        };
        long j17 = fp.h.c(28) ? 10L : 500L;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(runnable, j17, false);
    }

    public static java.lang.String l(java.util.LinkedList linkedList) {
        java.util.Iterator it = linkedList.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            str = str + ((java.lang.String) it.next()) + ", ";
        }
        return str;
    }

    public static boolean m(r45.xv5 xv5Var) {
        java.util.LinkedList linkedList = new java.util.LinkedList(xv5Var.f472046d);
        java.util.Iterator it = xv5Var.f472046d.iterator();
        while (true) {
            boolean z17 = true;
            boolean z18 = false;
            if (!it.hasNext()) {
                break;
            }
            r45.px4 px4Var = (r45.px4) it.next();
            if (px4Var != null) {
                if (!"snsapi_friend".equals(px4Var.f464991d) && !"snsapi_wxaapp_info".equals(px4Var.f464991d)) {
                    z17 = false;
                }
                z18 = z17;
            }
            if (z18 || p(px4Var)) {
                linkedList.remove(px4Var);
            }
        }
        return linkedList.size() != 0;
    }

    public static r45.px4 n(java.lang.String str, java.util.LinkedList linkedList) {
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.px4 px4Var = (r45.px4) it.next();
            if (str.equals(px4Var.f464991d)) {
                return px4Var;
            }
        }
        return null;
    }

    public static boolean p(r45.px4 px4Var) {
        if (px4Var == null) {
            return false;
        }
        return "snsapi_userinfo".equals(px4Var.f464991d) || "snsapi_login".equals(px4Var.f464991d) || "group_sns_login".equals(px4Var.f464991d);
    }

    public void d(int i17, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options options, java.lang.String str, int i18, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOauthUtil", "dealWithCancel");
        boolean z18 = this.f264498g;
        android.content.Context context = this.f264492a;
        if (z18) {
            gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.p1(2, this.f264499h, null, 0));
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).finish();
            return;
        }
        java.lang.String k17 = k(this.f264493b);
        gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.r1(2, this.f264493b, this.f264496e, k17, null, 0, this.f264494c, this.f264500i, str, i18, z17));
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Resp();
        resp.f32870x7fa0d2de = this.f264495d;
        resp.f32867xa7c470f2 = i17;
        resp.f33040x3291ee = "zh_CN";
        resp.f33039x39175796 = "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(resp.f33041x68ac491)) {
            resp.f33041x68ac491 = this.f264496e;
        }
        h(k17, resp, options);
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).finish();
    }

    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.i3 i3Var, java.lang.String str, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options options) {
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Resp resp;
        java.lang.String b17 = i3Var.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOauthUtil", "dealWithLoginCallback url : %s", b17);
        java.lang.String k17 = k(this.f264493b);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDKOauthUtil", "dealWithLoginCallback pkg nil");
            return;
        }
        boolean equals = str.trim().equals("snsapi_wxaapp_info");
        if (i3Var.c() == null || i3Var.c().f273689a.length <= 0) {
            resp = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Resp();
        } else {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11270xfc93d479.Resp resp2 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11270xfc93d479.Resp(android.os.Bundle.EMPTY);
            resp2.f33054xf74e38e1 = i3Var.c().g();
            resp = resp2;
        }
        resp.f32870x7fa0d2de = this.f264495d;
        resp.f33040x3291ee = "zh_CN";
        resp.f33039x39175796 = "";
        java.lang.String str2 = null;
        android.net.Uri parse = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17) ? android.net.Uri.parse(b17) : null;
        if (parse != null) {
            str2 = parse.getQueryParameter("code");
            resp.f33041x68ac491 = parse.getQueryParameter("state");
            resp.f32868xb2d5068c = parse.getQueryParameter(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562);
        } else {
            resp.f33041x68ac491 = this.f264496e;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || equals) {
            if ((str2 != null ? str2 : "").toLowerCase().equals("authdeny")) {
                resp.f32867xa7c470f2 = -4;
            } else {
                resp.f32867xa7c470f2 = 0;
                if (equals) {
                    resp.f33037x745db3e5 = true;
                } else {
                    resp.f33038x2eaded = str2;
                }
            }
        } else {
            resp.f32867xa7c470f2 = -1;
        }
        if (!equals) {
            resp.url = b17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOauthUtil", "dealWithLoginCallback, pkg:%s code:%s errCode:%d state:%s type:%d", k17, resp.f33038x2eaded, java.lang.Integer.valueOf(resp.f32867xa7c470f2), resp.f33041x68ac491, java.lang.Integer.valueOf(resp.mo48430xfb85f7b0()));
        h(k17, resp, options);
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) this.f264492a).finish();
    }

    public void f(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.i3 i3Var, java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options options, boolean z17) {
        if (!i3Var.d() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i3Var.a())) {
            e(i3Var, str5, options);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.a(i17, str2, str, 1, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f5.a(i18), 1);
            return;
        }
        java.lang.String a17 = i3Var.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOauthUtil", "showUserConfirmDialog  message:" + a17 + " iconUrl:" + str3 + "  appName:" + str4);
        if (context != null && (context instanceof android.app.Activity)) {
            android.app.Activity activity = (android.app.Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDKOauthUtil", "showUserConfirmDialog  activity is Destroy " + context);
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.a(i17, str2, str, 1, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f5.a(i18), 2);
            }
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.it, (android.view.ViewGroup) null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hlr);
        o11.f fVar = new o11.f();
        fVar.f423624o = com.p314xaae8f345.mm.R.raw.f80704x478452f2;
        fVar.f423630u = context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.a9i);
        fVar.f423629t = true;
        n11.a.b().h(str3, imageView, fVar.a());
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.okx)).setText(str4);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.g(a17);
        u1Var.d(inflate);
        u1Var.n(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
        u1Var.j(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l3(this, i3Var, str5, options, i17, str2, str, i18));
        u1Var.i(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k3(this, options, str, i18, z17, i17, str2));
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            u1Var.q(false);
        } else {
            ru5.g b17 = ru5.g.b();
            b17.f481334b = ru5.g.f481331j;
            b17.f(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m3(this, u1Var)).g();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.a(i17, str2, str, 1, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.f5.a(i18), 2);
    }

    public final void h(java.lang.String str, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Resp resp, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options options) {
        if (this.f264497f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOauthUtil", "doCallback has callback");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOauthUtil", "doCallback pkg is empty");
            return;
        }
        this.f264497f = true;
        android.os.Bundle bundle = new android.os.Bundle();
        resp.mo48431x792022dd(bundle);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.g(bundle);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
        args.f32706x6a744ba6 = str;
        args.f32701xaddf3082 = bundle;
        if (options != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(options.f33026x3a8e995e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOauthUtil", "doCallback options.callbackClassName:" + options.f33026x3a8e995e);
            args.f32705x81a4fd92 = options.f33026x3a8e995e;
            args.f32703x5cfee87 = options.f33027x54a34142;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOauthUtil", "doCallback pkg:" + str);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(this.f264492a, args);
    }

    public void i(int i17, java.util.LinkedList linkedList, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i19 = 0; i19 < linkedList.size(); i19++) {
            sb6.append((java.lang.String) linkedList.get(i19));
            sb6.append(",");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOauthUtil", "doQRCodeOauthAuthorizeConfirm selectedScopes: %s", sb6.toString());
        gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.p1(i17, str, linkedList, i18, gVar, z17));
    }

    public void j(int i17, java.util.LinkedList linkedList, int i18, java.lang.String str, int i19, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.Boolean bool, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i27 = 0; i27 < linkedList.size(); i27++) {
            sb6.append((java.lang.String) linkedList.get(i27));
            sb6.append(",");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOauthUtil", "doSDKOauthAuthorizeConfirm selectedScopes: %s, isOption1:%b", sb6.toString(), java.lang.Boolean.valueOf(z17));
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        java.lang.String str3 = this.f264493b;
        gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.r1(i17, str3, this.f264496e, k(str3), linkedList, i18, this.f264494c, this.f264500i, str, i19, gVar, bool, z17));
    }

    public final java.lang.String k(java.lang.String str) {
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str, false, false);
        if (j17 != null) {
            return j17.f67386xa1e9e82c;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SDKOauthUtil", "dealWithCancel getAppInfo null; appid: %s", str);
        return null;
    }

    public final boolean o(int i17) {
        if (i17 == 1 || i17 == 2 || i17 == 7 || i17 == 8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDKOauthUtil", "isNetworkAvailable false, errType = " + i17);
            return false;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SDKOauthUtil", "isNetworkAvailable false, not connected");
        return false;
    }

    public void q(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options options) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOauthUtil", "onQRCodeOauthAuthorizeConfirmEnd errType:%d errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        android.content.Context context = this.f264492a;
        if (i17 == 0 && i18 == 0) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).finish();
        } else if (o(i17)) {
            s(str, options);
        } else {
            s(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8c), options);
        }
    }

    public void r(android.content.Context context, java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, int i19, int i27, java.lang.String str5, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options options, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SDKOauthUtil", "onSDKOauthAuthorizeConfirmEnd errType:%d errCode:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        if (i19 != 0 || i27 != 0) {
            if (o(i19)) {
                s(str5, options);
                return;
            } else {
                s(this.f264492a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8c), options);
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.r1 r1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.r1) m1Var;
        r45.vv5 resp = (r45.vv5) r1Var.f264618d.f152244b.f152233a;
        java.lang.String h17 = u46.l.h(new java.util.LinkedList(r1Var.f264621g), ",");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        f(context, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.g3(resp), str, i17, str2, i18, str3, str4, h17, options, z17);
    }

    public final void s(java.lang.String str, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options options) {
        android.content.Context context = this.f264492a;
        db5.e1.t(context, str, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8b), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n3(this, str, options));
    }

    public j3(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f264498g = false;
        this.f264492a = context;
        this.f264493b = str;
        this.f264495d = str2;
        this.f264496e = str3;
        this.f264497f = false;
        this.f264494c = str4;
    }
}
