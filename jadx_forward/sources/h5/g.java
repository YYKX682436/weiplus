package h5;

/* loaded from: classes13.dex */
public class g extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h5.h f360525a;

    public g(h5.h hVar) {
        this.f360525a = hVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        a5.a0.c().a(h5.h.f360526i, java.lang.String.format("Network capabilities changed: %s", networkCapabilities), new java.lang.Throwable[0]);
        h5.h hVar = this.f360525a;
        hVar.b(hVar.e());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        a5.a0.c().a(h5.h.f360526i, "Network connection lost", new java.lang.Throwable[0]);
        h5.h hVar = this.f360525a;
        hVar.b(hVar.e());
    }
}
