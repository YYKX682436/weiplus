package p012xc85e97e9.p116xd0ce2302;

/* renamed from: androidx.webkit.WebViewClientCompat */
/* loaded from: classes13.dex */
public abstract class AbstractC1192x89b53dc6 extends android.webkit.WebViewClient implements org.p3343x72743996.p3360x5ff5cf14.InterfaceC29672x58bdd76b {

    /* renamed from: sSupportedFeatures */
    private static final java.lang.String[] f3745x3b1562d8 = {org.p3343x72743996.p3360x5ff5cf14.p3361x36f002.C29680xf287485d.f74993x54b0ef32, org.p3343x72743996.p3360x5ff5cf14.p3361x36f002.C29680xf287485d.f74970x560b51de, org.p3343x72743996.p3360x5ff5cf14.p3361x36f002.C29680xf287485d.f74969x70d7466d, org.p3343x72743996.p3360x5ff5cf14.p3361x36f002.C29680xf287485d.f74988x69b5ae05, org.p3343x72743996.p3360x5ff5cf14.p3361x36f002.C29680xf287485d.f74976x2252e36d};

    @Override // org.p3343x72743996.p3360x5ff5cf14.InterfaceC29648xe93d3221
    /* renamed from: getSupportedFeatures */
    public final java.lang.String[] mo8350x55fd1655() {
        return f3745x3b1562d8;
    }

    @Override // android.webkit.WebViewClient, org.p3343x72743996.p3360x5ff5cf14.InterfaceC29672x58bdd76b
    public void onPageCommitVisible(android.webkit.WebView webView, java.lang.String str) {
    }

    @Override // org.p3343x72743996.p3360x5ff5cf14.InterfaceC29672x58bdd76b
    /* renamed from: onReceivedError */
    public final void mo8351xa740e108(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, java.lang.reflect.InvocationHandler invocationHandler) {
        mo8352xa740e108(webView, webResourceRequest, new z4.b0(invocationHandler));
    }

    /* renamed from: onReceivedError */
    public abstract void mo8352xa740e108(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, y4.k kVar);

    @Override // android.webkit.WebViewClient, org.p3343x72743996.p3360x5ff5cf14.InterfaceC29672x58bdd76b
    public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
    }

    @Override // org.p3343x72743996.p3360x5ff5cf14.InterfaceC29672x58bdd76b
    /* renamed from: onSafeBrowsingHit */
    public final void mo8353xeaa637a0(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, int i17, java.lang.reflect.InvocationHandler invocationHandler) {
        m8354xeaa637a0(webView, webResourceRequest, i17, new z4.w(invocationHandler));
    }

    @Override // org.p3343x72743996.p3360x5ff5cf14.InterfaceC29672x58bdd76b
    /* renamed from: onWebAuthnIntent */
    public boolean mo8355x4c7b75cd(android.webkit.WebView webView, android.app.PendingIntent pendingIntent, java.lang.reflect.InvocationHandler invocationHandler) {
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        mo8352xa740e108(webView, webResourceRequest, new z4.b0(webResourceError));
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, int i17, android.webkit.SafeBrowsingResponse safeBrowsingResponse) {
        m8354xeaa637a0(webView, webResourceRequest, i17, new z4.w(safeBrowsingResponse));
    }

    /* renamed from: onSafeBrowsingHit */
    public void m8354xeaa637a0(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, int i17, y4.f fVar) {
        if (y4.n.a(org.p3343x72743996.p3360x5ff5cf14.p3361x36f002.C29680xf287485d.f74980x5f618376)) {
            z4.w wVar = (z4.w) fVar;
            wVar.getClass();
            z4.f fVar2 = z4.e0.f551594c;
            if (fVar2.a()) {
                if (wVar.f551611a == null) {
                    z4.k0 k0Var = z4.f0.f551599a;
                    wVar.f551611a = (android.webkit.SafeBrowsingResponse) k0Var.f551605a.m154452xa4dce28(java.lang.reflect.Proxy.getInvocationHandler(wVar.f551612b));
                }
                z4.p.e(wVar.f551611a, true);
                return;
            }
            if (fVar2.b()) {
                if (wVar.f551612b == null) {
                    z4.k0 k0Var2 = z4.f0.f551599a;
                    wVar.f551612b = (org.p3343x72743996.p3360x5ff5cf14.InterfaceC29655xb95c34ba) org.p3343x72743996.p3360x5ff5cf14.p3361x36f002.C29679xe419bcbc.m154462xa5e5ff2f(org.p3343x72743996.p3360x5ff5cf14.InterfaceC29655xb95c34ba.class, k0Var2.f551605a.m154453xa4dce28(wVar.f551611a));
                }
                wVar.f551612b.m154360xd19302c9(true);
                return;
            }
            throw z4.e0.a();
        }
        throw z4.e0.a();
    }
}
