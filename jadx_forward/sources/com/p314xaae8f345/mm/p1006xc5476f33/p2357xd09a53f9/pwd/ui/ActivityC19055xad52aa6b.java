package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletSecuritySettingUI */
/* loaded from: classes9.dex */
public class ActivityC19055xad52aa6b extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f260475e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19054x2e6b9f47 f260476f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 f260477g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 f260478h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 f260479i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 f260480m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 f260481n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.q2 f260482o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.x2 f260483p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.w2 f260484q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.t2 f260485r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.p2 f260486s;

    /* renamed from: t, reason: collision with root package name */
    public android.app.ProgressDialog f260487t;

    /* renamed from: d, reason: collision with root package name */
    public boolean f260474d = true;

    /* renamed from: u, reason: collision with root package name */
    public int f260488u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Map f260489v = new java.util.HashMap();

    public final void V6(java.lang.String str, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54) {
        if (c21549x15041e54 == null) {
            return;
        }
        android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(str);
        if (Bi != null) {
            c21549x15041e54.U = new android.graphics.drawable.BitmapDrawable(mo55332x76847179().getResources(), Bi);
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.o2 o2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.o2(this, c21549x15041e54);
            ((java.util.HashMap) this.f260489v).put(str, o2Var);
            ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(str, o2Var);
        }
    }

    public final void W6(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletSecuritySettingUI", "security info json is null");
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kyr);
            android.app.ProgressDialog progressDialog = this.f260487t;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f260487t.dismiss();
            }
            db5.e1.G(this, string, "", false, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.n2(this));
            return;
        }
        try {
            this.f260475e = m79336x8b97809d();
            if (jSONObject.has("basic_security_item")) {
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("basic_security_item");
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.q2 q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.q2(this, null);
                this.f260482o = q2Var;
                q2Var.f260593a = jSONObject2.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                this.f260482o.f260594b = jSONObject2.optString("desc");
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.q2 q2Var2 = this.f260482o;
                jSONObject2.optString("logo_url");
                q2Var2.getClass();
            }
            if (jSONObject.has("wallet_lock_info")) {
                org.json.JSONObject jSONObject3 = jSONObject.getJSONObject("wallet_lock_info");
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.x2 x2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.x2(this, null);
                this.f260483p = x2Var;
                x2Var.f260646a = jSONObject3.optString("wallet_lock_title");
                this.f260483p.f260647b = jSONObject3.optString("wallet_lock_desc");
                this.f260483p.f260648c = jSONObject3.getString("wallet_lock_logo_url");
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.x2 x2Var2 = this.f260483p;
                jSONObject3.optInt("wallet_lock_status");
                x2Var2.getClass();
                this.f260483p.f260649d = jSONObject3.optString("wallet_lock_status_name");
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.x2 x2Var3 = this.f260483p;
                jSONObject3.optBoolean("is_open_touch_pay", false);
                x2Var3.getClass();
            }
            if (jSONObject.has("property_security_info")) {
                org.json.JSONObject jSONObject4 = jSONObject.getJSONObject("property_security_info");
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.w2 w2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.w2(this, null);
                this.f260484q = w2Var;
                w2Var.f260634a = jSONObject4.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
                this.f260484q.f260635b = jSONObject4.optString("desc", "");
                this.f260484q.f260636c = jSONObject4.optString("logo_url", "");
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.w2 w2Var2 = this.f260484q;
                jSONObject4.optInt("status", 0);
                w2Var2.getClass();
                this.f260484q.f260637d = jSONObject4.optString("status_name");
                this.f260484q.f260638e = jSONObject4.optInt("jump_type");
                this.f260484q.f260639f = jSONObject4.optString("jump_h5_url");
                this.f260484q.f260640g = jSONObject4.optString("tinyapp_username");
                this.f260484q.f260641h = jSONObject4.optString("tinyapp_path");
            }
            if (jSONObject.has("safe_manager_info")) {
                org.json.JSONObject jSONObject5 = jSONObject.getJSONObject("safe_manager_info");
                if (this.f260485r == null) {
                    this.f260485r = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.t2(this, this);
                }
                this.f260485r.f260606a = jSONObject5.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
                this.f260485r.f260607b = jSONObject5.optString("desc", "");
                this.f260485r.f260608c = jSONObject5.optString("logo_url", "");
                this.f260485r.f260610e = jSONObject5.optString("installed_status_name");
                this.f260485r.f260609d = jSONObject5.optString("uninstall_status_name");
                this.f260485r.f260611f = jSONObject5.optString("protected_mode_name");
                this.f260485r.f260612g = jSONObject5.optString("jump_h5_url");
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.t2 t2Var = this.f260485r;
                t2Var.getClass();
                if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.f(this, "com.tencent.qqpimsecure")) {
                    t2Var.f260613h = 3;
                    ((ku5.t0) ku5.t0.f394148d).j(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.s2(t2Var), "check_qq_security_status");
                } else {
                    t2Var.f260613h = 0;
                }
            }
            if (jSONObject.has("balance_privacy_info")) {
                org.json.JSONObject jSONObject6 = jSONObject.getJSONObject("balance_privacy_info");
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.p2 p2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.p2(this, null);
                this.f260486s = p2Var;
                p2Var.f260584a = jSONObject6.optString("icon", "");
                this.f260486s.f260585b = jSONObject6.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
                this.f260486s.f260586c = jSONObject6.optString("desc", "");
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.p2 p2Var2 = this.f260486s;
                jSONObject6.optInt("switch_state");
                p2Var2.getClass();
                this.f260486s.f260587d = jSONObject6.optString("switch_state_info");
            }
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.c().d(jSONObject);
            gm0.j1.i();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLETLOCK_CURRENT_JSON_TYPE_STRING_SYNC, jSONObject.toString());
            Z6();
            c7();
            Y6();
            a7();
            b7();
            X6();
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260475e).notifyDataSetChanged();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletSecuritySettingUI", e17, "", new java.lang.Object[0]);
            java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.kyr);
            android.app.ProgressDialog progressDialog2 = this.f260487t;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                this.f260487t.dismiss();
            }
            db5.e1.G(this, string2, "", false, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.n2(this));
        }
        android.app.ProgressDialog progressDialog3 = this.f260487t;
        if (progressDialog3 == null || !progressDialog3.isShowing()) {
            return;
        }
        this.f260487t.dismiss();
    }

    public final void X6() {
        if (this.f260486s == null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260475e).m("balance_privacy_info", true);
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260475e).m("balance_privacy_info", false);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260475e).h("balance_privacy_info");
        this.f260481n = c21549x15041e54;
        V6(this.f260486s.f260584a, c21549x15041e54);
        this.f260481n.L(this.f260486s.f260585b);
        this.f260481n.H(this.f260486s.f260587d);
        this.f260481n.O(this.f260486s.f260586c);
        this.f260481n.Q(0);
    }

    public final void Y6() {
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260475e).m("wallet_security_digital_certificate", false);
        this.f260477g = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260475e).h("wallet_security_digital_certificate");
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.c().getClass();
        gm0.j1.i();
        if (!(((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLETDIGITAL_CERT_SHOW_INT_SYNC, 0)).intValue() > 0)) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260475e).m("wallet_security_digital_certificate", true);
            return;
        }
        if (this.f260477g == null) {
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1 c17 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.c();
        c17.getClass();
        if (!(!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.b()) && c17.f295509a > 0)) {
            this.f260477g.G(com.p314xaae8f345.mm.R.C30867xcad56011.kyx);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.c().f295512d)) {
            this.f260477g.G(com.p314xaae8f345.mm.R.C30867xcad56011.kyw);
        } else {
            this.f260477g.H(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.c().f295512d);
        }
        V6(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.c().f295513e, this.f260477g);
        this.f260477g.L(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.c().f295511c);
        this.f260477g.O(com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.p1.c().f295510b);
        this.f260477g.Q(0);
    }

    public final void Z6() {
        android.widget.TextView textView;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19054x2e6b9f47 c19054x2e6b9f47 = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19054x2e6b9f47) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260475e).h("wallet_security_basic_info");
        this.f260476f = c19054x2e6b9f47;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.q2 q2Var = this.f260482o;
        if (q2Var != null) {
            java.lang.String str = q2Var.f260593a;
            java.lang.String str2 = q2Var.f260594b;
            q2Var.getClass();
            c19054x2e6b9f47.Q = str;
            c19054x2e6b9f47.R = str2;
            c19054x2e6b9f47.S = null;
            c19054x2e6b9f47.M();
            this.f260482o.getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null) || (textView = this.f260476f.N) == null) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public final void a7() {
        this.f260478h = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260475e).h("wallet_security_pay_guard");
        if (this.f260485r == null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260475e).m("wallet_security_pay_guard", true);
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260475e).m("wallet_security_pay_guard", false);
        V6(this.f260485r.f260608c, this.f260478h);
        this.f260478h.L(this.f260485r.f260606a);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.t2 t2Var = this.f260485r;
        int i17 = t2Var.f260613h;
        java.lang.String str = i17 == 0 ? t2Var.f260609d : i17 == 1 ? t2Var.f260610e : i17 == 3 ? null : t2Var.f260611f;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f260478h.H(str);
        }
        this.f260478h.O(this.f260485r.f260607b);
        this.f260478h.Q(0);
    }

    public final void b7() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        this.f260475e = m79336x8b97809d;
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).m("wallet_security_safety_insurance", false);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260475e).h("wallet_security_safety_insurance");
        this.f260480m = c21549x15041e54;
        if (c21549x15041e54 != null) {
            c21549x15041e54.G(com.p314xaae8f345.mm.R.C30867xcad56011.kyy);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.w2 w2Var = this.f260484q;
        if (w2Var == null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260475e).m("wallet_security_safety_insurance", true);
            return;
        }
        V6(w2Var.f260636c, this.f260480m);
        this.f260480m.L(this.f260484q.f260634a);
        this.f260480m.H(this.f260484q.f260637d);
        this.f260480m.O(this.f260484q.f260635b);
        this.f260480m.Q(0);
    }

    public final void c7() {
        if (this.f260483p == null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260475e).m("wallet_security_wallet_lock", true);
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260475e).m("wallet_security_wallet_lock", false);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260475e).h("wallet_security_wallet_lock");
        this.f260479i = c21549x15041e54;
        V6(this.f260483p.f260648c, c21549x15041e54);
        this.f260479i.L(this.f260483p.f260646a);
        this.f260479i.H(this.f260483p.f260649d);
        this.f260479i.O(this.f260483p.f260647b);
        this.f260479i.Q(0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        this.f260475e = m79336x8b97809d;
        if (m79336x8b97809d != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).g(com.p314xaae8f345.mm.R.xml.f576509d5);
        }
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLETLOCK_CURRENT_JSON_TYPE_STRING_SYNC, "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        try {
            W6(new org.json.JSONObject(str));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletSecuritySettingUI", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f260488u = getIntent().getIntExtra("wallet_lock_jsapi_scene", 0);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca9650 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
        c7053xf3ca9650.f143649d = 11L;
        c7053xf3ca9650.f143650e = 1L;
        c7053xf3ca9650.f143651f = this.f260488u;
        c7053xf3ca9650.k();
        mo43517x10010bd5();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.h2(this));
        if (fp.h.c(23)) {
            getWindow().setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            m78607xef685e15(com.p314xaae8f345.mm.ui.bk.C());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        java.util.Map map = this.f260489v;
        for (java.util.Map.Entry entry : ((java.util.HashMap) map).entrySet()) {
            ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).wi((java.lang.String) entry.getKey(), (k70.f0) entry.getValue());
        }
        ((java.util.HashMap) map).clear();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.i();
        gm0.j1.n().f354821b.q(385, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if ("wallet_security_digital_certificate".equals(c21560x1fce98fb.f279313q)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca9650 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
            c7053xf3ca9650.f143649d = 12L;
            c7053xf3ca9650.f143650e = 1L;
            c7053xf3ca9650.k();
            j45.l.j(this, "wallet", ".pwd.ui.WalletDigitalCertUI", new android.content.Intent(), null);
            return true;
        }
        if ("wallet_security_pay_guard".equals(c21560x1fce98fb.f279313q)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.t2 t2Var = this.f260485r;
            if (t2Var == null) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSecuritySettingUI", "jump url %s ", t2Var.b());
            java.lang.String b17 = this.f260485r.b();
            java.util.regex.Pattern pattern = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.f295755a;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", b17);
            intent.putExtra("showShare", false);
            intent.putExtra("pay_channel", 1);
            intent.putExtra(com.p314xaae8f345.mm.ui.w2.f292738r, true);
            j45.l.j(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
            return true;
        }
        if ("wallet_security_wallet_lock".equals(c21560x1fce98fb.f279313q)) {
            ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().l(this, new android.content.Intent());
            return true;
        }
        if (!"wallet_security_safety_insurance".equals(c21560x1fce98fb.f279313q)) {
            if ("balance_privacy_info".equals(c21560x1fce98fb.f279313q)) {
                if (this.f260486s == null) {
                    return true;
                }
                if (j62.e.g().i("clicfg_open_wallet_entrance_switch_state_cpp_version_android", 0, true, true) == 1) {
                    ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("WalletEntranceStateUseCase", com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc(), new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.m2(this));
                } else {
                    j45.l.h(this, "wallet", ".pwd.ui.WalletBalancePrivacyUI");
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca96502 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
                c7053xf3ca96502.f143649d = 16L;
                c7053xf3ca96502.f143650e = 1L;
                c7053xf3ca96502.k();
            }
            return false;
        }
        if (this.f260484q == null) {
            return true;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650 c7053xf3ca96503 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7053xf3ca9650();
        c7053xf3ca96503.f143649d = 15L;
        c7053xf3ca96503.f143650e = 1L;
        c7053xf3ca96503.k();
        if (this.f260484q.f260638e == 2) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
            am.nx nxVar = c6113xa3727625.f136390g;
            nxVar.f89007i = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.w2 w2Var = this.f260484q;
            nxVar.f88999a = w2Var.f260640g;
            nxVar.f89000b = w2Var.f260641h;
            c6113xa3727625.e();
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("rawUrl", this.f260484q.f260639f);
            intent2.getStringExtra("rawUrl");
            intent2.putExtra(com.p314xaae8f345.mm.ui.w2.f292738r, true);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(mo55332x76847179(), intent2);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19054x2e6b9f47 c19054x2e6b9f47 = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19054x2e6b9f47) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f260475e).h("wallet_security_basic_info");
        this.f260476f = c19054x2e6b9f47;
        if (c19054x2e6b9f47 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.i2 i2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.i2(this);
            c19054x2e6b9f47.T = i2Var;
            android.widget.TextView textView = c19054x2e6b9f47.N;
            if (textView != null) {
                textView.setOnClickListener(i2Var);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.C19054x2e6b9f47 c19054x2e6b9f472 = this.f260476f;
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.j2 j2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.j2(this);
            c19054x2e6b9f472.U = j2Var;
            android.widget.ImageView imageView = c19054x2e6b9f472.P;
            if (imageView != null) {
                imageView.setOnClickListener(j2Var);
            }
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.a(385, this);
        if (this.f260474d) {
            this.f260487t = db5.e1.Q(this, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), false, false, null);
            this.f260474d = false;
        }
        boolean a17 = ((mz2.a) ((pz2.a) gm0.j1.s(pz2.a.class))).a();
        re4.v a18 = re4.u.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSecuritySettingUI", "getSecurityInfo isOpenTouchPay: %b", java.lang.Boolean.valueOf(a17));
        gm0.j1.d().g(new gs4.q(false, a17, a18.f476086a, a18.f476087b));
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.v2 v2Var;
        if (m1Var instanceof gs4.q) {
            org.json.JSONObject jSONObject = ((gs4.q) m1Var).f356667d;
            W6(jSONObject);
            if (jSONObject == null) {
                return;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HAD_SHOW_WALLET_SECURITY_TIPS_BOOLEAN;
            if (((java.lang.Boolean) c17.m(u3Var, java.lang.Boolean.FALSE)).booleanValue()) {
                return;
            }
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("dialog_info");
            if (optJSONObject == null) {
                v2Var = null;
            } else {
                v2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.v2();
                v2Var.f260627a = optJSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                v2Var.f260628b = optJSONObject.optString("wording");
                v2Var.f260629c = optJSONObject.optString("logo");
                v2Var.f260630d = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.u2.a(optJSONObject.optJSONObject("left_btn"));
                v2Var.f260631e = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.u2.a(optJSONObject.optJSONObject("right_btn"));
            }
            if (v2Var != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
                android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d8i, (android.view.ViewGroup) null, false);
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569294pr0);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569295pr1);
                c19659x677e0913.b(v2Var.f260629c, 0, 0, com.p314xaae8f345.mm.R.C30861xcebc809e.chz);
                textView.setText(v2Var.f260628b);
                aVar.B = true;
                aVar.A = false;
                aVar.L = inflate;
                aVar.f293242a = v2Var.f260627a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.u2 u2Var = v2Var.f260631e;
                if (u2Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u2Var.f260618a)) {
                    aVar.f293265v = v2Var.f260631e.f260618a;
                    aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.k2(this, v2Var);
                    aVar.Z = true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.u2 u2Var2 = v2Var.f260630d;
                if (u2Var2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u2Var2.f260618a)) {
                    aVar.f293266w = v2Var.f260630d.f260618a;
                    aVar.F = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.l2(this, v2Var);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(this, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
                j0Var.e(aVar);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
                if (d0Var != null) {
                    d0Var.a(j0Var.f293370r);
                }
                j0Var.show();
                gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
            }
        }
    }
}
