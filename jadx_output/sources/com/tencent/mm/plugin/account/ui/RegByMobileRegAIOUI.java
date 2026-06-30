package com.tencent.mm.plugin.account.ui;

@db5.a(129)
/* loaded from: classes14.dex */
public class RegByMobileRegAIOUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int Y = 0;
    public android.widget.ImageView A;
    public android.widget.ImageView B;
    public com.tencent.mm.ui.base.MMFormInputView C;
    public android.graphics.Bitmap E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public int f73562J;
    public java.lang.String K;
    public java.lang.String L;
    public d71.d R;
    public d71.e S;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f73564e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f73565f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.EditText f73566g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f73567h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMFormInputView f73568i;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f73574r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f73575s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f73576t;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.base.WeAgreementCheckBox f73579w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.Button f73580x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMFormInputView f73581y;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f73563d = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f73569m = null;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f73570n = null;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f73571o = null;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f73572p = null;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f73573q = true;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f73577u = null;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f73578v = null;

    /* renamed from: z, reason: collision with root package name */
    public boolean f73582z = false;
    public int D = 0;
    public int M = 0;
    public boolean N = true;
    public final com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct P = new com.tencent.mm.autogen.mmdata.rpt.ThirdAppRegisterStruct();
    public java.lang.String Q = "";
    public final com.tencent.mm.sdk.event.IListener T = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LoginDisasterEvent>(this, com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.1
        {
            this.__eventId = -1399051904;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.LoginDisasterEvent loginDisasterEvent) {
            am.gj gjVar;
            com.tencent.mm.autogen.events.LoginDisasterEvent loginDisasterEvent2 = loginDisasterEvent;
            if (loginDisasterEvent2 == null || (gjVar = loginDisasterEvent2.f54483g) == null) {
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RegByMobileRegAIOUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", gjVar.f6768a, gjVar.f6769b);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_disaster_content", gjVar.f6768a);
            intent.putExtra("key_disaster_url", gjVar.f6769b);
            intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.account.ui.DisasterUI.class).addFlags(268435456);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };
    public java.lang.String U = "";
    public final x51.c1 V = new x51.c1();
    public boolean W = false;
    public int X = 60;

    public final void U6(java.lang.String str) {
        if (c71.b.a(this, this.f73581y.getText().toString())) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f73574r;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            this.V.a(this, new com.tencent.mm.plugin.account.ui.af(this, str));
        }
    }

    public final boolean V6() {
        boolean z17;
        boolean z18 = !com.tencent.mm.sdk.platformtools.t8.K0(this.f73571o);
        android.text.Editable[] editableArr = {this.f73566g.getText(), this.f73581y.getText(), this.C.getText()};
        for (int i17 = 0; i17 < 3; i17++) {
            android.text.Editable editable = editableArr[i17];
            if (editable == null || editable.toString().length() == 0) {
                z17 = false;
                break;
            }
        }
        z17 = true;
        boolean z19 = z18 & (z17 && this.f73573q);
        if (z19) {
            this.f73580x.setEnabled(true);
        } else {
            this.f73580x.setEnabled(false);
        }
        return z19;
    }

    public final void W6() {
        synchronized (this) {
            if (!this.W) {
                boolean z17 = true;
                this.W = true;
                finish();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("bindmcontact_mobile", this.f73577u + " " + X6());
                intent.putExtra("bindmcontact_shortmobile", this.f73578v);
                intent.putExtra("country_name", this.f73570n);
                intent.putExtra("couttry_code", this.f73571o);
                intent.putExtra("mobileverify_countdownsec", this.X);
                intent.putExtra("kintent_nickname", this.C.getText().toString());
                intent.putExtra("kintent_password", this.f73581y.getText().toString());
                intent.putExtra("kintent_hasavatar", this.f73582z);
                intent.putExtra("key_reg_style", 1);
                intent.putExtra("regsession_id", this.F);
                intent.putExtra("reg_3d_app_ticket", this.I);
                intent.putExtra("reg_3d_app_type", this.f73562J);
                intent.putExtra("mobile_verify_purpose", 2);
                if (this.M != 3) {
                    z17 = false;
                }
                intent.putExtra("mobileverify_useDialCode", z17);
                startActivity(com.tencent.mm.plugin.account.ui.MobileVerifyUI.class, intent);
            }
        }
    }

    public final java.lang.String X6() {
        java.lang.String phoneNumber = this.f73566g.getText().toString().trim().replace("+86", "");
        kotlin.jvm.internal.o.g(phoneNumber, "phoneNumber");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\D");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(phoneNumber).replaceAll("");
        kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final void Y6() {
        int i17;
        if (this.M == 3) {
            W6();
            return;
        }
        this.f73574r = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f492797hw3), true, true, new com.tencent.mm.plugin.account.ui.Cif(this));
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.H)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RegByMobileRegAIOUI", "isMobile:%s, isMobileOpen:%s, SIM iso:%s", java.lang.Boolean.valueOf(com.tencent.mars.comm.NetStatusUtil.isMobile(this)), java.lang.Boolean.valueOf(com.tencent.mars.comm.NetStatusUtil.isMobileNetworkOpen(this)), wo.w0.o());
            if (com.tencent.mars.comm.NetStatusUtil.isMobile(this) || (com.tencent.mars.comm.NetStatusUtil.isMobileNetworkOpen(this) && !com.tencent.mm.sdk.platformtools.t8.K0(wo.w0.o()))) {
                i17 = 2;
                int i18 = i17;
                com.tencent.mars.xlog.Log.i("MicroMsg.RegByMobileRegAIOUI", "select mobile check type %d", java.lang.Integer.valueOf(i18));
                h11.e eVar = new h11.e(this.f73577u + this.f73578v, 14, "", 0, "", i18);
                eVar.S(this.F);
                gm0.j1.d().g(eVar);
            }
        }
        i17 = 1;
        int i182 = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.RegByMobileRegAIOUI", "select mobile check type %d", java.lang.Integer.valueOf(i182));
        h11.e eVar2 = new h11.e(this.f73577u + this.f73578v, 14, "", 0, "", i182);
        eVar2.S(this.F);
        gm0.j1.d().g(eVar2);
    }

    public final void Z6() {
        n71.a.e(null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",RE200_100,");
        gm0.j1.b();
        sb6.append(gm0.m.f("RE200_100"));
        sb6.append(",2");
        n71.a.c(10645, false, sb6.toString());
        finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
    }

    public final void a7(java.lang.String countryISOCode) {
        this.f73571o = countryISOCode;
        d71.e eVar = this.S;
        if (eVar != null) {
            kotlin.jvm.internal.o.g(countryISOCode, "countryISOCode");
            eVar.f226880f = countryISOCode;
            eVar.f226882h = "";
            eVar.f226881g = false;
            android.widget.EditText editText = this.f73566g;
            if (editText != null) {
                this.S.a(editText.getText());
            }
        }
    }

    public final void b7() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f73570n) || com.tencent.mm.sdk.platformtools.t8.K0(this.f73571o)) {
            this.f73565f.setText(getString(com.tencent.mm.R.string.gwa));
        } else {
            this.f73565f.setText(com.tencent.mm.sdk.platformtools.c5.b(this.f73570n, this.f73571o));
        }
    }

    public final void c7() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.H)) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f73574r;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f73574r = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, null);
        gm0.j1.d().g(new v61.m0(1, 1, this.H));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cdr;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        d71.d dVar = new d71.d();
        this.R = dVar;
        dVar.c(getContext());
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.jlt);
        if (findViewById != null) {
            com.tencent.mm.ui.a4.f(findViewById);
        }
        this.f73564e = findViewById(com.tencent.mm.R.id.cjz);
        this.f73565f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483955ck1);
        this.f73567h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lru);
        com.tencent.mm.ui.base.MMFormInputView mMFormInputView = (com.tencent.mm.ui.base.MMFormInputView) findViewById(com.tencent.mm.R.id.f486590ls1);
        this.f73568i = mMFormInputView;
        mMFormInputView.setInputType(3);
        android.widget.EditText contentEditText = this.f73568i.getContentEditText();
        this.f73566g = contentEditText;
        d71.e eVar = new d71.e(contentEditText, this.R, this.f73571o);
        this.S = eVar;
        this.f73566g.addTextChangedListener(eVar);
        this.f73579w = (com.tencent.mm.ui.base.WeAgreementCheckBox) findViewById(com.tencent.mm.R.id.vd8);
        this.f73580x = (android.widget.Button) findViewById(com.tencent.mm.R.id.lrn);
        this.A = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.mnp);
        this.B = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.mnr);
        com.tencent.mm.ui.base.MMFormInputView mMFormInputView2 = (com.tencent.mm.ui.base.MMFormInputView) findViewById(com.tencent.mm.R.id.lrz);
        this.f73581y = mMFormInputView2;
        ck5.f b17 = ck5.f.b(mMFormInputView2.getContentEditText());
        b17.f42561f = 0;
        b17.f42560e = 16;
        b17.d(null);
        this.C = (com.tencent.mm.ui.base.MMFormInputView) findViewById(com.tencent.mm.R.id.lrp);
        this.f73579w.setAgreementCheckBoxListener(new com.tencent.mm.plugin.account.ui.jf(this));
        boolean[] zArr = {true};
        this.f73566g.addTextChangedListener(new com.tencent.mm.plugin.account.ui.kf(this, zArr));
        this.f73566g.setOnFocusChangeListener(new com.tencent.mm.plugin.account.ui.lf(this, zArr));
        this.f73581y.a(new com.tencent.mm.plugin.account.ui.mf(this));
        this.f73581y.setOnFocusChangeListener(new com.tencent.mm.plugin.account.ui.nf(this));
        this.C.a(new com.tencent.mm.plugin.account.ui.of(this));
        this.C.setOnFocusChangeListener(new com.tencent.mm.plugin.account.ui.pf(this));
        boolean[] zArr2 = {false};
        this.f73580x.setOnTouchListener(new com.tencent.mm.plugin.account.ui.qf(this, zArr2));
        this.f73580x.setOnClickListener(new com.tencent.mm.plugin.account.ui.ue(this, zArr2));
        this.f73580x.setEnabled(false);
        if (com.tencent.mm.sdk.platformtools.x9.b()) {
            a7("1");
            this.f73570n = u11.b.c(this.f73571o);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f73571o)) {
            this.f73570n = getString(com.tencent.mm.R.string.blk);
            a7(com.tencent.mm.sdk.platformtools.c5.g(getString(com.tencent.mm.R.string.blj)));
        } else {
            this.f73570n = u11.b.c(this.f73571o);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.G)) {
            this.f73567h.setText(this.G);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f73570n) || com.tencent.mm.sdk.platformtools.t8.K0(this.f73571o)) {
            this.f73572p = ((android.telephony.TelephonyManager) getSystemService("phone")).getSimCountryIso();
            com.tencent.mars.xlog.Log.i("MicroMsg.RegByMobileRegAIOUI", "tm.getSimCountryIso()" + this.f73572p);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f73572p)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RegByMobileRegAIOUI", "getDefaultCountryInfo error");
            } else {
                u11.a a17 = u11.b.a(this.f73572p);
                if (a17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.RegByMobileRegAIOUI", "getDefaultCountryInfo error");
                } else {
                    this.f73570n = a17.f423729c;
                    a7(a17.f423728b);
                }
            }
        }
        b7();
        java.lang.String str = this.f73569m;
        java.lang.String str2 = "";
        if (str != null && !str.equals("")) {
            this.f73566g.setText(this.f73569m);
        }
        this.f73564e.setOnClickListener(new com.tencent.mm.plugin.account.ui.ve(this));
        setBackBtn(new com.tencent.mm.plugin.account.ui.we(this), com.tencent.mm.R.raw.actionbar_icon_close_black);
        this.A.setOnClickListener(new com.tencent.mm.plugin.account.ui.xe(this));
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.H)) {
            gm0.j1.e().g(new com.tencent.mm.plugin.account.ui.ye(this));
        } else {
            this.C.setText(this.K);
            gm0.j1.e().g(new com.tencent.mm.plugin.account.ui.ze(this));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.Q)) {
            android.view.View view = this.f73564e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f73566g.setEnabled(false);
            this.f73566g.setText("+86 " + this.Q);
            this.f73566g.setTextColor(getColor(com.tencent.mm.R.color.f478873jj));
        }
        if (o45.wf.f343033k) {
            str2 = getString(com.tencent.mm.R.string.f490495wp) + j65.v.b(this);
        } else {
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        setMMTitle(str2);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        hideActionbarLine();
        if (fp.h.c(23)) {
            getWindow().setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
            updataStatusBarIcon(com.tencent.mm.ui.bk.C());
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 30846) {
            if (i18 == -1 && V6()) {
                Y6();
                n71.a.e("RE200_250");
                return;
            }
            return;
        }
        if (i17 == 30847) {
            android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (bundleExtra == null || !bundleExtra.getString("go_next", "").equals("agree_privacy")) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(712L, 1L, 1L, false);
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(712L, 2L, 1L, false);
            this.N = false;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.H)) {
                c7();
                return;
            }
            U6(this.f73577u + this.f73578v);
            return;
        }
        if (i18 != 100) {
            android.graphics.Bitmap Vi = ((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Vi(this, i17, i18, intent);
            this.E = Vi;
            if (Vi != null) {
                this.A.setImageBitmap(Vi);
                this.f73582z = true;
                this.B.setVisibility(8);
                return;
            }
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("country_name");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f73570n = stringExtra;
        java.lang.String stringExtra2 = intent.getStringExtra("couttry_code");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        a7(stringExtra2);
        java.lang.String stringExtra3 = intent.getStringExtra("iso_code");
        this.f73572p = stringExtra3 != null ? stringExtra3 : "";
        if (!u11.c.e(this.f73571o)) {
            b7();
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.H) && !com.tencent.mm.sdk.platformtools.t8.K0(this.K) && !com.tencent.mm.sdk.platformtools.t8.K0(this.L)) {
            b7();
            return;
        }
        android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MobileInputUI.class);
        intent2.putExtra("mobile_input_purpose", 2);
        intent2.putExtra("couttry_code", this.f73571o);
        intent2.putExtra("country_name", this.f73570n);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        super.setRequestedOrientation(1);
        java.lang.String stringExtra = getIntent().getStringExtra("country_name");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f73570n = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("couttry_code");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        a7(com.tencent.mm.sdk.platformtools.c5.g(stringExtra2));
        java.lang.String stringExtra3 = getIntent().getStringExtra("iso_code");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f73572p = stringExtra3;
        java.lang.String stringExtra4 = getIntent().getStringExtra("bindmcontact_shortmobile");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f73569m = stringExtra4;
        this.G = getIntent().getStringExtra("register_title");
        this.K = getIntent().getStringExtra("register_nick_name");
        this.L = getIntent().getStringExtra("register_avatar");
        this.H = getIntent().getStringExtra("third_app_token");
        this.f73562J = getIntent().getIntExtra("reg_3d_app_type", 0);
        java.lang.String stringExtra5 = getIntent().getStringExtra("KForceMobileNum");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        this.Q = stringExtra5;
        java.lang.String stringExtra6 = getIntent().getStringExtra("KForceMobileMsgId");
        if (stringExtra6 == null) {
            stringExtra6 = "";
        }
        this.f73563d = stringExtra6;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.Q)) {
            this.f73563d = "";
        } else {
            this.f73577u = "+86";
            a7("86");
            this.f73578v = this.Q;
        }
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        fo3.s.INSTANCE.E7("ie_reg");
        this.P.k();
        ((java.util.LinkedHashMap) this.R.f226877a).clear();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        Z6();
        return true;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f73574r;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.T.dead();
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        gm0.j1.d().q(145, this);
        gm0.j1.d().q(132, this);
        gm0.j1.d().q(com.tencent.mm.plugin.appbrand.jsapi.qc.CTRL_INDEX, this);
        gm0.j1.d().q(252, this);
        gm0.j1.d().q(701, this);
        n71.a.d("RE200_100");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        this.T.alive();
        super.onResume();
        gm0.j1.d().a(701, this);
        gm0.j1.d().a(252, this);
        gm0.j1.d().a(145, this);
        gm0.j1.d().a(132, this);
        gm0.j1.d().a(com.tencent.mm.plugin.appbrand.jsapi.qc.CTRL_INDEX, this);
        gm0.j1.d().a(252, this);
        gm0.j1.d().a(701, this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",RE200_100,");
        gm0.j1.b();
        sb6.append(gm0.m.f("RE200_100"));
        sb6.append(",1");
        n71.a.c(10645, true, sb6.toString());
        this.D = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x03c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03c6  */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r19, int r20, java.lang.String r21, com.tencent.mm.modelbase.m1 r22) {
        /*
            Method dump skipped, instructions count: 993
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(vm3.d.class);
        hashSet.add(j71.b.class);
    }
}
