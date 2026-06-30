package ch0;

/* loaded from: classes8.dex */
public final class z implements tg0.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final ch0.a0 f41261a;

    /* renamed from: b, reason: collision with root package name */
    public int f41262b;

    /* renamed from: c, reason: collision with root package name */
    public int f41263c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f41264d;

    /* renamed from: e, reason: collision with root package name */
    public int f41265e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f41266f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f41267g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f41268h;

    /* renamed from: i, reason: collision with root package name */
    public tg0.a2 f41269i;

    /* renamed from: j, reason: collision with root package name */
    public tg0.z1 f41270j;

    /* renamed from: k, reason: collision with root package name */
    public ch0.a f41271k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.LinkedList f41272l;

    /* renamed from: m, reason: collision with root package name */
    public ch0.h f41273m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f41274n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f41275o;

    public z(ch0.a0 sceneManager) {
        kotlin.jvm.internal.o.g(sceneManager, "sceneManager");
        this.f41261a = sceneManager;
        this.f41264d = "";
        this.f41272l = new java.util.LinkedList();
        this.f41274n = new java.util.LinkedHashMap();
        this.f41275o = true;
    }

    public final void a(ch0.a aVar) {
        if (aVar != null) {
            com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView = aVar.f41186b;
            baseWebSearchWebView.setOnTouchUp(null);
            qx4.d0 d0Var = aVar.f41187c;
            d0Var.f367401j = null;
            d0Var.p(null);
            if (baseWebSearchWebView.f211376y) {
                return;
            }
            baseWebSearchWebView.removeJavascriptInterface("webSearchJSApi");
            nw4.n nVar = d0Var.f367394c;
            if (nVar != null) {
                nVar.f340889c = null;
            }
            d0Var.f367401j = null;
            d0Var.f367402k = null;
            d0Var.f14326a = null;
            java.lang.Object webViewClient = baseWebSearchWebView.getWebViewClient();
            if (webViewClient instanceof zg0.q2) {
                ((com.tencent.mm.plugin.webview.core.e3) ((zg0.q2) webViewClient)).D0();
            }
            baseWebSearchWebView.destroy();
        }
    }

    public final java.util.Map b(int i17, tg0.c1 result) {
        kotlin.jvm.internal.o.g(result, "result");
        tg0.f2 f2Var = tg0.g2.f419073e;
        java.util.Map map = this.f41274n;
        if (i17 == 1) {
            map.put("isInFlutter", "1");
        } else {
            map.put("isInFlutter", "2");
        }
        map.put("preGetData", tg0.m1.c(result));
        java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(map);
        kotlin.jvm.internal.o.f(unmodifiableMap, "unmodifiableMap(...)");
        return unmodifiableMap;
    }

    public final ch0.a c() {
        ch0.a aVar = (ch0.a) this.f41272l.pollFirst();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get cached webview for activity: ");
        sb6.append(this.f41265e);
        sb6.append(", found: ");
        sb6.append(aVar != null);
        java.lang.String content = sb6.toString();
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
        return aVar;
    }
}
