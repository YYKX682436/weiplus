package sy5;

/* loaded from: classes13.dex */
public class c extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dev.p3272xc19e574d.p3273x348d9a.p3274x72a369b7.C28213x10e3f0b9 f495433a;

    public c(dev.p3272xc19e574d.p3273x348d9a.p3274x72a369b7.C28213x10e3f0b9 c28213x10e3f0b9) {
        this.f495433a = c28213x10e3f0b9;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        dev.p3272xc19e574d.p3273x348d9a.p3274x72a369b7.C28213x10e3f0b9 c28213x10e3f0b9 = this.f495433a;
        sy5.a aVar = c28213x10e3f0b9.f310944d;
        c28213x10e3f0b9.f310946f.post(new sy5.RunnableC30205x2d1840(c28213x10e3f0b9, aVar.a(aVar.f495429a.getNetworkCapabilities(network))));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        dev.p3272xc19e574d.p3273x348d9a.p3274x72a369b7.C28213x10e3f0b9 c28213x10e3f0b9 = this.f495433a;
        c28213x10e3f0b9.f310946f.post(new sy5.RunnableC30205x2d1840(c28213x10e3f0b9, c28213x10e3f0b9.f310944d.a(networkCapabilities)));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        int i17 = dev.p3272xc19e574d.p3273x348d9a.p3274x72a369b7.C28213x10e3f0b9.f310943h;
        final dev.p3272xc19e574d.p3273x348d9a.p3274x72a369b7.C28213x10e3f0b9 c28213x10e3f0b9 = this.f495433a;
        c28213x10e3f0b9.getClass();
        c28213x10e3f0b9.f310946f.postDelayed(new java.lang.Runnable() { // from class: sy5.b$$a
            @Override // java.lang.Runnable
            public final void run() {
                dev.p3272xc19e574d.p3273x348d9a.p3274x72a369b7.C28213x10e3f0b9 c28213x10e3f0b92 = dev.p3272xc19e574d.p3273x348d9a.p3274x72a369b7.C28213x10e3f0b9.this;
                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink = c28213x10e3f0b92.f310945e;
                sy5.a aVar = c28213x10e3f0b92.f310944d;
                android.net.ConnectivityManager connectivityManager = aVar.f495429a;
                eventSink.mo138418x90b54003(aVar.a(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
            }
        }, 500L);
    }
}
