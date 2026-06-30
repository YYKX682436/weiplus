package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

/* loaded from: classes7.dex */
public final class f1 implements android.os.Parcelable.Creator {
    public f1(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo monitoredBluetoothDeviceInfo = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo();
        monitoredBluetoothDeviceInfo.field_appId = parcel.readString();
        monitoredBluetoothDeviceInfo.field_bluetoothDeviceId = parcel.readString();
        monitoredBluetoothDeviceInfo.field_wechatToken = parcel.readString();
        monitoredBluetoothDeviceInfo.field_versionType = parcel.readInt();
        monitoredBluetoothDeviceInfo.field_entryPackage = parcel.readString();
        monitoredBluetoothDeviceInfo.field_updateTime = parcel.readLong();
        return monitoredBluetoothDeviceInfo;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo[i17];
    }
}
