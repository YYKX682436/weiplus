package com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3;

/* renamed from: com.google.android.exoplayer2.metadata.id3.GeobFrame */
/* loaded from: classes13.dex */
public final class C1610xb5efd49c extends com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1610xb5efd49c> f5314x681a0c0c = new b9.f();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f125663e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f125664f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f125665g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f125666h;

    public C1610xb5efd49c(java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr) {
        super("GEOB");
        this.f125663e = str;
        this.f125664f = str2;
        this.f125665g = str3;
        this.f125666h = bArr;
    }

    /* renamed from: equals */
    public boolean m17180xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1610xb5efd49c.class != obj.getClass()) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1610xb5efd49c c1610xb5efd49c = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1610xb5efd49c) obj;
        return t9.d0.a(this.f125663e, c1610xb5efd49c.f125663e) && t9.d0.a(this.f125664f, c1610xb5efd49c.f125664f) && t9.d0.a(this.f125665g, c1610xb5efd49c.f125665g) && java.util.Arrays.equals(this.f125666h, c1610xb5efd49c.f125666h);
    }

    /* renamed from: hashCode */
    public int m17181x8cdac1b() {
        java.lang.String str = this.f125663e;
        int hashCode = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f125664f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.f125665g;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.f125666h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f125663e);
        parcel.writeString(this.f125664f);
        parcel.writeString(this.f125665g);
        parcel.writeByteArray(this.f125666h);
    }

    public C1610xb5efd49c(android.os.Parcel parcel) {
        super("GEOB");
        this.f125663e = parcel.readString();
        this.f125664f = parcel.readString();
        this.f125665g = parcel.readString();
        this.f125666h = parcel.createByteArray();
    }
}
