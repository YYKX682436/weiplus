package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.AppIdentity */
/* loaded from: classes7.dex */
public final class C11713x87e645df implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11713x87e645df> f33505x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.g3();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f157892d;

    /* renamed from: e, reason: collision with root package name */
    public final int f157893e;

    public C11713x87e645df(java.lang.String str, int i17) {
        this.f157892d = str;
        this.f157893e = i17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f157892d);
        parcel.writeInt(this.f157893e);
    }

    public C11713x87e645df(android.os.Parcel parcel) {
        this.f157892d = parcel.readString();
        this.f157893e = parcel.readInt();
    }
}
