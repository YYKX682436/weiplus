package com.tencent.mm.plugin.appbrand.custom_loading;

/* loaded from: classes7.dex */
public class CustomLoadingEnterFullscreenIPCData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.custom_loading.CustomLoadingEnterFullscreenIPCData> CREATOR = new n91.d();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f77551d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f77552e;

    public CustomLoadingEnterFullscreenIPCData(android.os.Parcel parcel) {
        this.f77551d = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC.class.getClassLoader());
        this.f77552e = (com.tencent.mm.plugin.appbrand.report.AppBrandStatObject) parcel.readParcelable(com.tencent.mm.plugin.appbrand.report.AppBrandStatObject.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f77551d, i17);
        parcel.writeParcelable(this.f77552e, i17);
    }
}
