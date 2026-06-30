package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b;

/* loaded from: classes8.dex */
public class w extends com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4 {

    /* renamed from: y, reason: collision with root package name */
    public static final java.util.Set f265765y;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f265766v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f265767w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f265768x;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f265765y = hashSet;
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
        hashSet.add("float_ball_key");
    }

    public w(dp1.x xVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d) {
        super(xVar);
        this.f265768x = false;
        this.f265766v = viewOnCreateContextMenuListenerC19337x37f3384d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFloatBallHelper", "createFloatBallHelper, WebViewUI:%s", java.lang.Integer.valueOf(viewOnCreateContextMenuListenerC19337x37f3384d.hashCode()));
    }

    public static void t0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        android.os.Bundle bundle;
        if (c12886x91aa2b6d == null || (bundle = c12886x91aa2b6d.G) == null) {
            return;
        }
        int i17 = bundle.getInt(com.p314xaae8f345.mm.ui.w2.f292730j, -1);
        java.lang.String string = c12886x91aa2b6d.G.getString("rawUrl");
        if (i17 <= -1 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            return;
        }
        c12886x91aa2b6d.G.getString("srcDisplayname");
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).d(string, i17, c12886x91aa2b6d.G.getInt("KOpenArticleSceneFromScene"), new java.lang.Object[0]);
    }

    public static void u0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        android.os.Bundle bundle;
        java.lang.String str;
        if (c12886x91aa2b6d == null || (bundle = c12886x91aa2b6d.G) == null) {
            return;
        }
        java.lang.String str2 = c12886x91aa2b6d.f174582g;
        java.lang.String string = bundle.getString("rawUrl");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFloatBallHelper", "handleBallInfoClicked, url:%s", string);
        int i17 = c12886x91aa2b6d.G.getInt("minimize_secene", 0);
        int i18 = c12886x91aa2b6d.G.getInt(com.p314xaae8f345.mm.ui.w2.f292730j, -1);
        android.content.Intent intent = new android.content.Intent();
        qp1.m.b(intent, c12886x91aa2b6d.G, f265765y);
        intent.putExtra("rawUrl", string);
        intent.putExtra("minimize_secene", i17);
        intent.putExtra("float_ball_key", str2);
        intent.putExtra("key_enable_teen_mode_check", true);
        intent.putExtra("key_enable_fts_quick", true);
        intent.putExtra("webpageTitle", c12886x91aa2b6d.f174596x);
        intent.putExtra("key_enter_float_ball_type", c12886x91aa2b6d.f174579d);
        ep1.m.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, intent, true);
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFloatBallHelper", "openWebPage, go to jd url");
            intent.putExtra("useJs", true);
            intent.putExtra("vertical_scroll", true);
            intent.putExtra("minimize_secene", 1);
            intent.putExtra("KPublisherId", "jd_store");
            h45.g0.f360478a = 9;
        } else {
            if (i17 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFloatBallHelper", "openWebPage, go to game url");
                str = ".ui.tools.game.GameWebViewUI";
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                j45.l.j(context, "webview", str, intent, ep1.m.f(context));
            }
            if (i18 > -1) {
                boolean z17 = i18 == 5;
                int i19 = c12886x91aa2b6d.G.getInt("KOpenArticleSceneFromScene");
                int i27 = c12886x91aa2b6d.G.getInt(com.p314xaae8f345.mm.ui.w2.f292727g);
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(i19)) {
                    if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, string, i18, z17, i19, i27, intent)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFloatBallHelper", "openWebPage, use fast Load");
                        return;
                    }
                }
            }
        }
        str = ".ui.tools.WebViewUI";
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        j45.l.j(context2, "webview", str, intent, ep1.m.f(context2));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void H() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFloatBallHelper", "onReceivedBallInfoRemovedEvent, WebViewUI:%s", java.lang.Integer.valueOf(this.f265766v.hashCode()));
        n0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void I() {
        this.f174779u = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFloatBallHelper", "onReceivedFinishWhenSwitchBallEvent, WebViewUI:%s", java.lang.Integer.valueOf(this.f265766v.hashCode()));
        this.f174772n.q(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void Z(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
        if (c12886x91aa2b6d == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c12886x91aa2b6d.f174596x) || this.f174665d.f174596x.startsWith("http://") || this.f174665d.f174596x.startsWith("https://") || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !(str.startsWith("http://") || str.startsWith("https://"))) {
            super.Z(str);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d, gp1.r
    public void b(int i17, java.lang.String str) {
        this.f265767w = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFloatBallHelper", "onCreate, type:%s, key:%s", java.lang.Integer.valueOf(i17), str);
        super.b(i17, str);
        Q(1);
        t().f174619f = 3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81 t17 = t();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f265766v;
        t17.f174618e = viewOnCreateContextMenuListenerC19337x37f3384d.L1.Q();
        if (v0(viewOnCreateContextMenuListenerC19337x37f3384d.F7())) {
            t().f174622i = viewOnCreateContextMenuListenerC19337x37f3384d.getIntent().getStringExtra("srcUsername");
        }
        int i18 = t().f174618e;
        g();
        dp1.x xVar = this.f174772n;
        if (xVar.mo54480x1e885992() == null || this.f174665d.G == null) {
            return;
        }
        qp1.m.c(xVar.mo54480x1e885992(), this.f174665d.G, f265765y);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f174665d.G.getString("float_ball_key"))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = this.f174665d;
            c12886x91aa2b6d.G.putString("float_ball_key", c12886x91aa2b6d.f174582g);
        }
        g();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d, gp1.r
    public void d() {
        gp1.v vVar;
        if (!this.f265767w || (vVar = this.f174669h) == null) {
            return;
        }
        vVar.U(this.f174665d);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d, gp1.r
    public void g() {
        gp1.v vVar;
        if (!this.f265767w || (vVar = this.f174669h) == null) {
            return;
        }
        vVar.V(this.f174665d);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d, gp1.r
    public void j() {
        gp1.v vVar;
        if (!this.f265767w || (vVar = this.f174669h) == null) {
            return;
        }
        vVar.u(this.f174665d);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4
    public boolean k0() {
        int intExtra = this.f174772n.mo54480x1e885992().getIntExtra("key_enter_float_ball_type", -1);
        return intExtra == 2 || intExtra == 50;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public boolean n() {
        return this.f265766v.m8();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public boolean o() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4
    public void o0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFloatBallHelper", "onDestroy, WebViewUI:%s", java.lang.Integer.valueOf(this.f265766v.hashCode()));
        super.o0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d r() {
        return s();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public boolean v() {
        return this.f265766v.m8() && this.f174772n.t() && this.f174669h.Y();
    }

    public boolean v0(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        if (!str.startsWith("https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/")) {
            if (!str.startsWith("http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/")) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFloatBallHelper", "onEnterPage, WebViewUI:%s, isEntered: %b", java.lang.Integer.valueOf(this.f265766v.hashCode()), java.lang.Boolean.valueOf(this.f265768x));
        if (this.f265768x) {
            return;
        }
        this.f265768x = true;
        super.x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s4, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFloatBallHelper", "onExitPage, WebViewUI:%s", java.lang.Integer.valueOf(this.f265766v.hashCode()));
        super.z();
        this.f265768x = false;
    }
}
