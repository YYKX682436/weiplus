package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckBioEnrollment$GetIsEnrolledTask */
/* loaded from: classes.dex */
public class C12017x720b0afb extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.C12017x720b0afb> f33915x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.b();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f161413f;

    /* renamed from: g, reason: collision with root package name */
    public final int f161414g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.c f161415h;

    /* renamed from: i, reason: collision with root package name */
    public int f161416i;

    /* renamed from: m, reason: collision with root package name */
    public int f161417m;

    public C12017x720b0afb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.c cVar) {
        this.f161413f = null;
        this.f161414g = -1;
        this.f161417m = -1;
        this.f161413f = lVar;
        this.f161414g = i17;
        this.f161415h = cVar;
        this.f161416i = i18;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        super.v(parcel);
        this.f161417m = parcel.readInt();
        this.f161416i = parcel.readInt();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        super.writeToParcel(parcel, i17);
        parcel.writeInt(this.f161417m);
        parcel.writeInt(this.f161416i);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        super.y();
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("isEnrolled", java.lang.Boolean.valueOf(this.f161417m == 1));
        int i17 = this.f161417m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bio.p1071x688c445.c cVar = this.f161415h;
        int i18 = this.f161414g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f161413f;
        if (i17 == 0) {
            lVar.a(i18, cVar.p("ok", hashMap));
        } else if (i17 == -1) {
            lVar.a(i18, cVar.p("fail not support", hashMap));
        } else if (i17 == 1) {
            lVar.a(i18, cVar.p("ok", hashMap));
        } else {
            lVar.a(i18, cVar.p("fail unknown error", hashMap));
        }
        x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5606x62766eb5 c5606x62766eb5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5606x62766eb5();
        c5606x62766eb5.f135931g.f90093a = this.f161416i;
        c5606x62766eb5.e();
        int i17 = c5606x62766eb5.f135932h.f87686a;
        this.f161417m = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetIsEnrolledTask", "hy: enrollResult: %d", java.lang.Integer.valueOf(i17));
        c();
    }

    public C12017x720b0afb(android.os.Parcel parcel) {
        this.f161413f = null;
        this.f161414g = -1;
        this.f161416i = -1;
        this.f161417m = -1;
        v(parcel);
    }
}
