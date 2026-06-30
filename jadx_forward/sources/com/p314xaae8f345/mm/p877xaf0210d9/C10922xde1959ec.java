package com.p314xaae8f345.mm.p877xaf0210d9;

/* renamed from: com.tencent.mm.miniutil.MiniReaderConstants$MiniQbFloatBallMenuActionBrandEvent */
/* loaded from: classes8.dex */
public final class C10922xde1959ec implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p877xaf0210d9.C10922xde1959ec> f29762x681a0c0c = new vt0.a();

    /* renamed from: d, reason: collision with root package name */
    public final int f150699d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f150700e;

    public C10922xde1959ec(int i17, java.lang.String str) {
        this.f150699d = i17;
        this.f150700e = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f150699d);
        parcel.writeString(this.f150700e);
    }

    public C10922xde1959ec(android.os.Parcel parcel) {
        this.f150699d = parcel.readInt();
        this.f150700e = parcel.readString();
    }
}
