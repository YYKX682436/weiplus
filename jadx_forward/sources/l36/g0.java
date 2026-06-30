package l36;

/* loaded from: classes16.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final l36.e1 f397027a;

    /* renamed from: b, reason: collision with root package name */
    public final l36.r f397028b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f397029c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f397030d;

    public g0(l36.e1 e1Var, l36.r rVar, java.util.List list, java.util.List list2) {
        this.f397027a = e1Var;
        this.f397028b = rVar;
        this.f397029c = list;
        this.f397030d = list2;
    }

    public static l36.g0 a(javax.net.ssl.SSLSession sSLSession) {
        java.security.cert.Certificate[] certificateArr;
        java.lang.String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new java.lang.IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new java.io.IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        l36.r a17 = l36.r.a(cipherSuite);
        java.lang.String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new java.lang.IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new java.io.IOException("tlsVersion == NONE");
        }
        l36.e1 a18 = l36.e1.a(protocol);
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
            certificateArr = null;
        }
        java.util.List m17 = certificateArr != null ? m36.e.m(certificateArr) : java.util.Collections.emptyList();
        java.security.cert.Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new l36.g0(a18, a17, m17, localCertificates != null ? m36.e.m(localCertificates) : java.util.Collections.emptyList());
    }

    /* renamed from: equals */
    public boolean m145020xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof l36.g0)) {
            return false;
        }
        l36.g0 g0Var = (l36.g0) obj;
        return this.f397027a.equals(g0Var.f397027a) && this.f397028b.equals(g0Var.f397028b) && this.f397029c.equals(g0Var.f397029c) && this.f397030d.equals(g0Var.f397030d);
    }

    /* renamed from: hashCode */
    public int m145021x8cdac1b() {
        return ((((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de + this.f397027a.hashCode()) * 31) + this.f397028b.hashCode()) * 31) + this.f397029c.hashCode()) * 31) + this.f397030d.hashCode();
    }
}
