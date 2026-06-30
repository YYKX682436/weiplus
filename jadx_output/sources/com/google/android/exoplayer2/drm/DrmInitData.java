package com.google.android.exoplayer2.drm;

/* loaded from: classes15.dex */
public final class DrmInitData implements java.util.Comparator<com.google.android.exoplayer2.drm.DrmInitData.SchemeData>, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.drm.DrmInitData> CREATOR = new p8.a();

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.DrmInitData.SchemeData[] f44095d;

    /* renamed from: e, reason: collision with root package name */
    public int f44096e;

    /* renamed from: f, reason: collision with root package name */
    public final int f44097f;

    /* loaded from: classes15.dex */
    public static final class SchemeData implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> CREATOR = new com.google.android.exoplayer2.drm.a();

        /* renamed from: d, reason: collision with root package name */
        public int f44098d;

        /* renamed from: e, reason: collision with root package name */
        public final java.util.UUID f44099e;

        /* renamed from: f, reason: collision with root package name */
        public final java.lang.String f44100f;

        /* renamed from: g, reason: collision with root package name */
        public final java.lang.String f44101g;

        /* renamed from: h, reason: collision with root package name */
        public final byte[] f44102h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f44103i;

        public SchemeData(java.util.UUID uuid, java.lang.String str, java.lang.String str2, byte[] bArr) {
            this(uuid, str, str2, bArr, false);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.android.exoplayer2.drm.DrmInitData.SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            com.google.android.exoplayer2.drm.DrmInitData.SchemeData schemeData = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData) obj;
            return this.f44101g.equals(schemeData.f44101g) && t9.d0.a(this.f44099e, schemeData.f44099e) && t9.d0.a(this.f44100f, schemeData.f44100f) && java.util.Arrays.equals(this.f44102h, schemeData.f44102h);
        }

        public int hashCode() {
            if (this.f44098d == 0) {
                int hashCode = this.f44099e.hashCode() * 31;
                java.lang.String str = this.f44100f;
                this.f44098d = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f44101g.hashCode()) * 31) + java.util.Arrays.hashCode(this.f44102h);
            }
            return this.f44098d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            java.util.UUID uuid = this.f44099e;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.f44100f);
            parcel.writeString(this.f44101g);
            parcel.writeByteArray(this.f44102h);
            parcel.writeByte(this.f44103i ? (byte) 1 : (byte) 0);
        }

        public SchemeData(java.util.UUID uuid, java.lang.String str, java.lang.String str2, byte[] bArr, boolean z17) {
            uuid.getClass();
            this.f44099e = uuid;
            this.f44100f = str;
            str2.getClass();
            this.f44101g = str2;
            bArr.getClass();
            this.f44102h = bArr;
            this.f44103i = z17;
        }

        public SchemeData(android.os.Parcel parcel) {
            this.f44099e = new java.util.UUID(parcel.readLong(), parcel.readLong());
            this.f44100f = parcel.readString();
            this.f44101g = parcel.readString();
            this.f44102h = parcel.createByteArray();
            this.f44103i = parcel.readByte() != 0;
        }
    }

    public DrmInitData(boolean z17, com.google.android.exoplayer2.drm.DrmInitData.SchemeData... schemeDataArr) {
        schemeDataArr = z17 ? (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        java.util.Arrays.sort(schemeDataArr, this);
        for (int i17 = 1; i17 < schemeDataArr.length; i17++) {
            if (schemeDataArr[i17 - 1].f44099e.equals(schemeDataArr[i17].f44099e)) {
                throw new java.lang.IllegalArgumentException("Duplicate data for uuid: " + schemeDataArr[i17].f44099e);
            }
        }
        this.f44095d = schemeDataArr;
        this.f44097f = schemeDataArr.length;
    }

    public com.google.android.exoplayer2.drm.DrmInitData a(java.lang.String str) {
        boolean z17;
        com.google.android.exoplayer2.drm.DrmInitData.SchemeData[] schemeDataArr = this.f44095d;
        int length = schemeDataArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                z17 = false;
                break;
            }
            if (!t9.d0.a(schemeDataArr[i17].f44100f, str)) {
                z17 = true;
                break;
            }
            i17++;
        }
        if (!z17) {
            return this;
        }
        int length2 = schemeDataArr.length;
        com.google.android.exoplayer2.drm.DrmInitData.SchemeData[] schemeDataArr2 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[length2];
        for (int i18 = 0; i18 < length2; i18++) {
            com.google.android.exoplayer2.drm.DrmInitData.SchemeData schemeData = schemeDataArr[i18];
            if (!t9.d0.a(schemeData.f44100f, str)) {
                schemeData = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData(schemeData.f44099e, str, schemeData.f44101g, schemeData.f44102h, schemeData.f44103i);
            }
            schemeDataArr2[i18] = schemeData;
        }
        return new com.google.android.exoplayer2.drm.DrmInitData(true, schemeDataArr2);
    }

    @Override // java.util.Comparator
    public int compare(com.google.android.exoplayer2.drm.DrmInitData.SchemeData schemeData, com.google.android.exoplayer2.drm.DrmInitData.SchemeData schemeData2) {
        com.google.android.exoplayer2.drm.DrmInitData.SchemeData schemeData3 = schemeData;
        com.google.android.exoplayer2.drm.DrmInitData.SchemeData schemeData4 = schemeData2;
        java.util.UUID uuid = m8.b.f324544b;
        if (uuid.equals(schemeData3.f44099e)) {
            return uuid.equals(schemeData4.f44099e) ? 0 : 1;
        }
        return schemeData3.f44099e.compareTo(schemeData4.f44099e);
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
        if (obj == null || com.google.android.exoplayer2.drm.DrmInitData.class != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.f44095d, ((com.google.android.exoplayer2.drm.DrmInitData) obj).f44095d);
    }

    public int hashCode() {
        if (this.f44096e == 0) {
            this.f44096e = java.util.Arrays.hashCode(this.f44095d);
        }
        return this.f44096e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeTypedArray(this.f44095d, 0);
    }

    public DrmInitData(android.os.Parcel parcel) {
        com.google.android.exoplayer2.drm.DrmInitData.SchemeData[] schemeDataArr = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) parcel.createTypedArray(com.google.android.exoplayer2.drm.DrmInitData.SchemeData.CREATOR);
        this.f44095d = schemeDataArr;
        this.f44097f = schemeDataArr.length;
    }
}
