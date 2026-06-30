package com.tencent.mm.plugin.appbrand.performance;

/* loaded from: classes7.dex */
class AppBrandPerformanceManager$SetAppPerformanceModeTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.performance.AppBrandPerformanceManager$SetAppPerformanceModeTask> CREATOR = new com.tencent.mm.plugin.appbrand.performance.g();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f87322f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f87323g;

    private AppBrandPerformanceManager$SetAppPerformanceModeTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f87322f = parcel.readString();
        this.f87323g = parcel.readByte() != 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f87322f);
        parcel.writeByte(this.f87323g ? (byte) 1 : (byte) 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        ((com.tencent.mm.plugin.appbrand.luggage.customize.b) ((oe.a) nd.f.a(oe.a.class))).getClass();
        com.tencent.mm.plugin.appbrand.app.r9.Ui().P2(this.f87322f + "_PerformancePanelEnabled", this.f87323g ? "1" : "0");
    }
}
