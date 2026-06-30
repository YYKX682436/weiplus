package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/device_discovery/bluetooth/AppBrandMonitoredBluetoothDeviceService$DeleteInfoParams", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class AppBrandMonitoredBluetoothDeviceService$DeleteInfoParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.AppBrandMonitoredBluetoothDeviceService$DeleteInfoParams> CREATOR = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.f();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f77856d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f77857e;

    public AppBrandMonitoredBluetoothDeviceService$DeleteInfoParams(java.lang.String appId, java.lang.String wechatToken) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(wechatToken, "wechatToken");
        this.f77856d = appId;
        this.f77857e = wechatToken;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f77856d);
        out.writeString(this.f77857e);
    }
}
