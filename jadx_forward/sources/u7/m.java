package u7;

/* loaded from: classes13.dex */
public class m extends java.net.ProxySelector {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f506600d = java.util.Arrays.asList(java.net.Proxy.NO_PROXY);

    /* renamed from: a, reason: collision with root package name */
    public final java.net.ProxySelector f506601a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f506602b;

    /* renamed from: c, reason: collision with root package name */
    public final int f506603c;

    public m(java.net.ProxySelector proxySelector, java.lang.String str, int i17) {
        proxySelector.getClass();
        this.f506601a = proxySelector;
        str.getClass();
        this.f506602b = str;
        this.f506603c = i17;
    }

    @Override // java.net.ProxySelector
    public void connectFailed(java.net.URI uri, java.net.SocketAddress socketAddress, java.io.IOException iOException) {
        this.f506601a.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public java.util.List select(java.net.URI uri) {
        return this.f506602b.equals(uri.getHost()) && this.f506603c == uri.getPort() ? f506600d : this.f506601a.select(uri);
    }
}
