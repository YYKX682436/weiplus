package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.game.GameChattingRoomWebViewUI */
/* loaded from: classes8.dex */
public class ActivityC19409x49ff443a extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d {
    public java.lang.String A3 = "";
    public final int B3 = 4;
    public final int C3 = 5;
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j D3 = new sx4.c(this);
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j E3 = new sx4.d(this);
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3 F3 = new sx4.f(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e7() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e76 = super.e7();
        e76.E(this.F3);
        return e76;
    }

    public void m9(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameChattingRoomWebViewUI", "url = %s", str);
        this.A3 = str;
        java.lang.String stringExtra = getIntent().getStringExtra("action");
        if (stringExtra != null) {
            java.lang.String stringExtra2 = getIntent().getStringExtra("app_name");
            java.lang.String string = stringExtra2 == null ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571545ig) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.bay, stringExtra2);
            java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572476bb5);
            boolean equals = stringExtra.equals("action_create");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar = this.E3;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar2 = this.D3;
            if (equals) {
                fq1.h.a(this.f39322x2305be9, getString(com.p314xaae8f345.mm.R.C30867xcad56011.bly), string, string2, jVar2, jVar);
            } else if (stringExtra.equals("action_join")) {
                fq1.h.a(this.f39322x2305be9, getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6s), string, string2, jVar2, jVar);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.L1.M0(this.F3);
        super.onDestroy();
    }
}
