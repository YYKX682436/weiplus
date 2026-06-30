package qf1;

/* loaded from: classes13.dex */
public class h implements rf1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f443801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f443802b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f443803c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f443804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f443805e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf1.j f443806f;

    public h(qf1.j jVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, android.content.Context context) {
        this.f443806f = jVar;
        this.f443801a = b4Var;
        this.f443802b = atomicBoolean;
        this.f443803c = lVar;
        this.f443804d = i17;
        this.f443805e = context;
    }

    public void a(rf1.i iVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWifiList", "onGetWiFiList");
        this.f443801a.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WiFiManagerWrapper", "releaseGetWiFiListCallback");
        rf1.l.f476168g = null;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f443802b;
        if (atomicBoolean.get()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWifiList", "onGetWiFiList, hasCallback");
            return;
        }
        qf1.j.C(this.f443806f, this.f443803c, this.f443804d, this.f443805e, iVar);
        atomicBoolean.set(true);
    }
}
