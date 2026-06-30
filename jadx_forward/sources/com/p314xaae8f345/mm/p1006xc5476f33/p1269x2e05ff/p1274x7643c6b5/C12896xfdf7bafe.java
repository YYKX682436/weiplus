package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$SetFloatBallAlphaParcel */
/* loaded from: classes14.dex */
class C12896xfdf7bafe implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.C12896xfdf7bafe> f35365x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.a4();

    /* renamed from: d, reason: collision with root package name */
    public final float f174646d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d f174647e;

    public C12896xfdf7bafe(float f17, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        this.f174646d = f17;
        this.f174647e = c12886x91aa2b6d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeFloat(this.f174646d);
        parcel.writeParcelable(this.f174647e, i17);
    }

    public C12896xfdf7bafe(android.os.Parcel parcel) {
        this.f174646d = parcel.readFloat();
        this.f174647e = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) parcel.readParcelable(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.class.getClassLoader());
    }
}
