package h5;

/* loaded from: classes13.dex */
public class h extends h5.f {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f360526i = a5.a0.e("NetworkStateTracker");

    /* renamed from: g, reason: collision with root package name */
    public final android.net.ConnectivityManager f360527g;

    /* renamed from: h, reason: collision with root package name */
    public final h5.g f360528h;

    public h(android.content.Context context, m5.a aVar) {
        super(context, aVar);
        this.f360527g = (android.net.ConnectivityManager) this.f360521b.getSystemService("connectivity");
        this.f360528h = new h5.g(this);
    }

    @Override // h5.f
    public java.lang.Object a() {
        return e();
    }

    @Override // h5.f
    public void c() {
        java.lang.String str = f360526i;
        try {
            a5.a0.c().a(str, "Registering network callback", new java.lang.Throwable[0]);
            this.f360527g.registerDefaultNetworkCallback(this.f360528h);
        } catch (java.lang.IllegalArgumentException | java.lang.SecurityException e17) {
            a5.a0.c().b(str, "Received exception while registering network callback", e17);
        }
    }

    @Override // h5.f
    public void d() {
        java.lang.String str = f360526i;
        try {
            a5.a0.c().a(str, "Unregistering network callback", new java.lang.Throwable[0]);
            this.f360527g.unregisterNetworkCallback(this.f360528h);
        } catch (java.lang.IllegalArgumentException | java.lang.SecurityException e17) {
            a5.a0.c().b(str, "Received exception while unregistering network callback", e17);
        }
    }

    public f5.b e() {
        boolean z17;
        android.net.NetworkCapabilities networkCapabilities;
        android.net.ConnectivityManager connectivityManager = this.f360527g;
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z18 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (java.lang.SecurityException e17) {
            a5.a0.c().b(f360526i, "Unable to validate active network", e17);
        }
        if (networkCapabilities != null) {
            if (networkCapabilities.hasCapability(16)) {
                z17 = true;
                return new f5.b(z18, z17, i3.a.a(connectivityManager), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
            }
        }
        z17 = false;
        return new f5.b(z18, z17, i3.a.a(connectivityManager), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
    }
}
