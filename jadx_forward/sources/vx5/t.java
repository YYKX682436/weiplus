package vx5;

/* loaded from: classes13.dex */
public class t implements com.p314xaae8f345.p3210x3857dc.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f522922a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f522923b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f522924c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f522925d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f522926e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p3210x3857dc.v0 f522927f;

    public t(android.webkit.WebResourceRequest webResourceRequest) {
        this.f522922a = webResourceRequest.getUrl();
        this.f522923b = webResourceRequest.isForMainFrame();
        this.f522924c = webResourceRequest.hasGesture();
        this.f522925d = webResourceRequest.getMethod();
        webResourceRequest.isRedirect();
        this.f522926e = webResourceRequest.getRequestHeaders();
        this.f522927f = new com.p314xaae8f345.p3210x3857dc.v0(this);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.x0
    /* renamed from: getMethod */
    public java.lang.String mo120510x24dcf3d7() {
        return this.f522925d;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.x0
    /* renamed from: getRequestHeaders */
    public java.util.Map mo120511xaf5cb2ed() {
        return this.f522926e;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.x0
    /* renamed from: getUrl */
    public android.net.Uri mo120512xb5887639() {
        return this.f522922a;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.x0
    /* renamed from: hasGesture */
    public boolean mo120513x74aa214f() {
        return this.f522924c;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.x0
    /* renamed from: isForMainFrame */
    public boolean mo120514xa25f36b5() {
        return this.f522923b;
    }
}
