package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* renamed from: com.tencent.mm.plugin.appbrand.app.AppBrandProcessSuicideLogic$RebootProcessAndTask */
/* loaded from: classes7.dex */
public class C11568x8734bb7d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11568x8734bb7d> f33409x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.u0();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f156526f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f156527g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 f156528h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f156529i;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f156526f = parcel.readString();
        this.f156527g = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4.class.getClassLoader());
        this.f156528h = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559.class.getClassLoader());
        this.f156529i = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f156526f);
        parcel.writeParcelable(this.f156527g, i17);
        parcel.writeParcelable(this.f156528h, i17);
        parcel.writeString(this.f156529i);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        jx3.f.INSTANCE.mo68477x336bdfd8(365L, 5L, 1L, false);
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.t0(this), 500L);
    }
}
