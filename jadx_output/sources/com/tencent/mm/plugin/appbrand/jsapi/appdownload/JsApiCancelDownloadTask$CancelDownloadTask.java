package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes.dex */
class JsApiCancelDownloadTask$CancelDownloadTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {

    /* renamed from: f, reason: collision with root package name */
    public org.json.JSONArray f78835f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.f f78836g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f78837h;

    /* renamed from: i, reason: collision with root package name */
    public final int f78838i;

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        java.lang.String readString = parcel.readString();
        if (readString != null) {
            try {
                this.f78835f = new org.json.JSONArray(readString);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCancelDownloadTask", "parseFromParcel: " + e17.getMessage());
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        org.json.JSONArray jSONArray = this.f78835f;
        parcel.writeString(jSONArray != null ? jSONArray.toString() : null);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        x();
        this.f78837h.a(this.f78838i, this.f78836g.o("ok"));
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        org.json.JSONArray jSONArray = this.f78835f;
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i17 = 0; i17 < this.f78835f.length(); i17++) {
                long optLong = this.f78835f.optLong(i17);
                ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(optLong);
                if (c17 == null || c17.field_status != 3) {
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    com.tencent.mm.plugin.downloader.model.r0.i().t(optLong);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCancelDownloadTask", "canceldownloadtask, path: %s", c17.field_filePath);
                    com.tencent.mm.vfs.w6.h(c17.field_filePath);
                    vz.q1 q1Var = (vz.q1) i95.n0.c(vz.q1.class);
                    java.lang.String str = c17.field_downloadUrl;
                    ((uz.p1) q1Var).getClass();
                    com.tencent.mm.plugin.downloader.model.m0.k(str);
                }
            }
        }
        c();
    }

    public JsApiCancelDownloadTask$CancelDownloadTask(org.json.JSONArray jSONArray, com.tencent.mm.plugin.appbrand.jsapi.f fVar, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f78835f = jSONArray;
        this.f78836g = fVar;
        this.f78837h = e9Var;
        this.f78838i = i17;
    }

    private JsApiCancelDownloadTask$CancelDownloadTask(android.os.Parcel parcel) {
        v(parcel);
    }
}
