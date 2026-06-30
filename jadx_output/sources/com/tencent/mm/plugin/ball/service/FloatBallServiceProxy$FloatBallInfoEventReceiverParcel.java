package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
final class FloatBallServiceProxy$FloatBallInfoEventReceiverParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$FloatBallInfoEventReceiverParcel> CREATOR = new com.tencent.mm.plugin.ball.service.p2();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.ball.model.BallInfo f93103d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.ResultReceiver f93104e;

    public FloatBallServiceProxy$FloatBallInfoEventReceiverParcel(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, android.os.ResultReceiver resultReceiver) {
        this.f93103d = ballInfo;
        this.f93104e = resultReceiver;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f93103d, i17);
        parcel.writeParcelable(this.f93104e, i17);
    }

    public FloatBallServiceProxy$FloatBallInfoEventReceiverParcel(android.os.Parcel parcel) {
        this.f93103d = (com.tencent.mm.plugin.ball.model.BallInfo) parcel.readParcelable(com.tencent.mm.plugin.ball.model.BallInfo.class.getClassLoader());
        this.f93104e = (android.os.ResultReceiver) parcel.readParcelable(android.os.ResultReceiver.class.getClassLoader());
    }
}
