package com.tencent.mm.plugin.backup.backuppcui;

@db5.a(3)
/* loaded from: classes12.dex */
public class BackupPcUI extends com.tencent.mm.ui.MMWizardActivity implements ln1.m {

    /* renamed from: o, reason: collision with root package name */
    public static boolean f92529o;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f92530e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f92531f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f92532g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f92533h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f92534i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f92535m;

    /* renamed from: n, reason: collision with root package name */
    public final kn1.d f92536n = new rn1.a0(this);

    public static void Z6(com.tencent.mm.plugin.backup.backuppcui.BackupPcUI backupPcUI) {
        backupPcUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcUI", "jumpToNetworkDisconnectDoc.");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, backupPcUI.getString(com.tencent.mm.R.string.aao));
        intent.putExtra("rawUrl", backupPcUI.getString(com.tencent.mm.R.string.aan, com.tencent.mm.sdk.platformtools.m2.d()));
        intent.putExtra("showShare", false);
        intent.putExtra("neverGetA8Key", true);
        j45.l.j(backupPcUI, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // ln1.m
    public void X0(java.util.LinkedList linkedList, kn1.i iVar, int i17) {
    }

    public final void a7() {
        kn1.g e17 = qn1.c.i().e();
        e17.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        int i17 = e17.f309609a;
        int i18 = qn1.c.i().j().f364961a;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcUI", "closeImpl, backupPcState:%d, commandMode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != -22 && i17 != -21 && i17 != -13 && i17 != -5 && i17 != 1 && i17 != 11) {
            if (i17 == 15) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcUI", "closeImpl backup finish, user click close.");
                b7();
                return;
            }
            if (i17 != 21) {
                if (i17 == 24) {
                    qn1.c.i().e().f309609a = 25;
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
                                com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcUI", "closeImpl recover finish, user click close.");
                                b7();
                                return;
                            }
                        }
                    }
                }
                db5.e1.l(this, com.tencent.mm.R.string.f490690aa5, com.tencent.mm.R.string.f490689aa4, com.tencent.mm.R.string.abb, com.tencent.mm.R.string.f490680a72, false, new rn1.b(this), null, com.tencent.mm.R.color.f478703ek);
                return;
            }
        }
        if (1 == i18 || 3 == i18) {
            qn1.c.i().l().d(false);
            qn1.c.i().e().f309609a = -100;
            W6(1);
        } else if (2 == i18 || 4 == i18) {
            qn1.c.i().k().d(false, false, -100);
        } else {
            qn1.c.i().e().f309609a = -100;
            W6(1);
        }
    }

    public final void b7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcUI", "exitBackupPc.");
        if (1 != qn1.c.i().j().f364961a && 3 != qn1.c.i().j().f364961a) {
            if (2 == qn1.c.i().j().f364961a || 4 == qn1.c.i().j().f364961a) {
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
        qn1.c.i().e().f309609a = -100;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        W6(1);
    }

    public void c7() {
        xn1.h m17 = qn1.c.i().m();
        if (m17.f455457f) {
            m17.j(m17.b());
            qn1.c.i().l().f(kn1.k.t(m17.g()));
            qn1.c.i().l().b(m17.g().size());
        }
    }

    @Override // ln1.m
    public void e1(java.util.LinkedList linkedList) {
        android.widget.TextView textView = this.f92534i;
        if (textView != null) {
            textView.setVisibility(0);
        }
        kn1.g e17 = qn1.c.i().e();
        e17.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (e17.f309609a == 12) {
            c7();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488170ja;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f92534i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ab7);
        this.f92535m = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ab9);
        this.f92532g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.abo);
        this.f92533h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.abn);
        this.f92530e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.aau);
        this.f92531f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.aat);
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras().getBoolean("MMWizardActivity.WIZARD_ROOT_KILLSELF", false)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcUI", "onCreate.");
        getSupportActionBar().o();
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.getClass();
        com.tencent.mm.ui.vb.e();
        initView();
        if (qn1.c.i().j().f364975o) {
            qn1.c.i().j().f364975o = false;
            android.content.Intent registerReceiver = com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i17 = 100;
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("status", -1);
                boolean z17 = intExtra == 2 || intExtra == 5;
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupUtil", "checkBatteryLevel, battery isCharging[%b]", java.lang.Boolean.valueOf(z17));
                if (!z17) {
                    int intExtra2 = registerReceiver.getIntExtra(ya.b.LEVEL, -1);
                    int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                    if (intExtra2 >= 0 && intExtra3 > 0) {
                        i17 = (intExtra2 * 100) / intExtra3;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.BackupUtil", "checkBatteryLevel, battery level remaining[%d]", java.lang.Integer.valueOf(i17));
                }
            }
            if (i17 < 20) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.idkeyStat(400L, 4L, 1L, false);
                g0Var.d(13736, 4, qn1.c.i().j().f364962b, kn1.k.z(this), 0, java.lang.Integer.valueOf(qn1.c.i().j().f364974n));
                db5.e1.l(this, com.tencent.mm.R.string.aab, com.tencent.mm.R.string.aaa, com.tencent.mm.R.string.acg, 0, false, new rn1.a(this, i17), null, com.tencent.mm.R.color.f478702ej);
            }
        }
        if (((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).n0()) {
            c01.w9.a();
        }
        qn1.c.i().m().f455455d = this;
        qn1.c.i().m().d();
        qn1.c.i().m().e();
        qn1.c.i().m().c(true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcUI", "onDestroy. stack:%s", new com.tencent.mm.sdk.platformtools.z3());
        super.onDestroy();
        qn1.c.i().m().d();
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.backup.RepairerConfigBackupCacheClear()) == 1) {
            xn1.h m17 = qn1.c.i().m();
            m17.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ConvChooseHelper", "clearChooseDataNow");
            m17.f455470s.clear();
            m17.f455471t = null;
            m17.f455465n = null;
            m17.f455457f = false;
            com.tencent.mm.sdk.platformtools.b4 b4Var = m17.f455462h;
            if (b4Var != null) {
                b4Var.d();
            }
        } else {
            qn1.c.i().m().e();
        }
        qn1.c.i().m().f455455d = null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        a7();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcUI", "onPause.");
        qn1.c0 l17 = qn1.c.i().l();
        kn1.d dVar = this.f92536n;
        synchronized (l17.f364952d) {
            ((java.util.HashSet) l17.f364952d).remove(dVar);
        }
        qn1.t k17 = qn1.c.i().k();
        kn1.d dVar2 = this.f92536n;
        synchronized (k17.f365014h) {
            ((java.util.HashSet) k17.f365014h).remove(dVar2);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcUI", "onResume.");
        qn1.c0 l17 = qn1.c.i().l();
        kn1.d dVar = this.f92536n;
        synchronized (l17.f364952d) {
            ((java.util.HashSet) l17.f364952d).add(dVar);
        }
        qn1.t k17 = qn1.c.i().k();
        kn1.d dVar2 = this.f92536n;
        synchronized (k17.f365014h) {
            ((java.util.HashSet) k17.f365014h).add(dVar2);
        }
        kn1.g e17 = qn1.c.i().e();
        e17.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        ((rn1.a0) this.f92536n).a(e17.f309609a);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcUI", "onStart.");
        f92529o = getIntent().getBooleanExtra("isRecoverTransferFinishFromBanner", false);
    }

    @Override // ln1.l
    public void s2(java.util.LinkedList linkedList) {
    }
}
