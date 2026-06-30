package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiGetLocalLiveInfo$GetLocalLiveInfoTask */
/* loaded from: classes7.dex */
class C12112x47a79258 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12112x47a79258> f34268x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.u();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f162694f;

    /* renamed from: g, reason: collision with root package name */
    public final int f162695g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f162696h;

    public C12112x47a79258(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f162694f = e9Var;
        this.f162695g = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f162696h = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f162696h);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f162694f;
        java.lang.String mo48798x74292566 = e9Var.mo48798x74292566();
        java.lang.String str = this.f162696h;
        int i17 = this.f162695g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiGetLocalLiveInfo", "runInClientProcess callback, appId[%s], msg[%s], callbackId[%d], isRunning[%b]", mo48798x74292566, str, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(e9Var.mo50262x39e05d35()));
        e9Var.a(i17, this.f162696h);
        x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        boolean z17 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk() || ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).rk();
        boolean fk6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        tn0.w0 w0Var = dk2.ef.f314911d;
        boolean z18 = w0Var != null && w0Var.X();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiGetLocalLiveInfo", "get hasLive = %s, isAnchor = %s, isLinkMic = %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(fk6), java.lang.Boolean.valueOf(z18));
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("hasLive", z17);
            jSONObject.put("isAnchor", fk6);
            jSONObject.put("isConnectingMic", z18);
            this.f162696h = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.a.a("", 0, jSONObject);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("JsApiGetLocalLiveInfo", e17, "make ret failed", new java.lang.Object[0]);
        }
        c();
    }

    public C12112x47a79258(android.os.Parcel parcel) {
        v(parcel);
    }
}
