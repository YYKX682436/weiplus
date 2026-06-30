package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class m6 {

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.Map f85706t = new x.b();

    /* renamed from: u, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.m6 f85707u = new com.tencent.mm.plugin.appbrand.m6();

    /* renamed from: a, reason: collision with root package name */
    public volatile java.lang.String f85708a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f85709b = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    public mi1.w0 f85710c;

    /* renamed from: d, reason: collision with root package name */
    public volatile java.lang.String f85711d;

    /* renamed from: e, reason: collision with root package name */
    public volatile java.lang.String f85712e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f85713f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f85714g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f85715h;

    /* renamed from: i, reason: collision with root package name */
    public volatile java.lang.String f85716i;

    /* renamed from: j, reason: collision with root package name */
    public volatile int f85717j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f85718k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f85719l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f85720m;

    /* renamed from: n, reason: collision with root package name */
    public volatile long f85721n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f85722o;

    /* renamed from: p, reason: collision with root package name */
    public volatile int f85723p;

    /* renamed from: q, reason: collision with root package name */
    public volatile int f85724q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f85725r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f85726s;

    public m6() {
        new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f85710c = null;
        this.f85718k = false;
        this.f85719l = false;
        this.f85720m = false;
        this.f85722o = false;
        this.f85723p = -1;
        this.f85724q = 0;
        this.f85725r = false;
        this.f85726s = false;
    }

    public static com.tencent.mm.plugin.appbrand.m6 a(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.m6 m6Var;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.lang.Object obj = f85706t;
        synchronized (obj) {
            m6Var = (com.tencent.mm.plugin.appbrand.m6) ((x.n) obj).getOrDefault(str, null);
            if (m6Var == null) {
                m6Var = new com.tencent.mm.plugin.appbrand.m6();
                ((x.n) obj).put(str, m6Var);
            }
        }
        return m6Var;
    }

    public static com.tencent.mm.plugin.appbrand.m6 b(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.m6 m6Var;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            m6Var = null;
        } else {
            java.lang.Object obj = f85706t;
            synchronized (obj) {
                m6Var = (com.tencent.mm.plugin.appbrand.m6) ((x.n) obj).get(str);
            }
        }
        return m6Var == null ? f85707u : m6Var;
    }

    public static void c(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.lang.Object obj = f85706t;
        synchronized (obj) {
            ((x.n) obj).remove(str);
        }
    }
}
