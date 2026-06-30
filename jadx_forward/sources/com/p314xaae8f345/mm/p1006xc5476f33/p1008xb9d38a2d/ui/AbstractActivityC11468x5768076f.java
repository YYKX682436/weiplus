package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.SetPwdUI */
/* loaded from: classes11.dex */
public abstract class AbstractActivityC11468x5768076f extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f155182e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f155183f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.ProgressDialog f155184g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f155185h = true;

    public int Z6() {
        return 383;
    }

    public abstract com.p314xaae8f345.mm.p944x882e457a.m1 a7();

    public void b7() {
        i7();
    }

    public abstract java.lang.String c7();

    public abstract java.lang.String d7();

    public boolean e7(int i17, int i18, java.lang.String str) {
        o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        ((com.p314xaae8f345.mm.app.o7) wi6).getClass();
        return com.p314xaae8f345.mm.ui.pc.a(mo55332x76847179, i17, i18, str, 4);
    }

    public abstract boolean f7(int i17, int i18, java.lang.String str);

    public abstract void g7(c71.a aVar);

    public android.app.ProgressDialog h7(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return db5.e1.Q(context, str, str2, z17, z18, onCancelListener);
    }

    public void i7() {
        this.f155182e = c7();
        this.f155183f = d7();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f155182e)) {
            return;
        }
        if (!this.f155182e.equals(this.f155183f)) {
            g7(c71.a.TwoPasswordsNotMatch);
            return;
        }
        if (this.f155182e.length() > 16) {
            g7(c71.a.BeyondMaximumLength);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A0(this.f155182e)) {
            db5.e1.i(this, com.p314xaae8f345.mm.R.C30867xcad56011.f574329hw2, com.p314xaae8f345.mm.R.C30867xcad56011.hwx);
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Z0(this.f155182e)) {
            if (this.f155182e.length() < 8 || this.f155182e.length() >= 16) {
                g7(c71.a.NotReachMinimumLength);
                return;
            } else {
                g7(c71.a.DisallowShortNumericPassword);
                return;
            }
        }
        mo48674x36654fab();
        com.p314xaae8f345.mm.p944x882e457a.m1 a76 = a7();
        gm0.j1.d().g(a76);
        this.f155184g = h7(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574324hv4), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.th(this, a76));
        if (!(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11463xc681e6dc) || this.f155185h) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11868, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (this.f155185h) {
            if (this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11463xc681e6dc) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11868, 1);
            }
            super.onBackPressed();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        gm0.j1.d().a(Z6(), this);
        super.onCreate(bundle);
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.uh(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.vh(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(Z6(), this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String string;
        r45.cu5 cu5Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        android.app.ProgressDialog progressDialog = this.f155184g;
        r45.q26 q26Var = null;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f155184g = null;
        }
        if (m1Var.mo808xfb85f7b0() != Z6()) {
            return;
        }
        if (m1Var.mo808xfb85f7b0() != 383) {
            if (f7(i17, i18, str)) {
                return;
            }
            o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            ((com.p314xaae8f345.mm.app.o7) wi6).getClass();
            if (com.p314xaae8f345.mm.ui.pc.a(mo55332x76847179, i17, i18, str, 4)) {
                return;
            }
            dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdu, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
            return;
        }
        if (i17 != 0 || i18 != 0) {
            o25.s1 wi7 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = mo55332x76847179();
            ((com.p314xaae8f345.mm.app.o7) wi7).getClass();
            com.p314xaae8f345.mm.ui.pc.a(mo55332x768471792, i17, i18, str, 4);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) gm0.j1.u().c().l(6, null))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SetPwdUI", "has not bind mobile");
            string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.h_3);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SetPwdUI", "has bind mobile");
            string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572255ai1);
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = ((com.p314xaae8f345.mm.p957x53236a1b.f1) m1Var).f152854e;
        if (oVar != null && (fVar = oVar.f152244b.f152233a) != null) {
            q26Var = (r45.q26) fVar;
        }
        if (q26Var != null && (cu5Var = q26Var.f465142d) != null) {
            byte[] g17 = cu5Var.f453374f.g();
            android.content.SharedPreferences.Editor edit = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("auth_info_key_prefs", 4).edit();
            edit.putBoolean("key_auth_info_prefs_created", true);
            edit.putInt("key_auth_update_version", o45.wf.f424562g);
            edit.putString("_auth_key", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(g17));
            edit.putInt("_auth_uin", gm0.j1.b().h());
            edit.commit();
        }
        db5.e1.G(this, string, "", false, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.wh(this, i17, i18, str));
    }
}
