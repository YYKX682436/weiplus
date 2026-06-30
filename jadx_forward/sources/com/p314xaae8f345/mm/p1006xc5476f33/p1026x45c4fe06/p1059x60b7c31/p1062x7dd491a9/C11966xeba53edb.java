package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTask$InstallDownloadTask */
/* loaded from: classes8.dex */
public class C11966xeba53edb extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11966xeba53edb> f33709x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.l0();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160394f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f160395g;

    /* renamed from: h, reason: collision with root package name */
    public final int f160396h;

    /* renamed from: i, reason: collision with root package name */
    public long f160397i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160398m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f160399n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f160400o;

    public C11966xeba53edb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, org.json.JSONObject jSONObject) {
        this.f160394f = k0Var;
        this.f160395g = lVar;
        this.f160396h = i17;
        this.f160397i = jSONObject.optLong("downloadId");
        this.f160398m = jSONObject.optString("appId");
        this.f160399n = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160397i = parcel.readLong();
        this.f160398m = parcel.readString();
        this.f160399n = parcel.readInt() == 1;
        this.f160400o = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f160397i);
        parcel.writeString(this.f160398m);
        parcel.writeInt(this.f160399n ? 1 : 0);
        parcel.writeString(this.f160400o);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        boolean z17 = this.f160399n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f160394f;
        int i17 = this.f160396h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f160395g;
        if (z17) {
            lVar.a(i17, k0Var.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160400o) ? "fail" : java.lang.String.format("fail:%s", this.f160400o)));
        } else {
            lVar.a(i17, k0Var.o("ok"));
        }
        x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiInstallDownloadTask", "doInstallDownloadTask, downloadId = %d", java.lang.Long.valueOf(this.f160397i));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160398m)) {
            vz.q1 q1Var = (vz.q1) i95.n0.c(vz.q1.class);
            long j17 = this.f160397i;
            ((uz.p1) q1Var).getClass();
            h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
            if (c17 != null && c17.f68441x10a0fed7 == 3 && com.p314xaae8f345.mm.vfs.w6.j(c17.f68419xf1e9b966)) {
                vz.f1 f1Var = (vz.f1) i95.n0.c(vz.f1.class);
                long j18 = c17.f68408x32b20428;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.k0 k0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.k0(this);
                ((uz.a) f1Var).getClass();
                k02.l.a(j18, false, k0Var);
            }
        } else {
            vz.q1 q1Var2 = (vz.q1) i95.n0.c(vz.q1.class);
            java.lang.String str = this.f160398m;
            ((uz.p1) q1Var2).getClass();
            h02.a d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(str);
            if (d17 != null && d17.f68441x10a0fed7 == 3 && com.p314xaae8f345.mm.vfs.w6.j(d17.f68419xf1e9b966)) {
                vz.f1 f1Var2 = (vz.f1) i95.n0.c(vz.f1.class);
                long j19 = d17.f68408x32b20428;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.j0 j0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.j0(this);
                ((uz.a) f1Var2).getClass();
                k02.l.a(j19, false, j0Var);
            }
        }
        c();
    }

    public C11966xeba53edb(android.os.Parcel parcel) {
        v(parcel);
    }
}
