package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes.dex */
class JsApiAddDownloadTaskStraight$AddDownloadTaskStraightTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskStraight$AddDownloadTaskStraightTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.appdownload.u();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f78820f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f78821g;

    /* renamed from: h, reason: collision with root package name */
    public final int f78822h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f78823i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f78824m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f78825n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f78826o;

    /* renamed from: p, reason: collision with root package name */
    public long f78827p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f78828q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f78829r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f78830s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f78831t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f78832u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f78833v;

    /* renamed from: w, reason: collision with root package name */
    public long f78834w;

    public JsApiAddDownloadTaskStraight$AddDownloadTaskStraightTask(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f78820f = k0Var;
        this.f78821g = e9Var;
        this.f78822h = i17;
        this.f78823i = jSONObject.optString("taskName");
        this.f78824m = jSONObject.optString("taskUrl");
        this.f78825n = jSONObject.optString("fileMd5");
        this.f78826o = jSONObject.optString("alternativeUrl");
        this.f78827p = jSONObject.optInt("taskSize", 0);
        this.f78828q = jSONObject.optString("extInfo");
        this.f78829r = jSONObject.optString("fileType");
        this.f78830s = e9Var.getAppId();
        this.f78831t = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
        this.f78832u = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f78823i = parcel.readString();
        this.f78824m = parcel.readString();
        this.f78825n = parcel.readString();
        this.f78826o = parcel.readString();
        this.f78827p = parcel.readLong();
        this.f78828q = parcel.readString();
        this.f78829r = parcel.readString();
        this.f78830s = parcel.readString();
        this.f78831t = parcel.readString();
        this.f78832u = parcel.readInt() == 1;
        this.f78833v = parcel.readString();
        this.f78834w = parcel.readLong();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f78823i);
        parcel.writeString(this.f78824m);
        parcel.writeString(this.f78825n);
        parcel.writeString(this.f78826o);
        parcel.writeLong(this.f78827p);
        parcel.writeString(this.f78828q);
        parcel.writeString(this.f78829r);
        parcel.writeString(this.f78830s);
        parcel.writeString(this.f78831t);
        parcel.writeInt(this.f78832u ? 1 : 0);
        parcel.writeString(this.f78833v);
        parcel.writeLong(this.f78834w);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        boolean z17 = this.f78832u;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f78820f;
        int i17 = this.f78822h;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f78821g;
        if (z17) {
            e9Var.a(i17, k0Var.o(com.tencent.mm.sdk.platformtools.t8.K0(this.f78833v) ? "fail" : java.lang.String.format("fail:%s", this.f78833v)));
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("downloadId", java.lang.Long.valueOf(this.f78834w));
            e9Var.a(i17, k0Var.p("ok", hashMap));
        }
        x();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        gm0.j1.i();
        if (gm0.j1.u().l()) {
            long j17 = this.f78827p;
            if (j17 > 0 && !fp.i.c(j17)) {
                this.f78833v = "fail_sdcard_has_not_enough_space";
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f78824m)) {
                this.f78833v = "fail_invalid_url";
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddDownloadTaskStraight", "runInMainProcess taskUrl:%s md5:%s", this.f78824m, this.f78825n);
                com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
                t0Var.f97150a = this.f78824m;
                t0Var.f97151b = this.f78826o;
                t0Var.f97152c = this.f78827p;
                t0Var.f97153d = this.f78823i;
                t0Var.f97154e = this.f78825n;
                t0Var.f97156g = this.f78830s;
                t0Var.f97157h = this.f78831t;
                t0Var.f97158i = true;
                t0Var.f97155f = com.tencent.mm.sdk.platformtools.t8.P(this.f78829r, 1);
                t0Var.f97161l = com.tencent.liteav.TXLiteAVCode.WARNING_IGNORE_UPSTREAM_FOR_AUDIENCE;
                t0Var.f97166q = this.f78828q;
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                long b17 = com.tencent.mm.plugin.downloader.model.r0.i().b(t0Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiAddDownloadTaskStraight", "doAddDownloadTaskStraight, downloadId = " + b17);
                if (b17 <= 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.JsApiAddDownloadTaskStraight", "doAddDownloadTaskStraight fail, downloadId = " + b17);
                    this.f78833v = "";
                } else {
                    this.f78832u = false;
                    this.f78834w = b17;
                }
            }
        } else {
            this.f78833v = "fail_sdcard_not_ready";
        }
        c();
    }

    public JsApiAddDownloadTaskStraight$AddDownloadTaskStraightTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
