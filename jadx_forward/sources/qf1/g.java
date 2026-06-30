package qf1;

/* loaded from: classes13.dex */
public class g implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f443796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f443797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f443798f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f443799g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qf1.j f443800h;

    public g(qf1.j jVar, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, android.content.Context context) {
        this.f443800h = jVar;
        this.f443796d = atomicBoolean;
        this.f443797e = lVar;
        this.f443798f = i17;
        this.f443799g = context;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWifiList", "onTimerExpired");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WiFiManagerWrapper", "releaseGetWiFiListCallback");
        rf1.l.f476168g = null;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f443796d;
        if (atomicBoolean.get()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWifiList", "onTimerExpired, hasCallback");
            return false;
        }
        rf1.i a17 = rf1.l.a(true);
        qf1.j.C(this.f443800h, this.f443797e, this.f443798f, this.f443799g, a17);
        atomicBoolean.set(true);
        return false;
    }
}
