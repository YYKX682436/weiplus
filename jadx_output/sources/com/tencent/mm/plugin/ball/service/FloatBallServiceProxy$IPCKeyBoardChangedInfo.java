package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
class FloatBallServiceProxy$IPCKeyBoardChangedInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.ball.service.FloatBallServiceProxy$IPCKeyBoardChangedInfo> CREATOR = new com.tencent.mm.plugin.ball.service.b3();

    /* renamed from: d, reason: collision with root package name */
    public int f93109d;

    /* renamed from: e, reason: collision with root package name */
    public int f93110e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f93111f;

    /* renamed from: g, reason: collision with root package name */
    public long f93112g;

    public FloatBallServiceProxy$IPCKeyBoardChangedInfo(int i17, int i18, boolean z17, long j17) {
        this.f93109d = i17;
        this.f93110e = i18;
        this.f93111f = z17;
        this.f93112g = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f93109d);
        parcel.writeInt(this.f93110e);
        parcel.writeByte(this.f93111f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f93112g);
    }

    public FloatBallServiceProxy$IPCKeyBoardChangedInfo(android.os.Parcel parcel) {
        this.f93109d = parcel.readInt();
        this.f93110e = parcel.readInt();
        this.f93111f = parcel.readByte() != 0;
        this.f93112g = parcel.readLong();
    }
}
