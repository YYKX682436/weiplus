package com.tencent.mm.plugin.account.bind.ui;

/* loaded from: classes5.dex */
public class BindMContactUI extends com.tencent.mm.ui.MMWizardActivity {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f72984w = 0;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f72985e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f72986f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f72987g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f72988h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f72989i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f72990m;

    /* renamed from: n, reason: collision with root package name */
    public s61.m1 f72991n;

    /* renamed from: t, reason: collision with root package name */
    public d71.d f72997t;

    /* renamed from: u, reason: collision with root package name */
    public d71.e f72998u;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f72992o = null;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f72993p = null;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f72994q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f72995r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f72996s = true;

    /* renamed from: v, reason: collision with root package name */
    public int f72999v = 0;

    public final void Z6(java.lang.String countryISOCode) {
        this.f72993p = countryISOCode;
        d71.e eVar = this.f72998u;
        if (eVar != null) {
            kotlin.jvm.internal.o.g(countryISOCode, "countryISOCode");
            eVar.f226880f = countryISOCode;
            eVar.f226882h = "";
            eVar.f226881g = false;
            android.widget.EditText editText = this.f72985e;
            if (editText != null) {
                this.f72998u.a(editText.getText());
            }
        }
    }

    public final void a7(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BindMContactUI", "sendSmsToSelf %s", str);
        if (this.f72991n == null) {
            s61.l1 l1Var = s61.l1.BINDMOBILE;
            if (this.f72999v == 3) {
                l1Var = s61.l1.CHANGEMOBILE;
            }
            this.f72991n = new s61.m1(l1Var, this, new p61.t1(this, str));
        }
        this.f72991n.d(str);
    }

    public final void b7() {
        int i17 = this.f72999v;
        if (i17 == 0 || i17 == 3) {
            db5.e1.n(this, i17 == 3 ? com.tencent.mm.R.string.aga : com.tencent.mm.R.string.ag_, i17 == 3 ? com.tencent.mm.R.string.agc : com.tencent.mm.R.string.agb, new p61.n1(this), null);
        } else {
            ((java.util.HashMap) com.tencent.mm.ui.MMWizardActivity.f196919d).clear();
            W6(1);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488201kb;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f72995r = getIntent().getBooleanExtra("KEnterFromBanner", false);
        int intExtra = getIntent().getIntExtra("bind_scene", 0);
        this.f72999v = intExtra;
        com.tencent.mars.xlog.Log.i("MicroMsg.BindMContactUI", "bindScene:%d", java.lang.Integer.valueOf(intExtra));
        this.f72996s = getIntent().getBooleanExtra("back_to_status", true);
        android.widget.EditText editText = (android.widget.EditText) findViewById(com.tencent.mm.R.id.ai6);
        this.f72985e = editText;
        d71.e eVar = new d71.e(editText, this.f72997t, this.f72993p);
        this.f72998u = eVar;
        this.f72985e.addTextChangedListener(eVar);
        this.f72986f = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.cjz);
        this.f72988h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483955ck1);
        this.f72989i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cjw);
        this.f72987g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486863mo5);
        if (this.f72999v == 3) {
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                if (str.startsWith("+")) {
                    java.lang.String c17 = com.tencent.mm.sdk.platformtools.c5.c(str);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
                        str.substring(c17.length() + 1);
                    }
                }
                this.f72987g.setText(getString(com.tencent.mm.R.string.afz));
            }
        }
        java.lang.String stringExtra = getIntent().getStringExtra("bind_hint_text");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.f72987g.setText(stringExtra);
        }
        if (com.tencent.mm.sdk.platformtools.x9.b()) {
            Z6("1");
            this.f72992o = u11.b.c(this.f72993p);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f72992o)) {
            this.f72988h.setText(this.f72992o);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f72993p)) {
            Z6(getString(com.tencent.mm.R.string.blj));
            if (this.f72993p.startsWith("+")) {
                Z6(this.f72993p.substring(1));
            }
        }
        this.f72989i.setText("+" + this.f72993p);
        java.lang.String str2 = this.f72994q;
        if (str2 == null || str2.equals("")) {
            gm0.j1.e().g(new p61.o1(this));
        } else {
            this.f72985e.setText(this.f72994q);
            this.f72985e.setSelection(this.f72994q.length());
        }
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490502ww), new p61.p1(this));
        this.f72985e.requestFocus();
        setBackBtn(new p61.q1(this));
        this.f72986f.setOnClickListener(new p61.r1(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.os.Bundle bundleExtra;
        android.os.Bundle bundleExtra2;
        android.os.Bundle bundleExtra3;
        super.onActivityResult(i17, i18, intent);
        if (i18 == 100) {
            java.lang.String stringExtra = intent.getStringExtra("country_name");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.f72992o = stringExtra;
            java.lang.String stringExtra2 = intent.getStringExtra("couttry_code");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            Z6(stringExtra2);
            if (!this.f72992o.equals("")) {
                this.f72988h.setText(this.f72992o);
            }
            if (!this.f72993p.equals("")) {
                this.f72989i.setText("+" + this.f72993p);
            }
        }
        switch (i17) {
            case 30765:
                if (intent == null || (bundleExtra = intent.getBundleExtra("result_data")) == null || !bundleExtra.getString("go_next", "").equals("birthdayComfirmOK")) {
                    return;
                }
                a7(this.f72990m);
                return;
            case 30766:
                if (intent == null || (bundleExtra2 = intent.getBundleExtra("result_data")) == null || !bundleExtra2.getString("go_next", "").equals("agree_privacy")) {
                    return;
                }
                com.tencent.mm.sdk.platformtools.u3.i(new p61.s1(this), 100L);
                return;
            case 30767:
                if (intent == null || (bundleExtra3 = intent.getBundleExtra("result_data")) == null || !bundleExtra3.getString("go_next", "").equals("agree_privacy")) {
                    return;
                }
                a7(this.f72990m);
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f490716ah1);
        java.lang.String stringExtra = getIntent().getStringExtra("country_name");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f72992o = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("couttry_code");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        Z6(stringExtra2);
        java.lang.String stringExtra3 = getIntent().getStringExtra("bindmcontact_shortmobile");
        this.f72994q = stringExtra3 != null ? stringExtra3 : "";
        d71.d dVar = new d71.d();
        this.f72997t = dVar;
        dVar.c(getContext());
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((java.util.LinkedHashMap) this.f72997t.f226877a).clear();
        s61.m1 m1Var = this.f72991n;
        if (m1Var != null) {
            m1Var.b();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        b7();
        return true;
    }
}
