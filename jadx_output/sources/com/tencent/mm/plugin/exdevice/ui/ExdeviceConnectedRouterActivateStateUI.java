package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes5.dex */
public class ExdeviceConnectedRouterActivateStateUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f99234p = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectedRouterStateView f99235d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f99236e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f99237f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f99238g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f99239h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f99240i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f99241m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f99242n;

    /* renamed from: o, reason: collision with root package name */
    public final h32.b f99243o = new com.tencent.mm.plugin.exdevice.ui.u1(this);

    public final void T6() {
        finish();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("From_fail_notify", true);
        j45.l.u(this, "com.tencent.mm.ui.LauncherUI", intent, null);
    }

    public void U6(int i17) {
        this.f99235d.setOnClickListener(null);
        if (i17 == 1) {
            this.f99235d.setImageResource(com.tencent.mm.R.raw.connected_router_state_normal);
            this.f99235d.setState(1);
            this.f99236e.setText(com.tencent.mm.R.string.f491137c32);
            return;
        }
        if (i17 == 2) {
            this.f99235d.setImageResource(com.tencent.mm.R.raw.connected_router_state_succ);
            this.f99235d.setState(2);
            this.f99236e.setText(getString(com.tencent.mm.R.string.f491141c36, this.f99242n));
            addTextOptionMenu(0, getString(com.tencent.mm.R.string.f491136c31), new com.tencent.mm.plugin.exdevice.ui.w1(this));
            return;
        }
        if (i17 == 3) {
            this.f99235d.setImageResource(com.tencent.mm.R.raw.connected_router_state_error);
            this.f99235d.setState(3);
            this.f99235d.f99246f = 2;
            this.f99236e.setText(com.tencent.mm.R.string.f491138c33);
            this.f99237f.setText(getString(com.tencent.mm.R.string.f491139c34, this.f99242n));
            return;
        }
        if (i17 == 4) {
            this.f99235d.setImageResource(com.tencent.mm.R.raw.connected_router_state_error);
            this.f99235d.setState(3);
            this.f99235d.f99246f = 2;
            this.f99236e.setText(com.tencent.mm.R.string.f491138c33);
            this.f99237f.setText(getString(com.tencent.mm.R.string.f491140c35));
            return;
        }
        if (i17 != 5) {
            return;
        }
        this.f99235d.setImageResource(com.tencent.mm.R.raw.connected_router_state_error);
        this.f99235d.setState(3);
        this.f99235d.f99246f = 2;
        this.f99236e.setText(com.tencent.mm.R.string.f491138c33);
        this.f99237f.setText(getString(com.tencent.mm.R.string.c37));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a9o;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.c38);
        setBackBtn(new com.tencent.mm.plugin.exdevice.ui.v1(this));
        this.f99235d = (com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectedRouterStateView) findViewById(com.tencent.mm.R.id.diy);
        this.f99236e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dix);
        this.f99237f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.diz);
        try {
            android.net.Uri parse = android.net.Uri.parse(getIntent().getStringExtra("key_connected_router"));
            this.f99238g = parse.getQueryParameter("deviceid");
            this.f99239h = parse.getQueryParameter("devicetype");
            this.f99240i = parse.getQueryParameter(com.tencent.tmassistantsdk.storage.table.ClientInfoTable.TABLE_NAME);
            this.f99241m = parse.getQueryParameter("appid");
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f99238g) || com.tencent.mm.sdk.platformtools.t8.K0(this.f99239h) || com.tencent.mm.sdk.platformtools.t8.K0(this.f99240i) || com.tencent.mm.sdk.platformtools.t8.K0(this.f99241m)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ConnectedRouterActivateStateUi", "loss param %s", parse.toString());
                finish();
            }
            this.f99242n = parse.getQueryParameter(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID);
            parse.toString();
            if (this.f99242n == null) {
                this.f99242n = "";
            }
        } catch (java.lang.Exception e17) {
            e17.toString();
        }
        U6(1);
        gm0.j1.n().f273288b.g(new j32.a(this.f99238g, this.f99239h, this.f99240i, this.f99241m, this.f99243o));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        T6();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
