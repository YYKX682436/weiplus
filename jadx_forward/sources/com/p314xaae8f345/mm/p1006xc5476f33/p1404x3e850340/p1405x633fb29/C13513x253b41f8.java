package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29;

/* renamed from: com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult */
/* loaded from: classes14.dex */
public class C13513x253b41f8 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13513x253b41f8> f35506x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.w();

    /* renamed from: d, reason: collision with root package name */
    public int f181481d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f181482e;

    public C13513x253b41f8(android.os.Parcel parcel) {
        this.f181481d = parcel.readInt();
        this.f181482e = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m55227x9616526c() {
        return "FaceCharacteristicsResult{mStatus=null, errCode=" + this.f181481d + ", errMsg='" + this.f181482e + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeParcelable(null, i17);
        parcel.writeInt(this.f181481d);
        parcel.writeString(this.f181482e);
    }
}
