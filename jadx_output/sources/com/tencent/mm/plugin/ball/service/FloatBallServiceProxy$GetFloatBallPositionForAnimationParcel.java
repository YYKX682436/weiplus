package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
class FloatBallServiceProxy$GetFloatBallPositionForAnimationParcel implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$GetFloatBallPositionForAnimationParcel> CREATOR = new com.tencent.mm.plugin.ball.service.v2();

    /* renamed from: d, reason: collision with root package name */
    public final int f93105d;

    /* renamed from: e, reason: collision with root package name */
    public final int f93106e;

    /* renamed from: f, reason: collision with root package name */
    public final int f93107f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Point f93108g;

    public FloatBallServiceProxy$GetFloatBallPositionForAnimationParcel(int i17, int i18, int i19, android.graphics.Point point) {
        this.f93105d = i17;
        this.f93106e = i18;
        this.f93107f = i19;
        this.f93108g = point;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f93105d);
        parcel.writeInt(this.f93106e);
        parcel.writeInt(this.f93107f);
        parcel.writeParcelable(this.f93108g, i17);
    }

    public FloatBallServiceProxy$GetFloatBallPositionForAnimationParcel(android.os.Parcel parcel) {
        this.f93105d = parcel.readInt();
        this.f93106e = parcel.readInt();
        this.f93107f = parcel.readInt();
        this.f93108g = (android.graphics.Point) parcel.readParcelable(android.graphics.Point.class.getClassLoader());
    }
}
