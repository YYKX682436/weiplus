package com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3;

/* renamed from: com.google.android.exoplayer2.metadata.id3.ChapterTocFrame */
/* loaded from: classes13.dex */
public final class C1608x95ae8052 extends com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1608x95ae8052> f5312x681a0c0c = new b9.d();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f125655e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f125656f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f125657g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String[] f125658h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5[] f125659i;

    public C1608x95ae8052(java.lang.String str, boolean z17, boolean z18, java.lang.String[] strArr, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5[] abstractC1611xa43bd1f5Arr) {
        super("CTOC");
        this.f125655e = str;
        this.f125656f = z17;
        this.f125657g = z18;
        this.f125658h = strArr;
        this.f125659i = abstractC1611xa43bd1f5Arr;
    }

    /* renamed from: equals */
    public boolean m17174xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1608x95ae8052.class != obj.getClass()) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1608x95ae8052 c1608x95ae8052 = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1608x95ae8052) obj;
        return this.f125656f == c1608x95ae8052.f125656f && this.f125657g == c1608x95ae8052.f125657g && t9.d0.a(this.f125655e, c1608x95ae8052.f125655e) && java.util.Arrays.equals(this.f125658h, c1608x95ae8052.f125658h) && java.util.Arrays.equals(this.f125659i, c1608x95ae8052.f125659i);
    }

    /* renamed from: hashCode */
    public int m17175x8cdac1b() {
        int i17 = (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de + (this.f125656f ? 1 : 0)) * 31) + (this.f125657g ? 1 : 0)) * 31;
        java.lang.String str = this.f125655e;
        return i17 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f125655e);
        parcel.writeByte(this.f125656f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f125657g ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f125658h);
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5[] abstractC1611xa43bd1f5Arr = this.f125659i;
        parcel.writeInt(abstractC1611xa43bd1f5Arr.length);
        for (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5 abstractC1611xa43bd1f5 : abstractC1611xa43bd1f5Arr) {
            parcel.writeParcelable(abstractC1611xa43bd1f5, 0);
        }
    }

    public C1608x95ae8052(android.os.Parcel parcel) {
        super("CTOC");
        this.f125655e = parcel.readString();
        this.f125656f = parcel.readByte() != 0;
        this.f125657g = parcel.readByte() != 0;
        this.f125658h = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f125659i = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5[readInt];
        for (int i17 = 0; i17 < readInt; i17++) {
            this.f125659i[i17] = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5) parcel.readParcelable(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5.class.getClassLoader());
        }
    }
}
