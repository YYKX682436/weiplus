package mw4;

/* loaded from: classes5.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.r f413308e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, yz5.r rVar) {
        super(3);
        this.f413307d = str;
        this.f413308e = rVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 webview = (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9) obj;
        com.p314xaae8f345.p3210x3857dc.x0 request = (com.p314xaae8f345.p3210x3857dc.x0) obj2;
        java.util.Map lowercaseHeaders = (java.util.Map) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webview, "webview");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lowercaseHeaders, "lowercaseHeaders");
        android.net.Uri mo120512xb5887639 = request.mo120512xb5887639();
        java.lang.String path = mo120512xb5887639 != null ? mo120512xb5887639.getPath() : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(path, this.f413307d)) {
            return (com.p314xaae8f345.p3210x3857dc.y0) this.f413308e.C(path, lowercaseHeaders, webview, request);
        }
        return null;
    }
}
