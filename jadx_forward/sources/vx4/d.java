package vx4;

/* loaded from: classes8.dex */
public class d extends jk3.v {
    public static final /* synthetic */ int D = 0;
    public boolean A;
    public boolean B;
    public final r45.k97 C;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f522850x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f522851y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f522852z;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        hashSet.add("webpageTitle");
        hashSet.add("hide_option_menu");
        hashSet.add("translate_webview");
        hashSet.add("srcUsername");
        hashSet.add("srcDisplayname");
        hashSet.add("mode");
        hashSet.add("KTemplateId");
        hashSet.add("KPublisherId");
        hashSet.add("KOpenArticleSceneFromScene");
        hashSet.add(com.p314xaae8f345.mm.ui.w2.f292727g);
        hashSet.add("pay_channel");
        hashSet.add("key_download_restrict");
        hashSet.add("key_wallet_region");
        hashSet.add("key_function_id");
        hashSet.add(com.p314xaae8f345.mm.ui.w2.f292730j);
        hashSet.add("geta8key_scene");
        hashSet.add("ad_ux_info_for_jsapi_pay");
        hashSet.add("key_menu_hide_expose");
        hashSet.add("webviewCurrentProcess");
    }

    public d(ak3.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d) {
        super(cVar);
        this.f522851y = true;
        this.f522852z = false;
        this.A = false;
        this.f522850x = viewOnCreateContextMenuListenerC19337x37f3384d;
        r45.k97 k97Var = new r45.k97();
        this.C = k97Var;
        if (cVar.mo2160x1e885992() != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ui(cVar.mo2160x1e885992().getExtras(), k97Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebMultiTaskHelper", "createWebMultiTaskHelper, WebViewUI:%s", java.lang.Integer.valueOf(viewOnCreateContextMenuListenerC19337x37f3384d.hashCode()));
    }

    @Override // jk3.b
    public void A() {
        super.A();
        this.A = false;
    }

    @Override // jk3.b
    public void B(boolean z17) {
        j();
        super.B(z17);
    }

    @Override // jk3.v, jk3.b
    public void C(boolean z17, int i17) {
        j();
        super.C(z17, i17);
    }

    @Override // jk3.b
    public boolean G() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multitask_taskbar_disable_webview_capture_on_close, 0) != 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebMultiTaskHelper", "shouldCaptureOnClose:%b", java.lang.Boolean.valueOf(!z17));
        return !z17;
    }

    @Override // jk3.v
    public boolean U(int i17, boolean z17) {
        j();
        if (!this.f522852z) {
            this.f522851y = false;
        }
        return super.U(i17, this.f522851y);
    }

    public void c0() {
        dk3.f fVar = this.f381648h;
        if (fVar != null) {
            dk3.e eVar = (dk3.e) fVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatMultiTaskIndicatorController", "stop FloatIndicatorController");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new dk3.b(eVar));
            eVar.f315983b.h(null);
        }
    }

    @Override // jk3.b, jk3.e
    public void g(android.graphics.Bitmap bitmap) {
        if (this.B) {
            super.g(bitmap);
        }
    }

    @Override // jk3.b, jk3.e
    public java.lang.Boolean i() {
        return java.lang.Boolean.FALSE;
    }

    @Override // jk3.b, jk3.e
    public void j() {
        r45.k97 k97Var = this.C;
        try {
            r45.kr4 kr4Var = this.f381612c;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f522850x;
            if (kr4Var != null) {
                kr4Var.set(4, viewOnCreateContextMenuListenerC19337x37f3384d.F7());
            }
            k97Var.set(1, viewOnCreateContextMenuListenerC19337x37f3384d.F7());
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.jd w76 = viewOnCreateContextMenuListenerC19337x37f3384d.w7();
            if (w76 != null) {
                this.f381610a.v0().set(1, w76.f266407d);
                this.f381610a.v0().set(5, w76.f266406c);
                this.f381610a.v0().set(10, w76.f266404a);
                java.lang.String m75945x2fec8307 = this.f381610a.v0().m75945x2fec8307(0);
                if (android.text.TextUtils.isEmpty(m75945x2fec8307)) {
                    m75945x2fec8307 = w76.f266405b;
                }
                this.f381610a.v0().set(0, m75945x2fec8307);
                k97Var.set(28, w76.f266408e);
                int i17 = w76.f266410g;
                if (i17 == 16) {
                    k97Var.set(19, java.lang.Integer.valueOf(i17));
                    android.net.Uri parse = android.net.Uri.parse(k97Var.m75945x2fec8307(1));
                    android.net.Uri.Builder buildUpon = parse.buildUpon();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(parse.getQueryParameter("item_show_type"))) {
                        buildUpon.appendQueryParameter("item_show_type", "16");
                    }
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(parse.getQueryParameter(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54503x6397ab9d))) {
                        buildUpon.appendQueryParameter(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54503x6397ab9d, w76.f266412i);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebMultiTaskHelper", "fillMultiTaskInfo  rawUrl:%s,  vid:%s", viewOnCreateContextMenuListenerC19337x37f3384d.F7(), w76.f266412i);
                    k97Var.set(1, buildUpon.build().toString());
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebMultiTaskHelper", "fillMultiTaskInfo  webMultiTaskData.rawUrl:" + k97Var.m75945x2fec8307(1) + "   itemShowType:" + w76.f266410g);
            }
            java.lang.String m75945x2fec83072 = this.f381610a.v0().m75945x2fec8307(1);
            if (android.text.TextUtils.isEmpty(m75945x2fec83072)) {
                m75945x2fec83072 = viewOnCreateContextMenuListenerC19337x37f3384d.getIntent().getStringExtra("webpageTitle");
            }
            if (android.text.TextUtils.isEmpty(m75945x2fec83072)) {
                m75945x2fec83072 = viewOnCreateContextMenuListenerC19337x37f3384d.f265348f.mo64579x7531c8a2();
            }
            this.f381610a.v0().set(1, m75945x2fec83072);
            this.f381610a.f66790x225a93cf = k97Var.mo14344x5f01b1f6();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebMultiTaskHelper", e17, "onMenuMultiTaskSelected", new java.lang.Object[0]);
        }
    }

    @Override // jk3.b
    public void m(android.graphics.Bitmap bitmap) {
        if (this.B) {
            super.m(bitmap);
        }
    }

    @Override // jk3.b
    public com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c o() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f381610a;
        if (c16601x7ed0e40c == null || c16601x7ed0e40c.f66790x225a93cf == null) {
            return null;
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.setDataPosition(0);
        this.f381610a.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c createFromParcel = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c.f37692x681a0c0c.createFromParcel(obtain);
        createFromParcel.f66791xc8a07680 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.s0.d(((cw4.v0) ((qk.j9) i95.n0.c(qk.j9.class))).wi(this.f522850x.F7()));
        return createFromParcel;
    }

    @Override // jk3.b
    public void r(android.graphics.Bitmap bitmap, boolean z17) {
        if (this.f522850x.w7() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebMultiTaskHelper", "not MP page");
        } else if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebMultiTaskHelper", "ended, remove historyTaskInfo");
            D();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebMultiTaskHelper", "not ended update historyTaskInfo");
            H(bitmap, true);
        }
    }

    @Override // jk3.b
    public boolean w() {
        return true;
    }

    @Override // jk3.b
    public boolean x() {
        return this.f522850x.m8() && this.f381644d.g();
    }

    @Override // jk3.v, jk3.b
    public void y(int i17, java.lang.String str) {
        java.lang.String a17;
        this.B = true;
        super.y(i17, str);
        if (a()) {
            return;
        }
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f522850x;
        if (((yq1.z) a0Var).o(viewOnCreateContextMenuListenerC19337x37f3384d.F7())) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f381610a;
            try {
                android.net.Uri parse = android.net.Uri.parse(viewOnCreateContextMenuListenerC19337x37f3384d.F7());
                long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(parse.getQueryParameter("mid"), 0L);
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(parse.getQueryParameter("idx"), 0);
                a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a("" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(new java.lang.String(android.util.Base64.decode(parse.getQueryParameter("__biz"), 2)), 0L) + V + P);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebMultiTaskHelper", "getUrlKey e:" + e17);
                a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(viewOnCreateContextMenuListenerC19337x37f3384d.F7());
            }
            c16601x7ed0e40c.f66791xc8a07680 = a17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebMultiTaskHelper", "isMpArticle, url: %s", viewOnCreateContextMenuListenerC19337x37f3384d.F7());
        }
    }

    @Override // jk3.b
    public void z() {
        super.z();
        if (this.A) {
            return;
        }
        this.A = true;
    }
}
