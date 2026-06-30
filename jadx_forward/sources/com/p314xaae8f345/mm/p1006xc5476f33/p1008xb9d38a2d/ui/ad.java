package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public class ad implements com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ge, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af f155252d;

    /* renamed from: f, reason: collision with root package name */
    public final int f155254f;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fa f155253e = null;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db f155255g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 f155256h = null;

    public ad(int i17) {
        this.f155254f = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileVerifyForgetPwdLogic", "forget pwd, purpose %d", java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ge
    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fe feVar) {
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
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ad.class.getName());
        sb6.append(",R200_400,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R200_400"));
        sb6.append(",1");
        n71.a.b(10645, sb6.toString());
        int i17 = this.f155254f;
        com.p314xaae8f345.mm.p944x882e457a.m1 eVar = i17 == 3 ? new h11.e(this.f155252d.f155061h, 8, "", 0, "") : i17 == 5 ? new r61.e1(this.f155252d.f155061h, 20, "", 0, "", "") : null;
        if (eVar == null) {
            return false;
        }
        gm0.j1.d().g(eVar);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ge
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af activityC11457x794a57af) {
        this.f155252d = activityC11457x794a57af;
    }

    public final void c() {
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ad.class.getName());
        sb6.append(",R200_350_auto,");
        gm0.j1.b();
        sb6.append(gm0.m.f("R200_350_auto"));
        sb6.append(",1");
        n71.a.b(10645, sb6.toString());
        gm0.j1.d().a(145, this);
        gm0.j1.d().a(132, this);
        int i17 = this.f155254f;
        if (i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af activityC11457x794a57af = this.f155252d;
            m1Var = new h11.e(activityC11457x794a57af.f155061h, 9, activityC11457x794a57af.f155058e.getText().toString().trim(), 0, "");
        } else if (i17 == 5) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af activityC11457x794a57af2 = this.f155252d;
            m1Var = new r61.e1(activityC11457x794a57af2.f155061h, 21, activityC11457x794a57af2.f155058e.getText().toString().trim(), 0, "", "");
        } else {
            m1Var = null;
        }
        if (m1Var != null) {
            gm0.j1.d().g(m1Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af activityC11457x794a57af3 = this.f155252d;
            activityC11457x794a57af3.f155059f = db5.e1.Q(activityC11457x794a57af3, activityC11457x794a57af3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), this.f155252d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ahe), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.vc(this, m1Var));
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        tm.a b17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileVerifyForgetPwdLogic", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        android.app.ProgressDialog progressDialog = this.f155252d.f155059f;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f155252d.f155059f = null;
        }
        if (this.f155256h == null) {
            this.f155256h = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6();
        }
        if ((m1Var.mo808xfb85f7b0() == 252 || m1Var.mo808xfb85f7b0() == 701) && this.f155253e != null) {
            gm0.j1.d().q(701, this);
            gm0.j1.d().q(252, this);
            com.p314xaae8f345.mm.p957x53236a1b.v0 v0Var = (com.p314xaae8f345.mm.p957x53236a1b.v0) m1Var;
            this.f155256h.f155822e = v0Var.M();
            this.f155256h.f155824g = v0Var.K();
            this.f155256h.f155823f = v0Var.L();
            this.f155256h.f155825h = v0Var.N();
            if (i18 != -6 && i18 != -311 && i18 != -310) {
                this.f155253e.a(this.f155252d, i17, i18, str, m1Var);
                if (i17 == 0 && i18 == 0) {
                    this.f155252d.W6(m1Var instanceof com.p314xaae8f345.mm.p957x53236a1b.v0 ? v0Var.V() : true);
                    return;
                }
                return;
            }
            gm0.j1.d().a(701, this);
            gm0.j1.d().a(252, this);
            if (this.f155255g == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af activityC11457x794a57af = this.f155252d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 w6Var = this.f155256h;
                this.f155255g = bb5.j.a(activityC11457x794a57af, com.p314xaae8f345.mm.R.C30867xcad56011.hxl, w6Var.f155825h, w6Var.f155824g, w6Var.f155822e, w6Var.f155823f, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.xc(this), null, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.yc(this), w6Var);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 w6Var2 = this.f155256h;
            java.lang.String str2 = w6Var2.f155822e;
            int length = w6Var2.f155824g.length;
            fp.k.c();
            com.p314xaae8f345.mm.ui.p2641xabe4e85a.C21463x46cf9db c21463x46cf9db = this.f155255g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.w6 w6Var3 = this.f155256h;
            c21463x46cf9db.b(w6Var3.f155825h, w6Var3.f155824g, w6Var3.f155822e, w6Var3.f155823f);
            return;
        }
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        int i19 = this.f155254f;
        if (mo808xfb85f7b0 == 145) {
            h11.e eVar = (h11.e) m1Var;
            this.f155256h.f155819b = eVar.Q();
            this.f155256h.f155821d = eVar.P();
            gm0.j1.d().q(145, this);
            if (i17 == 0 && i18 == 0) {
                if (i19 == 3) {
                    gm0.j1.d().a(701, this);
                    gm0.j1.d().a(252, this);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.zc zcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.zc(this);
                    java.lang.String Q = eVar.Q();
                    java.lang.String P = eVar.P();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af activityC11457x794a57af2 = this.f155252d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fa faVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.fa(zcVar, Q, P, activityC11457x794a57af2.f155061h);
                    this.f155253e = faVar;
                    faVar.b(activityC11457x794a57af2);
                    return;
                }
                return;
            }
            if (i18 == -51) {
                tm.a b18 = tm.a.b(str);
                if (b18 != null) {
                    b18.c(this.f155252d, null, null);
                    return;
                } else {
                    db5.e1.i(this.f155252d, com.p314xaae8f345.mm.R.C30867xcad56011.ahi, com.p314xaae8f345.mm.R.C30867xcad56011.aho);
                    return;
                }
            }
        }
        if (m1Var.mo808xfb85f7b0() == 132) {
            gm0.j1.d().q(132, this);
            if (i17 == 0 && i18 == 0) {
                if (i19 == 5) {
                    java.lang.String str3 = ((r45.ei) ((r61.e1) m1Var).f474393d.f152244b.f152233a).f455042d;
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("setpwd_ticket", str3);
                    this.f155252d.setResult(-1, intent);
                    this.f155252d.finish();
                    return;
                }
                return;
            }
            if (i18 == -51) {
                tm.a b19 = tm.a.b(str);
                if (b19 != null) {
                    b19.c(this.f155252d, null, null);
                    return;
                } else {
                    db5.e1.i(this.f155252d, com.p314xaae8f345.mm.R.C30867xcad56011.ahi, com.p314xaae8f345.mm.R.C30867xcad56011.aho);
                    return;
                }
            }
        }
        if (this.f155252d.V6(i17, i18, str)) {
            return;
        }
        o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = this.f155252d.mo55332x76847179();
        ((com.p314xaae8f345.mm.app.o7) wi6).getClass();
        if (com.p314xaae8f345.mm.ui.pc.a(mo55332x76847179, i17, i18, str, 4)) {
            return;
        }
        if ((m1Var.mo808xfb85f7b0() == 252 || m1Var.mo808xfb85f7b0() == 701) && (b17 = tm.a.b(str)) != null && b17.c(this.f155252d, null, null)) {
            return;
        }
        if (i17 == 0 && i18 == 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11457x794a57af activityC11457x794a57af3 = this.f155252d;
        dp.a.m125854x26a183b(activityC11457x794a57af3, activityC11457x794a57af3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ahh, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ge
    /* renamed from: start */
    public void mo48685x68ac462() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ad.class.getName());
        sb6.append(",F200_300,");
        gm0.j1.b();
        sb6.append(gm0.m.f("F200_300"));
        sb6.append(",1");
        n71.a.c(10645, true, sb6.toString());
        n71.a.d("F200_300");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ge
    /* renamed from: stop */
    public void mo48686x360802() {
        int i17 = this.f155252d.f155068r;
        if (i17 == -1) {
            i17 = 2;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ad.class.getName());
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
