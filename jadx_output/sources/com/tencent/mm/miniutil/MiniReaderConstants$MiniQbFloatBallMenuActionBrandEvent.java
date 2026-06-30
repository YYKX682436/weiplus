package com.tencent.mm.miniutil;

/* loaded from: classes8.dex */
public final class MiniReaderConstants$MiniQbFloatBallMenuActionBrandEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.miniutil.MiniReaderConstants$MiniQbFloatBallMenuActionBrandEvent> CREATOR = new vt0.a();

    /* renamed from: d, reason: collision with root package name */
    public final int f69166d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f69167e;

    public MiniReaderConstants$MiniQbFloatBallMenuActionBrandEvent(int i17, java.lang.String str) {
        this.f69166d = i17;
        this.f69167e = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f69166d);
        parcel.writeString(this.f69167e);
    }

    public MiniReaderConstants$MiniQbFloatBallMenuActionBrandEvent(android.os.Parcel parcel) {
        this.f69166d = parcel.readInt();
        this.f69167e = parcel.readString();
    }
}
