package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class JsApiAddDownloadTaskForNative$AddDownloadTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskForNative$AddDownloadTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.s();
    public java.lang.String A;
    public long B;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f78802f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f78803g;

    /* renamed from: h, reason: collision with root package name */
    public final int f78804h;

    /* renamed from: i, reason: collision with root package name */
    public org.json.JSONObject f78805i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f78806m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f78807n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f78808o;

    /* renamed from: p, reason: collision with root package name */
    public long f78809p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f78810q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f78811r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f78812s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f78813t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f78814u;

    /* renamed from: v, reason: collision with root package name */
    public int f78815v;

    /* renamed from: w, reason: collision with root package name */
    public int f78816w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f78817x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f78818y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f78819z;

    public JsApiAddDownloadTaskForNative$AddDownloadTask(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f78802f = k0Var;
        this.f78803g = e9Var;
        this.f78804h = i17;
        this.f78805i = jSONObject;
        this.f78806m = jSONObject.optString("taskName");
        this.f78807n = jSONObject.optString("taskUrl");
        this.f78808o = jSONObject.optString("fileMd5");
        this.f78809p = jSONObject.optInt("taskSize", 0);
        this.f78810q = jSONObject.optString("extInfo");
        this.f78811r = jSONObject.optString("fileType");
        this.f78812s = jSONObject.optString("appId");
        this.f78813t = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
        this.f78814u = jSONObject.optBoolean("downloadInWifi", false);
        this.f78815v = jSONObject.optInt("downloaderType", 0);
        this.f78817x = jSONObject.optBoolean("useDownloaderWidget", false);
        this.f78816w = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, com.tencent.liteav.TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE);
        this.f78818y = jSONObject.optString("alterUrl");
        this.f78819z = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f78806m = parcel.readString();
        this.f78807n = parcel.readString();
        this.f78808o = parcel.readString();
        this.f78809p = parcel.readLong();
        this.f78810q = parcel.readString();
        this.f78811r = parcel.readString();
        this.f78812s = parcel.readString();
        this.f78813t = parcel.readString();
        this.f78814u = parcel.readInt() == 1;
        this.f78815v = parcel.readInt();
        this.f78819z = parcel.readInt() == 1;
        this.A = parcel.readString();
        this.B = parcel.readLong();
        this.f78816w = parcel.readInt();
        this.f78817x = parcel.readInt() == 1;
        try {
            this.f78805i = new org.json.JSONObject(parcel.readString());
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
        this.f78818y = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f78806m);
        parcel.writeString(this.f78807n);
        parcel.writeString(this.f78808o);
        parcel.writeLong(this.f78809p);
        parcel.writeString(this.f78810q);
        parcel.writeString(this.f78811r);
        parcel.writeString(this.f78812s);
        parcel.writeString(this.f78813t);
        parcel.writeInt(this.f78814u ? 1 : 0);
        parcel.writeInt(this.f78815v);
        parcel.writeInt(this.f78819z ? 1 : 0);
        parcel.writeString(this.A);
        parcel.writeLong(this.B);
        parcel.writeInt(this.f78816w);
        parcel.writeInt(this.f78817x ? 1 : 0);
        org.json.JSONObject jSONObject = this.f78805i;
        parcel.writeString(jSONObject != null ? jSONObject.toString() : "");
        parcel.writeString(this.f78818y);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        x();
        boolean z17 = this.f78819z;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f78802f;
        int i17 = this.f78804h;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f78803g;
        if (z17) {
            e9Var.a(i17, k0Var.o(com.tencent.mm.sdk.platformtools.t8.K0(this.A) ? "fail" : java.lang.String.format("fail:%s", this.A)));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("downloadId", java.lang.Long.valueOf(this.B));
        e9Var.a(i17, k0Var.p("ok", hashMap));
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        long b17;
        gm0.j1.i();
        if (gm0.j1.u().l()) {
            long j17 = this.f78809p;
            if (j17 > 0 && !fp.i.c(j17)) {
                this.A = "fail_sdcard_has_not_enough_space";
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f78807n)) {
                this.A = "fail_invalid_url";
            } else if (this.f78817x) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                com.tencent.mm.plugin.downloader_app.model.a a17 = com.tencent.mm.plugin.downloader_app.model.a.a(this.f78805i);
                vz.a2 a2Var = (vz.a2) i95.n0.c(vz.a2.class);
                com.tencent.mm.plugin.appbrand.jsapi.appdownload.r rVar = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.r(this);
                ((uz.c2) a2Var).getClass();
                com.tencent.mm.plugin.downloader.model.j1.c(context, a17, false, rVar);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddDownloadTaskForNative", "runInMainProcess taskUrl:%s md5:%s", this.f78807n, this.f78808o);
                com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
                t0Var.f97150a = this.f78807n;
                t0Var.f97152c = this.f78809p;
                t0Var.f97153d = this.f78806m;
                t0Var.f97154e = this.f78808o;
                t0Var.f97156g = this.f78812s;
                t0Var.f97157h = this.f78813t;
                t0Var.f97158i = true;
                t0Var.f97155f = com.tencent.mm.sdk.platformtools.t8.P(this.f78811r, 1);
                t0Var.f97161l = this.f78816w;
                t0Var.f97166q = this.f78810q;
                t0Var.f97164o = true;
                t0Var.f97151b = this.f78818y;
                if (this.f78815v == 1) {
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    b17 = com.tencent.mm.plugin.downloader.model.r0.i().c(t0Var);
                } else {
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    b17 = com.tencent.mm.plugin.downloader.model.r0.i().b(t0Var);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddDownloadTaskForNative", "doAddDownloadTaskStraight, downloadId = " + b17);
                if (b17 <= 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddDownloadTaskForNative", "doAddDownloadTaskStraight fail, downloadId = " + b17);
                    this.A = "";
                } else {
                    this.f78819z = false;
                    this.B = b17;
                }
            }
        } else {
            this.A = "fail_sdcard_not_ready";
        }
        c();
    }

    public JsApiAddDownloadTaskForNative$AddDownloadTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
