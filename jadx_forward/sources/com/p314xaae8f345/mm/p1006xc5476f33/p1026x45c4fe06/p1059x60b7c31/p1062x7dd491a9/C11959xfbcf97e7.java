package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTask$AddDownloadTask */
/* loaded from: classes.dex */
class C11959xfbcf97e7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11959xfbcf97e7> f33704x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.p();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160318f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f160319g;

    /* renamed from: h, reason: collision with root package name */
    public final int f160320h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f160321i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160322m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f160323n;

    /* renamed from: o, reason: collision with root package name */
    public long f160324o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f160325p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f160326q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f160327r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f160328s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f160329t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f160330u;

    /* renamed from: v, reason: collision with root package name */
    public int f160331v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f160332w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f160333x;

    /* renamed from: y, reason: collision with root package name */
    public long f160334y;

    public C11959xfbcf97e7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f160318f = k0Var;
        this.f160319g = e9Var;
        this.f160320h = i17;
        this.f160321i = jSONObject.optString("taskName");
        this.f160322m = jSONObject.optString("taskUrl");
        this.f160323n = jSONObject.optString("fileMd5");
        this.f160324o = jSONObject.optInt("taskSize", 0);
        this.f160325p = jSONObject.optString("extInfo");
        this.f160326q = jSONObject.optString("fileType");
        this.f160327r = jSONObject.optString("appId");
        this.f160328s = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
        this.f160329t = jSONObject.optBoolean("downloadInWifi", false);
        this.f160330u = jSONObject.optBoolean("showNotification", false);
        this.f160331v = jSONObject.optInt("downloaderType", 0);
        this.f160332w = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160321i = parcel.readString();
        this.f160322m = parcel.readString();
        this.f160323n = parcel.readString();
        this.f160324o = parcel.readLong();
        this.f160325p = parcel.readString();
        this.f160326q = parcel.readString();
        this.f160327r = parcel.readString();
        this.f160328s = parcel.readString();
        this.f160329t = parcel.readByte() == 1;
        this.f160330u = parcel.readByte() == 1;
        this.f160331v = parcel.readInt();
        this.f160332w = parcel.readInt() == 1;
        this.f160333x = parcel.readString();
        this.f160334y = parcel.readLong();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160321i);
        parcel.writeString(this.f160322m);
        parcel.writeString(this.f160323n);
        parcel.writeLong(this.f160324o);
        parcel.writeString(this.f160325p);
        parcel.writeString(this.f160326q);
        parcel.writeString(this.f160327r);
        parcel.writeString(this.f160328s);
        parcel.writeByte(this.f160329t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f160330u ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f160331v);
        parcel.writeInt(this.f160332w ? 1 : 0);
        parcel.writeString(this.f160333x);
        parcel.writeLong(this.f160334y);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        x();
        boolean z17 = this.f160332w;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f160318f;
        int i17 = this.f160320h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f160319g;
        if (z17) {
            e9Var.a(i17, k0Var.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160333x) ? "fail" : java.lang.String.format("fail:%s", this.f160333x)));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("downloadId", java.lang.Long.valueOf(this.f160334y));
        e9Var.a(i17, k0Var.p("ok", hashMap));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        long b17;
        gm0.j1.i();
        if (gm0.j1.u().l()) {
            long j17 = this.f160324o;
            if (j17 > 0 && !fp.i.c(j17)) {
                this.f160333x = "fail_sdcard_has_not_enough_space";
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160322m)) {
                this.f160333x = "fail_invalid_url";
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddDownloadTask", "runInMainProcess taskUrl:%s md5:%s", this.f160322m, this.f160323n);
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0(null);
                t0Var.f178683a = this.f160322m;
                t0Var.f178685c = this.f160324o;
                t0Var.f178686d = this.f160321i;
                t0Var.f178687e = this.f160323n;
                t0Var.f178689g = this.f160327r;
                t0Var.f178690h = this.f160328s;
                t0Var.f178691i = true;
                t0Var.f178688f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(this.f160326q, 1);
                t0Var.f178694l = com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14493x3375bbf4;
                t0Var.f178699q = this.f160325p;
                t0Var.f178692j = this.f160330u;
                t0Var.f178696n = this.f160329t;
                t0Var.f178691i = false;
                t0Var.f178697o = true;
                if (this.f160331v == 1) {
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().c(t0Var);
                } else {
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().b(t0Var);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddDownloadTask", "doAddDownloadTaskStraight, downloadId = " + b17);
                if (b17 <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddDownloadTask", "doAddDownloadTaskStraight fail, downloadId = " + b17);
                    this.f160333x = "";
                } else {
                    this.f160332w = false;
                    this.f160334y = b17;
                }
            }
        } else {
            this.f160333x = "fail_sdcard_not_ready";
        }
        c();
    }

    public C11959xfbcf97e7(android.os.Parcel parcel) {
        v(parcel);
    }
}
