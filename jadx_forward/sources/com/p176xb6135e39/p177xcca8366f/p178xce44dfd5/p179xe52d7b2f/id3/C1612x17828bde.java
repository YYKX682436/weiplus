package com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3;

/* renamed from: com.google.android.exoplayer2.metadata.id3.PrivFrame */
/* loaded from: classes13.dex */
public final class C1612x17828bde extends com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1612x17828bde> f5315x681a0c0c = new b9.j();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f125668e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f125669f;

    public C1612x17828bde(java.lang.String str, byte[] bArr) {
        super("PRIV");
        this.f125668e = str;
        this.f125669f = bArr;
    }

    /* renamed from: equals */
    public boolean m17183xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1612x17828bde.class != obj.getClass()) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1612x17828bde c1612x17828bde = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1612x17828bde) obj;
        return t9.d0.a(this.f125668e, c1612x17828bde.f125668e) && java.util.Arrays.equals(this.f125669f, c1612x17828bde.f125669f);
    }

    /* renamed from: hashCode */
    public int m17184x8cdac1b() {
        java.lang.String str = this.f125668e;
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de + (str != null ? str.hashCode() : 0)) * 31) + java.util.Arrays.hashCode(this.f125669f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f125668e);
        parcel.writeByteArray(this.f125669f);
    }

    public C1612x17828bde(android.os.Parcel parcel) {
        super("PRIV");
        this.f125668e = parcel.readString();
        this.f125669f = parcel.createByteArray();
    }
}
