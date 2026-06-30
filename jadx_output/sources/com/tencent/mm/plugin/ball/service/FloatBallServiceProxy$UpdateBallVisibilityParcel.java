package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
class FloatBallServiceProxy$UpdateBallVisibilityParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$UpdateBallVisibilityParcel> CREATOR = new com.tencent.mm.plugin.ball.service.j4();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f93115d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.ball.model.BallInfo f93116e;

    public FloatBallServiceProxy$UpdateBallVisibilityParcel(boolean z17, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.f93115d = z17;
        this.f93116e = ballInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f93115d ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f93116e, i17);
    }

    public FloatBallServiceProxy$UpdateBallVisibilityParcel(android.os.Parcel parcel) {
        this.f93115d = parcel.readByte() != 0;
        this.f93116e = (com.tencent.mm.plugin.ball.model.BallInfo) parcel.readParcelable(com.tencent.mm.plugin.ball.model.BallInfo.class.getClassLoader());
    }
}
