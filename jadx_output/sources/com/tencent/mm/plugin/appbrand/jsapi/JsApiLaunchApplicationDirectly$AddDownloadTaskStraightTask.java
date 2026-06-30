package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
class JsApiLaunchApplicationDirectly$AddDownloadTaskStraightTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$AddDownloadTaskStraightTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.s7();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f78541f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f78542g;

    /* renamed from: h, reason: collision with root package name */
    public final int f78543h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f78544i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f78545m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f78546n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f78547o;

    /* renamed from: p, reason: collision with root package name */
    public long f78548p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f78549q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f78550r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f78551s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f78552t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f78553u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f78554v;

    /* renamed from: w, reason: collision with root package name */
    public long f78555w;

    public JsApiLaunchApplicationDirectly$AddDownloadTaskStraightTask(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f78541f = k0Var;
        this.f78542g = e9Var;
        this.f78543h = i17;
        this.f78544i = jSONObject.optString("taskName");
        this.f78545m = jSONObject.optString("taskUrl");
        this.f78546n = jSONObject.optString("fileMd5");
        this.f78547o = jSONObject.optString("alternativeUrl");
        this.f78548p = jSONObject.optInt("taskSize", 0);
        this.f78549q = jSONObject.optString("extInfo");
        this.f78550r = jSONObject.optString("fileType");
        this.f78551s = jSONObject.optString("appId");
        this.f78552t = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
        this.f78553u = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f78544i = parcel.readString();
        this.f78545m = parcel.readString();
        this.f78546n = parcel.readString();
        this.f78547o = parcel.readString();
        this.f78548p = parcel.readLong();
        this.f78549q = parcel.readString();
        this.f78550r = parcel.readString();
        this.f78551s = parcel.readString();
        this.f78552t = parcel.readString();
        this.f78553u = parcel.readInt() == 1;
        this.f78554v = parcel.readString();
        this.f78555w = parcel.readLong();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f78544i);
        parcel.writeString(this.f78545m);
        parcel.writeString(this.f78546n);
        parcel.writeString(this.f78547o);
        parcel.writeLong(this.f78548p);
        parcel.writeString(this.f78549q);
        parcel.writeString(this.f78550r);
        parcel.writeString(this.f78551s);
        parcel.writeString(this.f78552t);
        parcel.writeInt(this.f78553u ? 1 : 0);
        parcel.writeString(this.f78554v);
        parcel.writeLong(this.f78555w);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        boolean z17 = this.f78553u;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f78541f;
        int i17 = this.f78543h;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f78542g;
        if (z17) {
            e9Var.a(i17, k0Var.o(com.tencent.mm.sdk.platformtools.t8.K0(this.f78554v) ? "fail" : java.lang.String.format("fail:%s", this.f78554v)));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("downloadId", java.lang.Long.valueOf(this.f78555w));
        e9Var.a(i17, k0Var.p("ok", hashMap));
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        gm0.j1.i();
        if (gm0.j1.u().l()) {
            long j17 = this.f78548p;
            if (j17 > 0 && !fp.i.c(j17)) {
                this.f78554v = "fail_sdcard_has_not_enough_space";
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f78545m)) {
                this.f78554v = "fail_invalid_url";
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "runInMainProcess taskUrl:%s md5:%s", this.f78545m, this.f78546n);
                com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
                t0Var.f97150a = this.f78545m;
                t0Var.f97151b = this.f78547o;
                t0Var.f97152c = this.f78548p;
                t0Var.f97153d = this.f78544i;
                t0Var.f97154e = this.f78546n;
                t0Var.f97156g = this.f78551s;
                t0Var.f97157h = this.f78552t;
                t0Var.f97158i = true;
                t0Var.f97155f = com.tencent.mm.sdk.platformtools.t8.P(this.f78550r, 1);
                t0Var.f97161l = com.tencent.liteav.TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE;
                t0Var.f97166q = this.f78549q;
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                long b17 = com.tencent.mm.plugin.downloader.model.r0.i().b(t0Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "doAddDownloadTaskStraight, downloadId = " + b17);
                if (b17 <= 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiLaunchApplicationDirectly", "doAddDownloadTaskStraight fail, downloadId = " + b17);
                    this.f78554v = "";
                } else {
                    this.f78553u = false;
                    this.f78555w = b17;
                }
            }
        } else {
            this.f78554v = "fail_sdcard_not_ready";
        }
        c();
    }

    public JsApiLaunchApplicationDirectly$AddDownloadTaskStraightTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
