package sf1;

/* loaded from: classes13.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488511f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.net.ConnectivityManager f488512g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sf1.l f488513h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sf1.m f488514i;

    public i(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3, android.net.ConnectivityManager connectivityManager, sf1.l lVar, sf1.m mVar) {
        this.f488509d = h0Var;
        this.f488510e = h0Var2;
        this.f488511f = h0Var3;
        this.f488512g = connectivityManager;
        this.f488513h = lVar;
        this.f488514i = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "timeout");
        wu5.c cVar = (wu5.c) this.f488509d.f391656d;
        if (cVar != null) {
            cVar.cancel(true);
        }
        wu5.c cVar2 = (wu5.c) this.f488510e.f391656d;
        if (cVar2 != null) {
            cVar2.cancel(true);
        }
        rf1.d.c((rf1.c) this.f488511f.f391656d);
        this.f488512g.unregisterNetworkCallback(this.f488513h);
        this.f488514i.b("fail to connect wifi:time out");
    }
}
