package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class JsApiStartRecordVoice$StartRecordVoice extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice$StartRecordVoice> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.audio.c3();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.audio.d3 f79119f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f79120g;

    /* renamed from: h, reason: collision with root package name */
    public int f79121h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f79122i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f79123m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f79124n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f79125o;

    /* renamed from: p, reason: collision with root package name */
    public int f79126p;

    public JsApiStartRecordVoice$StartRecordVoice(com.tencent.mm.plugin.appbrand.jsapi.audio.d3 d3Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, int i18) {
        this.f79119f = d3Var;
        this.f79120g = e9Var;
        this.f79125o = i17;
        this.f79121h = i18;
        this.f79122i = e9Var.getAppId();
        cv.i1 i1Var = (cv.i1) i95.n0.c(cv.i1.class);
        java.lang.String fromuser = this.f79122i;
        ((bv.p0) i1Var).getClass();
        kotlin.jvm.internal.o.g(fromuser, "fromuser");
        java.lang.String n07 = w21.g1.n0(fromuser, "silk_");
        kotlin.jvm.internal.o.f(n07, "genFileName(...)");
        ik1.b0 b0Var = new ik1.b0();
        if (e9Var.getFileSystem().getTempDirectory(b0Var) == com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
            this.f79123m = new com.tencent.mm.vfs.r6((java.lang.String) b0Var.f291824a, n07).o();
        } else {
            this.f79123m = new com.tencent.mm.vfs.r6(e9Var.getContext().getCacheDir(), n07).o();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f79121h = parcel.readInt();
        this.f79122i = parcel.readString();
        this.f79123m = parcel.readString();
        this.f79124n = parcel.readByte() != 0;
        this.f79125o = parcel.readInt();
        this.f79126p = parcel.readInt();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f79121h);
        parcel.writeString(this.f79122i);
        parcel.writeString(this.f79123m);
        parcel.writeByte(this.f79124n ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f79125o);
        parcel.writeInt(this.f79126p);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        if (this.f79126p == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartRecordVoice", "fail:record_error");
            this.f79120g.a(this.f79121h, this.f79119f.o("fail:record_error"));
            return;
        }
        if (this.f79124n) {
            java.util.HashMap hashMap = new java.util.HashMap(1);
            ik1.b0 b0Var = new ik1.b0();
            if (this.f79120g.getFileSystem().createTempFileFrom(new com.tencent.mm.vfs.r6(this.f79123m), "silk", true, b0Var) == com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
                hashMap.put("tempFilePath", (java.lang.String) b0Var.f291824a);
                this.f79120g.a(this.f79121h, this.f79119f.p("ok", hashMap));
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiStartRecordVoice", "AppBrandLocalMediaObject obj is null");
                hashMap.put("tempFilePath", "");
                this.f79120g.a(this.f79121h, this.f79119f.o("fail"));
            }
        } else {
            this.f79120g.a(this.f79121h, this.f79119f.o("fail"));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartRecordVoice", "runInClientProcess, appId = %s, startRecordOk = %b", this.f79122i, java.lang.Boolean.valueOf(this.f79124n));
        this.f79119f.D(false);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        java.util.Set set = com.tencent.mm.plugin.appbrand.utils.s0.f90550a;
        ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.jsapi.audio.b3(this));
    }

    public JsApiStartRecordVoice$StartRecordVoice(android.os.Parcel parcel) {
        v(parcel);
    }
}
