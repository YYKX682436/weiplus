package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask$PauseDownloadTask */
/* loaded from: classes.dex */
class C11971x1c855651 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11971x1c855651> f33713x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.g1();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160419f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f160420g;

    /* renamed from: h, reason: collision with root package name */
    public final int f160421h;

    /* renamed from: i, reason: collision with root package name */
    public long f160422i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f160423m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f160424n;

    public C11971x1c855651(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f160419f = k0Var;
        this.f160420g = e9Var;
        this.f160421h = i17;
        this.f160422i = jSONObject.optLong("downloadId");
        this.f160423m = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160422i = parcel.readLong();
        this.f160423m = parcel.readInt() == 1;
        this.f160424n = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f160422i);
        parcel.writeInt(this.f160423m ? 1 : 0);
        parcel.writeString(this.f160424n);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        boolean z17 = this.f160423m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f160419f;
        int i17 = this.f160421h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f160420g;
        if (z17) {
            e9Var.a(i17, k0Var.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160424n) ? "fail" : java.lang.String.format("fail:%s", this.f160424n)));
        } else {
            e9Var.a(i17, k0Var.o("ok"));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPauseDownloadTask", "doPauseDownloadTask, downloadId = %d", java.lang.Long.valueOf(this.f160422i));
        if (this.f160422i <= 0) {
            this.f160424n = "downloadId invalid";
        } else {
            vz.q1 q1Var = (vz.q1) i95.n0.c(vz.q1.class);
            long j17 = this.f160422i;
            ((uz.p1) q1Var).getClass();
            h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
            if (c17 == null) {
                this.f160424n = "downloadId invalid";
            } else {
                if (c17.f68409xc4f9be67) {
                    c17.f68409xc4f9be67 = false;
                    ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
                }
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                this.f160423m = !com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().o(this.f160422i);
            }
        }
        c();
    }

    public C11971x1c855651(android.os.Parcel parcel) {
        v(parcel);
    }
}
