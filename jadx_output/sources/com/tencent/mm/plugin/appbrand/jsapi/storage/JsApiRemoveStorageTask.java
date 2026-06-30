package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class JsApiRemoveStorageTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiRemoveStorageTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.storage.d0();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f83362f;

    /* renamed from: g, reason: collision with root package name */
    public int f83363g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f83364h;

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f83362f = parcel.readString();
        this.f83363g = parcel.readInt();
        this.f83364h = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f83362f);
        parcel.writeInt(this.f83363g);
        parcel.writeString(this.f83364h);
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
        Bi.q(this.f83363g, this.f83362f, this.f83364h);
    }
}
