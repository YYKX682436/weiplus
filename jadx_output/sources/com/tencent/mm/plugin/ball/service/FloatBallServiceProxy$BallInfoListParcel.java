package com.tencent.mm.plugin.ball.service;

/* loaded from: classes8.dex */
class FloatBallServiceProxy$BallInfoListParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$BallInfoListParcel> CREATOR = new com.tencent.mm.plugin.ball.service.g2();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f93102d;

    public FloatBallServiceProxy$BallInfoListParcel(java.util.List list) {
        this.f93102d = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeTypedList(this.f93102d);
    }

    public FloatBallServiceProxy$BallInfoListParcel(android.os.Parcel parcel) {
        this.f93102d = parcel.createTypedArrayList(com.tencent.mm.plugin.ball.model.BallInfo.CREATOR);
    }
}
