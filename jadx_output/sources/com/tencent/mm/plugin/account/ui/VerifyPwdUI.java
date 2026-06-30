package com.tencent.mm.plugin.account.ui;

/* loaded from: classes5.dex */
public class VerifyPwdUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0, al5.e0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f73675o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f73676d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f73677e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f73678f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.EditText f73679g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ScrollView f73680h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.InputPanelLinearLayout f73681i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f73682m;

    /* renamed from: n, reason: collision with root package name */
    public int f73683n;

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VerifyPwdUI", "keyboard show %s, keyboardHeight %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        if (!z17) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.f73678f.getLayoutParams();
            layoutParams.bottomMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479657bu);
            layoutParams.topMargin = 0;
            this.f73678f.setLayoutParams(layoutParams);
            com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = this.f73681i;
            inputPanelLinearLayout.setPadding(inputPanelLinearLayout.getPaddingLeft(), this.f73681i.getPaddingTop(), this.f73681i.getPaddingRight(), 0);
            this.f73680h.scrollBy(0, 0);
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.f73678f.getLayoutParams();
        layoutParams2.bottomMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        layoutParams2.topMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        this.f73678f.setLayoutParams(layoutParams2);
        com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout2 = this.f73681i;
        inputPanelLinearLayout2.setPadding(inputPanelLinearLayout2.getPaddingLeft(), this.f73681i.getPaddingTop(), this.f73681i.getPaddingRight(), i17);
        int height = this.f73680h.getHeight();
        this.f73681i.requestLayout();
        this.f73681i.post(new com.tencent.mm.plugin.account.ui.zi(this, height));
    }

    public final void T6(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f73677e.setVisibility(8);
        } else {
            this.f73677e.setVisibility(0);
            this.f73677e.setText(str);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d37;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        this.f73680h = (android.widget.ScrollView) findViewById(com.tencent.mm.R.id.mcm);
        com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = (com.tencent.mm.ui.widget.InputPanelLinearLayout) findViewById(com.tencent.mm.R.id.hdf);
        this.f73681i = inputPanelLinearLayout;
        inputPanelLinearLayout.e(this);
        this.f73677e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dhj);
        this.f73676d = findViewById(com.tencent.mm.R.id.gcs);
        android.widget.EditText editText = (android.widget.EditText) findViewById(com.tencent.mm.R.id.f486484ld5);
        this.f73679g = editText;
        editText.requestFocus();
        this.f73679g.addTextChangedListener(new com.tencent.mm.plugin.account.ui.vi(this));
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.kao);
        this.f73678f = button;
        button.setOnClickListener(new com.tencent.mm.plugin.account.ui.wi(this));
        this.f73676d.setOnClickListener(new com.tencent.mm.plugin.account.ui.xi(this));
        setBackBtn(new com.tencent.mm.plugin.account.ui.yi(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gm0.j1.d().a(384, this);
        this.f73683n = getIntent().getIntExtra("key_scenen", 0);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(384, this);
        hideVKB();
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z17) {
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VerifyPwdUI", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f73682m;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (i17 == 0 && i18 == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_ticket", ((com.tencent.mm.modelsimple.l1) m1Var).H());
            setResult(-1, intent);
            db5.t7.h(this, getString(com.tencent.mm.R.string.k68));
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.account.ui.aj(this), 500L);
            return;
        }
        if (i17 != 4) {
            T6(getString(com.tencent.mm.R.string.f490391to));
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            T6(getString(com.tencent.mm.R.string.f490391to));
            return;
        }
        tm.a b17 = tm.a.b(str);
        if (b17 != null) {
            T6(b17.f420399b);
        } else {
            T6(str);
        }
    }
}
