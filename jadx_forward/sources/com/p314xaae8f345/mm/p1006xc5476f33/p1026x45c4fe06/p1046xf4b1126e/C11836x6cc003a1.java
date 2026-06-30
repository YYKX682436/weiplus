package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1046xf4b1126e;

/* renamed from: com.tencent.mm.plugin.appbrand.custom_loading.CustomLoadingUpdateRecordIPCData */
/* loaded from: classes7.dex */
public class C11836x6cc003a1 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1046xf4b1126e.C11836x6cc003a1> f33613x681a0c0c = new n91.o();

    /* renamed from: d, reason: collision with root package name */
    public boolean f159086d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f159087e;

    /* renamed from: f, reason: collision with root package name */
    public int f159088f;

    public C11836x6cc003a1(android.os.Parcel parcel) {
        this.f159087e = parcel.readString();
        this.f159088f = parcel.readInt();
        this.f159086d = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f159087e);
        parcel.writeInt(this.f159088f);
        parcel.writeInt(this.f159086d ? 1 : 0);
    }
}
