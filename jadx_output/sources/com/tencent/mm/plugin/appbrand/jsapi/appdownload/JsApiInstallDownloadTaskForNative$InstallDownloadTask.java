package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class JsApiInstallDownloadTaskForNative$InstallDownloadTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTaskForNative$InstallDownloadTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.p0();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f78868f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f78869g;

    /* renamed from: h, reason: collision with root package name */
    public final int f78870h;

    /* renamed from: i, reason: collision with root package name */
    public long f78871i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f78872m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f78873n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f78874o;

    public JsApiInstallDownloadTaskForNative$InstallDownloadTask(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, org.json.JSONObject jSONObject) {
        this.f78868f = k0Var;
        this.f78869g = lVar;
        this.f78870h = i17;
        this.f78871i = jSONObject.optLong("downloadId");
        this.f78872m = jSONObject.optString("appId");
        this.f78873n = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f78871i = parcel.readLong();
        this.f78872m = parcel.readString();
        this.f78873n = parcel.readInt() == 1;
        this.f78874o = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f78871i);
        parcel.writeString(this.f78872m);
        parcel.writeInt(this.f78873n ? 1 : 0);
        parcel.writeString(this.f78874o);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        boolean z17 = this.f78873n;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f78868f;
        int i17 = this.f78870h;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f78869g;
        if (z17) {
            lVar.a(i17, k0Var.o(com.tencent.mm.sdk.platformtools.t8.K0(this.f78874o) ? "fail" : java.lang.String.format("fail:%s", this.f78874o)));
        } else {
            lVar.a(i17, k0Var.o("ok"));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInstallDownloadTaskForNative", "doInstallDownloadTask, downloadId = %d", java.lang.Long.valueOf(this.f78871i));
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f78872m)) {
            vz.q1 q1Var = (vz.q1) i95.n0.c(vz.q1.class);
            long j17 = this.f78871i;
            ((uz.p1) q1Var).getClass();
            h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
            if (c17 != null && c17.field_status == 3 && com.tencent.mm.vfs.w6.j(c17.field_filePath)) {
                vz.f1 f1Var = (vz.f1) i95.n0.c(vz.f1.class);
                long j18 = c17.field_downloadId;
                com.tencent.mm.plugin.appbrand.jsapi.appdownload.o0 o0Var = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.o0(this);
                ((uz.a) f1Var).getClass();
                k02.l.a(j18, false, o0Var);
            }
        } else {
            vz.q1 q1Var2 = (vz.q1) i95.n0.c(vz.q1.class);
            java.lang.String str = this.f78872m;
            ((uz.p1) q1Var2).getClass();
            h02.a d17 = com.tencent.mm.plugin.downloader.model.m0.d(str);
            if (d17 != null && d17.field_status == 3 && com.tencent.mm.vfs.w6.j(d17.field_filePath)) {
                vz.f1 f1Var2 = (vz.f1) i95.n0.c(vz.f1.class);
                long j19 = d17.field_downloadId;
                com.tencent.mm.plugin.appbrand.jsapi.appdownload.n0 n0Var = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.n0(this);
                ((uz.a) f1Var2).getClass();
                k02.l.a(j19, false, n0Var);
            }
        }
        c();
    }

    public JsApiInstallDownloadTaskForNative$InstallDownloadTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
