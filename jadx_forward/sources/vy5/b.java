package vy5;

/* loaded from: classes11.dex */
public final class b extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dev.p3272xc19e574d.p3273x348d9a.p3275xd0d13ae7.p3276x72a369b7.C28214x10e3f0b9 f523049a;

    public b(dev.p3272xc19e574d.p3273x348d9a.p3275xd0d13ae7.p3276x72a369b7.C28214x10e3f0b9 c28214x10e3f0b9) {
        this.f523049a = c28214x10e3f0b9;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        dev.p3272xc19e574d.p3273x348d9a.p3275xd0d13ae7.p3276x72a369b7.C28214x10e3f0b9 c28214x10e3f0b9 = this.f523049a;
        vy5.a aVar = c28214x10e3f0b9.f310949d;
        c28214x10e3f0b9.a(aVar.a(aVar.f523048a.getNetworkCapabilities(network)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(networkCapabilities, "networkCapabilities");
        dev.p3272xc19e574d.p3273x348d9a.p3275xd0d13ae7.p3276x72a369b7.C28214x10e3f0b9 c28214x10e3f0b9 = this.f523049a;
        c28214x10e3f0b9.a(c28214x10e3f0b9.f310949d.a(networkCapabilities));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        dev.p3272xc19e574d.p3273x348d9a.p3275xd0d13ae7.p3276x72a369b7.C28214x10e3f0b9 c28214x10e3f0b9 = this.f523049a;
        p3325xe03a0797.p3326xc267989b.l.d(c28214x10e3f0b9.f310950e, null, null, new vy5.c(c28214x10e3f0b9, null), 3, null);
    }
}
