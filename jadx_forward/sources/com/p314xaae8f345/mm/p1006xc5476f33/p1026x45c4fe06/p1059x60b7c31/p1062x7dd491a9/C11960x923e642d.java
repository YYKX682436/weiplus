package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskForNative$AddDownloadTask */
/* loaded from: classes.dex */
public class C11960x923e642d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.C11960x923e642d> f33705x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.s();
    public java.lang.String A;
    public long B;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160335f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f160336g;

    /* renamed from: h, reason: collision with root package name */
    public final int f160337h;

    /* renamed from: i, reason: collision with root package name */
    public org.json.JSONObject f160338i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160339m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f160340n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f160341o;

    /* renamed from: p, reason: collision with root package name */
    public long f160342p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f160343q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f160344r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f160345s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f160346t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f160347u;

    /* renamed from: v, reason: collision with root package name */
    public int f160348v;

    /* renamed from: w, reason: collision with root package name */
    public int f160349w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f160350x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f160351y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f160352z;

    public C11960x923e642d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, org.json.JSONObject jSONObject) {
        this.f160335f = k0Var;
        this.f160336g = e9Var;
        this.f160337h = i17;
        this.f160338i = jSONObject;
        this.f160339m = jSONObject.optString("taskName");
        this.f160340n = jSONObject.optString("taskUrl");
        this.f160341o = jSONObject.optString("fileMd5");
        this.f160342p = jSONObject.optInt("taskSize", 0);
        this.f160343q = jSONObject.optString("extInfo");
        this.f160344r = jSONObject.optString("fileType");
        this.f160345s = jSONObject.optString("appId");
        this.f160346t = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
        this.f160347u = jSONObject.optBoolean("downloadInWifi", false);
        this.f160348v = jSONObject.optInt("downloaderType", 0);
        this.f160350x = jSONObject.optBoolean("useDownloaderWidget", false);
        this.f160349w = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, com.p314xaae8f345.p373xbe494963.C3727x6f6b8f94.f14493x3375bbf4);
        this.f160351y = jSONObject.optString("alterUrl");
        this.f160352z = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160339m = parcel.readString();
        this.f160340n = parcel.readString();
        this.f160341o = parcel.readString();
        this.f160342p = parcel.readLong();
        this.f160343q = parcel.readString();
        this.f160344r = parcel.readString();
        this.f160345s = parcel.readString();
        this.f160346t = parcel.readString();
        this.f160347u = parcel.readInt() == 1;
        this.f160348v = parcel.readInt();
        this.f160352z = parcel.readInt() == 1;
        this.A = parcel.readString();
        this.B = parcel.readLong();
        this.f160349w = parcel.readInt();
        this.f160350x = parcel.readInt() == 1;
        try {
            this.f160338i = new org.json.JSONObject(parcel.readString());
        } catch (java.lang.Exception e17) {
            e17.getMessage();
        }
        this.f160351y = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160339m);
        parcel.writeString(this.f160340n);
        parcel.writeString(this.f160341o);
        parcel.writeLong(this.f160342p);
        parcel.writeString(this.f160343q);
        parcel.writeString(this.f160344r);
        parcel.writeString(this.f160345s);
        parcel.writeString(this.f160346t);
        parcel.writeInt(this.f160347u ? 1 : 0);
        parcel.writeInt(this.f160348v);
        parcel.writeInt(this.f160352z ? 1 : 0);
        parcel.writeString(this.A);
        parcel.writeLong(this.B);
        parcel.writeInt(this.f160349w);
        parcel.writeInt(this.f160350x ? 1 : 0);
        org.json.JSONObject jSONObject = this.f160338i;
        parcel.writeString(jSONObject != null ? jSONObject.toString() : "");
        parcel.writeString(this.f160351y);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        x();
        boolean z17 = this.f160352z;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f160335f;
        int i17 = this.f160337h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f160336g;
        if (z17) {
            e9Var.a(i17, k0Var.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.A) ? "fail" : java.lang.String.format("fail:%s", this.A)));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("downloadId", java.lang.Long.valueOf(this.B));
        e9Var.a(i17, k0Var.p("ok", hashMap));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        long b17;
        gm0.j1.i();
        if (gm0.j1.u().l()) {
            long j17 = this.f160342p;
            if (j17 > 0 && !fp.i.c(j17)) {
                this.A = "fail_sdcard_has_not_enough_space";
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160340n)) {
                this.A = "fail_invalid_url";
            } else if (this.f160350x) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.a.a(this.f160338i);
                vz.a2 a2Var = (vz.a2) i95.n0.c(vz.a2.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.r rVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.r(this);
                ((uz.c2) a2Var).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j1.c(context, a17, false, rVar);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddDownloadTaskForNative", "runInMainProcess taskUrl:%s md5:%s", this.f160340n, this.f160341o);
                com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0(null);
                t0Var.f178683a = this.f160340n;
                t0Var.f178685c = this.f160342p;
                t0Var.f178686d = this.f160339m;
                t0Var.f178687e = this.f160341o;
                t0Var.f178689g = this.f160345s;
                t0Var.f178690h = this.f160346t;
                t0Var.f178691i = true;
                t0Var.f178688f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(this.f160344r, 1);
                t0Var.f178694l = this.f160349w;
                t0Var.f178699q = this.f160343q;
                t0Var.f178697o = true;
                t0Var.f178684b = this.f160351y;
                if (this.f160348v == 1) {
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().c(t0Var);
                } else {
                    ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
                    b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().b(t0Var);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiAddDownloadTaskForNative", "doAddDownloadTaskStraight, downloadId = " + b17);
                if (b17 <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddDownloadTaskForNative", "doAddDownloadTaskStraight fail, downloadId = " + b17);
                    this.A = "";
                } else {
                    this.f160352z = false;
                    this.B = b17;
                }
            }
        } else {
            this.A = "fail_sdcard_not_ready";
        }
        c();
    }

    public C11960x923e642d(android.os.Parcel parcel) {
        v(parcel);
    }
}
