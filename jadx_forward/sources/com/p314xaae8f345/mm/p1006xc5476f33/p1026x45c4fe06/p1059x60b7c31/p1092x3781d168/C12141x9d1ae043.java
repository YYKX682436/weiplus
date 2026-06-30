package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1092x3781d168;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToMiniProgramFromH5Event */
/* loaded from: classes7.dex */
public class C12141x9d1ae043 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1092x3781d168.C12141x9d1ae043> f34345x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1092x3781d168.g();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f162804d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f162805e;

    /* renamed from: f, reason: collision with root package name */
    public int f162806f;

    public C12141x9d1ae043(android.os.Parcel parcel) {
        this.f162804d = parcel.readString();
        this.f162805e = parcel.readString();
        this.f162806f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f162804d);
        parcel.writeString(this.f162805e);
        parcel.writeInt(this.f162806f);
    }
}
