package com.tencent.mm.plugin.account.bind.ui;

/* loaded from: classes5.dex */
public class BindMobileUI extends com.tencent.mm.ui.MMWizardActivity {
    public static final /* synthetic */ int B = 0;
    public boolean A;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f73031e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f73032f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f73033g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f73034h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f73035i;

    /* renamed from: m, reason: collision with root package name */
    public s61.m1 f73036m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f73037n = null;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f73038o = null;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f73039p = null;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f73040q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.Button f73041r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f73042s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f73043t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.CheckBox f73044u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.CheckBox f73045v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f73046w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f73047x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.modelsimple.BindWordingContent f73048y;

    /* renamed from: z, reason: collision with root package name */
    public int f73049z;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488196k6;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f73031e = (android.widget.EditText) findViewById(com.tencent.mm.R.id.ai6);
        this.f73032f = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.cjz);
        this.f73033g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483955ck1);
        this.f73034h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cjw);
        this.f73040q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ai_);
        this.f73041r = (android.widget.Button) findViewById(com.tencent.mm.R.id.ahu);
        this.f73042s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ai7);
        this.f73040q.setText(getString(com.tencent.mm.R.string.agt));
        this.f73043t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ahv);
        this.f73046w = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.ai9);
        this.f73045v = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.f483384ai4);
        this.f73044u = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.f483383ai3);
        this.f73047x = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f483385ai5);
        com.tencent.mm.modelsimple.BindWordingContent bindWordingContent = this.f73048y;
        if (bindWordingContent != null) {
            java.lang.String str = bindWordingContent.f71276d;
            if (str != null && str.length() > 0) {
                this.f73040q.setText(this.f73048y.f71276d);
            }
            java.lang.String str2 = this.f73048y.f71277e;
            if (str2 != null && str2.length() > 0) {
                this.f73043t.setText(this.f73048y.f71277e);
            }
            int intValue = this.f73048y.f71278f.intValue();
            if (intValue == 0) {
                this.f73047x.setImageResource(com.tencent.mm.R.drawable.bgh);
            } else if (intValue == 1) {
                this.f73047x.setImageResource(com.tencent.mm.R.drawable.bgk);
            } else if (intValue == 2) {
                this.f73047x.setImageResource(com.tencent.mm.R.drawable.bgi);
            }
        }
        int i17 = this.f73049z;
        if (i17 == 0) {
            this.f73046w.setVisibility(0);
            this.f73045v.setVisibility(0);
            this.f73043t.setVisibility(8);
        } else if (i17 == 1) {
            this.f73046w.setVisibility(8);
            this.f73045v.setVisibility(8);
            this.f73043t.setVisibility(0);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f73037n) && com.tencent.mm.sdk.platformtools.t8.K0(this.f73038o)) {
            java.lang.String simCountryIso = ((android.telephony.TelephonyManager) getSystemService("phone")).getSimCountryIso();
            if (com.tencent.mm.sdk.platformtools.t8.K0(simCountryIso)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BindMContactUI", "getDefaultCountryInfo error");
            } else {
                u11.a a17 = u11.b.a(simCountryIso);
                if (a17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BindMContactUI", "getDefaultCountryInfo error");
                } else {
                    this.f73037n = a17.f423729c;
                    this.f73038o = a17.f423728b;
                }
            }
        }
        java.lang.String str3 = this.f73037n;
        if (str3 != null && !str3.equals("")) {
            this.f73033g.setText(this.f73037n);
        }
        java.lang.String str4 = this.f73038o;
        if (str4 != null && !str4.equals("")) {
            this.f73034h.setText("+" + this.f73038o);
        }
        java.lang.String str5 = this.f73039p;
        if (str5 != null && !str5.equals("")) {
            this.f73031e.setText(this.f73039p);
        }
        this.f73041r.setOnClickListener(new p61.l2(this));
        this.f73042s.setOnClickListener(new p61.m2(this));
        if (this.A) {
            setMMTitle(com.tencent.mm.R.string.afu);
            this.f73047x.setVisibility(8);
            this.f73040q.setText(com.tencent.mm.R.string.agd);
            this.f73046w.setVisibility(8);
            this.f73045v.setVisibility(8);
            this.f73045v.setChecked(false);
            this.f73044u.setVisibility(0);
            this.f73044u.setChecked(false);
            this.f73043t.setVisibility(8);
            this.f73043t.setText(getString(com.tencent.mm.R.string.afw));
            this.f73042s.setVisibility(8);
            this.f73041r.setText(com.tencent.mm.R.string.afu);
            setBackBtn(new p61.n2(this));
        }
        this.f73032f.setOnClickListener(new p61.o2(this));
        this.f73032f.setOnClickListener(new p61.p2(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 != 100) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("country_name");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f73037n = stringExtra;
        java.lang.String stringExtra2 = intent.getStringExtra("couttry_code");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f73038o = stringExtra2;
        if (!this.f73037n.equals("")) {
            this.f73033g.setText(this.f73037n);
        }
        if (this.f73038o.equals("")) {
            return;
        }
        this.f73034h.setText("+" + this.f73038o);
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.agx);
        java.lang.String stringExtra = getIntent().getStringExtra("country_name");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f73037n = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("couttry_code");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f73038o = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("bindmcontact_shortmobile");
        this.f73039p = stringExtra3 != null ? stringExtra3 : "";
        this.f73048y = (com.tencent.mm.modelsimple.BindWordingContent) getIntent().getParcelableExtra("kstyle_bind_wording");
        this.f73049z = getIntent().getIntExtra("kstyle_bind_recommend_show", 0);
        this.A = getIntent().getBooleanExtra("is_bind_for_chatroom_upgrade", false);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        s61.m1 m1Var = this.f73036m;
        if (m1Var != null) {
            m1Var.b();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        W6(1);
        return true;
    }
}
