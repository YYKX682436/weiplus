package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class m6 {

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.Map f167239t = new x.b();

    /* renamed from: u, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6 f167240u = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6();

    /* renamed from: a, reason: collision with root package name */
    public volatile java.lang.String f167241a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f167242b = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    public mi1.w0 f167243c;

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.String f167244d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.String f167245e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f167246f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f167247g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f167248h;

    /* renamed from: i, reason: collision with root package name */
    public volatile java.lang.String f167249i;

    /* renamed from: j, reason: collision with root package name */
    public volatile int f167250j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f167251k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f167252l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f167253m;

    /* renamed from: n, reason: collision with root package name */
    public volatile long f167254n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f167255o;

    /* renamed from: p, reason: collision with root package name */
    public volatile int f167256p;

    /* renamed from: q, reason: collision with root package name */
    public volatile int f167257q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f167258r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f167259s;

    public m6() {
        new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f167243c = null;
        this.f167251k = false;
        this.f167252l = false;
        this.f167253m = false;
        this.f167255o = false;
        this.f167256p = -1;
        this.f167257q = 0;
        this.f167258r = false;
        this.f167259s = false;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6 a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6 m6Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        java.lang.Object obj = f167239t;
        synchronized (obj) {
            m6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6) ((x.n) obj).m174751x4aabfc28(str, null);
            if (m6Var == null) {
                m6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6();
                ((x.n) obj).put(str, m6Var);
            }
        }
        return m6Var;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6 b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6 m6Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            m6Var = null;
        } else {
            java.lang.Object obj = f167239t;
            synchronized (obj) {
                m6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6) ((x.n) obj).get(str);
            }
        }
        return m6Var == null ? f167240u : m6Var;
    }

    public static void c(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.lang.Object obj = f167239t;
        synchronized (obj) {
            ((x.n) obj).m174754xc84af884(str);
        }
    }
}
