package com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3;

/* renamed from: com.google.android.exoplayer2.metadata.id3.UrlLinkFrame */
/* loaded from: classes13.dex */
public final class C1614xf5104 extends com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1614xf5104> f5317x681a0c0c = new b9.l();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f125672e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f125673f;

    public C1614xf5104(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str);
        this.f125672e = str2;
        this.f125673f = str3;
    }

    /* renamed from: equals */
    public boolean m17189xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1614xf5104.class != obj.getClass()) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1614xf5104 c1614xf5104 = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1614xf5104) obj;
        return this.f125667d.equals(c1614xf5104.f125667d) && t9.d0.a(this.f125672e, c1614xf5104.f125672e) && t9.d0.a(this.f125673f, c1614xf5104.f125673f);
    }

    /* renamed from: hashCode */
    public int m17190x8cdac1b() {
        int hashCode = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de + this.f125667d.hashCode()) * 31;
        java.lang.String str = this.f125672e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f125673f;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f125667d);
        parcel.writeString(this.f125672e);
        parcel.writeString(this.f125673f);
    }

    public C1614xf5104(android.os.Parcel parcel) {
        super(parcel.readString());
        this.f125672e = parcel.readString();
        this.f125673f = parcel.readString();
    }
}
