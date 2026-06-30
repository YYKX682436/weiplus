package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* renamed from: com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$IPCKeyBoardChangedInfo */
/* loaded from: classes14.dex */
class C12895x48ded98f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.C12895x48ded98f> f35364x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.b3();

    /* renamed from: d, reason: collision with root package name */
    public int f174642d;

    /* renamed from: e, reason: collision with root package name */
    public int f174643e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f174644f;

    /* renamed from: g, reason: collision with root package name */
    public long f174645g;

    public C12895x48ded98f(int i17, int i18, boolean z17, long j17) {
        this.f174642d = i17;
        this.f174643e = i18;
        this.f174644f = z17;
        this.f174645g = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f174642d);
        parcel.writeInt(this.f174643e);
        parcel.writeByte(this.f174644f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f174645g);
    }

    public C12895x48ded98f(android.os.Parcel parcel) {
        this.f174642d = parcel.readInt();
        this.f174643e = parcel.readInt();
        this.f174644f = parcel.readByte() != 0;
        this.f174645g = parcel.readLong();
    }
}
