package com.tencent.mm.plugin.account.ui;

@db5.a(19)
/* loaded from: classes4.dex */
public class LoginFastSwitchUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f73315d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f73316e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f73317f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f73318g;

    /* renamed from: h, reason: collision with root package name */
    public final x51.c1 f73319h = new x51.c1();

    /* renamed from: i, reason: collision with root package name */
    public int f73320i = 200;

    public final void T6() {
        long j17;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginFastSwitchUI", "doCheckLogin %s", new com.tencent.mm.sdk.platformtools.z3());
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.account.ui.LoginFastSwitchUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.account.ui.LoginFastSwitchUI loginFastSwitchUI = com.tencent.mm.plugin.account.ui.LoginFastSwitchUI.this;
                java.lang.String UUID = loginFastSwitchUI.f73317f;
                byte[] bArr = loginFastSwitchUI.f73318g;
                com.tencent.mm.plugin.account.ui.LoginFastSwitchUI$$b loginFastSwitchUI$$b = new com.tencent.mm.plugin.account.ui.LoginFastSwitchUI$$b(loginFastSwitchUI);
                kotlin.jvm.internal.o.g(UUID, "UUID");
                kotlinx.coroutines.l.d(v65.m.b(loginFastSwitchUI), kotlinx.coroutines.q1.f310568a, null, new q61.a(UUID, bArr, loginFastSwitchUI$$b, null), 2, null);
            }
        };
        int i17 = this.f73320i;
        if (i17 > 2000) {
            j17 = 2000;
        } else {
            int i18 = i17 + 200;
            this.f73320i = i18;
            j17 = i18;
        }
        com.tencent.mm.sdk.platformtools.u3.i(runnable, j17);
    }

    public void U6(java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(ya.b.SUCCESS, false);
        intent.putExtra("err_msg", str);
        intent.putExtra("block", bool);
        intent.putExtra("show_toast", bool2);
        intent.putExtra("UUID", this.f73317f);
        setResult(-1, intent);
        finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477830co);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489230ej1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485702ud2);
        this.f73315d = textView;
        textView.setText(getString(com.tencent.mm.R.string.paq));
        com.tencent.mm.ui.bk.s0(this.f73315d.getPaint());
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.f485701ud1);
        this.f73316e = button;
        button.setText(getString(com.tencent.mm.R.string.pap));
        com.tencent.mm.ui.bk.s0(this.f73316e.getPaint());
        this.f73316e.setOnClickListener(new com.tencent.mm.plugin.account.ui.h4(this));
        setBackBtn(new com.tencent.mm.plugin.account.ui.i4(this), com.tencent.mm.R.raw.actionbar_icon_close_black);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginFastSwitchUI", "onCreate");
        initView();
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
        android.content.Intent intent = getIntent();
        if (intent != null) {
            this.f73317f = intent.getStringExtra("UUID");
            this.f73318g = intent.getByteArrayExtra("NotifyKey");
            T6();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        this.f73319h.c(this, i17, strArr, iArr);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
