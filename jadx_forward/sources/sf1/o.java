package sf1;

/* loaded from: classes5.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f488538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f488539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf1.g f488540f;

    public o(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yz5.a aVar, sf1.g gVar) {
        this.f488538d = h0Var;
        this.f488539e = aVar;
        this.f488540f = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "tryKeepConnectedWifi, timeout");
        this.f488538d.f391656d = null;
        this.f488539e.mo152xb9724478();
        this.f488540f.b("fail to connect wifi:time out");
    }
}
