package com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3;

/* renamed from: com.google.android.exoplayer2.metadata.id3.CommentFrame */
/* loaded from: classes13.dex */
public final class C1609x37d6426e extends com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1609x37d6426e> f5313x681a0c0c = new b9.e();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f125660e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f125661f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f125662g;

    public C1609x37d6426e(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super("COMM");
        this.f125660e = str;
        this.f125661f = str2;
        this.f125662g = str3;
    }

    /* renamed from: equals */
    public boolean m17177xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1609x37d6426e.class != obj.getClass()) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1609x37d6426e c1609x37d6426e = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1609x37d6426e) obj;
        return t9.d0.a(this.f125661f, c1609x37d6426e.f125661f) && t9.d0.a(this.f125660e, c1609x37d6426e.f125660e) && t9.d0.a(this.f125662g, c1609x37d6426e.f125662g);
    }

    /* renamed from: hashCode */
    public int m17178x8cdac1b() {
        java.lang.String str = this.f125660e;
        int hashCode = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f125661f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.f125662g;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f125667d);
        parcel.writeString(this.f125660e);
        parcel.writeString(this.f125662g);
    }

    public C1609x37d6426e(android.os.Parcel parcel) {
        super("COMM");
        this.f125660e = parcel.readString();
        this.f125661f = parcel.readString();
        this.f125662g = parcel.readString();
    }
}
