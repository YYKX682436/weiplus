package l36;

/* loaded from: classes16.dex */
public final class p0 {
    public final int A;
    public int B;

    /* renamed from: a, reason: collision with root package name */
    public final l36.z f397093a;

    /* renamed from: b, reason: collision with root package name */
    public final java.net.Proxy f397094b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f397095c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f397096d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f397097e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f397098f;

    /* renamed from: g, reason: collision with root package name */
    public l36.e0 f397099g;

    /* renamed from: h, reason: collision with root package name */
    public final java.net.ProxySelector f397100h;

    /* renamed from: i, reason: collision with root package name */
    public final l36.y f397101i;

    /* renamed from: j, reason: collision with root package name */
    public l36.j f397102j;

    /* renamed from: k, reason: collision with root package name */
    public n36.m f397103k;

    /* renamed from: l, reason: collision with root package name */
    public final javax.net.SocketFactory f397104l;

    /* renamed from: m, reason: collision with root package name */
    public final javax.net.ssl.SSLSocketFactory f397105m;

    /* renamed from: n, reason: collision with root package name */
    public final v36.c f397106n;

    /* renamed from: o, reason: collision with root package name */
    public final javax.net.ssl.HostnameVerifier f397107o;

    /* renamed from: p, reason: collision with root package name */
    public final l36.p f397108p;

    /* renamed from: q, reason: collision with root package name */
    public final l36.c f397109q;

    /* renamed from: r, reason: collision with root package name */
    public final l36.c f397110r;

    /* renamed from: s, reason: collision with root package name */
    public final l36.t f397111s;

    /* renamed from: t, reason: collision with root package name */
    public final l36.b0 f397112t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f397113u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f397114v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f397115w;

    /* renamed from: x, reason: collision with root package name */
    public final int f397116x;

    /* renamed from: y, reason: collision with root package name */
    public final int f397117y;

    /* renamed from: z, reason: collision with root package name */
    public final int f397118z;

    public p0() {
        this.f397097e = new java.util.ArrayList();
        this.f397098f = new java.util.ArrayList();
        this.f397093a = new l36.z();
        this.f397095c = l36.q0.I;
        this.f397096d = l36.q0.f397119J;
        this.f397099g = new l36.d0(l36.f0.f397025a);
        java.net.ProxySelector proxySelector = java.net.ProxySelector.getDefault();
        this.f397100h = proxySelector;
        if (proxySelector == null) {
            this.f397100h = new u36.a();
        }
        this.f397101i = l36.y.f397219a;
        this.f397104l = javax.net.SocketFactory.getDefault();
        this.f397107o = v36.d.f514708a;
        this.f397108p = l36.p.f397090c;
        l36.c cVar = l36.c.f397005a;
        this.f397109q = cVar;
        this.f397110r = cVar;
        this.f397111s = new l36.t();
        this.f397112t = l36.b0.f397001a;
        this.f397113u = true;
        this.f397114v = true;
        this.f397115w = true;
        this.f397116x = 0;
        this.f397117y = 10000;
        this.f397118z = 10000;
        this.A = 10000;
        this.B = 0;
    }

    public p0(l36.q0 q0Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f397097e = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f397098f = arrayList2;
        this.f397093a = q0Var.f397120d;
        this.f397094b = q0Var.f397121e;
        this.f397095c = q0Var.f397122f;
        this.f397096d = q0Var.f397123g;
        arrayList.addAll(q0Var.f397124h);
        arrayList2.addAll(q0Var.f397125i);
        this.f397099g = q0Var.f397126m;
        this.f397100h = q0Var.f397127n;
        this.f397101i = q0Var.f397128o;
        this.f397103k = q0Var.f397130q;
        this.f397102j = q0Var.f397129p;
        this.f397104l = q0Var.f397131r;
        this.f397105m = q0Var.f397132s;
        this.f397106n = q0Var.f397133t;
        this.f397107o = q0Var.f397134u;
        this.f397108p = q0Var.f397135v;
        this.f397109q = q0Var.f397136w;
        this.f397110r = q0Var.f397137x;
        this.f397111s = q0Var.f397138y;
        this.f397112t = q0Var.f397139z;
        this.f397113u = q0Var.A;
        this.f397114v = q0Var.B;
        this.f397115w = q0Var.C;
        this.f397116x = q0Var.D;
        this.f397117y = q0Var.E;
        this.f397118z = q0Var.F;
        this.A = q0Var.G;
        this.B = q0Var.H;
    }
}
