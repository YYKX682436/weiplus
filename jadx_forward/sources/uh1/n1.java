package uh1;

/* loaded from: classes15.dex */
public class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f509375a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f509376b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f509377c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f509378d;

    /* renamed from: e, reason: collision with root package name */
    public final int f509379e;

    public n1(android.net.nsd.NsdServiceInfo nsdServiceInfo) {
        java.net.InetAddress host = nsdServiceInfo.getHost();
        if (host != null) {
            this.f509378d = host.getHostAddress();
        }
        this.f509379e = nsdServiceInfo.getPort();
        this.f509376b = nsdServiceInfo.getServiceName();
        this.f509377c = nsdServiceInfo.getServiceType();
        java.util.Map<java.lang.String, byte[]> attributes = nsdServiceInfo.getAttributes();
        if (attributes != null) {
            for (java.lang.String str : attributes.keySet()) {
                byte[] bArr = attributes.get(str);
                if (bArr != null) {
                    this.f509375a.put(str, new java.lang.String(android.util.Base64.encode(bArr, 2)));
                }
            }
        }
    }
}
