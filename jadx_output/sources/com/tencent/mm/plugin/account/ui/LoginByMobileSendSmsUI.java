package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class LoginByMobileSendSmsUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int D = 0;
    public com.tencent.mm.sdk.platformtools.b4 A;

    /* renamed from: h, reason: collision with root package name */
    public boolean f73299h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f73300i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f73301m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f73302n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f73303o;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f73306r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f73307s;

    /* renamed from: u, reason: collision with root package name */
    public android.app.ProgressDialog f73309u;

    /* renamed from: v, reason: collision with root package name */
    public int f73310v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.Button f73311w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.Button f73312x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f73313y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f73314z;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f73295d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f73296e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f73297f = "";

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.account.ui.w6 f73298g = new com.tencent.mm.plugin.account.ui.w6();

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.applet.SecurityImage f73304p = null;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f73305q = "";

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f73308t = "";
    public boolean B = false;
    public int C = 15;

    public final com.tencent.mm.pluginsdk.ui.span.f0 T6(java.lang.String str) {
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(str);
        int indexOf = str.indexOf(32) + 1;
        f0Var.c(new android.text.style.AbsoluteSizeSpan(getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479855h4)), indexOf, str.length(), 33);
        f0Var.c(new android.text.style.ForegroundColorSpan(getResources().getColor(com.tencent.mm.R.color.f479206su)), indexOf, str.length(), 33);
        return f0Var;
    }

    public final void U6() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.A;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f73312x.setText(com.tencent.mm.R.string.hwk);
        this.f73312x.setEnabled(true);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c2b;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.f486848mm3)).setText(getString(com.tencent.mm.R.string.hwq, this.f73295d));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486845mm0);
        this.f73313y = textView;
        textView.setText(T6(getString(com.tencent.mm.R.string.hwp, this.f73296e)));
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486849mm4);
        this.f73314z = textView2;
        textView2.setText(T6(getString(com.tencent.mm.R.string.hws, this.f73297f)));
        this.f73311w = (android.widget.Button) findViewById(com.tencent.mm.R.id.mlz);
        this.f73312x = (android.widget.Button) findViewById(com.tencent.mm.R.id.kao);
        setMMTitle(com.tencent.mm.R.string.hwr);
        setBackBtn(new com.tencent.mm.plugin.account.ui.v3(this));
        this.f73298g.f74286b = this.f73295d;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 31685) {
            android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            java.util.Map map = bundleExtra != null ? (java.util.Map) bundleExtra.getSerializable("next_params") : null;
            if (map == null || (str = (java.lang.String) map.get("next_step")) == null || !str.equals("continue_with_password")) {
                return;
            }
            java.lang.String str2 = (java.lang.String) map.get("spam_ctx");
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.MMLoginVerifyPwdUI.class);
            intent2.putExtra("binded_mobile", this.f73295d);
            intent2.putExtra("extspam_ctx_string", str2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/account/ui/LoginByMobileSendSmsUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("from_mobile");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f73295d = stringExtra;
        this.f73300i = getIntent().getBooleanExtra("from_switch_account", false);
        this.f73301m = c01.b9.f37069c.a("login_weixin_username", "");
        this.f73302n = getIntent().getStringExtra("last_login_auth_target_username");
        this.f73303o = getIntent().getStringExtra("last_login_user_showname");
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_login_sms_up_verify_code");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f73296e = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("key_login_sms_up_to_mobile");
        java.lang.String str = stringExtra3 != null ? stringExtra3 : "";
        this.f73297f = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginByMobileSendSmsUI", "onCreate verifyCode=%s, toMobile=%s", this.f73296e, str);
        initView();
        this.f73313y.setText(T6(getString(com.tencent.mm.R.string.hwp, this.f73296e)));
        this.f73314z.setText(T6(getString(com.tencent.mm.R.string.hws, this.f73297f)));
        if (com.tencent.mm.sdk.platformtools.t8.N0(this.f73295d, this.f73297f, this.f73296e)) {
            this.f73311w.setEnabled(false);
            this.f73312x.setEnabled(false);
        } else {
            this.f73312x.setOnClickListener(new com.tencent.mm.plugin.account.ui.w3(this));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(wo.w0.o())) {
            this.f73311w.setVisibility(8);
        } else {
            this.f73311w.setOnClickListener(new com.tencent.mm.plugin.account.ui.x3(this));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        db5.e1.u(this, getString(com.tencent.mm.R.string.hwm), "", new com.tencent.mm.plugin.account.ui.u3(this), null);
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.d().a(145, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f6  */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r18, int r19, java.lang.String r20, com.tencent.mm.modelbase.m1 r21) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.account.ui.LoginByMobileSendSmsUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        U6();
        gm0.j1.d().q(145, this);
    }
}
