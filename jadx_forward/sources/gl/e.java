package gl;

/* loaded from: classes14.dex */
public final class e implements android.bluetooth.BluetoothProfile.ServiceListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gl.i f354270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.bluetooth.BluetoothAdapter f354271b;

    public e(gl.i iVar, android.bluetooth.BluetoothAdapter bluetoothAdapter) {
        this.f354270a = iVar;
        this.f354271b = bluetoothAdapter;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceConnected(int i17, android.bluetooth.BluetoothProfile bluetoothProfile) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(bluetoothProfile, "null cannot be cast to non-null type android.bluetooth.BluetoothHeadset");
        gl.i iVar = this.f354270a;
        iVar.f354294o = (android.bluetooth.BluetoothHeadset) bluetoothProfile;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioRouteManager", "bt onServiceConnected " + iVar.f354294o);
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceDisconnected(int i17) {
        gl.i iVar = this.f354270a;
        android.bluetooth.BluetoothHeadset bluetoothHeadset = iVar.f354294o;
        if (bluetoothHeadset == null) {
            return;
        }
        this.f354271b.closeProfileProxy(1, bluetoothHeadset);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioRouteManager", "bt closeProfileProxy " + bluetoothHeadset);
        iVar.f354294o = null;
    }
}
