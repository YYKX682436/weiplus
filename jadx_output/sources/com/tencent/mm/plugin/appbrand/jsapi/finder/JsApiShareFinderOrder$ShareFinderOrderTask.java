package com.tencent.mm.plugin.appbrand.jsapi.finder;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B%\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0016"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/finder/JsApiShareFinderOrder$ShareFinderOrderTask", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "Ljz5/f0;", "y", "z", "Landroid/os/Parcel;", "in", org.chromium.base.BaseSwitches.V, "dest", "", "flags", "writeToParcel", "Lcom/tencent/mm/plugin/appbrand/e9;", "service", "Lorg/json/JSONObject;", "jsonObject", "callbackId", "<init>", "(Lcom/tencent/mm/plugin/appbrand/e9;Lorg/json/JSONObject;I)V", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/finder/o0", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class JsApiShareFinderOrder$ShareFinderOrderTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final com.tencent.mm.plugin.appbrand.jsapi.finder.o0 CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.finder.o0(null);

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f81171f;

    /* renamed from: g, reason: collision with root package name */
    public final int f81172g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f81173h;

    /* renamed from: i, reason: collision with root package name */
    public org.json.JSONObject f81174i;

    public JsApiShareFinderOrder$ShareFinderOrderTask(com.tencent.mm.plugin.appbrand.e9 e9Var, org.json.JSONObject jSONObject, int i17) {
        this.f81171f = e9Var;
        this.f81172g = i17;
        this.f81174i = jSONObject;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel in6) {
        org.json.JSONObject jSONObject;
        kotlin.jvm.internal.o.g(in6, "in");
        try {
            jSONObject = new org.json.JSONObject(in6.readString());
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Finder.JsApiShareFinderOrder", e17, "parseFromParcel", new java.lang.Object[0]);
            jSONObject = null;
        }
        this.f81174i = jSONObject;
        this.f81173h = in6.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(java.lang.String.valueOf(this.f81174i));
        dest.writeString(this.f81173h);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81171f;
        kotlin.jvm.internal.o.d(e9Var);
        java.lang.String appId = e9Var.getAppId();
        java.lang.String str = this.f81173h;
        int i17 = this.f81172g;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        kotlin.jvm.internal.o.d(e9Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiShareFinderOrder", "runInClientProcess callback, appId[%s], msg[%s], callbackId[%d], isRunning[%b]", appId, str, valueOf, java.lang.Boolean.valueOf(e9Var.isRunning()));
        kotlin.jvm.internal.o.d(e9Var);
        e9Var.a(i17, this.f81173h);
        x();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        org.json.JSONObject jSONObject = this.f81174i;
        java.lang.String optString = jSONObject != null ? jSONObject.optString("talkUserName") : null;
        if (optString == null) {
            optString = "";
        }
        org.json.JSONObject jSONObject2 = this.f81174i;
        java.lang.String optString2 = jSONObject2 != null ? jSONObject2.optString("orderId") : null;
        java.lang.String str = optString2 != null ? optString2 : "";
        ot0.q qVar = new ot0.q();
        com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiShareFinderOrder", "invoked, username = " + optString + ", orderId = " + str);
        qVar.f348666i = 96;
        qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        ((com.tencent.mm.feature.finder.live.t6) ((s40.b1) i95.n0.c(s40.b1.class))).Vi(null, str, new com.tencent.mm.plugin.appbrand.jsapi.finder.p0(qVar, optString));
        c();
    }

    public JsApiShareFinderOrder$ShareFinderOrderTask(android.os.Parcel in6) {
        kotlin.jvm.internal.o.g(in6, "in");
        v(in6);
    }
}
