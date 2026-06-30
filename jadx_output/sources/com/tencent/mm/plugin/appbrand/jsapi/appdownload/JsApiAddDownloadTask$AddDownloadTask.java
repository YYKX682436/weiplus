package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes.dex */
class JsApiAddDownloadTask$AddDownloadTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTask$AddDownloadTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.p();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f78785f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f78786g;

    /* renamed from: h, reason: collision with root package name */
    public final int f78787h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f78788i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f78789m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f78790n;

    /* renamed from: o, reason: collision with root package name */
    public long f78791o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f78792p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f78793q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f78794r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f78795s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f78796t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f78797u;

    /* renamed from: v, reason: collision with root package name */
    public int f78798v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f78799w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f78800x;

    /* renamed from: y, reason: collision with root package name */
    public long f78801y;

    public JsApiAddDownloadTask$AddDownloadTask(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f78785f = k0Var;
        this.f78786g = e9Var;
        this.f78787h = i17;
        this.f78788i = jSONObject.optString("taskName");
        this.f78789m = jSONObject.optString("taskUrl");
        this.f78790n = jSONObject.optString("fileMd5");
        this.f78791o = jSONObject.optInt("taskSize", 0);
        this.f78792p = jSONObject.optString("extInfo");
        this.f78793q = jSONObject.optString("fileType");
        this.f78794r = jSONObject.optString("appId");
        this.f78795s = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
        this.f78796t = jSONObject.optBoolean("downloadInWifi", false);
        this.f78797u = jSONObject.optBoolean("showNotification", false);
        this.f78798v = jSONObject.optInt("downloaderType", 0);
        this.f78799w = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f78788i = parcel.readString();
        this.f78789m = parcel.readString();
        this.f78790n = parcel.readString();
        this.f78791o = parcel.readLong();
        this.f78792p = parcel.readString();
        this.f78793q = parcel.readString();
        this.f78794r = parcel.readString();
        this.f78795s = parcel.readString();
        this.f78796t = parcel.readByte() == 1;
        this.f78797u = parcel.readByte() == 1;
        this.f78798v = parcel.readInt();
        this.f78799w = parcel.readInt() == 1;
        this.f78800x = parcel.readString();
        this.f78801y = parcel.readLong();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f78788i);
        parcel.writeString(this.f78789m);
        parcel.writeString(this.f78790n);
        parcel.writeLong(this.f78791o);
        parcel.writeString(this.f78792p);
        parcel.writeString(this.f78793q);
        parcel.writeString(this.f78794r);
        parcel.writeString(this.f78795s);
        parcel.writeByte(this.f78796t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f78797u ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f78798v);
        parcel.writeInt(this.f78799w ? 1 : 0);
        parcel.writeString(this.f78800x);
        parcel.writeLong(this.f78801y);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        x();
        boolean z17 = this.f78799w;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f78785f;
        int i17 = this.f78787h;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f78786g;
        if (z17) {
            e9Var.a(i17, k0Var.o(com.tencent.mm.sdk.platformtools.t8.K0(this.f78800x) ? "fail" : java.lang.String.format("fail:%s", this.f78800x)));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("downloadId", java.lang.Long.valueOf(this.f78801y));
        e9Var.a(i17, k0Var.p("ok", hashMap));
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        long b17;
        gm0.j1.i();
        if (gm0.j1.u().l()) {
            long j17 = this.f78791o;
            if (j17 > 0 && !fp.i.c(j17)) {
                this.f78800x = "fail_sdcard_has_not_enough_space";
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f78789m)) {
                this.f78800x = "fail_invalid_url";
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddDownloadTask", "runInMainProcess taskUrl:%s md5:%s", this.f78789m, this.f78790n);
                com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
                t0Var.f97150a = this.f78789m;
                t0Var.f97152c = this.f78791o;
                t0Var.f97153d = this.f78788i;
                t0Var.f97154e = this.f78790n;
                t0Var.f97156g = this.f78794r;
                t0Var.f97157h = this.f78795s;
                t0Var.f97158i = true;
                t0Var.f97155f = com.tencent.mm.sdk.platformtools.t8.P(this.f78793q, 1);
                t0Var.f97161l = com.tencent.liteav.TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE;
                t0Var.f97166q = this.f78792p;
                t0Var.f97159j = this.f78797u;
                t0Var.f97163n = this.f78796t;
                t0Var.f97158i = false;
                t0Var.f97164o = true;
                if (this.f78798v == 1) {
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    b17 = com.tencent.mm.plugin.downloader.model.r0.i().c(t0Var);
                } else {
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    b17 = com.tencent.mm.plugin.downloader.model.r0.i().b(t0Var);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddDownloadTask", "doAddDownloadTaskStraight, downloadId = " + b17);
                if (b17 <= 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddDownloadTask", "doAddDownloadTaskStraight fail, downloadId = " + b17);
                    this.f78800x = "";
                } else {
                    this.f78799w = false;
                    this.f78801y = b17;
                }
            }
        } else {
            this.f78800x = "fail_sdcard_not_ready";
        }
        c();
    }

    public JsApiAddDownloadTask$AddDownloadTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
