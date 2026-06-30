package com.tencent.mm.plugin.account.bind.ui;

@db5.a(3)
/* loaded from: classes5.dex */
public class BindMobilePolicyUI extends com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI {
    public static final /* synthetic */ int E = 0;
    public boolean A;
    public java.lang.String B;
    public java.lang.String C;
    public com.tencent.mm.ui.widget.dialog.u3 D;

    /* renamed from: z, reason: collision with root package name */
    public java.util.Map f73011z;

    public static void f7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BindMobilePolicyUI", "checkAndStartBindPhoneGuidance %s", java.lang.Integer.valueOf(r61.e1.f392859i));
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193054b, new android.os.Bundle(), o61.a.class, new p61.b2$$a());
    }

    public static void g7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BindMobilePolicyUI", "clearBindPhoneGuidance");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_wording_cfg", null);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193054b, bundle, o61.c.class, new p61.b2$$b());
    }

    public static void h7(final java.lang.String str) {
        boolean isForeground = com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground();
        com.tencent.mars.xlog.Log.i("MicroMsg.BindMobilePolicyUI", "isForeGround %s", java.lang.Boolean.valueOf(isForeground));
        if (isForeground) {
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: p61.b2$$d
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI.E;
                    android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI.class);
                    intent.addFlags(67108864);
                    intent.putExtra("key_upload_scene", 9);
                    intent.putExtra("key_wording_cfg", str);
                    com.tencent.mm.ui.MMWizardActivity.X6(com.tencent.mm.sdk.platformtools.x2.f193071a, intent);
                    r61.e1.f392859i = 1;
                    com.tencent.mars.xlog.Log.i("MicroMsg.BindMobilePolicyUI", "realStartBindPhoneGuidanceUI");
                }
            });
        }
    }

    public static void j7(final java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BindMobilePolicyUI", "startBindPhoneGuidanceUI %s", str);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_wording_cfg", str);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193054b, bundle, o61.c.class, new com.tencent.mm.ipcinvoker.r() { // from class: p61.b2$$c
            @Override // com.tencent.mm.ipcinvoker.r
            public final void a(java.lang.Object obj) {
                com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI.h7(str);
            }
        });
    }

    @Override // com.tencent.mm.ui.MMWizardActivity
    public void V6() {
        W6(1);
        g7();
    }

    @Override // com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI
    public void a7() {
        i7(12901);
        hideVKB();
        if (this.f72978x != 9 || this.f72968n == js.x0.SUCC) {
            super.a7();
            return;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getContext());
        u1Var.g((java.lang.String) this.f73011z.get(".sysmsg.BindPhoneGuidance.doublecheck_content"));
        u1Var.j((java.lang.String) this.f73011z.get(".sysmsg.BindPhoneGuidance.doublecheck_cancel"));
        u1Var.n((java.lang.String) this.f73011z.get(".sysmsg.BindPhoneGuidance.doublecheck_ok"));
        u1Var.a(true);
        u1Var.b(new p61.f2(this));
        u1Var.q(false);
    }

    @Override // com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI
    public void b7() {
        i7(12902);
        super.b7();
    }

    @Override // com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI
    public void c7(android.content.Intent intent) {
        intent.putExtra("bind_hint_text", getString(com.tencent.mm.R.string.a_f));
    }

    @Override // com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI
    public void e7() {
        if (this.f72968n != js.x0.NO_INIT) {
            super.e7();
            return;
        }
        showOptionMenu(1, false);
        this.f72964g.setVisibility(0);
        this.f72967m.setVisibility(8);
        com.tencent.mm.ui.bk.s0(this.f72962e.getPaint());
        android.widget.TextView textView = this.f72962e;
        java.util.Map map = this.f73011z;
        textView.setText(map != null ? (java.lang.CharSequence) map.get(".sysmsg.BindPhoneGuidance.guidanceTitle") : getString(com.tencent.mm.R.string.agk));
        android.widget.TextView textView2 = this.f72964g;
        java.util.Map map2 = this.f73011z;
        textView2.setText(map2 != null ? (java.lang.CharSequence) map2.get(".sysmsg.BindPhoneGuidance.guidanceTip") : getString(com.tencent.mm.R.string.agj));
        this.f72964g.setTextSize(0, i65.a.f(this, com.tencent.mm.R.dimen.f479568k) * i65.a.m(this));
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.B)) {
            this.f72966i.setText(com.tencent.mm.R.string.afs);
        } else {
            this.f72966i.setText(this.B);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
    }

    @Override // com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488197k7;
    }

    public final void i7(int i17) {
        com.tencent.mm.autogen.mmdata.rpt.BindPhoneGuidancePageReportStruct bindPhoneGuidancePageReportStruct = new com.tencent.mm.autogen.mmdata.rpt.BindPhoneGuidancePageReportStruct();
        bindPhoneGuidancePageReportStruct.f55384e = 1029L;
        bindPhoneGuidancePageReportStruct.f55385f = i17;
        bindPhoneGuidancePageReportStruct.f55383d = 0L;
        bindPhoneGuidancePageReportStruct.f55387h = bindPhoneGuidancePageReportStruct.b("GuidanceScene", this.C, true);
        bindPhoneGuidancePageReportStruct.k();
        bindPhoneGuidancePageReportStruct.o();
    }

    @Override // com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(getIntent().getStringExtra("key_wording_cfg"), "sysmsg", null);
        this.f73011z = d17;
        if (d17 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BindMobilePolicyUI", "wording:%s", d17);
        this.B = (java.lang.String) this.f73011z.get(".sysmsg.BindPhoneGuidance.guidanceBtn");
        this.A = "yes".equals(this.f73011z.get(".sysmsg.BindPhoneGuidance.syncEscape"));
        java.lang.String str = (java.lang.String) this.f73011z.get(".sysmsg.BindPhoneGuidance.guidanceScene");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        this.C = str;
        com.tencent.mm.autogen.mmdata.rpt.BindPhoneGuidancePageReportStruct bindPhoneGuidancePageReportStruct = new com.tencent.mm.autogen.mmdata.rpt.BindPhoneGuidancePageReportStruct();
        bindPhoneGuidancePageReportStruct.f55383d = 1L;
        bindPhoneGuidancePageReportStruct.f55387h = bindPhoneGuidancePageReportStruct.b("GuidanceScene", this.C, true);
        bindPhoneGuidancePageReportStruct.k();
        bindPhoneGuidancePageReportStruct.o();
        js.x0 b17 = r61.q0.b();
        if (b17 == js.x0.NO_INIT || b17 == js.x0.SET_MOBILE) {
            gm0.j1.u().c().w(4097, "");
            gm0.j1.u().c().w(6, "");
        }
        super.initView();
        java.util.Map map = this.f73011z;
        if (map != null && "yes".equals(map.get(".sysmsg.BindPhoneGuidance.canUseBankAuthInstead"))) {
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mo7);
            textView.setOnClickListener(new p61.d2(this));
            textView.setVisibility(0);
            return;
        }
        java.util.Map map2 = this.f73011z;
        if (map2 == null || map2.get(".sysmsg.BindPhoneGuidance.guidanceHelp") == null) {
            return;
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mo7);
        textView2.setText((java.lang.CharSequence) this.f73011z.get(".sysmsg.BindPhoneGuidance.guidanceHelp.tips"));
        textView2.setOnClickListener(new p61.e2(this));
        textView2.setVisibility(0);
    }

    @Override // com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.Map map;
        super.onActivityResult(i17, i18, intent);
        if (i17 != 100 || intent == null || (map = (java.util.Map) intent.getBundleExtra("result_data").getSerializable("next_params")) == null || !"continue_bind_mobile".equalsIgnoreCase((java.lang.String) map.get("next_step"))) {
            return;
        }
        b7();
    }

    @Override // com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI, com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
    }

    @Override // com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477855dd);
        gm0.j1.d().q(268, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI, com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        super.onSceneEnd(i17, i18, str, m1Var);
        if (m1Var.getType() == 268) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.D;
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
