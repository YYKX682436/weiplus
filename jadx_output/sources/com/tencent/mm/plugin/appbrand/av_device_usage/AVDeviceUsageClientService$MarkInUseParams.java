package com.tencent.mm.plugin.appbrand.av_device_usage;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/appbrand/av_device_usage/AVDeviceUsageClientService$MarkInUseParams", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class AVDeviceUsageClientService$MarkInUseParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.av_device_usage.AVDeviceUsageClientService$MarkInUseParams> CREATOR = new com.tencent.mm.plugin.appbrand.av_device_usage.a();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene f76673d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f76674e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f76675f;

    public AVDeviceUsageClientService$MarkInUseParams(com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene parcelableScene, boolean z17, java.lang.String token) {
        kotlin.jvm.internal.o.g(parcelableScene, "parcelableScene");
        kotlin.jvm.internal.o.g(token, "token");
        this.f76673d = parcelableScene;
        this.f76674e = z17;
        this.f76675f = token;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        this.f76673d.writeToParcel(out, i17);
        out.writeInt(this.f76674e ? 1 : 0);
        out.writeString(this.f76675f);
    }
}
