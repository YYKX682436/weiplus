package com.tencent.mm.plugin.appbrand.av_device_usage;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/av_device_usage/ParcelableAVDeviceStatus;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class ParcelableAVDeviceStatus implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceStatus> CREATOR = new com.tencent.mm.plugin.appbrand.av_device_usage.i0();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f76679d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f76680e;

    /* renamed from: f, reason: collision with root package name */
    public final fb1.c f76681f;

    public ParcelableAVDeviceStatus(boolean z17, java.lang.String str) {
        this.f76679d = z17;
        this.f76680e = str;
        this.f76681f = z17 ? fb1.b.f260828a : new fb1.a(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f76679d ? 1 : 0);
        out.writeString(this.f76680e);
    }
}
