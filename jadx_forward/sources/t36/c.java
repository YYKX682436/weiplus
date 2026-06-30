package t36;

/* loaded from: classes13.dex */
public final class c implements v36.e {

    /* renamed from: a, reason: collision with root package name */
    public final javax.net.ssl.X509TrustManager f496971a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f496972b;

    public c(javax.net.ssl.X509TrustManager x509TrustManager, java.lang.reflect.Method method) {
        this.f496972b = method;
        this.f496971a = x509TrustManager;
    }

    @Override // v36.e
    public java.security.cert.X509Certificate a(java.security.cert.X509Certificate x509Certificate) {
        try {
            java.security.cert.TrustAnchor trustAnchor = (java.security.cert.TrustAnchor) this.f496972b.invoke(this.f496971a, x509Certificate);
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
            return null;
        } catch (java.lang.IllegalAccessException e17) {
            throw m36.e.a("unable to get issues and signature", e17);
        } catch (java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: equals */
    public boolean m165850xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t36.c)) {
            return false;
        }
        t36.c cVar = (t36.c) obj;
        return this.f496971a.equals(cVar.f496971a) && this.f496972b.equals(cVar.f496972b);
    }

    /* renamed from: hashCode */
    public int m165851x8cdac1b() {
        return this.f496971a.hashCode() + (this.f496972b.hashCode() * 31);
    }
}
