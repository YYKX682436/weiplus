package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/device_discovery/bluetooth/AppBrandMonitoredBluetoothDeviceService$WeAppConnectGattSuccessInfo", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class AppBrandMonitoredBluetoothDeviceService$WeAppConnectGattSuccessInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService$WeAppConnectGattSuccessInfo> CREATOR = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.g();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f77858d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f77859e;

    public AppBrandMonitoredBluetoothDeviceService$WeAppConnectGattSuccessInfo(java.lang.String appId, java.lang.String deviceId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        this.f77858d = appId;
        this.f77859e = deviceId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f77858d);
        out.writeString(this.f77859e);
    }
}
