package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class RegAffiliateAccountUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public boolean f73548d = true;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMClearEditText f73549e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMClearEditText f73550f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMClearEditText f73551g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f73552h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.CheckBox f73553i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f73554m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f73555n;

    /* renamed from: o, reason: collision with root package name */
    public int f73556o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f73557p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f73558q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f73559r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f73560s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f73561t;

    public static void T6(com.tencent.mm.plugin.account.ui.RegAffiliateAccountUI regAffiliateAccountUI) {
        java.lang.String str = regAffiliateAccountUI.f73559r;
        int length = str != null ? str.length() : 0;
        if (length < 1 || length > 32 || !regAffiliateAccountUI.f73553i.isChecked()) {
            regAffiliateAccountUI.f73552h.setEnabled(false);
        } else {
            regAffiliateAccountUI.f73552h.setEnabled(true);
        }
    }

    public void U6(c71.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            db5.e1.i(this, com.tencent.mm.R.string.hwv, com.tencent.mm.R.string.hwx);
            return;
        }
        if (ordinal == 1) {
            db5.e1.i(this, com.tencent.mm.R.string.hww, com.tencent.mm.R.string.hwx);
        } else if (ordinal == 2) {
            db5.e1.i(this, com.tencent.mm.R.string.k69, com.tencent.mm.R.string.hwx);
        } else {
            if (ordinal != 3) {
                return;
            }
            db5.e1.i(this, com.tencent.mm.R.string.k66, com.tencent.mm.R.string.hwx);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cdn;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        if (this.f73548d) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.kos);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI", "initStepOneView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI", "initStepOneView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f73552h = (android.widget.Button) findViewById(com.tencent.mm.R.id.kao);
            com.tencent.mm.ui.widget.MMClearEditText mMClearEditText = (com.tencent.mm.ui.widget.MMClearEditText) findViewById(com.tencent.mm.R.id.kbl);
            this.f73549e = mMClearEditText;
            ck5.f b17 = ck5.f.b(mMClearEditText);
            b17.f42561f = 1;
            b17.f42560e = 32;
            b17.f42556a = false;
            b17.d(null);
            this.f73552h.setOnClickListener(new com.tencent.mm.plugin.account.ui.je(this));
            this.f73549e.requestFocus();
            this.f73549e.addTextChangedListener(new com.tencent.mm.plugin.account.ui.ke(this));
            findViewById(com.tencent.mm.R.id.mnq).setOnClickListener(new com.tencent.mm.plugin.account.ui.le(this));
            findViewById(com.tencent.mm.R.id.lrs).setOnClickListener(new com.tencent.mm.plugin.account.ui.me(this));
            android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById(com.tencent.mm.R.id.lrt);
            this.f73553i = checkBox;
            checkBox.setOnCheckedChangeListener(new com.tencent.mm.plugin.account.ui.ne(this));
            if (this.f73556o == 0) {
                android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.o2m);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI", "initStepOneView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI", "initStepOneView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                this.f73553i.setChecked(true);
                this.f73552h.setEnabled(true);
            }
        } else {
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.kot);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI", "initStepTwoView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI", "initStepTwoView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f73550f = (com.tencent.mm.ui.widget.MMClearEditText) findViewById(com.tencent.mm.R.id.kpr);
            this.f73551g = (com.tencent.mm.ui.widget.MMClearEditText) findViewById(com.tencent.mm.R.id.c_s);
            android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.c8v);
            this.f73554m = button;
            button.setEnabled(true);
            this.f73554m.setOnClickListener(new com.tencent.mm.plugin.account.ui.oe(this));
        }
        setBackBtn(new com.tencent.mm.plugin.account.ui.ie(this));
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[8];
        objArr[0] = this.f73558q;
        objArr[1] = wo.w0.k();
        objArr[2] = 0;
        objArr[3] = 1;
        objArr[4] = java.lang.Integer.valueOf(this.f73548d ? 1005 : 1006);
        objArr[5] = 0;
        objArr[6] = null;
        objArr[7] = java.lang.Integer.valueOf(this.f73556o);
        g0Var.d(23530, objArr);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 702 && i18 == -1) {
            setResult(-1, intent);
            finish();
            return;
        }
        if (((com.tencent.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Vi(this, i17, i18, intent) != null) {
            java.lang.String str = lp0.b.j() + "temp.avatar";
            kv.l0 l0Var = (kv.l0) i95.n0.c(kv.l0.class);
            com.tencent.mm.plugin.account.ui.qe qeVar = new com.tencent.mm.plugin.account.ui.qe(this, str);
            ((com.tencent.mm.feature.avatar.k0) l0Var).getClass();
            new com.tencent.mm.modelavatar.q0(str, qeVar).a();
            this.f73555n = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, null);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f73556o = getIntent().getIntExtra("RegScene", 0);
        this.f73557p = getIntent().getStringExtra("RegTicket");
        this.f73558q = getIntent().getStringExtra("sessionID");
        this.f73559r = getIntent().getStringExtra("NickName");
        this.f73560s = getIntent().getStringExtra("AvatarFileID");
        this.f73561t = getIntent().getStringExtra("AvatarAESKey");
        this.f73548d = getIntent().getBooleanExtra("STEP_ONE", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.RegAffiliateAccountUI", "regScene:%d", java.lang.Integer.valueOf(this.f73556o));
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        finish();
        return false;
    }
}
