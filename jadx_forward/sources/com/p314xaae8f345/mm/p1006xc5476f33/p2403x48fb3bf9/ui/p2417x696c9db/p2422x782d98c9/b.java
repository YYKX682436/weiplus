package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2422x782d98c9;

/* loaded from: classes.dex */
public class b implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q8 {

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2422x782d98c9.b f265692d;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2422x782d98c9.a f265693a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f265694b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f265695c = false;

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2422x782d98c9.b d() {
        if (f265692d == null) {
            f265692d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2422x782d98c9.b();
        }
        return f265692d;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q8
    public void a(android.content.Context context) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q8
    public void b(android.content.Context context) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q8
    public void c(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.WebViewExDeviceLanMgr", "stopPlugin, isScaning = %s", java.lang.Boolean.valueOf(this.f265695c));
        if (this.f265695c) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5379x8b74db21 c5379x8b74db21 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5379x8b74db21();
            c5379x8b74db21.f135714g.f89140a = false;
            c5379x8b74db21.e();
            this.f265695c = false;
        }
        this.f265694b = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2422x782d98c9.a aVar = this.f265693a;
        if (aVar != null) {
            aVar.f265687c.mo48814x2efc64();
            this.f265693a.f265688d.mo48814x2efc64();
            this.f265693a.f265690f.mo48814x2efc64();
            this.f265693a.f265689e.mo48814x2efc64();
            this.f265693a.f265691g.mo48814x2efc64();
            this.f265693a = null;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5362xc5bd72d1 c5362xc5bd72d1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5362xc5bd72d1();
        c5362xc5bd72d1.f135688g.f89139a = false;
        c5362xc5bd72d1.e();
    }

    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.WebViewExDeviceLanMgr", "tryInit");
        if (this.f265693a == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2422x782d98c9.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2422x782d98c9.a(0, z0Var, str);
            this.f265693a = aVar;
            aVar.f265687c.mo48813x58998cd();
            this.f265693a.f265688d.mo48813x58998cd();
            this.f265693a.f265690f.mo48813x58998cd();
            this.f265693a.f265689e.mo48813x58998cd();
            this.f265693a.f265691g.mo48813x58998cd();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5362xc5bd72d1 c5362xc5bd72d1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5362xc5bd72d1();
        c5362xc5bd72d1.f135688g.f89139a = true;
        c5362xc5bd72d1.e();
        this.f265694b = true;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q8
    /* renamed from: getName */
    public java.lang.String mo74208xfb82e301() {
        return "WebViewExDeviceLanMgr";
    }
}
