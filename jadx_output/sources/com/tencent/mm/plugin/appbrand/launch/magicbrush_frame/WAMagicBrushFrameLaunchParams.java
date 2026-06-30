package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/launch/magicbrush_frame/WAMagicBrushFrameLaunchParams;", "Lcom/tencent/mm/plugin/appbrand/launch/WALaunchParams;", "CREATOR", "com/tencent/mm/plugin/appbrand/launch/magicbrush_frame/x", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class WAMagicBrushFrameLaunchParams extends com.tencent.mm.plugin.appbrand.launch.WALaunchParams {
    public static final com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.x CREATOR = new com.tencent.mm.plugin.appbrand.launch.magicbrush_frame.x(null);

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f84254i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f84255m;

    public WAMagicBrushFrameLaunchParams(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        this.f84242d = parcel.readString();
        this.f84243e = parcel.readString();
        this.f84244f = parcel.readInt();
        this.f84245g = parcel.readInt();
        this.f84246h = parcel.readString();
        this.f84254i = parcel.readString();
        this.f84255m = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WAMagicBrushFrameLaunchParams(username:");
        java.lang.String str = this.f84242d;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(", appId:");
        java.lang.String str2 = this.f84243e;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(", appPath:");
        java.lang.String str3 = this.f84246h;
        if (str3 == null) {
            str3 = "";
        }
        sb6.append(str3);
        sb6.append(", bizInstanceName:");
        java.lang.String str4 = this.f84254i;
        if (str4 == null) {
            str4 = "";
        }
        sb6.append(str4);
        sb6.append(", mbServerProcessName:");
        java.lang.String str5 = this.f84255m;
        sb6.append(str5 != null ? str5 : "");
        sb6.append(')');
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(this.f84242d);
        dest.writeString(this.f84243e);
        dest.writeInt(this.f84244f);
        dest.writeInt(this.f84245g);
        dest.writeString(this.f84246h);
        dest.writeString(this.f84254i);
        dest.writeString(this.f84255m);
    }
}
