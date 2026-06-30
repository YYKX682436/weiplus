package com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3;

/* renamed from: com.google.android.exoplayer2.metadata.id3.ApicFrame */
/* loaded from: classes13.dex */
public final class C1605x77519d44 extends com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1605x77519d44> f5309x681a0c0c = new b9.a();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f125644e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f125645f;

    /* renamed from: g, reason: collision with root package name */
    public final int f125646g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f125647h;

    public C1605x77519d44(java.lang.String str, java.lang.String str2, int i17, byte[] bArr) {
        super("APIC");
        this.f125644e = str;
        this.f125645f = str2;
        this.f125646g = i17;
        this.f125647h = bArr;
    }

    /* renamed from: equals */
    public boolean m17165xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1605x77519d44.class != obj.getClass()) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1605x77519d44 c1605x77519d44 = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1605x77519d44) obj;
        return this.f125646g == c1605x77519d44.f125646g && t9.d0.a(this.f125644e, c1605x77519d44.f125644e) && t9.d0.a(this.f125645f, c1605x77519d44.f125645f) && java.util.Arrays.equals(this.f125647h, c1605x77519d44.f125647h);
    }

    /* renamed from: hashCode */
    public int m17166x8cdac1b() {
        int i17 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de + this.f125646g) * 31;
        java.lang.String str = this.f125644e;
        int hashCode = (i17 + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f125645f;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.f125647h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f125644e);
        parcel.writeString(this.f125645f);
        parcel.writeInt(this.f125646g);
        parcel.writeByteArray(this.f125647h);
    }

    public C1605x77519d44(android.os.Parcel parcel) {
        super("APIC");
        this.f125644e = parcel.readString();
        this.f125645f = parcel.readString();
        this.f125646g = parcel.readInt();
        this.f125647h = parcel.createByteArray();
    }
}
