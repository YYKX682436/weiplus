package com.tencent.mm.plugin.account.security.ui;

/* loaded from: classes14.dex */
public class SecurityAccountIntroUI extends com.tencent.mm.ui.MMWizardActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String f73224p = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?lang=%s&t=w_unprotect&step=1&f=Android";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f73225e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f73226f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f73227g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f73228h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f73229i = false;

    /* renamed from: m, reason: collision with root package name */
    public android.app.ProgressDialog f73230m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f73231n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f73232o;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489440cj4;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.i86);
        findViewById(com.tencent.mm.R.id.kju).setOnClickListener(new h71.d0(this));
        if (!this.f73229i) {
            this.f73231n = (android.widget.Button) findViewById(com.tencent.mm.R.id.byy);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f73227g)) {
                this.f73231n.setText(this.f73227g);
            }
            this.f73231n.setVisibility(0);
            this.f73231n.setOnClickListener(new h71.e0(this));
        }
        setBackBtn(new h71.f0(this));
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.Map d17;
        super.onCreate(bundle);
        this.f73225e = getIntent().getStringExtra("auth_ticket");
        this.f73226f = getIntent().getStringExtra("binded_mobile");
        this.f73229i = getIntent().getBooleanExtra("re_open_verify", false);
        java.lang.String stringExtra = getIntent().getStringExtra("close_safe_device_style");
        com.tencent.mars.xlog.Log.i("MicroMsg.SecurityAccountIntroUI", "summerphone authTicket[%s], showStyle[%s]", com.tencent.mm.sdk.platformtools.t8.G1(this.f73225e), stringExtra);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && (d17 = com.tencent.mm.sdk.platformtools.aa.d(stringExtra, "wording", null)) != null) {
            this.f73227g = (java.lang.String) d17.get(".wording.title");
            java.lang.String str = (java.lang.String) d17.get(".wording.url");
            this.f73228h = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.SecurityAccountIntroUI", "summerphone closeBtnText[%s], jumpUrl[%s]", this.f73227g, str);
        }
        this.f73232o = n71.a.a();
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        n71.a.e(this.f73232o);
        T6();
        W6(1);
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.d().q(145, this);
        gm0.j1.d().q(132, this);
        if (this.f73229i) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",L600_100,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L600_100"));
        sb6.append(",2");
        n71.a.c(10645, false, sb6.toString());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.d().a(145, this);
        gm0.j1.d().a(132, this);
        if (this.f73229i) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",L600_100,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L600_100"));
        sb6.append(",1");
        n71.a.c(10645, true, sb6.toString());
        n71.a.d("L600_100");
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        android.app.ProgressDialog progressDialog = this.f73230m;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f73230m.dismiss();
            this.f73230m = null;
        }
        boolean z17 = true;
        if (i17 == 0 && i18 == 0) {
            java.lang.String str2 = !this.f73229i ? ((h11.d) ((h11.e) m1Var).f278071d).f278069b.f342925a.f373517o : ((r45.ei) ((r61.e1) m1Var).f392860d.f70711b.f70700a).f373517o;
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.security.ui.SecurityAccountVerifyUI.class);
            intent.putExtra("auth_ticket", str2);
            intent.putExtra("binded_mobile", this.f73226f);
            intent.putExtra("re_open_verify", this.f73229i);
            intent.putExtra("from_source", getIntent().getIntExtra("from_source", 1));
            com.tencent.mm.ui.MMWizardActivity.X6(this, intent);
            if (getIntent().getIntExtra("from_source", 1) == 3) {
                finish();
                return;
            }
            return;
        }
        if (i18 != -74) {
            if (i18 != -57) {
                if (i18 == -41) {
                    dp.a.makeText(this, com.tencent.mm.R.string.ag6, 0).show();
                } else if (i18 == -34) {
                    dp.a.makeText(this, com.tencent.mm.R.string.ag7, 0).show();
                } else if (i18 != -1) {
                    z17 = false;
                }
            }
            dp.a.makeText(this, com.tencent.mm.R.string.f490391to, 0).show();
        } else {
            db5.e1.m(this, com.tencent.mm.R.string.f490712ag3, com.tencent.mm.R.string.f490573yv, null);
        }
        if (z17) {
            return;
        }
        ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        if (com.tencent.mm.ui.pc.a(this, i17, i18, str, 4)) {
            return;
        }
        dp.a.makeText(this, getString(com.tencent.mm.R.string.f492913i81, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
    }
}
