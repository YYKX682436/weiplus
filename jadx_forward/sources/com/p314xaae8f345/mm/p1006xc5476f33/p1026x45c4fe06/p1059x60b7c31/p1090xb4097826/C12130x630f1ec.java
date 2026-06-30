package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiStartChannelsLive$StartChannelsLiveTask */
/* loaded from: classes.dex */
class C12130x630f1ec extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12130x630f1ec> f34278x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.g1();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f162716f;

    /* renamed from: g, reason: collision with root package name */
    public final int f162717g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f162718h;

    /* renamed from: i, reason: collision with root package name */
    public final org.json.JSONObject f162719i;

    public C12130x630f1ec(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f162716f = e9Var;
        this.f162717g = i17;
        this.f162719i = jSONObject;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f162718h = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f162718h);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        this.f162716f.a(this.f162717g, this.f162718h);
        x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f162716f;
        android.content.Context mo50352x76847179 = e9Var != null ? e9Var.mo50352x76847179() : null;
        if (mo50352x76847179 == null) {
            mo50352x76847179 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        org.json.JSONObject jSONObject = this.f162719i;
        if (jSONObject != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiStartChannelsLive", "runInMainProcess data:%s", jSONObject.toString());
            java.lang.String finderUsername = jSONObject.optString("finderUsername", "");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(finderUsername)) {
                ((q92.h) ((m40.g0) i95.n0.c(m40.g0.class))).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
                if (!g92.b.f351302e.G2(finderUsername)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiStartChannelsLive", "not isMasterAccount");
                    c();
                    return;
                }
            }
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hj(mo50352x76847179, "", 10);
        c();
    }

    public C12130x630f1ec(android.os.Parcel parcel) {
        v(parcel);
    }
}
