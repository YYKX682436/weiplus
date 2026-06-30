package uw4;

/* loaded from: classes8.dex */
public class z implements android.webkit.WebResourceRequest {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f513292a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f513293b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f513294c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f513295d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f513296e;

    public z(android.net.Uri uri, boolean z17, boolean z18, boolean z19, java.lang.String str, java.util.Map map) {
        this.f513292a = uri;
        this.f513293b = z17;
        this.f513294c = z19;
        this.f513295d = str;
        this.f513296e = map;
    }

    @Override // android.webkit.WebResourceRequest
    public java.lang.String getMethod() {
        return this.f513295d;
    }

    @Override // android.webkit.WebResourceRequest
    public java.util.Map getRequestHeaders() {
        return this.f513296e;
    }

    @Override // android.webkit.WebResourceRequest
    public android.net.Uri getUrl() {
        return this.f513292a;
    }

    @Override // android.webkit.WebResourceRequest
    public boolean hasGesture() {
        return this.f513294c;
    }

    @Override // android.webkit.WebResourceRequest
    public boolean isForMainFrame() {
        return this.f513293b;
    }

    @Override // android.webkit.WebResourceRequest
    public boolean isRedirect() {
        return false;
    }
}
