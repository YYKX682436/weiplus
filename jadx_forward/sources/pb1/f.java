package pb1;

/* loaded from: classes7.dex */
public class f extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pb1.i f434668a;

    public f(pb1.i iVar) {
        this.f434668a = iVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        pb1.i iVar = this.f434668a;
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(iVar.f434673a, "Receive intent failed");
            return;
        }
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            int state = defaultAdapter.getState();
            java.lang.String str = iVar.f434673a;
            if (state == 12 || state == 11) {
                return;
            }
            if (state == 10 || state == 13) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(iVar.f434673a, "bluetooth is disable, stop scan", new java.lang.Object[0]);
                iVar.f434677e.set(false);
                iVar.d();
            }
        }
    }
}
