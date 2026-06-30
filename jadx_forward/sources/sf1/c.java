package sf1;

/* loaded from: classes13.dex */
public class c implements sf1.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sf1.e f488491a;

    public c(sf1.e eVar) {
        this.f488491a = eVar;
    }

    @Override // sf1.g
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WiFiConnector", "connect, onConnectSuccess");
        this.f488491a.b(true, "");
    }

    @Override // sf1.g
    public void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WiFiConnector", "connect, onConnectFailure");
        this.f488491a.b(false, str);
    }
}
