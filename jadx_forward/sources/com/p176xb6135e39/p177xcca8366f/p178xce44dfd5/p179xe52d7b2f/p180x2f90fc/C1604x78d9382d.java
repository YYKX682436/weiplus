package com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p180x2f90fc;

/* renamed from: com.google.android.exoplayer2.metadata.emsg.EventMessage */
/* loaded from: classes13.dex */
public final class C1604x78d9382d implements com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f.Entry {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p180x2f90fc.C1604x78d9382d> f5308x681a0c0c = new a9.a();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f125638d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f125639e;

    /* renamed from: f, reason: collision with root package name */
    public final long f125640f;

    /* renamed from: g, reason: collision with root package name */
    public final long f125641g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f125642h;

    /* renamed from: i, reason: collision with root package name */
    public int f125643i;

    public C1604x78d9382d(java.lang.String str, java.lang.String str2, long j17, long j18, byte[] bArr) {
        this.f125638d = str;
        this.f125639e = str2;
        this.f125640f = j17;
        this.f125641g = j18;
        this.f125642h = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m17162xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p180x2f90fc.C1604x78d9382d.class != obj.getClass()) {
            return false;
        }
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p180x2f90fc.C1604x78d9382d c1604x78d9382d = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p180x2f90fc.C1604x78d9382d) obj;
        return this.f125640f == c1604x78d9382d.f125640f && this.f125641g == c1604x78d9382d.f125641g && t9.d0.a(this.f125638d, c1604x78d9382d.f125638d) && t9.d0.a(this.f125639e, c1604x78d9382d.f125639e) && java.util.Arrays.equals(this.f125642h, c1604x78d9382d.f125642h);
    }

    /* renamed from: hashCode */
    public int m17163x8cdac1b() {
        if (this.f125643i == 0) {
            java.lang.String str = this.f125638d;
            int hashCode = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de + (str != null ? str.hashCode() : 0)) * 31;
            java.lang.String str2 = this.f125639e;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j17 = this.f125640f;
            int i17 = (hashCode2 + ((int) (j17 ^ (j17 >>> 32)))) * 31;
            long j18 = this.f125641g;
            this.f125643i = ((i17 + ((int) (j18 ^ (j18 >>> 32)))) * 31) + java.util.Arrays.hashCode(this.f125642h);
        }
        return this.f125643i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f125638d);
        parcel.writeString(this.f125639e);
        parcel.writeLong(this.f125640f);
        parcel.writeLong(this.f125641g);
        parcel.writeByteArray(this.f125642h);
    }

    public C1604x78d9382d(android.os.Parcel parcel) {
        this.f125638d = parcel.readString();
        this.f125639e = parcel.readString();
        this.f125640f = parcel.readLong();
        this.f125641g = parcel.readLong();
        this.f125642h = parcel.createByteArray();
    }
}
