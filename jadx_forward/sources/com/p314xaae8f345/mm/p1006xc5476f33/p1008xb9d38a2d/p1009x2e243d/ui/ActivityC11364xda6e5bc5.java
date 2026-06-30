package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI */
/* loaded from: classes5.dex */
public class ActivityC11364xda6e5bc5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970 {
    public static final /* synthetic */ int E = 0;
    public boolean A;
    public java.lang.String B;
    public java.lang.String C;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 D;

    /* renamed from: z, reason: collision with root package name */
    public java.util.Map f154544z;

    public static void f7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindMobilePolicyUI", "checkAndStartBindPhoneGuidance %s", java.lang.Integer.valueOf(r61.e1.f474392i));
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b, new android.os.Bundle(), o61.a.class, new p61.C29959x57c45d1());
    }

    public static void g7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindMobilePolicyUI", "clearBindPhoneGuidance");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_wording_cfg", null);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b, bundle, o61.c.class, new p61.C29960x57c45d2());
    }

    public static void h7(final java.lang.String str) {
        boolean mo40975xf7b3660d = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40975xf7b3660d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindMobilePolicyUI", "isForeGround %s", java.lang.Boolean.valueOf(mo40975xf7b3660d));
        if (mo40975xf7b3660d) {
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: p61.b2$$d
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11364xda6e5bc5.E;
                    android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11364xda6e5bc5.class);
                    intent.addFlags(67108864);
                    intent.putExtra("key_upload_scene", 9);
                    intent.putExtra("key_wording_cfg", str);
                    com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, intent);
                    r61.e1.f474392i = 1;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindMobilePolicyUI", "realStartBindPhoneGuidanceUI");
                }
            });
        }
    }

    public static void j7(final java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindMobilePolicyUI", "startBindPhoneGuidanceUI %s", str);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_wording_cfg", str);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274587b, bundle, o61.c.class, new com.p314xaae8f345.mm.p794xb0fa9b5e.r() { // from class: p61.b2$$c
            @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
            public final void a(java.lang.Object obj) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11364xda6e5bc5.h7(str);
            }
        });
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a
    public void V6() {
        W6(1);
        g7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970
    public void a7() {
        i7(12901);
        mo48674x36654fab();
        if (this.f154511x != 9 || this.f154501n == js.x0.SUCC) {
            super.a7();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(mo55332x76847179());
        u1Var.g((java.lang.String) this.f154544z.get(".sysmsg.BindPhoneGuidance.doublecheck_content"));
        u1Var.j((java.lang.String) this.f154544z.get(".sysmsg.BindPhoneGuidance.doublecheck_cancel"));
        u1Var.n((java.lang.String) this.f154544z.get(".sysmsg.BindPhoneGuidance.doublecheck_ok"));
        u1Var.a(true);
        u1Var.b(new p61.f2(this));
        u1Var.q(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970
    public void b7() {
        i7(12902);
        super.b7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970
    public void c7(android.content.Intent intent) {
        intent.putExtra("bind_hint_text", getString(com.p314xaae8f345.mm.R.C30867xcad56011.a_f));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970
    public void e7() {
        if (this.f154501n != js.x0.NO_INIT) {
            super.e7();
            return;
        }
        mo74407xb0dfae51(1, false);
        this.f154497g.setVisibility(0);
        this.f154500m.setVisibility(8);
        com.p314xaae8f345.mm.ui.bk.s0(this.f154495e.getPaint());
        android.widget.TextView textView = this.f154495e;
        java.util.Map map = this.f154544z;
        textView.setText(map != null ? (java.lang.CharSequence) map.get(".sysmsg.BindPhoneGuidance.guidanceTitle") : getString(com.p314xaae8f345.mm.R.C30867xcad56011.agk));
        android.widget.TextView textView2 = this.f154497g;
        java.util.Map map2 = this.f154544z;
        textView2.setText(map2 != null ? (java.lang.CharSequence) map2.get(".sysmsg.BindPhoneGuidance.guidanceTip") : getString(com.p314xaae8f345.mm.R.C30867xcad56011.agj));
        this.f154497g.setTextSize(0, i65.a.f(this, com.p314xaae8f345.mm.R.C30860x5b28f31.f561101k) * i65.a.m(this));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.B)) {
            this.f154499i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.afs);
        } else {
            this.f154499i.setText(this.B);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569730k7;
    }

    public final void i7(int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6337xa96d9601 c6337xa96d9601 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6337xa96d9601();
        c6337xa96d9601.f136917e = 1029L;
        c6337xa96d9601.f136918f = i17;
        c6337xa96d9601.f136916d = 0L;
        c6337xa96d9601.f136920h = c6337xa96d9601.b("GuidanceScene", this.C, true);
        c6337xa96d9601.k();
        c6337xa96d9601.o();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(getIntent().getStringExtra("key_wording_cfg"), "sysmsg", null);
        this.f154544z = d17;
        if (d17 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindMobilePolicyUI", "wording:%s", d17);
        this.B = (java.lang.String) this.f154544z.get(".sysmsg.BindPhoneGuidance.guidanceBtn");
        this.A = "yes".equals(this.f154544z.get(".sysmsg.BindPhoneGuidance.syncEscape"));
        java.lang.String str = (java.lang.String) this.f154544z.get(".sysmsg.BindPhoneGuidance.guidanceScene");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        this.C = str;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6337xa96d9601 c6337xa96d9601 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6337xa96d9601();
        c6337xa96d9601.f136916d = 1L;
        c6337xa96d9601.f136920h = c6337xa96d9601.b("GuidanceScene", this.C, true);
        c6337xa96d9601.k();
        c6337xa96d9601.o();
        js.x0 b17 = r61.q0.b();
        if (b17 == js.x0.NO_INIT || b17 == js.x0.SET_MOBILE) {
            gm0.j1.u().c().w(4097, "");
            gm0.j1.u().c().w(6, "");
        }
        super.mo43517x10010bd5();
        java.util.Map map = this.f154544z;
        if (map != null && "yes".equals(map.get(".sysmsg.BindPhoneGuidance.canUseBankAuthInstead"))) {
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mo7);
            textView.setOnClickListener(new p61.d2(this));
            textView.setVisibility(0);
            return;
        }
        java.util.Map map2 = this.f154544z;
        if (map2 == null || map2.get(".sysmsg.BindPhoneGuidance.guidanceHelp") == null) {
            return;
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mo7);
        textView2.setText((java.lang.CharSequence) this.f154544z.get(".sysmsg.BindPhoneGuidance.guidanceHelp.tips"));
        textView2.setOnClickListener(new p61.e2(this));
        textView2.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.Map map;
        super.onActivityResult(i17, i18, intent);
        if (i17 != 100 || intent == null || (map = (java.util.Map) intent.getBundleExtra("result_data").getSerializable("next_params")) == null || !"continue_bind_mobile".equalsIgnoreCase((java.lang.String) map.get("next_step"))) {
            return;
        }
        b7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970, com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo78530x8b45058f();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        gm0.j1.d().q(268, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        super.mo815x76e0bfae(i17, i18, str, m1Var);
        if (m1Var.mo808xfb85f7b0() == 268) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.D;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            if (i17 == 0 && i18 == 0) {
                V6();
            } else {
                android.widget.Toast.makeText(this, java.lang.String.format("(%s,%s,%s)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str), 0).show();
            }
        }
    }
}
