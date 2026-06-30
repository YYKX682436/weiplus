package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes.dex */
class JsApiStartChannelsLive$StartChannelsLiveTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiStartChannelsLive$StartChannelsLiveTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.finder.g1();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f81183f;

    /* renamed from: g, reason: collision with root package name */
    public final int f81184g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f81185h;

    /* renamed from: i, reason: collision with root package name */
    public final org.json.JSONObject f81186i;

    public JsApiStartChannelsLive$StartChannelsLiveTask(com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f81183f = e9Var;
        this.f81184g = i17;
        this.f81186i = jSONObject;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f81185h = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f81185h);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        this.f81183f.a(this.f81184g, this.f81185h);
        x();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81183f;
        android.content.Context context = e9Var != null ? e9Var.getContext() : null;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        org.json.JSONObject jSONObject = this.f81186i;
        if (jSONObject != null) {
            com.tencent.mars.xlog.Log.i("JsApiStartChannelsLive", "runInMainProcess data:%s", jSONObject.toString());
            java.lang.String finderUsername = jSONObject.optString("finderUsername", "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(finderUsername)) {
                ((q92.h) ((m40.g0) i95.n0.c(m40.g0.class))).getClass();
                kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
                if (!g92.b.f269769e.G2(finderUsername)) {
                    com.tencent.mars.xlog.Log.i("JsApiStartChannelsLive", "not isMasterAccount");
                    c();
                    return;
                }
            }
        }
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hj(context, "", 10);
        c();
    }

    public JsApiStartChannelsLive$StartChannelsLiveTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
