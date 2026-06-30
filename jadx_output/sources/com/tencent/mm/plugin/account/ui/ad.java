package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class ad implements com.tencent.mm.plugin.account.ui.ge, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.account.ui.MobileVerifyUI f73719d;

    /* renamed from: f, reason: collision with root package name */
    public final int f73721f;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.account.ui.fa f73720e = null;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.applet.SecurityImage f73722g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.account.ui.w6 f73723h = null;

    public ad(int i17) {
        this.f73721f = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MobileVerifyForgetPwdLogic", "forget pwd, purpose %d", java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.plugin.account.ui.ge
    public boolean a(com.tencent.mm.plugin.account.ui.fe feVar) {
        int ordinal = feVar.ordinal();
        if (ordinal == 1) {
            c();
            return false;
        }
        if (ordinal != 2) {
            if (ordinal != 3) {
                return false;
            }
            c();
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.tencent.mm.plugin.account.ui.ad.class.getName());
        sb6.append(",R200_400,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R200_400"));
        sb6.append(",1");
        n71.a.b(10645, sb6.toString());
        int i17 = this.f73721f;
        com.tencent.mm.modelbase.m1 eVar = i17 == 3 ? new h11.e(this.f73719d.f73528h, 8, "", 0, "") : i17 == 5 ? new r61.e1(this.f73719d.f73528h, 20, "", 0, "", "") : null;
        if (eVar == null) {
            return false;
        }
        gm0.j1.d().g(eVar);
        return false;
    }

    @Override // com.tencent.mm.plugin.account.ui.ge
    public void b(com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI) {
        this.f73719d = mobileVerifyUI;
    }

    public final void c() {
        com.tencent.mm.modelbase.m1 m1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.tencent.mm.plugin.account.ui.ad.class.getName());
        sb6.append(",R200_350_auto,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R200_350_auto"));
        sb6.append(",1");
        n71.a.b(10645, sb6.toString());
        gm0.j1.d().a(145, this);
        gm0.j1.d().a(132, this);
        int i17 = this.f73721f;
        if (i17 == 3) {
            com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI = this.f73719d;
            m1Var = new h11.e(mobileVerifyUI.f73528h, 9, mobileVerifyUI.f73525e.getText().toString().trim(), 0, "");
        } else if (i17 == 5) {
            com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI2 = this.f73719d;
            m1Var = new r61.e1(mobileVerifyUI2.f73528h, 21, mobileVerifyUI2.f73525e.getText().toString().trim(), 0, "", "");
        } else {
            m1Var = null;
        }
        if (m1Var != null) {
            gm0.j1.d().g(m1Var);
            com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI3 = this.f73719d;
            mobileVerifyUI3.f73526f = db5.e1.Q(mobileVerifyUI3, mobileVerifyUI3.getString(com.tencent.mm.R.string.f490573yv), this.f73719d.getString(com.tencent.mm.R.string.ahe), true, true, new com.tencent.mm.plugin.account.ui.vc(this, m1Var));
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        tm.a b17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MobileVerifyForgetPwdLogic", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        android.app.ProgressDialog progressDialog = this.f73719d.f73526f;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f73719d.f73526f = null;
        }
        if (this.f73723h == null) {
            this.f73723h = new com.tencent.mm.plugin.account.ui.w6();
        }
        if ((m1Var.getType() == 252 || m1Var.getType() == 701) && this.f73720e != null) {
            gm0.j1.d().q(701, this);
            gm0.j1.d().q(252, this);
            com.tencent.mm.modelsimple.v0 v0Var = (com.tencent.mm.modelsimple.v0) m1Var;
            this.f73723h.f74289e = v0Var.M();
            this.f73723h.f74291g = v0Var.K();
            this.f73723h.f74290f = v0Var.L();
            this.f73723h.f74292h = v0Var.N();
            if (i18 != -6 && i18 != -311 && i18 != -310) {
                this.f73720e.a(this.f73719d, i17, i18, str, m1Var);
                if (i17 == 0 && i18 == 0) {
                    this.f73719d.W6(m1Var instanceof com.tencent.mm.modelsimple.v0 ? v0Var.V() : true);
                    return;
                }
                return;
            }
            gm0.j1.d().a(701, this);
            gm0.j1.d().a(252, this);
            if (this.f73722g == null) {
                com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI = this.f73719d;
                com.tencent.mm.plugin.account.ui.w6 w6Var = this.f73723h;
                this.f73722g = bb5.j.a(mobileVerifyUI, com.tencent.mm.R.string.hxl, w6Var.f74292h, w6Var.f74291g, w6Var.f74289e, w6Var.f74290f, new com.tencent.mm.plugin.account.ui.xc(this), null, new com.tencent.mm.plugin.account.ui.yc(this), w6Var);
                return;
            }
            com.tencent.mm.plugin.account.ui.w6 w6Var2 = this.f73723h;
            java.lang.String str2 = w6Var2.f74289e;
            int length = w6Var2.f74291g.length;
            fp.k.c();
            com.tencent.mm.ui.applet.SecurityImage securityImage = this.f73722g;
            com.tencent.mm.plugin.account.ui.w6 w6Var3 = this.f73723h;
            securityImage.b(w6Var3.f74292h, w6Var3.f74291g, w6Var3.f74289e, w6Var3.f74290f);
            return;
        }
        int type = m1Var.getType();
        int i19 = this.f73721f;
        if (type == 145) {
            h11.e eVar = (h11.e) m1Var;
            this.f73723h.f74286b = eVar.Q();
            this.f73723h.f74288d = eVar.P();
            gm0.j1.d().q(145, this);
            if (i17 == 0 && i18 == 0) {
                if (i19 == 3) {
                    gm0.j1.d().a(701, this);
                    gm0.j1.d().a(252, this);
                    com.tencent.mm.plugin.account.ui.zc zcVar = new com.tencent.mm.plugin.account.ui.zc(this);
                    java.lang.String Q = eVar.Q();
                    java.lang.String P = eVar.P();
                    com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI2 = this.f73719d;
                    com.tencent.mm.plugin.account.ui.fa faVar = new com.tencent.mm.plugin.account.ui.fa(zcVar, Q, P, mobileVerifyUI2.f73528h);
                    this.f73720e = faVar;
                    faVar.b(mobileVerifyUI2);
                    return;
                }
                return;
            }
            if (i18 == -51) {
                tm.a b18 = tm.a.b(str);
                if (b18 != null) {
                    b18.c(this.f73719d, null, null);
                    return;
                } else {
                    db5.e1.i(this.f73719d, com.tencent.mm.R.string.ahi, com.tencent.mm.R.string.aho);
                    return;
                }
            }
        }
        if (m1Var.getType() == 132) {
            gm0.j1.d().q(132, this);
            if (i17 == 0 && i18 == 0) {
                if (i19 == 5) {
                    java.lang.String str3 = ((r45.ei) ((r61.e1) m1Var).f392860d.f70711b.f70700a).f373509d;
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("setpwd_ticket", str3);
                    this.f73719d.setResult(-1, intent);
                    this.f73719d.finish();
                    return;
                }
                return;
            }
            if (i18 == -51) {
                tm.a b19 = tm.a.b(str);
                if (b19 != null) {
                    b19.c(this.f73719d, null, null);
                    return;
                } else {
                    db5.e1.i(this.f73719d, com.tencent.mm.R.string.ahi, com.tencent.mm.R.string.aho);
                    return;
                }
            }
        }
        if (this.f73719d.V6(i17, i18, str)) {
            return;
        }
        o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
        androidx.appcompat.app.AppCompatActivity context = this.f73719d.getContext();
        ((com.tencent.mm.app.o7) wi6).getClass();
        if (com.tencent.mm.ui.pc.a(context, i17, i18, str, 4)) {
            return;
        }
        if ((m1Var.getType() == 252 || m1Var.getType() == 701) && (b17 = tm.a.b(str)) != null && b17.c(this.f73719d, null, null)) {
            return;
        }
        if (i17 == 0 && i18 == 0) {
            return;
        }
        com.tencent.mm.plugin.account.ui.MobileVerifyUI mobileVerifyUI3 = this.f73719d;
        dp.a.makeText(mobileVerifyUI3, mobileVerifyUI3.getString(com.tencent.mm.R.string.ahh, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
    }

    @Override // com.tencent.mm.plugin.account.ui.ge
    public void start() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.tencent.mm.plugin.account.ui.ad.class.getName());
        sb6.append(",F200_300,");
        gm0.j1.b();
        sb6.append(gm0.m.f("F200_300"));
        sb6.append(",1");
        n71.a.c(10645, true, sb6.toString());
        n71.a.d("F200_300");
    }

    @Override // com.tencent.mm.plugin.account.ui.ge
    public void stop() {
        int i17 = this.f73719d.f73535r;
        if (i17 == -1) {
            i17 = 2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.tencent.mm.plugin.account.ui.ad.class.getName());
        sb6.append(",F200_300,");
        gm0.j1.b();
        sb6.append(gm0.m.f("F200_300"));
        sb6.append(",");
        sb6.append(i17);
        n71.a.c(10645, false, sb6.toString());
        gm0.j1.d().q(132, this);
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        gm0.j1.d().q(145, this);
    }
}
