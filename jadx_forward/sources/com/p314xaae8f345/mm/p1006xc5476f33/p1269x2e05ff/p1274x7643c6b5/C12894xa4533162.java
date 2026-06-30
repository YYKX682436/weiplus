package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$GetFloatBallPositionForAnimationParcel */
/* loaded from: classes14.dex */
class C12894xa4533162 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.C12894xa4533162> f35363x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.v2();

    /* renamed from: d, reason: collision with root package name */
    public final int f174638d;

    /* renamed from: e, reason: collision with root package name */
    public final int f174639e;

    /* renamed from: f, reason: collision with root package name */
    public final int f174640f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Point f174641g;

    public C12894xa4533162(int i17, int i18, int i19, android.graphics.Point point) {
        this.f174638d = i17;
        this.f174639e = i18;
        this.f174640f = i19;
        this.f174641g = point;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f174638d);
        parcel.writeInt(this.f174639e);
        parcel.writeInt(this.f174640f);
        parcel.writeParcelable(this.f174641g, i17);
    }

    public C12894xa4533162(android.os.Parcel parcel) {
        this.f174638d = parcel.readInt();
        this.f174639e = parcel.readInt();
        this.f174640f = parcel.readInt();
        this.f174641g = (android.graphics.Point) parcel.readParcelable(android.graphics.Point.class.getClassLoader());
    }
}
