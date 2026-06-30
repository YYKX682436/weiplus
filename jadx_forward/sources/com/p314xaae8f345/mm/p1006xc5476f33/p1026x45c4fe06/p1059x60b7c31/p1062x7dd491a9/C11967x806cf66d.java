package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTaskForNative$InstallDownloadTask */
/* loaded from: classes8.dex */
public class C11967x806cf66d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11967x806cf66d> f33710x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.p0();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160401f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f160402g;

    /* renamed from: h, reason: collision with root package name */
    public final int f160403h;

    /* renamed from: i, reason: collision with root package name */
    public long f160404i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160405m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f160406n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f160407o;

    public C11967x806cf66d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, org.json.JSONObject jSONObject) {
        this.f160401f = k0Var;
        this.f160402g = lVar;
        this.f160403h = i17;
        this.f160404i = jSONObject.optLong("downloadId");
        this.f160405m = jSONObject.optString("appId");
        this.f160406n = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160404i = parcel.readLong();
        this.f160405m = parcel.readString();
        this.f160406n = parcel.readInt() == 1;
        this.f160407o = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f160404i);
        parcel.writeString(this.f160405m);
        parcel.writeInt(this.f160406n ? 1 : 0);
        parcel.writeString(this.f160407o);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        boolean z17 = this.f160406n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f160401f;
        int i17 = this.f160403h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f160402g;
        if (z17) {
            lVar.a(i17, k0Var.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160407o) ? "fail" : java.lang.String.format("fail:%s", this.f160407o)));
        } else {
            lVar.a(i17, k0Var.o("ok"));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInstallDownloadTaskForNative", "doInstallDownloadTask, downloadId = %d", java.lang.Long.valueOf(this.f160404i));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160405m)) {
            vz.q1 q1Var = (vz.q1) i95.n0.c(vz.q1.class);
            long j17 = this.f160404i;
            ((uz.p1) q1Var).getClass();
            h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
            if (c17 != null && c17.f68441x10a0fed7 == 3 && com.p314xaae8f345.mm.vfs.w6.j(c17.f68419xf1e9b966)) {
                vz.f1 f1Var = (vz.f1) i95.n0.c(vz.f1.class);
                long j18 = c17.f68408x32b20428;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.o0 o0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.o0(this);
                ((uz.a) f1Var).getClass();
                k02.l.a(j18, false, o0Var);
            }
        } else {
            vz.q1 q1Var2 = (vz.q1) i95.n0.c(vz.q1.class);
            java.lang.String str = this.f160405m;
            ((uz.p1) q1Var2).getClass();
            h02.a d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(str);
            if (d17 != null && d17.f68441x10a0fed7 == 3 && com.p314xaae8f345.mm.vfs.w6.j(d17.f68419xf1e9b966)) {
                vz.f1 f1Var2 = (vz.f1) i95.n0.c(vz.f1.class);
                long j19 = d17.f68408x32b20428;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.n0 n0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.n0(this);
                ((uz.a) f1Var2).getClass();
                k02.l.a(j19, false, n0Var);
            }
        }
        c();
    }

    public C11967x806cf66d(android.os.Parcel parcel) {
        v(parcel);
    }
}
