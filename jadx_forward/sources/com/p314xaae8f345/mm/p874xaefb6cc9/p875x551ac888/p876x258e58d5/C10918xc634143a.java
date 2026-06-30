package com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5;

/* renamed from: com.tencent.mm.minigame.download.mmdownloader.JsApiCancelDownloadTaskForWVA$CancelWVATask */
/* loaded from: classes.dex */
class C10918xc634143a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10918xc634143a> f29744x681a0c0c = new com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.h();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f150561f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f150562g;

    /* renamed from: h, reason: collision with root package name */
    public final int f150563h;

    /* renamed from: i, reason: collision with root package name */
    public long f150564i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f150565m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f150566n;

    public C10918xc634143a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f150561f = k0Var;
        this.f150562g = e9Var;
        this.f150563h = i17;
        long optLong = jSONObject.optLong("downloadId");
        this.f150564i = optLong;
        this.f150565m = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVA.cancelDownloadTaskForWVA", "CancelWVATask:%d", java.lang.Long.valueOf(optLong));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f150564i = parcel.readLong();
        this.f150565m = parcel.readInt() == 1;
        this.f150566n = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeLong(this.f150564i);
        parcel.writeInt(this.f150565m ? 1 : 0);
        parcel.writeString(this.f150566n);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        boolean z17 = this.f150565m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f150561f;
        int i17 = this.f150563h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f150562g;
        if (z17) {
            e9Var.a(i17, k0Var.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f150566n) ? "fail" : java.lang.String.format("fail:%s", this.f150566n)));
        } else {
            e9Var.a(i17, k0Var.o("ok"));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVA.cancelDownloadTaskForWVA", "doCancelDownloadTask, downloadId = %d", java.lang.Long.valueOf(this.f150564i));
        if (this.f150564i <= 0) {
            this.f150566n = "downloadId invalid";
        } else {
            this.f150565m = false;
            vz.q1 q1Var = (vz.q1) i95.n0.c(vz.q1.class);
            long j17 = this.f150564i;
            ((uz.p1) q1Var).getClass();
            h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
            if (c17 == null || c17.f68441x10a0fed7 != 3) {
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().t(this.f150564i);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVA.cancelDownloadTaskForWVA", "canceldownloadtask, path: %s", c17.f68419xf1e9b966);
                com.p314xaae8f345.mm.vfs.w6.h(c17.f68419xf1e9b966);
                vz.q1 q1Var2 = (vz.q1) i95.n0.c(vz.q1.class);
                java.lang.String str = c17.f68411x238eb002;
                ((uz.p1) q1Var2).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.k(str);
            }
        }
        c();
    }

    public C10918xc634143a(android.os.Parcel parcel) {
        v(parcel);
    }
}
