package com.tencent.mm.plugin.collect.ui;

/* loaded from: classes9.dex */
public class CollectCreateQRCodeNewUI extends com.tencent.mm.wallet_core.ui.WalletBaseUI {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f96377d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f96378e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f96379f;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f96381h;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f96380g = "";

    /* renamed from: i, reason: collision with root package name */
    public int f96382i = 0;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f96383m = new zw1.a0(this);

    public static void U6(com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI collectCreateQRCodeNewUI, java.lang.String str) {
        collectCreateQRCodeNewUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectCreateQRCodeNewUI", "showErrorDialog,errMsg:%s", str);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(collectCreateQRCodeNewUI.getContext());
        u1Var.u("");
        u1Var.g(str);
        u1Var.a(true);
        u1Var.m(com.tencent.mm.R.string.l_e);
        u1Var.l(new zw1.z(collectCreateQRCodeNewUI));
        u1Var.q(false);
    }

    public static void V6(com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI collectCreateQRCodeNewUI) {
        collectCreateQRCodeNewUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectCreateQRCodeNewUI", "onClick() edit desc");
        collectCreateQRCodeNewUI.hideTenpayKB();
        collectCreateQRCodeNewUI.hideWcKb();
        gt4.l.b(collectCreateQRCodeNewUI, collectCreateQRCodeNewUI.getString(com.tencent.mm.R.string.b9y), collectCreateQRCodeNewUI.f96380g, "", true, 32, new zw1.v(collectCreateQRCodeNewUI), new zw1.x(collectCreateQRCodeNewUI));
    }

    public final void W6() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f96380g)) {
            java.lang.String string = getString(com.tencent.mm.R.string.b9y);
            com.tencent.mm.wallet_core.ui.r1.w0(this.f96378e, string, 0, string.length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new zw1.t(this), true), getContext());
            this.f96378e.setVisibility(0);
            this.f96379f.setVisibility(8);
            return;
        }
        java.lang.String string2 = getString(com.tencent.mm.R.string.b_0);
        java.lang.String string3 = getString(com.tencent.mm.R.string.b9z, this.f96380g, string2);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        android.text.SpannableString i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(this, string3);
        com.tencent.mm.wallet_core.ui.r1.w0(this.f96379f, i17.toString(), i17.length() - string2.length(), i17.length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new zw1.j0(this), true), getContext());
        this.f96378e.setVisibility(8);
        this.f96379f.setVisibility(0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488637z7;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f96377d = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f485972jq4);
        android.widget.EditText editText = (android.widget.EditText) findViewById(com.tencent.mm.R.id.pbn);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.f487682pf5)).setTextSize(1, 56.0f);
        editText.setTextSize(1, 56.0f);
        qp5.p.g(this.f96377d);
        com.tencent.mm.wallet_core.ui.r1.v0(this.f96377d.getContentEt());
        java.lang.String stringExtra = getIntent().getStringExtra("key_currency_unit");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            this.f96377d.getTitleTv().setText(com.tencent.mm.wallet_core.model.c2.b());
        } else {
            this.f96377d.getTitleTv().setText(stringExtra);
        }
        this.f96377d.b(new zw1.d0(this));
        this.f96377d.r(7, 2);
        this.f96379f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483807c34);
        this.f96378e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f483805c32);
        W6();
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = (com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) findViewById(com.tencent.mm.R.id.pok);
        this.f96381h = wcPayKeyboard;
        wcPayKeyboard.h();
        this.f96381h.setActionText(getString(com.tencent.mm.R.string.b9t));
        this.f96377d.getContentEt().setOnEditorActionListener(new zw1.f0(this, new zw1.e0(this)));
        ((android.widget.RelativeLayout.LayoutParams) this.f96381h.getLayoutParams()).addRule(12);
        this.f96381h.e(false);
        setWPKeyboard(this.f96377d.getContentEt(), true, false);
        this.f96377d.setmContentAbnormalMoneyCheck(true);
        this.f96377d.post(new zw1.g0(this));
        setMMTitle(com.tencent.mm.R.string.b9w);
        setBackBtn(new zw1.h0(this));
        ((android.widget.ScrollView) findViewById(com.tencent.mm.R.id.root_view)).setOnTouchListener(new zw1.i0(this));
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(1335);
        initView();
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1335);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.widget.dialog.l
    public void onDialogDismiss(android.app.Dialog dialog) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectCreateQRCodeNewUI", "onDialogDismiss()");
        com.tencent.mm.sdk.platformtools.u3.i(this.f96383m, 300L);
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectCreateQRCodeNewUI", "onPause()");
        if (this.f96381h.p()) {
            return;
        }
        this.f96382i = 3;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectCreateQRCodeNewUI", "onResume()");
        if (this.f96382i == 3 && isHandleAutoShowNormalStWcKb()) {
            showNormalStWcKb();
        }
        this.f96382i = 2;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CollectCreateQRCodeNewUI", "errType: %s ，errCode：%s, errMsg：%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var instanceof ww1.z1) {
            if (i17 == 0 && i18 == 0) {
                ww1.z1 z1Var = (ww1.z1) m1Var;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("ftf_pay_url", z1Var.f450371d);
                intent.putExtra("key_error_level", z1Var.f450375h);
                intent.putExtra("ftf_fixed_fee", z1Var.f450372e);
                intent.putExtra("ftf_fixed_fee_type", z1Var.f450373f);
                intent.putExtra("ftf_fixed_desc", z1Var.f450374g);
                setResult(-1, intent);
                hideVKB();
                finish();
                return true;
            }
        } else if (m1Var instanceof ww1.t1) {
            ww1.t1 t1Var = (ww1.t1) m1Var;
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CollectCreateQRCodeNewUI", "net error: %s", t1Var);
            } else {
                if (t1Var.f450285f == 0) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("ftf_pay_url", t1Var.f450287h);
                    intent2.putExtra("ftf_fixed_fee", t1Var.f450299w / 100.0d);
                    intent2.putExtra("ftf_fixed_desc", t1Var.f450300x);
                    intent2.putExtra("key_currency_unit", t1Var.f450295s);
                    setResult(-1, intent2);
                    hideVKB();
                    finish();
                    return true;
                }
                int i19 = t1Var.f450288i;
                if (i19 == 0) {
                    db5.e1.F(getContext(), t1Var.f450286g, t1Var.f450289m, false);
                    return true;
                }
                if (i19 == 1) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(t1Var.f450290n) && !com.tencent.mm.sdk.platformtools.t8.K0(t1Var.f450291o)) {
                        db5.e1.A(getContext(), t1Var.f450286g, t1Var.f450289m, t1Var.f450291o, t1Var.f450290n, new zw1.b0(this, t1Var), new zw1.c0(this));
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(sw1.a.class);
    }
}
