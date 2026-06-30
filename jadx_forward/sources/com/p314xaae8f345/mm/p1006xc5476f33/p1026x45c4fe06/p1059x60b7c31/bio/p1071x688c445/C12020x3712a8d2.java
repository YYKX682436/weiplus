package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiLuggageCheckIsSupportSoterAuthentication$GetIsSupportSoterTask */
/* loaded from: classes15.dex */
class C12020x3712a8d2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.C12020x3712a8d2> f33918x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.h();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f161427f;

    /* renamed from: g, reason: collision with root package name */
    public final int f161428g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.i f161429h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f161430i;

    public C12020x3712a8d2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.i iVar) {
        this.f161427f = null;
        this.f161428g = -1;
        this.f161430i = "";
        this.f161427f = lVar;
        this.f161428g = i17;
        this.f161429h = iVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        super.v(parcel);
        this.f161430i = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeString(this.f161430i);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        super.y();
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("verifyRemote", this.f161430i);
        hashMap.put("nativeSupport", java.lang.Boolean.valueOf(wt5.a.l()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetIsSupportSoterTask", "hy: nativeSupport:" + wt5.a.l());
        this.f161427f.a(this.f161428g, this.f161429h.p("ok", hashMap));
        x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        java.lang.String b17 = wt5.a.b();
        this.f161430i = b17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetIsSupportSoterTask", "hy: verifyRemoteStr: %s", b17);
        c();
    }

    public C12020x3712a8d2(android.os.Parcel parcel) {
        this.f161427f = null;
        this.f161428g = -1;
        this.f161430i = "";
        v(parcel);
    }
}
