package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api;

/* renamed from: com.tencent.mm.plugin.lite.api.IPCCallbackData */
/* loaded from: classes14.dex */
class C16189x298f2fab implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16189x298f2fab> f37324x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.j();

    /* renamed from: d, reason: collision with root package name */
    public boolean f224939d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f224940e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f224941f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f224942g;

    public C16189x298f2fab() {
        this.f224939d = false;
        this.f224940e = false;
        this.f224941f = null;
        this.f224942g = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f224939d ? 1 : 0);
        parcel.writeInt(this.f224940e ? 1 : 0);
        parcel.writeString(this.f224941f);
        parcel.writeString(this.f224942g);
    }

    public C16189x298f2fab(android.os.Parcel parcel) {
        this.f224939d = false;
        this.f224940e = false;
        this.f224941f = null;
        this.f224942g = null;
        this.f224939d = parcel.readInt() == 1;
        this.f224940e = parcel.readInt() == 1;
        this.f224941f = parcel.readString();
        this.f224942g = parcel.readString();
    }
}
