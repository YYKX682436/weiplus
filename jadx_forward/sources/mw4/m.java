package mw4;

/* loaded from: classes5.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413310e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413311f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413312g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mw4.n f413313h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, mw4.n nVar) {
        super(4);
        this.f413309d = str;
        this.f413310e = str2;
        this.f413311f = str3;
        this.f413312g = str4;
        this.f413313h = nVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        com.p314xaae8f345.p3210x3857dc.y0 y0Var;
        android.net.Uri mo120512xb5887639;
        java.lang.String scheme;
        yz5.q qVar = (yz5.q) obj;
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 webview = (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9) obj2;
        com.p314xaae8f345.p3210x3857dc.x0 request = (com.p314xaae8f345.p3210x3857dc.x0) obj3;
        java.util.Map lowercaseHeaders = (java.util.Map) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webview, "webview");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lowercaseHeaders, "lowercaseHeaders");
        java.util.Objects.toString(request.mo120512xb5887639());
        java.lang.String str = this.f413309d;
        if (str != null && ((mo120512xb5887639 = request.mo120512xb5887639()) == null || (scheme = mo120512xb5887639.getScheme()) == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(scheme, str))) {
            return null;
        }
        java.lang.String str2 = this.f413310e;
        if (str2 == null) {
            str2 = "weixin.local";
        }
        android.net.Uri mo120512xb58876392 = request.mo120512xb5887639();
        java.lang.String host = mo120512xb58876392 != null ? mo120512xb58876392.getHost() : null;
        android.net.Uri mo120512xb58876393 = request.mo120512xb5887639();
        java.lang.String path = mo120512xb58876393 != null ? mo120512xb58876393.getPath() : null;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(host, str2)) {
            return null;
        }
        java.lang.String mo120510x24dcf3d7 = request.mo120510x24dcf3d7();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo120510x24dcf3d7, "OPTIONS") && this.f413310e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RestWebInterceptor", "[sessionAuth] OPTIONS request, trusted origin: " + this.f413311f);
            y0Var = new com.p314xaae8f345.p3210x3857dc.y0("text/plain", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6, 204, "No Content", kz5.c1.k(new jz5.l("Access-Control-Allow-Origin", this.f413311f), new jz5.l("Access-Control-Allow-Methods", "POST, GET, OPTIONS"), new jz5.l("Access-Control-Allow-Headers", "*"), new jz5.l("Access-Control-Allow-Credentials", "true"), new jz5.l("Access-Control-Max-Age", "300")), new java.io.ByteArrayInputStream(new byte[0]));
        } else {
            if (!kz5.n0.O(this.f413313h.f413317d, path)) {
                return null;
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo120510x24dcf3d7, "POST")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RestWebInterceptor", "[sessionAuth] only POST method is allowed");
                return null;
            }
            java.lang.String lowerCase = "Session-ID".toLowerCase(java.util.Locale.ROOT);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
            java.lang.String str3 = (java.lang.String) lowercaseHeaders.get(lowerCase);
            if ((!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, this.f413312g)) || this.f413313h.f413318e.f413319a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RestWebInterceptor", "[sessionAuth] Blocking future intercepts due to wrong sessionId. host=" + host + ", path=" + path + ", sessionId=" + str3);
                this.f413313h.f413318e.f413319a = true;
                return null;
            }
            java.util.Map l17 = kz5.c1.l(new jz5.l("Access-Control-Allow-Origin", this.f413311f), new jz5.l("Access-Control-Allow-Credentials", "true"));
            if (qVar == null || (y0Var = (com.p314xaae8f345.p3210x3857dc.y0) qVar.mo147xb9724478(webview, request, lowercaseHeaders)) == null) {
                return null;
            }
            java.util.Map map = y0Var.f302158e;
            if (map != null) {
                l17.putAll(map);
            }
            y0Var.f302158e = l17;
        }
        return y0Var;
    }
}
