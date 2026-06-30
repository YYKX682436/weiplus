package com.p314xaae8f345.p3210x3857dc.sys;

/* loaded from: classes13.dex */
public class w extends com.p314xaae8f345.p3210x3857dc.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.webkit.WebSettings f302121a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f302122b = "";

    public w(android.webkit.WebView webView) {
        this.f302121a = webView.getSettings();
        g();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void A(int i17) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void B(int i17) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.f302121a.setForceDark(i17);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void C(boolean z17) {
        this.f302121a.setGeolocationEnabled(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void D(boolean z17) {
        this.f302121a.setJavaScriptCanOpenWindowsAutomatically(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void E(boolean z17) {
        this.f302121a.setJavaScriptEnabled(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void F(android.webkit.WebSettings.LayoutAlgorithm layoutAlgorithm) {
        this.f302121a.setLayoutAlgorithm(layoutAlgorithm);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void G(boolean z17) {
        this.f302121a.setLoadWithOverviewMode(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void H(boolean z17) {
        this.f302121a.setLoadsImagesAutomatically(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void I(boolean z17) {
        this.f302121a.setMediaPlaybackRequiresUserGesture(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void J(int i17) {
        this.f302121a.setMixedContentMode(i17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void K(android.webkit.WebSettings.RenderPriority renderPriority) {
        this.f302121a.setRenderPriority(renderPriority);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void L(boolean z17) {
        this.f302121a.setSaveFormData(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void M(boolean z17) {
        this.f302121a.setSavePassword(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void N(boolean z17) {
        this.f302121a.setSupportZoom(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void O(int i17) {
        this.f302121a.setTextZoom(i17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void P(boolean z17) {
        this.f302121a.setUseWideViewPort(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void Q(java.lang.String str) {
        this.f302122b = str;
        this.f302121a.setUserAgentString(str);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void R(int i17) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void S(boolean z17) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void a(int i17) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public boolean b() {
        return this.f302121a.getAllowFileAccess();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public boolean c() {
        return this.f302121a.getBlockNetworkImage();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public int d() {
        return 0;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public int e() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return this.f302121a.getForceDark();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public int f() {
        return this.f302121a.getTextZoom();
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public java.lang.String g() {
        java.lang.String str = this.f302122b;
        if (str == null || str.isEmpty()) {
            try {
                this.f302122b = this.f302121a.getUserAgentString();
            } catch (java.lang.Throwable th6) {
                by5.c4.d("SysWebViewSettings", "getUserAgentString error", th6);
            }
        }
        return this.f302122b;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void h(boolean z17) {
        this.f302121a.setAllowFileAccess(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void i(boolean z17) {
        this.f302121a.setAllowFileAccessFromFileURLs(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void j(java.util.Map map) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void k(boolean z17) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void l(long j17) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void m(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void n(boolean z17) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void o(boolean z17) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void p(boolean z17) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void q(boolean z17) {
        this.f302121a.setBlockNetworkImage(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void r(boolean z17) {
        this.f302121a.setBuiltInZoomControls(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void s(int i17) {
        this.f302121a.setCacheMode(i17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void t(boolean z17) {
        this.f302121a.setDatabaseEnabled(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void u(java.lang.String str) {
        this.f302121a.setDatabasePath(str);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void v(int i17) {
        this.f302121a.setDefaultFontSize(i17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void w(java.lang.String str) {
        this.f302121a.setDefaultTextEncodingName(str);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void x(int i17) {
        this.f302121a.setDisabledActionModeMenuItems(i17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void y(boolean z17) {
        this.f302121a.setDisplayZoomControls(z17);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.z0
    public void z(boolean z17) {
        this.f302121a.setDomStorageEnabled(z17);
    }
}
