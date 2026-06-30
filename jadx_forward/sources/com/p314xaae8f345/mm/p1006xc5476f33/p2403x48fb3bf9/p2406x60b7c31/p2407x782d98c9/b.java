package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2406x60b7c31.p2407x782d98c9;

/* loaded from: classes.dex */
public class b implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q8 {

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2406x60b7c31.p2407x782d98c9.b f263632f;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2406x60b7c31.p2407x782d98c9.a f263633a;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f263635c;

    /* renamed from: b, reason: collision with root package name */
    public boolean f263634b = false;

    /* renamed from: d, reason: collision with root package name */
    public int f263636d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f263637e = false;

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2406x60b7c31.p2407x782d98c9.b d() {
        if (f263632f == null) {
            f263632f = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2406x60b7c31.p2407x782d98c9.b();
        }
        return f263632f;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q8
    public void a(android.content.Context context) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q8
    public void b(android.content.Context context) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q8
    public void c(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.WebViewExDeviceMgr", "stopPlugin, isScaning = %s", java.lang.Boolean.valueOf(this.f263637e));
        if (this.f263637e) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5363x950d46de c5363x950d46de = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5363x950d46de();
            am.q6 q6Var = c5363x950d46de.f135689g;
            q6Var.f89226b = false;
            q6Var.f89225a = this.f263635c;
            c5363x950d46de.e();
            if (!c5363x950d46de.f135690h.f89334a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.webview.WebViewExDeviceMgr", "stopScanWXDevice fail");
            }
            this.f263637e = false;
        }
        this.f263634b = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2406x60b7c31.p2407x782d98c9.a aVar = this.f263633a;
        if (aVar != null) {
            aVar.f263627c.mo48814x2efc64();
            this.f263633a.f263628d.mo48814x2efc64();
            this.f263633a.f263630f.mo48814x2efc64();
            this.f263633a.f263629e.mo48814x2efc64();
            this.f263633a.f263631g.mo48814x2efc64();
            this.f263633a = null;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5369x9d92ac46 c5369x9d92ac46 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5369x9d92ac46();
        am.a7 a7Var = c5369x9d92ac46.f135699g;
        a7Var.f87663a = "";
        a7Var.f87664b = 0;
        a7Var.f87665c = true;
        c5369x9d92ac46.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.WebViewExDeviceMgr", "stop EcDeviceMgr for webview %s", java.lang.Boolean.valueOf(c5369x9d92ac46.f135700h.f87756a));
    }

    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.webview.WebViewExDeviceMgr", "tryInit");
        if (this.f263633a == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2406x60b7c31.p2407x782d98c9.a aVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2406x60b7c31.p2407x782d98c9.a(z0Var, str);
            this.f263633a = aVar;
            aVar.f263627c.mo48813x58998cd();
            this.f263633a.f263628d.mo48813x58998cd();
            this.f263633a.f263630f.mo48813x58998cd();
            this.f263633a.f263629e.mo48813x58998cd();
            this.f263633a.f263631g.mo48813x58998cd();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5356xdb8c1b7d c5356xdb8c1b7d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5356xdb8c1b7d();
        c5356xdb8c1b7d.f135682g.f88546a = 1;
        c5356xdb8c1b7d.e();
        this.f263634b = true;
        this.f263635c = str;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.q8
    /* renamed from: getName */
    public java.lang.String mo74208xfb82e301() {
        return "WebViewExDeviceMgr";
    }
}
