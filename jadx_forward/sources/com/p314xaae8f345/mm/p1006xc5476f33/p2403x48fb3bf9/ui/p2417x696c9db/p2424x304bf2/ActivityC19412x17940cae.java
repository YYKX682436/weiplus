package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.H5GameWebViewUI */
/* loaded from: classes8.dex */
public class ActivityC19412x17940cae extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b {
    public static final java.lang.String U3 = "http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxy) + "/cgi-bin/h5/static/gameloading/index.html";
    public int T3;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public boolean l7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19408x1a0ee9aa, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.H5GameWebViewUI", "onCreate");
        this.K = false;
        this.T3 = this.A;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.H5GameWebViewUI", "onNewIntent");
        super.onNewIntent(intent);
        boolean booleanExtra = getIntent().getBooleanExtra("show_full_screen", false);
        setIntent(intent);
        java.lang.String stringExtra = intent.getStringExtra("rawUrl");
        if (this.f265335J.equals(stringExtra)) {
            return;
        }
        if (stringExtra.startsWith(U3)) {
            this.f265335J = stringExtra;
        }
        if (F7().equals(stringExtra)) {
            this.A = this.T3;
            getIntent().putExtra("show_full_screen", booleanExtra);
            Z7();
            return;
        }
        this.A = getIntent().getIntExtra("screen_orientation", -1);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar = this.f265409z1;
        if (wVar == null) {
            this.f265409z1 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w(new sx4.r0(this));
        } else {
            wVar.g(stringExtra, null, null);
        }
        this.f265409z1.h((com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3) getIntent().getParcelableExtra("hardcode_jspermission"), (com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e) getIntent().getParcelableExtra("hardcode_general_ctrl"));
        this.f265348f.mo32265x141096a9("about:blank");
        this.L1.j(intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19408x1a0ee9aa, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        mo50393x3c0b42ee();
        super.onResume();
    }
}
