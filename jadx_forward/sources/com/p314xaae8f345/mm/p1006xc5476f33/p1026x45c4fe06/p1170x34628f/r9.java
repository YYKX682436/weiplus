package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class r9 extends com.p314xaae8f345.p3210x3857dc.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w9 f168594a;

    public r9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w9 w9Var) {
        this.f168594a = w9Var;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public boolean B(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWebView", "shouldOverrideUrlLoading, url = %s", str);
        return true;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void n(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        this.f168594a.f168738v.c(str);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void o(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f168594a.f168738v.getClass();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void p(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandWebView", "onReceivedError, errCode = %d, description = %s, failingUrl = %s", java.lang.Integer.valueOf(i17), str, str2);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void s(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.x0 x0Var, com.p314xaae8f345.p3210x3857dc.y0 y0Var) {
        android.net.Uri mo120512xb5887639 = x0Var.mo120512xb5887639();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandWebView", "onReceivedHttpError, WebResourceRequest url = %s, ErrWebResourceResponse mimeType = %s, status = %d", mo120512xb5887639 == null ? "null" : mo120512xb5887639.toString(), y0Var.f302154a, java.lang.Integer.valueOf(y0Var.f302156c));
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void t(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.l0 l0Var, android.net.http.SslError sslError) {
        if (sslError.getPrimaryError() != 3) {
            l0Var.mo120274xae7a2e7a();
        } else if (this.f168594a.f168738v.b(sslError.getCertificate())) {
            l0Var.a();
        } else {
            l0Var.mo120274xae7a2e7a();
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public com.p314xaae8f345.p3210x3857dc.y0 x(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.x0 x0Var) {
        if (x0Var == null || x0Var.mo120512xb5887639() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x0Var.mo120512xb5887639().toString())) {
            return null;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w9.E0(this.f168594a, x0Var.mo120512xb5887639().toString());
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public com.p314xaae8f345.p3210x3857dc.y0 y(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.x0 x0Var, android.os.Bundle bundle) {
        if (x0Var == null || x0Var.mo120512xb5887639() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x0Var.mo120512xb5887639().toString())) {
            return null;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w9.E0(this.f168594a, x0Var.mo120512xb5887639().toString());
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public com.p314xaae8f345.p3210x3857dc.y0 z(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w9.E0(this.f168594a, str);
    }
}
