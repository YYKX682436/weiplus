package l36;

/* loaded from: classes16.dex */
public class q0 implements java.lang.Cloneable, l36.m {
    public static final java.util.List I = m36.e.m(l36.r0.HTTP_2, l36.r0.HTTP_1_1);

    /* renamed from: J, reason: collision with root package name */
    public static final java.util.List f397119J = m36.e.m(l36.v.f397191e, l36.v.f397192f);
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;

    /* renamed from: d, reason: collision with root package name */
    public final l36.z f397120d;

    /* renamed from: e, reason: collision with root package name */
    public final java.net.Proxy f397121e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f397122f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f397123g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f397124h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f397125i;

    /* renamed from: m, reason: collision with root package name */
    public final l36.e0 f397126m;

    /* renamed from: n, reason: collision with root package name */
    public final java.net.ProxySelector f397127n;

    /* renamed from: o, reason: collision with root package name */
    public final l36.y f397128o;

    /* renamed from: p, reason: collision with root package name */
    public final l36.j f397129p;

    /* renamed from: q, reason: collision with root package name */
    public final n36.m f397130q;

    /* renamed from: r, reason: collision with root package name */
    public final javax.net.SocketFactory f397131r;

    /* renamed from: s, reason: collision with root package name */
    public final javax.net.ssl.SSLSocketFactory f397132s;

    /* renamed from: t, reason: collision with root package name */
    public final v36.c f397133t;

    /* renamed from: u, reason: collision with root package name */
    public final javax.net.ssl.HostnameVerifier f397134u;

    /* renamed from: v, reason: collision with root package name */
    public final l36.p f397135v;

    /* renamed from: w, reason: collision with root package name */
    public final l36.c f397136w;

    /* renamed from: x, reason: collision with root package name */
    public final l36.c f397137x;

    /* renamed from: y, reason: collision with root package name */
    public final l36.t f397138y;

    /* renamed from: z, reason: collision with root package name */
    public final l36.b0 f397139z;

    static {
        m36.a.f404915a = new l36.o0();
    }

    public q0(l36.p0 p0Var) {
        boolean z17;
        this.f397120d = p0Var.f397093a;
        this.f397121e = p0Var.f397094b;
        this.f397122f = p0Var.f397095c;
        java.util.List list = p0Var.f397096d;
        this.f397123g = list;
        this.f397124h = m36.e.l(p0Var.f397097e);
        this.f397125i = m36.e.l(p0Var.f397098f);
        this.f397126m = p0Var.f397099g;
        this.f397127n = p0Var.f397100h;
        this.f397128o = p0Var.f397101i;
        this.f397129p = p0Var.f397102j;
        this.f397130q = p0Var.f397103k;
        this.f397131r = p0Var.f397104l;
        java.util.Iterator it = list.iterator();
        loop0: while (true) {
            z17 = false;
            while (it.hasNext()) {
                z17 = (z17 || ((l36.v) it.next()).f397193a) ? true : z17;
            }
        }
        javax.net.ssl.SSLSocketFactory sSLSocketFactory = p0Var.f397105m;
        if (sSLSocketFactory == null && z17) {
            try {
                javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((java.security.KeyStore) null);
                javax.net.ssl.TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1) {
                    javax.net.ssl.TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof javax.net.ssl.X509TrustManager) {
                        javax.net.ssl.X509TrustManager x509TrustManager = (javax.net.ssl.X509TrustManager) trustManager;
                        try {
                            t36.k kVar = t36.k.f496994a;
                            javax.net.ssl.SSLContext h17 = kVar.h();
                            h17.init(null, new javax.net.ssl.TrustManager[]{x509TrustManager}, null);
                            this.f397132s = h17.getSocketFactory();
                            this.f397133t = kVar.c(x509TrustManager);
                        } catch (java.security.GeneralSecurityException e17) {
                            throw m36.e.a("No System TLS", e17);
                        }
                    }
                }
                throw new java.lang.IllegalStateException("Unexpected default trust managers:" + java.util.Arrays.toString(trustManagers));
            } catch (java.security.GeneralSecurityException e18) {
                throw m36.e.a("No System TLS", e18);
            }
        }
        this.f397132s = sSLSocketFactory;
        this.f397133t = p0Var.f397106n;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory2 = this.f397132s;
        if (sSLSocketFactory2 != null) {
            t36.k.f496994a.e(sSLSocketFactory2);
        }
        this.f397134u = p0Var.f397107o;
        v36.c cVar = this.f397133t;
        l36.p pVar = p0Var.f397108p;
        this.f397135v = m36.e.i(pVar.f397092b, cVar) ? pVar : new l36.p(pVar.f397091a, cVar);
        this.f397136w = p0Var.f397109q;
        this.f397137x = p0Var.f397110r;
        this.f397138y = p0Var.f397111s;
        this.f397139z = p0Var.f397112t;
        this.A = p0Var.f397113u;
        this.B = p0Var.f397114v;
        this.C = p0Var.f397115w;
        this.D = p0Var.f397116x;
        this.E = p0Var.f397117y;
        this.F = p0Var.f397118z;
        this.G = p0Var.A;
        this.H = p0Var.B;
        if (this.f397124h.contains(null)) {
            throw new java.lang.IllegalStateException("Null interceptor: " + this.f397124h);
        }
        if (this.f397125i.contains(null)) {
            throw new java.lang.IllegalStateException("Null network interceptor: " + this.f397125i);
        }
    }

    @Override // l36.m
    public l36.n a(l36.w0 w0Var) {
        l36.u0 u0Var = new l36.u0(this, w0Var, false);
        u0Var.f397187g = ((l36.d0) this.f397126m).f397007a;
        return u0Var;
    }
}
