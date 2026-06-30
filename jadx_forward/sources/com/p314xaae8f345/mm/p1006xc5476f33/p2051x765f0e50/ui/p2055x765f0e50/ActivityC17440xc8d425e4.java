package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI */
/* loaded from: classes5.dex */
public class ActivityC17440xc8d425e4 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0, l75.z0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f242068q = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f242069d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f242070e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f242071f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f242072g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f242073h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f242074i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f242075m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f242076n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f242077o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f242078p;

    public final void T6() {
        this.f242073h.setVisibility(8);
        this.f242073h.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.j0b));
        this.f242074i.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.it6));
        this.f242074i.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560118bj));
        this.f242070e.setEnabled(true);
        this.f242070e.setFilters(new android.text.InputFilter[]{new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.gi(this)});
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572080y6), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ii(this));
    }

    public final void U6() {
        if (this.f242076n) {
            this.f242073h.setVisibility(0);
            this.f242073h.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.j0b));
            this.f242074i.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.it6));
            this.f242074i.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560118bj));
            this.f242070e.setEnabled(false);
            this.f242070e.setFilters(new android.text.InputFilter[]{new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.zh(this)});
            this.f242073h.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.bi(this));
            mo53060x36654fab(this.f242070e);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f242071f)) {
            T6();
            return;
        }
        this.f242073h.setVisibility(0);
        this.f242073h.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.in8));
        this.f242074i.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ija));
        this.f242074i.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2y));
        this.f242070e.setEnabled(false);
        this.f242070e.setFilters(new android.text.InputFilter[]{new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ci(this)});
        this.f242073h.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ei(this));
        mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571914te), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fi(this));
        mo53060x36654fab(this.f242070e);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        boolean z17 = false;
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o1(obj, 0);
        if (a1Var != gm0.j1.u().c() || o17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MiroMsg.SettingsModifyEmailAddrUI", "onNotifyChange error obj:%d stg:%s", java.lang.Integer.valueOf(o17), a1Var);
            return;
        }
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(7, null);
        this.f242071f = (java.lang.String) gm0.j1.u().c().l(5, null);
        if (num != null && (num.intValue() & 2) != 0) {
            z17 = true;
        }
        this.f242076n = z17;
        this.f242078p = z17;
        if (this.f242077o) {
            U6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.clr;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f574585it5);
        this.f242070e = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.f568403mq0);
        this.f242073h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.orx);
        this.f242074i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.jpr);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(5, null);
        this.f242071f = str;
        this.f242070e.setText(str);
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(7, null);
        this.f242076n = (num == null || (num.intValue() & 2) == 0) ? false : true;
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ph(this));
        this.f242077o = true;
        U6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1 && i18 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.SettingsModifyEmailAddrUI", "summerunbind REQUEST_CODE_SET_PSW ok and start NetSceneCheckUnBind again oldEmail: " + this.f242071f + " newEmail: " + this.f242072g);
            gm0.j1.d().g(new r61.f1(4));
            this.f242069d = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.irw), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yh(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        gm0.j1.d().a(138, this);
        gm0.j1.d().a(254, this);
        gm0.j1.d().a(256, this);
        gm0.j1.d().a(108, this);
        gm0.j1.d().a(255, this);
        gm0.j1.u().c().a(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(138, this);
        gm0.j1.d().q(254, this);
        gm0.j1.d().q(256, this);
        gm0.j1.d().q(108, this);
        gm0.j1.d().q(255, this);
        gm0.j1.u().c().e(this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        mo48674x36654fab();
        finish();
        if (this.f242078p) {
            setResult(-1);
            return true;
        }
        setResult(0);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiroMsg.SettingsModifyEmailAddrUI", "onSceneEnd: sceneType = " + m1Var.mo808xfb85f7b0() + " errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        android.app.ProgressDialog progressDialog = this.f242069d;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f242069d = null;
        }
        o25.s1 a17 = f14.g.a();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        ((com.p314xaae8f345.mm.app.o7) a17).getClass();
        if (com.p314xaae8f345.mm.ui.pc.a(mo55332x76847179, i17, i18, str, 4)) {
            return;
        }
        if (m1Var.mo808xfb85f7b0() == 254) {
            if (i17 == 0 && i18 == 0) {
                r61.f1 f1Var = (r61.f1) m1Var;
                this.f242075m = ((r45.t20) f1Var.f474404e.f152244b.f152233a).f467609e;
                f1Var.H();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f242075m)) {
                    gm0.j1.d().g(new com.p314xaae8f345.mm.p957x53236a1b.w0(2));
                    return;
                } else {
                    gm0.j1.d().g(new v61.i0(2, this.f242070e.getText().toString().trim()));
                    return;
                }
            }
            android.app.ProgressDialog progressDialog2 = this.f242069d;
            if (progressDialog2 != null) {
                progressDialog2.dismiss();
                this.f242069d = null;
            }
            if (i18 == -3) {
                db5.e1.C(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.j0f), null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.j0g), getString(com.p314xaae8f345.mm.R.C30867xcad56011.j0e), true, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ji(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.fh(this));
                return;
            }
            if (i18 == -82) {
                db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.inx, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.gh(this));
                return;
            }
            if (i18 == -83) {
                db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.inu, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.hh(this));
                return;
            } else if (i18 == -84) {
                db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.inv, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ih(this));
                return;
            } else {
                if (i18 == -85) {
                    db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.inq, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.jh(this));
                    return;
                }
                return;
            }
        }
        if (m1Var.mo808xfb85f7b0() != 256) {
            if (m1Var.mo808xfb85f7b0() == 138) {
                return;
            }
            if (m1Var.mo808xfb85f7b0() == 108) {
                android.app.ProgressDialog progressDialog3 = this.f242069d;
                if (progressDialog3 != null) {
                    progressDialog3.dismiss();
                    this.f242069d = null;
                }
                if (i17 == 0 && i18 == 0) {
                    db5.e1.m(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.iqc, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.uh(this));
                    return;
                } else {
                    db5.e1.t(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.iqb, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vh(this));
                    return;
                }
            }
            if (m1Var.mo808xfb85f7b0() == 255) {
                if (i18 == 0) {
                    gm0.j1.d().g(new v61.i0(2, this.f242070e.getText().toString().trim()));
                    return;
                }
                android.app.ProgressDialog progressDialog4 = this.f242069d;
                if (progressDialog4 != null) {
                    progressDialog4.dismiss();
                    this.f242069d = null;
                }
                db5.e1.C(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.j0f), null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.j0g), getString(com.p314xaae8f345.mm.R.C30867xcad56011.j0e), true, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.wh(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xh(this));
                return;
            }
            return;
        }
        ((com.p314xaae8f345.mm.app.o7) f14.g.a()).Zi();
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((v61.i0) m1Var).f514981e.f152243a.f152217a;
        if (((r45.rh) fVar).f466394d != 1) {
            if (((r45.rh) fVar).f466394d == 2) {
                android.app.ProgressDialog progressDialog5 = this.f242069d;
                if (progressDialog5 != null) {
                    progressDialog5.dismiss();
                    this.f242069d = null;
                }
                if (i17 == 0 && i18 == 0) {
                    gm0.j1.u().c().w(7, java.lang.Integer.valueOf(((java.lang.Integer) gm0.j1.u().c().l(7, null)).intValue() | 2));
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f242075m)) {
                        db5.e1.m(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.inr, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.th(this));
                        return;
                    } else {
                        db5.e1.y(mo55332x76847179(), this.f242075m, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571988vj), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.sh(this));
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i17 == 0 && i18 == 0) {
            db5.e1.m(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.iqc, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.kh(this));
            return;
        }
        android.app.ProgressDialog progressDialog6 = this.f242069d;
        if (progressDialog6 != null) {
            progressDialog6.dismiss();
            this.f242069d = null;
        }
        if (i18 == -82) {
            db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.inx, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.lh(this));
            return;
        }
        if (i18 == -83) {
            db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.inu, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.mh(this));
            return;
        }
        if (i18 == -84) {
            db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.inv, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.nh(this));
            return;
        }
        if (i18 == -85) {
            db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.inq, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.oh(this));
        } else if (i18 == -86) {
            db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.iny, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.qh(this));
        } else {
            db5.e1.t(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.iqb, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.rh(this));
        }
    }
}
