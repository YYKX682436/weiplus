package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiLuggageCheckBioEnrollment$GetIsEnrolledTask */
/* loaded from: classes.dex */
class C12019x4c28200f extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.C12019x4c28200f> f33917x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.f();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f161422f;

    /* renamed from: g, reason: collision with root package name */
    public final int f161423g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.g f161424h;

    /* renamed from: i, reason: collision with root package name */
    public int f161425i;

    /* renamed from: m, reason: collision with root package name */
    public int f161426m;

    public C12019x4c28200f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.g gVar) {
        this.f161422f = null;
        this.f161423g = -1;
        this.f161426m = -1;
        this.f161422f = lVar;
        this.f161423g = i17;
        this.f161424h = gVar;
        this.f161425i = i18;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        super.v(parcel);
        this.f161426m = parcel.readInt();
        this.f161425i = parcel.readInt();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeInt(this.f161426m);
        parcel.writeInt(this.f161425i);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        super.y();
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("isEnrolled", java.lang.Boolean.valueOf(this.f161426m == 1));
        int i17 = this.f161426m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.g gVar = this.f161424h;
        int i18 = this.f161423g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f161422f;
        if (i17 == 0) {
            lVar.a(i18, gVar.p("ok", hashMap));
        } else if (i17 == -1) {
            lVar.a(i18, gVar.p("fail not support", hashMap));
        } else if (i17 == 1) {
            lVar.a(i18, gVar.p("ok", hashMap));
        } else {
            lVar.a(i18, gVar.p("fail unknown error", hashMap));
        }
        x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        android.content.Context context = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.g.f161433h;
        int i17 = 1;
        if (this.f161425i != 1) {
            i17 = -1;
        } else if (!wt5.a.p(context)) {
            i17 = 0;
        }
        this.f161426m = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetIsEnrolledTask", "hy: enrollResult: %d", java.lang.Integer.valueOf(i17));
        c();
    }

    public C12019x4c28200f(android.os.Parcel parcel) {
        this.f161422f = null;
        this.f161423g = -1;
        this.f161425i = -1;
        this.f161426m = -1;
        v(parcel);
    }
}
