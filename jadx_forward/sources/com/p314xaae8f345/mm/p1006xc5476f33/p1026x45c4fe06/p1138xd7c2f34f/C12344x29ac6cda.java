package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.ILaunchWxaAppInfoNotify$PluginIpcWrapper */
/* loaded from: classes7.dex */
public class C12344x29ac6cda implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12344x29ac6cda> f35058x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f7();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f165966d;

    /* renamed from: e, reason: collision with root package name */
    public int f165967e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashMap f165968f;

    public C12344x29ac6cda(android.os.Parcel parcel) {
        this.f165966d = parcel.readString();
        this.f165967e = parcel.readInt();
        this.f165968f = parcel.readHashMap(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f165966d);
        parcel.writeInt(this.f165967e);
        parcel.writeMap(this.f165968f);
    }
}
