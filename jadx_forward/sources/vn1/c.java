package vn1;

/* loaded from: classes7.dex */
public final class c extends android.bluetooth.le.AdvertiseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vn1.m f519732a;

    public c(vn1.m mVar) {
        this.f519732a = mVar;
    }

    @Override // android.bluetooth.le.AdvertiseCallback
    public void onStartFailure(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.BLE.BLEDeviceManager", "BLE advertising failed with error code: " + i17);
        vn1.m mVar = this.f519732a;
        mVar.getClass();
        vn1.a aVar = mVar.f519747b;
        if (aVar != null) {
            aVar.f(false);
        }
    }

    @Override // android.bluetooth.le.AdvertiseCallback
    public void onStartSuccess(android.bluetooth.le.AdvertiseSettings settingsInEffect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(settingsInEffect, "settingsInEffect");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.BLE.BLEDeviceManager", "BLE advertising started successfully");
        vn1.m mVar = this.f519732a;
        mVar.getClass();
        vn1.a aVar = mVar.f519747b;
        if (aVar != null) {
            aVar.f(true);
        }
    }
}
