package com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3;

/* renamed from: com.google.android.exoplayer2.metadata.id3.TextInformationFrame */
/* loaded from: classes13.dex */
public final class C1613xb01630e extends com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1613xb01630e> f5316x681a0c0c = new b9.k();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f125670e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f125671f;

    public C1613xb01630e(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str);
        this.f125670e = str2;
        this.f125671f = str3;
    }

    /* renamed from: equals */
    public boolean m17186xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1613xb01630e.class != obj.getClass()) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1613xb01630e c1613xb01630e = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1613xb01630e) obj;
        return this.f125667d.equals(c1613xb01630e.f125667d) && t9.d0.a(this.f125670e, c1613xb01630e.f125670e) && t9.d0.a(this.f125671f, c1613xb01630e.f125671f);
    }

    /* renamed from: hashCode */
    public int m17187x8cdac1b() {
        int hashCode = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de + this.f125667d.hashCode()) * 31;
        java.lang.String str = this.f125670e;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f125671f;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f125667d);
        parcel.writeString(this.f125670e);
        parcel.writeString(this.f125671f);
    }

    public C1613xb01630e(android.os.Parcel parcel) {
        super(parcel.readString());
        this.f125670e = parcel.readString();
        this.f125671f = parcel.readString();
    }
}
