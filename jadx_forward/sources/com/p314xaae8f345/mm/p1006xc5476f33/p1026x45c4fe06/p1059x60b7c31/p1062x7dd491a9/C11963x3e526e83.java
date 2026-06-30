package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiCancelDownloadTaskForNative$CancelDownloadTask */
/* loaded from: classes.dex */
public class C11963x3e526e83 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: f, reason: collision with root package name */
    public org.json.JSONArray f160372f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f f160373g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f160374h;

    /* renamed from: i, reason: collision with root package name */
    public final int f160375i;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        java.lang.String readString = parcel.readString();
        if (readString != null) {
            try {
                this.f160372f = new org.json.JSONArray(readString);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCancelDownloadTaskForNative", "parseFromParcel: " + e17.getMessage());
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        org.json.JSONArray jSONArray = this.f160372f;
        parcel.writeString(jSONArray != null ? jSONArray.toString() : null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        x();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCancelDownloadTaskForNative", "cancelDownloadTask client: [" + this.f160372f + "]");
        this.f160374h.a(this.f160375i, this.f160373g.o("ok"));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCancelDownloadTaskForNative", "cancelDownloadTask main: [" + this.f160372f + "]");
        org.json.JSONArray jSONArray = this.f160372f;
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i17 = 0; i17 < this.f160372f.length(); i17++) {
                long optLong = this.f160372f.optLong(i17);
                ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(optLong);
                if (c17 == null || c17.f68441x10a0fed7 != 3) {
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().t(optLong);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCancelDownloadTaskForNative", "canceldownloadtask, path: %s", c17.f68419xf1e9b966);
                    com.p314xaae8f345.mm.vfs.w6.h(c17.f68419xf1e9b966);
                    vz.q1 q1Var = (vz.q1) i95.n0.c(vz.q1.class);
                    java.lang.String str = c17.f68411x238eb002;
                    ((uz.p1) q1Var).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.k(str);
                }
            }
        }
        c();
    }

    public C11963x3e526e83(org.json.JSONArray jSONArray, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f160372f = jSONArray;
        this.f160373g = fVar;
        this.f160374h = e9Var;
        this.f160375i = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCancelDownloadTaskForNative", "cancelDownloadTask: [" + jSONArray + "]");
    }

    private C11963x3e526e83(android.os.Parcel parcel) {
        v(parcel);
    }
}
