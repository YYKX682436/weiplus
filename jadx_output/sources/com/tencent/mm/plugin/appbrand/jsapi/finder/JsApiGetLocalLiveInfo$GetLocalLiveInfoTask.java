package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
class JsApiGetLocalLiveInfo$GetLocalLiveInfoTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiGetLocalLiveInfo$GetLocalLiveInfoTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.finder.u();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f81161f;

    /* renamed from: g, reason: collision with root package name */
    public final int f81162g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f81163h;

    public JsApiGetLocalLiveInfo$GetLocalLiveInfoTask(com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f81161f = e9Var;
        this.f81162g = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f81163h = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f81163h);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81161f;
        java.lang.String appId = e9Var.getAppId();
        java.lang.String str = this.f81163h;
        int i17 = this.f81162g;
        com.tencent.mars.xlog.Log.i("JsApiGetLocalLiveInfo", "runInClientProcess callback, appId[%s], msg[%s], callbackId[%d], isRunning[%b]", appId, str, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(e9Var.isRunning()));
        e9Var.a(i17, this.f81163h);
        x();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        boolean z17 = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk() || ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).rk();
        boolean fk6 = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk();
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        tn0.w0 w0Var = dk2.ef.f233378d;
        boolean z18 = w0Var != null && w0Var.X();
        com.tencent.mars.xlog.Log.i("JsApiGetLocalLiveInfo", "get hasLive = %s, isAnchor = %s, isLinkMic = %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(fk6), java.lang.Boolean.valueOf(z18));
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("hasLive", z17);
            jSONObject.put("isAnchor", fk6);
            jSONObject.put("isConnectingMic", z18);
            this.f81163h = com.tencent.mm.plugin.appbrand.jsapi.finder.a.a("", 0, jSONObject);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("JsApiGetLocalLiveInfo", e17, "make ret failed", new java.lang.Object[0]);
        }
        c();
    }

    public JsApiGetLocalLiveInfo$GetLocalLiveInfoTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
