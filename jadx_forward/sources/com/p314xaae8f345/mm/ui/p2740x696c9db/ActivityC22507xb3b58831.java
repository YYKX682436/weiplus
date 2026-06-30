package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* renamed from: com.tencent.mm.ui.tools.MMTextInputUI */
/* loaded from: classes9.dex */
public class ActivityC22507xb3b58831 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f291609m = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.EditText f291610d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f291611e;

    /* renamed from: f, reason: collision with root package name */
    public int f291612f;

    /* renamed from: g, reason: collision with root package name */
    public int f291613g;

    /* renamed from: h, reason: collision with root package name */
    public int f291614h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f291615i;

    public final void T6() {
        if (getIntent().getBooleanExtra("key_show_confirm", false)) {
            db5.e1.u(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hqi), "", new com.p314xaae8f345.mm.ui.p2740x696c9db.x6(this), null);
            return;
        }
        mo48674x36654fab();
        setResult(0);
        finish();
    }

    public void U6(java.lang.CharSequence charSequence) {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bl9;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f291610d = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.o4a);
        this.f291611e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.nhh);
        android.widget.EditText editText = this.f291610d;
        java.lang.String stringExtra = getIntent().getStringExtra("key_hint");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        editText.setHint(stringExtra);
        android.widget.EditText editText2 = this.f291610d;
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_value");
        editText2.append(stringExtra2 != null ? stringExtra2 : "");
        int intExtra = getIntent().getIntExtra("key_max_count", -1) << 1;
        this.f291612f = intExtra;
        this.f291614h = 0;
        this.f291613g = java.lang.Math.max(intExtra + org.p3343x72743996.net.InterfaceC29524x4f65168b.f74068x80b38894, (intExtra * 9) / 10);
        this.f291615i = getIntent().getBooleanExtra("key_nullable", false);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2740x696c9db.y6(this));
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.ui.p2740x696c9db.z6(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        m78501x43e00957(this.f291615i);
        if (!this.f291615i || this.f291612f > 0) {
            this.f291610d.addTextChangedListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.a7(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (4 != i17) {
            return super.onKeyDown(i17, keyEvent);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTextInputUI", "on back key down");
        T6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
