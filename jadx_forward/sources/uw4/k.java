package uw4;

/* loaded from: classes8.dex */
public class k extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pf.a f513274b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uw4.n f513275c;

    public k(uw4.n nVar, pf.a aVar) {
        this.f513275c = nVar;
        this.f513274b = aVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r1, com.p314xaae8f345.p3210x3857dc.h1
    public boolean B(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        vz.g1 g1Var = (vz.g1) i95.n0.c(vz.g1.class);
        java.lang.String str2 = this.f513275c.I;
        ((uz.c) g1Var).getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.o.a(str, str2, c27816xac2547f9)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebViewCoreImpl", "use the downloader to download");
            return true;
        }
        ((sd.n0) this.f513274b).a(str);
        return super.B(c27816xac2547f9, str);
    }

    public final com.p314xaae8f345.p3210x3857dc.y0 C(com.p314xaae8f345.p3210x3857dc.x0 x0Var, android.os.Bundle bundle) {
        android.webkit.WebResourceResponse b17;
        uw4.z zVar = new uw4.z(x0Var.mo120512xb5887639(), x0Var.mo120514xa25f36b5(), false, x0Var.mo120513x74aa214f(), x0Var.mo120510x24dcf3d7(), x0Var.mo120511xaf5cb2ed());
        sd.n0 n0Var = (sd.n0) this.f513274b;
        n0Var.getClass();
        n0Var.d(zVar.getUrl().toString());
        sd.o0 o0Var = n0Var.f488160a;
        sd.p0 p0Var = o0Var.f488165h;
        if (p0Var == null || (b17 = p0Var.d(zVar, bundle)) == null) {
            b17 = o0Var.f488169o.b(zVar.getUrl().toString());
        }
        if (b17 != null) {
            return new com.p314xaae8f345.p3210x3857dc.y0(b17.getMimeType(), b17.getEncoding(), b17.getStatusCode(), b17.getReasonPhrase(), b17.getResponseHeaders(), b17.getData());
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r1, com.p314xaae8f345.p3210x3857dc.h1
    public void l(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        this.f513274b.getClass();
        super.l(c27816xac2547f9, str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r1, com.p314xaae8f345.p3210x3857dc.h1
    public void n(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        ((sd.n0) this.f513274b).b(str);
        super.n(c27816xac2547f9, str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r1, com.p314xaae8f345.p3210x3857dc.h1
    public void o(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str, android.graphics.Bitmap bitmap) {
        sd.o0 o0Var = ((sd.n0) this.f513274b).f488160a;
        o0Var.f488173s = false;
        o0Var.f488171q = str;
        o0Var.f488167m.f426052d.getClass();
        sd.p0 p0Var = o0Var.f488165h;
        if (p0Var != null) {
            p0Var.c(str);
        }
        super.o(c27816xac2547f9, str, bitmap);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r1, com.p314xaae8f345.p3210x3857dc.h1
    public com.p314xaae8f345.p3210x3857dc.y0 x(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.x0 x0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebViewCoreImpl", "shouldInterceptRequest, url: %s", x0Var.mo120512xb5887639().toString());
        com.p314xaae8f345.p3210x3857dc.y0 C = C(x0Var, new android.os.Bundle());
        return C != null ? C : super.x(c27816xac2547f9, x0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r1, com.p314xaae8f345.p3210x3857dc.h1
    public com.p314xaae8f345.p3210x3857dc.y0 y(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.x0 x0Var, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebViewCoreImpl", "shouldInterceptRequest, url: %s", x0Var.mo120512xb5887639().toString());
        com.p314xaae8f345.p3210x3857dc.y0 C = C(x0Var, bundle);
        return C != null ? C : super.z(c27816xac2547f9, x0Var.mo120512xb5887639().toString());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.r1, com.p314xaae8f345.p3210x3857dc.h1
    public com.p314xaae8f345.p3210x3857dc.y0 z(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageMMWebViewCoreImpl", "shouldInterceptRequest, url: %s", str);
        android.webkit.WebResourceResponse c17 = ((sd.n0) this.f513274b).c(str);
        com.p314xaae8f345.p3210x3857dc.y0 y0Var = c17 != null ? new com.p314xaae8f345.p3210x3857dc.y0(c17.getMimeType(), c17.getEncoding(), c17.getStatusCode(), c17.getReasonPhrase(), c17.getResponseHeaders(), c17.getData()) : null;
        return y0Var != null ? y0Var : super.z(c27816xac2547f9, str);
    }
}
