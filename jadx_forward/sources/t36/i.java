package t36;

/* loaded from: classes13.dex */
public class i extends t36.k {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Method f496986c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Method f496987d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.reflect.Method f496988e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Class f496989f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Class f496990g;

    public i(java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3, java.lang.Class cls, java.lang.Class cls2) {
        this.f496986c = method;
        this.f496987d = method2;
        this.f496988e = method3;
        this.f496989f = cls;
        this.f496990g = cls2;
    }

    @Override // t36.k
    public void a(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            this.f496988e.invoke(null, sSLSocket);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e17) {
            throw m36.e.a("unable to remove alpn", e17);
        }
    }

    @Override // t36.k
    public void f(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        try {
            this.f496986c.invoke(null, sSLSocket, java.lang.reflect.Proxy.newProxyInstance(t36.k.class.getClassLoader(), new java.lang.Class[]{this.f496989f, this.f496990g}, new t36.h(t36.k.b(list))));
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e17) {
            throw m36.e.a("unable to set alpn", e17);
        }
    }

    @Override // t36.k
    public java.lang.String i(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            t36.h hVar = (t36.h) java.lang.reflect.Proxy.getInvocationHandler(this.f496987d.invoke(null, sSLSocket));
            boolean z17 = hVar.f496984b;
            if (!z17 && hVar.f496985c == null) {
                t36.k.f496994a.l(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z17) {
                return null;
            }
            return hVar.f496985c;
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e17) {
            throw m36.e.a("unable to get selected protocol", e17);
        }
    }
}
