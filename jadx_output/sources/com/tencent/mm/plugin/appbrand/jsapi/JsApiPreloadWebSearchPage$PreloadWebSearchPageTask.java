package com.tencent.mm.plugin.appbrand.jsapi;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0013\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\u0012"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/JsApiPreloadWebSearchPage$PreloadWebSearchPageTask", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "Ljz5/f0;", "z", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "in", org.chromium.base.BaseSwitches.V, "Lorg/json/JSONObject;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "<init>", "(Lorg/json/JSONObject;)V", "(Landroid/os/Parcel;)V", "CREATOR", "com/tencent/mm/plugin/appbrand/jsapi/fb", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class JsApiPreloadWebSearchPage$PreloadWebSearchPageTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final com.tencent.mm.plugin.appbrand.jsapi.fb CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.fb(null);

    /* renamed from: f, reason: collision with root package name */
    public org.json.JSONObject f78593f;

    public JsApiPreloadWebSearchPage$PreloadWebSearchPageTask(org.json.JSONObject jSONObject) {
        this.f78593f = jSONObject;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel in6) {
        org.json.JSONObject jSONObject;
        kotlin.jvm.internal.o.g(in6, "in");
        java.lang.String readString = in6.readString();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreloadWebSearchPage", "parseFromParcel " + readString);
        try {
            jSONObject = new org.json.JSONObject(readString);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiPreloadWebSearchPage", e17, "parseFromParcel", new java.lang.Object[0]);
            jSONObject = null;
        }
        this.f78593f = jSONObject;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(dest, "dest");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreloadWebSearchPage", "writeToParcel " + this.f78593f);
        org.json.JSONObject jSONObject = this.f78593f;
        if (jSONObject == null || (str = jSONObject.toString()) == null) {
            str = "{}";
        }
        dest.writeString(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPreloadWebSearchPage", "runInMainProcess " + this.f78593f);
        try {
            ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
            su4.r2.o();
            tg0.j1 j1Var = (tg0.j1) i95.n0.c(tg0.j1.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((ux4.j) j1Var).wi(context);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPreloadWebSearchPage", "[preloadWebSearchPage], exception:" + e17);
        }
    }

    public JsApiPreloadWebSearchPage$PreloadWebSearchPageTask(android.os.Parcel in6) {
        kotlin.jvm.internal.o.g(in6, "in");
        v(in6);
    }
}
