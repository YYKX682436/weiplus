package com.tencent.mm.plugin.account.security.ui;

/* loaded from: classes14.dex */
public class SecurityAccountVerifyUI extends com.tencent.mm.ui.MMWizardActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String f73233s = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyn) + "/cgi-bin/mmsupport-bin/readtemplate?lang=%s&t=w_unprotect&step=1&f=Android";

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f73234e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f73235f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f73236g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f73237h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f73238i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f73239m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f73240n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f73241o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f73242p;

    /* renamed from: q, reason: collision with root package name */
    public android.app.ProgressDialog f73243q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f73244r = false;

    public final boolean Z6(int i17, int i18, java.lang.String str) {
        o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        ((com.tencent.mm.app.o7) wi6).getClass();
        if (com.tencent.mm.ui.pc.a(context, i17, i18, str, 4)) {
            return true;
        }
        if (i18 == -74) {
            db5.e1.m(getContext(), com.tencent.mm.R.string.f490712ag3, com.tencent.mm.R.string.f490573yv, null);
            return true;
        }
        if (i18 != -57) {
            if (i18 == -41) {
                dp.a.makeText(getContext(), com.tencent.mm.R.string.ag6, 0).show();
                return true;
            }
            if (i18 != -1) {
                switch (i18) {
                    case -34:
                        dp.a.makeText(this, com.tencent.mm.R.string.ag7, 0).show();
                        return true;
                    case -33:
                        db5.e1.m(getContext(), com.tencent.mm.R.string.ahi, com.tencent.mm.R.string.aho, null);
                        return true;
                    case org.chromium.net.NetError.ERR_BLOCKED_BY_ORB /* -32 */:
                        db5.e1.m(getContext(), com.tencent.mm.R.string.ahj, com.tencent.mm.R.string.aho, null);
                        return true;
                    default:
                        return false;
                }
            }
        }
        dp.a.makeText(getContext(), com.tencent.mm.R.string.f490391to, 0).show();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cj6;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f73239m = getIntent().getStringExtra("binded_mobile");
        this.f73240n = getIntent().getStringExtra("auth_ticket");
        this.f73244r = getIntent().getBooleanExtra("re_open_verify", false);
        this.f73234e = (android.widget.EditText) findViewById(com.tencent.mm.R.id.aid);
        this.f73235f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jn_);
        this.f73236g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486648m03);
        this.f73238i = (android.widget.Button) findViewById(com.tencent.mm.R.id.f486647m02);
        this.f73234e.addTextChangedListener(new h71.g0(this));
        android.widget.TextView textView = this.f73235f;
        java.lang.String str = this.f73239m;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.startsWith("+")) {
            str = "";
        } else if (str.length() > 5) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(str.subSequence(0, 3));
            for (int i17 = 0; i17 < str.length() - 5; i17++) {
                char charAt = str.charAt(i17 + 3);
                if (charAt < '0' || charAt > '9') {
                    stringBuffer.append(charAt);
                } else {
                    stringBuffer.append('*');
                }
            }
            stringBuffer.append(str.charAt(str.length() - 2));
            stringBuffer.append(str.charAt(str.length() - 1));
            str = stringBuffer.toString();
        }
        textView.setText(str);
        this.f73236g.setTag(60);
        this.f73242p = new com.tencent.mm.sdk.platformtools.b4(new h71.h0(this), true);
        this.f73238i.setOnClickListener(new h71.j0(this));
        if (!this.f73244r) {
            android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.byy);
            this.f73237h = button;
            button.setVisibility(0);
            this.f73237h.setOnClickListener(new h71.k0(this));
        }
        setBackBtn(new h71.l0(this));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490502ww), new h71.n0(this));
        enableOptionMenu(false);
        setMMTitle(com.tencent.mm.R.string.i7t);
        this.f73242p.c(1000L, 1000L);
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        n71.a.a();
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f73242p.d();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        T6();
        W6(1);
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        gm0.j1.d().q(145, this);
        gm0.j1.d().q(132, this);
        super.onPause();
        if (this.f73244r) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",L600_200,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L600_200"));
        sb6.append(",2");
        n71.a.c(10645, false, sb6.toString());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        gm0.j1.d().a(145, this);
        gm0.j1.d().a(132, this);
        super.onResume();
        if (this.f73244r) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",L600_200,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L600_200"));
        sb6.append(",1");
        n71.a.c(10645, true, sb6.toString());
        n71.a.d("L600_200");
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        android.app.ProgressDialog progressDialog = this.f73243q;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f73243q.dismiss();
            this.f73243q = null;
        }
        int type = m1Var.getType();
        if (type == 132) {
            if (i17 != 0 || i18 != 0) {
                if (Z6(i17, i18, str)) {
                    return;
                }
                o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
                androidx.appcompat.app.AppCompatActivity context = getContext();
                ((com.tencent.mm.app.o7) wi6).getClass();
                if (com.tencent.mm.ui.pc.a(context, i17, i18, str, 4)) {
                    return;
                }
                dp.a.makeText(this, getString(com.tencent.mm.R.string.f492917i85, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
                return;
            }
            e71.j.b(true, true);
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI.class);
            intent.addFlags(67108864);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/account/security/ui/SecurityAccountVerifyUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/account/security/ui/SecurityAccountVerifyUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            finish();
            return;
        }
        if (type != 145) {
            return;
        }
        h11.e eVar = (h11.e) m1Var;
        if (eVar.M() == 10) {
            if (i17 == 0 && i18 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SecurityAccountVerifyUI", "resend verify code successfully");
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.SecurityAccountVerifyUI", "resend verify code fail, errType %d, errCode %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (Z6(i17, i18, str)) {
                return;
            }
            dp.a.makeText(getContext(), getString(com.tencent.mm.R.string.f492913i81, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
            return;
        }
        if (eVar.M() != 11) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SecurityAccountVerifyUI", "unknow bind mobile for reg op code %d, errType %d, errCode %d", java.lang.Integer.valueOf(eVar.M()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return;
        }
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SecurityAccountVerifyUI", "verify verify-code fail, errType %d, errCode %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (Z6(i17, i18, str)) {
                return;
            }
            dp.a.makeText(getContext(), getString(com.tencent.mm.R.string.f492917i85, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
            return;
        }
        this.f73240n = ((h11.d) eVar.f278071d).f278069b.f342925a.f373517o;
        int intExtra = getIntent().getIntExtra("from_source", 1);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("from_source", intExtra);
        intent2.putExtra("binded_mobile", this.f73239m);
        if (intExtra != 1 && intExtra != 2) {
            if (intExtra == 3) {
                intent2.addFlags(67108864);
                intent2.putExtra("auth_ticket", this.f73240n);
                java.lang.String stringExtra = getIntent().getStringExtra("WizardTransactionId");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                java.util.HashMap hashMap = (java.util.HashMap) com.tencent.mm.ui.MMWizardActivity.f196919d;
                android.content.Intent intent3 = (android.content.Intent) hashMap.get(stringExtra);
                hashMap.clear();
                if (intent3 != null) {
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.s(this, intent2, intent3);
                } else {
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.s(this, intent2, null);
                }
                finish();
                return;
            }
            if (intExtra != 5 && intExtra != 6) {
                W6(1);
                return;
            }
        }
        intent2.addFlags(67108864);
        intent2.putExtra("auth_ticket", this.f73240n);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.s(this, intent2, null);
        finish();
    }
}
