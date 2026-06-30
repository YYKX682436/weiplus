package com.google.android.exoplayer2.source.dash.manifest;

/* loaded from: classes.dex */
public final class RepresentationKey implements android.os.Parcelable, java.lang.Comparable<com.google.android.exoplayer2.source.dash.manifest.RepresentationKey> {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.source.dash.manifest.RepresentationKey> CREATOR = new f9.a();

    /* renamed from: d, reason: collision with root package name */
    public final int f44160d;

    /* renamed from: e, reason: collision with root package name */
    public final int f44161e;

    /* renamed from: f, reason: collision with root package name */
    public final int f44162f;

    public RepresentationKey(int i17, int i18, int i19) {
        this.f44160d = i17;
        this.f44161e = i18;
        this.f44162f = i19;
    }

    @Override // java.lang.Comparable
    public int compareTo(com.google.android.exoplayer2.source.dash.manifest.RepresentationKey representationKey) {
        com.google.android.exoplayer2.source.dash.manifest.RepresentationKey representationKey2 = representationKey;
        int i17 = this.f44160d - representationKey2.f44160d;
        if (i17 != 0) {
            return i17;
        }
        int i18 = this.f44161e - representationKey2.f44161e;
        return i18 == 0 ? this.f44162f - representationKey2.f44162f : i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return this.f44160d + "." + this.f44161e + "." + this.f44162f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f44160d);
        parcel.writeInt(this.f44161e);
        parcel.writeInt(this.f44162f);
    }
}
