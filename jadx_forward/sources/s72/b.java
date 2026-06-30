package s72;

/* loaded from: classes11.dex */
public final class b extends java.lang.Exception {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f485522d;

    /* renamed from: e, reason: collision with root package name */
    public final int f485523e;

    /* renamed from: f, reason: collision with root package name */
    public final int f485524f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f485525g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String uri, int i17, int i18, java.lang.String str) {
        super("NetSceneFavSync[" + r26.n0.p0(uri, "/", "") + "] returns error: errorType=" + i17 + ", errorCode=" + i18 + ", errorMsg=" + str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uri, "uri");
        this.f485522d = uri;
        this.f485523e = i17;
        this.f485524f = i18;
        this.f485525g = str;
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return "uri:" + this.f485522d + ", errorType: " + this.f485523e + " errorCode: " + this.f485524f + " msg: " + this.f485525g;
    }
}
