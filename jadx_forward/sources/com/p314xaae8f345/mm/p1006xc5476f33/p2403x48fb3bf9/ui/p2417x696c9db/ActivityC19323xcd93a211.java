package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

@db5.a(m123858x6ac9171 = 3)
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI */
/* loaded from: classes15.dex */
public final class ActivityC19323xcd93a211 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: J, reason: collision with root package name */
    public static int f265250J;
    public java.lang.String A;
    public java.lang.String B;
    public int C;
    public int D;
    public java.lang.String E;
    public java.lang.String F;
    public com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options G;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f265251d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Req f265252e;

    /* renamed from: f, reason: collision with root package name */
    public int f265253f;

    /* renamed from: g, reason: collision with root package name */
    public int f265254g;

    /* renamed from: h, reason: collision with root package name */
    public int f265255h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f265256i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.s2 f265257m;

    /* renamed from: n, reason: collision with root package name */
    public rl5.r f265258n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19315x634a5a88 f265259o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f265260p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f265261q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f265263s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3 f265264t;

    /* renamed from: u, reason: collision with root package name */
    public long f265265u;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f265268x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f265269y;

    /* renamed from: r, reason: collision with root package name */
    public int f265262r = 0;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f265266v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f265267w = false;

    /* renamed from: z, reason: collision with root package name */
    public int f265270z = 2;
    public final java.util.LinkedList H = new java.util.LinkedList();
    public final db5.t4 I = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.h2(this);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19323xcd93a211 activityC19323xcd93a211, r45.px4 px4Var, r45.xv5 xv5Var, boolean z17) {
        boolean z18;
        ?? r37;
        ?? r07;
        java.lang.String str;
        java.lang.String str2;
        activityC19323xcd93a211.getClass();
        if (px4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SdkOAuthUI", "fillNewOauthPage: do not get scope request for user info");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "disagreeBtnCallback click");
        java.util.Iterator it = xv5Var.f472046d.iterator();
        while (true) {
            z18 = true;
            if (!it.hasNext()) {
                r37 = false;
                break;
            } else if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3.p((r45.px4) it.next())) {
                r37 = true;
                break;
            }
        }
        if (r37 == true) {
            java.util.LinkedList linkedList = activityC19323xcd93a211.H;
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3.a(xv5Var, linkedList);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "add scopes to userHasSelectedScopes, userHasSelectedScopes = %s", com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3.l(linkedList));
            }
            if (!z17 && px4Var.f464993f == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "user disagree + but must agree => cancel");
                activityC19323xcd93a211.U6(-4);
                activityC19323xcd93a211.finish();
                return;
            }
            java.util.Iterator it6 = xv5Var.f472046d.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    r07 = false;
                    break;
                }
                r45.px4 px4Var2 = (r45.px4) it6.next();
                if ((px4Var2 != null && ("snsapi_friend".equals(px4Var2.f464991d) || "snsapi_wxaapp_info".equals(px4Var2.f464991d))) != false) {
                    r07 = true;
                    break;
                }
            }
            if (r07 != true && !com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3.m(xv5Var)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "only show page 1");
                if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3.b(xv5Var, activityC19323xcd93a211.f265267w).booleanValue()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "go to SDKOAuthAppDataUI");
                    activityC19323xcd93a211.j7(xv5Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19318x97abd302.class, activityC19323xcd93a211.f265257m.f268367h, 7, "snsapi_friend");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3.g(activityC19323xcd93a211);
                    return;
                }
                if (!z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "only page 1 + no need to show appDataUI => cancel");
                    activityC19323xcd93a211.U6(-4);
                    activityC19323xcd93a211.finish();
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "check policy and try to send result");
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3.a(xv5Var, linkedList2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "try to send result, isFromQRCodeScan = %s, scopeSize = %s", java.lang.Boolean.valueOf(activityC19323xcd93a211.f265267w), java.lang.Integer.valueOf(linkedList.size()));
                activityC19323xcd93a211.W6();
                activityC19323xcd93a211.f265256i = db5.e1.Q(activityC19323xcd93a211, null, activityC19323xcd93a211.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.g2(activityC19323xcd93a211));
                if (activityC19323xcd93a211.f265267w) {
                    activityC19323xcd93a211.f265264t.i(1, linkedList2, activityC19323xcd93a211.f265257m.f268367h, activityC19323xcd93a211.f265269y, null, false);
                    return;
                } else {
                    com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Req req = activityC19323xcd93a211.f265252e;
                    activityC19323xcd93a211.f265264t.j(1, linkedList2, activityC19323xcd93a211.f265257m.f268367h, activityC19323xcd93a211.A, activityC19323xcd93a211.C, null, java.lang.Boolean.FALSE, req != null ? req.f33030x92f7cdd2 : false);
                    return;
                }
            }
            hy4.b.INSTANCE.a(activityC19323xcd93a211.f265251d, activityC19323xcd93a211.f265265u, z17 ? 1 : 0, activityC19323xcd93a211.f265270z, 2, 1, 0);
            java.util.Iterator it7 = xv5Var.f472046d.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    z18 = false;
                    break;
                } else {
                    r45.px4 px4Var3 = (r45.px4) it7.next();
                    if ((px4Var3 != null && ("snsapi_friend".equals(px4Var3.f464991d) || "snsapi_wxaapp_info".equals(px4Var3.f464991d))) != false) {
                        break;
                    }
                }
            }
            if (z18) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3.n("snsapi_friend", xv5Var.f472046d) != null) {
                    str2 = "snsapi_friend";
                } else if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3.n("snsapi_wxaapp_info", xv5Var.f472046d) != null) {
                    str2 = "snsapi_wxaapp_info";
                } else {
                    str = "";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "has friend info, scope = %s", str);
                    activityC19323xcd93a211.j7(xv5Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19320x63b98f8f.class, activityC19323xcd93a211.f265257m.f268367h, 0, str);
                }
                str = str2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "has friend info, scope = %s", str);
                activityC19323xcd93a211.j7(xv5Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19320x63b98f8f.class, activityC19323xcd93a211.f265257m.f268367h, 0, str);
            } else if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3.m(xv5Var)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "has other info");
                activityC19323xcd93a211.j7(xv5Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19322x56482c27.class, activityC19323xcd93a211.f265257m.f268367h, 0, "");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3.g(activityC19323xcd93a211);
        }
    }

    public final void U6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "dealWithCancel");
        if (this.f265267w) {
            gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.p1(2, this.f265269y, null, 0));
            return;
        }
        if (this.f265252e == null) {
            return;
        }
        java.lang.String Y6 = Y6(this.f265251d);
        java.lang.String str = this.f265251d;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Req req = this.f265252e;
        gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.r1(2, str, req.f33034x68ac491, Y6, null, 0, req.f33029xb21df56b, this.f265264t.f264500i, this.A, this.C, req.f33030x92f7cdd2));
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Resp();
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Req req2 = this.f265252e;
        resp.f32870x7fa0d2de = req2.f32866x7fa0d2de;
        resp.f32867xa7c470f2 = i17;
        resp.f33040x3291ee = "zh_CN";
        resp.f33039x39175796 = "";
        resp.f33041x68ac491 = req2.f33034x68ac491;
        X6(Y6, resp);
    }

    public final void V6(int i17, java.lang.String str) {
        java.lang.String Y6 = Y6(this.f265251d);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Y6)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SdkOAuthUI", "dealWithError pkg nil");
            return;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Resp();
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Req req = this.f265252e;
        resp.f32870x7fa0d2de = req.f32866x7fa0d2de;
        resp.f32867xa7c470f2 = i17;
        resp.f32868xb2d5068c = str;
        resp.f33040x3291ee = "zh_CN";
        resp.f33039x39175796 = "";
        resp.f33041x68ac491 = req.f33034x68ac491;
        X6(Y6, resp);
    }

    public final void W6() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f265256i;
        if (u3Var != null && u3Var.isShowing()) {
            this.f265256i.dismiss();
        }
    }

    public final void X6(java.lang.String str, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Resp resp) {
        if (this.f265261q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "doCallback has callback");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "doCallback pkg is empty");
            return;
        }
        this.f265261q = true;
        this.f265264t.f264497f = true;
        android.os.Bundle bundle = new android.os.Bundle();
        resp.mo48431x792022dd(bundle);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.g(bundle);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
        args.f32706x6a744ba6 = str;
        args.f32701xaddf3082 = bundle;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options options = this.G;
        if (options != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(options.f33026x3a8e995e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "doCallback options.callbackClassName:" + this.G.f33026x3a8e995e + "  options.callbackFlags:" + this.G.f33027x54a34142);
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options options2 = this.G;
            args.f32705x81a4fd92 = options2.f33026x3a8e995e;
            args.f32703x5cfee87 = options2.f33027x54a34142;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "doCallback pkg:" + str);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(this, args);
    }

    public final java.lang.String Y6(java.lang.String str) {
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str, false, false);
        if (j17 != null) {
            return j17.f67386xa1e9e82c;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SdkOAuthUI", "dealWithCancel getAppInfo null; appid: %s", str);
        return null;
    }

    public final int Z6() {
        return this.f265266v ? 2 : 1;
    }

    public final void a7() {
        if (this.f265263s) {
            return;
        }
        if (this.f265257m.getCount() >= f265250J) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f565513cm4);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.otw);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.otx);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.f565513cm4);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.otw);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.otx);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(findViewById6, arrayList6.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(findViewById6, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void b7() {
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        mo78514x143f1b92().X0(this, b3.l.m9702x7444d5ad(this, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78514x143f1b92().E0(b3.l.m9702x7444d5ad(this, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SdkOAuthUI", "start, hasSetUin fail");
            dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.c_, 1).show();
            return;
        }
        this.f265261q = false;
        android.content.Intent intent = getIntent();
        this.f265267w = intent.getBooleanExtra("auth_from_scan", false);
        this.f265265u = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options options = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options();
        this.G = options;
        options.m48439x63aa4ccc(intent.getExtras());
        this.A = intent.getStringExtra("key_open_sdk_token");
        this.B = intent.getStringExtra("key_open_sdk_pkg_name");
        this.C = intent.getIntExtra("key_open_sdk_authentication_result", -1);
        this.D = intent.getIntExtra("key_open_sdk_version", 0);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f265267w);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options options2 = this.G;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "init isFromQRCodeScan %b  options.callbackClassName:%s, options.callbackFlags:%d, pkgName:%s, authenticationResult:%d, openSDKVersion:%d", valueOf, options2.f33026x3a8e995e, java.lang.Integer.valueOf(options2.f33027x54a34142), this.B, java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(this.D));
        boolean z17 = this.f265267w;
        hy4.b bVar = hy4.b.INSTANCE;
        java.lang.String str = null;
        if (z17) {
            this.f265270z = 3;
            java.lang.String stringExtra = intent.getStringExtra("auth_raw_url");
            this.f265269y = stringExtra;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "doQRCodeOauthAuthorize url: %s", stringExtra);
            if (!d7()) {
                i7();
            }
            r45.u15 u15Var = new r45.u15();
            int i17 = this.f265262r;
            u15Var.f468481e = i17;
            u15Var.f468480d = i17 > 0;
            gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o1(stringExtra, u15Var));
            if (this.f265264t == null) {
                this.f265264t = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3(this, true, null, this.f265269y);
            }
            bVar.d(3, "");
        } else {
            android.os.Bundle extras = getIntent().getExtras();
            java.lang.String string = extras.getString(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32807x6382c059);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SdkOAuthUI", "init content is nil");
                return;
            }
            java.lang.String queryParameter = android.net.Uri.parse(string).getQueryParameter("appid");
            this.f265251d = queryParameter;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "parseAppId try case not sensitive, content:%s", string);
                this.f265251d = android.net.Uri.parse(string.toLowerCase()).getQueryParameter("appid");
            }
            if (this.f265252e == null) {
                java.lang.String str2 = this.f265251d;
                ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str2, false, false);
                if (j17 != null && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17.f67384x996f3ea)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "checkGetAppSetting appId: %s ", str2);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5590xafd018d5 c5590xafd018d5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5590xafd018d5();
                    c5590xafd018d5.f135914g.f88483a = str2;
                    c5590xafd018d5.e();
                }
                this.f265252e = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Req(extras);
            }
            bVar.d(2, this.f265252e.f33029xb21df56b);
            if (this.f265264t == null) {
                java.lang.String str3 = this.f265251d;
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Req req = this.f265252e;
                this.f265264t = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.j3(this, str3, req.f32866x7fa0d2de, req.f33034x68ac491, req.f33029xb21df56b);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f265252e.f33033x6833e54) || !this.f265252e.f33033x6833e54.contains("snsapi_wxaapp_info") || this.f265252e.f33033x6833e54.equals("snsapi_wxaapp_info")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SdkOAuthUI", "init success, doSDKOauthAuthorize");
                java.lang.String str4 = this.f265251d;
                java.lang.String Y6 = Y6(str4);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "doSDKOauthAuthorize appid: %s, extData：%s", str4, this.f265252e.f33029xb21df56b);
                if (!d7()) {
                    i7();
                }
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Req req2 = this.f265252e;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Y6)) {
                    android.content.pm.Signature[] a17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.c.a(this, Y6, false);
                    if (a17 == null || a17.length == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SdkOAuthUI", "getSignature signatures failed");
                    } else {
                        str = kk.k.g(a17[0].toByteArray());
                    }
                }
                java.lang.String str5 = str;
                java.lang.String str6 = this.A;
                int i18 = this.C;
                r45.u15 u15Var2 = new r45.u15();
                int i19 = this.f265262r;
                u15Var2.f468481e = i19;
                u15Var2.f468480d = i19 > 0;
                gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.q1(str4, req2, Y6, str5, str6, i18, u15Var2));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SdkOAuthUI", "init check SCOPE_GET_WXAAPP_INFO fail");
                V6(-1000, java.lang.String.format(mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8d), "snsapi_wxaapp_info"));
                finish();
            }
        }
        f7();
    }

    public final boolean c7(int i17) {
        if (i17 == 1 || i17 == 2 || i17 == 7 || i17 == 8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SdkOAuthUI", "isNetworkAvailable false, errType = " + i17);
            return false;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SdkOAuthUI", "isNetworkAvailable false, not connected");
        return false;
    }

    public final boolean d7() {
        int i17 = this.f265262r;
        return i17 == 3 || i17 == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0248 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e7(int r23, int r24, java.lang.String r25, r45.xv5 r26) {
        /*
            Method dump skipped, instructions count: 1365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19323xcd93a211.e7(int, int, java.lang.String, r45.xv5):void");
    }

    public final void f7() {
        int i17 = getResources().getConfiguration().orientation;
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ioq);
        if (findViewById != null) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.bottomMargin = i17 == 2 ? i65.a.b(this, 12) : i17 == 1 ? i65.a.b(this, 96) : 0;
            findViewById.setLayoutParams(layoutParams);
        }
    }

    public final void g7() {
        android.view.View view = this.f265260p;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.l2 l2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.l2(this);
        int i17 = getResources().getConfiguration().orientation;
        if (i17 == 2) {
            l2Var.mo149xb9724478(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.vis), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.apz));
            l2Var.mo149xb9724478(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.sml), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f562130aq3));
            l2Var.mo149xb9724478(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.vit), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f562128aq1));
        } else if (i17 == 1) {
            l2Var.mo149xb9724478(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.vis), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.apy));
            l2Var.mo149xb9724478(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.sml), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f562129aq2));
            l2Var.mo149xb9724478(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.vit), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f562127aq0));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cil;
    }

    public final void h7(java.lang.String str, boolean z17) {
        db5.e1.t(this, str, getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8b), new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.e2(this, str, z17));
    }

    public final void i7() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f265256i;
        if (u3Var == null || u3Var.isShowing()) {
            this.f265256i = db5.e1.Q(this, null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hdm), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.f2(this));
        } else {
            this.f265256i.show();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u2.class);
        return hashSet;
    }

    public final void j7(r45.xv5 xv5Var, java.lang.Class cls, int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "startScopeActivity  cls:" + cls + "  scope:" + str);
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) cls);
        intent.putExtra("0", this.f265251d);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Req req = this.f265252e;
        if (req != null) {
            intent.putExtra("1", req.f32866x7fa0d2de);
            intent.putExtra("4", this.f265252e.f33034x68ac491);
            intent.putExtra("7", this.f265252e.f33029xb21df56b);
            intent.putExtra("auth_isoption1", this.f265252e.f33030x92f7cdd2);
        }
        intent.putExtra("3", i17);
        intent.putExtra("5", i18);
        intent.putExtra("auth_from_scan", this.f265267w);
        intent.putExtra("auth_raw_url", this.f265269y);
        intent.putExtra("has_selected_scope", this.H);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.A)) {
            intent.putExtra("key_open_sdk_token", this.A);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B)) {
            intent.putExtra("key_open_sdk_pkg_name", this.B);
        }
        intent.putExtra("key_open_sdk_authentication_result", this.C);
        intent.putExtra("key_open_sdk_version", this.D);
        if (!android.text.TextUtils.isEmpty(str)) {
            intent.putExtra("auth_scope", str);
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options options = this.G;
        if (options != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(options.f33026x3a8e995e)) {
            android.os.Bundle bundle = new android.os.Bundle();
            this.G.m48440x792022dd(bundle);
            intent.putExtra("send_auth_option", bundle);
        }
        try {
            intent.putExtra("2", xv5Var.mo14344x5f01b1f6());
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SdkOAuthUI", "SdkOauthAuthorizeResp toByteArray failed");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;IILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;IILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void k7(r45.xv5 xv5Var, java.lang.Class cls, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "startScopeActivity %s", cls.getSimpleName());
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) cls);
        intent.putExtra("0", this.f265251d);
        intent.putExtra("has_selected_scope", this.H);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Req req = this.f265252e;
        if (req != null) {
            intent.putExtra("1", req.f32866x7fa0d2de);
            intent.putExtra("4", this.f265252e.f33034x68ac491);
            intent.putExtra("7", this.f265252e.f33029xb21df56b);
            intent.putExtra("auth_isoption1", this.f265252e.f33030x92f7cdd2);
        }
        intent.putExtra("auth_from_scan", this.f265267w);
        if (!android.text.TextUtils.isEmpty(str)) {
            intent.putExtra("auth_scope", str);
        }
        intent.putExtra("auth_raw_url", this.f265269y);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.A)) {
            intent.putExtra("key_open_sdk_token", this.A);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B)) {
            intent.putExtra("key_open_sdk_pkg_name", this.B);
        }
        intent.putExtra("key_open_sdk_authentication_result", this.C);
        intent.putExtra("key_open_sdk_version", this.D);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options options = this.G;
        if (options != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(options.f33026x3a8e995e)) {
            android.os.Bundle bundle = new android.os.Bundle();
            this.G.m48440x792022dd(bundle);
            intent.putExtra("send_auth_option", bundle);
        }
        try {
            intent.putExtra("2", xv5Var.mo14344x5f01b1f6());
        } catch (java.io.IOException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SdkOAuthUI", "SdkOauthAuthorizeResp toByteArray failed");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.LinkedList linkedList;
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "onAcvityResult requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 6) {
            if (i17 != 9) {
                return;
            }
            java.util.HashMap hashMap = (java.util.HashMap) nw4.a.a(intent != null ? intent.getExtras() : null);
            java.lang.String str = hashMap.get("err_msg") instanceof java.lang.String ? (java.lang.String) hashMap.get("err_msg") : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "face detect errCode %s, errMsg=%s", hashMap.get("err_code"), str);
            if (i18 == -1) {
                this.f265262r = 1;
                this.f265259o.setVisibility(8);
                b7();
                return;
            } else {
                if (i18 == 1) {
                    this.f265262r = 2;
                    if (!this.f265267w) {
                        V6(-1, str);
                    }
                    b7();
                    finish();
                    return;
                }
                if (i18 == 0) {
                    this.f265262r = 3;
                    U6(-2);
                    b7();
                    finish();
                    return;
                }
                return;
            }
        }
        if (i18 != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SdkOAuthUI", "Create avatar cancel or failed");
            return;
        }
        r45.mx4 mx4Var = new r45.mx4();
        mx4Var.f462426d = intent.getIntExtra(dm.i4.f66865x76d1ec5a, -1);
        mx4Var.f462427e = intent.getStringExtra("nickname");
        mx4Var.f462428f = intent.getStringExtra("avatarurl");
        mx4Var.f462429g = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.s2 s2Var = this.f265257m;
        if (s2Var != null) {
            s2Var.getClass();
            if (mx4Var.f462426d == -1 || (linkedList = s2Var.f268363d) == null || linkedList.size() >= f265250J) {
                z17 = false;
            } else {
                linkedList.add(mx4Var);
                z17 = true;
            }
            if (z17) {
                this.f265257m.f268367h = mx4Var.f462426d;
                a7();
                this.f265257m.notifyDataSetChanged();
                return;
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(this.f265257m == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SdkOAuthUI", "onActivityResult mAvatarAdapter == null:%b", objArr);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f7();
        g7();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "onCreate");
        super.onCreate(bundle);
        gm0.j1.d().a(1346, this);
        gm0.j1.d().a(1388, this);
        gm0.j1.d().a(2700, this);
        gm0.j1.d().a(2543, this);
        gm0.j1.d().a(1137, this);
        mo54450xbf7c1df6("");
        b7();
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 1, 0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.h88));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "onDestroy");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f265256i;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        gm0.j1.d().q(1388, this);
        gm0.j1.d().q(1346, this);
        gm0.j1.d().q(2700, this);
        gm0.j1.d().q(2543, this);
        gm0.j1.d().q(1137, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        hy4.b.INSTANCE.a(this.f265251d, this.f265265u, 0, this.f265270z, Z6(), 1, 0);
        U6(-2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "key back click");
        finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "onPause");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "onResume");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02fe  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r24, int r25, java.lang.String r26, com.p314xaae8f345.mm.p944x882e457a.m1 r27) {
        /*
            Method dump skipped, instructions count: 893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19323xcd93a211.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "onStart");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SdkOAuthUI", "onStop");
    }
}
