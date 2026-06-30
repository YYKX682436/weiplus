package b6;

/* loaded from: classes13.dex */
public final class f implements b6.d {

    /* renamed from: b, reason: collision with root package name */
    public final android.net.ConnectivityManager f18122b;

    /* renamed from: c, reason: collision with root package name */
    public final b6.c f18123c;

    /* renamed from: d, reason: collision with root package name */
    public final b6.e f18124d;

    public f(android.net.ConnectivityManager connectivityManager, b6.c listener) {
        kotlin.jvm.internal.o.g(connectivityManager, "connectivityManager");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f18122b = connectivityManager;
        this.f18123c = listener;
        b6.e eVar = new b6.e(this);
        this.f18124d = eVar;
        connectivityManager.registerNetworkCallback(new android.net.NetworkRequest.Builder().addCapability(12).build(), eVar);
    }

    public static final void b(b6.f fVar, android.net.Network network, boolean z17) {
        boolean z18;
        android.net.Network[] allNetworks = fVar.f18122b.getAllNetworks();
        kotlin.jvm.internal.o.f(allNetworks, "connectivityManager.allNetworks");
        int length = allNetworks.length;
        boolean z19 = false;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                break;
            }
            android.net.Network it = allNetworks[i17];
            if (kotlin.jvm.internal.o.b(it, network)) {
                z18 = z17;
            } else {
                kotlin.jvm.internal.o.f(it, "it");
                android.net.NetworkCapabilities networkCapabilities = fVar.f18122b.getNetworkCapabilities(it);
                z18 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z18) {
                z19 = true;
                break;
            }
            i17++;
        }
        h6.l lVar = (h6.l) fVar.f18123c;
        if (((r5.p) lVar.f279129e.get()) == null) {
            lVar.a();
        } else {
            lVar.f279131g = z19;
        }
    }

    @Override // b6.d
    public boolean a() {
        android.net.ConnectivityManager connectivityManager = this.f18122b;
        android.net.Network[] allNetworks = connectivityManager.getAllNetworks();
        kotlin.jvm.internal.o.f(allNetworks, "connectivityManager.allNetworks");
        for (android.net.Network it : allNetworks) {
            kotlin.jvm.internal.o.f(it, "it");
            android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(it);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // b6.d
    public void shutdown() {
        this.f18122b.unregisterNetworkCallback(this.f18124d);
    }
}
