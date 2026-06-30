package com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3;

/* renamed from: com.google.android.exoplayer2.metadata.id3.ChapterFrame */
/* loaded from: classes13.dex */
public final class C1607xa5a13940 extends com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5 {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1607xa5a13940> f5311x681a0c0c = new b9.c();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f125649e;

    /* renamed from: f, reason: collision with root package name */
    public final int f125650f;

    /* renamed from: g, reason: collision with root package name */
    public final int f125651g;

    /* renamed from: h, reason: collision with root package name */
    public final long f125652h;

    /* renamed from: i, reason: collision with root package name */
    public final long f125653i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5[] f125654m;

    public C1607xa5a13940(java.lang.String str, int i17, int i18, long j17, long j18, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5[] abstractC1611xa43bd1f5Arr) {
        super("CHAP");
        this.f125649e = str;
        this.f125650f = i17;
        this.f125651g = i18;
        this.f125652h = j17;
        this.f125653i = j18;
        this.f125654m = abstractC1611xa43bd1f5Arr;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m17171xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1607xa5a13940.class != obj.getClass()) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1607xa5a13940 c1607xa5a13940 = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1607xa5a13940) obj;
        return this.f125650f == c1607xa5a13940.f125650f && this.f125651g == c1607xa5a13940.f125651g && this.f125652h == c1607xa5a13940.f125652h && this.f125653i == c1607xa5a13940.f125653i && t9.d0.a(this.f125649e, c1607xa5a13940.f125649e) && java.util.Arrays.equals(this.f125654m, c1607xa5a13940.f125654m);
    }

    /* renamed from: hashCode */
    public int m17172x8cdac1b() {
        int i17 = (((((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de + this.f125650f) * 31) + this.f125651g) * 31) + ((int) this.f125652h)) * 31) + ((int) this.f125653i)) * 31;
        java.lang.String str = this.f125649e;
        return i17 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f125649e);
        parcel.writeInt(this.f125650f);
        parcel.writeInt(this.f125651g);
        parcel.writeLong(this.f125652h);
        parcel.writeLong(this.f125653i);
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5[] abstractC1611xa43bd1f5Arr = this.f125654m;
        parcel.writeInt(abstractC1611xa43bd1f5Arr.length);
        for (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5 abstractC1611xa43bd1f5 : abstractC1611xa43bd1f5Arr) {
            parcel.writeParcelable(abstractC1611xa43bd1f5, 0);
        }
    }

    public C1607xa5a13940(android.os.Parcel parcel) {
        super("CHAP");
        this.f125649e = parcel.readString();
        this.f125650f = parcel.readInt();
        this.f125651g = parcel.readInt();
        this.f125652h = parcel.readLong();
        this.f125653i = parcel.readLong();
        int readInt = parcel.readInt();
        this.f125654m = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5[readInt];
        for (int i17 = 0; i17 < readInt; i17++) {
            this.f125654m[i17] = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5) parcel.readParcelable(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5.class.getClassLoader());
        }
    }
}
