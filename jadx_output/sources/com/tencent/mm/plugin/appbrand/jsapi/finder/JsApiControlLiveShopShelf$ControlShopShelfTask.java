package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes.dex */
class JsApiControlLiveShopShelf$ControlShopShelfTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiControlLiveShopShelf$ControlShopShelfTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.finder.b();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f81150f;

    /* renamed from: g, reason: collision with root package name */
    public final int f81151g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f81152h;

    /* renamed from: i, reason: collision with root package name */
    public org.json.JSONObject f81153i;

    public JsApiControlLiveShopShelf$ControlShopShelfTask(com.tencent.mm.plugin.appbrand.e9 e9Var, org.json.JSONObject jSONObject, int i17) {
        this.f81150f = e9Var;
        this.f81151g = i17;
        this.f81153i = jSONObject;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        try {
            this.f81153i = new org.json.JSONObject(parcel.readString());
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("JsApiControlLiveShopShelf", e17, "parseFromParcel", new java.lang.Object[0]);
            this.f81153i = null;
        }
        this.f81152h = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f81153i.toString());
        parcel.writeString(this.f81152h);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81150f;
        java.lang.String appId = e9Var.getAppId();
        java.lang.String str = this.f81152h;
        int i17 = this.f81151g;
        com.tencent.mars.xlog.Log.i("JsApiControlLiveShopShelf", "runInClientProcess callback, appId[%s], msg[%s], callbackId[%d], isRunning[%b]", appId, str, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(e9Var.isRunning()));
        e9Var.a(i17, this.f81152h);
        x();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        r45.nw1 nw1Var;
        com.tencent.mars.xlog.Log.i("JsApiControlLiveShopShelf", "runInMainProcess data = " + this.f81153i.toString());
        java.lang.String liveId = this.f81153i.optString("liveID");
        if (this.f81153i.optBoolean("open")) {
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
            kotlin.jvm.internal.o.g(liveId, "liveId");
            dk2.ef efVar = dk2.ef.f233372a;
            mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
            boolean z17 = false;
            java.lang.Long valueOf = (e1Var == null || (nw1Var = e1Var.f328988r) == null) ? null : java.lang.Long.valueOf(nw1Var.getLong(0));
            long Z = pm0.v.Z(liveId);
            if (valueOf != null && Z == valueOf.longValue()) {
                mm2.f6 f6Var = (mm2.f6) efVar.i(mm2.f6.class);
                if (f6Var != null && f6Var.f329035i) {
                    z17 = true;
                }
                if (z17) {
                    com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
                    if (k0Var != null) {
                        k0Var.statusChange(qo0.b.f365349f2, null);
                    }
                } else {
                    pm0.v.X(com.tencent.mm.feature.finder.live.u4.f66958d);
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.FinderLiveFeatureService", "showShoppingList failed, liveId " + liveId + " does not match current liveId " + valueOf);
            }
        }
        c();
    }

    public JsApiControlLiveShopShelf$ControlShopShelfTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
