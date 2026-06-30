package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiWriteCommData$WriteCommDataTask */
/* loaded from: classes.dex */
class C11950x5b42b19a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11950x5b42b19a> f33679x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bf();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160191f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f160192g;

    /* renamed from: h, reason: collision with root package name */
    public final int f160193h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f160194i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160195m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f160196n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f160197o;

    public C11950x5b42b19a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, org.json.JSONObject jSONObject) {
        this.f160191f = k0Var;
        this.f160192g = lVar;
        this.f160193h = i17;
        this.f160194i = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56317xb68cafb1);
        this.f160195m = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        this.f160196n = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160194i = parcel.readString();
        this.f160195m = parcel.readString();
        this.f160196n = parcel.readInt() == 1;
        this.f160197o = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f160194i);
        parcel.writeString(this.f160195m);
        parcel.writeInt(this.f160196n ? 1 : 0);
        parcel.writeString(this.f160197o);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        boolean z17 = this.f160196n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f160191f;
        int i17 = this.f160193h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f160192g;
        if (z17) {
            lVar.a(i17, k0Var.o(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160197o) ? "fail" : java.lang.String.format("fail:%s", this.f160197o)));
        } else {
            lVar.a(i17, k0Var.o("ok"));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f160194i)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiWriteCommData", "packageName nil");
        } else {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            this.f160196n = !context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b + "_comm_preferences", 0).edit().putString(this.f160194i, this.f160195m).commit();
        }
        c();
    }

    public C11950x5b42b19a(android.os.Parcel parcel) {
        v(parcel);
    }
}
