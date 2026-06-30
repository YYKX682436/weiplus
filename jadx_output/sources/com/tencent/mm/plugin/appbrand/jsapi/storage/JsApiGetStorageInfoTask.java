package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class JsApiGetStorageInfoTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageInfoTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.storage.u();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f83345f;

    /* renamed from: g, reason: collision with root package name */
    public int f83346g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f83347h;

    /* renamed from: i, reason: collision with root package name */
    public int f83348i;

    /* renamed from: m, reason: collision with root package name */
    public int f83349m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Runnable f83350n;

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f83345f = parcel.readString();
        this.f83346g = parcel.readInt();
        this.f83347h = parcel.createStringArrayList();
        this.f83348i = parcel.readInt();
        this.f83349m = parcel.readInt();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f83345f);
        parcel.writeInt(this.f83346g);
        parcel.writeStringList(this.f83347h);
        parcel.writeInt(this.f83348i);
        parcel.writeInt(this.f83349m);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        java.lang.Runnable runnable = this.f83350n;
        if (runnable != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.storage.r) runnable).run();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mm.plugin.appbrand.appstorage.o Bi;
        java.lang.Object[] t17;
        if (nd.f.a(oe.a.class) == null) {
            Bi = null;
        } else {
            ((com.tencent.mm.plugin.appbrand.luggage.customize.b) ((oe.a) nd.f.a(oe.a.class))).getClass();
            Bi = com.tencent.mm.plugin.appbrand.app.r9.Bi();
        }
        if (Bi == null) {
            c();
            return;
        }
        synchronized (com.tencent.mm.plugin.appbrand.appstorage.o.class) {
            t17 = Bi.t(this.f83346g, this.f83345f);
        }
        this.f83347h = (java.util.ArrayList) t17[0];
        this.f83348i = (int) java.lang.Math.ceil(((java.lang.Integer) t17[1]).doubleValue() / 1000.0d);
        this.f83349m = (int) java.lang.Math.ceil(((java.lang.Integer) t17[2]).doubleValue() / 1000.0d);
        c();
    }
}
