package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiResumeDownloadTask$ResumeDownloadTask */
/* loaded from: classes.dex */
class C11939x646ce393 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11939x646ce393> f33671x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.oc();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160143f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f160144g;

    /* renamed from: h, reason: collision with root package name */
    public final int f160145h;

    /* renamed from: i, reason: collision with root package name */
    public long f160146i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f160147m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f160148n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f160149o;

    public C11939x646ce393(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f160143f = k0Var;
        this.f160144g = e9Var;
        this.f160145h = i17;
        this.f160146i = jSONObject.optLong("downloadId");
        this.f160147m = jSONObject.optBoolean("downloadInWifi", false);
        this.f160148n = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160146i = parcel.readLong();
        this.f160147m = parcel.readByte() == 1;
        this.f160148n = parcel.readInt() == 1;
        this.f160149o = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f160146i);
        parcel.writeByte(this.f160147m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f160148n ? 1 : 0);
        parcel.writeString(this.f160149o);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        boolean z17 = this.f160148n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f160143f;
        int i17 = this.f160145h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f160144g;
        if (z17) {
            e9Var.a(i17, k0Var.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160149o) ? "fail" : java.lang.String.format("fail:%s", this.f160149o)));
        } else {
            e9Var.a(i17, k0Var.o("ok"));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiResumeDownloadTask", "doQueryDownloadTask, downloadId = %d", java.lang.Long.valueOf(this.f160146i));
        if (this.f160146i <= 0) {
            this.f160149o = "downloadId invalid";
        } else {
            vz.q1 q1Var = (vz.q1) i95.n0.c(vz.q1.class);
            long j17 = this.f160146i;
            ((uz.p1) q1Var).getClass();
            h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
            if (c17 != null) {
                boolean z17 = c17.f68409xc4f9be67;
                boolean z18 = this.f160147m;
                if (z17 != z18) {
                    c17.f68409xc4f9be67 = z18;
                    ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
                }
            }
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            this.f160148n = !com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().w(this.f160146i);
        }
        c();
    }

    public C11939x646ce393(android.os.Parcel parcel) {
        v(parcel);
    }
}
