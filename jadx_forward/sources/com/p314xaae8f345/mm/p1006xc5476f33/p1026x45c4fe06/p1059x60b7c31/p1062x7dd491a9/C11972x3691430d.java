package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTaskForNative$PauseDownloadTask */
/* loaded from: classes.dex */
class C11972x3691430d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11972x3691430d> f33714x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.i1();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160425f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f160426g;

    /* renamed from: h, reason: collision with root package name */
    public final int f160427h;

    /* renamed from: i, reason: collision with root package name */
    public long f160428i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f160429m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f160430n;

    public C11972x3691430d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f160425f = k0Var;
        this.f160426g = e9Var;
        this.f160427h = i17;
        this.f160428i = jSONObject.optLong("downloadId");
        this.f160429m = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160428i = parcel.readLong();
        this.f160429m = parcel.readInt() == 1;
        this.f160430n = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f160428i);
        parcel.writeInt(this.f160429m ? 1 : 0);
        parcel.writeString(this.f160430n);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        boolean z17 = this.f160429m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f160425f;
        int i17 = this.f160427h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f160426g;
        if (z17) {
            e9Var.a(i17, k0Var.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160430n) ? "fail" : java.lang.String.format("fail:%s", this.f160430n)));
        } else {
            e9Var.a(i17, k0Var.o("ok"));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPauseDownloadTaskForNative", "doPauseDownloadTask, downloadId = %d", java.lang.Long.valueOf(this.f160428i));
        if (this.f160428i <= 0) {
            this.f160430n = "downloadId invalid";
        } else {
            vz.q1 q1Var = (vz.q1) i95.n0.c(vz.q1.class);
            long j17 = this.f160428i;
            ((uz.p1) q1Var).getClass();
            h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
            if (c17 == null) {
                this.f160430n = "downloadId invalid";
            } else {
                if (c17.f68409xc4f9be67) {
                    c17.f68409xc4f9be67 = false;
                    ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
                }
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                this.f160429m = !com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().o(this.f160428i);
            }
        }
        c();
    }

    public C11972x3691430d(android.os.Parcel parcel) {
        v(parcel);
    }
}
