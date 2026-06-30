package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes.dex */
class JsApiPauseDownloadTask$PauseDownloadTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask$PauseDownloadTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.g1();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f78886f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f78887g;

    /* renamed from: h, reason: collision with root package name */
    public final int f78888h;

    /* renamed from: i, reason: collision with root package name */
    public long f78889i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f78890m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f78891n;

    public JsApiPauseDownloadTask$PauseDownloadTask(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f78886f = k0Var;
        this.f78887g = e9Var;
        this.f78888h = i17;
        this.f78889i = jSONObject.optLong("downloadId");
        this.f78890m = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f78889i = parcel.readLong();
        this.f78890m = parcel.readInt() == 1;
        this.f78891n = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f78889i);
        parcel.writeInt(this.f78890m ? 1 : 0);
        parcel.writeString(this.f78891n);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        boolean z17 = this.f78890m;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f78886f;
        int i17 = this.f78888h;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f78887g;
        if (z17) {
            e9Var.a(i17, k0Var.o(com.tencent.mm.sdk.platformtools.t8.K0(this.f78891n) ? "fail" : java.lang.String.format("fail:%s", this.f78891n)));
        } else {
            e9Var.a(i17, k0Var.o("ok"));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPauseDownloadTask", "doPauseDownloadTask, downloadId = %d", java.lang.Long.valueOf(this.f78889i));
        if (this.f78889i <= 0) {
            this.f78891n = "downloadId invalid";
        } else {
            vz.q1 q1Var = (vz.q1) i95.n0.c(vz.q1.class);
            long j17 = this.f78889i;
            ((uz.p1) q1Var).getClass();
            h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
            if (c17 == null) {
                this.f78891n = "downloadId invalid";
            } else {
                if (c17.field_downloadInWifi) {
                    c17.field_downloadInWifi = false;
                    ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                    com.tencent.mm.plugin.downloader.model.m0.l(c17);
                }
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                this.f78890m = !com.tencent.mm.plugin.downloader.model.r0.i().o(this.f78889i);
            }
        }
        c();
    }

    public JsApiPauseDownloadTask$PauseDownloadTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
