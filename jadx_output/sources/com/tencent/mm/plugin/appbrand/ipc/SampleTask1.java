package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes.dex */
public class SampleTask1 extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.ipc.SampleTask1> CREATOR = new com.tencent.mm.plugin.appbrand.ipc.y0();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f78392f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f78393g;

    public SampleTask1(java.lang.String str) {
        this.f78392f = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f78392f = parcel.readString();
        this.f78393g = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f78392f);
        parcel.writeString(this.f78393g);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        com.tencent.mars.xlog.Log.e("SampleTask", this.f78393g);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mars.xlog.Log.e("SampleTask", this.f78392f);
        this.f78393g = "String from Main Process";
        c();
    }

    public SampleTask1(android.os.Parcel parcel) {
        v(parcel);
    }
}
