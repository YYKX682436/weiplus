package b6;

/* loaded from: classes13.dex */
public final class f implements b6.d {

    /* renamed from: b, reason: collision with root package name */
    public final android.net.ConnectivityManager f99655b;

    /* renamed from: c, reason: collision with root package name */
    public final b6.c f99656c;

    /* renamed from: d, reason: collision with root package name */
    public final b6.e f99657d;

    public f(android.net.ConnectivityManager connectivityManager, b6.c listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(connectivityManager, "connectivityManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f99655b = connectivityManager;
        this.f99656c = listener;
        b6.e eVar = new b6.e(this);
        this.f99657d = eVar;
        connectivityManager.registerNetworkCallback(new android.net.NetworkRequest.Builder().addCapability(12).build(), eVar);
    }

    public static final void b(b6.f fVar, android.net.Network network, boolean z17) {
        boolean z18;
        android.net.Network[] allNetworks = fVar.f99655b.getAllNetworks();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(allNetworks, "connectivityManager.allNetworks");
        int length = allNetworks.length;
        boolean z19 = false;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                break;
            }
            android.net.Network it = allNetworks[i17];
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it, network)) {
                z18 = z17;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "it");
                android.net.NetworkCapabilities networkCapabilities = fVar.f99655b.getNetworkCapabilities(it);
                z18 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z18) {
                z19 = true;
                break;
            }
            i17++;
        }
        h6.l lVar = (h6.l) fVar.f99656c;
        if (((r5.p) lVar.f360662e.get()) == null) {
            lVar.a();
        } else {
            lVar.f360664g = z19;
        }
    }

    @Override // b6.d
    public boolean a() {
        android.net.ConnectivityManager connectivityManager = this.f99655b;
        android.net.Network[] allNetworks = connectivityManager.getAllNetworks();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(allNetworks, "connectivityManager.allNetworks");
        for (android.net.Network it : allNetworks) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "it");
            android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(it);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // b6.d
    /* renamed from: shutdown */
    public void mo9870xf5e80656() {
        this.f99655b.unregisterNetworkCallback(this.f99657d);
    }
}
