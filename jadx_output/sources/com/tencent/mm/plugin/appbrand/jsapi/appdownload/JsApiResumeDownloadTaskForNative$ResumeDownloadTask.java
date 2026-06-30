package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes.dex */
public class JsApiResumeDownloadTaskForNative$ResumeDownloadTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiResumeDownloadTaskForNative$ResumeDownloadTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.p1();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f78922f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f78923g;

    /* renamed from: h, reason: collision with root package name */
    public final int f78924h;

    /* renamed from: i, reason: collision with root package name */
    public long f78925i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f78926m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f78927n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f78928o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f78929p;

    public JsApiResumeDownloadTaskForNative$ResumeDownloadTask(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f78922f = k0Var;
        this.f78923g = e9Var;
        this.f78924h = i17;
        this.f78925i = jSONObject.optLong("downloadId");
        this.f78927n = jSONObject.optBoolean("useDownloaderWidget", false);
        this.f78926m = jSONObject.optBoolean("downloadInWifi", false);
        this.f78928o = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f78925i = parcel.readLong();
        this.f78926m = parcel.readByte() == 1;
        this.f78928o = parcel.readInt() == 1;
        this.f78929p = parcel.readString();
        this.f78927n = parcel.readInt() == 1;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f78925i);
        parcel.writeByte(this.f78926m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f78928o ? 1 : 0);
        parcel.writeString(this.f78929p);
        parcel.writeInt(this.f78927n ? 1 : 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        boolean z17 = this.f78928o;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f78922f;
        int i17 = this.f78924h;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f78923g;
        if (z17) {
            e9Var.a(i17, k0Var.o(com.tencent.mm.sdk.platformtools.t8.K0(this.f78929p) ? "fail" : java.lang.String.format("fail:%s", this.f78929p)));
        } else {
            e9Var.a(i17, k0Var.o("ok"));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiResumeDownloadTaskForNative", "doResumeDownloadTask, downloadId = %d", java.lang.Long.valueOf(this.f78925i));
        long j17 = this.f78925i;
        if (j17 <= 0) {
            this.f78929p = "downloadId invalid";
        } else if (this.f78927n) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            boolean z17 = this.f78926m;
            vz.a2 a2Var = (vz.a2) i95.n0.c(vz.a2.class);
            com.tencent.mm.plugin.appbrand.jsapi.appdownload.o1 o1Var = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.o1(this);
            ((uz.c2) a2Var).getClass();
            com.tencent.mm.plugin.downloader.model.j1.f(context, j17, z17, false, false, o1Var);
        } else {
            vz.q1 q1Var = (vz.q1) i95.n0.c(vz.q1.class);
            long j18 = this.f78925i;
            ((uz.p1) q1Var).getClass();
            h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j18);
            if (c17 != null) {
                c17.field_downloadInWifi = false;
                c17.field_fromDownloadApp = false;
                c17.field_showNotification = true;
                ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                com.tencent.mm.plugin.downloader.model.m0.l(c17);
            }
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            this.f78928o = !com.tencent.mm.plugin.downloader.model.r0.i().w(this.f78925i);
        }
        c();
    }

    public JsApiResumeDownloadTaskForNative$ResumeDownloadTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
