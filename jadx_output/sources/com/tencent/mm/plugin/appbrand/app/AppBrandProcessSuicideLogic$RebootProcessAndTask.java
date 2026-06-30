package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public class AppBrandProcessSuicideLogic$RebootProcessAndTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.app.AppBrandProcessSuicideLogic$RebootProcessAndTask> CREATOR = new com.tencent.mm.plugin.appbrand.app.u0();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f74993f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f74994g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.report.AppBrandStatObject f74995h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f74996i;

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f74993f = parcel.readString();
        this.f74994g = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) parcel.readParcelable(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC.class.getClassLoader());
        this.f74995h = (com.tencent.mm.plugin.appbrand.report.AppBrandStatObject) parcel.readParcelable(com.tencent.mm.plugin.appbrand.report.AppBrandStatObject.class.getClassLoader());
        this.f74996i = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f74993f);
        parcel.writeParcelable(this.f74994g, i17);
        parcel.writeParcelable(this.f74995h, i17);
        parcel.writeString(this.f74996i);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        jx3.f.INSTANCE.idkeyStat(365L, 5L, 1L, false);
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new com.tencent.mm.plugin.appbrand.app.t0(this), 500L);
    }
}
