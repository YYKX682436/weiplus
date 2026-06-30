package b6;

/* loaded from: classes13.dex */
public final class e extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b6.f f18121a;

    public e(b6.f fVar) {
        this.f18121a = fVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        kotlin.jvm.internal.o.g(network, "network");
        b6.f.b(this.f18121a, network, true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        kotlin.jvm.internal.o.g(network, "network");
        b6.f.b(this.f18121a, network, false);
    }
}
