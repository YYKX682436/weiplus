package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29;

/* renamed from: com.tencent.mm.plugin.ball.model.BallSizeAndPosInfo */
/* loaded from: classes14.dex */
public class C12888x6374022b implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12888x6374022b> f35359x681a0c0c = new np1.f();

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Point f174628d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Point f174629e;

    public C12888x6374022b(android.graphics.Point point, android.graphics.Point point2) {
        this.f174628d = null;
        this.f174629e = null;
        this.f174628d = point;
        this.f174629e = point2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(this.f174628d, i17);
        parcel.writeParcelable(this.f174629e, i17);
    }

    public C12888x6374022b(android.os.Parcel parcel) {
        this.f174628d = null;
        this.f174629e = null;
        this.f174628d = (android.graphics.Point) parcel.readParcelable(getClass().getClassLoader());
        this.f174629e = (android.graphics.Point) parcel.readParcelable(getClass().getClassLoader());
    }
}
