package com.tencent.mm.plugin.appbrand.jsapi.bizvideochannel;

/* loaded from: classes7.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80033f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f80034g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80035h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f80036i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f80037m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f80038n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f80039o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f80040p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f80041q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f80042r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80043s;

    public c(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, java.lang.String str2, double d17, java.lang.String str3, boolean z17, boolean z18, int i17, boolean z19, int i18, boolean z27, boolean z28, java.lang.String str4) {
        this.f80031d = lVar;
        this.f80032e = str;
        this.f80033f = str2;
        this.f80034g = d17;
        this.f80035h = str3;
        this.f80036i = z17;
        this.f80037m = z18;
        this.f80038n = i17;
        this.f80039o = z19;
        this.f80040p = i18;
        this.f80041q = z27;
        this.f80042r = z28;
        this.f80043s = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context f147807d;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f80031d;
        if (lVar == null || (f147807d = lVar.getF147807d()) == null) {
            return;
        }
        java.lang.String str = this.f80035h;
        boolean z17 = this.f80036i;
        boolean z18 = this.f80037m;
        int i17 = this.f80038n;
        boolean z19 = this.f80039o;
        int i18 = this.f80040p;
        boolean z27 = this.f80041q;
        boolean z28 = this.f80042r;
        java.lang.String str2 = this.f80043s;
        boolean equals = this.f80032e.equals("portrait");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenWebViewUseFastLoad", "createHalfScreenWebView");
        i95.m c17 = i95.n0.c(zg0.u2.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String str3 = this.f80033f;
        kotlin.jvm.internal.o.d(str3);
        ((com.tencent.mm.plugin.webview.ui.tools.widget.m1) zg0.u2.K2((zg0.u2) c17, f147807d, str3, null, new com.tencent.mm.plugin.webview.ui.tools.widget.n1((float) this.f80034g, 0.0f, str, z17, z18, i17, false, z19, i18, false, false, 0, false, z27, z28, str2, equals, 0, false, 0, false, false, false, 8265282, null), 4, null)).show();
    }
}
