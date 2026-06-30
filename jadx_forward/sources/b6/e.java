package b6;

/* loaded from: classes13.dex */
public final class e extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b6.f f99654a;

    public e(b6.f fVar) {
        this.f99654a = fVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        b6.f.b(this.f99654a, network, true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        b6.f.b(this.f99654a, network, false);
    }
}
