package pr5;

/* loaded from: classes13.dex */
public class e extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f439581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pr5.f f439582b;

    public e(pr5.f fVar, android.content.Context context) {
        this.f439582b = fVar;
        this.f439581a = context;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        super.onAvailable(network);
        or5.b.a("Network onAvailable(%s)", network);
        this.f439582b.b(this.f439581a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        super.onCapabilitiesChanged(network, networkCapabilities);
        or5.b.a("Network onCapabilitiesChanged(%s)", network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(android.net.Network network, android.net.LinkProperties linkProperties) {
        super.onLinkPropertiesChanged(network, linkProperties);
        or5.b.a("Network onLinkPropertiesChanged(%s)", network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLosing(android.net.Network network, int i17) {
        super.onLosing(network, i17);
        or5.b.a("Network onLosing(%s)", network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        super.onLost(network);
        or5.b.a("Network onLost(%s)", network);
        this.f439582b.b(this.f439581a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        super.onUnavailable();
        or5.b.a("Network onUnavailable", new java.lang.Object[0]);
    }
}
