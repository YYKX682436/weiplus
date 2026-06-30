package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$AddDownloadTaskStraightTask */
/* loaded from: classes.dex */
class C11923xf5bbf56b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11923xf5bbf56b> f33656x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s7();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160074f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f160075g;

    /* renamed from: h, reason: collision with root package name */
    public final int f160076h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f160077i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160078m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f160079n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f160080o;

    /* renamed from: p, reason: collision with root package name */
    public long f160081p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f160082q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f160083r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f160084s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f160085t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f160086u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f160087v;

    /* renamed from: w, reason: collision with root package name */
    public long f160088w;

    public C11923xf5bbf56b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f160074f = k0Var;
        this.f160075g = e9Var;
        this.f160076h = i17;
        this.f160077i = jSONObject.optString("taskName");
        this.f160078m = jSONObject.optString("taskUrl");
        this.f160079n = jSONObject.optString("fileMd5");
        this.f160080o = jSONObject.optString("alternativeUrl");
        this.f160081p = jSONObject.optInt("taskSize", 0);
        this.f160082q = jSONObject.optString("extInfo");
        this.f160083r = jSONObject.optString("fileType");
        this.f160084s = jSONObject.optString("appId");
        this.f160085t = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
        this.f160086u = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160077i = parcel.readString();
        this.f160078m = parcel.readString();
        this.f160079n = parcel.readString();
        this.f160080o = parcel.readString();
        this.f160081p = parcel.readLong();
        this.f160082q = parcel.readString();
        this.f160083r = parcel.readString();
        this.f160084s = parcel.readString();
        this.f160085t = parcel.readString();
        this.f160086u = parcel.readInt() == 1;
        this.f160087v = parcel.readString();
        this.f160088w = parcel.readLong();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160077i);
        parcel.writeString(this.f160078m);
        parcel.writeString(this.f160079n);
        parcel.writeString(this.f160080o);
        parcel.writeLong(this.f160081p);
        parcel.writeString(this.f160082q);
        parcel.writeString(this.f160083r);
        parcel.writeString(this.f160084s);
        parcel.writeString(this.f160085t);
        parcel.writeInt(this.f160086u ? 1 : 0);
        parcel.writeString(this.f160087v);
        parcel.writeLong(this.f160088w);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        boolean z17 = this.f160086u;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f160074f;
        int i17 = this.f160076h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f160075g;
        if (z17) {
            e9Var.a(i17, k0Var.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160087v) ? "fail" : java.lang.String.format("fail:%s", this.f160087v)));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("downloadId", java.lang.Long.valueOf(this.f160088w));
        e9Var.a(i17, k0Var.p("ok", hashMap));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        gm0.j1.i();
        if (gm0.j1.u().l()) {
            long j17 = this.f160081p;
            if (j17 > 0 && !fp.i.c(j17)) {
                this.f160087v = "fail_sdcard_has_not_enough_space";
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160078m)) {
                this.f160087v = "fail_invalid_url";
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "runInMainProcess taskUrl:%s md5:%s", this.f160078m, this.f160079n);
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0(null);
                t0Var.f178683a = this.f160078m;
                t0Var.f178684b = this.f160080o;
                t0Var.f178685c = this.f160081p;
                t0Var.f178686d = this.f160077i;
                t0Var.f178687e = this.f160079n;
                t0Var.f178689g = this.f160084s;
                t0Var.f178690h = this.f160085t;
                t0Var.f178691i = true;
                t0Var.f178688f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(this.f160083r, 1);
                t0Var.f178694l = com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14493x3375bbf4;
                t0Var.f178699q = this.f160082q;
                ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                long b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().b(t0Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "doAddDownloadTaskStraight, downloadId = " + b17);
                if (b17 <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiLaunchApplicationDirectly", "doAddDownloadTaskStraight fail, downloadId = " + b17);
                    this.f160087v = "";
                } else {
                    this.f160086u = false;
                    this.f160088w = b17;
                }
            }
        } else {
            this.f160087v = "fail_sdcard_not_ready";
        }
        c();
    }

    public C11923xf5bbf56b(android.os.Parcel parcel) {
        v(parcel);
    }
}
