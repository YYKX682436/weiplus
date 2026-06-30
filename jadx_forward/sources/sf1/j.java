package sf1;

/* loaded from: classes13.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.Network f488515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488516e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488517f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf1.m f488518g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.net.ConnectivityManager f488519h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sf1.l f488520i;

    public j(android.net.Network network, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, sf1.m mVar, android.net.ConnectivityManager connectivityManager, sf1.l lVar) {
        this.f488515d = network;
        this.f488516e = h0Var;
        this.f488517f = h0Var2;
        this.f488518g = mVar;
        this.f488519h = connectivityManager;
        this.f488520i = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "onLost, network: " + this.f488515d + ", timeout");
        wu5.c cVar = (wu5.c) this.f488516e.f391656d;
        if (cVar != null) {
            cVar.cancel(true);
        }
        rf1.d.c((rf1.c) this.f488517f.f391656d);
        sf1.g.c(this.f488518g, null, 1, null);
        android.net.ConnectivityManager connectivityManager = this.f488519h;
        connectivityManager.bindProcessToNetwork(null);
        connectivityManager.unregisterNetworkCallback(this.f488520i);
    }
}
