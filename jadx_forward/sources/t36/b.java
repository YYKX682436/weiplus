package t36;

/* loaded from: classes13.dex */
public final class b extends v36.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f496969a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.reflect.Method f496970b;

    public b(java.lang.Object obj, java.lang.reflect.Method method) {
        this.f496969a = obj;
        this.f496970b = method;
    }

    @Override // v36.c
    public java.util.List a(java.util.List list, java.lang.String str) {
        try {
            return (java.util.List) this.f496970b.invoke(this.f496969a, (java.security.cert.X509Certificate[]) list.toArray(new java.security.cert.X509Certificate[list.size()]), "RSA", str);
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.AssertionError(e17);
        } catch (java.lang.reflect.InvocationTargetException e18) {
            javax.net.ssl.SSLPeerUnverifiedException sSLPeerUnverifiedException = new javax.net.ssl.SSLPeerUnverifiedException(e18.getMessage());
            sSLPeerUnverifiedException.initCause(e18);
            throw sSLPeerUnverifiedException;
        }
    }

    /* renamed from: equals */
    public boolean m165848xb2c87fbf(java.lang.Object obj) {
        return obj instanceof t36.b;
    }

    /* renamed from: hashCode */
    public int m165849x8cdac1b() {
        return 0;
    }
}
