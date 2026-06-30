package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiResumeDownloadTaskForNative$ResumeDownloadTask */
/* loaded from: classes.dex */
public class C11975xe0aabe69 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11975xe0aabe69> f33717x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.p1();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160455f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f160456g;

    /* renamed from: h, reason: collision with root package name */
    public final int f160457h;

    /* renamed from: i, reason: collision with root package name */
    public long f160458i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f160459m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f160460n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f160461o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f160462p;

    public C11975xe0aabe69(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f160455f = k0Var;
        this.f160456g = e9Var;
        this.f160457h = i17;
        this.f160458i = jSONObject.optLong("downloadId");
        this.f160460n = jSONObject.optBoolean("useDownloaderWidget", false);
        this.f160459m = jSONObject.optBoolean("downloadInWifi", false);
        this.f160461o = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160458i = parcel.readLong();
        this.f160459m = parcel.readByte() == 1;
        this.f160461o = parcel.readInt() == 1;
        this.f160462p = parcel.readString();
        this.f160460n = parcel.readInt() == 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f160458i);
        parcel.writeByte(this.f160459m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f160461o ? 1 : 0);
        parcel.writeString(this.f160462p);
        parcel.writeInt(this.f160460n ? 1 : 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        boolean z17 = this.f160461o;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f160455f;
        int i17 = this.f160457h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f160456g;
        if (z17) {
            e9Var.a(i17, k0Var.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160462p) ? "fail" : java.lang.String.format("fail:%s", this.f160462p)));
        } else {
            e9Var.a(i17, k0Var.o("ok"));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiResumeDownloadTaskForNative", "doResumeDownloadTask, downloadId = %d", java.lang.Long.valueOf(this.f160458i));
        long j17 = this.f160458i;
        if (j17 <= 0) {
            this.f160462p = "downloadId invalid";
        } else if (this.f160460n) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            boolean z17 = this.f160459m;
            vz.a2 a2Var = (vz.a2) i95.n0.c(vz.a2.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.o1 o1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.o1(this);
            ((uz.c2) a2Var).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j1.f(context, j17, z17, false, false, o1Var);
        } else {
            vz.q1 q1Var = (vz.q1) i95.n0.c(vz.q1.class);
            long j18 = this.f160458i;
            ((uz.p1) q1Var).getClass();
            h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j18);
            if (c17 != null) {
                c17.f68409xc4f9be67 = false;
                c17.f68423x7e6ed12a = false;
                c17.f68435x73c7b92d = true;
                ((uz.p1) ((vz.q1) i95.n0.c(vz.q1.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.l(c17);
            }
            ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
            this.f160461o = !com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().w(this.f160458i);
        }
        c();
    }

    public C11975xe0aabe69(android.os.Parcel parcel) {
        v(parcel);
    }
}
