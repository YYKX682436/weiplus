package sf1;

/* loaded from: classes13.dex */
public class a extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sf1.e f488489a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sf1.e eVar, android.os.Looper looper) {
        super(looper);
        this.f488489a = eVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        if (message == null) {
            return;
        }
        boolean z17 = true;
        if (message.what != 1) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WiFiConnector", "MSG_TIME_OUT");
        sf1.e eVar = this.f488489a;
        int i17 = eVar.f488501i;
        if (i17 != 3 && i17 != 2) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        eVar.a("fail to connect wifi:time out");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.wifi_event", "MSG_TIME_OUT FAIL.");
    }
}
