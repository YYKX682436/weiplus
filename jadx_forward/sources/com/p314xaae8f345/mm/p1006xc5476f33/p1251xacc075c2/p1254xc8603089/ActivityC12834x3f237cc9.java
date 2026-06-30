package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1254xc8603089;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.backup.backuppcui.BackupPcUI */
/* loaded from: classes12.dex */
public class ActivityC12834x3f237cc9 extends com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a implements ln1.m {

    /* renamed from: o, reason: collision with root package name */
    public static boolean f174062o;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f174063e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f174064f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f174065g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f174066h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f174067i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f174068m;

    /* renamed from: n, reason: collision with root package name */
    public final kn1.d f174069n = new rn1.a0(this);

    public static void Z6(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1254xc8603089.ActivityC12834x3f237cc9 activityC12834x3f237cc9) {
        activityC12834x3f237cc9.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcUI", "jumpToNetworkDisconnectDoc.");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, activityC12834x3f237cc9.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aao));
        intent.putExtra("rawUrl", activityC12834x3f237cc9.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aan, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()));
        intent.putExtra("showShare", false);
        intent.putExtra("neverGetA8Key", true);
        j45.l.j(activityC12834x3f237cc9, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // ln1.m
    public void X0(java.util.LinkedList linkedList, kn1.i iVar, int i17) {
    }

    public final void a7() {
        kn1.g e17 = qn1.c.i().e();
        e17.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        int i17 = e17.f391142a;
        int i18 = qn1.c.i().j().f446494a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcUI", "closeImpl, backupPcState:%d, commandMode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != -22 && i17 != -21 && i17 != -13 && i17 != -5 && i17 != 1 && i17 != 11) {
            if (i17 == 15) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcUI", "closeImpl backup finish, user click close.");
                b7();
                return;
            }
            if (i17 != 21) {
                if (i17 == 24) {
                    qn1.c.i().e().f391142a = 25;
                    W6(1);
                    return;
                }
                if (i17 != 30) {
                    if (i17 != -3 && i17 != -2 && i17 != -1) {
                        if (i17 != 26) {
                            if (i17 != 27) {
                                W6(1);
                                return;
                            } else {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcUI", "closeImpl recover finish, user click close.");
                                b7();
                                return;
                            }
                        }
                    }
                }
                db5.e1.l(this, com.p314xaae8f345.mm.R.C30867xcad56011.f572223aa5, com.p314xaae8f345.mm.R.C30867xcad56011.f572222aa4, com.p314xaae8f345.mm.R.C30867xcad56011.abb, com.p314xaae8f345.mm.R.C30867xcad56011.f572213a72, false, new rn1.b(this), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f560236ek);
                return;
            }
        }
        if (1 == i18 || 3 == i18) {
            qn1.c.i().l().d(false);
            qn1.c.i().e().f391142a = -100;
            W6(1);
        } else if (2 == i18 || 4 == i18) {
            qn1.c.i().k().d(false, false, -100);
        } else {
            qn1.c.i().e().f391142a = -100;
            W6(1);
        }
    }

    public final void b7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcUI", "exitBackupPc.");
        if (1 != qn1.c.i().j().f446494a && 3 != qn1.c.i().j().f446494a) {
            if (2 == qn1.c.i().j().f446494a || 4 == qn1.c.i().j().f446494a) {
                qn1.c.i().k().d(true, true, -100);
                qn1.c.i().h().e();
                return;
            }
            return;
        }
        qn1.c.i().m().d();
        qn1.c.i().m().e();
        qn1.c.i().l().d(true);
        qn1.c.i().h().e();
        qn1.c.i().e().f391142a = -100;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        W6(1);
    }

    public void c7() {
        xn1.h m17 = qn1.c.i().m();
        if (m17.f536990f) {
            m17.j(m17.b());
            qn1.c.i().l().f(kn1.k.t(m17.g()));
            qn1.c.i().l().b(m17.g().size());
        }
    }

    @Override // ln1.m
    public void e1(java.util.LinkedList linkedList) {
        android.widget.TextView textView = this.f174067i;
        if (textView != null) {
            textView.setVisibility(0);
        }
        kn1.g e17 = qn1.c.i().e();
        e17.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (e17.f391142a == 12) {
            c7();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569703ja;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f174067i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ab7);
        this.f174068m = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ab9);
        this.f174065g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.abo);
        this.f174066h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.abn);
        this.f174063e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.aau);
        this.f174064f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.aat);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras().getBoolean("MMWizardActivity.WIZARD_ROOT_KILLSELF", false)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcUI", "onCreate.");
        mo2533x106ab264().o();
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.getClass();
        com.p314xaae8f345.mm.ui.vb.e();
        mo43517x10010bd5();
        if (qn1.c.i().j().f446508o) {
            qn1.c.i().j().f446508o = false;
            android.content.Intent registerReceiver = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i17 = 100;
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("status", -1);
                boolean z17 = intExtra == 2 || intExtra == 5;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupUtil", "checkBatteryLevel, battery isCharging[%b]", java.lang.Boolean.valueOf(z17));
                if (!z17) {
                    int intExtra2 = registerReceiver.getIntExtra(ya.b.f77487x44fa364, -1);
                    int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                    if (intExtra2 >= 0 && intExtra3 > 0) {
                        i17 = (intExtra2 * 100) / intExtra3;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupUtil", "checkBatteryLevel, battery level remaining[%d]", java.lang.Integer.valueOf(i17));
                }
            }
            if (i17 < 20) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.mo68477x336bdfd8(400L, 4L, 1L, false);
                g0Var.d(13736, 4, qn1.c.i().j().f446495b, kn1.k.z(this), 0, java.lang.Integer.valueOf(qn1.c.i().j().f446507n));
                db5.e1.l(this, com.p314xaae8f345.mm.R.C30867xcad56011.aab, com.p314xaae8f345.mm.R.C30867xcad56011.aaa, com.p314xaae8f345.mm.R.C30867xcad56011.acg, 0, false, new rn1.a(this, i17), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f560235ej);
            }
        }
        if (((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).n0()) {
            c01.w9.a();
        }
        qn1.c.i().m().f536988d = this;
        qn1.c.i().m().d();
        qn1.c.i().m().e();
        qn1.c.i().m().c(true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcUI", "onDestroy. stack:%s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        super.onDestroy();
        qn1.c.i().m().d();
        if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2512xacc075c2.C19942x42ca6069()) == 1) {
            xn1.h m17 = qn1.c.i().m();
            m17.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConvChooseHelper", "clearChooseDataNow");
            m17.f537003s.clear();
            m17.f537004t = null;
            m17.f536998n = null;
            m17.f536990f = false;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = m17.f536995h;
            if (b4Var != null) {
                b4Var.d();
            }
        } else {
            qn1.c.i().m().e();
        }
        qn1.c.i().m().f536988d = null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        a7();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcUI", "onPause.");
        qn1.c0 l17 = qn1.c.i().l();
        kn1.d dVar = this.f174069n;
        synchronized (l17.f446485d) {
            ((java.util.HashSet) l17.f446485d).remove(dVar);
        }
        qn1.t k17 = qn1.c.i().k();
        kn1.d dVar2 = this.f174069n;
        synchronized (k17.f446547h) {
            ((java.util.HashSet) k17.f446547h).remove(dVar2);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcUI", "onResume.");
        qn1.c0 l17 = qn1.c.i().l();
        kn1.d dVar = this.f174069n;
        synchronized (l17.f446485d) {
            ((java.util.HashSet) l17.f446485d).add(dVar);
        }
        qn1.t k17 = qn1.c.i().k();
        kn1.d dVar2 = this.f174069n;
        synchronized (k17.f446547h) {
            ((java.util.HashSet) k17.f446547h).add(dVar2);
        }
        kn1.g e17 = qn1.c.i().e();
        e17.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        ((rn1.a0) this.f174069n).a(e17.f391142a);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcUI", "onStart.");
        f174062o = getIntent().getBooleanExtra("isRecoverTransferFinishFromBanner", false);
    }

    @Override // ln1.l
    public void s2(java.util.LinkedList linkedList) {
    }
}
