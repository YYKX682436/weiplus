package l36;

/* loaded from: classes16.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final l36.k0 f396977a;

    /* renamed from: b, reason: collision with root package name */
    public final l36.b0 f396978b;

    /* renamed from: c, reason: collision with root package name */
    public final javax.net.SocketFactory f396979c;

    /* renamed from: d, reason: collision with root package name */
    public final l36.c f396980d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f396981e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f396982f;

    /* renamed from: g, reason: collision with root package name */
    public final java.net.ProxySelector f396983g;

    /* renamed from: h, reason: collision with root package name */
    public final java.net.Proxy f396984h;

    /* renamed from: i, reason: collision with root package name */
    public final javax.net.ssl.SSLSocketFactory f396985i;

    /* renamed from: j, reason: collision with root package name */
    public final javax.net.ssl.HostnameVerifier f396986j;

    /* renamed from: k, reason: collision with root package name */
    public final l36.p f396987k;

    public a(java.lang.String str, int i17, l36.b0 b0Var, javax.net.SocketFactory socketFactory, javax.net.ssl.SSLSocketFactory sSLSocketFactory, javax.net.ssl.HostnameVerifier hostnameVerifier, l36.p pVar, l36.c cVar, java.net.Proxy proxy, java.util.List list, java.util.List list2, java.net.ProxySelector proxySelector) {
        l36.j0 j0Var = new l36.j0();
        java.lang.String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            j0Var.f397051a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new java.lang.IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            j0Var.f397051a = "https";
        }
        if (str == null) {
            throw new java.lang.NullPointerException("host == null");
        }
        java.lang.String b17 = m36.e.b(l36.k0.j(str, 0, str.length(), false));
        if (b17 == null) {
            throw new java.lang.IllegalArgumentException("unexpected host: ".concat(str));
        }
        j0Var.f397054d = b17;
        if (i17 <= 0 || i17 > 65535) {
            throw new java.lang.IllegalArgumentException("unexpected port: " + i17);
        }
        j0Var.f397055e = i17;
        this.f396977a = j0Var.a();
        if (b0Var == null) {
            throw new java.lang.NullPointerException("dns == null");
        }
        this.f396978b = b0Var;
        if (socketFactory == null) {
            throw new java.lang.NullPointerException("socketFactory == null");
        }
        this.f396979c = socketFactory;
        if (cVar == null) {
            throw new java.lang.NullPointerException("proxyAuthenticator == null");
        }
        this.f396980d = cVar;
        if (list == null) {
            throw new java.lang.NullPointerException("protocols == null");
        }
        this.f396981e = m36.e.l(list);
        if (list2 == null) {
            throw new java.lang.NullPointerException("connectionSpecs == null");
        }
        this.f396982f = m36.e.l(list2);
        if (proxySelector == null) {
            throw new java.lang.NullPointerException("proxySelector == null");
        }
        this.f396983g = proxySelector;
        this.f396984h = proxy;
        this.f396985i = sSLSocketFactory;
        this.f396986j = hostnameVerifier;
        this.f396987k = pVar;
    }

    public boolean a(l36.a aVar) {
        return this.f396978b.equals(aVar.f396978b) && this.f396980d.equals(aVar.f396980d) && this.f396981e.equals(aVar.f396981e) && this.f396982f.equals(aVar.f396982f) && this.f396983g.equals(aVar.f396983g) && m36.e.i(this.f396984h, aVar.f396984h) && m36.e.i(this.f396985i, aVar.f396985i) && m36.e.i(this.f396986j, aVar.f396986j) && m36.e.i(this.f396987k, aVar.f396987k) && this.f396977a.f397068e == aVar.f396977a.f397068e;
    }

    /* renamed from: equals */
    public boolean m145007xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof l36.a) {
            l36.a aVar = (l36.a) obj;
            if (this.f396977a.m145028xb2c87fbf(aVar.f396977a) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m145008x8cdac1b() {
        int m145029x8cdac1b = (((((((((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de + this.f396977a.m145029x8cdac1b()) * 31) + this.f396978b.hashCode()) * 31) + this.f396980d.hashCode()) * 31) + this.f396981e.hashCode()) * 31) + this.f396982f.hashCode()) * 31) + this.f396983g.hashCode()) * 31;
        java.net.Proxy proxy = this.f396984h;
        int hashCode = (m145029x8cdac1b + (proxy != null ? proxy.hashCode() : 0)) * 31;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory = this.f396985i;
        int hashCode2 = (hashCode + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        javax.net.ssl.HostnameVerifier hostnameVerifier = this.f396986j;
        int hashCode3 = (hashCode2 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        l36.p pVar = this.f396987k;
        return hashCode3 + (pVar != null ? pVar.m145039x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m145009x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Address{");
        l36.k0 k0Var = this.f396977a;
        sb6.append(k0Var.f397067d);
        sb6.append(":");
        sb6.append(k0Var.f397068e);
        java.net.Proxy proxy = this.f396984h;
        if (proxy != null) {
            sb6.append(", proxy=");
            sb6.append(proxy);
        } else {
            sb6.append(", proxySelector=");
            sb6.append(this.f396983g);
        }
        sb6.append("}");
        return sb6.toString();
    }
}
