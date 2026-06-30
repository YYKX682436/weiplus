package androidx.webkit;

/* loaded from: classes13.dex */
public abstract class WebViewClientCompat extends android.webkit.WebViewClient implements org.chromium.support_lib_boundary.WebViewClientBoundaryInterface {
    private static final java.lang.String[] sSupportedFeatures = {org.chromium.support_lib_boundary.util.Features.VISUAL_STATE_CALLBACK, org.chromium.support_lib_boundary.util.Features.RECEIVE_WEB_RESOURCE_ERROR, org.chromium.support_lib_boundary.util.Features.RECEIVE_HTTP_ERROR, org.chromium.support_lib_boundary.util.Features.SHOULD_OVERRIDE_WITH_REDIRECTS, org.chromium.support_lib_boundary.util.Features.SAFE_BROWSING_HIT};

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final java.lang.String[] getSupportedFeatures() {
        return sSupportedFeatures;
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onPageCommitVisible(android.webkit.WebView webView, java.lang.String str) {
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, java.lang.reflect.InvocationHandler invocationHandler) {
        onReceivedError(webView, webResourceRequest, new z4.b0(invocationHandler));
    }

    public abstract void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, y4.k kVar);

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, int i17, java.lang.reflect.InvocationHandler invocationHandler) {
        onSafeBrowsingHit(webView, webResourceRequest, i17, new z4.w(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean onWebAuthnIntent(android.webkit.WebView webView, android.app.PendingIntent pendingIntent, java.lang.reflect.InvocationHandler invocationHandler) {
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        onReceivedError(webView, webResourceRequest, new z4.b0(webResourceError));
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, int i17, android.webkit.SafeBrowsingResponse safeBrowsingResponse) {
        onSafeBrowsingHit(webView, webResourceRequest, i17, new z4.w(safeBrowsingResponse));
    }

    public void onSafeBrowsingHit(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, int i17, y4.f fVar) {
        if (y4.n.a(org.chromium.support_lib_boundary.util.Features.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL)) {
            z4.w wVar = (z4.w) fVar;
            wVar.getClass();
            z4.f fVar2 = z4.e0.f470061c;
            if (fVar2.a()) {
                if (wVar.f470078a == null) {
                    z4.k0 k0Var = z4.f0.f470066a;
                    wVar.f470078a = (android.webkit.SafeBrowsingResponse) k0Var.f470072a.convertSafeBrowsingResponse(java.lang.reflect.Proxy.getInvocationHandler(wVar.f470079b));
                }
                z4.p.e(wVar.f470078a, true);
                return;
            }
            if (fVar2.b()) {
                if (wVar.f470079b == null) {
                    z4.k0 k0Var2 = z4.f0.f470066a;
                    wVar.f470079b = (org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface.class, k0Var2.f470072a.convertSafeBrowsingResponse(wVar.f470078a));
                }
                wVar.f470079b.showInterstitial(true);
                return;
            }
            throw z4.e0.a();
        }
        throw z4.e0.a();
    }
}
