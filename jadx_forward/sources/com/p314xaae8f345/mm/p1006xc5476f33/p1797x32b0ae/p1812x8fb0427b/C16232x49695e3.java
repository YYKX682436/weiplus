package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b;

/* renamed from: com.tencent.mm.plugin.lite.storage.LiteAppConfigInfo */
/* loaded from: classes13.dex */
public class C16232x49695e3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.c implements android.os.Parcelable {
    public static final l75.e0 B = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.c.m65842x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3.class);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.C16232x49695e3> f37404x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.j();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1812x8fb0427b.c, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return null;
    }

    /* renamed from: toString */
    public java.lang.String m65834x9616526c() {
        return "LiteAppConfigInfo: {appId: " + this.f37422x28d45f97 + ", signatureKey: " + this.f37428xb47be1ac + ", md5: " + this.f37426x4b6e68b9 + ", updateTime: " + this.f37429xa783a79b + ", ilinkVersion: " + this.f37425x32c0227a + ", packageConfigPath: " + this.f37427x7ec9db68 + ", dynamicConfigPath: " + this.f37424xfa022421 + ", configJson: " + this.f37423xeab2a7af + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f37422x28d45f97);
        parcel.writeString(this.f37428xb47be1ac);
        parcel.writeString(this.f37427x7ec9db68);
        parcel.writeLong(this.f37429xa783a79b);
        parcel.writeString(this.f37426x4b6e68b9);
        parcel.writeString(this.f37424xfa022421);
        parcel.writeInt(this.f37425x32c0227a);
        parcel.writeString(this.f37423xeab2a7af);
    }
}
