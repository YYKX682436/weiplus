package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsChattingBackgroundUI */
/* loaded from: classes8.dex */
public class ActivityC17416xb325f68b extends com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f241898m = 0;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f241899g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f241900h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f241901i;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef
    public int V6() {
        return 3;
    }

    public final java.lang.String X6(boolean z17) {
        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
        f21.j0 Bi = f21.r0.Bi();
        return this.f241900h ? Bi.s0("default", z17) : Bi.s0(this.f241901i, z17);
    }

    public final boolean Y6() {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(mo55332x76847179, "android.permission.CAMERA", 16, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsChattingBackgroundUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), mo55332x76847179());
        if (!a17) {
            return false;
        }
        Z6();
        return true;
    }

    public final void Z6() {
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        java.lang.String K = lp0.b.K();
        java.lang.String str = "microMsg." + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
        ((ub0.r) oVar).getClass();
        if (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.l(this, K, str, 2)) {
            return;
        }
        dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.igw), 1).show();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576463bw;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17;
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.iq7);
        this.f241899g = m79336x8b97809d();
        boolean booleanExtra = getIntent().getBooleanExtra("isApplyToAll", true);
        this.f241900h = booleanExtra;
        if (!booleanExtra && (h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241899g).h("settings_chatting_bg_apply_to_all")) != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f241899g).v(h17);
        }
        this.f241901i = getIntent().getStringExtra(dm.i4.f66875xa013b0d5);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.r9(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1) {
            if (intent == null) {
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("CropImageMode", 2);
            intent2.putExtra("CropImage_bg_vertical", X6(true));
            intent2.putExtra("CropImage_bg_horizontal", X6(false));
            ((com.p314xaae8f345.mm.app.y7) f14.g.b()).q(this, intent, intent2, g83.a.a(), 4, null);
            return;
        }
        if (i17 == 2) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context applicationContext = getApplicationContext();
            java.lang.String a17 = g83.a.a();
            ((ub0.r) oVar).getClass();
            java.lang.String b17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.b(applicationContext, intent, a17);
            if (b17 == null) {
                return;
            }
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("CropImageMode", 2);
            intent3.putExtra("CropImage_ImgPath", b17);
            intent3.putExtra("CropImage_bg_vertical", X6(true));
            intent3.putExtra("CropImage_bg_horizontal", X6(false));
            ((com.p314xaae8f345.mm.app.y7) f14.g.b()).p(this, intent3, 4);
            return;
        }
        if (i17 != 3) {
            if (i17 == 4 && i18 == -1) {
                gm0.j1.u().c().w(66820, -1);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10198, -1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsChattingBackgroundUI", "set chating bg id:%d", -1);
                if (this.f241900h) {
                    gm0.j1.u().c().w(12311, -1);
                    ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
                    f21.r0.Bi().m0(1);
                } else {
                    ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
                    f21.b wi6 = f21.r0.wi();
                    f21.a m07 = wi6.m0(this.f241901i);
                    if (m07 == null) {
                        f21.a aVar = new f21.a();
                        aVar.f340365a = this.f241901i;
                        aVar.f340366b = -1;
                        wi6.n0(aVar);
                    } else {
                        m07.f340366b = -1;
                        wi6.s0(m07);
                    }
                }
            }
        } else if (i18 != -1) {
            return;
        }
        if (this.f241900h) {
            return;
        }
        setResult(-1);
        finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2057xc84c5534.AbstractActivityC17500x57a60aef, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsChattingBackgroundUI", str + " item has been clicked!");
        if (str.equals("settings_chatting_bg_select_bg")) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17459xab65a958.class);
            intent.putExtra("isApplyToAll", this.f241900h);
            intent.putExtra(dm.i4.f66875xa013b0d5, this.f241901i);
            startActivityForResult(intent, 3);
            return true;
        }
        if (str.equals("settings_chatting_bg_select_from_album")) {
            ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.h(this, 1, null);
            return true;
        }
        if (str.equals("settings_chatting_bg_take_photo")) {
            return Y6();
        }
        if (!str.equals("settings_chatting_bg_apply_to_all")) {
            return false;
        }
        db5.e1.u(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.iq8), "", new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.v9(this), null);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsChattingBackgroundUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsChattingBackgroundUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 16) {
            if (iArr[0] == 0) {
                Z6();
                return;
            } else {
                db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh8), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.s9(this), null);
                return;
            }
        }
        if (i17 != 145) {
            return;
        }
        if (iArr[0] == 0) {
            Y6();
        } else {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhi), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.apj), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.t9(this), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.u9(this));
        }
    }
}
