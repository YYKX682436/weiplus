package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskStraight$AddDownloadTaskStraightTask */
/* loaded from: classes.dex */
class C11961x6d504840 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11961x6d504840> f33706x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.u();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160353f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f160354g;

    /* renamed from: h, reason: collision with root package name */
    public final int f160355h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f160356i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160357m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f160358n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f160359o;

    /* renamed from: p, reason: collision with root package name */
    public long f160360p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f160361q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f160362r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f160363s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f160364t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f160365u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f160366v;

    /* renamed from: w, reason: collision with root package name */
    public long f160367w;

    public C11961x6d504840(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f160353f = k0Var;
        this.f160354g = e9Var;
        this.f160355h = i17;
        this.f160356i = jSONObject.optString("taskName");
        this.f160357m = jSONObject.optString("taskUrl");
        this.f160358n = jSONObject.optString("fileMd5");
        this.f160359o = jSONObject.optString("alternativeUrl");
        this.f160360p = jSONObject.optInt("taskSize", 0);
        this.f160361q = jSONObject.optString("extInfo");
        this.f160362r = jSONObject.optString("fileType");
        this.f160363s = e9Var.mo48798x74292566();
        this.f160364t = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
        this.f160365u = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160356i = parcel.readString();
        this.f160357m = parcel.readString();
        this.f160358n = parcel.readString();
        this.f160359o = parcel.readString();
        this.f160360p = parcel.readLong();
        this.f160361q = parcel.readString();
        this.f160362r = parcel.readString();
        this.f160363s = parcel.readString();
        this.f160364t = parcel.readString();
        this.f160365u = parcel.readInt() == 1;
        this.f160366v = parcel.readString();
        this.f160367w = parcel.readLong();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160356i);
        parcel.writeString(this.f160357m);
        parcel.writeString(this.f160358n);
        parcel.writeString(this.f160359o);
        parcel.writeLong(this.f160360p);
        parcel.writeString(this.f160361q);
        parcel.writeString(this.f160362r);
        parcel.writeString(this.f160363s);
        parcel.writeString(this.f160364t);
        parcel.writeInt(this.f160365u ? 1 : 0);
        parcel.writeString(this.f160366v);
        parcel.writeLong(this.f160367w);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        boolean z17 = this.f160365u;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f160353f;
        int i17 = this.f160355h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f160354g;
        if (z17) {
            e9Var.a(i17, k0Var.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160366v) ? "fail" : java.lang.String.format("fail:%s", this.f160366v)));
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("downloadId", java.lang.Long.valueOf(this.f160367w));
            e9Var.a(i17, k0Var.p("ok", hashMap));
        }
        x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        gm0.j1.i();
        if (gm0.j1.u().l()) {
            long j17 = this.f160360p;
            if (j17 > 0 && !fp.i.c(j17)) {
                this.f160366v = "fail_sdcard_has_not_enough_space";
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160357m)) {
                this.f160366v = "fail_invalid_url";
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddDownloadTaskStraight", "runInMainProcess taskUrl:%s md5:%s", this.f160357m, this.f160358n);
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0(null);
                t0Var.f178683a = this.f160357m;
                t0Var.f178684b = this.f160359o;
                t0Var.f178685c = this.f160360p;
                t0Var.f178686d = this.f160356i;
                t0Var.f178687e = this.f160358n;
                t0Var.f178689g = this.f160363s;
                t0Var.f178690h = this.f160364t;
                t0Var.f178691i = true;
                t0Var.f178688f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(this.f160362r, 1);
                t0Var.f178694l = com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14493x3375bbf4;
                t0Var.f178699q = this.f160361q;
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                long b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().b(t0Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddDownloadTaskStraight", "doAddDownloadTaskStraight, downloadId = " + b17);
                if (b17 <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddDownloadTaskStraight", "doAddDownloadTaskStraight fail, downloadId = " + b17);
                    this.f160366v = "";
                } else {
                    this.f160365u = false;
                    this.f160367w = b17;
                }
            }
        } else {
            this.f160366v = "fail_sdcard_not_ready";
        }
        c();
    }

    public C11961x6d504840(android.os.Parcel parcel) {
        v(parcel);
    }
}
