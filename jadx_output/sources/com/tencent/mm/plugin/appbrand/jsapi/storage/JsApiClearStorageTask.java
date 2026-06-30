package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class JsApiClearStorageTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiClearStorageTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.storage.j();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f83343f;

    /* renamed from: g, reason: collision with root package name */
    public int f83344g;

    public JsApiClearStorageTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f83343f = parcel.readString();
        this.f83344g = parcel.readInt();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f83343f);
        parcel.writeInt(this.f83344g);
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
            return;
        }
        Bi.k(this.f83344g, this.f83343f);
    }

    public JsApiClearStorageTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
