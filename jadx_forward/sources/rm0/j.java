package rm0;

/* loaded from: classes11.dex */
public final class j extends java.lang.Exception {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f478956d;

    /* renamed from: e, reason: collision with root package name */
    public final int f478957e;

    /* renamed from: f, reason: collision with root package name */
    public final int f478958f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f478959g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.f f478960h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String uri, int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f resp) {
        super("CGI[" + r26.n0.p0(uri, "/", "") + "] returns error: errorType=" + i17 + ", errorCode=" + i18 + ", resMsg=" + str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        this.f478956d = uri;
        this.f478957e = i17;
        this.f478958f = i18;
        this.f478959g = str;
        this.f478960h = resp;
    }

    public final int a() {
        return this.f478958f;
    }

    public final int b() {
        return this.f478957e;
    }

    public final java.lang.String c() {
        return this.f478959g;
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return "uri:" + this.f478956d + ", errorType: " + this.f478957e + " errorCode: " + this.f478958f + " msg: " + this.f478959g;
    }
}
