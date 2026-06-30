package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
class JsApiWriteCommData$WriteCommDataTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.JsApiWriteCommData$WriteCommDataTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.bf();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f78658f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f78659g;

    /* renamed from: h, reason: collision with root package name */
    public final int f78660h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f78661i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f78662m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f78663n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f78664o;

    public JsApiWriteCommData$WriteCommDataTask(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, org.json.JSONObject jSONObject) {
        this.f78658f = k0Var;
        this.f78659g = lVar;
        this.f78660h = i17;
        this.f78661i = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME);
        this.f78662m = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        this.f78663n = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f78661i = parcel.readString();
        this.f78662m = parcel.readString();
        this.f78663n = parcel.readInt() == 1;
        this.f78664o = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f78661i);
        parcel.writeString(this.f78662m);
        parcel.writeInt(this.f78663n ? 1 : 0);
        parcel.writeString(this.f78664o);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        boolean z17 = this.f78663n;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f78658f;
        int i17 = this.f78660h;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f78659g;
        if (z17) {
            lVar.a(i17, k0Var.o(com.tencent.mm.sdk.platformtools.t8.K0(this.f78664o) ? "fail" : java.lang.String.format("fail:%s", this.f78664o)));
        } else {
            lVar.a(i17, k0Var.o("ok"));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f78661i)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiWriteCommData", "packageName nil");
        } else {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            this.f78663n = !context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.f193072b + "_comm_preferences", 0).edit().putString(this.f78661i, this.f78662m).commit();
        }
        c();
    }

    public JsApiWriteCommData$WriteCommDataTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
