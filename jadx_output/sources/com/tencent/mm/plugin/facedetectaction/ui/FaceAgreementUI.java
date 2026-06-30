package com.tencent.mm.plugin.facedetectaction.ui;

@db5.a(3)
/* loaded from: classes11.dex */
public class FaceAgreementUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f100194v = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f100196e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f100197f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f100198g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f100199h;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f100204p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.z2 f100205q;

    /* renamed from: d, reason: collision with root package name */
    public android.app.Dialog f100195d = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f100200i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f100201m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f100202n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f100203o = "";

    /* renamed from: r, reason: collision with root package name */
    public boolean f100206r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f100207s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f100208t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f100209u = false;

    public static void T6(com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI faceAgreementUI) {
        android.app.Dialog dialog;
        if (faceAgreementUI.isDestroyed() || faceAgreementUI.isFinishing() || (dialog = faceAgreementUI.f100195d) == null || !dialog.isShowing()) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new l72.w(faceAgreementUI));
    }

    public final void U6() {
        vz2.c.h(com.tencent.mm.plugin.facedetect.model.k0.a(90024));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("err_msg", "cancel");
        intent.putExtra("err_code", com.tencent.mm.plugin.facedetect.model.k0.a(90024));
        setResult(0, intent);
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        if (wz2.a.f()) {
            return -1;
        }
        return com.tencent.mm.R.layout.a_z;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUI", "[onActivityResult] %s, isRestoreCreate :%s", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(this.f100208t));
        if (intent != null && intent.getExtras() != null) {
            int i19 = intent.getExtras().getInt("err_code");
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUI", "[onActivityResult] errCode :%s , errMsg: %s", java.lang.Integer.valueOf(i19), intent.getExtras().getString("err_msg"));
        }
        setResult(i18, intent);
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUI", "onBackPressed()");
        android.content.Intent intent = new android.content.Intent();
        vz2.c.h(com.tencent.mm.plugin.facedetect.model.k0.a(90024));
        intent.putExtra("err_code", com.tencent.mm.plugin.facedetect.model.k0.a(90024));
        intent.putExtra("err_msg", "cancel");
        setResult(0, intent);
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (wz2.a.f()) {
            setTheme(com.tencent.mm.R.style.f494400m2);
        }
        super.onCreate(bundle);
        ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ri(this, 11, 6);
        if (bundle != null) {
            boolean z17 = bundle.getBoolean("hasRestoredState", false);
            this.f100208t = z17;
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUI", "[onCreate] get restore key: %s", java.lang.Boolean.valueOf(z17));
        }
        this.f100209u = wz2.a.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUI", "[onCreate] %s , isRestoreCreate: %s, isOpenFaceRestoreSwitch: %s", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(this.f100208t), java.lang.Boolean.valueOf(this.f100209u));
        if (this.f100208t && this.f100209u) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceAgreementUI", "[onCreate] isRestoreCreate, return");
            return;
        }
        if (wz2.a.f()) {
            overridePendingTransition(0, 0);
            int intExtra = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            java.lang.String stringExtra = getIntent().getStringExtra("package");
            java.lang.String stringExtra2 = getIntent().getStringExtra("packageSign");
            java.lang.String stringExtra3 = getIntent().getStringExtra("otherVerifyTitleFront");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, intExtra);
            intent.putExtra("package", stringExtra);
            intent.putExtra("package_sign", stringExtra2);
            intent.putExtra("other_verify_title_front", stringExtra3);
            ((h45.q) i95.n0.c(h45.q.class)).startFaceCheckUseCase("faceCheckFrontUseCase", intent, new h45.i() { // from class: l72.r$$a
                @Override // h45.i
                public final void onKindaBusinessCallback(android.content.Intent intent2) {
                    char c17;
                    com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI faceAgreementUI = com.tencent.mm.plugin.facedetectaction.ui.FaceAgreementUI.this;
                    faceAgreementUI.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUI", "onKindaBackResult");
                    if (intent2 == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUI", "resultData == null");
                        faceAgreementUI.U6();
                        return;
                    }
                    int intExtra2 = intent2.getIntExtra(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, com.tencent.mm.plugin.facedetect.model.k0.a(90024));
                    java.lang.String stringExtra4 = intent2.getStringExtra("error_msg");
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUI", "errorMsg：%s errorCode：%s", stringExtra4, java.lang.Integer.valueOf(intExtra2));
                    if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra4)) {
                        faceAgreementUI.U6();
                        return;
                    }
                    int hashCode = stringExtra4.hashCode();
                    if (hashCode == -1367724422) {
                        if (stringExtra4.equals("cancel")) {
                            c17 = 2;
                        }
                        c17 = 65535;
                    } else if (hashCode != 3548) {
                        if (hashCode == 3135262 && stringExtra4.equals("fail")) {
                            c17 = 1;
                        }
                        c17 = 65535;
                    } else {
                        if (stringExtra4.equals("ok")) {
                            c17 = 0;
                        }
                        c17 = 65535;
                    }
                    if (c17 == 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUI", "go to face recognize");
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(917L, 65L, 1L, false);
                        android.content.Intent intent3 = new android.content.Intent(faceAgreementUI, (java.lang.Class<?>) com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI.class);
                        android.os.Bundle extras = faceAgreementUI.getIntent().getExtras();
                        if (extras != null) {
                            intent3.putExtras(extras);
                        }
                        intent3.putExtra("needContract", intent2.getIntExtra("need_show_protocal", 0) != 1);
                        faceAgreementUI.startActivityForResult(intent3, 1);
                        return;
                    }
                    if (c17 != 1) {
                        faceAgreementUI.U6();
                        return;
                    }
                    android.content.Intent intent4 = new android.content.Intent();
                    intent4.putExtra("err_msg", "fail");
                    if (intExtra2 == 90114) {
                        intent4.putExtra("err_code", 90114);
                        intent4.putExtra("click_other_verify_btn_front", "yes");
                        vz2.c.h(90114);
                    } else {
                        intent4.putExtra("err_code", 90110);
                        vz2.c.h(90110);
                    }
                    faceAgreementUI.setResult(1, intent4);
                    faceAgreementUI.finish();
                }
            });
            return;
        }
        this.f100196e = (android.widget.Button) findViewById(com.tencent.mm.R.id.dmo);
        this.f100197f = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.dml);
        this.f100198g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dmm);
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) findViewById(com.tencent.mm.R.id.dmn)).getPaint(), 0.8f);
        this.f100196e.setEnabled(true);
        this.f100196e.setOnClickListener(new l72.s(this));
        this.f100204p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dmk);
        java.lang.String stringExtra4 = getIntent().getStringExtra("otherVerifyTitleFront");
        this.f100203o = stringExtra4;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra4)) {
            this.f100204p.setVisibility(8);
        } else {
            this.f100204p.setVisibility(0);
            this.f100204p.setClickable(true);
            android.widget.TextView textView = this.f100204p;
            le0.u uVar = (le0.u) i95.n0.c(le0.u.class);
            getContext();
            ((ke0.e) uVar).getClass();
            textView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0());
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(this.f100203o);
            spannableStringBuilder.setSpan(new l72.c0(this.f100203o, getContext().getResources().getColor(com.tencent.mm.R.color.f479308vo), getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2), true, new l72.t(this)), 0, spannableStringBuilder.length(), 17);
            this.f100204p.setText(spannableStringBuilder);
            android.widget.TextView textView2 = this.f100204p;
            textView2.setOnTouchListener(new l72.y(this, spannableStringBuilder, textView2));
        }
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        getSupportActionBar().o();
        ((android.widget.ImageView) findViewById(com.tencent.mm.R.id.dmf)).setOnClickListener(new l72.u(this));
        this.f100195d = db5.e1.Q(getContext(), "", getContext().getString(com.tencent.mm.R.string.ggd), false, false, null);
        gm0.j1.d().a(1108, this);
        gm0.j1.d().g(new j72.d(getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0), getIntent().getStringExtra("package"), getIntent().getStringExtra("packageSign")));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUI", "[onDestroy] %s", java.lang.Integer.valueOf(hashCode()));
        super.onDestroy();
        if (this.f100207s) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(917L, 63L, 1L, false);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUI", "[onRestoreInstanceState] %s", java.lang.Integer.valueOf(hashCode()));
        this.f100208t = true;
        super.onRestoreInstanceState(bundle);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUI", "onResume()");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUI", "[onSaveInstanceState] %s", java.lang.Integer.valueOf(hashCode()));
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUI", "[onSaveInstanceState] set restore key");
            bundle.putBoolean("hasRestoredState", true);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUI", "onSceneEnd()");
        gm0.j1.d().q(1108, this);
        vz2.c.c().f56205g = i18;
        ((ku5.t0) ku5.t0.f312615d).B(new l72.v(this, i17, i18, m1Var, str));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(rz2.a.class);
    }
}
