package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$AppidABTestIpcWrapper */
/* loaded from: classes7.dex */
public class C12342x9640fe16 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12342x9640fe16> f35056x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.d7();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f165960d;

    /* renamed from: e, reason: collision with root package name */
    public int f165961e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashMap f165962f;

    public C12342x9640fe16(android.os.Parcel parcel) {
        this.f165960d = parcel.readString();
        this.f165961e = parcel.readInt();
        this.f165962f = parcel.readHashMap(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f165960d);
        parcel.writeInt(this.f165961e);
        parcel.writeMap(this.f165962f);
    }
}
