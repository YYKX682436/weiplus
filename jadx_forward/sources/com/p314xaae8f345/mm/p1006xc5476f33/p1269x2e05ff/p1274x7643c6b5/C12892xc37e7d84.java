package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$BallInfoListParcel */
/* loaded from: classes8.dex */
class C12892xc37e7d84 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.C12892xc37e7d84> f35361x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.g2();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f174635d;

    public C12892xc37e7d84(java.util.List list) {
        this.f174635d = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeTypedList(this.f174635d);
    }

    public C12892xc37e7d84(android.os.Parcel parcel) {
        this.f174635d = parcel.createTypedArrayList(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.f35354x681a0c0c);
    }
}
