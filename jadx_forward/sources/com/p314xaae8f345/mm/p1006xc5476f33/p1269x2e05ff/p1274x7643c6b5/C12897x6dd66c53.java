package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$UpdateBallVisibilityParcel */
/* loaded from: classes14.dex */
class C12897x6dd66c53 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.C12897x6dd66c53> f35366x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.j4();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f174648d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d f174649e;

    public C12897x6dd66c53(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        this.f174648d = z17;
        this.f174649e = c12886x91aa2b6d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f174648d ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f174649e, i17);
    }

    public C12897x6dd66c53(android.os.Parcel parcel) {
        this.f174648d = parcel.readByte() != 0;
        this.f174649e = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.class.getClassLoader());
    }
}
