package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b;

/* renamed from: com.tencent.mm.plugin.lite.storage.LiteAppSamplingConfigInfo */
/* loaded from: classes13.dex */
public class C16234x732d4a2a extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.e implements android.os.Parcelable {

    /* renamed from: z, reason: collision with root package name */
    public static final l75.e0 f225705z = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.e.m65846x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16234x732d4a2a.class);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16234x732d4a2a> f37405x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.n();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.e, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return null;
    }

    /* renamed from: toString */
    public java.lang.String m65836x9616526c() {
        return "LiteAppSamplingConfigInfo: {appId: " + this.f37443x28d45f97 + ", signatureKey: " + this.f37448xb47be1ac + ", updateTime: " + this.f37449xa783a79b + ", md5: " + this.f37447x4b6e68b9 + ", dynamicConfigPath: " + this.f37445xfa022421 + ", iLinkVersion: " + this.f37446x32c0227a + ", configJson: " + this.f37444xeab2a7af + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f37443x28d45f97);
        parcel.writeString(this.f37448xb47be1ac);
        parcel.writeLong(this.f37449xa783a79b);
        parcel.writeString(this.f37447x4b6e68b9);
        parcel.writeString(this.f37445xfa022421);
        parcel.writeInt(this.f37446x32c0227a);
        parcel.writeString(this.f37444xeab2a7af);
    }
}
