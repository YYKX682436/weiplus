package al1;

/* loaded from: classes7.dex */
public final class u extends al1.q {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f5813i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f5814m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f5815n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.content.Context context, java.util.Map params, yz5.l onViewCreated) {
        super(context);
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(onViewCreated, "onViewCreated");
        android.view.View.inflate(context, com.tencent.mm.R.layout.dm9, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.fg9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        setIcon((android.widget.ImageView) findViewById);
        setMOnViewCreated(onViewCreated);
        this.f5813i = java.lang.String.valueOf(params.get("key_appid"));
        this.f5814m = java.lang.String.valueOf(params.get("key_page_path"));
        this.f5815n = java.lang.String.valueOf(params.get("key_session_buffer"));
        a(java.lang.String.valueOf(params.get("key_img_url")), false);
        a(java.lang.String.valueOf(params.get("key_img_url_dark")), true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.tencent.mm.plugin.appbrand.report.j2 j2Var = (com.tencent.mm.plugin.appbrand.report.j2) i95.n0.c(com.tencent.mm.plugin.appbrand.report.j2.class);
        java.lang.String str = this.f5813i;
        if (str == null) {
            kotlin.jvm.internal.o.o("appId");
            throw null;
        }
        java.lang.String str2 = this.f5814m;
        if (str2 == null) {
            kotlin.jvm.internal.o.o("pagePath");
            throw null;
        }
        java.lang.String str3 = this.f5815n;
        if (str3 == null) {
            kotlin.jvm.internal.o.o("sessionBuffer");
            throw null;
        }
        ((com.tencent.mm.plugin.appbrand.trade.a) j2Var).getClass();
        com.tencent.mm.plugin.appbrand.report.v0.f(str, str2, str3, 1, 1);
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.appbrand.report.j2 j2Var = (com.tencent.mm.plugin.appbrand.report.j2) i95.n0.c(com.tencent.mm.plugin.appbrand.report.j2.class);
        java.lang.String str = this.f5813i;
        if (str == null) {
            kotlin.jvm.internal.o.o("appId");
            throw null;
        }
        java.lang.String str2 = this.f5814m;
        if (str2 == null) {
            kotlin.jvm.internal.o.o("pagePath");
            throw null;
        }
        java.lang.String str3 = this.f5815n;
        if (str3 == null) {
            kotlin.jvm.internal.o.o("sessionBuffer");
            throw null;
        }
        ((com.tencent.mm.plugin.appbrand.trade.a) j2Var).getClass();
        com.tencent.mm.plugin.appbrand.report.v0.f(str, str2, str3, 2, 1);
        return super.onTouchEvent(motionEvent);
    }
}
