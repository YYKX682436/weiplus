package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public final class vc extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.wc f268506b;

    public vc(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.wc wcVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d.AnonymousClass1 anonymousClass1) {
        this.f268506b = wcVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void a(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var = this.f268506b.f268556d.f265382q2;
        if (c6Var.c() == null || c6Var.c().f265348f == null || c6Var.c().f265409z1 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewMenuHelper", "setShareFuncFlag params failed");
            return;
        }
        java.lang.String mo120156xb5887639 = c6Var.c().f265348f.mo120156xb5887639();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo120156xb5887639)) {
            return;
        }
        try {
            if (new java.net.URL(mo120156xb5887639).getHost().equals(com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9))) {
                int x17 = c6Var.x();
                if (c6Var.c().f265377p0 != null) {
                    c6Var.c().f265377p0.T("setFuncFlag", x17);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewMenuHelper", "create url fail : " + e17.getLocalizedMessage());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void b(int i17, java.lang.String str, int i18, int i19, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(154L, 12L, 1L, false);
        java.lang.Integer num = (java.lang.Integer) cx4.a.f306115b.get(java.lang.Integer.valueOf(i17));
        if (num == null) {
            num = -1;
        }
        g0Var.mo68477x336bdfd8(154L, num.intValue(), 1L, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.wc wcVar = this.f268506b;
        wcVar.f268556d.R8(true, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = wcVar.f268556d;
        viewOnCreateContextMenuListenerC19337x37f3384d.f265382q2.G = false;
        if (i17 != 0 && i17 != 2) {
            switch (i17) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.t7 t7Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.t7.f268429i;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(t7Var.f268430a)) {
            t7Var.c(3, "", i18);
        }
        if (viewOnCreateContextMenuListenerC19337x37f3384d.T1 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) this.f263366a;
            if (!r0Var.p0(r0Var.f263468j0)) {
                android.view.View view = viewOnCreateContextMenuListenerC19337x37f3384d.T1;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "showRefreshMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewUI", "showRefreshMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                viewOnCreateContextMenuListenerC19337x37f3384d.h9();
                viewOnCreateContextMenuListenerC19337x37f3384d.T7();
            }
        }
        viewOnCreateContextMenuListenerC19337x37f3384d.f265368m2.b().f264612b = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.b6 b6Var = viewOnCreateContextMenuListenerC19337x37f3384d.f265368m2;
        if (b6Var.f264332b == null) {
            b6Var.f264332b = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y5(b6Var);
        }
        b6Var.f264332b.a(str, false);
        if (viewOnCreateContextMenuListenerC19337x37f3384d.W) {
            viewOnCreateContextMenuListenerC19337x37f3384d.finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void c(int i17, java.lang.String reqUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqUrl, "reqUrl");
        if (i17 != 5) {
            this.f268506b.f268556d.R8(true, false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.wc wcVar = this.f268506b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "WebView-Trace onAuthSucc: url %s", wcVar.f268556d.f265340c2);
        wcVar.f268556d.e9(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) this.f263366a).R.c());
        java.util.HashSet hashSet = (java.util.HashSet) wcVar.f268556d.f265382q2.H;
        hashSet.add(6);
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var = wcVar.f268556d.f265382q2;
        c6Var.G = true;
        if (c6Var.C()) {
            wcVar.f268556d.X8();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f268506b.f268556d;
        if (viewOnCreateContextMenuListenerC19337x37f3384d.f265358i2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewUI", "edw postBinded hasDoPostBind");
        } else {
            viewOnCreateContextMenuListenerC19337x37f3384d.f265358i2 = true;
            viewOnCreateContextMenuListenerC19337x37f3384d.B8();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void f() {
        this.f268506b.f268556d.finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void g(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19484x7a29c291 c19484x7a29c291;
        android.view.View view = this.f268506b.f268556d.f265396v;
        if (view == null || (c19484x7a29c291 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19484x7a29c291) view.findViewById(com.p314xaae8f345.mm.R.id.gbf)) == null) {
            return;
        }
        c19484x7a29c291.m74796x6b90deaf(i17 - 1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f268506b.f268556d;
        viewOnCreateContextMenuListenerC19337x37f3384d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUI", "forceQuit");
        pm0.v.W(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ma(viewOnCreateContextMenuListenerC19337x37f3384d));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void i() {
        this.f268506b.f268556d.P7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.wc wcVar = this.f268506b;
        wcVar.f268556d.R8(true, true);
        wcVar.f268556d.u8("onCreate");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void k(int i17, java.lang.String str, r45.s83 s83Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.wc wcVar = this.f268506b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = wcVar.f268556d;
        viewOnCreateContextMenuListenerC19337x37f3384d.f265340c2 = s83Var.f467078d;
        viewOnCreateContextMenuListenerC19337x37f3384d.J1 = viewOnCreateContextMenuListenerC19337x37f3384d.f265409z1.c().f(24);
        wcVar.f268556d.f265368m2.b().f264612b = true;
        wcVar.f268556d.Z = x51.j1.d(s83Var.A);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(wcVar.f268556d.Z);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void l(int i17, java.lang.String str, r45.s83 s83Var) {
        if (i17 != 5) {
            this.f268506b.f268556d.f265382q2.f265587k = s83Var.B;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void m() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.wc wcVar = this.f268506b;
        wcVar.f268556d.f265367m.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = wcVar.f268556d;
        by4.k kVar = viewOnCreateContextMenuListenerC19337x37f3384d.f265374o2;
        if (kVar != null && kVar.a()) {
            java.lang.String x76 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(viewOnCreateContextMenuListenerC19337x37f3384d.L1.f263497y) ? viewOnCreateContextMenuListenerC19337x37f3384d.x7() : viewOnCreateContextMenuListenerC19337x37f3384d.L1.f263497y;
            java.lang.String str = (java.lang.String) ((java.util.HashMap) viewOnCreateContextMenuListenerC19337x37f3384d.f265374o2.f117937e).get(x76);
            java.lang.String X6 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d.X6(viewOnCreateContextMenuListenerC19337x37f3384d, viewOnCreateContextMenuListenerC19337x37f3384d.f265348f.mo64579x7531c8a2());
            if (str != null) {
                viewOnCreateContextMenuListenerC19337x37f3384d.f265374o2.b(viewOnCreateContextMenuListenerC19337x37f3384d, x76, viewOnCreateContextMenuListenerC19337x37f3384d.F7(), str);
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(X6) && !((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(x76)) {
                viewOnCreateContextMenuListenerC19337x37f3384d.f265374o2.b(viewOnCreateContextMenuListenerC19337x37f3384d, x76, viewOnCreateContextMenuListenerC19337x37f3384d.F7(), X6);
            }
        }
        viewOnCreateContextMenuListenerC19337x37f3384d.T7();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n() {
        /*
            r5 = this;
            com.tencent.mm.plugin.webview.ui.tools.wc r0 = r5.f268506b
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f268556d
            r0.W8()
            com.tencent.mm.plugin.webview.ui.tools.wc r0 = r5.f268506b
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f268556d
            com.tencent.mm.plugin.webview.core.e3 r1 = r0.L1
            java.lang.String r1 = r1.f263497y
            if (r1 == 0) goto L12
            goto L16
        L12:
            java.lang.String r1 = r0.F7()
        L16:
            com.tencent.mm.plugin.webview.ui.tools.wc r0 = r5.f268506b
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f268556d
            by4.k r0 = r0.f265374o2
            if (r0 == 0) goto L8e
            boolean r0 = r0.a()
            if (r0 == 0) goto L8e
            com.tencent.mm.plugin.webview.ui.tools.wc r0 = r5.f268506b
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f268556d
            by4.k r0 = r0.f265374o2
            android.net.Uri r2 = android.net.Uri.parse(r1)
            java.lang.String r2 = r2.getHost()
            r3 = 0
            if (r2 == 0) goto L41
            java.util.Set r0 = r0.f117935c
            java.util.HashSet r0 = (java.util.HashSet) r0
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L44
            r0 = 1
            goto L45
        L41:
            r0.getClass()
        L44:
            r0 = r3
        L45:
            if (r0 != 0) goto L8e
            com.tencent.mm.plugin.webview.ui.tools.wc r0 = r5.f268506b
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f268556d
            by4.k r0 = r0.f265374o2
            r0.f117933a = r3
            boolean r2 = r0.f117936d
            if (r2 == 0) goto L56
            r0.f117936d = r3
            goto L8e
        L56:
            boolean r0 = hy4.i.q(r1)
            java.lang.String r2 = ""
            if (r0 != 0) goto L7f
            com.tencent.mm.plugin.webview.ui.tools.wc r0 = r5.f268506b
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f268556d
            java.lang.String r1 = xw4.b.c(r1)
            if (r1 != 0) goto L69
            r1 = r2
        L69:
            java.lang.String r1 = java.net.URLDecoder.decode(r1)
            r0.mo54450xbf7c1df6(r1)
            com.tencent.mm.plugin.webview.ui.tools.wc r0 = r5.f268506b
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f268556d
            by4.k r0 = r0.f265374o2
            r0.getClass()
            long r3 = java.lang.System.currentTimeMillis()
            r0.f117940h = r3
        L7f:
            com.tencent.mm.plugin.webview.ui.tools.wc r0 = r5.f268506b
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f268556d
            r0.mo54449x3f86539a(r2)
            com.tencent.mm.plugin.webview.ui.tools.wc r0 = r5.f268506b
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f268556d
            r1 = 0
            r0.mo54449x3f86539a(r1)
        L8e:
            com.tencent.mm.plugin.webview.ui.tools.wc r0 = r5.f268506b
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f268556d
            boolean r0 = r0.f265336a2
            if (r0 != 0) goto La3
            com.tencent.mm.plugin.webview.ui.tools.wc r0 = r5.f268506b
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r0.f268556d
            boolean r1 = r0.f265338b2
            if (r1 != 0) goto La3
            com.tencent.mm.ui.base.MMFalseProgressBar r0 = r0.f265367m
            r0.c()
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.vc.n():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void o(java.lang.String str) {
        this.f268506b.f268556d.f265382q2.p(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void p(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.wc wcVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59;
        if (!z17 || (c22633x83752a59 = (viewOnCreateContextMenuListenerC19337x37f3384d = (wcVar = this.f268506b).f268556d).f265348f) == null) {
            return;
        }
        c22633x83752a59.setOnLongClickListener(viewOnCreateContextMenuListenerC19337x37f3384d.f265350f3);
        wcVar.f268556d.f265347e3 = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
    public void q(int i17, java.lang.String str, r45.s83 s83Var) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s83Var.f467081g);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.wc wcVar = this.f268506b;
        if (!K0) {
            wcVar.f268556d.mo54450xbf7c1df6(s83Var.f467081g);
        }
        if (s83Var.f467080f == 6) {
            wcVar.f268556d.a8(false);
        }
    }
}
