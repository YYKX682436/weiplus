package com.tencent.mm.plugin.appbrand.jsapi.native_navigator;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/native_navigator/NativeDataChannel$WxaToNative$CallbackDataToNativeMessage", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class NativeDataChannel$WxaToNative$CallbackDataToNativeMessage implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.native_navigator.NativeDataChannel$WxaToNative$CallbackDataToNativeMessage> CREATOR = new xc1.p();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f82385d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f82386e;

    public NativeDataChannel$WxaToNative$CallbackDataToNativeMessage(java.lang.String appId, java.lang.String data) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(data, "data");
        this.f82385d = appId;
        this.f82386e = data;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.native_navigator.NativeDataChannel$WxaToNative$CallbackDataToNativeMessage)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.native_navigator.NativeDataChannel$WxaToNative$CallbackDataToNativeMessage nativeDataChannel$WxaToNative$CallbackDataToNativeMessage = (com.tencent.mm.plugin.appbrand.jsapi.native_navigator.NativeDataChannel$WxaToNative$CallbackDataToNativeMessage) obj;
        return kotlin.jvm.internal.o.b(this.f82385d, nativeDataChannel$WxaToNative$CallbackDataToNativeMessage.f82385d) && kotlin.jvm.internal.o.b(this.f82386e, nativeDataChannel$WxaToNative$CallbackDataToNativeMessage.f82386e);
    }

    public int hashCode() {
        return (this.f82385d.hashCode() * 31) + this.f82386e.hashCode();
    }

    public java.lang.String toString() {
        return "CallbackDataToNativeMessage(appId=" + this.f82385d + ", data=" + this.f82386e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f82385d);
        out.writeString(this.f82386e);
    }
}
