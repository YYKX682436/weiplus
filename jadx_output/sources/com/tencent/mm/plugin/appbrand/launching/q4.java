package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class q4 implements com.tencent.mm.plugin.appbrand.launching.x6 {

    /* renamed from: t, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.h4 f85057t = new com.tencent.mm.plugin.appbrand.launching.h4(null);

    /* renamed from: u, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress f85058u = new com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress(0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launching.o6 f85059b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launching.a7 f85060c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.y50 f85061d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launching.k6 f85062e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f85063f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f85064g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.p f85065h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f85066i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appcache.a6 f85067j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f85068k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f85069l;

    /* renamed from: m, reason: collision with root package name */
    public int f85070m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f85071n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f85072o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f85073p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appcache.WxaPkgLoadProgress f85074q;

    /* renamed from: r, reason: collision with root package name */
    public long f85075r;

    /* renamed from: s, reason: collision with root package name */
    public long f85076s;

    public q4(com.tencent.mm.plugin.appbrand.launching.o6 request, yz5.l onSuccess, yz5.p onError, yz5.l onProgress, com.tencent.mm.plugin.appbrand.launching.a7 cgiExecutor, r45.y50 cgiCommRequestSource, com.tencent.mm.plugin.appbrand.launching.k6 k6Var, java.lang.String str) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(onSuccess, "onSuccess");
        kotlin.jvm.internal.o.g(onError, "onError");
        kotlin.jvm.internal.o.g(onProgress, "onProgress");
        kotlin.jvm.internal.o.g(cgiExecutor, "cgiExecutor");
        kotlin.jvm.internal.o.g(cgiCommRequestSource, "cgiCommRequestSource");
        this.f85059b = request;
        this.f85060c = cgiExecutor;
        this.f85061d = cgiCommRequestSource;
        this.f85062e = k6Var;
        this.f85063f = str;
        this.f85064g = new com.tencent.mm.plugin.appbrand.launching.l4(this, onSuccess);
        this.f85065h = new com.tencent.mm.plugin.appbrand.launching.j4(this, onError);
        this.f85066i = new com.tencent.mm.plugin.appbrand.launching.k4(onProgress, this);
        this.f85067j = request.h();
        this.f85068k = jz5.h.b(new com.tencent.mm.plugin.appbrand.launching.m4(this));
        this.f85069l = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f85070m = -1;
        this.f85071n = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f85072o = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final com.tencent.mm.plugin.appbrand.appcache.b4 a() {
        return (com.tencent.mm.plugin.appbrand.appcache.b4) ((jz5.n) this.f85068k).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0084, code lost:
    
        if ((r5 == null ? "" : r5).endsWith(".wxapkg") == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.tencent.mm.plugin.appbrand.appcache.s r17) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.q4.b(com.tencent.mm.plugin.appbrand.appcache.s):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021e  */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.tencent.mm.plugin.appbrand.launching.a7] */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.q4.c():void");
    }
}
