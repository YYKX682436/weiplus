package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
class FloatBallServiceProxy$SetFloatBallAlphaParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$SetFloatBallAlphaParcel> CREATOR = new com.tencent.mm.plugin.ball.service.a4();

    /* renamed from: d, reason: collision with root package name */
    public final float f93113d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.ball.model.BallInfo f93114e;

    public FloatBallServiceProxy$SetFloatBallAlphaParcel(float f17, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.f93113d = f17;
        this.f93114e = ballInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeFloat(this.f93113d);
        parcel.writeParcelable(this.f93114e, i17);
    }

    public FloatBallServiceProxy$SetFloatBallAlphaParcel(android.os.Parcel parcel) {
        this.f93113d = parcel.readFloat();
        this.f93114e = (com.tencent.mm.plugin.ball.model.BallInfo) parcel.readParcelable(com.tencent.mm.plugin.ball.model.BallInfo.class.getClassLoader());
    }
}
