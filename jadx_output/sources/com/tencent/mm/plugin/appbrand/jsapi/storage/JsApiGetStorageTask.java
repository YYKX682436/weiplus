package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class JsApiGetStorageTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.storage.w();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f83351f;

    /* renamed from: g, reason: collision with root package name */
    public int f83352g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f83353h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f83354i;

    /* renamed from: m, reason: collision with root package name */
    public int f83355m;

    /* renamed from: n, reason: collision with root package name */
    public int f83356n;

    /* renamed from: o, reason: collision with root package name */
    public int f83357o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f83358p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f83359q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f83360r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f83361s;

    public final void B(java.lang.String str) {
        int length = str.length();
        int i17 = this.f83356n;
        if (length != this.f83357o + i17) {
            return;
        }
        this.f83359q = str.substring(0, i17);
        int i18 = this.f83356n;
        this.f83360r = str.substring(i18, this.f83357o + i18);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f83351f = parcel.readString();
        this.f83352g = parcel.readInt();
        this.f83354i = parcel.readByte() != 0;
        this.f83355m = parcel.readInt();
        this.f83356n = parcel.readInt();
        this.f83357o = parcel.readInt();
        this.f83358p = parcel.readString();
        this.f83359q = parcel.readString();
        this.f83360r = parcel.readString();
        this.f83361s = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f83351f);
        parcel.writeInt(this.f83352g);
        parcel.writeByte(this.f83354i ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f83355m);
        parcel.writeInt(this.f83356n);
        parcel.writeInt(this.f83357o);
        parcel.writeString(this.f83358p);
        parcel.writeString(this.f83359q);
        parcel.writeString(this.f83360r);
        parcel.writeString(this.f83361s);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        if (this.f83354i) {
            try {
                try {
                    B(com.tencent.mm.plugin.appbrand.jsapi.storage.m0.c(this.f83361s));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetStorageTask", e17.getMessage());
                }
            } finally {
                com.tencent.mm.plugin.appbrand.jsapi.storage.m0.b(this.f83361s);
            }
        }
        java.lang.Runnable runnable = this.f83353h;
        if (runnable != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.storage.o) runnable).run();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        if (((oe.a) nd.f.a(oe.a.class)) == null) {
            c();
            return;
        }
        ((com.tencent.mm.plugin.appbrand.luggage.customize.b) ((oe.a) nd.f.a(oe.a.class))).getClass();
        com.tencent.mm.plugin.appbrand.appstorage.o Bi = com.tencent.mm.plugin.appbrand.app.r9.Bi();
        if (Bi == null) {
            c();
            return;
        }
        java.lang.Object[] o17 = Bi.o(this.f83352g, this.f83351f, this.f83358p);
        if (((com.tencent.mm.plugin.appbrand.appstorage.o1) o17[0]) == com.tencent.mm.plugin.appbrand.appstorage.o1.NONE) {
            java.lang.String str = (java.lang.String) o17[1];
            java.lang.String str2 = (java.lang.String) o17[2];
            if (com.tencent.mm.plugin.appbrand.jsapi.storage.m0.a(str, str2) > 102400) {
                this.f83356n = com.tencent.mm.plugin.appbrand.jsapi.storage.m0.a(str);
                this.f83357o = com.tencent.mm.plugin.appbrand.jsapi.storage.m0.a(str2);
                try {
                    com.tencent.mm.plugin.appbrand.jsapi.storage.m0.e(this.f83361s, str, str2);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetStorageTask", e17.getMessage());
                }
                this.f83354i = true;
            } else {
                this.f83354i = false;
                this.f83359q = str;
                this.f83360r = str2;
            }
        }
        c();
    }
}
