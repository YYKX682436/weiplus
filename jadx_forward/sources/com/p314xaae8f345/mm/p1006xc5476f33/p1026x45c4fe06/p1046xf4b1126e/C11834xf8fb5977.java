package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1046xf4b1126e;

/* renamed from: com.tencent.mm.plugin.appbrand.custom_loading.CustomLoadingAddHistoryRecordIPCData */
/* loaded from: classes7.dex */
public class C11834xf8fb5977 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1046xf4b1126e.C11834xf8fb5977> f33611x681a0c0c = new n91.a();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f159080d;

    /* renamed from: e, reason: collision with root package name */
    public int f159081e;

    /* renamed from: f, reason: collision with root package name */
    public int f159082f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f159083g;

    public C11834xf8fb5977(android.os.Parcel parcel) {
        this.f159080d = parcel.readString();
        this.f159081e = parcel.readInt();
        this.f159082f = parcel.readInt();
        this.f159083g = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f159080d);
        parcel.writeInt(this.f159081e);
        parcel.writeInt(this.f159082f);
        parcel.writeString(this.f159083g);
    }
}
