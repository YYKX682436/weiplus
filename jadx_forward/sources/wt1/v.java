package wt1;

/* loaded from: classes13.dex */
public class v extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wt1.t f530889a;

    public v(wt1.t tVar) {
        this.f530889a = tVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardLbsOrBluetooth", "Receive intent failed");
            return;
        }
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            int state = defaultAdapter.getState();
            wt1.t tVar = this.f530889a;
            if (state == 12) {
                tVar.f530879c = true;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(tVar.f530883g, tVar.f530882f);
            } else if (state == 10) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(tVar.f530883g);
                tVar.f530879c = false;
                ((java.util.concurrent.ConcurrentHashMap) tVar.f530880d).clear();
            }
        }
    }
}
