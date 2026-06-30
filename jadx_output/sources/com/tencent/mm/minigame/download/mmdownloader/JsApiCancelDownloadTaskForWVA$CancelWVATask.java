package com.tencent.mm.minigame.download.mmdownloader;

/* loaded from: classes.dex */
class JsApiCancelDownloadTaskForWVA$CancelWVATask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.minigame.download.mmdownloader.JsApiCancelDownloadTaskForWVA$CancelWVATask> CREATOR = new com.tencent.mm.minigame.download.mmdownloader.h();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f69028f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f69029g;

    /* renamed from: h, reason: collision with root package name */
    public final int f69030h;

    /* renamed from: i, reason: collision with root package name */
    public long f69031i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f69032m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f69033n;

    public JsApiCancelDownloadTaskForWVA$CancelWVATask(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f69028f = k0Var;
        this.f69029g = e9Var;
        this.f69030h = i17;
        long optLong = jSONObject.optLong("downloadId");
        this.f69031i = optLong;
        this.f69032m = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.WVA.cancelDownloadTaskForWVA", "CancelWVATask:%d", java.lang.Long.valueOf(optLong));
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f69031i = parcel.readLong();
        this.f69032m = parcel.readInt() == 1;
        this.f69033n = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f69031i);
        parcel.writeInt(this.f69032m ? 1 : 0);
        parcel.writeString(this.f69033n);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        boolean z17 = this.f69032m;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f69028f;
        int i17 = this.f69030h;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f69029g;
        if (z17) {
            e9Var.a(i17, k0Var.o(com.tencent.mm.sdk.platformtools.t8.K0(this.f69033n) ? "fail" : java.lang.String.format("fail:%s", this.f69033n)));
        } else {
            e9Var.a(i17, k0Var.o("ok"));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WVA.cancelDownloadTaskForWVA", "doCancelDownloadTask, downloadId = %d", java.lang.Long.valueOf(this.f69031i));
        if (this.f69031i <= 0) {
            this.f69033n = "downloadId invalid";
        } else {
            this.f69032m = false;
            vz.q1 q1Var = (vz.q1) i95.n0.c(vz.q1.class);
            long j17 = this.f69031i;
            ((uz.p1) q1Var).getClass();
            h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
            if (c17 == null || c17.field_status != 3) {
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.tencent.mm.plugin.downloader.model.r0.i().t(this.f69031i);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.WVA.cancelDownloadTaskForWVA", "canceldownloadtask, path: %s", c17.field_filePath);
                com.tencent.mm.vfs.w6.h(c17.field_filePath);
                vz.q1 q1Var2 = (vz.q1) i95.n0.c(vz.q1.class);
                java.lang.String str = c17.field_downloadUrl;
                ((uz.p1) q1Var2).getClass();
                com.tencent.mm.plugin.downloader.model.m0.k(str);
            }
        }
        c();
    }

    public JsApiCancelDownloadTaskForWVA$CancelWVATask(android.os.Parcel parcel) {
        v(parcel);
    }
}
