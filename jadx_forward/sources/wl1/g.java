package wl1;

/* loaded from: classes7.dex */
public final class g extends com.p314xaae8f345.p3210x3857dc.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wl1.h f528573a;

    public g(wl1.h hVar) {
        this.f528573a = hVar;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void m(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.RichTextWebView", "onPageCommitVisible");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c27816xac2547f9);
        wl1.h.a(this.f528573a, c27816xac2547f9);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void n(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.RichTextWebView", "onPageFinished");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c27816xac2547f9);
        wl1.h.a(this.f528573a, c27816xac2547f9);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void p(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, int i17, java.lang.String description, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(description, "description");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.RichTextWebView", "onReceivedError errorCode:" + i17 + " Error: " + description);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.h1
    public void q(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, com.p314xaae8f345.p3210x3857dc.x0 x0Var, com.p314xaae8f345.p3210x3857dc.w0 error) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.RichTextWebView", "onReceivedError Error: %s", error.a());
    }
}
