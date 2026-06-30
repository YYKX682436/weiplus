package cx4;

/* loaded from: classes5.dex */
public final class f implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cx4.m f306125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f306127c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f306128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306129e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f306130f;

    public f(cx4.m mVar, java.lang.String str, int i17, int i18, java.lang.String str2, int i19) {
        this.f306125a = mVar;
        this.f306126b = str;
        this.f306127c = i17;
        this.f306128d = i18;
        this.f306129e = str2;
        this.f306130f = i19;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        ((ku5.t0) ku5.t0.f394148d).h(new cx4.e(this.f306125a, this.f306126b, this.f306127c, this.f306128d, this.f306129e, str, this.f306130f), "WebViewKeyWordAuditReport");
    }
}
