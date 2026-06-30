package l36;

/* loaded from: classes16.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final l36.a f397008a;

    /* renamed from: b, reason: collision with root package name */
    public final java.net.Proxy f397009b;

    /* renamed from: c, reason: collision with root package name */
    public final java.net.InetSocketAddress f397010c;

    public d1(l36.a aVar, java.net.Proxy proxy, java.net.InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new java.lang.NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new java.lang.NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new java.lang.NullPointerException("inetSocketAddress == null");
        }
        this.f397008a = aVar;
        this.f397009b = proxy;
        this.f397010c = inetSocketAddress;
    }

    /* renamed from: equals */
    public boolean m145013xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof l36.d1) {
            l36.d1 d1Var = (l36.d1) obj;
            if (d1Var.f397008a.m145007xb2c87fbf(this.f397008a) && d1Var.f397009b.equals(this.f397009b) && d1Var.f397010c.equals(this.f397010c)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m145014x8cdac1b() {
        return ((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de + this.f397008a.m145008x8cdac1b()) * 31) + this.f397009b.hashCode()) * 31) + this.f397010c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m145015x9616526c() {
        return "Route{" + this.f397010c + "}";
    }
}
