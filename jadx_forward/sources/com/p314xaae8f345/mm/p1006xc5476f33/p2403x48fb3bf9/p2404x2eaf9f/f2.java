package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class f2 implements rw4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 f263365a;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var) {
        this.f263365a = e3Var;
    }

    @Override // rw4.a
    public boolean b(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(url)) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.f273141a;
        return nf.z.d(url, "weixin://openapi/openwebview/result?");
    }

    @Override // rw4.a
    public boolean f(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11239xa0a98e2f.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11239xa0a98e2f.Resp();
        android.net.Uri parse = android.net.Uri.parse(url);
        resp.f32915xc84dc81d = parse.getQuery();
        resp.f32867xa7c470f2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(parse.getQueryParameter("errCode"), 0);
        resp.f32868xb2d5068c = parse.getQueryParameter("errMsg");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = this.f263365a;
        resp.f32870x7fa0d2de = e3Var.d0().getStringExtra("transaction_for_openapi_openwebview");
        java.lang.String queryParameter = parse.getQueryParameter("appid");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(e3Var.o1(), "SDKOpenWebViewResultHandler handleUrl, appId is null");
            return true;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        resp.mo48431x792022dd(bundle);
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j1.g(bundle);
        com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args args = new com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.Args();
        try {
            args.f32706x6a744ba6 = e3Var.e0().f3(queryParameter);
            args.f32701xaddf3082 = bundle;
            args.f32703x5cfee87 = 268435456;
            e3Var.o1();
            com.p314xaae8f345.mm.p987xb4b579b0.p988x2c0b7d03.C11222x78ddebd4.m48400x35cf88(e3Var.Y(), args);
            e3Var.E0();
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(e3Var.o1(), e17, "", new java.lang.Object[0]);
            return true;
        }
    }
}
