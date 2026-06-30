package com.tencent.mm.plugin.account.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/account/ui/MMLoginVerifyPwdUI;", "Lcom/tencent/mm/plugin/account/ui/MMBaseAccountActivity;", "<init>", "()V", "plugin-account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MMLoginVerifyPwdUI extends com.tencent.mm.plugin.account.ui.MMBaseAccountActivity {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f73470t = 0;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f73471m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMClearEditText f73472n;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f73475q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f73476r;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f73473o = jz5.h.b(com.tencent.mm.plugin.account.ui.y9.f74340d);

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f73474p = jz5.h.b(com.tencent.mm.plugin.account.ui.w9.f74295d);

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.account.ui.x9 f73477s = new com.tencent.mm.plugin.account.ui.x9(this);

    public static final void Z6(com.tencent.mm.plugin.account.ui.MMLoginVerifyPwdUI mMLoginVerifyPwdUI) {
        if (mMLoginVerifyPwdUI.isFinishing() || mMLoginVerifyPwdUI.getWindow() == null) {
            return;
        }
        mMLoginVerifyPwdUI.b7().f74286b = mMLoginVerifyPwdUI.f73475q;
        com.tencent.mm.plugin.account.ui.w6 b76 = mMLoginVerifyPwdUI.b7();
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = mMLoginVerifyPwdUI.f73472n;
        if (mMClearEditText == null) {
            kotlin.jvm.internal.o.o("mPwdET");
            throw null;
        }
        b76.f74287c = mMClearEditText.getText().toString();
        java.lang.String str = mMLoginVerifyPwdUI.b7().f74287c;
        if (!(str == null || str.length() == 0)) {
            mMLoginVerifyPwdUI.hideVKB();
            ((x51.c1) ((jz5.n) mMLoginVerifyPwdUI.f73473o).getValue()).a(mMLoginVerifyPwdUI, new com.tencent.mm.plugin.account.ui.r9(mMLoginVerifyPwdUI));
        } else {
            java.lang.String str2 = mMLoginVerifyPwdUI.b7().f74286b;
            java.lang.String str3 = mMLoginVerifyPwdUI.b7().f74287c;
            db5.t7.makeText(mMLoginVerifyPwdUI, com.tencent.mm.R.string.gif, 0).show();
        }
    }

    @Override // com.tencent.mm.plugin.account.ui.MMBaseAccountActivity
    public android.view.View V6() {
        android.widget.Button button = new android.widget.Button(new android.view.ContextThemeWrapper(this, com.tencent.mm.R.style.f494352kr), null, 0);
        button.setText(com.tencent.mm.R.string.gi7);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, i65.a.f(this, com.tencent.mm.R.dimen.f479734dr));
        button.setLayoutParams(layoutParams);
        button.setOnClickListener(new com.tencent.mm.plugin.account.ui.s9(this));
        this.f73471m = button;
        button.setEnabled(false);
        android.widget.Button button2 = this.f73471m;
        if (button2 != null) {
            return button2;
        }
        kotlin.jvm.internal.o.o("nextBtn");
        throw null;
    }

    @Override // com.tencent.mm.plugin.account.ui.MMBaseAccountActivity
    public int W6() {
        return com.tencent.mm.R.layout.f489277ek2;
    }

    @Override // com.tencent.mm.plugin.account.ui.MMBaseAccountActivity
    public void X6() {
        super.X6();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ip_);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.EditText contentEditText = ((com.tencent.mm.ui.base.MMFormInputView) findViewById).getContentEditText();
        kotlin.jvm.internal.o.e(contentEditText, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMClearEditText");
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = (com.tencent.mm.ui.base.MMClearEditText) contentEditText;
        this.f73472n = mMClearEditText;
        ck5.f b17 = ck5.f.b(mMClearEditText);
        b17.f42561f = 0;
        b17.f42560e = 16;
        b17.d(null);
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText2 = this.f73472n;
        if (mMClearEditText2 == null) {
            kotlin.jvm.internal.o.o("mPwdET");
            throw null;
        }
        mMClearEditText2.addTextChangedListener(this.f73477s);
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText3 = this.f73472n;
        if (mMClearEditText3 == null) {
            kotlin.jvm.internal.o.o("mPwdET");
            throw null;
        }
        mMClearEditText3.setOnEditorActionListener(new com.tencent.mm.plugin.account.ui.t9(this));
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText4 = this.f73472n;
        if (mMClearEditText4 == null) {
            kotlin.jvm.internal.o.o("mPwdET");
            throw null;
        }
        mMClearEditText4.setOnKeyListener(new com.tencent.mm.plugin.account.ui.u9(this));
        a7();
        setBackBtn(new com.tencent.mm.plugin.account.ui.v9(this));
    }

    public final void a7() {
        android.widget.Button button = this.f73471m;
        if (button == null) {
            kotlin.jvm.internal.o.o("nextBtn");
            throw null;
        }
        if (this.f73472n != null) {
            button.setEnabled(!com.tencent.mm.sdk.platformtools.t8.K0(r2.getText().toString()));
        } else {
            kotlin.jvm.internal.o.o("mPwdET");
            throw null;
        }
    }

    public final com.tencent.mm.plugin.account.ui.w6 b7() {
        return (com.tencent.mm.plugin.account.ui.w6) ((jz5.n) this.f73474p).getValue();
    }

    @Override // com.tencent.mm.plugin.account.ui.MMBaseAccountActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f73475q = getIntent().getStringExtra("binded_mobile");
        this.f73476r = getIntent().getStringExtra("extspam_ctx_string");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (i17 != 4) {
            return super.onKeyDown(i17, event);
        }
        hideVKB();
        finish();
        return true;
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(m71.g.class);
    }
}
