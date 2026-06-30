package sf1;

/* loaded from: classes13.dex */
public final class l extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488527b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488528c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf1.m f488530e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.net.ConnectivityManager f488531f;

    public l(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var4, sf1.m mVar, android.net.ConnectivityManager connectivityManager, long j17) {
        this.f488526a = h0Var;
        this.f488527b = h0Var2;
        this.f488528c = h0Var3;
        this.f488529d = h0Var4;
        this.f488530e = mVar;
        this.f488531f = connectivityManager;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        super.onAvailable(network);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "onAvailable, network: " + network);
        wu5.c cVar = (wu5.c) this.f488526a.f391656d;
        if (cVar != null) {
            cVar.cancel(true);
        }
        wu5.c cVar2 = (wu5.c) this.f488527b.f391656d;
        if (cVar2 != null) {
            cVar2.cancel(true);
        }
        wu5.c cVar3 = (wu5.c) this.f488528c.f391656d;
        if (cVar3 != null) {
            cVar3.cancel(true);
        }
        rf1.d.c((rf1.c) this.f488529d.f391656d);
        this.f488530e.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "onAvailable, success: " + this.f488531f.bindProcessToNetwork(network));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        super.onLost(network);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "onLost, network: " + network);
        this.f488528c.f391656d = ((ku5.t0) ku5.t0.f394148d).k(new sf1.j(network, this.f488526a, this.f488529d, this.f488530e, this.f488531f, this), 3000L);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        super.onUnavailable();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "onUnavailable");
        this.f488527b.f391656d = ((ku5.t0) ku5.t0.f394148d).k(new sf1.k(this.f488526a, this.f488529d, this.f488531f, this, this.f488530e), 3000L);
    }
}
