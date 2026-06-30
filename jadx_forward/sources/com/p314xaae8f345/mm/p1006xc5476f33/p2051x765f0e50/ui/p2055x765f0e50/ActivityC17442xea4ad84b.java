package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

@db5.a(m123858x6ac9171 = 2048)
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyPatSuffixUI */
/* loaded from: classes5.dex */
public class ActivityC17442xea4ad84b extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a implements sr.k, xg3.d0 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10449x84ee1171 f242083e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04 f242084f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f242085g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f242086h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f242087i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f242088m;

    /* renamed from: n, reason: collision with root package name */
    public int f242089n = 20;

    /* renamed from: o, reason: collision with root package name */
    public int f242090o = 1;

    /* renamed from: p, reason: collision with root package name */
    public final android.text.TextWatcher f242091p = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ri(this);

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f242085g.getLayoutParams();
        if (z17) {
            layoutParams.bottomMargin = i65.a.b(this, 16) + i17;
        } else {
            layoutParams.bottomMargin = i65.a.b(this, 96);
        }
        this.f242085g.setLayoutParams(layoutParams);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.clt;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f242083e = (com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10449x84ee1171) findViewById(com.p314xaae8f345.mm.R.id.hde);
        this.f242085g = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kao);
        this.f242084f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04) findViewById(com.p314xaae8f345.mm.R.id.kpy);
        this.f242086h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.kpz);
        this.f242085g.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.pi(this));
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAT_SUFFIX_STRING_SYNC, null);
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAT_SUFFIX_VERSION_INT_SYNC, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsModifyPatSuffixUI", "curSuffix %s, suffixVersion %d", str, java.lang.Integer.valueOf(r17));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (r17 == 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j()) {
                str = "的" + str;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22618x59d05a04 c22618x59d05a04 = this.f242084f;
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            c22618x59d05a04.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(this, str));
            this.f242084f.mo81549xf579a34a(str.length());
        }
        this.f242084f.requestFocus();
        this.f242084f.addTextChangedListener(this.f242091p);
        ((e21.f) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508, this, true);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.qi(this));
        this.f242083e.m43724x1b9709f9(this.f242084f);
        this.f242083e.setVisibility(4);
        this.f242083e.m43723x8a9c4129(this);
        if (this.f242084f.getText().length() > 0) {
            this.f242083e.m43725xd2dca690(true);
        } else {
            this.f242083e.m43725xd2dca690(false);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20379, "" + java.lang.System.currentTimeMillis(), 3, 0, java.lang.Integer.valueOf(this.f242090o));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("jumptoPat", false)) {
            this.f242090o = 2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20379, "" + java.lang.System.currentTimeMillis(), 1, 0, java.lang.Integer.valueOf(this.f242090o));
        this.f242089n = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("PatSuffixMaxByte", 16);
        mo43517x10010bd5();
        this.f242088m = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.oi(this), false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10449x84ee1171 c10449x84ee1171 = this.f242083e;
        if (c10449x84ee1171 != null) {
            c10449x84ee1171.f146478q = null;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = c10449x84ee1171.f146471g;
            if (abstractC19636xc6b37291 != null) {
                abstractC19636xc6b37291.l();
                c10449x84ee1171.f146471g.a();
            }
        }
        android.util.SparseArray sparseArray = ((e21.f) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).f328047d;
        if (sparseArray.indexOfKey(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508) >= 0) {
            ((java.util.LinkedList) sparseArray.get(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508)).remove(this);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f242088m;
        if (b4Var != null) {
            b4Var.d();
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        if (!this.f242083e.h()) {
            finish();
            return false;
        }
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10449x84ee1171 c10449x84ee1171 = this.f242083e;
        c10449x84ee1171.g();
        c10449x84ee1171.setVisibility(8);
        return true;
    }

    @Override // xg3.d0
    public void u0(int i17, r45.g25 g25Var, xg3.q0 q0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsModifyPatSuffixUI", "ret:%d, content:%s, title:%s", java.lang.Integer.valueOf(i17), g25Var.f456374d, g25Var.f456375e);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f242087i;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        try {
            if (i17 != 0) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g25Var.f456374d)) {
                    db5.e1.i(mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f571924to, com.p314xaae8f345.mm.R.C30867xcad56011.f572012w8);
                } else {
                    db5.e1.s(this, g25Var.f456374d, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572012w8));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20379, "" + java.lang.System.currentTimeMillis(), 2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f242090o));
                return;
            }
            db5.e1.T(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572013w9));
            r45.mo4 mo4Var = (r45.mo4) q0Var.f535964j;
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAT_SUFFIX_STRING_SYNC;
            java.lang.String str = (java.lang.String) c17.m(u3Var2, null);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            if (!str.equals(mo4Var.f462245d)) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAT_SUFFIX_VERSION_INT_SYNC, 2);
            }
            gm0.j1.u().c().x(u3Var2, mo4Var.f462245d);
            W6(1);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20379, "" + java.lang.System.currentTimeMillis(), 2, 0, java.lang.Integer.valueOf(this.f242090o));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAT_SUFFIX_MODIFY_TIP_TIMESTAMP_LONG, java.lang.Long.valueOf(c01.id.c()));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_PAT_SUFFIX_MODIFY_TIP_COUNT_INT, 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SettingsModifyPatSuffixUI", e17, "", new java.lang.Object[0]);
        }
    }
}
