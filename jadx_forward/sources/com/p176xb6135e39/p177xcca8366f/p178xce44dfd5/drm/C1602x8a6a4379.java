package com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm;

/* renamed from: com.google.android.exoplayer2.drm.DrmInitData */
/* loaded from: classes15.dex */
public final class C1602x8a6a4379 implements java.util.Comparator<com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379.SchemeData>, android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379> f5305x681a0c0c = new p8.a();

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379.SchemeData[] f125628d;

    /* renamed from: e, reason: collision with root package name */
    public int f125629e;

    /* renamed from: f, reason: collision with root package name */
    public final int f125630f;

    /* renamed from: com.google.android.exoplayer2.drm.DrmInitData$SchemeData */
    /* loaded from: classes15.dex */
    public static final class SchemeData implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379.SchemeData> f5306x681a0c0c = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.a();

        /* renamed from: d, reason: collision with root package name */
        public int f125631d;

        /* renamed from: e, reason: collision with root package name */
        public final java.util.UUID f125632e;

        /* renamed from: f, reason: collision with root package name */
        public final java.lang.String f125633f;

        /* renamed from: g, reason: collision with root package name */
        public final java.lang.String f125634g;

        /* renamed from: h, reason: collision with root package name */
        public final byte[] f125635h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f125636i;

        public SchemeData(java.util.UUID uuid, java.lang.String str, java.lang.String str2, byte[] bArr) {
            this(uuid, str, str2, bArr, false);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: equals */
        public boolean m17156xb2c87fbf(java.lang.Object obj) {
            if (!(obj instanceof com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379.SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379.SchemeData schemeData = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379.SchemeData) obj;
            return this.f125634g.equals(schemeData.f125634g) && t9.d0.a(this.f125632e, schemeData.f125632e) && t9.d0.a(this.f125633f, schemeData.f125633f) && java.util.Arrays.equals(this.f125635h, schemeData.f125635h);
        }

        /* renamed from: hashCode */
        public int m17157x8cdac1b() {
            if (this.f125631d == 0) {
                int hashCode = this.f125632e.hashCode() * 31;
                java.lang.String str = this.f125633f;
                this.f125631d = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f125634g.hashCode()) * 31) + java.util.Arrays.hashCode(this.f125635h);
            }
            return this.f125631d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            java.util.UUID uuid = this.f125632e;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.f125633f);
            parcel.writeString(this.f125634g);
            parcel.writeByteArray(this.f125635h);
            parcel.writeByte(this.f125636i ? (byte) 1 : (byte) 0);
        }

        public SchemeData(java.util.UUID uuid, java.lang.String str, java.lang.String str2, byte[] bArr, boolean z17) {
            uuid.getClass();
            this.f125632e = uuid;
            this.f125633f = str;
            str2.getClass();
            this.f125634g = str2;
            bArr.getClass();
            this.f125635h = bArr;
            this.f125636i = z17;
        }

        public SchemeData(android.os.Parcel parcel) {
            this.f125632e = new java.util.UUID(parcel.readLong(), parcel.readLong());
            this.f125633f = parcel.readString();
            this.f125634g = parcel.readString();
            this.f125635h = parcel.createByteArray();
            this.f125636i = parcel.readByte() != 0;
        }
    }

    public C1602x8a6a4379(boolean z17, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379.SchemeData... schemeDataArr) {
        schemeDataArr = z17 ? (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379.SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        java.util.Arrays.sort(schemeDataArr, this);
        for (int i17 = 1; i17 < schemeDataArr.length; i17++) {
            if (schemeDataArr[i17 - 1].f125632e.equals(schemeDataArr[i17].f125632e)) {
                throw new java.lang.IllegalArgumentException("Duplicate data for uuid: " + schemeDataArr[i17].f125632e);
            }
        }
        this.f125628d = schemeDataArr;
        this.f125630f = schemeDataArr.length;
    }

    public com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379 a(java.lang.String str) {
        boolean z17;
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379.SchemeData[] schemeDataArr = this.f125628d;
        int length = schemeDataArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                z17 = false;
                break;
            }
            if (!t9.d0.a(schemeDataArr[i17].f125633f, str)) {
                z17 = true;
                break;
            }
            i17++;
        }
        if (!z17) {
            return this;
        }
        int length2 = schemeDataArr.length;
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379.SchemeData[] schemeDataArr2 = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379.SchemeData[length2];
        for (int i18 = 0; i18 < length2; i18++) {
            com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379.SchemeData schemeData = schemeDataArr[i18];
            if (!t9.d0.a(schemeData.f125633f, str)) {
                schemeData = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379.SchemeData(schemeData.f125632e, str, schemeData.f125634g, schemeData.f125635h, schemeData.f125636i);
            }
            schemeDataArr2[i18] = schemeData;
        }
        return new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379(true, schemeDataArr2);
    }

    @Override // java.util.Comparator
    public int compare(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379.SchemeData schemeData, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379.SchemeData schemeData2) {
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379.SchemeData schemeData3 = schemeData;
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379.SchemeData schemeData4 = schemeData2;
        java.util.UUID uuid = m8.b.f406077b;
        if (uuid.equals(schemeData3.f125632e)) {
            return uuid.equals(schemeData4.f125632e) ? 0 : 1;
        }
        return schemeData3.f125632e.compareTo(schemeData4.f125632e);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379.class != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.f125628d, ((com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379) obj).f125628d);
    }

    /* renamed from: hashCode */
    public int m17154x8cdac1b() {
        if (this.f125629e == 0) {
            this.f125629e = java.util.Arrays.hashCode(this.f125628d);
        }
        return this.f125629e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeTypedArray(this.f125628d, 0);
    }

    public C1602x8a6a4379(android.os.Parcel parcel) {
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379.SchemeData[] schemeDataArr = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379.SchemeData[]) parcel.createTypedArray(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379.SchemeData.f5306x681a0c0c);
        this.f125628d = schemeDataArr;
        this.f125630f = schemeDataArr.length;
    }
}
