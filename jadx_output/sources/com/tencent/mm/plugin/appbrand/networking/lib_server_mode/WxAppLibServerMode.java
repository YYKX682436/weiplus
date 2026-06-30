package com.tencent.mm.plugin.appbrand.networking.lib_server_mode;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/networking/lib_server_mode/WxAppLibServerMode;", "Landroid/os/Parcelable;", "xh1/j", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class WxAppLibServerMode implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f86101d;

    /* renamed from: e, reason: collision with root package name */
    public final xh1.j f86102e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode f86100f = new com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode(false, xh1.j.f454516f);
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode> CREATOR = new xh1.h();

    public WxAppLibServerMode(boolean z17, xh1.j reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f86101d = z17;
        this.f86102e = reason;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode wxAppLibServerMode = (com.tencent.mm.plugin.appbrand.networking.lib_server_mode.WxAppLibServerMode) obj;
        return this.f86101d == wxAppLibServerMode.f86101d && this.f86102e == wxAppLibServerMode.f86102e;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f86101d) * 31) + this.f86102e.hashCode();
    }

    public java.lang.String toString() {
        return "WxAppLibServerMode(switch:" + this.f86101d + ", reason:" + this.f86102e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeByte(this.f86101d ? (byte) 1 : (byte) 0);
        dest.writeInt(this.f86102e.f454519d);
    }
}
