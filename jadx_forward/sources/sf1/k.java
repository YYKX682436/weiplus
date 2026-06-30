package sf1;

/* loaded from: classes13.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.net.ConnectivityManager f488523f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf1.l f488524g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sf1.m f488525h;

    public k(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, android.net.ConnectivityManager connectivityManager, sf1.l lVar, sf1.m mVar) {
        this.f488521d = h0Var;
        this.f488522e = h0Var2;
        this.f488523f = connectivityManager;
        this.f488524g = lVar;
        this.f488525h = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "onUnavailable, timeout");
        wu5.c cVar = (wu5.c) this.f488521d.f391656d;
        if (cVar != null) {
            cVar.cancel(true);
        }
        rf1.d.c((rf1.c) this.f488522e.f391656d);
        this.f488523f.unregisterNetworkCallback(this.f488524g);
        sf1.g.c(this.f488525h, null, 1, null);
    }
}
