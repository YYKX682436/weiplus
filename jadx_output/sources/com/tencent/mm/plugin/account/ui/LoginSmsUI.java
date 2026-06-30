package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class LoginSmsUI extends com.tencent.mm.plugin.account.ui.LoginHistoryUI {

    /* renamed from: p1, reason: collision with root package name */
    public static final /* synthetic */ int f73395p1 = 0;

    /* renamed from: l1, reason: collision with root package name */
    public final x51.c1 f73396l1 = new x51.c1();

    @Override // com.tencent.mm.plugin.account.ui.LoginHistoryUI
    public void Z6() {
        super.Z6();
        if (isFinishing() || getWindow() == null) {
            com.tencent.mars.xlog.Log.e("LoginSmsUI", "LoginHistoryUI is finishing");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f73345y)) {
            return;
        }
        this.f73340u.f74286b = this.f73345y;
        hideVKB();
        this.f73396l1.a(this, new com.tencent.mm.plugin.account.ui.c7(this));
    }

    public final void m7(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        h11.e eVar = new h11.e(str, 13, "", 0, "");
        gm0.j1.d().g(eVar);
        this.f73338s = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.account.ui.b7(this, eVar));
    }

    @Override // com.tencent.mm.plugin.account.ui.LoginHistoryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 32044) {
            android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (i18 == -1 && bundleExtra != null && bundleExtra.getString("go_next", "").equals("auth_again")) {
                m7(this.f73345y);
            }
        }
    }

    @Override // com.tencent.mm.plugin.account.ui.LoginHistoryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.T = 8;
        if (!com.tencent.mm.sdk.platformtools.t8.Q0(this.C).booleanValue() && com.tencent.mm.sdk.platformtools.t8.Q0(this.f73345y).booleanValue()) {
            this.f73325d.setText(a7(this.f73345y));
        }
        this.M.setVisibility(0);
        this.M.setInputType(3);
        this.M.setSendSmsBtnClickListener(new com.tencent.mm.plugin.account.ui.y6(this));
        com.tencent.mm.ui.base.MMFormVerifyCodeInputView mMFormVerifyCodeInputView = this.M;
        com.tencent.mm.plugin.account.ui.z6 z6Var = new com.tencent.mm.plugin.account.ui.z6(this);
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = mMFormVerifyCodeInputView.f197373e;
        if (mMClearEditText != null) {
            mMClearEditText.addTextChangedListener(z6Var);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMFormVerifyCodeInputView", "watcher : %s, contentET : %s", z6Var, mMClearEditText);
        }
        if (this.M.getText().toString().length() > 0) {
            this.f73327f.setEnabled(true);
        }
        this.f73327f.setVisibility(0);
        this.f73327f.setOnClickListener(new com.tencent.mm.plugin.account.ui.a7(this));
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        q61.j.f360261a.b(this, new q61.k() { // from class: com.tencent.mm.plugin.account.ui.LoginSmsUI$$a
            @Override // q61.k
            public final void a(final boolean z17, r45.nf5 nf5Var) {
                int i17 = com.tencent.mm.plugin.account.ui.LoginSmsUI.f73395p1;
                final com.tencent.mm.plugin.account.ui.LoginSmsUI loginSmsUI = com.tencent.mm.plugin.account.ui.LoginSmsUI.this;
                loginSmsUI.getClass();
                final java.lang.ref.WeakReference weakReference2 = weakReference;
                loginSmsUI.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginSmsUI$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i18 = com.tencent.mm.plugin.account.ui.LoginSmsUI.f73395p1;
                        com.tencent.mm.plugin.account.ui.LoginSmsUI loginSmsUI2 = com.tencent.mm.plugin.account.ui.LoginSmsUI.this;
                        loginSmsUI2.getClass();
                        com.tencent.mars.xlog.Log.i("LoginSmsUI", "TAGcheckLoginURLMainDevice strongLoginSmsUI callback begin ");
                        com.tencent.mm.plugin.account.ui.LoginSmsUI loginSmsUI3 = (com.tencent.mm.plugin.account.ui.LoginSmsUI) weakReference2.get();
                        if (!z17 || loginSmsUI3 == null || loginSmsUI3.isFinishing()) {
                            return;
                        }
                        com.tencent.mars.xlog.Log.i("PushLoginURLTAG3MainDeviceCGI", "checkFastSwitchStatus strongLoginSmsUI");
                        loginSmsUI2.X6();
                    }
                });
            }
        });
    }

    @Override // com.tencent.mm.plugin.account.ui.LoginHistoryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.M.b();
    }

    @Override // com.tencent.mm.plugin.account.ui.LoginHistoryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        gm0.j1.d().q(145, this);
        hideVKB();
    }

    @Override // com.tencent.mm.plugin.account.ui.LoginHistoryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        gm0.j1.d().a(145, this);
    }
}
