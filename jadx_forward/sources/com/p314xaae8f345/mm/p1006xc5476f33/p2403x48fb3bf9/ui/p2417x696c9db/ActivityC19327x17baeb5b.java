package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.TransparentWebViewUI */
/* loaded from: classes8.dex */
public class ActivityC19327x17baeb5b extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public void Y7() {
        m78561xe5bc8f21(0);
        m78513xc2a54588().setBackgroundResource(0);
        this.f265348f.setBackgroundResource(android.R.color.transparent);
        this.f265348f.setBackgroundColor(0);
        findViewById(com.p314xaae8f345.mm.R.id.pil).setBackgroundResource(android.R.color.transparent);
        findViewById(com.p314xaae8f345.mm.R.id.m7j).setBackgroundResource(android.R.color.transparent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19489x7d57af1f c19489x7d57af1f;
        super.mo43517x10010bd5();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.s7 s7Var = this.f265337a3;
        s7Var.getClass();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
        yp5.a.f545942a.a();
        s7Var.f268396q = true;
        s7Var.f268384e = false;
        s7Var.e(true);
        android.view.View view = s7Var.f268392m;
        if (view != null) {
            view.setBackgroundColor(0);
        }
        if (!(getIntent() != null && getIntent().hasExtra("show_full_screen") && getIntent().getBooleanExtra("show_full_screen", false)) || (c19489x7d57af1f = this.f265408z) == null) {
            return;
        }
        c19489x7d57af1f.m74813xd20050ff(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d
    public boolean l7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19408x1a0ee9aa, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int i17 = this.A;
        if (i17 == 1001) {
            this.A = 0;
            z41.c cVar = this.D;
            if (cVar != null) {
                cVar.enable();
                return;
            }
            return;
        }
        if (i17 == 1002) {
            this.A = 1;
            z41.c cVar2 = this.D;
            if (cVar2 != null) {
                cVar2.enable();
            }
        }
    }
}
