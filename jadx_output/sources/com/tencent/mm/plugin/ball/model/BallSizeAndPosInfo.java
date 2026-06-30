package com.tencent.mm.plugin.ball.model;

/* loaded from: classes14.dex */
public class BallSizeAndPosInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.ball.model.BallSizeAndPosInfo> CREATOR = new np1.f();

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Point f93095d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Point f93096e;

    public BallSizeAndPosInfo(android.graphics.Point point, android.graphics.Point point2) {
        this.f93095d = null;
        this.f93096e = null;
        this.f93095d = point;
        this.f93096e = point2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f93095d, i17);
        parcel.writeParcelable(this.f93096e, i17);
    }

    public BallSizeAndPosInfo(android.os.Parcel parcel) {
        this.f93095d = null;
        this.f93096e = null;
        this.f93095d = (android.graphics.Point) parcel.readParcelable(getClass().getClassLoader());
        this.f93096e = (android.graphics.Point) parcel.readParcelable(getClass().getClassLoader());
    }
}
