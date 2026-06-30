package com.tencent.mm.plugin.appbrand.av_device_usage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/av_device_usage/ParcelableAVDeviceUsageScene;", "", "Landroid/os/Parcelable;", "com/tencent/mm/plugin/appbrand/av_device_usage/j0", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class ParcelableAVDeviceUsageScene implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene> CREATOR;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.av_device_usage.j0 f76682e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene[] f76683f;

    /* renamed from: d, reason: collision with root package name */
    public final fb1.d f76684d;

    static {
        com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene[] parcelableAVDeviceUsageSceneArr = {new com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene("Phone", 0, fb1.d.f260829d), new com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene("VOIP", 1, fb1.d.f260830e), new com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene("LivePusher", 2, fb1.d.f260831f), new com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene("AppBrandVOIP", 3, fb1.d.f260832g), new com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene("AppBrandLivePusher", 4, fb1.d.f260833h), new com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene("AppBrandLivePlayer", 5, fb1.d.f260834i)};
        f76683f = parcelableAVDeviceUsageSceneArr;
        rz5.b.a(parcelableAVDeviceUsageSceneArr);
        f76682e = new com.tencent.mm.plugin.appbrand.av_device_usage.j0(null);
        CREATOR = new com.tencent.mm.plugin.appbrand.av_device_usage.k0();
    }

    public ParcelableAVDeviceUsageScene(java.lang.String str, int i17, fb1.d dVar) {
        this.f76684d = dVar;
    }

    public static com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene) java.lang.Enum.valueOf(com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene.class, str);
    }

    public static com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene[] values() {
        return (com.tencent.mm.plugin.appbrand.av_device_usage.ParcelableAVDeviceUsageScene[]) f76683f.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(name());
    }
}
