package com.tencent.mm.plugin.account.bind.ui;

/* loaded from: classes5.dex */
public class BindMContactVerifyUI extends com.tencent.mm.ui.MMWizardActivity {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f73000r = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f73001e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f73002f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f73003g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f73004h;

    /* renamed from: n, reason: collision with root package name */
    public android.content.SharedPreferences f73007n;

    /* renamed from: p, reason: collision with root package name */
    public s61.m1 f73009p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f73010q;

    /* renamed from: i, reason: collision with root package name */
    public boolean f73005i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f73006m = true;

    /* renamed from: o, reason: collision with root package name */
    public int f73008o = 0;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488204ke;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f73002f = (java.lang.String) gm0.j1.u().c().l(4097, null);
        this.f73001e = (android.widget.EditText) findViewById(com.tencent.mm.R.id.aid);
        this.f73005i = getIntent().getBooleanExtra("KEnterFromBanner", false);
        this.f73008o = getIntent().getIntExtra("bind_scene", 0);
        this.f73004h = getIntent().getStringExtra("policy_ticket");
        this.f73006m = getIntent().getBooleanExtra("back_to_status", true);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.aia);
        java.lang.String str = this.f73002f;
        if (str == null || str.equals("")) {
            this.f73002f = (java.lang.String) gm0.j1.u().c().l(6, null);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f73002f)) {
            this.f73002f = getIntent().getStringExtra("bindmcontact_mobile");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BindMContactVerifyUI", "mobile %s", this.f73002f);
        this.f73001e.setFilters(new android.text.InputFilter[]{new p61.u1(this)});
        this.f73003g = (android.widget.Button) findViewById(com.tencent.mm.R.id.aif);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.aib)).setVisibility(8);
        button.setOnClickListener(new p61.v1(this));
        setBackBtn(new p61.w1(this));
        this.f73003g.setVisibility(u11.c.b(this.f73002f) ? 0 : 8);
        this.f73003g.setOnClickListener(new p61.x1(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.Map map;
        super.onActivityResult(i17, i18, intent);
        if (i17 != 100 || intent == null || (map = (java.util.Map) intent.getBundleExtra("result_data").getSerializable("next_params")) == null) {
            return;
        }
        java.lang.String str = (java.lang.String) map.get("next_step");
        if ("end_bind_mobile".equalsIgnoreCase(str)) {
            com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI.g7();
            android.content.Intent intent2 = new android.content.Intent();
            intent2.addFlags(67108864);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.u(intent2, this);
            return;
        }
        if ("bind_mobile_take_over".equalsIgnoreCase(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BindMContactVerifyUI", "bind_mobile_take_over");
            this.f73009p.e(this.f73002f, this.f73001e.getText().toString().trim(), 25, this.f73010q);
        }
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f490719ah4);
        this.f73007n = getSharedPreferences(getPackageName() + "_preferences", 0);
        c01.z1.p();
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        s61.m1 m1Var = this.f73009p;
        if (m1Var != null) {
            m1Var.b();
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        W6(1);
        return true;
    }
}
