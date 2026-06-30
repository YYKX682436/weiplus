package sf1;

/* loaded from: classes5.dex */
public final class m implements sf1.g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f488532a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sf1.g f488533b;

    public m(sf1.g gVar) {
        this.f488533b = gVar;
    }

    @Override // sf1.g
    public void a() {
        if (this.f488532a.compareAndSet(false, true)) {
            this.f488533b.a();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "onConnectSuccess, already call");
        }
    }

    @Override // sf1.g
    public void b(java.lang.String str) {
        if (this.f488532a.compareAndSet(false, true)) {
            this.f488533b.b(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "onConnectFailure, already call");
        }
    }
}
