package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiRefreshSession$RefreshSessionTask */
/* loaded from: classes7.dex */
public class C11938xcba80598 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11938xcba80598> f33670x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.fc();

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160133f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f160134g;

    /* renamed from: h, reason: collision with root package name */
    public int f160135h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f160136i;

    /* renamed from: m, reason: collision with root package name */
    public int f160137m;

    /* renamed from: n, reason: collision with root package name */
    public int f160138n;

    /* renamed from: o, reason: collision with root package name */
    public int f160139o;

    /* renamed from: p, reason: collision with root package name */
    public int f160140p;

    /* renamed from: q, reason: collision with root package name */
    public int f160141q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f160142r;

    public C11938xcba80598() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160137m = parcel.readInt();
        this.f160138n = parcel.readInt();
        this.f160139o = parcel.readInt();
        this.f160135h = parcel.readInt();
        this.f160136i = parcel.readString();
        this.f160140p = parcel.readInt();
        this.f160141q = parcel.readInt();
        this.f160142r = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f160137m);
        parcel.writeInt(this.f160138n);
        parcel.writeInt(this.f160139o);
        parcel.writeInt(this.f160135h);
        parcel.writeString(this.f160136i);
        parcel.writeInt(this.f160140p);
        parcel.writeInt(this.f160141q);
        parcel.writeString(this.f160142r);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        java.lang.String format;
        java.util.HashMap hashMap = new java.util.HashMap();
        int i17 = this.f160139o;
        if (i17 != 1) {
            if (i17 != 2) {
                format = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160142r) ? "fail" : java.lang.String.format("fail:%s", this.f160142r);
                hashMap.put("errCode", "-1");
                this.f160134g.a(this.f160135h, this.f160133f.p(format, hashMap));
            } else {
                format = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160142r) ? "fail" : java.lang.String.format("fail:%s", this.f160142r);
                hashMap.put("errCode", this.f160138n + "");
                this.f160134g.a(this.f160135h, this.f160133f.p(format, hashMap));
            }
        } else {
            hashMap.put("expireIn", this.f160137m + "");
            hashMap.put("errCode", this.f160138n + "");
            this.f160134g.a(this.f160135h, this.f160133f.p("ok", hashMap));
        }
        x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.o24();
        lVar.f152198b = new r45.p24();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/js-refreshsession";
        lVar.f152200d = tj.f.f76816x366c91de;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        r45.o24 o24Var = new r45.o24();
        o24Var.f463378d = this.f160136i;
        o24Var.f463379e = this.f160140p;
        lVar.f152197a = o24Var;
        if (this.f160141q > 0) {
            r45.nd7 nd7Var = new r45.nd7();
            o24Var.f463380f = nd7Var;
            nd7Var.f462829e = this.f160141q;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRefreshSession", "refreshSession appId %s, versionType, statScene %d", this.f160136i, java.lang.Integer.valueOf(this.f160140p), java.lang.Integer.valueOf(this.f160141q));
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ec(this), true);
    }

    public C11938xcba80598(android.os.Parcel parcel) {
        v(parcel);
    }
}
