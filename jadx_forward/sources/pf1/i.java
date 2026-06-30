package pf1;

/* loaded from: classes7.dex */
public final class i implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t, ni1.f {

    /* renamed from: d, reason: collision with root package name */
    public final pf1.d f435309d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f435310e;

    public i(pf1.d webview) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webview, "webview");
        this.f435309d = webview;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public void M(java.net.URL url, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, android.webkit.ValueCallback valueCallback) {
        mo14660x738236e6(str3, valueCallback);
    }

    @Override // ni1.f
    public void P() {
        java.lang.Boolean bool = this.f435310e;
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, bool2)) {
            return;
        }
        this.f435309d.mo158323xc39f557c();
        this.f435310e = bool2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public void R(java.net.URL url, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        mo14660x738236e6(str, valueCallback);
    }

    @Override // ni1.f
    public void V() {
        java.lang.Boolean bool = this.f435310e;
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, bool2)) {
            return;
        }
        this.f435309d.mo158322xc39a57c1();
        this.f435310e = bool2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    /* renamed from: addJavascriptInterface */
    public void mo14658x74041feb(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            return;
        }
        if (str == null || str.length() == 0) {
            return;
        }
        this.f435309d.mo158319x74041feb(obj, str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    /* renamed from: destroy */
    public void mo14659x5cd39ffa() {
        this.f435309d.mo158320x5cd39ffa();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0
    /* renamed from: evaluateJavascript */
    public void mo14660x738236e6(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f435309d.mo158321x738236e6(str, valueCallback);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.u h0(java.lang.Class cls) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ni1.f.class, cls) && this.f435309d.a()) {
            return this;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t
    /* renamed from: setJsExceptionHandler */
    public void mo14673x29497b66(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.s sVar) {
    }
}
