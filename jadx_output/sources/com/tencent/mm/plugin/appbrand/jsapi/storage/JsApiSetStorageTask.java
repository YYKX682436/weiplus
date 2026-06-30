package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class JsApiSetStorageTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiSetStorageTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.storage.l0();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f83365f;

    /* renamed from: g, reason: collision with root package name */
    public int f83366g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f83367h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f83368i;

    /* renamed from: m, reason: collision with root package name */
    public int f83369m;

    /* renamed from: n, reason: collision with root package name */
    public int f83370n;

    /* renamed from: o, reason: collision with root package name */
    public int f83371o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f83372p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f83373q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f83374r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f83375s = android.os.Process.myPid() + java.lang.String.valueOf(super.hashCode());

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f83376t;

    public final void B(java.lang.String str) {
        int length = str.length();
        int i17 = this.f83369m;
        if (length != this.f83370n + i17 + this.f83371o) {
            return;
        }
        this.f83372p = str.substring(0, i17);
        int i18 = this.f83369m;
        this.f83373q = str.substring(i18, this.f83370n + i18);
        int i19 = this.f83369m;
        int i27 = this.f83370n;
        this.f83374r = str.substring(i19 + i27, i19 + i27 + this.f83371o);
    }

    public void C(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (com.tencent.mm.plugin.appbrand.jsapi.storage.m0.a(str, str2, str3) <= 102400) {
            this.f83368i = false;
            this.f83372p = str;
            this.f83373q = str2;
            this.f83374r = str3;
            return;
        }
        this.f83369m = com.tencent.mm.plugin.appbrand.jsapi.storage.m0.a(str);
        this.f83370n = com.tencent.mm.plugin.appbrand.jsapi.storage.m0.a(str2);
        this.f83371o = com.tencent.mm.plugin.appbrand.jsapi.storage.m0.a(str3);
        try {
            com.tencent.mm.plugin.appbrand.jsapi.storage.m0.e(this.f83375s, str, str2, str3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetStorageTask", e17.getMessage());
        }
        this.f83368i = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f83365f = parcel.readString();
        this.f83366g = parcel.readInt();
        this.f83368i = parcel.readByte() != 0;
        this.f83369m = parcel.readInt();
        this.f83370n = parcel.readInt();
        this.f83371o = parcel.readInt();
        this.f83372p = parcel.readString();
        this.f83373q = parcel.readString();
        this.f83374r = parcel.readString();
        this.f83376t = parcel.readString();
        this.f83375s = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f83365f);
        parcel.writeInt(this.f83366g);
        parcel.writeByte(this.f83368i ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f83369m);
        parcel.writeInt(this.f83370n);
        parcel.writeInt(this.f83371o);
        parcel.writeString(this.f83372p);
        parcel.writeString(this.f83373q);
        parcel.writeString(this.f83374r);
        parcel.writeString(this.f83376t);
        parcel.writeString(this.f83375s);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        java.lang.Runnable runnable = this.f83367h;
        if (runnable != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.storage.h0) runnable).run();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mm.plugin.appbrand.appstorage.o Bi;
        com.tencent.mm.plugin.appbrand.appstorage.o1 l17;
        if (this.f83368i) {
            try {
                try {
                    B(com.tencent.mm.plugin.appbrand.jsapi.storage.m0.c(this.f83375s));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetStorageTask", e17.getMessage());
                }
            } finally {
                com.tencent.mm.plugin.appbrand.jsapi.storage.m0.b(this.f83375s);
            }
        }
        if (nd.f.a(oe.a.class) == null) {
            Bi = null;
        } else {
            ((com.tencent.mm.plugin.appbrand.luggage.customize.b) ((oe.a) nd.f.a(oe.a.class))).getClass();
            Bi = com.tencent.mm.plugin.appbrand.app.r9.Bi();
        }
        if (Bi == null) {
            this.f83376t = "fail:internal error get DB fail";
            this.f83372p = null;
            this.f83373q = null;
            this.f83374r = null;
            c();
            return;
        }
        synchronized (com.tencent.mm.plugin.appbrand.appstorage.o.class) {
            l17 = Bi.l(this.f83366g, this.f83365f, this.f83372p, this.f83373q, this.f83374r);
        }
        this.f83376t = com.tencent.mm.plugin.appbrand.jsapi.storage.m0.d(l17);
        this.f83372p = null;
        this.f83373q = null;
        this.f83374r = null;
        c();
    }
}
