package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.ShareInfo */
/* loaded from: classes7.dex */
public class C12239x1921410d implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12239x1921410d> f34782x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.p2();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f164627d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f164628e;

    public C12239x1921410d(java.lang.String str, java.lang.String str2) {
        this.f164627d = str;
        this.f164628e = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f164627d);
        parcel.writeString(this.f164628e);
    }

    public C12239x1921410d(android.os.Parcel parcel, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.p2 p2Var) {
        this.f164627d = parcel.readString();
        this.f164628e = parcel.readString();
    }
}
