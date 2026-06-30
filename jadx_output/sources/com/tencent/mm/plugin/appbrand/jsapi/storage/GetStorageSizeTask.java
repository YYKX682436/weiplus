package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class GetStorageSizeTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.storage.GetStorageSizeTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.storage.b();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f83340f;

    /* renamed from: g, reason: collision with root package name */
    public int f83341g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f83342h;

    public GetStorageSizeTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f83340f = parcel.readString();
        this.f83341g = parcel.readInt();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeString(this.f83340f);
        parcel.writeInt(this.f83341g);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        java.lang.Runnable runnable = this.f83342h;
        if (runnable != null) {
            ((com.tencent.mm.plugin.appbrand.performance.d) runnable).run();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mm.plugin.appbrand.appstorage.o Bi;
        if (nd.f.a(oe.a.class) == null) {
            Bi = null;
        } else {
            ((com.tencent.mm.plugin.appbrand.luggage.customize.b) ((oe.a) nd.f.a(oe.a.class))).getClass();
            Bi = com.tencent.mm.plugin.appbrand.app.r9.Bi();
        }
        if (Bi == null) {
            c();
        } else {
            this.f83341g = Bi.K(this.f83340f);
            c();
        }
    }

    public GetStorageSizeTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
