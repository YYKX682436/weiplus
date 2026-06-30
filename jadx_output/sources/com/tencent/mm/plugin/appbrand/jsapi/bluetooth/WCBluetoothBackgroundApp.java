package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/bluetooth/WCBluetoothBackgroundApp;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final /* data */ class WCBluetoothBackgroundApp implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.bluetooth.WCBluetoothBackgroundApp> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f80044d;

    /* renamed from: e, reason: collision with root package name */
    public final int f80045e;

    public WCBluetoothBackgroundApp(java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f80044d = appId;
        this.f80045e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.bluetooth.WCBluetoothBackgroundApp)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.WCBluetoothBackgroundApp wCBluetoothBackgroundApp = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.WCBluetoothBackgroundApp) obj;
        return kotlin.jvm.internal.o.b(this.f80044d, wCBluetoothBackgroundApp.f80044d) && this.f80045e == wCBluetoothBackgroundApp.f80045e;
    }

    public int hashCode() {
        return (this.f80044d.hashCode() * 31) + java.lang.Integer.hashCode(this.f80045e);
    }

    public java.lang.String toString() {
        return "WCBluetoothBackgroundApp(appId=" + this.f80044d + ", versionType=" + this.f80045e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f80044d);
        out.writeInt(this.f80045e);
    }
}
