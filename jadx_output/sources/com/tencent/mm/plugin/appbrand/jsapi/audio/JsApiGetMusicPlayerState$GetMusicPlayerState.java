package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes11.dex */
class JsApiGetMusicPlayerState$GetMusicPlayerState extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetMusicPlayerState$GetMusicPlayerState> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.audio.f0();

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f79003f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f79004g;

    /* renamed from: h, reason: collision with root package name */
    public final int f79005h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f79006i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f79007m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f79008n;

    /* renamed from: o, reason: collision with root package name */
    public int f79009o;

    /* renamed from: p, reason: collision with root package name */
    public int f79010p;

    /* renamed from: q, reason: collision with root package name */
    public int f79011q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f79012r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f79013s;

    public JsApiGetMusicPlayerState$GetMusicPlayerState(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f79003f = k0Var;
        this.f79004g = lVar;
        this.f79005h = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f79006i = parcel.readString();
        this.f79007m = parcel.readByte() != 0;
        this.f79008n = parcel.readInt();
        this.f79009o = parcel.readInt();
        this.f79010p = parcel.readInt();
        this.f79011q = parcel.readInt();
        this.f79012r = parcel.readString();
        this.f79013s = parcel.readString();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f79006i);
        parcel.writeByte(this.f79007m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f79008n);
        parcel.writeInt(this.f79009o);
        parcel.writeInt(this.f79010p);
        parcel.writeInt(this.f79011q);
        parcel.writeString(this.f79012r);
        parcel.writeString(this.f79013s);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void y() {
        java.lang.String str;
        java.lang.String str2;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("duration", java.lang.Integer.valueOf(this.f79008n));
        hashMap.put("currentPosition", java.lang.Integer.valueOf(this.f79009o));
        hashMap.put("status", java.lang.Integer.valueOf(this.f79010p));
        hashMap.put("downloadPercent", java.lang.Integer.valueOf(this.f79011q));
        hashMap.put("dataUrl", this.f79012r);
        if (this.f79007m) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail");
            if (android.text.TextUtils.isEmpty(this.f79013s)) {
                str2 = "";
            } else {
                str2 = ":" + this.f79013s;
            }
            sb6.append(str2);
            str = sb6.toString();
        } else {
            str = "ok";
        }
        this.f79004g.a(this.f79005h, this.f79003f.p(str, hashMap));
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        int i17;
        int i18;
        java.lang.String str = com.tencent.mm.plugin.appbrand.media.music.f.f85760a.f85761a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !str.equals(this.f79006i)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetMusicPlayerState", "appid not match cannot operate");
            this.f79007m = true;
            this.f79013s = "appid not match cannot operate";
            c();
            return;
        }
        b21.r b17 = b21.m.b();
        if (b17 != null) {
            b21.o a17 = b21.m.a();
            if (a17 != null) {
                i17 = a17.f17337a;
                i18 = a17.f17338b;
                this.f79010p = a17.f17339c;
                this.f79011q = a17.f17340d;
            } else {
                i17 = -1;
                i18 = -1;
            }
            this.f79008n = i17 / 1000;
            this.f79009o = i18 / 1000;
            this.f79012r = b17.f17352n;
            this.f79013s = "";
            this.f79007m = false;
        } else {
            this.f79010p = 2;
            this.f79013s = "";
            this.f79007m = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetMusicPlayerState", "duration %d , position %d ,status %s , downloadpercent %d , dataurl %s", java.lang.Integer.valueOf(this.f79008n), java.lang.Integer.valueOf(this.f79009o), java.lang.Integer.valueOf(this.f79010p), java.lang.Integer.valueOf(this.f79011q), this.f79012r);
        c();
    }

    public JsApiGetMusicPlayerState$GetMusicPlayerState(android.os.Parcel parcel) {
        v(parcel);
    }
}
