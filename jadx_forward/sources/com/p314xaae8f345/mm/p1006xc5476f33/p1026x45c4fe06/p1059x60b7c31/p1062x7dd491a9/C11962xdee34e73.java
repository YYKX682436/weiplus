package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiCancelDownloadTask$CancelDownloadTask */
/* loaded from: classes.dex */
class C11962xdee34e73 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: f, reason: collision with root package name */
    public org.json.JSONArray f160368f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f f160369g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f160370h;

    /* renamed from: i, reason: collision with root package name */
    public final int f160371i;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        java.lang.String readString = parcel.readString();
        if (readString != null) {
            try {
                this.f160368f = new org.json.JSONArray(readString);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCancelDownloadTask", "parseFromParcel: " + e17.getMessage());
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        org.json.JSONArray jSONArray = this.f160368f;
        parcel.writeString(jSONArray != null ? jSONArray.toString() : null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        x();
        this.f160370h.a(this.f160371i, this.f160369g.o("ok"));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        org.json.JSONArray jSONArray = this.f160368f;
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i17 = 0; i17 < this.f160368f.length(); i17++) {
                long optLong = this.f160368f.optLong(i17);
                ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(optLong);
                if (c17 == null || c17.f68441x10a0fed7 != 3) {
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().t(optLong);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCancelDownloadTask", "canceldownloadtask, path: %s", c17.f68419xf1e9b966);
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

    public C11962xdee34e73(org.json.JSONArray jSONArray, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f160368f = jSONArray;
        this.f160369g = fVar;
        this.f160370h = e9Var;
        this.f160371i = i17;
    }

    private C11962xdee34e73(android.os.Parcel parcel) {
        v(parcel);
    }
}
