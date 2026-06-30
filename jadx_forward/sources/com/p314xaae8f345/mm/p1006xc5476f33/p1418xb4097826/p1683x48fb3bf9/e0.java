package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* loaded from: classes8.dex */
public final class e0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15492xb61be281 f218396a;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15492xb61be281 c15492xb61be281) {
        this.f218396a = c15492xb61be281;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void f(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdWebViewImpl", "onPageCommitVisible :" + str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdWebViewImpl", "webViewReady");
        this.f218396a.m63357x641fec89();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void g(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdWebViewImpl", "onPageFinished :" + str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void h(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdWebViewImpl", "onPageStarted :" + str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdWebViewImpl", "webViewReady");
        this.f218396a.m63357x641fec89();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void i(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdWebViewImpl", "onReceivedError errorCode :" + i17 + " description:" + str + " failingUrl:" + str2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void j(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.x0 x0Var, com.p314xaae8f345.p3210x3857dc.w0 w0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceivedError request :");
        sb6.append(x0Var);
        sb6.append(" error:");
        sb6.append(w0Var);
        sb6.append(" isForMain:");
        sb6.append(x0Var != null ? java.lang.Boolean.valueOf(x0Var.mo120514xa25f36b5()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdWebViewImpl", sb6.toString());
        boolean z17 = false;
        if (x0Var != null && x0Var.mo120514xa25f36b5()) {
            z17 = true;
        }
        if (z17) {
            this.f218396a.m63353xaf8aa769();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void k(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.x0 x0Var, com.p314xaae8f345.p3210x3857dc.y0 y0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReceivedHttpError :");
        sb6.append(x0Var != null ? java.lang.Boolean.valueOf(x0Var.mo120514xa25f36b5()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdWebViewImpl", sb6.toString());
        boolean z17 = false;
        if (x0Var != null && x0Var.mo120514xa25f36b5()) {
            z17 = true;
        }
        if (z17) {
            this.f218396a.m63353xaf8aa769();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o1
    public void l(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.l0 l0Var, android.net.http.SslError sslError) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.m mVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.m mVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdWebViewImpl", "onReceivedSslError");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.C15492xb61be281 c15492xb61be281 = this.f218396a;
        str = c15492xb61be281.mCurrentURL;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        mVar = c15492xb61be281.sslErrorHandler;
        if (mVar == null && c27816xac2547f9 != null) {
            zg0.p3 p3Var = (zg0.p3) i95.n0.c(zg0.p3.class);
            android.content.Context context = c27816xac2547f9.getContext();
            ((yg0.q4) p3Var).getClass();
            c15492xb61be281.sslErrorHandler = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u(context, c27816xac2547f9);
        }
        mVar2 = c15492xb61be281.sslErrorHandler;
        if (mVar2 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u) mVar2).b(str, l0Var, sslError);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
            return;
        }
        c15492xb61be281.m63353xaf8aa769();
    }
}
