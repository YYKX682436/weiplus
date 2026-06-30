package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.BindQQUI */
/* loaded from: classes5.dex */
public class ActivityC11368x3bd82e91 extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f154596h = 0;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f154598f;

    /* renamed from: e, reason: collision with root package name */
    public int f154597e = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f154599g = null;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569740kh;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        long longValue = new kk.v(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().c().l(9, null))).longValue();
        if (longValue == 0) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ai7);
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.moe);
            textView.setVisibility(8);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ai6);
            ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mof)).setVisibility(8);
            android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.aik);
            button.setVisibility(0);
            button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572259ai5);
            button.setOnClickListener(new p61.c3(this));
            m78551x8f8ecf18(1);
        } else {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572258ai4);
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.moe);
            textView2.setVisibility(8);
            textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572256ai2);
            android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mof);
            textView3.setVisibility(0);
            textView3.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572257ai3) + longValue);
            android.widget.Button button2 = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.aik);
            button2.setVisibility(8);
            button2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fv8);
            button2.setOnClickListener(new p61.d3(this));
            mo74404x84f07bce(1, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new p61.g3(this));
        }
        if (this.f154597e == 1) {
            mo78491xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571991vm), new p61.a3(this));
        } else {
            mo54448x9c8c0d33(new p61.b3(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1 && i18 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindQQUI", "summerunbind REQUEST_CODE_SET_PSW ok and start NetSceneCheckUnBind again qq");
            gm0.j1.d().g(new r61.f1(1));
            this.f154598f = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), true, true, new p61.z2(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f154597e = getIntent().getIntExtra("bindqq_regbymobile", 0);
        gm0.j1.d().a(254, this);
        gm0.j1.d().a(255, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        gm0.j1.d().q(254, this);
        gm0.j1.d().q(255, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m1Var.mo808xfb85f7b0();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f154598f;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f154598f = null;
        }
        if (m1Var.mo808xfb85f7b0() != 254) {
            if (m1Var.mo808xfb85f7b0() == 255) {
                if (i18 == 0) {
                    com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(this, new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11372x193fe158.class));
                    return;
                } else {
                    db5.e1.C(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.j0f), null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.j0g), getString(com.p314xaae8f345.mm.R.C30867xcad56011.j0e), true, new p61.j3(this), new p61.k3(this));
                    return;
                }
            }
            return;
        }
        if (i17 == 0 && i18 == 0) {
            java.lang.String H = ((r61.f1) m1Var).H();
            this.f154599g = H;
            if (H != null && H.length() > 0) {
                gm0.j1.u().c().w(102407, this.f154599g);
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
                gm0.j1.d().g(new com.p314xaae8f345.mm.p957x53236a1b.w0(2));
                return;
            } else {
                android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11372x193fe158.class);
                intent.putExtra("notice", (java.lang.String) null);
                com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(this, intent);
                return;
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f154598f;
        if (u3Var2 != null) {
            u3Var2.dismiss();
            this.f154598f = null;
        }
        if (i18 == -3) {
            db5.e1.C(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.j0f), null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.j0g), getString(com.p314xaae8f345.mm.R.C30867xcad56011.j0e), true, new p61.h3(this), new p61.i3(this));
            return;
        }
        if (i18 == -81) {
            db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.inw, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, null);
            return;
        }
        if (i18 == -82) {
            db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.inx, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, null);
            return;
        }
        if (i18 == -83) {
            db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.inu, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, null);
            return;
        }
        if (i18 == -84) {
            db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.inv, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, null);
        } else if (i18 == -85) {
            db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.f81562int, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, null);
        } else if (i18 == -86) {
            db5.e1.m(this, com.p314xaae8f345.mm.R.C30867xcad56011.iny, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, null);
        }
    }
}
