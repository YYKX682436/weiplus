package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
class JsApiResumeDownloadTask$ResumeDownloadTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiResumeDownloadTask$ResumeDownloadTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.oc();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f78610f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f78611g;

    /* renamed from: h, reason: collision with root package name */
    public final int f78612h;

    /* renamed from: i, reason: collision with root package name */
    public long f78613i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f78614m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f78615n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f78616o;

    public JsApiResumeDownloadTask$ResumeDownloadTask(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f78610f = k0Var;
        this.f78611g = e9Var;
        this.f78612h = i17;
        this.f78613i = jSONObject.optLong("downloadId");
        this.f78614m = jSONObject.optBoolean("downloadInWifi", false);
        this.f78615n = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f78613i = parcel.readLong();
        this.f78614m = parcel.readByte() == 1;
        this.f78615n = parcel.readInt() == 1;
        this.f78616o = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f78613i);
        parcel.writeByte(this.f78614m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f78615n ? 1 : 0);
        parcel.writeString(this.f78616o);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        boolean z17 = this.f78615n;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f78610f;
        int i17 = this.f78612h;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f78611g;
        if (z17) {
            e9Var.a(i17, k0Var.o(com.tencent.mm.sdk.platformtools.t8.K0(this.f78616o) ? "fail" : java.lang.String.format("fail:%s", this.f78616o)));
        } else {
            e9Var.a(i17, k0Var.o("ok"));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiResumeDownloadTask", "doQueryDownloadTask, downloadId = %d", java.lang.Long.valueOf(this.f78613i));
        if (this.f78613i <= 0) {
            this.f78616o = "downloadId invalid";
        } else {
            vz.q1 q1Var = (vz.q1) i95.n0.c(vz.q1.class);
            long j17 = this.f78613i;
            ((uz.p1) q1Var).getClass();
            h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
            if (c17 != null) {
                boolean z17 = c17.field_downloadInWifi;
                boolean z18 = this.f78614m;
                if (z17 != z18) {
                    c17.field_downloadInWifi = z18;
                    ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                    com.tencent.mm.plugin.downloader.model.m0.l(c17);
                }
            }
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            this.f78615n = !com.tencent.mm.plugin.downloader.model.r0.i().w(this.f78613i);
        }
        c();
    }

    public JsApiResumeDownloadTask$ResumeDownloadTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
