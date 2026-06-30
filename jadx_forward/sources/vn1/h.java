package vn1;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.bluetooth.BluetoothDevice f519738e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vn1.m f519739f;

    public h(java.lang.String str, android.bluetooth.BluetoothDevice bluetoothDevice, vn1.m mVar) {
        this.f519737d = str;
        this.f519738e = bluetoothDevice;
        this.f519739f = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f519737d;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.BLE.BLEDeviceManager", "Initiating connectGatt on Main Thread for " + str);
            int i17 = android.os.Build.VERSION.SDK_INT;
            vn1.m mVar = this.f519739f;
            android.bluetooth.BluetoothGatt connectGatt = i17 >= 26 ? this.f519738e.connectGatt(mVar.f519746a, false, mVar.f519767v, 2, 1, mVar.f519754i) : this.f519738e.connectGatt(mVar.f519746a, false, mVar.f519767v, 2);
            if (connectGatt != null) {
                mVar.f519756k.put(str, connectGatt);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.BLE.BLEDeviceManager", "connectGatt returned null for " + str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MM.BLE.BLEDeviceManager", e17, "Exception during connectGatt: " + e17.getMessage(), new java.lang.Object[0]);
        }
    }
}
