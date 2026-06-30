package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1799x5b09653;

/* renamed from: com.tencent.mm.plugin.lite.debug.LiteAppDebugIPCCallbackData */
/* loaded from: classes8.dex */
class C16195xa9480b implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1799x5b09653.C16195xa9480b> f37380x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1799x5b09653.c();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f224990d;

    public C16195xa9480b() {
        this.f224990d = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f224990d);
    }

    public C16195xa9480b(android.os.Parcel parcel) {
        this.f224990d = null;
        this.f224990d = parcel.readString();
    }
}
