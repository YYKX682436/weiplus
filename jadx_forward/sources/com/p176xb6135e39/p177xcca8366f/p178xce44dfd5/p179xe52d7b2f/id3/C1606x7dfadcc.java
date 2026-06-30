package com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3;

/* renamed from: com.google.android.exoplayer2.metadata.id3.BinaryFrame */
/* loaded from: classes13.dex */
public final class C1606x7dfadcc extends com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1606x7dfadcc> f5310x681a0c0c = new b9.b();

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f125648e;

    public C1606x7dfadcc(java.lang.String str, byte[] bArr) {
        super(str);
        this.f125648e = bArr;
    }

    /* renamed from: equals */
    public boolean m17168xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1606x7dfadcc.class != obj.getClass()) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1606x7dfadcc c1606x7dfadcc = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1606x7dfadcc) obj;
        return this.f125667d.equals(c1606x7dfadcc.f125667d) && java.util.Arrays.equals(this.f125648e, c1606x7dfadcc.f125648e);
    }

    /* renamed from: hashCode */
    public int m17169x8cdac1b() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de + this.f125667d.hashCode()) * 31) + java.util.Arrays.hashCode(this.f125648e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f125667d);
        parcel.writeByteArray(this.f125648e);
    }

    public C1606x7dfadcc(android.os.Parcel parcel) {
        super(parcel.readString());
        this.f125648e = parcel.createByteArray();
    }
}
