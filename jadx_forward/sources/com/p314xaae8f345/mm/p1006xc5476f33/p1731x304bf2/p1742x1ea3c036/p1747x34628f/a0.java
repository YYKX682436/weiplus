package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f;

/* loaded from: classes8.dex */
public class a0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b0 f221401b;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b0 b0Var) {
        this.f221401b = b0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r1, com.p314xaae8f345.p3210x3857dc.h1
    public boolean B(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "shouldOverrideUrlLoading, url: %s", str);
        vz.g1 g1Var = (vz.g1) i95.n0.c(vz.g1.class);
        java.lang.String str2 = this.f221401b.I;
        ((uz.c) g1Var).getClass();
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.o.a(str, str2, c27816xac2547f9)) {
            return super.B(c27816xac2547f9, str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "use the downloader to download");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r1, com.p314xaae8f345.p3210x3857dc.h1
    public void l(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        super.l(c27816xac2547f9, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "onLoadResource, url: %s", str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r1, com.p314xaae8f345.p3210x3857dc.h1
    public void n(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "onPageFinished, __Time__, time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b0 b0Var = this.f221401b;
        b0Var.P.h(c27816xac2547f9, str);
        super.n(c27816xac2547f9, str);
        b0Var.O0(c27816xac2547f9, str);
        b0Var.getClass();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r1, com.p314xaae8f345.p3210x3857dc.h1
    public void o(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "onPageStarted, __Time__, time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b0 b0Var = this.f221401b;
        vz4.x xVar = b0Var.P;
        xVar.getClass();
        xVar.f523287b = java.lang.System.currentTimeMillis();
        super.o(c27816xac2547f9, str, bitmap);
        b0Var.P0(c27816xac2547f9, str, bitmap);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r1, com.p314xaae8f345.p3210x3857dc.h1
    public void p(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, int i17, java.lang.String str, java.lang.String str2) {
        super.p(c27816xac2547f9, i17, str, str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameWebCoreImpl", "onReceivedError, desc: %s, url: %s", str, str2);
        this.f221401b.f221406p1 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(949L, 1L, 1L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r1, com.p314xaae8f345.p3210x3857dc.h1
    public void s(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.x0 x0Var, com.p314xaae8f345.p3210x3857dc.y0 y0Var) {
        super.s(c27816xac2547f9, x0Var, y0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameWebCoreImpl", "onReceivedHttpError， errorCode: %d", java.lang.Integer.valueOf(y0Var.f302156c));
        this.f221401b.f221406p1 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(949L, 3L, 1L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r1, com.p314xaae8f345.p3210x3857dc.h1
    public void t(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.l0 l0Var, android.net.http.SslError sslError) {
        super.t(c27816xac2547f9, l0Var, sslError);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameWebCoreImpl", "onReceivedSslError， error: " + sslError);
        this.f221401b.f221406p1 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(949L, 2L, 1L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r1, com.p314xaae8f345.p3210x3857dc.h1
    public com.p314xaae8f345.p3210x3857dc.y0 x(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.x0 x0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest, url: %s", x0Var.mo120512xb5887639().toString());
        if (x0Var.mo120512xb5887639().toString().equals("https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxy) + "/favicon.ico")) {
            return new com.p314xaae8f345.p3210x3857dc.y0("img/png", null, null);
        }
        com.p314xaae8f345.p3210x3857dc.y0 i17 = this.f221401b.P.i(c27816xac2547f9, x0Var.mo120512xb5887639().toString(), x0Var);
        if (i17 == null) {
            return super.x(c27816xac2547f9, x0Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest response != null");
        return i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r1, com.p314xaae8f345.p3210x3857dc.h1
    public com.p314xaae8f345.p3210x3857dc.y0 y(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.x0 x0Var, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest, url: %s", x0Var.mo120512xb5887639().toString());
        if (x0Var.mo120512xb5887639().toString().equals("https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxy) + "/favicon.ico")) {
            return new com.p314xaae8f345.p3210x3857dc.y0("img/png", null, null);
        }
        com.p314xaae8f345.p3210x3857dc.y0 i17 = this.f221401b.P.i(c27816xac2547f9, x0Var.mo120512xb5887639().toString(), x0Var);
        if (i17 == null) {
            return super.y(c27816xac2547f9, x0Var, bundle);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest response != null");
        return i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r1, com.p314xaae8f345.p3210x3857dc.h1
    public com.p314xaae8f345.p3210x3857dc.y0 z(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest, url: %s", str);
        if (str.equals("https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxy) + "/favicon.ico")) {
            return new com.p314xaae8f345.p3210x3857dc.y0("img/png", null, null);
        }
        com.p314xaae8f345.p3210x3857dc.y0 i17 = this.f221401b.P.i(c27816xac2547f9, str, null);
        if (i17 == null) {
            return super.z(c27816xac2547f9, str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "shouldInterceptRequest response != null");
        return i17;
    }
}
