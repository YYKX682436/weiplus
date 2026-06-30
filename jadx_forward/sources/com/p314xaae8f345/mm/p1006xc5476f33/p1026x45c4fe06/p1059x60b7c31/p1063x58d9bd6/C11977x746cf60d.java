package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetMusicPlayerState$GetMusicPlayerState */
/* loaded from: classes11.dex */
class C11977x746cf60d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11977x746cf60d> f33761x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.f0();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160536f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f160537g;

    /* renamed from: h, reason: collision with root package name */
    public final int f160538h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f160539i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f160540m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f160541n;

    /* renamed from: o, reason: collision with root package name */
    public int f160542o;

    /* renamed from: p, reason: collision with root package name */
    public int f160543p;

    /* renamed from: q, reason: collision with root package name */
    public int f160544q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f160545r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f160546s;

    public C11977x746cf60d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f160536f = k0Var;
        this.f160537g = lVar;
        this.f160538h = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160539i = parcel.readString();
        this.f160540m = parcel.readByte() != 0;
        this.f160541n = parcel.readInt();
        this.f160542o = parcel.readInt();
        this.f160543p = parcel.readInt();
        this.f160544q = parcel.readInt();
        this.f160545r = parcel.readString();
        this.f160546s = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160539i);
        parcel.writeByte(this.f160540m ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f160541n);
        parcel.writeInt(this.f160542o);
        parcel.writeInt(this.f160543p);
        parcel.writeInt(this.f160544q);
        parcel.writeString(this.f160545r);
        parcel.writeString(this.f160546s);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        java.lang.String str;
        java.lang.String str2;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("duration", java.lang.Integer.valueOf(this.f160541n));
        hashMap.put("currentPosition", java.lang.Integer.valueOf(this.f160542o));
        hashMap.put("status", java.lang.Integer.valueOf(this.f160543p));
        hashMap.put("downloadPercent", java.lang.Integer.valueOf(this.f160544q));
        hashMap.put("dataUrl", this.f160545r);
        if (this.f160540m) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail");
            if (android.text.TextUtils.isEmpty(this.f160546s)) {
                str2 = "";
            } else {
                str2 = ":" + this.f160546s;
            }
            sb6.append(str2);
            str = sb6.toString();
        } else {
            str = "ok";
        }
        this.f160537g.a(this.f160538h, this.f160536f.p(str, hashMap));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        int i17;
        int i18;
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1156x636ee25.f.f167293a.f167294a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !str.equals(this.f160539i)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetMusicPlayerState", "appid not match cannot operate");
            this.f160540m = true;
            this.f160546s = "appid not match cannot operate";
            c();
            return;
        }
        b21.r b17 = b21.m.b();
        if (b17 != null) {
            b21.o a17 = b21.m.a();
            if (a17 != null) {
                i17 = a17.f98870a;
                i18 = a17.f98871b;
                this.f160543p = a17.f98872c;
                this.f160544q = a17.f98873d;
            } else {
                i17 = -1;
                i18 = -1;
            }
            this.f160541n = i17 / 1000;
            this.f160542o = i18 / 1000;
            this.f160545r = b17.f98885n;
            this.f160546s = "";
            this.f160540m = false;
        } else {
            this.f160543p = 2;
            this.f160546s = "";
            this.f160540m = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetMusicPlayerState", "duration %d , position %d ,status %s , downloadpercent %d , dataurl %s", java.lang.Integer.valueOf(this.f160541n), java.lang.Integer.valueOf(this.f160542o), java.lang.Integer.valueOf(this.f160543p), java.lang.Integer.valueOf(this.f160544q), this.f160545r);
        c();
    }

    public C11977x746cf60d(android.os.Parcel parcel) {
        v(parcel);
    }
}
