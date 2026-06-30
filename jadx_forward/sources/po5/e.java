package po5;

/* loaded from: classes13.dex */
public final class e extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ po5.i f438883a;

    public e(po5.i iVar) {
        this.f438883a = iVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        po5.i.b(this.f438883a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(networkCapabilities, "networkCapabilities");
        po5.i.b(this.f438883a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        po5.i.b(this.f438883a);
    }
}
