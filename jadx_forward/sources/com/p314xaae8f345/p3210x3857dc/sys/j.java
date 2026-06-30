package com.p314xaae8f345.p3210x3857dc.sys;

/* loaded from: classes13.dex */
public class j implements com.p314xaae8f345.p3210x3857dc.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f302089a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f302090b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f302091c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f302092d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f302093e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p3210x3857dc.v0 f302094f;

    public j(android.webkit.WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null) {
            this.f302089a = webResourceRequest.getUrl();
            this.f302090b = webResourceRequest.isForMainFrame();
            this.f302091c = webResourceRequest.hasGesture();
            this.f302092d = webResourceRequest.getMethod();
            webResourceRequest.isRedirect();
            this.f302093e = webResourceRequest.getRequestHeaders();
            this.f302094f = new com.p314xaae8f345.p3210x3857dc.v0(this);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.x0
    /* renamed from: getMethod */
    public java.lang.String mo120510x24dcf3d7() {
        return this.f302092d;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.x0
    /* renamed from: getRequestHeaders */
    public java.util.Map mo120511xaf5cb2ed() {
        return this.f302093e;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.x0
    /* renamed from: getUrl */
    public android.net.Uri mo120512xb5887639() {
        return this.f302089a;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.x0
    /* renamed from: hasGesture */
    public boolean mo120513x74aa214f() {
        return this.f302091c;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.x0
    /* renamed from: isForMainFrame */
    public boolean mo120514xa25f36b5() {
        return this.f302090b;
    }
}
