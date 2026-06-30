package o36;

/* loaded from: classes16.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final l36.a f424311a;

    /* renamed from: b, reason: collision with root package name */
    public final o36.e f424312b;

    /* renamed from: c, reason: collision with root package name */
    public final l36.f0 f424313c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f424314d;

    /* renamed from: e, reason: collision with root package name */
    public int f424315e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f424316f = java.util.Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f424317g = new java.util.ArrayList();

    public h(l36.a aVar, o36.e eVar, l36.n nVar, l36.f0 f0Var) {
        this.f424314d = java.util.Collections.emptyList();
        this.f424311a = aVar;
        this.f424312b = eVar;
        this.f424313c = f0Var;
        l36.k0 k0Var = aVar.f396977a;
        java.net.Proxy proxy = aVar.f396984h;
        if (proxy != null) {
            this.f424314d = java.util.Collections.singletonList(proxy);
        } else {
            java.util.List<java.net.Proxy> select = aVar.f396983g.select(k0Var.o());
            this.f424314d = (select == null || select.isEmpty()) ? m36.e.m(java.net.Proxy.NO_PROXY) : m36.e.l(select);
        }
        this.f424315e = 0;
    }

    public void a(l36.d1 d1Var, java.io.IOException iOException) {
        l36.a aVar;
        java.net.ProxySelector proxySelector;
        if (d1Var.f397009b.type() != java.net.Proxy.Type.DIRECT && (proxySelector = (aVar = this.f424311a).f396983g) != null) {
            proxySelector.connectFailed(aVar.f396977a.o(), d1Var.f397009b.address(), iOException);
        }
        o36.e eVar = this.f424312b;
        synchronized (eVar) {
            eVar.f424306a.add(d1Var);
        }
    }
}
