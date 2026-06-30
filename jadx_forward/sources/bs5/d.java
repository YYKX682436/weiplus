package bs5;

/* loaded from: classes13.dex */
public abstract class d {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f105549b = "&sdk=1_4.11.0a;" + gs5.g.f356703a;

    /* renamed from: a, reason: collision with root package name */
    public java.net.SocketAddress f105550a = null;

    public abstract int a();

    public java.net.SocketAddress b(java.lang.String str, int i17) {
        try {
            this.f105550a = new java.net.InetSocketAddress(java.net.InetAddress.getByName(str), a());
        } catch (java.lang.Exception e17) {
            or5.b.b("exception: %s", e17);
        }
        return this.f105550a;
    }

    public abstract java.lang.String c(java.lang.String str, java.lang.String str2);
}
