package com.tencent.mm.plugin.appbrand.device_discovery.bluetooth;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u00012\u00020\u00022\u00020\u00022\u00020\u0003:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/device_discovery/bluetooth/MonitoredBluetoothDeviceInfo;", "Ldm/b8;", "", "Landroid/os/Parcelable;", "<init>", "()V", "CREATOR", "com/tencent/mm/plugin/appbrand/device_discovery/bluetooth/f1", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class MonitoredBluetoothDeviceInfo extends dm.b8 implements android.os.Parcelable {

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f77860z = jz5.h.b(new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.g1(this));
    public static final com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.f1 CREATOR = new com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.f1(null);
    public static final l75.e0 A = dm.b8.initAutoDBInfo(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo.class);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.device_discovery.bluetooth.MonitoredBluetoothDeviceInfo");
        java.lang.String str = this.field_appId;
        if (kotlin.jvm.internal.o.b(str, str)) {
            java.lang.String str2 = this.field_entryPackage;
            if (kotlin.jvm.internal.o.b(str2, str2)) {
                java.lang.String str3 = this.field_wechatToken;
                if (kotlin.jvm.internal.o.b(str3, str3)) {
                    java.lang.String str4 = this.field_bluetoothDeviceId;
                    if (kotlin.jvm.internal.o.b(str4, str4)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // dm.b8, l75.f0
    public l75.e0 getDBInfo() {
        return A;
    }

    public int hashCode() {
        return (((((((this.field_appId.hashCode() * 31) + java.lang.Integer.hashCode(this.field_versionType)) * 31) + this.field_entryPackage.hashCode()) * 31) + this.field_wechatToken.hashCode()) * 31) + this.field_bluetoothDeviceId.hashCode();
    }

    public boolean isValid() {
        java.lang.String str = this.field_appId;
        if (str == null || str.length() == 0) {
            return false;
        }
        java.lang.String str2 = this.field_bluetoothDeviceId;
        if (str2 == null || str2.length() == 0) {
            return false;
        }
        java.lang.String str3 = this.field_wechatToken;
        if (str3 == null || str3.length() == 0) {
            return false;
        }
        int i17 = this.field_versionType;
        return 1 == i17 || 2 == i17 || i17 == 0;
    }

    public java.lang.String toString() {
        return "MonitoredBluetoothDeviceInfo(appId=" + this.field_appId + ", bluetoothDeviceId=" + this.field_bluetoothDeviceId + ", wechatToken=" + this.field_wechatToken + ", versionType=" + this.field_versionType + ", entryPackage=" + this.field_entryPackage + ", updateTime=" + this.field_updateTime + ", isBlocked=" + this.field_isBlocked + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.field_appId);
        parcel.writeString(this.field_bluetoothDeviceId);
        parcel.writeString(this.field_wechatToken);
        parcel.writeInt(this.field_versionType);
        parcel.writeString(this.field_entryPackage);
        parcel.writeLong(this.field_updateTime);
    }
}
