package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class JsApiInstallDownloadTask$InstallDownloadTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTask$InstallDownloadTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.l0();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f78861f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f78862g;

    /* renamed from: h, reason: collision with root package name */
    public final int f78863h;

    /* renamed from: i, reason: collision with root package name */
    public long f78864i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f78865m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f78866n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f78867o;

    public JsApiInstallDownloadTask$InstallDownloadTask(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, org.json.JSONObject jSONObject) {
        this.f78861f = k0Var;
        this.f78862g = lVar;
        this.f78863h = i17;
        this.f78864i = jSONObject.optLong("downloadId");
        this.f78865m = jSONObject.optString("appId");
        this.f78866n = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f78864i = parcel.readLong();
        this.f78865m = parcel.readString();
        this.f78866n = parcel.readInt() == 1;
        this.f78867o = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f78864i);
        parcel.writeString(this.f78865m);
        parcel.writeInt(this.f78866n ? 1 : 0);
        parcel.writeString(this.f78867o);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        boolean z17 = this.f78866n;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f78861f;
        int i17 = this.f78863h;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f78862g;
        if (z17) {
            lVar.a(i17, k0Var.o(com.tencent.mm.sdk.platformtools.t8.K0(this.f78867o) ? "fail" : java.lang.String.format("fail:%s", this.f78867o)));
        } else {
            lVar.a(i17, k0Var.o("ok"));
        }
        x();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInstallDownloadTask", "doInstallDownloadTask, downloadId = %d", java.lang.Long.valueOf(this.f78864i));
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f78865m)) {
            vz.q1 q1Var = (vz.q1) i95.n0.c(vz.q1.class);
            long j17 = this.f78864i;
            ((uz.p1) q1Var).getClass();
            h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
            if (c17 != null && c17.field_status == 3 && com.tencent.mm.vfs.w6.j(c17.field_filePath)) {
                vz.f1 f1Var = (vz.f1) i95.n0.c(vz.f1.class);
                long j18 = c17.field_downloadId;
                com.tencent.mm.plugin.appbrand.jsapi.appdownload.k0 k0Var = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.k0(this);
                ((uz.a) f1Var).getClass();
                k02.l.a(j18, false, k0Var);
            }
        } else {
            vz.q1 q1Var2 = (vz.q1) i95.n0.c(vz.q1.class);
            java.lang.String str = this.f78865m;
            ((uz.p1) q1Var2).getClass();
            h02.a d17 = com.tencent.mm.plugin.downloader.model.m0.d(str);
            if (d17 != null && d17.field_status == 3 && com.tencent.mm.vfs.w6.j(d17.field_filePath)) {
                vz.f1 f1Var2 = (vz.f1) i95.n0.c(vz.f1.class);
                long j19 = d17.field_downloadId;
                com.tencent.mm.plugin.appbrand.jsapi.appdownload.j0 j0Var = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.j0(this);
                ((uz.a) f1Var2).getClass();
                k02.l.a(j19, false, j0Var);
            }
        }
        c();
    }

    public JsApiInstallDownloadTask$InstallDownloadTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
