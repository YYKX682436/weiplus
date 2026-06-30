package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class q4 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x6 {

    /* renamed from: t, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.h4 f166590t = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.h4(null);

    /* renamed from: u, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f f166591u = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f(0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 f166592b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a7 f166593c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.y50 f166594d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k6 f166595e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f166596f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f166597g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.p f166598h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f166599i;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.a6 f166600j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f166601k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f166602l;

    /* renamed from: m, reason: collision with root package name */
    public int f166603m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f166604n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f166605o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f166606p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f f166607q;

    /* renamed from: r, reason: collision with root package name */
    public long f166608r;

    /* renamed from: s, reason: collision with root package name */
    public long f166609s;

    public q4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 request, yz5.l onSuccess, yz5.p onError, yz5.l onProgress, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a7 cgiExecutor, r45.y50 cgiCommRequestSource, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k6 k6Var, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSuccess, "onSuccess");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onError, "onError");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onProgress, "onProgress");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiExecutor, "cgiExecutor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiCommRequestSource, "cgiCommRequestSource");
        this.f166592b = request;
        this.f166593c = cgiExecutor;
        this.f166594d = cgiCommRequestSource;
        this.f166595e = k6Var;
        this.f166596f = str;
        this.f166597g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l4(this, onSuccess);
        this.f166598h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j4(this, onError);
        this.f166599i = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k4(onProgress, this);
        this.f166600j = request.h();
        this.f166601k = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.m4(this));
        this.f166602l = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f166603m = -1;
        this.f166604n = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f166605o = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b4 a() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b4) ((jz5.n) this.f166601k).mo141623x754a37bb();
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
    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.s r17) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4.b(com.tencent.mm.plugin.appbrand.appcache.s):void");
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4.c():void");
    }
}
